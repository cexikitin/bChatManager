/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rymate.bchatmanager;

import java.util.logging.Logger;
import org.bukkit.command.CommandSender;

/**
 *
 * @author rymate
 */
public enum Messages {

    PASSWORD_WRONG("Password incorrect."),
    NO_PERMISSIONS("Thou shalt not use that command."),
    ENABLED("bChatManager enabled! Have a nice day :)"), 
    CHANNEL_REMOVED("You were removed from a channel you were in!"),
    JOINED("You joined %channel!");
    private String format;

    Messages(String format) {
        this.format = format;
    }

    /**
     * Sends a message.
     *
     * @param sender receiver
     */
    void send(CommandSender sender) {
        sender.sendMessage(format);
    }
    
    /**
     * Sends a formatted message. 
     * 
     * @param sender person who will receive the message
     * @param formatter function being used to format the message
     */
    
    void sendFormatted(CommandSender sender, Object formatter) {
        sender.sendMessage(format);
    }

    /**
     * Prints a message prefixed with [bChatManager] to the console.
     */
    void print() {
        Logger logger = Logger.getLogger("Minecraft");
        logger.info("[bChatManager] " + format);
    }
}