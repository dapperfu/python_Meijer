package com.google.maps.android.ktx;

import Md.C4110c;
import Md.InterfaceC4114g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC15815n;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class SupportMapFragmentKt$awaitMap$2$1 implements InterfaceC4114g {
    final /* synthetic */ InterfaceC15815n<C4110c> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public SupportMapFragmentKt$awaitMap$2$1(InterfaceC15815n<? super C4110c> interfaceC15815n) {
        this.$continuation = interfaceC15815n;
    }

    @Override // Md.InterfaceC4114g
    public final void onMapReady(C4110c it) {
        Intrinsics.j(it, "it");
        this.$continuation.resumeWith(Result.b(it));
    }
}
