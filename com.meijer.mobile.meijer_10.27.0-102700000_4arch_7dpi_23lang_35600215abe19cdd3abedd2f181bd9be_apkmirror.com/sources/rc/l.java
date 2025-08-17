package rc;

import android.annotation.SuppressLint;
import pc.EnumC16282f;
import pc.InterfaceC16285i;
import vc.C17544a;

/* loaded from: classes4.dex */
public final class l {
    @SuppressLint({"DiscouragedApi"})
    public static void a(InterfaceC16285i<?> interfaceC16285i, EnumC16282f enumC16282f) {
        if (!(interfaceC16285i instanceof s)) {
            C17544a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", interfaceC16285i);
        } else {
            u.c().e().l(((s) interfaceC16285i).d().f(enumC16282f), 1);
        }
    }
}
