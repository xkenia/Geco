/**
 * Copyright (c) 2009 Simon Denier
 */
package net.geco.model;

import java.util.Date;

/**
 * @author Simon Denier
 * @since Jun 30, 2009
 *
 */
public interface Runner extends AbstractRunner, Cloneable {

	public Integer getStartId();

	public void setStartId(Integer id);

	public Date getRegisteredStarttime();
	
	public void setRegisteredStarttime(Date time);

	public Course getCourse();

	public void setCourse(Course course);

	public boolean isNC();

	public void setNC(boolean nc);
	
	public boolean rentedEcard();
	
	public void setRentedEcard(boolean rented);
	
	public Runner copyWith(Integer startId, String ecard, Course course);

}