package com.google.maps.android.compose;

import Kd.C3945c;
import Md.C4188n;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/google/maps/android/compose/MapApplier$attachClickListeners$9", "LKd/c$q;", "LMd/n;", "marker", "", "onMarkerDragStart", "(LMd/n;)V", "onMarkerDrag", "onMarkerDragEnd", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapApplier$attachClickListeners$9 implements C3945c.q {
    final /* synthetic */ MapApplier this$0;

    MapApplier$attachClickListeners$9(MapApplier mapApplier) {
        this.this$0 = mapApplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMarkerDrag$lambda$6$lambda$5(MarkerNode markerNode, C4188n it) {
        Intrinsics.j(it, "it");
        LatLng latLngB = it.b();
        Intrinsics.i(latLngB, "getPosition(...)");
        markerNode.getMarkerState().setDragging$maps_compose_release(true);
        markerNode.getMarkerState().setPosition(latLngB);
        markerNode.getMarkerState().setDragState$maps_compose_release(DragState.DRAG);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMarkerDragEnd$lambda$10$lambda$9(MarkerNode markerNode, C4188n it) {
        Intrinsics.j(it, "it");
        LatLng latLngB = it.b();
        Intrinsics.i(latLngB, "getPosition(...)");
        markerNode.getMarkerState().setDragging$maps_compose_release(true);
        markerNode.getMarkerState().setPosition(latLngB);
        markerNode.getMarkerState().setDragging$maps_compose_release(false);
        markerNode.getMarkerState().setDragState$maps_compose_release(DragState.END);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMarkerDragStart$lambda$2$lambda$1(MarkerNode markerNode, C4188n it) {
        Intrinsics.j(it, "it");
        LatLng latLngB = it.b();
        Intrinsics.i(latLngB, "getPosition(...)");
        markerNode.getMarkerState().setDragging$maps_compose_release(true);
        markerNode.getMarkerState().setPosition(latLngB);
        markerNode.getMarkerState().setDragState$maps_compose_release(DragState.START);
        return Unit.f142422a;
    }

    @Override // Kd.C3945c.q
    public void onMarkerDrag(C4188n marker) {
        Intrinsics.j(marker, "marker");
        for (MapNode mapNode : this.this$0.decorations) {
            if (mapNode instanceof MarkerNode) {
                final MarkerNode markerNode = (MarkerNode) mapNode;
                if (Intrinsics.e(markerNode.getMarker(), marker)) {
                    if (Intrinsics.e(new Function1() { // from class: com.google.maps.android.compose.o0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MapApplier$attachClickListeners$9.onMarkerDrag$lambda$6$lambda$5(markerNode, (C4188n) obj);
                        }
                    }.invoke(marker), Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4188n, Unit> onMarkerDrag = ((InputHandlerNode) mapNode).getOnMarkerDrag();
                if (onMarkerDrag != null ? Intrinsics.e(onMarkerDrag.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    @Override // Kd.C3945c.q
    public void onMarkerDragEnd(C4188n marker) {
        Intrinsics.j(marker, "marker");
        for (MapNode mapNode : this.this$0.decorations) {
            if (mapNode instanceof MarkerNode) {
                final MarkerNode markerNode = (MarkerNode) mapNode;
                if (Intrinsics.e(markerNode.getMarker(), marker)) {
                    if (Intrinsics.e(new Function1() { // from class: com.google.maps.android.compose.p0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MapApplier$attachClickListeners$9.onMarkerDragEnd$lambda$10$lambda$9(markerNode, (C4188n) obj);
                        }
                    }.invoke(marker), Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4188n, Unit> onMarkerDragEnd = ((InputHandlerNode) mapNode).getOnMarkerDragEnd();
                if (onMarkerDragEnd != null ? Intrinsics.e(onMarkerDragEnd.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    @Override // Kd.C3945c.q
    public void onMarkerDragStart(C4188n marker) {
        Intrinsics.j(marker, "marker");
        for (MapNode mapNode : this.this$0.decorations) {
            if (mapNode instanceof MarkerNode) {
                final MarkerNode markerNode = (MarkerNode) mapNode;
                if (Intrinsics.e(markerNode.getMarker(), marker)) {
                    if (Intrinsics.e(new Function1() { // from class: com.google.maps.android.compose.q0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MapApplier$attachClickListeners$9.onMarkerDragStart$lambda$2$lambda$1(markerNode, (C4188n) obj);
                        }
                    }.invoke(marker), Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4188n, Unit> onMarkerDragStart = ((InputHandlerNode) mapNode).getOnMarkerDragStart();
                if (onMarkerDragStart != null ? Intrinsics.e(onMarkerDragStart.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
