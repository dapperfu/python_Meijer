package com.google.maps.android.compose;

import Kd.C3945c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class MapClickListenersKt$MapClickListenerUpdater$1$14$1$1 extends FunctionReferenceImpl implements Function2<C3945c, C3945c.t, Unit> {
    public static final MapClickListenersKt$MapClickListenerUpdater$1$14$1$1 INSTANCE = new MapClickListenersKt$MapClickListenerUpdater$1$14$1$1();

    MapClickListenersKt$MapClickListenerUpdater$1$14$1$1() {
        super(2, C3945c.class, "setOnPoiClickListener", "setOnPoiClickListener(Lcom/google/android/gms/maps/GoogleMap$OnPoiClickListener;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C3945c c3945c, C3945c.t tVar) {
        invoke2(c3945c, tVar);
        return Unit.f142422a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C3945c p02, C3945c.t tVar) {
        Intrinsics.j(p02, "p0");
        p02.Q(tVar);
    }
}
