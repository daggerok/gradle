package daggerok;

import lombok.extern.slf4j.Slf4j;

import static java.util.Arrays.asList;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("slf4j: {}", asList(args));
    }
}
