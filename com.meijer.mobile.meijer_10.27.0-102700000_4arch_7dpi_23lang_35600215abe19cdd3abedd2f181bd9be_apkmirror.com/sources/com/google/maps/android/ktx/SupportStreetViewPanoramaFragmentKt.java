package com.google.maps.android.ktx;

import Kd.C3954l;
import com.google.android.gms.maps.SupportStreetViewPanoramaFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.InlineMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;", "LKd/l;", "awaitStreetViewPanorama", "(Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SupportStreetViewPanoramaFragmentKt {
    private static final Object awaitStreetViewPanorama$$forInline(SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment, Continuation<? super C3954l> continuation) {
        InlineMarker.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        supportStreetViewPanoramaFragment.r0(new SupportStreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1(safeContinuation));
        Unit unit = Unit.f142422a;
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return objB;
    }

    public static final Object awaitStreetViewPanorama(SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment, Continuation<? super C3954l> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        supportStreetViewPanoramaFragment.r0(new SupportStreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1(safeContinuation));
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB;
    }
}
