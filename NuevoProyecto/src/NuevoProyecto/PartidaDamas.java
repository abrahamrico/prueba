package NuevoProyecto;

public class PartidaDamas {
	public static void main(String[] args) {
	String cadena=" □ ",cadena1=" ";
		for (int i=0;i<8;i++) {
			
			for (int j=0;j<8;j++) {
				if (((i==0) || (i==2)) || (i==6))
				{ 
					if ((j%2)==0)
					{
						cadena1+=" ■ ";
					}
					else
					{
						cadena1+=cadena;
					}
				}
				else if ((i==1) || (i==5) || (i==7))
				{
					if ((j%2)==0)
					{
						cadena1+=cadena;
					}
					else
					{
						
						cadena1+=" ■ ";
					}
				}
				else	
				{
					cadena1+=cadena;
				}
			}
			System.out.println(cadena1);
			
			cadena1=" ";
		}

	}
}
