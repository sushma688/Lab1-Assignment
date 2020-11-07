//Author:Shakamuri Sushma
//Date:11/07/2020
//Desc:Code to create space between letters

public class Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpaceInterface space=(String msg)->
				{
					StringBuffer sb=new StringBuffer();
					for(int i=0;i<msg.length();i++)
					{
						sb.append(msg.charAt(i)).append(" ");
					}
					return sb.toString();
				};
				System.out.println(space.findSpace("Capgemini Training"));

	}

}
