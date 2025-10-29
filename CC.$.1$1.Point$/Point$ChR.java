package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Point$Q;
import CC.$.Q$Q_LMNt.Q$ChR;
import java.util.Collection;

public interface Point$ChR<In_Typ> extends Point$Q<In_Typ>,Q$ChR
{
	Clas_Rap Class=Init_StRt_Nd(Point$ChR.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	char Point$ChR(In_Typ In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$ChRg(In[] From,char[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=Point$ChR(From[IndX]);}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default <In extends In_Typ>char[] Pointg$ChRg(In[] From)
			{
				char[] Out=new char[From.length];
				Pointg$ChRg(From,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default <In extends In_Typ>void Pointg$ChRg(Iterable<In> From,Collection<Character> To){for(In In:From){To.add(Point$ChR(In));}}
}