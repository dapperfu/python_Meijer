package com.google.android.libraries.places.api.net.kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
final class zzk extends ContinuationImpl {
    /* synthetic */ Object zza;
    int zzb;

    zzk(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= Integer.MIN_VALUE;
        return PlacesClientKt.awaitFetchResolvedPhotoUri(null, null, null, this);
    }
}
