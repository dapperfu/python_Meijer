package Xd;

import Xd.l;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C6523e;

/* loaded from: classes6.dex */
final class s extends a.AbstractC1257a {
    @Override // com.google.android.gms.common.api.a.AbstractC1257a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, C6523e c6523e, Object obj, e.a aVar, e.b bVar) {
        l.a aVar2 = (l.a) obj;
        if (aVar2 == null) {
            aVar2 = new l.a();
        }
        return new Id.v(context, looper, c6523e, aVar, bVar, aVar2.f39272b, aVar2.f39273c, aVar2.f39275e);
    }

    s() {
    }
}
