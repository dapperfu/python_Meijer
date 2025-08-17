package com.google.maps.android.compose;

import Kd.C3945c;
import Kd.InterfaceC3946d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapUpdaterKt$MapUpdater$1$2$5 implements Function2<MapPropertiesNode, InterfaceC3946d, Unit> {
    final /* synthetic */ C3945c $map;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, InterfaceC3946d interfaceC3946d) {
        invoke2(mapPropertiesNode, interfaceC3946d);
        return Unit.f142422a;
    }

    public MapUpdaterKt$MapUpdater$1$2$5(C3945c c3945c) {
        this.$map = c3945c;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode set, InterfaceC3946d interfaceC3946d) {
        Intrinsics.j(set, "$this$set");
        this.$map.s(interfaceC3946d);
    }
}
