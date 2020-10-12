package org.flowable.example;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;

/**
 * Copyright  Citic Trust, 2020 中信信托有限公司，版权所有 2020
 * tae5Le2Choh5see2rieshaiQuooGhe7eeth0yahg3ud6eeb1ahsha6eloh2aiYai
 *
 * @date: 2020/10/12
 * @author: liuqiang
 */
public class HolidayRequest {

    public static void main(String[] args) {
        ProcessEngineConfiguration cfg = new StandaloneProcessEngineConfiguration()
                .setJdbcUrl("jdbc:h2:mem:flowable;DB_CLOSE_DELAY=-1")
                .setJdbcUsername("sa")
                .setJdbcPassword("")
                .setJdbcDriver("org.h2.Driver")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

        ProcessEngine processEngine = cfg.buildProcessEngine();
    }
}
