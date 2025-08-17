package v;

import android.content.Context;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.w;

/* loaded from: classes.dex */
public final class K0 implements androidx.camera.core.impl.E {

    /* renamed from: b, reason: collision with root package name */
    final C17385i1 f163735b;

    public K0(Context context) {
        this.f163735b = C17385i1.c(context);
    }

    @Override // androidx.camera.core.impl.E
    public androidx.camera.core.impl.k a(E.b bVar, int i10) {
        Object obj;
        androidx.camera.core.impl.s sVarB0 = androidx.camera.core.impl.s.b0();
        w.b bVar2 = new w.b();
        bVar2.w(V1.b(bVar, i10));
        sVarB0.r(androidx.camera.core.impl.D.f47327x, bVar2.o());
        sVarB0.r(androidx.camera.core.impl.D.f47329z, J0.f163722a);
        i.a aVar = new i.a();
        aVar.u(V1.a(bVar, i10));
        sVarB0.r(androidx.camera.core.impl.D.f47328y, aVar.h());
        k.a<i.b> aVar2 = androidx.camera.core.impl.D.f47319A;
        if (bVar == E.b.IMAGE_CAPTURE) {
            obj = C17420u1.f164190c;
        } else {
            obj = V.f163890a;
        }
        sVarB0.r(aVar2, obj);
        if (bVar == E.b.PREVIEW) {
            sVarB0.r(androidx.camera.core.impl.q.f47457t, this.f163735b.f());
        }
        sVarB0.r(androidx.camera.core.impl.q.f47452o, Integer.valueOf(this.f163735b.d(true).getRotation()));
        if (bVar == E.b.VIDEO_CAPTURE || bVar == E.b.STREAM_SHARING) {
            sVarB0.r(androidx.camera.core.impl.D.f47322D, Boolean.TRUE);
        }
        return androidx.camera.core.impl.t.a0(sVarB0);
    }
}
