package Ee;

import De.C3106c;
import De.j;
import Ee.W;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    boolean f7261a;

    /* renamed from: b, reason: collision with root package name */
    int f7262b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f7263c = -1;

    /* renamed from: d, reason: collision with root package name */
    W.m f7264d;

    /* renamed from: e, reason: collision with root package name */
    W.m f7265e;

    /* renamed from: f, reason: collision with root package name */
    De.e<Object> f7266f;

    int a() {
        int i10 = this.f7263c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    int b() {
        int i10 = this.f7262b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    De.e<Object> c() {
        return (De.e) De.j.a(this.f7266f, d().b());
    }

    W.m d() {
        return (W.m) De.j.a(this.f7264d, W.m.f7301a);
    }

    W.m e() {
        return (W.m) De.j.a(this.f7265e, W.m.f7301a);
    }

    public <K, V> ConcurrentMap<K, V> f() {
        return !this.f7261a ? new ConcurrentHashMap(b(), 0.75f, a()) : W.a(this);
    }

    V g(W.m mVar) {
        W.m mVar2 = this.f7264d;
        De.p.z(mVar2 == null, "Key strength was already set to %s", mVar2);
        this.f7264d = (W.m) De.p.q(mVar);
        if (mVar != W.m.f7301a) {
            this.f7261a = true;
        }
        return this;
    }

    public V h() {
        return g(W.m.f7302b);
    }

    public String toString() {
        j.b bVarC = De.j.c(this);
        int i10 = this.f7262b;
        if (i10 != -1) {
            bVarC.b("initialCapacity", i10);
        }
        int i11 = this.f7263c;
        if (i11 != -1) {
            bVarC.b("concurrencyLevel", i11);
        }
        W.m mVar = this.f7264d;
        if (mVar != null) {
            bVarC.d("keyStrength", C3106c.e(mVar.toString()));
        }
        W.m mVar2 = this.f7265e;
        if (mVar2 != null) {
            bVarC.d("valueStrength", C3106c.e(mVar2.toString()));
        }
        if (this.f7266f != null) {
            bVarC.k("keyEquivalence");
        }
        return bVarC.toString();
    }
}
