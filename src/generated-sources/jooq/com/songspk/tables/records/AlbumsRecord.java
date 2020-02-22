/**
 * This class is generated by jOOQ
 */
package com.songspk.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlbumsRecord extends org.jooq.impl.UpdatableRecordImpl<com.songspk.tables.records.AlbumsRecord> implements org.jooq.Record7<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = -364528824;

	/**
	 * Setter for <code>public.albums.movie</code>.
	 */
	public void setMovie(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.albums.movie</code>.
	 */
	public java.lang.String getMovie() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.albums.link</code>.
	 */
	public void setLink(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.albums.link</code>.
	 */
	public java.lang.String getLink() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.albums.is_fetched</code>.
	 */
	public void setIsFetched(java.lang.Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.albums.is_fetched</code>.
	 */
	public java.lang.Boolean getIsFetched() {
		return (java.lang.Boolean) getValue(2);
	}

	/**
	 * Setter for <code>public.albums.released</code>.
	 */
	public void setReleased(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.albums.released</code>.
	 */
	public java.lang.String getReleased() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.albums.cast</code>.
	 */
	public void setCast(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.albums.cast</code>.
	 */
	public java.lang.String getCast() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.albums.director</code>.
	 */
	public void setDirector(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.albums.director</code>.
	 */
	public java.lang.String getDirector() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.albums.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.albums.id</code>.
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.songspk.tables.Albums.ALBUMS.MOVIE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.songspk.tables.Albums.ALBUMS.LINK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field3() {
		return com.songspk.tables.Albums.ALBUMS.IS_FETCHED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.songspk.tables.Albums.ALBUMS.RELEASED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.songspk.tables.Albums.ALBUMS.CAST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.songspk.tables.Albums.ALBUMS.DIRECTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return com.songspk.tables.Albums.ALBUMS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getMovie();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getLink();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value3() {
		return getIsFetched();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getReleased();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getCast();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getDirector();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlbumsRecord value1(java.lang.String value) {
		setMovie(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlbumsRecord value2(java.lang.String value) {
		setLink(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlbumsRecord value3(java.lang.Boolean value) {
		setIsFetched(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlbumsRecord value4(java.lang.String value) {
		setReleased(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlbumsRecord value5(java.lang.String value) {
		setCast(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlbumsRecord value6(java.lang.String value) {
		setDirector(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlbumsRecord value7(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlbumsRecord values(java.lang.String value1, java.lang.String value2, java.lang.Boolean value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.Long value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AlbumsRecord
	 */
	public AlbumsRecord() {
		super(com.songspk.tables.Albums.ALBUMS);
	}

	/**
	 * Create a detached, initialised AlbumsRecord
	 */
	public AlbumsRecord(java.lang.String movie, java.lang.String link, java.lang.Boolean isFetched, java.lang.String released, java.lang.String cast, java.lang.String director, java.lang.Long id) {
		super(com.songspk.tables.Albums.ALBUMS);

		setValue(0, movie);
		setValue(1, link);
		setValue(2, isFetched);
		setValue(3, released);
		setValue(4, cast);
		setValue(5, director);
		setValue(6, id);
	}
}
