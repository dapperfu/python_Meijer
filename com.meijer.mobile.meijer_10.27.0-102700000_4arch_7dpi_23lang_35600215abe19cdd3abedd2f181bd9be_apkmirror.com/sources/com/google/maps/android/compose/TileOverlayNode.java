package com.google.maps.android.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/maps/android/compose/TileOverlayNode;", "Lcom/google/maps/android/compose/MapNode;", "LMd/F;", "tileOverlay", "Lcom/google/maps/android/compose/TileOverlayState;", "tileOverlayState", "Lkotlin/Function1;", "", "onTileOverlayClick", "<init>", "(LMd/F;Lcom/google/maps/android/compose/TileOverlayState;Lkotlin/jvm/functions/Function1;)V", "onAttached", "()V", "onRemoved", "LMd/F;", "getTileOverlay", "()LMd/F;", "setTileOverlay", "(LMd/F;)V", "Lcom/google/maps/android/compose/TileOverlayState;", "getTileOverlayState", "()Lcom/google/maps/android/compose/TileOverlayState;", "setTileOverlayState", "(Lcom/google/maps/android/compose/TileOverlayState;)V", "Lkotlin/jvm/functions/Function1;", "getOnTileOverlayClick", "()Lkotlin/jvm/functions/Function1;", "setOnTileOverlayClick", "(Lkotlin/jvm/functions/Function1;)V", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileOverlayNode implements MapNode {
    private Function1<? super Md.F, Unit> onTileOverlayClick;
    private Md.F tileOverlay;
    private TileOverlayState tileOverlayState;

    public TileOverlayNode(Md.F tileOverlay, TileOverlayState tileOverlayState, Function1<? super Md.F, Unit> onTileOverlayClick) {
        Intrinsics.j(tileOverlay, "tileOverlay");
        Intrinsics.j(tileOverlayState, "tileOverlayState");
        Intrinsics.j(onTileOverlayClick, "onTileOverlayClick");
        this.tileOverlay = tileOverlay;
        this.tileOverlayState = tileOverlayState;
        this.onTileOverlayClick = onTileOverlayClick;
    }

    public final Function1<Md.F, Unit> getOnTileOverlayClick() {
        return this.onTileOverlayClick;
    }

    public final Md.F getTileOverlay() {
        return this.tileOverlay;
    }

    public final TileOverlayState getTileOverlayState() {
        return this.tileOverlayState;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        this.tileOverlayState.setTileOverlay$maps_compose_release(this.tileOverlay);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.tileOverlay.b();
    }

    public final void setOnTileOverlayClick(Function1<? super Md.F, Unit> function1) {
        Intrinsics.j(function1, "<set-?>");
        this.onTileOverlayClick = function1;
    }

    public final void setTileOverlay(Md.F f10) {
        Intrinsics.j(f10, "<set-?>");
        this.tileOverlay = f10;
    }

    public final void setTileOverlayState(TileOverlayState tileOverlayState) {
        Intrinsics.j(tileOverlayState, "<set-?>");
        this.tileOverlayState = tileOverlayState;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        super.onCleared();
    }
}
