package com.bank.r2dbc;

import com.bank.r2dbc.config.PostgreSQLConnectionPool;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PostgreSQLConnectionPoolTest {

    // TODO: change four you own tests
    @Test
    void getConnectionConfig() {
        PostgreSQLConnectionPool postgreSQLConnectionPool= new PostgreSQLConnectionPool();
        Assertions.assertNotNull(postgreSQLConnectionPool.getConnectionConfig());
    }
}
