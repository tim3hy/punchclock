package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.service.EntryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {

    private final EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    /**
     * Gets all entries.
     *
     * @returns all entries as JSON
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Entry> getAllEntries() {
        return entryService.findAll();
    }

    /**
     *
     * @param entry without id which should be created
     * @returns creates Entry
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entry createEntry(@Valid @RequestBody Entry entry) {
        return entryService.createEntry(entry);
    }

    /**
     * Deletes Entry
     * @param id
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEntry(@PathVariable long id){ entryService.deleteEntry(id); }

    /**
     * Edits Entry
     * @param entry
     */
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void editEntry(@Valid @RequestBody Entry entry){ entryService.editEntry(entry);}
}
