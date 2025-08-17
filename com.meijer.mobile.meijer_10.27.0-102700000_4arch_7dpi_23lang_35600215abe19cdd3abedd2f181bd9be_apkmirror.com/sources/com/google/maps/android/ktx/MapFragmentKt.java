package com.google.maps.android.ktx;

import Kd.C3945c;
import com.google.android.gms.maps.MapFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/maps/MapFragment;", "LKd/c;", "awaitMap", "(Lcom/google/android/gms/maps/MapFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapFragmentKt {
    private static final Object awaitMap$$forInline(MapFragment mapFragment, Continuation<? super C3945c> continuation) {
        InlineMarker.c(0);
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        mapFragment.a(new MapFragmentKt$awaitMap$2$1(c16658p));
        Unit unit = Unit.f142422a;
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return objV;
    }

    public static final Object awaitMap(MapFragment mapFragment, Continuation<? super C3945c> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        mapFragment.a(new MapFragmentKt$awaitMap$2$1(c16658p));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }
}
