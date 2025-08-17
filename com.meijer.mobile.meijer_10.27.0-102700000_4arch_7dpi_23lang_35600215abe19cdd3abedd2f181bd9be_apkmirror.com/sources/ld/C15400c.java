package ld;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C6523e;
import com.google.android.gms.common.internal.C6542y;
import hd.InterfaceC14403d;
import hd.InterfaceC14412m;

/* renamed from: ld.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C15400c extends a.AbstractC1257a {
    @Override // com.google.android.gms.common.api.a.AbstractC1257a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C6523e c6523e, Object obj, InterfaceC14403d interfaceC14403d, InterfaceC14412m interfaceC14412m) {
        return new C15402e(context, looper, c6523e, (C6542y) obj, interfaceC14403d, interfaceC14412m);
    }

    C15400c() {
    }
}
