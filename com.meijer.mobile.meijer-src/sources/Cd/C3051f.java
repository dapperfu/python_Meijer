package Cd;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C6648e;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;

/* renamed from: Cd.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3051f extends a.AbstractC1266a {
    @Override // com.google.android.gms.common.api.a.AbstractC1266a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C6648e c6648e, Object obj, InterfaceC14981d interfaceC14981d, InterfaceC14990m interfaceC14990m) {
        return new P(context, looper, c6648e, interfaceC14981d, interfaceC14990m);
    }

    C3051f() {
    }
}
