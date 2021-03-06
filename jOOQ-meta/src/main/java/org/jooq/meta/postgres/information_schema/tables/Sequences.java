/**
 * This class is generated by jOOQ
 */
package org.jooq.meta.postgres.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences extends TableImpl<Record> {

	private static final long serialVersionUID = -42417332;

	/**
	 * The reference instance of <code>information_schema.sequences</code>
	 */
	public static final Sequences SEQUENCES = new Sequences();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>information_schema.sequences.sequence_catalog</code>.
	 */
	public final TableField<Record, String> SEQUENCE_CATALOG = createField("sequence_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.sequences.sequence_schema</code>.
	 */
	public final TableField<Record, String> SEQUENCE_SCHEMA = createField("sequence_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.sequences.sequence_name</code>.
	 */
	public final TableField<Record, String> SEQUENCE_NAME = createField("sequence_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.sequences.data_type</code>.
	 */
	public final TableField<Record, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.sequences.numeric_precision</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.sequences.numeric_precision_radix</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.sequences.numeric_scale</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.sequences.start_value</code>.
	 */
	public final TableField<Record, String> START_VALUE = createField("start_value", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.sequences.minimum_value</code>.
	 */
	public final TableField<Record, String> MINIMUM_VALUE = createField("minimum_value", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.sequences.maximum_value</code>.
	 */
	public final TableField<Record, String> MAXIMUM_VALUE = createField("maximum_value", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.sequences.increment</code>.
	 */
	public final TableField<Record, String> INCREMENT = createField("increment", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.sequences.cycle_option</code>.
	 */
	public final TableField<Record, String> CYCLE_OPTION = createField("cycle_option", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * Create a <code>information_schema.sequences</code> table reference
	 */
	public Sequences() {
		this("sequences", null);
	}

	/**
	 * Create an aliased <code>information_schema.sequences</code> table reference
	 */
	public Sequences(String alias) {
		this(alias, SEQUENCES);
	}

	private Sequences(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private Sequences(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Sequences as(String alias) {
		return new Sequences(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Sequences rename(String name) {
		return new Sequences(name, null);
	}
}
