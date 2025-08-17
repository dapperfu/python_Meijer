package com.google.android.libraries.places.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class zzrn extends ContinuationImpl {
    /* synthetic */ Object zza;
    int zzb;
    Object zzc;
    final /* synthetic */ zzro zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrn(zzro zzroVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzroVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= Integer.MIN_VALUE;
        return this.zzd.emit(null, this);
    }
}
