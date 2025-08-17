package com.google.maps.android.compose;

import Md.C4188n;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0001\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010+\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/¨\u00062"}, d2 = {"Lcom/google/maps/android/compose/MarkerNode;", "Lcom/google/maps/android/compose/MapNode;", "Landroidx/compose/runtime/k;", "compositionContext", "LMd/n;", "marker", "Lcom/google/maps/android/compose/MarkerState;", "markerState", "Lkotlin/Function1;", "", "onMarkerClick", "", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "infoWindow", "infoContent", "<init>", "(Landroidx/compose/runtime/k;LMd/n;Lcom/google/maps/android/compose/MarkerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "onAttached", "()V", "onRemoved", "onCleared", "Landroidx/compose/runtime/k;", "getCompositionContext", "()Landroidx/compose/runtime/k;", "LMd/n;", "getMarker", "()LMd/n;", "Lcom/google/maps/android/compose/MarkerState;", "getMarkerState", "()Lcom/google/maps/android/compose/MarkerState;", "Lkotlin/jvm/functions/Function1;", "getOnMarkerClick", "()Lkotlin/jvm/functions/Function1;", "setOnMarkerClick", "(Lkotlin/jvm/functions/Function1;)V", "getOnInfoWindowClick", "setOnInfoWindowClick", "getOnInfoWindowClose", "setOnInfoWindowClose", "getOnInfoWindowLongClick", "setOnInfoWindowLongClick", "Lkotlin/jvm/functions/Function3;", "getInfoWindow", "()Lkotlin/jvm/functions/Function3;", "setInfoWindow", "(Lkotlin/jvm/functions/Function3;)V", "getInfoContent", "setInfoContent", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MarkerNode implements MapNode {
    public static final int $stable = 8;
    private final AbstractC5727k compositionContext;
    private Function3<? super C4188n, ? super Composer, ? super Integer, Unit> infoContent;
    private Function3<? super C4188n, ? super Composer, ? super Integer, Unit> infoWindow;
    private final C4188n marker;
    private final MarkerState markerState;
    private Function1<? super C4188n, Unit> onInfoWindowClick;
    private Function1<? super C4188n, Unit> onInfoWindowClose;
    private Function1<? super C4188n, Unit> onInfoWindowLongClick;
    private Function1<? super C4188n, Boolean> onMarkerClick;

    public MarkerNode(AbstractC5727k compositionContext, C4188n marker, MarkerState markerState, Function1<? super C4188n, Boolean> onMarkerClick, Function1<? super C4188n, Unit> onInfoWindowClick, Function1<? super C4188n, Unit> onInfoWindowClose, Function1<? super C4188n, Unit> onInfoWindowLongClick, Function3<? super C4188n, ? super Composer, ? super Integer, Unit> function3, Function3<? super C4188n, ? super Composer, ? super Integer, Unit> function32) {
        Intrinsics.j(compositionContext, "compositionContext");
        Intrinsics.j(marker, "marker");
        Intrinsics.j(markerState, "markerState");
        Intrinsics.j(onMarkerClick, "onMarkerClick");
        Intrinsics.j(onInfoWindowClick, "onInfoWindowClick");
        Intrinsics.j(onInfoWindowClose, "onInfoWindowClose");
        Intrinsics.j(onInfoWindowLongClick, "onInfoWindowLongClick");
        this.compositionContext = compositionContext;
        this.marker = marker;
        this.markerState = markerState;
        this.onMarkerClick = onMarkerClick;
        this.onInfoWindowClick = onInfoWindowClick;
        this.onInfoWindowClose = onInfoWindowClose;
        this.onInfoWindowLongClick = onInfoWindowLongClick;
        this.infoWindow = function3;
        this.infoContent = function32;
    }

    public final AbstractC5727k getCompositionContext() {
        return this.compositionContext;
    }

    public final Function3<C4188n, Composer, Integer, Unit> getInfoContent() {
        return this.infoContent;
    }

    public final Function3<C4188n, Composer, Integer, Unit> getInfoWindow() {
        return this.infoWindow;
    }

    public final C4188n getMarker() {
        return this.marker;
    }

    public final MarkerState getMarkerState() {
        return this.markerState;
    }

    public final Function1<C4188n, Unit> getOnInfoWindowClick() {
        return this.onInfoWindowClick;
    }

    public final Function1<C4188n, Unit> getOnInfoWindowClose() {
        return this.onInfoWindowClose;
    }

    public final Function1<C4188n, Unit> getOnInfoWindowLongClick() {
        return this.onInfoWindowLongClick;
    }

    public final Function1<C4188n, Boolean> getOnMarkerClick() {
        return this.onMarkerClick;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        this.markerState.setMarker$maps_compose_release(this.marker);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        this.markerState.setMarker$maps_compose_release(null);
        this.marker.g();
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.markerState.setMarker$maps_compose_release(null);
        this.marker.g();
    }

    public final void setInfoContent(Function3<? super C4188n, ? super Composer, ? super Integer, Unit> function3) {
        this.infoContent = function3;
    }

    public final void setInfoWindow(Function3<? super C4188n, ? super Composer, ? super Integer, Unit> function3) {
        this.infoWindow = function3;
    }

    public final void setOnInfoWindowClick(Function1<? super C4188n, Unit> function1) {
        Intrinsics.j(function1, "<set-?>");
        this.onInfoWindowClick = function1;
    }

    public final void setOnInfoWindowClose(Function1<? super C4188n, Unit> function1) {
        Intrinsics.j(function1, "<set-?>");
        this.onInfoWindowClose = function1;
    }

    public final void setOnInfoWindowLongClick(Function1<? super C4188n, Unit> function1) {
        Intrinsics.j(function1, "<set-?>");
        this.onInfoWindowLongClick = function1;
    }

    public final void setOnMarkerClick(Function1<? super C4188n, Boolean> function1) {
        Intrinsics.j(function1, "<set-?>");
        this.onMarkerClick = function1;
    }
}
