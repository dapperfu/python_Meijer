package com.google.maps.android.compose;

import Md.C4110c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class MapClickListenersKt$MapClickListenerUpdater$1$10$1$1 extends FunctionReferenceImpl implements Function2<C4110c, C4110c.r, Unit> {
    public static final MapClickListenersKt$MapClickListenerUpdater$1$10$1$1 INSTANCE = new MapClickListenersKt$MapClickListenerUpdater$1$10$1$1();

    MapClickListenersKt$MapClickListenerUpdater$1$10$1$1() {
        super(2, C4110c.class, "setOnMyLocationButtonClickListener", "setOnMyLocationButtonClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C4110c c4110c, C4110c.r rVar) {
        invoke2(c4110c, rVar);
        return Unit.f143329a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C4110c p02, C4110c.r rVar) {
        Intrinsics.j(p02, "p0");
        p02.O(rVar);
    }
}
