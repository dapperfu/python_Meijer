package com.google.maps.android.compose;

import Kd.C3945c;
import Md.C4181g;
import Md.C4184j;
import Md.C4188n;
import Md.C4192s;
import Md.C4194u;
import androidx.compose.runtime.AbstractC5694a;
import com.google.android.gms.maps.MapView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/google/maps/android/compose/MapApplier;", "Landroidx/compose/runtime/a;", "Lcom/google/maps/android/compose/MapNode;", "LKd/c;", "map", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lcom/google/maps/android/compose/MapClickListeners;", "mapClickListeners", "<init>", "(LKd/c;Lcom/google/android/gms/maps/MapView;Lcom/google/maps/android/compose/MapClickListeners;)V", "", "onClear", "()V", "", "index", "instance", "insertBottomUp", "(ILcom/google/maps/android/compose/MapNode;)V", "insertTopDown", "from", "to", "count", "move", "(III)V", "remove", "(II)V", "attachClickListeners$maps_compose_release", "attachClickListeners", "LKd/c;", "getMap", "()LKd/c;", "Lcom/google/android/gms/maps/MapView;", "getMapView$maps_compose_release", "()Lcom/google/android/gms/maps/MapView;", "Lcom/google/maps/android/compose/MapClickListeners;", "getMapClickListeners", "()Lcom/google/maps/android/compose/MapClickListeners;", "", "decorations", "Ljava/util/List;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapApplier extends AbstractC5694a<MapNode> {
    public static final int $stable = 8;
    private final List<MapNode> decorations;
    private final C3945c map;
    private final MapClickListeners mapClickListeners;
    private final MapView mapView;

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void apply(Function2 function2, Object obj) {
        super.apply(function2, obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, MapNode instance) {
        Intrinsics.j(instance, "instance");
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void onBeginChanges() {
        super.onBeginChanges();
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void onEndChanges() {
        super.onEndChanges();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        for (int i10 = 0; i10 < count; i10++) {
            this.decorations.get(index + i10).onRemoved();
        }
        remove(this.decorations, index, count);
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void reuse() {
        super.reuse();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapApplier(C3945c map, MapView mapView, MapClickListeners mapClickListeners) {
        super(MapNodeRoot.INSTANCE);
        Intrinsics.j(map, "map");
        Intrinsics.j(mapView, "mapView");
        Intrinsics.j(mapClickListeners, "mapClickListeners");
        this.map = map;
        this.mapView = mapView;
        this.mapClickListeners = mapClickListeners;
        this.decorations = new ArrayList();
        attachClickListeners$maps_compose_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$13(MapApplier mapApplier, C4192s polygon) {
        Intrinsics.j(polygon, "polygon");
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof PolygonNode) {
                PolygonNode polygonNode = (PolygonNode) mapNode;
                if (Intrinsics.e(polygonNode.getPolygon(), polygon)) {
                    Function1<C4192s, Unit> onPolygonClick = polygonNode.getOnPolygonClick();
                    if (onPolygonClick != null ? Intrinsics.e(onPolygonClick.invoke(polygon), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4192s, Unit> onPolygonClick2 = ((InputHandlerNode) mapNode).getOnPolygonClick();
                if (onPolygonClick2 != null ? Intrinsics.e(onPolygonClick2.invoke(polygon), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$17(MapApplier mapApplier, C4194u polyline) {
        Intrinsics.j(polyline, "polyline");
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof PolylineNode) {
                PolylineNode polylineNode = (PolylineNode) mapNode;
                if (Intrinsics.e(polylineNode.getPolyline(), polyline)) {
                    Function1<C4194u, Unit> onPolylineClick = polylineNode.getOnPolylineClick();
                    if (onPolylineClick != null ? Intrinsics.e(onPolylineClick.invoke(polyline), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4194u, Unit> onPolylineClick2 = ((InputHandlerNode) mapNode).getOnPolylineClick();
                if (onPolylineClick2 != null ? Intrinsics.e(onPolylineClick2.invoke(polyline), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachClickListeners$lambda$21(MapApplier mapApplier, C4188n marker) {
        Intrinsics.j(marker, "marker");
        Iterator<T> it = mapApplier.decorations.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            MapNode mapNode = (MapNode) it.next();
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (Intrinsics.e(markerNode.getMarker(), marker)) {
                    Function1<C4188n, Boolean> onMarkerClick = markerNode.getOnMarkerClick();
                    if (onMarkerClick != null ? Intrinsics.e(onMarkerClick.invoke(marker), Boolean.TRUE) : false) {
                        return true;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4188n, Boolean> onMarkerClick2 = ((InputHandlerNode) mapNode).getOnMarkerClick();
                if (onMarkerClick2 != null ? Intrinsics.e(onMarkerClick2.invoke(marker), Boolean.TRUE) : false) {
                    return true;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$25(MapApplier mapApplier, C4188n marker) {
        Intrinsics.j(marker, "marker");
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (Intrinsics.e(markerNode.getMarker(), marker)) {
                    Function1<C4188n, Unit> onInfoWindowClick = markerNode.getOnInfoWindowClick();
                    if (onInfoWindowClick != null ? Intrinsics.e(onInfoWindowClick.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4188n, Unit> onInfoWindowClick2 = ((InputHandlerNode) mapNode).getOnInfoWindowClick();
                if (onInfoWindowClick2 != null ? Intrinsics.e(onInfoWindowClick2.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$29(MapApplier mapApplier, C4188n marker) {
        Intrinsics.j(marker, "marker");
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (Intrinsics.e(markerNode.getMarker(), marker)) {
                    Function1<C4188n, Unit> onInfoWindowClose = markerNode.getOnInfoWindowClose();
                    if (onInfoWindowClose != null ? Intrinsics.e(onInfoWindowClose.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4188n, Unit> onInfoWindowClose2 = ((InputHandlerNode) mapNode).getOnInfoWindowClose();
                if (onInfoWindowClose2 != null ? Intrinsics.e(onInfoWindowClose2.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$33(MapApplier mapApplier, C4188n marker) {
        Intrinsics.j(marker, "marker");
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (Intrinsics.e(markerNode.getMarker(), marker)) {
                    Function1<C4188n, Unit> onInfoWindowLongClick = markerNode.getOnInfoWindowLongClick();
                    if (onInfoWindowLongClick != null ? Intrinsics.e(onInfoWindowLongClick.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4188n, Unit> onInfoWindowLongClick2 = ((InputHandlerNode) mapNode).getOnInfoWindowLongClick();
                if (onInfoWindowLongClick2 != null ? Intrinsics.e(onInfoWindowLongClick2.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarkerNode attachClickListeners$lambda$35(MapApplier mapApplier, C4188n marker) {
        Object next;
        Intrinsics.j(marker, "marker");
        Iterator<T> it = mapApplier.decorations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MapNode mapNode = (MapNode) next;
            if ((mapNode instanceof MarkerNode) && Intrinsics.e(((MarkerNode) mapNode).getMarker(), marker)) {
                break;
            }
        }
        return (MarkerNode) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$5(MapApplier mapApplier, C4181g circle) {
        Intrinsics.j(circle, "circle");
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof CircleNode) {
                CircleNode circleNode = (CircleNode) mapNode;
                if (Intrinsics.e(circleNode.getCircle(), circle)) {
                    Function1<C4181g, Unit> onCircleClick = circleNode.getOnCircleClick();
                    if (onCircleClick != null ? Intrinsics.e(onCircleClick.invoke(circle), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4181g, Unit> onCircleClick2 = ((InputHandlerNode) mapNode).getOnCircleClick();
                if (onCircleClick2 != null ? Intrinsics.e(onCircleClick2.invoke(circle), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$9(MapApplier mapApplier, C4184j groundOverlay) {
        Intrinsics.j(groundOverlay, "groundOverlay");
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof GroundOverlayNode) {
                GroundOverlayNode groundOverlayNode = (GroundOverlayNode) mapNode;
                if (Intrinsics.e(groundOverlayNode.getGroundOverlay(), groundOverlay)) {
                    Function1<C4184j, Unit> onGroundOverlayClick = groundOverlayNode.getOnGroundOverlayClick();
                    if (onGroundOverlayClick != null ? Intrinsics.e(onGroundOverlayClick.invoke(groundOverlay), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1<C4184j, Unit> onGroundOverlayClick2 = ((InputHandlerNode) mapNode).getOnGroundOverlayClick();
                if (onGroundOverlayClick2 != null ? Intrinsics.e(onGroundOverlayClick2.invoke(groundOverlay), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    public final void attachClickListeners$maps_compose_release() {
        this.map.D(new C3945c.g() { // from class: com.google.maps.android.compose.f0
            @Override // Kd.C3945c.g
            public final void onCircleClick(C4181g c4181g) {
                MapApplier.attachClickListeners$lambda$5(this.f90112a, c4181g);
            }
        });
        this.map.E(new C3945c.h() { // from class: com.google.maps.android.compose.g0
            @Override // Kd.C3945c.h
            public final void onGroundOverlayClick(C4184j c4184j) {
                MapApplier.attachClickListeners$lambda$9(this.f90121a, c4184j);
            }
        });
        this.map.R(new C3945c.u() { // from class: com.google.maps.android.compose.h0
            @Override // Kd.C3945c.u
            public final void onPolygonClick(C4192s c4192s) {
                MapApplier.attachClickListeners$lambda$13(this.f90147a, c4192s);
            }
        });
        this.map.S(new C3945c.v() { // from class: com.google.maps.android.compose.i0
            @Override // Kd.C3945c.v
            public final void onPolylineClick(C4194u c4194u) {
                MapApplier.attachClickListeners$lambda$17(this.f90154a, c4194u);
            }
        });
        this.map.M(new C3945c.p() { // from class: com.google.maps.android.compose.j0
            @Override // Kd.C3945c.p
            public final boolean onMarkerClick(C4188n c4188n) {
                return MapApplier.attachClickListeners$lambda$21(this.f90169a, c4188n);
            }
        });
        this.map.G(new C3945c.j() { // from class: com.google.maps.android.compose.k0
            @Override // Kd.C3945c.j
            public final void onInfoWindowClick(C4188n c4188n) {
                MapApplier.attachClickListeners$lambda$25(this.f90205a, c4188n);
            }
        });
        this.map.H(new C3945c.k() { // from class: com.google.maps.android.compose.l0
            @Override // Kd.C3945c.k
            public final void a(C4188n c4188n) {
                MapApplier.attachClickListeners$lambda$29(this.f90206a, c4188n);
            }
        });
        this.map.I(new C3945c.l() { // from class: com.google.maps.android.compose.m0
            @Override // Kd.C3945c.l
            public final void onInfoWindowLongClick(C4188n c4188n) {
                MapApplier.attachClickListeners$lambda$33(this.f90207a, c4188n);
            }
        });
        this.map.N(new MapApplier$attachClickListeners$9(this));
        this.map.q(new ComposeInfoWindowAdapter(this.mapView, new Function1() { // from class: com.google.maps.android.compose.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MapApplier.attachClickListeners$lambda$35(this.f90230a, (C4188n) obj);
            }
        }));
    }

    public final C3945c getMap() {
        return this.map;
    }

    public final MapClickListeners getMapClickListeners() {
        return this.mapClickListeners;
    }

    /* renamed from: getMapView$maps_compose_release, reason: from getter */
    public final MapView getMapView() {
        return this.mapView;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, MapNode instance) {
        Intrinsics.j(instance, "instance");
        this.decorations.add(index, instance);
        instance.onAttached();
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to2, int count) {
        move(this.decorations, from, to2, count);
    }

    @Override // androidx.compose.runtime.AbstractC5694a
    protected void onClear() {
        this.map.i();
        Iterator<T> it = this.decorations.iterator();
        while (it.hasNext()) {
            ((MapNode) it.next()).onCleared();
        }
        this.decorations.clear();
    }
}
