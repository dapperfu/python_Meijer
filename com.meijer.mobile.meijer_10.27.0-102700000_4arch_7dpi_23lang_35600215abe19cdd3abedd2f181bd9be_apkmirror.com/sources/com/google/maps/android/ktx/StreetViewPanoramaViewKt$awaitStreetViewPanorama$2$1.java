package com.google.maps.android.ktx;

import Kd.C3954l;
import Kd.InterfaceC3951i;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1 implements InterfaceC3951i {
    final /* synthetic */ Continuation<C3954l> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1(Continuation<? super C3954l> continuation) {
        this.$continuation = continuation;
    }

    @Override // Kd.InterfaceC3951i
    public final void onStreetViewPanoramaReady(C3954l it) {
        Intrinsics.j(it, "it");
        this.$continuation.resumeWith(Result.b(it));
    }
}
