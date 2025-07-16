package dev.justkif.gallery.utils;

import java.util.List;

public class throwIf {

    public static <T> void listEmpty(List<T> list, RuntimeException exception) {
        if (list == null || list.isEmpty()) {
            throw exception;
        }
    }

}
