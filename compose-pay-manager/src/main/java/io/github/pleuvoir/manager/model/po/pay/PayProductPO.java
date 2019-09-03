package io.github.pleuvoir.manager.model.po.pay;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.persistence.Column;
import lombok.Data;

@Data
@TableName("p_pay_product")
public class PayProductPO {
	
	
	@Column(name = "id", length = 32, nullable = false)
	private String id;
	
	@Column(name = "pay_type_code", length = 4, nullable = true)
	private String payTypeCode;
	
	@Column(name = "pay_way_code", length = 3, nullable = true)
	private String payWayCode;
	
	@Column(name = "name", length = 32, nullable = true)
	private String name;
	
	@Column(name = "status", length = 2, nullable = true)
	private String status;
	
	@Column(name = "remark", length = 255, nullable = true)
	private String remark;
	

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
