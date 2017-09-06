package ru.gothmog.items.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author gothmog on 05.09.2017.
 */
public class FileBucket {
    MultipartFile file;

    String description;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
