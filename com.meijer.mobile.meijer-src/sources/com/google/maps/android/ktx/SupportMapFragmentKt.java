package com.google.maps.android.ktx;

import Md.C4110c;
import com.google.android.gms.maps.SupportMapFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15819p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/maps/SupportMapFragment;", "LMd/c;", "awaitMap", "(Lcom/google/android/gms/maps/SupportMapFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SupportMapFragmentKt {
    private static final Object awaitMap$$forInline(SupportMapFragment supportMapFragment, Continuation<? super C4110c> continuation) {
        InlineMarker.c(0);
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        supportMapFragment.u0(new SupportMapFragmentKt$awaitMap$2$1(c15819p));
        Unit unit = Unit.f143329a;
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return objU;
    }

    public static final Object awaitMap(SupportMapFragment supportMapFragment, Continuation<? super C4110c> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        supportMapFragment.u0(new SupportMapFragmentKt$awaitMap$2$1(c15819p));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }
}
