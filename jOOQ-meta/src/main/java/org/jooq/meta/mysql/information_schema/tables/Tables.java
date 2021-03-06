/*
 * This file is generated by jOOQ.
*/
package org.jooq.meta.mysql.information_schema.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.mysql.information_schema.InformationSchema;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables extends TableImpl<Record> {

    private static final long serialVersionUID = 1915460822;

    /**
     * The reference instance of <code>information_schema.TABLES</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.TABLES.TABLE_CATALOG</code>.
     */
    public static final TableField<Record, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), TABLES, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_SCHEMA</code>.
     */
    public static final TableField<Record, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), TABLES, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_NAME</code>.
     */
    public static final TableField<Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), TABLES, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_TYPE</code>.
     */
    public static final TableField<Record, String> TABLE_TYPE = createField("TABLE_TYPE", org.jooq.impl.SQLDataType.VARCHAR(11).nullable(false), TABLES, "");

    /**
     * The column <code>information_schema.TABLES.ENGINE</code>.
     */
    public static final TableField<Record, String> ENGINE = createField("ENGINE", org.jooq.impl.SQLDataType.VARCHAR(64), TABLES, "");

    /**
     * The column <code>information_schema.TABLES.VERSION</code>.
     */
    public static final TableField<Record, Integer> VERSION = createField("VERSION", org.jooq.impl.SQLDataType.INTEGER, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.ROW_FORMAT</code>.
     */
    public static final TableField<Record, String> ROW_FORMAT = createField("ROW_FORMAT", org.jooq.impl.SQLDataType.VARCHAR(10), TABLES, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_ROWS</code>.
     */
    public static final TableField<Record, ULong> TABLE_ROWS = createField("TABLE_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.AVG_ROW_LENGTH</code>.
     */
    public static final TableField<Record, ULong> AVG_ROW_LENGTH = createField("AVG_ROW_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.DATA_LENGTH</code>.
     */
    public static final TableField<Record, ULong> DATA_LENGTH = createField("DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.MAX_DATA_LENGTH</code>.
     */
    public static final TableField<Record, ULong> MAX_DATA_LENGTH = createField("MAX_DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.INDEX_LENGTH</code>.
     */
    public static final TableField<Record, ULong> INDEX_LENGTH = createField("INDEX_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.DATA_FREE</code>.
     */
    public static final TableField<Record, ULong> DATA_FREE = createField("DATA_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.AUTO_INCREMENT</code>.
     */
    public static final TableField<Record, ULong> AUTO_INCREMENT = createField("AUTO_INCREMENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.CREATE_TIME</code>.
     */
    public static final TableField<Record, Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), TABLES, "");

    /**
     * The column <code>information_schema.TABLES.UPDATE_TIME</code>.
     */
    public static final TableField<Record, Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.CHECK_TIME</code>.
     */
    public static final TableField<Record, Timestamp> CHECK_TIME = createField("CHECK_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_COLLATION</code>.
     */
    public static final TableField<Record, String> TABLE_COLLATION = createField("TABLE_COLLATION", org.jooq.impl.SQLDataType.VARCHAR(64), TABLES, "");

    /**
     * The column <code>information_schema.TABLES.CHECKSUM</code>.
     */
    public static final TableField<Record, ULong> CHECKSUM = createField("CHECKSUM", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES, "");

    /**
     * The column <code>information_schema.TABLES.CREATE_OPTIONS</code>.
     */
    public static final TableField<Record, String> CREATE_OPTIONS = createField("CREATE_OPTIONS", org.jooq.impl.SQLDataType.VARCHAR(256), TABLES, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_COMMENT</code>.
     */
    public static final TableField<Record, String> TABLE_COMMENT = createField("TABLE_COMMENT", org.jooq.impl.SQLDataType.VARCHAR(256), TABLES, "");

    /**
     * No further instances allowed
     */
    private Tables() {
        this(DSL.name("TABLES"), null);
    }

    private Tables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Tables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
