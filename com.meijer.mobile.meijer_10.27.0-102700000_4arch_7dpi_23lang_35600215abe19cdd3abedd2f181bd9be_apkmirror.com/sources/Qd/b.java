package Qd;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C6523e;

/* loaded from: classes6.dex */
final class b extends a.AbstractC1257a {
    @Override // com.google.android.gms.common.api.a.AbstractC1257a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, C6523e c6523e, Object obj, e.a aVar, e.b bVar) {
        return new Rd.a(context, looper, true, c6523e, Rd.a.c(c6523e), aVar, bVar);
    }

    b() {
    }
}
