package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.g70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8077g70 {

    /* renamed from: b, reason: collision with root package name */
    private final int f74244b;

    /* renamed from: c, reason: collision with root package name */
    private final int f74245c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f74243a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private final G70 f74246d = new G70();

    public final int a() {
        return this.f74246d.a();
    }

    public final long c() {
        return this.f74246d.b();
    }

    public final long d() {
        return this.f74246d.c();
    }

    private final void i() {
        while (!this.f74243a.isEmpty()) {
            if (Lc.v.c().a() - ((C9251r70) this.f74243a.getFirst()).f77946d < this.f74245c) {
                return;
            }
            this.f74246d.g();
            this.f74243a.remove();
        }
    }

    public final C9251r70 e() {
        this.f74246d.f();
        i();
        if (this.f74243a.isEmpty()) {
            return null;
        }
        C9251r70 c9251r70 = (C9251r70) this.f74243a.remove();
        if (c9251r70 != null) {
            this.f74246d.h();
        }
        return c9251r70;
    }

    public final F70 f() {
        return this.f74246d.d();
    }

    public final String g() {
        return this.f74246d.e();
    }

    public final boolean h(C9251r70 c9251r70) {
        this.f74246d.f();
        i();
        if (this.f74243a.size() == this.f74244b) {
            return false;
        }
        this.f74243a.add(c9251r70);
        return true;
    }

    public C8077g70(int i10, int i11) {
        this.f74244b = i10;
        this.f74245c = i11;
    }

    public final int b() {
        i();
        return this.f74243a.size();
    }
}
