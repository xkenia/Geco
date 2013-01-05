/**
 * Copyright (c) 2013 Simon Denier
 * Released under the MIT License (see LICENSE file)
 */
package net.geco.model.iojson;

import java.io.IOException;
import java.util.Date;






/**
 * @author Simon Denier
 * @since Jan 4, 2013
 *
 */
public interface JSONExporter {

	/**
	 * Write a field key.
	 */
	public JSONExporter key(String key) throws IOException;

	/**
	 * Write a simple Json value, either following a key or appending to an array.
	 */
	public JSONExporter value(String value) throws IOException;

	/**
	 * Write a Date value as a timestamp.
	 */
	public JSONExporter value(Date value) throws IOException;
	
	public JSONExporter value(int value) throws IOException;
	
	public JSONExporter value(long value) throws IOException;
	
	public JSONExporter value(boolean value) throws IOException;

	/**
	 * Start writing a Json object.
	 */
	public JSONExporter startObject() throws IOException;

	/**
	 * Start writing an object field with the given key.
	 */
	public JSONExporter startObjectField(String key) throws IOException;

	/**
	 * End writing a Json object (either plain or field value).
	 */
	public JSONExporter endObject() throws IOException;

	/**
	 * Start writing a Json array.
	 */
	public JSONExporter startArray() throws IOException;

	/**
	 * Start writing an array field with the given key.
	 */
	public JSONExporter startArrayField(String key) throws IOException;

	/**
	 * End writing a Json array (either plain or field value).
	 */
	public JSONExporter endArray() throws IOException;

	/**
	 * Write a value field with the given key.
	 */
	public JSONExporter field(String key, String value) throws IOException;

	public JSONExporter field(String key, Date date) throws IOException;

	public JSONExporter field(String key, int value) throws IOException;
	
	public JSONExporter field(String key, long value) throws IOException;

	public JSONExporter field(String key, boolean value) throws IOException;

	/**
	 * Write the given object representation (toString) as a value field,
	 * only if it's non-null.
	 */
	public JSONExporter optField(String key, Object nullableValue) throws IOException;

	/**
	 * Write the given object representation as a number field,
	 * only if it's non-null.
	 */
	public JSONExporter optField(String key, Integer nullableValue) throws IOException;
	
	/**
	 * Write the given field as a boolean value, only if flag is true.
	 */
	public JSONExporter optField(String key, boolean flag) throws IOException;

	/**
	 * Assign a unique identity number to the given entity and write it as
	 * an "identity" field instead of its value. Used primarily to give the
	 * entity an identity for further reference.
	 */
	public JSONExporter id(String key, Object object) throws IOException;

	/**
	 * Write a reference field for the given entity, using the identity it
	 * should have received before with {@link #id(String, Object)}. No verification
	 * is made that the entity effectively has an identity. Used when other objects
	 * reference the entity.  
	 */
	public JSONExporter ref(String key, Object object) throws IOException;

	/**
	 * Same as {@link #ref(String, Object)}, except it won't write the field
	 * if a null object is given.
	 */
	public JSONExporter optRef(String key, Object nullableObject) throws IOException;

	/**
	 * Ask the exporter to write the last given identity number as a field
	 * (the number of entities referenced). Meta-data.
	 */
	public JSONExporter idMax(String key) throws IOException;

	/**
	 * Signal work is done.
	 */
	public void close() throws IOException;

}