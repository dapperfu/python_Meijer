package com.google.android.gms.internal.atv_ads_framework;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10222h0 extends AbstractC10228j0 {

    /* renamed from: a, reason: collision with root package name */
    private int f81000a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f81001b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC10249q0 f81002c;

    C10222h0(AbstractC10249q0 abstractC10249q0) {
        this.f81002c = abstractC10249q0;
        this.f81001b = abstractC10249q0.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f81000a < this.f81001b;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10234l0
    public final byte zza() {
        int i10 = this.f81000a;
        if (i10 >= this.f81001b) {
            throw new NoSuchElementException();
        }
        this.f81000a = i10 + 1;
        return this.f81002c.e(i10);
    }
}
