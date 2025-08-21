package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
final class zzo extends ContinuationImpl {
    /* synthetic */ Object zza;
    int zzb;

    zzo(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= Integer.MIN_VALUE;
        return PlacesClientKt.awaitIsOpen((PlacesClient) null, (Place) null, (Long) null, this);
    }
}
