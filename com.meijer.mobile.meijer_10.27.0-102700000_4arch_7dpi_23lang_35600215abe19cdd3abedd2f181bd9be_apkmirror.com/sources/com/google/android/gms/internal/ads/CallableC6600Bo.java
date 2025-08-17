package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Bo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC6600Bo implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f65580a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6668Do f65581b;

    CallableC6600Bo(C6668Do c6668Do, Context context) {
        this.f65580a = context;
        this.f65581b = c6668Do;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.Do r0 = r5.f65581b
            java.util.WeakHashMap r0 = com.google.android.gms.internal.ads.C6668Do.a(r0)
            android.content.Context r1 = r5.f65580a
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.Co r0 = (com.google.android.gms.internal.ads.C6634Co) r0
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.Vf r1 = com.google.android.gms.internal.ads.C7595bg.f72851d
            java.lang.Object r1 = r1.e()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = r0.f65822a
            long r3 = r3 + r1
            com.google.android.gms.common.util.f r1 = Lc.v.c()
            long r1 = r1.a()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L3a
        L2c:
            android.content.Context r1 = r5.f65580a
            com.google.android.gms.internal.ads.Ao r0 = r0.f65823b
            com.google.android.gms.internal.ads.zo r2 = new com.google.android.gms.internal.ads.zo
            r2.<init>(r1, r0)
            com.google.android.gms.internal.ads.Ao r0 = r2.a()
            goto L45
        L3a:
            android.content.Context r0 = r5.f65580a
            com.google.android.gms.internal.ads.zo r1 = new com.google.android.gms.internal.ads.zo
            r1.<init>(r0)
            com.google.android.gms.internal.ads.Ao r0 = r1.a()
        L45:
            com.google.android.gms.internal.ads.Do r1 = r5.f65581b
            android.content.Context r2 = r5.f65580a
            java.util.WeakHashMap r3 = com.google.android.gms.internal.ads.C6668Do.a(r1)
            com.google.android.gms.internal.ads.Co r4 = new com.google.android.gms.internal.ads.Co
            r4.<init>(r1, r0)
            r3.put(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CallableC6600Bo.call():java.lang.Object");
    }
}
