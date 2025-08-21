package com.google.maps.android.compose;

import Md.C4110c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapUpdaterKt$MapUpdater$1$2$13 implements Function2<MapPropertiesNode, Float, Unit> {
    final /* synthetic */ C4110c $map;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Float f10) {
        invoke(mapPropertiesNode, f10.floatValue());
        return Unit.f143329a;
    }

    public MapUpdaterKt$MapUpdater$1$2$13(C4110c c4110c) {
        this.$map = c4110c;
    }

    public final void invoke(MapPropertiesNode set, float f10) {
        Intrinsics.j(set, "$this$set");
        this.$map.w(f10);
    }
}
