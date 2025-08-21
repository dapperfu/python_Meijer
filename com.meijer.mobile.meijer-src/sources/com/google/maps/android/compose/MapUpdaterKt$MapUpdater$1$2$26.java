package com.google.maps.android.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapUpdaterKt$MapUpdater$1$2$26 implements Function2<MapPropertiesNode, CameraPositionState, Unit> {
    public static final MapUpdaterKt$MapUpdater$1$2$26 INSTANCE = new MapUpdaterKt$MapUpdater$1$2$26();

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, CameraPositionState cameraPositionState) {
        invoke2(mapPropertiesNode, cameraPositionState);
        return Unit.f143329a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode update, CameraPositionState it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setCameraPositionState(it);
    }
}
