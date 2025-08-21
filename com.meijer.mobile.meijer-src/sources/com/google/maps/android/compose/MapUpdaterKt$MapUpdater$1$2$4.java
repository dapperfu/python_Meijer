package com.google.maps.android.compose;

import Md.C4110c;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapUpdaterKt$MapUpdater$1$2$4 implements Function2<MapPropertiesNode, InterfaceC14882C, Unit> {
    final /* synthetic */ C4110c $map;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, InterfaceC14882C interfaceC14882C) {
        invoke2(mapPropertiesNode, interfaceC14882C);
        return Unit.f143329a;
    }

    public MapUpdaterKt$MapUpdater$1$2$4(C4110c c4110c) {
        this.$map = c4110c;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode update, InterfaceC14882C it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        MapUpdaterKt.applyContentPadding(update, this.$map, it);
    }
}
