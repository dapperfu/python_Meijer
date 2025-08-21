package x;

import C.C3037w;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import x.g;

/* loaded from: classes.dex */
class i implements g.a {

    /* renamed from: a, reason: collision with root package name */
    static final g f167702a = new g(new i());

    /* renamed from: b, reason: collision with root package name */
    private static final Set<C3037w> f167703b = Collections.singleton(C3037w.f3991d);

    @Override // x.g.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // x.g.a
    public Set<C3037w> b() {
        return f167703b;
    }

    @Override // x.g.a
    public Set<C3037w> c(C3037w c3037w) {
        o2.i.b(C3037w.f3991d.equals(c3037w), "DynamicRange is not supported: " + c3037w);
        return f167703b;
    }

    i() {
    }
}
