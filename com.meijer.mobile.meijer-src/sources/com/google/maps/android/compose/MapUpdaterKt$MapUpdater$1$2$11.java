package com.google.maps.android.compose;

import Md.C4110c;
import Od.C4465m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapUpdaterKt$MapUpdater$1$2$11 implements Function2<MapPropertiesNode, C4465m, Unit> {
    final /* synthetic */ C4110c $map;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, C4465m c4465m) {
        invoke2(mapPropertiesNode, c4465m);
        return Unit.f143329a;
    }

    public MapUpdaterKt$MapUpdater$1$2$11(C4110c c4110c) {
        this.$map = c4110c;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode set, C4465m c4465m) {
        Intrinsics.j(set, "$this$set");
        this.$map.u(c4465m);
    }
}
