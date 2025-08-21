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
public final class MapUpdaterKt$MapUpdater$1$2$15 implements Function2<MapPropertiesNode, Integer, Unit> {
    final /* synthetic */ C4110c $map;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Integer num) {
        invoke2(mapPropertiesNode, num);
        return Unit.f143329a;
    }

    public MapUpdaterKt$MapUpdater$1$2$15(C4110c c4110c) {
        this.$map = c4110c;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode set, Integer num) {
        Intrinsics.j(set, "$this$set");
        if (num != null) {
            this.$map.t(num.intValue());
        }
    }
}
