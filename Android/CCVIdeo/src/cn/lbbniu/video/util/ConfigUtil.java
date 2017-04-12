package cn.lbbniu.video.util;

public class ConfigUtil {

	// 配置API KEY
	public static String API_KEY = "x2vqfLcC3gTv69PaA0T5ZN6VdHw0sGI4";

	// 配置帐户ID
	public static String USERID = "CDE9DD8D9F25B1EF";

	// 配置下载文件路径
	public final static String DOWNLOAD_DIR = "com/lbbniu/smallfly";
	
	// 配置视频回调地址
	public final static String NOTIFY_URL = "http://www.example.com";
	
	/** Fragment */
	public final static int DOWNLOADED = 0;
	public final static int DOWNLOADING = 1;
	
	/** Service Action */
	
	public final static String ACTION_DOWNLOADED = "demo.service.downloaded";
	public final static String ACTION_DOWNLOADING = "demo.service.downloading";
	
	/** Input Info ID */
	
	public final static int INPUT_INFO_TITLE_ID = 10000000;
	public final static int INPUT_EDIT_TITLE_ID = 10000010;
	
	public final static int INPUT_INFO_TAGS_ID = 10000001;
	public final static int INPUT_EDIT_TAGS_ID = 10000011;
	
	public final static int INPUT_INFO_DESC_ID = 10000002;
	public final static int INPUT_EDIT_DESC_ID = 10000012;
	
	/** spinner info id */
	public final static int SPINNER_MAIN_ID = 10000003;
	public final static int SPINNER_SUB_ID = 10000013;
	
	/** Download Group ID */
	public final static int DOWNLOADING_MENU_GROUP_ID = 20000000;
	public final static int DOWNLOADED_MENU_GROUP_ID = 20000001;

}
