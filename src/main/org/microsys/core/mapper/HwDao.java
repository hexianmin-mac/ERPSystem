package main.org.microsys.core.mapper;

import java.util.List;

import main.org.microsys.core.entity.Hw;

public interface HwDao {
	List<Hw>  sp(Hw hw);
	int   spxj(Hw hw);
	int  xjrk(Hw hw);
	int jj(int id);
	Hw  dy(int id);
	int ckkk(Hw hw);
	Hw dys(String name);
	int updateHw(Hw hw);
}
