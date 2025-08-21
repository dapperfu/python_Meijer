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
public final class MapUpdaterKt$MapUpdater$1$2$22 implements Function2<MapPropertiesNode, Boolean, Unit> {
    final /* synthetic */ C4110c $map;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
        invoke(mapPropertiesNode, bool.booleanValue());
        return Unit.f143329a;
    }

    public MapUpdaterKt$MapUpdater$1$2$22(C4110c c4110c) {
        this.$map = c4110c;
    }

    public final void invoke(MapPropertiesNode set, boolean z10) {
        Intrinsics.j(set, "$this$set");
        this.$map.l().g(z10);
    }
}
