package tc;

import android.annotation.SuppressLint;
import rc.EnumC16886f;
import rc.InterfaceC16889i;
import xc.C18156a;

/* loaded from: classes4.dex */
public final class l {
    @SuppressLint({"DiscouragedApi"})
    public static void a(InterfaceC16889i<?> interfaceC16889i, EnumC16886f enumC16886f) {
        if (!(interfaceC16889i instanceof s)) {
            C18156a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", interfaceC16889i);
        } else {
            u.c().e().l(((s) interfaceC16889i).d().f(enumC16886f), 1);
        }
    }
}
