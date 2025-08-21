package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.g70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8202g70 {

    /* renamed from: b, reason: collision with root package name */
    private final int f75084b;

    /* renamed from: c, reason: collision with root package name */
    private final int f75085c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f75083a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private final G70 f75086d = new G70();

    public final int a() {
        return this.f75086d.a();
    }

    public final long c() {
        return this.f75086d.b();
    }

    public final long d() {
        return this.f75086d.c();
    }

    private final void i() {
        while (!this.f75083a.isEmpty()) {
            if (Nc.v.c().a() - ((C9376r70) this.f75083a.getFirst()).f78786d < this.f75085c) {
                return;
            }
            this.f75086d.g();
            this.f75083a.remove();
        }
    }

    public final C9376r70 e() {
        this.f75086d.f();
        i();
        if (this.f75083a.isEmpty()) {
            return null;
        }
        C9376r70 c9376r70 = (C9376r70) this.f75083a.remove();
        if (c9376r70 != null) {
            this.f75086d.h();
        }
        return c9376r70;
    }

    public final F70 f() {
        return this.f75086d.d();
    }

    public final String g() {
        return this.f75086d.e();
    }

    public final boolean h(C9376r70 c9376r70) {
        this.f75086d.f();
        i();
        if (this.f75083a.size() == this.f75084b) {
            return false;
        }
        this.f75083a.add(c9376r70);
        return true;
    }

    public C8202g70(int i10, int i11) {
        this.f75084b = i10;
        this.f75085c = i11;
    }

    public final int b() {
        i();
        return this.f75083a.size();
    }
}
