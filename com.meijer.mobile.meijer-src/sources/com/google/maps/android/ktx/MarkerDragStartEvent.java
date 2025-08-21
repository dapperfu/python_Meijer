package com.google.maps.android.ktx;

import Od.C4466n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/google/maps/android/ktx/MarkerDragStartEvent;", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "LOd/n;", "marker", "<init>", "(LOd/n;)V", "component1", "()LOd/n;", "copy", "(LOd/n;)Lcom/google/maps/android/ktx/MarkerDragStartEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LOd/n;", "getMarker", "maps-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarkerDragStartEvent extends OnMarkerDragEvent {
    private final C4466n marker;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarkerDragStartEvent) && Intrinsics.e(this.marker, ((MarkerDragStartEvent) other).marker);
    }

    public int hashCode() {
        return this.marker.hashCode();
    }

    public String toString() {
        return "MarkerDragStartEvent(marker=" + this.marker + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkerDragStartEvent(C4466n marker) {
        super(null);
        Intrinsics.j(marker, "marker");
        this.marker = marker;
    }

    public static /* synthetic */ MarkerDragStartEvent copy$default(MarkerDragStartEvent markerDragStartEvent, C4466n c4466n, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4466n = markerDragStartEvent.marker;
        }
        return markerDragStartEvent.copy(c4466n);
    }

    /* renamed from: component1, reason: from getter */
    public final C4466n getMarker() {
        return this.marker;
    }

    public final MarkerDragStartEvent copy(C4466n marker) {
        Intrinsics.j(marker, "marker");
        return new MarkerDragStartEvent(marker);
    }

    @Override // com.google.maps.android.ktx.OnMarkerDragEvent
    public C4466n getMarker() {
        return this.marker;
    }
}
