package com.google.android.libraries.places.internal;

import pv.InterfaceC16562g;

/* loaded from: classes6.dex */
public final class zzrr implements InterfaceC16562g {
    final /* synthetic */ InterfaceC16562g zza;

    public zzrr(InterfaceC16562g interfaceC16562g) {
        this.zza = interfaceC16562g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pv.InterfaceC16562g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.places.internal.zzrq
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.libraries.places.internal.zzrq r0 = (com.google.android.libraries.places.internal.zzrq) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.internal.zzrq r0 = new com.google.android.libraries.places.internal.zzrq
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r8)
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.zzc
            pv.g r7 = (pv.InterfaceC16562g) r7
            kotlin.ResultKt.b(r8)
            goto L50
        L3c:
            kotlin.ResultKt.b(r8)
            pv.g r8 = r6.zza
            mv.W r7 = (mv.W) r7
            r0.zzc = r8
            r0.zzb = r4
            java.lang.Object r7 = r7.H(r0)
            if (r7 == r1) goto L5f
            r5 = r8
            r8 = r7
            r7 = r5
        L50:
            r2 = 0
            r0.zzc = r2
            r0.zzb = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L5c
            goto L5f
        L5c:
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzrr.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
