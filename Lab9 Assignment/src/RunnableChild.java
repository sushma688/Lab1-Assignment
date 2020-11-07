
public class RunnableChild implements Runnable {

			private String name;
		public RunnableChild(String name)
		{
			this.name=name;
		}
		public void run()
		{
			try
			{
				for(int i=0;i<5;i++)
				{
					String name=getName();
					System.out.println(name+" "+i);
					Thread.sleep(1000);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private String getName() {
			// TODO Auto-generated method stub
			return name;
		}

	}

