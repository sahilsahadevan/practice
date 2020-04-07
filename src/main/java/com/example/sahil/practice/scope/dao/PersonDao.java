package com.example.sahil.practice.scope.dao;

import com.example.sahil.practice.scope.connection.JdbcConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonDao.class);

    @Autowired
    private JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection(){
        return jdbcConnection;
    }

    @PostConstruct
    public void greet() {
        LOGGER.info("======> Bean {} (hashCode={}) says Hi ! <======",
                this.getClass().getName(), this.hashCode());
    }

    @PreDestroy
    public void sayGoodBye() {
        LOGGER.info("======> Bean {} (hashCode={}) says GoodBye ! <======",
                this.getClass().getName(), this.hashCode());
    }
}
