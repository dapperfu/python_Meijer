package vd;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C6523e;
import hd.InterfaceC14403d;
import hd.InterfaceC14412m;

/* renamed from: vd.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C17558n extends a.AbstractC1257a<C17548d, a.d.c> {
    @Override // com.google.android.gms.common.api.a.AbstractC1257a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C6523e c6523e, a.d.c cVar, InterfaceC14403d interfaceC14403d, InterfaceC14412m interfaceC14412m) {
        return new C17548d(context, looper, c6523e, interfaceC14403d, interfaceC14412m);
    }

    C17558n() {
    }
}
