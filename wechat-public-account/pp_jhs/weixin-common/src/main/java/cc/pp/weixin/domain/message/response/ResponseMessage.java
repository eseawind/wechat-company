package cc.pp.weixin.domain.message.response;

import cc.pp.weixin.domain.message.BaseMessage;

/**
 * 微信公众平台消息回复父类
 * @author wgybzb
 * @since  2013-04-06
 */
public abstract class ResponseMessage extends BaseMessage {
	/**
	 * 默认的序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 位0x0001被标志时，星标刚收到的消息
	 */
	protected long funcFlag;
	public long getFuncFlag() {
		return funcFlag;
	}
	public void setFuncFlag(long funcFlag) {
		this.funcFlag = funcFlag;
	}

	/**
	 * 默认构造函数
	 */
	public ResponseMessage() {
		//位0x0001被标志时，星标刚收到的消息
		this.funcFlag = 0;
	}

	/**
	 * 根据业务处理，获取响应内容
	 *
	 * @return	微信公众平台规定的XML格式的数据
	 */
	public abstract String getReponseMsg();
}
