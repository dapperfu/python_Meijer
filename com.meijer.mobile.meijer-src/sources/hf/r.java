package hf;

import gf.AbstractC14355b;
import gf.C14354a;
import gf.C14357d;
import gf.C14359f;
import hf.s;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    boolean f135374a;

    /* renamed from: b, reason: collision with root package name */
    int f135375b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f135376c = -1;

    /* renamed from: d, reason: collision with root package name */
    s.n f135377d;

    /* renamed from: e, reason: collision with root package name */
    s.n f135378e;

    /* renamed from: f, reason: collision with root package name */
    AbstractC14355b<Object> f135379f;

    int a() {
        int i10 = this.f135376c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    int b() {
        int i10 = this.f135375b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    AbstractC14355b<Object> c() {
        return (AbstractC14355b) C14357d.a(this.f135379f, d().a());
    }

    s.n d() {
        return (s.n) C14357d.a(this.f135377d, s.n.f135418a);
    }

    s.n e() {
        return (s.n) C14357d.a(this.f135378e, s.n.f135418a);
    }

    public <K, V> ConcurrentMap<K, V> f() {
        return !this.f135374a ? new ConcurrentHashMap(b(), 0.75f, a()) : s.b(this);
    }

    r g(s.n nVar) {
        s.n nVar2 = this.f135377d;
        C14359f.m(nVar2 == null, "Key strength was already set to %s", nVar2);
        this.f135377d = (s.n) C14359f.h(nVar);
        if (nVar != s.n.f135418a) {
            this.f135374a = true;
        }
        return this;
    }

    public r h() {
        return g(s.n.f135419b);
    }

    public String toString() {
        C14357d.b bVarB = C14357d.b(this);
        int i10 = this.f135375b;
        if (i10 != -1) {
            bVarB.a("initialCapacity", i10);
        }
        int i11 = this.f135376c;
        if (i11 != -1) {
            bVarB.a("concurrencyLevel", i11);
        }
        s.n nVar = this.f135377d;
        if (nVar != null) {
            bVarB.b("keyStrength", C14354a.b(nVar.toString()));
        }
        s.n nVar2 = this.f135378e;
        if (nVar2 != null) {
            bVarB.b("valueStrength", C14354a.b(nVar2.toString()));
        }
        if (this.f135379f != null) {
            bVarB.f("keyEquivalence");
        }
        return bVarB.toString();
    }
}
