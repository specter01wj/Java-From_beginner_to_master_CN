import java.util.*;

public class MapText { // 创建类MapText
	public static void main(String[] args) { // 主方法
		Map map = new HashMap(); // 由HashMap实现的Map对象
		Emp emp = new Emp("001", "张三");
		Emp emp2 = new Emp("005", "李四"); // 创建Emp对象
		Emp emp3 = new Emp("004", "王一");
		map.put(emp.getE_id(), emp.getE_name());
		map.put(emp2.getE_id(), emp2.getE_name()); // 将对象添加到集合中
		map.put(emp3.getE_id(), emp3.getE_name());
		Set set = map.keySet(); // 获取Map集合中的key对象集合
		Iterator it = set.iterator();
		System.out.println("HashMap类实现的Map集合，无序：");
		while (it.hasNext()) {
			String str = (String) it.next();
			String name = (String) map.get(str); // 遍历Map集合
			System.out.println(str + " " + name);
		}
		TreeMap treemap = new TreeMap(); // 创建TreeMap集合对象
		treemap.putAll(map); // 向集合添加对象
		Iterator iter = treemap.keySet().iterator();
		System.out.println("TreeMap类实现的Map集合，键对象升序：");
		while (iter.hasNext()) { // 遍历TreeMap集合对象
			String str = (String) iter.next(); // 获取集合中的所有key对象
			String name = (String) treemap.get(str); // 获取集合中的所有values值
			System.out.println(str + " " + name);
		}
	}
}
