package x;

import C.C2979w;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import x.g;

/* loaded from: classes.dex */
class i implements g.a {

    /* renamed from: a, reason: collision with root package name */
    static final g f166614a = new g(new i());

    /* renamed from: b, reason: collision with root package name */
    private static final Set<C2979w> f166615b = Collections.singleton(C2979w.f3533d);

    @Override // x.g.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // x.g.a
    public Set<C2979w> b() {
        return f166615b;
    }

    @Override // x.g.a
    public Set<C2979w> c(C2979w c2979w) {
        o2.i.b(C2979w.f3533d.equals(c2979w), "DynamicRange is not supported: " + c2979w);
        return f166615b;
    }

    i() {
    }
}
