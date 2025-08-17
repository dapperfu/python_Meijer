package com.google.maps.android.compose;

import Kd.C3945c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapUpdaterKt$MapUpdater$1$1$1 implements Function0<MapPropertiesNode> {
    final /* synthetic */ H1.d $density;
    final /* synthetic */ H1.t $layoutDirection;
    final /* synthetic */ C3945c $map;
    final /* synthetic */ MapUpdaterState $this_with;

    public MapUpdaterKt$MapUpdater$1$1$1(MapUpdaterState mapUpdaterState, C3945c c3945c, H1.d dVar, H1.t tVar) {
        this.$this_with = mapUpdaterState;
        this.$map = c3945c;
        this.$density = dVar;
        this.$layoutDirection = tVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MapPropertiesNode invoke() {
        String contentDescription = this.$this_with.getContentDescription();
        return new MapPropertiesNode(this.$map, this.$this_with.getCameraPositionState(), contentDescription, this.$density, this.$layoutDirection, this.$this_with.getContentPadding());
    }
}
