package Ce;

import Be.C2957c;
import Be.j;
import Ce.W;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    boolean f3949a;

    /* renamed from: b, reason: collision with root package name */
    int f3950b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f3951c = -1;

    /* renamed from: d, reason: collision with root package name */
    W.m f3952d;

    /* renamed from: e, reason: collision with root package name */
    W.m f3953e;

    /* renamed from: f, reason: collision with root package name */
    Be.e<Object> f3954f;

    int a() {
        int i10 = this.f3951c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    int b() {
        int i10 = this.f3950b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    Be.e<Object> c() {
        return (Be.e) Be.j.a(this.f3954f, d().b());
    }

    W.m d() {
        return (W.m) Be.j.a(this.f3952d, W.m.f3989a);
    }

    W.m e() {
        return (W.m) Be.j.a(this.f3953e, W.m.f3989a);
    }

    public <K, V> ConcurrentMap<K, V> f() {
        return !this.f3949a ? new ConcurrentHashMap(b(), 0.75f, a()) : W.a(this);
    }

    V g(W.m mVar) {
        W.m mVar2 = this.f3952d;
        Be.p.z(mVar2 == null, "Key strength was already set to %s", mVar2);
        this.f3952d = (W.m) Be.p.q(mVar);
        if (mVar != W.m.f3989a) {
            this.f3949a = true;
        }
        return this;
    }

    public V h() {
        return g(W.m.f3990b);
    }

    public String toString() {
        j.b bVarC = Be.j.c(this);
        int i10 = this.f3950b;
        if (i10 != -1) {
            bVarC.b("initialCapacity", i10);
        }
        int i11 = this.f3951c;
        if (i11 != -1) {
            bVarC.b("concurrencyLevel", i11);
        }
        W.m mVar = this.f3952d;
        if (mVar != null) {
            bVarC.d("keyStrength", C2957c.e(mVar.toString()));
        }
        W.m mVar2 = this.f3953e;
        if (mVar2 != null) {
            bVarC.d("valueStrength", C2957c.e(mVar2.toString()));
        }
        if (this.f3954f != null) {
            bVarC.k("keyEquivalence");
        }
        return bVarC.toString();
    }
}
