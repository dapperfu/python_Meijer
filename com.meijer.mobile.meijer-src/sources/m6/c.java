package m6;

import android.content.Context;
import v6.q;

/* loaded from: classes4.dex */
public class c implements InterfaceC15681b {
    @Override // m6.InterfaceC15681b
    public EnumC15680a a(Context context) {
        return (context == null || q.f(context) != 0.0f) ? EnumC15680a.STANDARD_MOTION : EnumC15680a.REDUCED_MOTION;
    }
}
