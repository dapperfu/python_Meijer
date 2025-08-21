package com.google.maps.android.compose.streetview;

import Md.C4119l;
import Md.InterfaceC4116i;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1 implements InterfaceC4116i {
    final /* synthetic */ Continuation $continuation;

    public StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1(Continuation continuation) {
        this.$continuation = continuation;
    }

    @Override // Md.InterfaceC4116i
    public final void onStreetViewPanoramaReady(C4119l it) {
        Intrinsics.j(it, "it");
        this.$continuation.resumeWith(Result.b(it));
    }
}
