package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import java.util.Objects;

/* loaded from: classes6.dex */
final class I2 extends LruCache {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ P2 f85055j;

    @Override // androidx.collection.LruCache
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        com.google.android.gms.common.internal.r.f(str);
        return this.f85055j.m(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I2(P2 p22, int i10) {
        super(20);
        Objects.requireNonNull(p22);
        this.f85055j = p22;
    }
}
