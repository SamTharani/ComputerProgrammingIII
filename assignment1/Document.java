public class Document
{
	private int id;
	private String name;
	private String content;
	private String extension;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	public void setExtension(String extension)
	{
		this.extension  = extension;
	}
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getContent()
	{
		return content;
	}
	public String getExtension()
	{
		return extension;
	}
}
