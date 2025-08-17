package com.google.android.libraries.places.internal;

import kotlin.jvm.functions.Function2;
import tv.InterfaceC17153g;

/* loaded from: classes6.dex */
public final class zzro implements InterfaceC17153g {
    final /* synthetic */ InterfaceC17153g zza;
    final /* synthetic */ Function2 zzb;

    public zzro(InterfaceC17153g interfaceC17153g, Function2 function2) {
        this.zza = interfaceC17153g;
        this.zzb = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tv.InterfaceC17153g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.places.internal.zzrn
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.libraries.places.internal.zzrn r0 = (com.google.android.libraries.places.internal.zzrn) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.internal.zzrn r0 = new com.google.android.libraries.places.internal.zzrn
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
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.zzc
            tv.g r7 = (tv.InterfaceC17153g) r7
            kotlin.ResultKt.b(r8)
            goto L58
        L3c:
            kotlin.ResultKt.b(r8)
            tv.g r8 = r6.zza
            kotlin.jvm.functions.Function2 r2 = r6.zzb
            r0.zzc = r8
            r0.zzb = r4
            r4 = 6
            kotlin.jvm.internal.InlineMarker.c(r4)
            java.lang.Object r7 = r2.invoke(r7, r0)
            r2 = 7
            kotlin.jvm.internal.InlineMarker.c(r2)
            if (r7 == r1) goto L67
            r5 = r8
            r8 = r7
            r7 = r5
        L58:
            r2 = 0
            r0.zzc = r2
            r0.zzb = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L64
            goto L67
        L64:
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzro.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
