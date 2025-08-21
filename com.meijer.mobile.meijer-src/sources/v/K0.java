package v;

import android.content.Context;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.w;

/* loaded from: classes.dex */
public final class K0 implements androidx.camera.core.impl.E {

    /* renamed from: b, reason: collision with root package name */
    final C17524i1 f164769b;

    public K0(Context context) {
        this.f164769b = C17524i1.c(context);
    }

    @Override // androidx.camera.core.impl.E
    public androidx.camera.core.impl.k a(E.b bVar, int i10) {
        Object obj;
        androidx.camera.core.impl.s sVarB0 = androidx.camera.core.impl.s.b0();
        w.b bVar2 = new w.b();
        bVar2.w(V1.b(bVar, i10));
        sVarB0.r(androidx.camera.core.impl.D.f47551x, bVar2.o());
        sVarB0.r(androidx.camera.core.impl.D.f47553z, J0.f164756a);
        i.a aVar = new i.a();
        aVar.u(V1.a(bVar, i10));
        sVarB0.r(androidx.camera.core.impl.D.f47552y, aVar.h());
        k.a<i.b> aVar2 = androidx.camera.core.impl.D.f47543A;
        if (bVar == E.b.IMAGE_CAPTURE) {
            obj = C17559u1.f165224c;
        } else {
            obj = V.f164924a;
        }
        sVarB0.r(aVar2, obj);
        if (bVar == E.b.PREVIEW) {
            sVarB0.r(androidx.camera.core.impl.q.f47681t, this.f164769b.f());
        }
        sVarB0.r(androidx.camera.core.impl.q.f47676o, Integer.valueOf(this.f164769b.d(true).getRotation()));
        if (bVar == E.b.VIDEO_CAPTURE || bVar == E.b.STREAM_SHARING) {
            sVarB0.r(androidx.camera.core.impl.D.f47546D, Boolean.TRUE);
        }
        return androidx.camera.core.impl.t.a0(sVarB0);
    }
}
