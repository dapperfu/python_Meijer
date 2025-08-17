package com.google.maps.android.ktx;

import Kd.C3945c;
import Kd.InterfaceC3949g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class MapViewKt$awaitMap$2$1 implements InterfaceC3949g {
    final /* synthetic */ Continuation<C3945c> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public MapViewKt$awaitMap$2$1(Continuation<? super C3945c> continuation) {
        this.$continuation = continuation;
    }

    @Override // Kd.InterfaceC3949g
    public final void onMapReady(C3945c it) {
        Intrinsics.j(it, "it");
        this.$continuation.resumeWith(Result.b(it));
    }
}
