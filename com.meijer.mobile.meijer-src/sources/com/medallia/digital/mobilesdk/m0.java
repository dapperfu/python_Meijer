package com.medallia.digital.mobilesdk;

import java.util.Observable;

/* loaded from: classes8.dex */
abstract class m0<T> extends Observable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f93372a;

    /* renamed from: b, reason: collision with root package name */
    private n0 f93373b;

    /* renamed from: c, reason: collision with root package name */
    private String f93374c;

    /* renamed from: d, reason: collision with root package name */
    private Lifetime f93375d;

    /* renamed from: e, reason: collision with root package name */
    private T f93376e;

    protected m0(n0 n0Var) {
        this.f93373b = n0Var;
        if (n0Var != null) {
            this.f93374c = n0Var.getName();
            this.f93375d = n0Var.getLifetime();
        }
    }

    protected n0 a() {
        if (this.f93373b == null) {
            this.f93373b = n0.Unknown;
        }
        return this.f93373b;
    }

    public String b() {
        return getClass().getSimpleName().replace("Collector", "");
    }

    protected abstract CollectorContract c();

    protected Lifetime d() {
        return this.f93375d;
    }

    protected String e() {
        return this.f93374c;
    }

    protected T f() {
        return this.f93376e;
    }

    protected ValueType g() {
        T t10 = this.f93376e;
        return t10 == null ? ValueType.TypeString : t10 instanceof Integer ? ValueType.TypeInteger : t10 instanceof Double ? ValueType.TypeDouble : t10 instanceof Long ? ValueType.TypeLong : t10 instanceof Boolean ? ValueType.TypeBoolean : ValueType.TypeString;
    }

    protected boolean h() {
        return this.f93372a;
    }

    protected c0 i() {
        T t10 = this.f93376e;
        return new c0(t10 == null ? null : t10.toString(), GroupType.collector, d(), g(), e());
    }

    protected void a(Lifetime lifetime) {
        this.f93375d = lifetime;
    }

    protected void a(T t10) {
        if (t10 == null || !this.f93372a) {
            return;
        }
        this.f93376e = t10;
        setChanged();
        notifyObservers(i());
    }

    protected void a(boolean z10) {
        this.f93372a = z10;
    }
}
