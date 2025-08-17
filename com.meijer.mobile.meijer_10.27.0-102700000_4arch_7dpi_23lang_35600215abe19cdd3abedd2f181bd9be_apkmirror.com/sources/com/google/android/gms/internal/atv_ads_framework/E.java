package com.google.android.gms.internal.atv_ads_framework;

import java.util.List;

/* loaded from: classes6.dex */
final class E extends F {

    /* renamed from: d, reason: collision with root package name */
    final transient int f80751d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f80752e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ F f80753f;

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final boolean l() {
        return true;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final Object[] m() {
        return this.f80753f.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80752e;
    }

    E(F f10, int i10, int i11) {
        this.f80753f = f10;
        this.f80751d = i10;
        this.f80752e = i11;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int e() {
        return this.f80753f.f() + this.f80751d + this.f80752e;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int f() {
        return this.f80753f.f() + this.f80751d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.a(i10, this.f80752e, "index");
        return this.f80753f.get(i10 + this.f80751d);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.F
    /* renamed from: n */
    public final F subList(int i10, int i11) {
        r.c(i10, i11, this.f80752e);
        F f10 = this.f80753f;
        int i12 = this.f80751d;
        return f10.subList(i10 + i12, i11 + i12);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.F, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
