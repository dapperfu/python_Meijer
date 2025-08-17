package com.google.maps.android.compose;

import Md.C4194u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/maps/android/compose/PolylineNode;", "Lcom/google/maps/android/compose/MapNode;", "LMd/u;", "polyline", "Lkotlin/Function1;", "", "onPolylineClick", "<init>", "(LMd/u;Lkotlin/jvm/functions/Function1;)V", "onRemoved", "()V", "LMd/u;", "getPolyline", "()LMd/u;", "Lkotlin/jvm/functions/Function1;", "getOnPolylineClick", "()Lkotlin/jvm/functions/Function1;", "setOnPolylineClick", "(Lkotlin/jvm/functions/Function1;)V", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PolylineNode implements MapNode {
    public static final int $stable = 8;
    private Function1<? super C4194u, Unit> onPolylineClick;
    private final C4194u polyline;

    public PolylineNode(C4194u polyline, Function1<? super C4194u, Unit> onPolylineClick) {
        Intrinsics.j(polyline, "polyline");
        Intrinsics.j(onPolylineClick, "onPolylineClick");
        this.polyline = polyline;
        this.onPolylineClick = onPolylineClick;
    }

    public final Function1<C4194u, Unit> getOnPolylineClick() {
        return this.onPolylineClick;
    }

    public final C4194u getPolyline() {
        return this.polyline;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.polyline.a();
    }

    public final void setOnPolylineClick(Function1<? super C4194u, Unit> function1) {
        Intrinsics.j(function1, "<set-?>");
        this.onPolylineClick = function1;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        super.onAttached();
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        super.onCleared();
    }
}
