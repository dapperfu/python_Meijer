package com.google.maps.android.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapUpdaterKt$MapUpdater$1$2$2 implements Function2<MapPropertiesNode, H1.t, Unit> {
    public static final MapUpdaterKt$MapUpdater$1$2$2 INSTANCE = new MapUpdaterKt$MapUpdater$1$2$2();

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, H1.t tVar) {
        invoke2(mapPropertiesNode, tVar);
        return Unit.f142422a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode update, H1.t it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setLayoutDirection(it);
    }
}
