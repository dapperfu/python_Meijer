package com.google.maps.android.ktx;

import Md.C4110c;
import Md.InterfaceC4114g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class MapViewKt$awaitMap$2$1 implements InterfaceC4114g {
    final /* synthetic */ Continuation<C4110c> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public MapViewKt$awaitMap$2$1(Continuation<? super C4110c> continuation) {
        this.$continuation = continuation;
    }

    @Override // Md.InterfaceC4114g
    public final void onMapReady(C4110c it) {
        Intrinsics.j(it, "it");
        this.$continuation.resumeWith(Result.b(it));
    }
}
