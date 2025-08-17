package com.google.maps.android.compose;

import Kd.C3945c;
import j0.InterfaceC14794C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapUpdaterKt$MapUpdater$1$2$4 implements Function2<MapPropertiesNode, InterfaceC14794C, Unit> {
    final /* synthetic */ C3945c $map;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, InterfaceC14794C interfaceC14794C) {
        invoke2(mapPropertiesNode, interfaceC14794C);
        return Unit.f142422a;
    }

    public MapUpdaterKt$MapUpdater$1$2$4(C3945c c3945c) {
        this.$map = c3945c;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode update, InterfaceC14794C it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        MapUpdaterKt.applyContentPadding(update, this.$map, it);
    }
}
