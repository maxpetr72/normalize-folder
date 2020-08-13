/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.maxpetr.normalize.order.folder.config;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxim Petruchenko <maxpetr@list.ru>
 */
public final class Config {
    // DONE: понять как задавать путь к файлу
//    public static final String CONFIG_FILE_FULL_PATH = 
//            "ru/maxpetr/normalize/order/folder/config/config.cfg.json";
    public static final String PROJECT_FULL_PATH = 
            "E:\\_maxp_private\\YandexDisk\\_maxp_private\\my_sites_prj\\" + 
            "my_site_dev\\java_tutorial\\normalize-order-folder\\";
    public static final String APPLICATION_PATH = 
            "src\\main\\java\\ru\\maxpetr\\normalize\\order\\folder\\";
    public static final String APPLICATION_FULL_PATH = 
            //PROJECT_FULL_PATH + 
            APPLICATION_PATH;
    public static final String CONFIG_FILE_FULL_PATH = APPLICATION_PATH + 
            "config\\config.cfg.json";
    public String CONFIG_FILE_CONTENT = "";

    public Config() {
        File cfgFile = new File(CONFIG_FILE_FULL_PATH);
        // <editor-fold defaultstate="collapsed" desc="check for debug print">
            System.out.println("cfgFile Absolute path: ");
            System.out.println(cfgFile.getAbsolutePath());
        // </editor-fold>                          
        if (cfgFile.isFile()) {
            try {
                //Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8).forEach(System.out::println);
                //Files.lines(Paths.get(CONFIG_FILE_FULL_PATH), StandardCharsets.UTF_8).forEach(System.out::println);
//                Files.lines(
//                        Paths.get(
//                                //CONFIG_FILE_FULL_PATH
//                                cfgFile.getPath()
//                        ), 
//                        StandardCharsets.UTF_8)
//                        .forEach(System.out::println);
                Files.lines(
                        Paths.get(
                            cfgFile.getPath()
                        ), 
                        StandardCharsets.UTF_8
//                ).forEach(System.out::println);
//                ).forEach(value -> System.out.println(value));
                ).forEach(value -> {
//                    System.out.println(value);
//                    CONFIG_FILE_CONTENT += value + "\n";
                    CONFIG_FILE_CONTENT += value + System.lineSeparator();
                });
//            Files.lines(cfgFile.getAbsolutePath(), StandardCharsets.UTF_8).
//                    forEach(System.out::println);
            } catch (IOException ex) {
                Logger loger = Logger.getLogger(Config.class.getName());
                loger.log(Level.SEVERE, null, ex);
            }
        }
    }
}
