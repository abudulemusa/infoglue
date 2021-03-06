/* ===============================================================================
*
* Part of the InfoGlue Content Management Platform (www.infoglue.org)
*
* ===============================================================================
*
*  Copyright (C)
*
* This program is free software; you can redistribute it and/or modify it under
* the terms of the GNU General Public License version 2, as published by the
* Free Software Foundation. See the file LICENSE.html for more information.
*
* This program is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY, including the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License along with
* this program; if not, write to the Free Software Foundation, Inc. / 59 Temple
* Place, Suite 330 / Boston, MA 02111-1307 / USA.
*
* ===============================================================================
*/
package org.infoglue.cms.webservices.elements;

public abstract class AbstractAttachment implements Attachment
{
	/**
	 * 
	 */
	private byte[] bytes;

	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String fileName;
	/**
	 * 
	 */
	private String filePath;

	/**
	 * 
	 */
	private String contentType;
	
	/**
	 * 
	 */
	protected AbstractAttachment()
	{
	}
	
	/**
	 * 
	 */
	protected AbstractAttachment(final String name, final String fileName, final String filePath, final String contentType, final byte[] bytes)
	{
		super();
		this.name        = name;
		
		if(fileName != null && !fileName.equals(""))
			this.fileName 	 = fileName;
		else
			this.fileName 	 = "Unknown";
		
		if(filePath != null && !filePath.equals(""))
			this.filePath 	 = filePath;
		else
			this.filePath 	 = "Unknown";
		
		this.contentType = contentType;
		this.bytes       = bytes;
	}
	
	/**
	 * 
	 */
	public byte[] getBytes() 
	{
		return bytes;
	}

	/**
	 * 
	 */
	public void setBytes(final byte[] bytes) 
	{
		this.bytes = bytes;
	}
	
	/**
	 * 
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * 
	 */
	public void setName(final String name) 
	{
		this.name = name;
	}

	/**
	 * 
	 */
	public int getSize() 
	{
		return getBytes().length;
	}

	/**
	 * 
	 */
	public String getContentType() 
	{
		return contentType;
	}

	/**
	 * 
	 */
	public void setContentType(final String contentType) 
	{
		this.contentType = contentType;
	}

	/**
	 * 
	 */
	public String toString()
	{
		return "<" + getSize() + "," + getName() + "," + getContentType() + ">";
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public String getFilePath()
	{
		return filePath;
	}

	public void setFilePath(String filePath)
	{
		this.filePath = filePath;
	}
}
