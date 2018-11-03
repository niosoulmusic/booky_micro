package com.riccio.booky.config;

import com.riccio.booky.model.Bookmark;
import com.riccio.booky.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DataInitialization implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    BookmarkService bookmarkService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        if (!bookmarkService.findAll().iterator().hasNext()) {
            bookmarkService.addBookmark(new Bookmark("Media Puglisher", "http://riccio.com"));
            bookmarkService.addBookmark(new Bookmark("Bon Voyage", "http://voyage.com"));
        }
    }
}