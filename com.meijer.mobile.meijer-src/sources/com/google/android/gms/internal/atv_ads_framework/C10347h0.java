package com.google.android.gms.internal.atv_ads_framework;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10347h0 extends AbstractC10353j0 {

    /* renamed from: a, reason: collision with root package name */
    private int f81840a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f81841b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC10374q0 f81842c;

    C10347h0(AbstractC10374q0 abstractC10374q0) {
        this.f81842c = abstractC10374q0;
        this.f81841b = abstractC10374q0.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f81840a < this.f81841b;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10359l0
    public final byte zza() {
        int i10 = this.f81840a;
        if (i10 >= this.f81841b) {
            throw new NoSuchElementException();
        }
        this.f81840a = i10 + 1;
        return this.f81842c.e(i10);
    }
}
