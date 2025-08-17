package com.google.maps.android.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapUpdaterKt$MapUpdater$1$2$3 implements Function2<MapPropertiesNode, String, Unit> {
    public static final MapUpdaterKt$MapUpdater$1$2$3 INSTANCE = new MapUpdaterKt$MapUpdater$1$2$3();

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, String str) {
        invoke2(mapPropertiesNode, str);
        return Unit.f142422a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode update, String str) {
        Intrinsics.j(update, "$this$update");
        update.setContentDescription(str);
    }
}
