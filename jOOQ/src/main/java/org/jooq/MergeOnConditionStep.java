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
package org.jooq;

import static org.jooq.SQLDialect.CUBRID;
// ...
import static org.jooq.SQLDialect.HSQLDB;
// ...
// ...
// ...

import org.jooq.api.annotation.State;
import org.jooq.impl.DSL;

/**
 * This type is used for the {@link Merge}'s DSL API.
 * <p>
 * Example: <code><pre>
 * DSLContext create = DSL.using(configuration);
 *
 * create.mergeInto(table)
 *       .using(select)
 *       .on(condition)
 *       .whenMatchedThenUpdate()
 *       .set(field1, value1)
 *       .set(field2, value2)
 *       .whenNotMatchedThenInsert(field1, field2)
 *       .values(value1, value2)
 *       .execute();
 * </pre></code>
 *
 * @author Lukas Eder
 */
@State
public interface MergeOnConditionStep<R extends Record> extends MergeMatchedStep<R> {

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#AND} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> and(Condition condition);

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#AND} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> and(Field<Boolean> condition);

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#AND} operator and proceed to the next step.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see DSL#condition(String)
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> and(String sql);

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#AND} operator and proceed to the next step.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see DSL#condition(String, Object...)
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> and(String sql, Object... bindings);

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#AND} operator and proceed to the next step.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see DSL#condition(String, QueryPart...)
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> and(String sql, QueryPart... parts);

    /**
     * Combine the currently assembled conditions with a negated other one using
     * the {@link Operator#AND} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> andNot(Condition condition);

    /**
     * Combine the currently assembled conditions with a negated other one using
     * the {@link Operator#AND} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> andNot(Field<Boolean> condition);

    /**
     * Combine the currently assembled conditions with an EXISTS clause using
     * the {@link Operator#AND} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> andExists(Select<?> select);

    /**
     * Combine the currently assembled conditions with a NOT EXISTS clause using
     * the {@link Operator#AND} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> andNotExists(Select<?> select);

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#OR} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> or(Condition condition);

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#OR} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> or(Field<Boolean> condition);

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#OR} operator and proceed to the next step.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see DSL#condition(String)
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> or(String sql);

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#OR} operator and proceed to the next step.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see DSL#condition(String, Object...)
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> or(String sql, Object... bindings);

    /**
     * Combine the currently assembled conditions with another one using the
     * {@link Operator#OR} operator and proceed to the next step.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see DSL#condition(String, QueryPart...)
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> or(String sql, QueryPart... parts);

    /**
     * Combine the currently assembled conditions with a negated other one using
     * the {@link Operator#OR} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> orNot(Condition condition);

    /**
     * Combine the currently assembled conditions with a negated other one using
     * the {@link Operator#OR} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> orNot(Field<Boolean> condition);

    /**
     * Combine the currently assembled conditions with an EXISTS clause using
     * the {@link Operator#OR} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> orExists(Select<?> select);

    /**
     * Combine the currently assembled conditions with a NOT EXISTS clause using
     * the {@link Operator#OR} operator and proceed to the next step.
     */
    @Support({ CUBRID, HSQLDB })
    MergeOnConditionStep<R> orNotExists(Select<?> select);
}
