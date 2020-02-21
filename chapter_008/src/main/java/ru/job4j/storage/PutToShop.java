/**
 * Пакет ru.job4j.storage для
 *
 * @author Maksim Tiunchik
 */
package ru.job4j.storage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс PutToShop - one of actions for preparation of Food.
 *
 * @author Maksim Tiunchik (senebh@gmail.com)
 * @version 0.1
 * @since 21.02.2020
 */
public class PutToShop<E extends Food> implements  TakeAction<E> {
    private static final Logger LOG = LogManager.getLogger(PutToShop.class.getName());

    /**
     * Link to Storage for executing.
     */
    private Storage<E> link;

    /**
     * Constructor, create link to Storage.
     *
     * @param shop
     */
    public PutToShop(Storage<E> shop) {
        link = shop;
    }


    /**
     * Put Food to storage.
     *
     * @param e Food
     */
    @Override
    public void execute(E e) {
        link.push(e);
    }
}
