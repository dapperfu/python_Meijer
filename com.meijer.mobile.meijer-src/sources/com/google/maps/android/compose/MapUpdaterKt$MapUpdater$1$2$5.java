package com.google.maps.android.compose;

import Md.C4110c;
import Md.InterfaceC4111d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapUpdaterKt$MapUpdater$1$2$5 implements Function2<MapPropertiesNode, InterfaceC4111d, Unit> {
    final /* synthetic */ C4110c $map;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, InterfaceC4111d interfaceC4111d) {
        invoke2(mapPropertiesNode, interfaceC4111d);
        return Unit.f143329a;
    }

    public MapUpdaterKt$MapUpdater$1$2$5(C4110c c4110c) {
        this.$map = c4110c;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode set, InterfaceC4111d interfaceC4111d) {
        Intrinsics.j(set, "$this$set");
        this.$map.s(interfaceC4111d);
    }
}
