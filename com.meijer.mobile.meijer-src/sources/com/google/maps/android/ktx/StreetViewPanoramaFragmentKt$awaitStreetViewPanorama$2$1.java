package com.google.maps.android.ktx;

import Md.C4119l;
import Md.InterfaceC4116i;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class StreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1 implements InterfaceC4116i {
    final /* synthetic */ Continuation<C4119l> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public StreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1(Continuation<? super C4119l> continuation) {
        this.$continuation = continuation;
    }

    @Override // Md.InterfaceC4116i
    public final void onStreetViewPanoramaReady(C4119l it) {
        Intrinsics.j(it, "it");
        this.$continuation.resumeWith(Result.b(it));
    }
}
