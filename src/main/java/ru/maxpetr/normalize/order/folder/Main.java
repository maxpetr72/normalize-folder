package ru.maxpetr.normalize.order.folder;

import java.util.logging.Level;
import java.util.logging.Logger;
import ru.maxpetr.normalize.order.folder.config.Config;

/**
 *
 * @author Maxim Petruchenko <maxpetr@list.ru>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Config cfg = new Config();
        Logger loger = Logger.getLogger(Main.class.getName());
        loger.log(Level.INFO, "Config is loaded");
        System.out.println("---> ");
        System.out.print(cfg.CONFIG_FILE_CONTENT);
        System.out.println(" <---");
        System.out.println("Bye!");
    }
}
