package annotations.autowiring.components;

import annotations.autowiring.Writer;
import org.springframework.stereotype.Component;

@Component
public class FileWriter implements Writer {

    @Override
    public void write(String msg) {
        System.out.println("File output: " + msg);
    }

}
