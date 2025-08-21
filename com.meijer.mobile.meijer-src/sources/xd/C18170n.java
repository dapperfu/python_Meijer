package xd;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C6648e;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;

/* renamed from: xd.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C18170n extends a.AbstractC1266a<C18160d, a.d.c> {
    @Override // com.google.android.gms.common.api.a.AbstractC1266a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C6648e c6648e, a.d.c cVar, InterfaceC14981d interfaceC14981d, InterfaceC14990m interfaceC14990m) {
        return new C18160d(context, looper, c6648e, interfaceC14981d, interfaceC14990m);
    }

    C18170n() {
    }
}
