package com.rayootech.core.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.serializer.PropertyFilter;

public class FastjsonFilter implements PropertyFilter, ExtraProcessor {

	protected String excludeObjectNames[] = null;
	protected List<Relation> relations = new ArrayList<Relation>();
	protected String excludeObjectClassName = null;

	public FastjsonFilter() {
	}

	/**
	 * 传入需要过滤的类和属性
	 * @param inputFilterPropertyNames
	 *  用分号分隔的多个字符串。
	 *  class.preoperty或直接propertyName，property看开始，class看末尾，
	 *  如UserEntity.roles
	 */
	public FastjsonFilter(String inputFilterPropertyNames) {
		if (inputFilterPropertyNames == null) {
			return;
		}
		excludeObjectNames = inputFilterPropertyNames.split(";");
	}

	/**
	 * 传入需要过滤的类和属性
	 * @param inputFilterPropertyNames
	 *  class.preoperty或直接propertyName，property看开始，class看末尾，
	 *  如UserEntity.roles
	 */
	public FastjsonFilter(String[] inputFilterPropertyNames) {
		if (inputFilterPropertyNames == null) {
			return;
		}
			
		excludeObjectNames = inputFilterPropertyNames;
	}

	/**
	 * 过滤延迟加载等不需要被序列化的属性，主要是应用于Hibernate的代理和管理。
	 * @param object  	属性所在的对象
	 * @param name 		属性名
	 * @param value 	属性值
	 * @return 返回false属性将被忽略，ture属性将被保留
	 */
	@Override
	public boolean apply(Object object, String name, Object value) {
		if (isMatchExcludeObjectAndName(object, name)) {
			return false;
		}

		return true;
	}

	protected boolean isMatchExcludeObjectAndName(Object object, String name) {
		// 先判断是否有不需要转换的属性
		if (excludeObjectNames != null) {
			// logger.debug("has exclude object names!");
			// 有需要额外判断的
			for (String propertyName : excludeObjectNames) {

				// 如果是空的，那就跳过继续找下面的
				if (StringUtils.isBlank(propertyName)) {
					continue;
				}

				if (propertyName.indexOf(".") > 0) {
					// 带有class名字了
					String s[] = propertyName.split("\\.");
					if (object.getClass().toString().endsWith(s[0]) && name.startsWith(s[1])) {
						return true;
					}
				} else {
					// 仅仅是属性名字开头或者相等
					//if (name.startsWith(propertyName)) {
					if (name.equals(propertyName)) {
						return true;
					}
				}
			}
			// logger.debug("nothing is match");
		}
		return false;
	}

	/**
	 * 下划线格式字符串转换成驼峰格式字符串
	 * @param object
	 * @param key
	 * @param value
	 */
	public void processExtra(Object object, String key, Object value) {
		String[] elems = key.split("_");
		for (int i = 0; i < elems.length; i++) {
			elems[i] = elems[i].toLowerCase();
			if (i != 0) {
				String elem = elems[i];
				char first = elem.toCharArray()[0];
				elems[i] = "" + (char) (first - 32) + elem.substring(1);
			}
		}
		StringBuilder sb = new StringBuilder();

		for (String e : elems) {
			sb.append(e);
		}
		//key = StringUtils.join(elems);
	}

	class Relation {
		Object A;
		Object B;

		Relation() {
		}

		Relation(Object a, Object b) {
			A = a;
			B = b;
		}

		public Object getA() {
			return A;
		}

		public void setA(Object a) {
			A = a;
		}

		public Object getB() {
			return B;
		}

		public void setB(Object b) {
			B = b;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(A.getClass().getName());
			sb.append(" -> ");
			sb.append(B.getClass().getName());
			return sb.toString();

		}
	}
}