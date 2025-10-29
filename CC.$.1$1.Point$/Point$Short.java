package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Point$Q;
import CC.$.Q$Q_LMNt.Q$Short;
import java.util.Collection;

public interface Point$Short<In_Typ> extends Point$Q<In_Typ>,Q$Short
{
	Clas_Rap Class=Init_StRt_Nd(Point$Short.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	short Point$Short(In_Typ In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$Shortg(In[] From,short[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=Point$Short(From[IndX]);}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default <In extends In_Typ>short[] Pointg$Shortg(In[] From)
			{
				short[] Out=new short[From.length];
				Pointg$Shortg(From,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$Shortg(Iterable<In> From,Collection<Short> To){for(In In:From){To.add(Point$Short(In));}}
}