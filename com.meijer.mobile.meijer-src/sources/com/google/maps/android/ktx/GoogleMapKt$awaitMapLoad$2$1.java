package com.google.maps.android.ktx;

import Md.C4110c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class GoogleMapKt$awaitMapLoad$2$1 implements C4110c.n {
    final /* synthetic */ Continuation<Unit> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitMapLoad$2$1(Continuation<? super Unit> continuation) {
        this.$continuation = continuation;
    }

    @Override // Md.C4110c.n
    public final void onMapLoaded() {
        Continuation<Unit> continuation = this.$continuation;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.b(Unit.f143329a));
    }
}
