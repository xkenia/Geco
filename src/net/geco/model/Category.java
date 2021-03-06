/**
 * Copyright (c) 2009 Simon Denier
 */
package net.geco.model;


/**
 * @author Simon Denier
 * @since Jan 4, 2009
 *
 */
public interface Category extends Pool, Group {

	public String getShortname();

	public void setShortname(String shortname);

	public String getLongname();

	public void setLongname(String longname);

	public Course getCourse();
	
	public void setCourse(Course course);

	public CourseSet getCourseSet();

	public void setCourseSet(CourseSet courseset);

}