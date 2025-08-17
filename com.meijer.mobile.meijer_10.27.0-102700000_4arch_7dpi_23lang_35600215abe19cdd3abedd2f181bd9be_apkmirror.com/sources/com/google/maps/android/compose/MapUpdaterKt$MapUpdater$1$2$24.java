package com.google.maps.android.compose;

import Kd.C3945c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapUpdaterKt$MapUpdater$1$2$24 implements Function2<MapPropertiesNode, Boolean, Unit> {
    final /* synthetic */ C3945c $map;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
        invoke(mapPropertiesNode, bool.booleanValue());
        return Unit.f142422a;
    }

    public MapUpdaterKt$MapUpdater$1$2$24(C3945c c3945c) {
        this.$map = c3945c;
    }

    public final void invoke(MapPropertiesNode set, boolean z10) {
        Intrinsics.j(set, "$this$set");
        this.$map.l().i(z10);
    }
}
