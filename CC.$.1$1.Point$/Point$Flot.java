package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Point$Q;
import CC.$.Q$Q_LMNt.Q$Flot;
import java.util.Collection;

public interface Point$Flot<In_Typ> extends Point$Q<In_Typ>,Q$Flot
{
	Clas_Rap Class=Init_StRt_Nd(Point$Flot.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	float Point$Flot(In_Typ In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$Flotg(In[] From,float[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=Point$Flot(From[IndX]);}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default <In extends In_Typ>float[] Pointg$Flotg(In[] From)
			{
				float[] Out=new float[From.length];
				Pointg$Flotg(From,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$Flotg(Iterable<In> From,Collection<Float> To){for(In In:From){To.add(Point$Flot(In));}}
}