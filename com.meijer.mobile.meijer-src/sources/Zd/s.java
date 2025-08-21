package Zd;

import Zd.l;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C6648e;

/* loaded from: classes6.dex */
final class s extends a.AbstractC1266a {
    @Override // com.google.android.gms.common.api.a.AbstractC1266a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, C6648e c6648e, Object obj, e.a aVar, e.b bVar) {
        l.a aVar2 = (l.a) obj;
        if (aVar2 == null) {
            aVar2 = new l.a();
        }
        return new Kd.v(context, looper, c6648e, aVar, bVar, aVar2.f43750b, aVar2.f43751c, aVar2.f43753e);
    }

    s() {
    }
}
