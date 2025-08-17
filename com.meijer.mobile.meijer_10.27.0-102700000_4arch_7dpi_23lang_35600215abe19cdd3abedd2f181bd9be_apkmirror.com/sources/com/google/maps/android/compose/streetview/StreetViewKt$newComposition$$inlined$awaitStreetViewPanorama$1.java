package com.google.maps.android.compose.streetview;

import Kd.C3954l;
import Kd.InterfaceC3951i;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1 implements InterfaceC3951i {
    final /* synthetic */ Continuation $continuation;

    public StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1(Continuation continuation) {
        this.$continuation = continuation;
    }

    @Override // Kd.InterfaceC3951i
    public final void onStreetViewPanoramaReady(C3954l it) {
        Intrinsics.j(it, "it");
        this.$continuation.resumeWith(Result.b(it));
    }
}
