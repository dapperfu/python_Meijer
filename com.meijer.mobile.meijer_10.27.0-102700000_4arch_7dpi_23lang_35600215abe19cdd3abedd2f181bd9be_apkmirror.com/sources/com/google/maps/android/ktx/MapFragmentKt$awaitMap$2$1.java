package com.google.maps.android.ktx;

import Kd.C3945c;
import Kd.InterfaceC3949g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import qv.InterfaceC16654n;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class MapFragmentKt$awaitMap$2$1 implements InterfaceC3949g {
    final /* synthetic */ InterfaceC16654n<C3945c> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public MapFragmentKt$awaitMap$2$1(InterfaceC16654n<? super C3945c> interfaceC16654n) {
        this.$continuation = interfaceC16654n;
    }

    @Override // Kd.InterfaceC3949g
    public final void onMapReady(C3945c it) {
        Intrinsics.j(it, "it");
        this.$continuation.resumeWith(Result.b(it));
    }
}
