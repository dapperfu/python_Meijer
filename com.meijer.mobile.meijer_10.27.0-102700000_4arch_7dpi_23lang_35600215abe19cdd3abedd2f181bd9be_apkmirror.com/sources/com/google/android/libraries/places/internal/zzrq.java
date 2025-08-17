package com.google.android.libraries.places.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class zzrq extends ContinuationImpl {
    /* synthetic */ Object zza;
    int zzb;
    Object zzc;
    final /* synthetic */ zzrr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrq(zzrr zzrrVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzrrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= Integer.MIN_VALUE;
        return this.zzd.emit(null, this);
    }
}
