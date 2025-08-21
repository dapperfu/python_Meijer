package com.google.maps.android.compose;

import Od.C4466n;
import androidx.compose.runtime.InterfaceC5872l0;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R+\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00108F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R1\u0010\u001d\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0017\u0010\f\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR(\u0010&\u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/google/maps/android/compose/MarkerState;", "", "Lcom/google/android/gms/maps/model/LatLng;", "position", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "", "showInfoWindow", "()V", "hideInfoWindow", "<set-?>", "position$delegate", "Landroidx/compose/runtime/l0;", "getPosition", "()Lcom/google/android/gms/maps/model/LatLng;", "setPosition", "", "isDragging$delegate", "isDragging", "()Z", "setDragging$maps_compose_release", "(Z)V", "Lcom/google/maps/android/compose/DragState;", "dragState$delegate", "getDragState", "()Lcom/google/maps/android/compose/DragState;", "setDragState$maps_compose_release", "(Lcom/google/maps/android/compose/DragState;)V", "getDragState$annotations", "dragState", "Landroidx/compose/runtime/l0;", "LOd/n;", "markerState", "value", "getMarker$maps_compose_release", "()LOd/n;", "setMarker$maps_compose_release", "(LOd/n;)V", "marker", "Companion", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarkerState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final L0.k<MarkerState, LatLng> Saver = L0.l.a(new Function2() { // from class: com.google.maps.android.compose.p2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return MarkerState.Saver$lambda$0((L0.m) obj, (MarkerState) obj2);
        }
    }, new Function1() { // from class: com.google.maps.android.compose.q2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MarkerState.Saver$lambda$1((LatLng) obj);
        }
    });

    /* renamed from: dragState$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 dragState;

    /* renamed from: isDragging$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 isDragging;
    private final InterfaceC5872l0<C4466n> markerState;

    /* renamed from: position$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 position;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/MarkerState$Companion;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/LatLng;", "position", "Lcom/google/maps/android/compose/MarkerState;", "invoke", "(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/compose/MarkerState;", "LL0/k;", "Saver", "LL0/k;", "getSaver", "()LL0/k;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ MarkerState invoke$default(Companion companion, LatLng latLng, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                latLng = new LatLng(0.0d, 0.0d);
            }
            return companion.invoke(latLng);
        }

        public final MarkerState invoke(LatLng position) {
            Intrinsics.j(position, "position");
            return new MarkerState(position, null);
        }

        public final L0.k<MarkerState, LatLng> getSaver() {
            return MarkerState.Saver;
        }
    }

    public /* synthetic */ MarkerState(LatLng latLng, DefaultConstructorMarker defaultConstructorMarker) {
        this(latLng);
    }

    @Deprecated
    public static /* synthetic */ void getDragState$annotations() {
    }

    private MarkerState(LatLng latLng) {
        this.position = androidx.compose.runtime.t1.e(latLng, null, 2, null);
        this.isDragging = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
        this.dragState = androidx.compose.runtime.t1.e(DragState.END, null, 2, null);
        this.markerState = androidx.compose.runtime.t1.e(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LatLng Saver$lambda$0(L0.m Saver2, MarkerState it) {
        Intrinsics.j(Saver2, "$this$Saver");
        Intrinsics.j(it, "it");
        return it.getPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarkerState Saver$lambda$1(LatLng it) {
        Intrinsics.j(it, "it");
        return new MarkerState(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DragState getDragState() {
        return (DragState) this.dragState.getValue();
    }

    public final C4466n getMarker$maps_compose_release() {
        return this.markerState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LatLng getPosition() {
        return (LatLng) this.position.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }

    public final void setDragState$maps_compose_release(DragState dragState) {
        Intrinsics.j(dragState, "<set-?>");
        this.dragState.setValue(dragState);
    }

    public final void setDragging$maps_compose_release(boolean z10) {
        this.isDragging.setValue(Boolean.valueOf(z10));
    }

    public final void setMarker$maps_compose_release(C4466n c4466n) {
        if (this.markerState.getValue() == null && c4466n == null) {
            return;
        }
        if (this.markerState.getValue() != null && c4466n != null) {
            throw new IllegalStateException("MarkerState may only be associated with one Marker at a time.");
        }
        this.markerState.setValue(c4466n);
    }

    public final void setPosition(LatLng latLng) {
        Intrinsics.j(latLng, "<set-?>");
        this.position.setValue(latLng);
    }

    public final void hideInfoWindow() {
        C4466n marker$maps_compose_release = getMarker$maps_compose_release();
        if (marker$maps_compose_release != null) {
            marker$maps_compose_release.e();
        }
    }

    public final void showInfoWindow() {
        C4466n marker$maps_compose_release = getMarker$maps_compose_release();
        if (marker$maps_compose_release != null) {
            marker$maps_compose_release.u();
        }
    }
}
