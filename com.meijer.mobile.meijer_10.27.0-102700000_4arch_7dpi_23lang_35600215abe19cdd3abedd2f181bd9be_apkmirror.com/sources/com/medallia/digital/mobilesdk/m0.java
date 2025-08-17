package com.medallia.digital.mobilesdk;

import java.util.Observable;

/* loaded from: classes7.dex */
abstract class m0<T> extends Observable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f92533a;

    /* renamed from: b, reason: collision with root package name */
    private n0 f92534b;

    /* renamed from: c, reason: collision with root package name */
    private String f92535c;

    /* renamed from: d, reason: collision with root package name */
    private Lifetime f92536d;

    /* renamed from: e, reason: collision with root package name */
    private T f92537e;

    protected m0(n0 n0Var) {
        this.f92534b = n0Var;
        if (n0Var != null) {
            this.f92535c = n0Var.getName();
            this.f92536d = n0Var.getLifetime();
        }
    }

    protected n0 a() {
        if (this.f92534b == null) {
            this.f92534b = n0.Unknown;
        }
        return this.f92534b;
    }

    public String b() {
        return getClass().getSimpleName().replace("Collector", "");
    }

    protected abstract CollectorContract c();

    protected Lifetime d() {
        return this.f92536d;
    }

    protected String e() {
        return this.f92535c;
    }

    protected T f() {
        return this.f92537e;
    }

    protected ValueType g() {
        T t10 = this.f92537e;
        return t10 == null ? ValueType.TypeString : t10 instanceof Integer ? ValueType.TypeInteger : t10 instanceof Double ? ValueType.TypeDouble : t10 instanceof Long ? ValueType.TypeLong : t10 instanceof Boolean ? ValueType.TypeBoolean : ValueType.TypeString;
    }

    protected boolean h() {
        return this.f92533a;
    }

    protected c0 i() {
        T t10 = this.f92537e;
        return new c0(t10 == null ? null : t10.toString(), GroupType.collector, d(), g(), e());
    }

    protected void a(Lifetime lifetime) {
        this.f92536d = lifetime;
    }

    protected void a(T t10) {
        if (t10 == null || !this.f92533a) {
            return;
        }
        this.f92537e = t10;
        setChanged();
        notifyObservers(i());
    }

    protected void a(boolean z10) {
        this.f92533a = z10;
    }
}
