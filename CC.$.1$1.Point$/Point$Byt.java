package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Point$Q;
import CC.$.Q$Q_LMNt.Q$Byt;
import java.util.Collection;

public interface Point$Byt<In_Typ> extends Point$Q<In_Typ>,Q$Byt
{
	Clas_Rap Class=Init_StRt_Nd(Point$Byt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	byte Point$Byt(In_Typ In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$Bytg(In[] From,byte[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=Point$Byt(From[IndX]);}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default <In extends In_Typ>byte[] Pointg$Bytg(In[] From)
			{
				byte[] Out=new byte[From.length];
				Pointg$Bytg(From,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$Bytg(Iterable<In> From,Collection<Byte> To){for(In In:From){To.add(Point$Byt(In));}}
}