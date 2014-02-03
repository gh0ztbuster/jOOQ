/**
 * Copyright (c) 2009-2014, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.impl;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.function;

import java.sql.Timestamp;

import org.jooq.Configuration;
import org.jooq.Field;

/**
 * @author Lukas Eder
 */
class CurrentTimestamp extends AbstractFunction<Timestamp> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -7273879239726265322L;

    CurrentTimestamp() {
        super("current_timestamp", SQLDataType.TIMESTAMP);
    }

    @Override
    final Field<Timestamp> getFunction0(Configuration configuration) {
        switch (configuration.dialect().family()) {
            /* [pro] xx
            xxxx xxxx
                xxxxxx xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxxxxxxx

            xxxx xxxxxxx
                xxxxxx xxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxxxxxxx

            xxxx xxxxxxx
                xxxxxx xxxxxxxxxxxxxx xxxxxxxxxxx xxxxxxxxxxxxxxxxxxxxxxx

            xxxx xxxx
            xxxx xxxxxxx
            xxxx xxxxxxxxxx
            xx [/pro] */
            case DERBY:
            case FIREBIRD:
            case HSQLDB:
            case POSTGRES:
            case SQLITE:
                return field("current_timestamp", SQLDataType.TIMESTAMP);
        }

        return function("current_timestamp", SQLDataType.TIMESTAMP);
    }
}
