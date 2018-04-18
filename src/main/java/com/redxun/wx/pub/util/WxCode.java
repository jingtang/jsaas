package com.redxun.wx.pub.util;

import java.util.HashMap;
import java.util.Map;

public class WxCode {
 static Map<Integer,String> codeMap=new HashMap<Integer, String>(){{  
      put(-1, "系统繁忙");
      put(0, "请求成功");  
      put(40001, "获取密钥AppSecret错误");  
      put(40002, "不合法的凭证类型");  
      put(40003, "不合法的OpenID");  
      put(40004, "不合法的媒体文件类型");  
      put(40005, "不合法的文件类型");  
      put(40006, "不合法的文件大小");  
      put(40007, "不合法的媒体文件id");  
      put(40008, "不合法的消息类型");  
      put(40009, "不合法的图片文件大小");  
      put(40010, "不合法的语音文件大小");  
      put(40011, "不合法的视频文件大小");  
      put(40012, "不合法的缩略图文件大小");  
      put(40013, "不合法的AppID");  
      put(40014, "不合法的access_token");  
      put(40015, "不合法的菜单类型");  
      put(40016, "不合法的按钮个数");  
      put(40017, "不合法的按钮个数");  
      put(40018, "不合法的按钮名字长度");  
      put(40019, "不合法的按钮KEY长度");  
      put(40020, "不合法的按钮URL长度");
      put(40021, "不合法的菜单版本号");  
      put(40022, "不合法的子菜单级数");  
      put(40023, "不合法的子菜单按钮个数");  
      put(40024, "不合法的子菜单按钮类型");  
      put(40025, "不合法的子菜单按钮名字长度");  
      put(40026, "不合法的子菜单按钮KEY长度");  
      put(40027, "不合法的子菜单按钮URL长度");  
      put(40028, "不合法的自定义菜单使用用户");  
      put(40029, "不合法的oauth_code");
      put(40030, "不合法的refresh_token");  
      put(40031, "不合法的openid列表");  
      put(40032, "不合法的openid列表长度");  
      put(40033, "不合法的请求字符，不能包含\\uxxxx格式的字符");  
      put(40035, "不合法的参数");  
      put(40038, "不合法的请求格式");  
      put(40039, "不合法的URL长度");  
      put(40050, "不合法的分组id");  
      put(40051, "分组名字不合法");  
      put(40056, "不合法的序列号");  
      put(40060, "删除单篇图文时，指定的 article_idx 不合法");  
      put(40072, "不合法的编码方式");  
      put(40078, "不合法的卡券状态");
      put(40079, "不合法的时间");
      put(40080, "不合法的CardExt");
      put(40099, "卡券已被核销");
      put(40100, "不合法的时间区间");
      put(40116, "不合法的Code码");
      put(40122, "不合法的库存数量");
      put(40124, "会员卡设置查过限制的 custom_field字段");
      put(40127, "卡券被用户删除或转赠中");
      put(41012, "缺少cardid参数");
      put(40117, "分组名字不合法");  
      put(40118, "media_id大小不合法");  
      put(40119, "button类型错误");  
      put(40120, "button类型错误");  
      put(40121, "不合法的media_id类型");  
      put(40132, "微信号不合法");  
      put(40137, "不支持的图片格式");  
      put(40155, "请勿添加其他公众号的主页链接");  
      put(41001, "缺少access_token参数");  
      put(41002, "缺少appid参数");  
      put(41003, "缺少refresh_token参数");  
      put(41004, "缺少secret参数");  
      put(41005, "缺少多媒体文件数据");  
      put(41006, "缺少media_id参数");  
      put(41007, "缺少子菜单数据");  
      put(41008, "缺少oauth code");  
      put(41009, "缺少openid");  
      put(42001, "access_token超时");  
      put(42002, "refresh_token超时");   
      put(42003, "oauth_code超时");  
      put(42007, "用户修改微信密码，accesstoken和refreshtoken失效，需要重新授权");  
      put(43001, "需要GET请求");  
      put(43002, "需要POST请求");  
      put(43003, "需要HTTPS请求");  
      put(43004, "需要接收者关注");  
      put(43005, "需要好友关系");
      put(43009, "自定义SN权限，请前往公众平台申请");
      put(43010, "无储值权限，请前往公众平台申请");
      put(43019, "需要将接收者从黑名单中移除");  
      put(44001, "多媒体文件为空"); 
      put(44002, "POST的数据包为空");  
      put(44003, "图文消息内容为空");  
      put(44004, "文本消息内容为空");  
      put(45001, "多媒体文件大小超过限制");  
      put(45002, "消息内容超过限制");  
      put(45003, "标题字段超过限制");  
      put(45004, "描述字段超过限制");  
      put(45005, "链接字段超过限制");  
      put(45006, "图片链接字段超过限制");  
      put(40060, "删除单篇图文时，指定的 article_idx 不合法");  
      put(45007, "语音播放时间超过限制");  
      put(45008, "图文消息超过限制");  
      put(45009, "接口调用超过限制");  
      put(45010, "创建菜单个数超过限制");  
      put(45011, "API调用太频繁，请稍候再试");  
      put(45015, "回复时间超过限制");  
      put(45016, "系统分组，不允许修改");  
      put(45017, "分组名字过长");  
      put(45018, "分组数量超过上限");  
      put(45021, "字段超过长度限制，请参考相应接口的字段说明");
      put(45028, "测试号权限不足"); 
      put(45030, "该cardid无接口权限"); 
      put(45031, "库存为0"); 
      put(45033, "用户领取次数超过限制get_limit"); 
      put(45047, "客服接口下行条数超过上限");  
      put(46001, "不存在媒体数据");  
      put(46002, "不存在的菜单版本");  
      put(46003, "不存在的菜单数据");  
      put(46004, "不存在的用户");  
      put(47001, "解析JSON/XML内容错误");  
      put(48001, "api功能未授权");  
      put(48002, "粉丝拒收消息");  
      put(48004, "api接口被封禁");  
      put(48005, "api禁止删除被自动回复和自定义菜单引用的素材");   
      put(48006, "api禁止清零调用次数");  
      put(48008, "公众号没有足够的权限");
      put(50001, "用户未授权该api");  
      put(50002, "用户受限，可能是违规后接口被封禁");  
      put(61451, "参数错误");  
      put(61452, "无效客服账号");  
      put(61453, "客服帐号已存在");  
      put(61454, "客服帐号名长度超过限制");  
      put(61456, "客服帐号个数超过限制");  
      put(61457, "无效头像文件类型"); 
      put(61450, "系统错误");  
      put(61500, "日期格式错误");  
      put(65301, "不存在此menuid对应的个性化菜单");  
      put(65302, "没有相应的用户");  
      put(65303, "没有默认菜单，不能创建个性化菜单");  
      put(65304, "MatchRule信息为空");  
      put(65305, "个性化菜单数量受限");  
      put(65306, "不支持个性化菜单的帐号");  
      put(65307, "个性化菜单信息为空"); 
      put(65308, "包含没有响应类型的button");  
      put(65309, "个性化菜单开关处于关闭状态");  
      put(65310, "填写了省份或城市信息，国家信息不能为空");  
      put(65311, "填写了城市信息，省份信息不能为空");  
      put(65312, "不合法的国家信息");  
      put(65313, "不合法的省份信息");  
      put(65314, "不合法的城市信息");  
      put(65316, "该公众号的菜单设置了过多的域名外跳");  
      put(65317, "不合法的URL");  
      put(9001001, "POST数据参数不合法");  
      put(9001002, "远端服务不可用");  
      put(9001003, "Ticket不合法");  
      put(9001004, "获取摇周边用户信息失败");  
      put(9001005, "获取商户信息失败");  
      put(9001006, "获取OpenID失败");  
      put(9001007, "上传文件缺失");  
      put(9001008, "上传素材的文件类型不合法");  
      put(9001009, "上传素材的文件尺寸不合法");  
      put(9001010, "上传失败");  
      put(9001020, "帐号不合法");   
      put(9001021, "已有设备激活率低于50%，不能新增设备");  
      put(9001022, "设备申请数不合法，必须为大于0的数字");  
      put(9001023, "已存在审核中的设备ID申请");  
      put(9001024, "一次查询设备ID数量不能超过50");  
      put(9001025, "设备ID不合法");  
      put(9001026, "页面ID不合法");  
      put(9001027, "页面参数不合法");  
      put(9001028, "一次删除页面ID数量不能超过10");  
      put(9001029, "页面已应用在设备中，请先解除应用关系再删除"); 
      put(9001030, "一次查询页面ID数量不能超过50");  
      put(9001031, "时间区间不合法");  
      put(9001032, "保存设备与页面的绑定关系参数错误");  
      put(9001033, "门店ID不合法");  
      put(9001034, "设备备注信息过长");  
      put(9001035, "设备申请参数不合法");  
      put(9001036, "查询起始值begin不合法");      
}};

public static Map<Integer, String> getCodeMap() {
	return codeMap;
}

public static void setCodeMap(Map<Integer, String> codeMap) {
	WxCode.codeMap = codeMap;
}  

public static String getTheCode(Integer code){
	Map<Integer, String> rtnCodeMap=getCodeMap();
	return rtnCodeMap.get(code);
}

}