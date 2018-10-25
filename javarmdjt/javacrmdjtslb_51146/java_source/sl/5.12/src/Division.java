public class Division { // 创建类
	public static void main(String args[]) { // 主方法
		String str = new String("abc,def,ghi,gkl"); // 定义的字符串str
		// 使用split()方法对字符串进行拆分,返回字符串数组
		String[] newstr = str.split(",");
		for (int i = 0; i < newstr.length; i++) { // 使用for循环遍历字符数组
			System.out.println(newstr[i]); // 输出信息
		}
		// 对字符串进行拆分，并限定拆分次数，返回字符数组
		String[] newstr2 = str.split(",", 2);
		for (int j = 0; j < newstr2.length; j++) { // 循环遍历字符数组
			System.out.println(newstr2[j]); // 输出信息
		}
	}
}
