package S;

import androidx.camera.core.impl.D;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.t;
import java.util.UUID;

/* loaded from: classes.dex */
class g implements D.a<f, h, g> {

    /* renamed from: a, reason: collision with root package name */
    private final s f34259a;

    g() {
        this(s.b0());
    }

    g(s sVar) {
        this.f34259a = sVar;
        Class cls = (Class) sVar.h(J.k.f15321c, null);
        if (cls == null || cls.equals(f.class)) {
            d(E.b.STREAM_SHARING);
            e(f.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }

    @Override // C.InterfaceC3038x
    public r a() {
        return this.f34259a;
    }

    @Override // androidx.camera.core.impl.D.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h b() {
        return new h(t.a0(this.f34259a));
    }

    public g d(E.b bVar) {
        a().r(D.f47548F, bVar);
        return this;
    }

    public g e(Class<f> cls) {
        a().r(J.k.f15321c, cls);
        if (a().h(J.k.f15320b, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public g f(String str) {
        a().r(J.k.f15320b, str);
        return this;
    }
}
