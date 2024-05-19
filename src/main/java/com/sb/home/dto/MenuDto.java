package com.sb.home.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MenuDto {
	
	public String name;
	public Boolean isLink;
	public Integer srNo;
	public String icon;
	public String cssClasses;
	public String url;
	public List<MenuDto> subMenu;
	
}
