package ru.job4j.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Config {
    private final String path;
    private final Map<String, String> values = new HashMap<String, String>();

    public Config(final String path) {
        this.path = path;
    }

    public void load(String board) {
        List<String> out = new LinkedList<>();
        try (BufferedReader load = new BufferedReader(new FileReader(path))) {
            out = load.lines().collect(Collectors.toCollection(LinkedList::new));
        } catch (IOException e) {
            System.out.println("Ooops!");
            e.printStackTrace();
        }
        values.putAll(out.stream()
                .filter(e -> !e.startsWith("#"))
                .filter(e -> !e.startsWith("//"))
                .filter(e -> e.contains(board))
                .collect(Collectors.toMap(e -> e.substring(0, e.indexOf(board)),
                        e -> e.substring(e.indexOf(board) + 1))));
    }

    public String value(String key) {
        if (values.isEmpty()) {
            throw new UnsupportedOperationException("Don't impl this method yet!");
        }
        return values.get(key);
    }

    @Override
    public String toString() {
        StringJoiner out = new StringJoiner(System.lineSeparator());
        try (BufferedReader read = new BufferedReader(new FileReader(this.path))) {
            read.lines().forEach(out::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.toString();
    }
}
