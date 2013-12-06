package lv.Models;

public class Video 
{
	private int video_id;
	private String video_title;
	private String describe;
	
	public Video(){}
	public Video(String title, String desc)
	{
		this.video_title = title;
		this.describe = desc;
	}
	public int getVideo_id() {
		return video_id;
	}
	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}
	public String getVideo_title() {
		return video_title;
	}
	public void setVideo_title(String video_title) {
		this.video_title = video_title;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
}
