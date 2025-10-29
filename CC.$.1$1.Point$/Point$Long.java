package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.Util.By.LMNt.Get_Q_By_Point;
import CC.$.Q$Q_LMNt.Point$Q;
import CC.$.Q$Q_LMNt.Q$Long;
import java.util.Collection;
import static java.lang.reflect.Array.newInstance;

public interface Point$Long<In_Typ> extends Point$Q<In_Typ>,Q$Long
{
	Clas_Rap Class=Init_StRt_Nd(Point$Long.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	long Point$Long(In_Typ In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$Longg(In[] From,long[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=Point$Long(From[IndX]);}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default <In extends In_Typ>long[] Pointg$Longg(In[] From)
			{
				long[] Out=new long[From.length];
				Pointg$Longg(From,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$Longg(Iterable<In> From,Collection<Long> To){for(In In:From){To.add(Point$Long(In));}}
}