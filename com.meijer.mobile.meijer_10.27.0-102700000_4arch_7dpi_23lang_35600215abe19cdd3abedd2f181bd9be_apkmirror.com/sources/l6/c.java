package l6;

import android.content.Context;
import u6.q;

/* loaded from: classes4.dex */
public class c implements InterfaceC15384b {
    @Override // l6.InterfaceC15384b
    public EnumC15383a a(Context context) {
        return (context == null || q.f(context) != 0.0f) ? EnumC15383a.STANDARD_MOTION : EnumC15383a.REDUCED_MOTION;
    }
}
