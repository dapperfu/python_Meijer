package ff;

import ef.AbstractC13651b;
import ef.C13650a;
import ef.C13653d;
import ef.C13655f;
import ff.s;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    boolean f131028a;

    /* renamed from: b, reason: collision with root package name */
    int f131029b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f131030c = -1;

    /* renamed from: d, reason: collision with root package name */
    s.n f131031d;

    /* renamed from: e, reason: collision with root package name */
    s.n f131032e;

    /* renamed from: f, reason: collision with root package name */
    AbstractC13651b<Object> f131033f;

    int a() {
        int i10 = this.f131030c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    int b() {
        int i10 = this.f131029b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    AbstractC13651b<Object> c() {
        return (AbstractC13651b) C13653d.a(this.f131033f, d().a());
    }

    s.n d() {
        return (s.n) C13653d.a(this.f131031d, s.n.f131072a);
    }

    s.n e() {
        return (s.n) C13653d.a(this.f131032e, s.n.f131072a);
    }

    public <K, V> ConcurrentMap<K, V> f() {
        return !this.f131028a ? new ConcurrentHashMap(b(), 0.75f, a()) : s.b(this);
    }

    r g(s.n nVar) {
        s.n nVar2 = this.f131031d;
        C13655f.m(nVar2 == null, "Key strength was already set to %s", nVar2);
        this.f131031d = (s.n) C13655f.h(nVar);
        if (nVar != s.n.f131072a) {
            this.f131028a = true;
        }
        return this;
    }

    public r h() {
        return g(s.n.f131073b);
    }

    public String toString() {
        C13653d.b bVarB = C13653d.b(this);
        int i10 = this.f131029b;
        if (i10 != -1) {
            bVarB.a("initialCapacity", i10);
        }
        int i11 = this.f131030c;
        if (i11 != -1) {
            bVarB.a("concurrencyLevel", i11);
        }
        s.n nVar = this.f131031d;
        if (nVar != null) {
            bVarB.b("keyStrength", C13650a.b(nVar.toString()));
        }
        s.n nVar2 = this.f131032e;
        if (nVar2 != null) {
            bVarB.b("valueStrength", C13650a.b(nVar2.toString()));
        }
        if (this.f131033f != null) {
            bVarB.f("keyEquivalence");
        }
        return bVarB.toString();
    }
}
