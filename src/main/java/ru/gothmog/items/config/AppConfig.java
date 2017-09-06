package ru.gothmog.items.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gothmog.items.dao.ItemsDao;
import ru.gothmog.items.dao.impl.ItemsDaoImpl;
import ru.gothmog.items.model.Items;

/**
 * @author gothmog on 05.09.2017.
 */
@Configuration
public class AppConfig {
    @Bean
    public ItemsDao itemsDao(){
        return new ItemsDaoImpl(Items.class);
    }
}
