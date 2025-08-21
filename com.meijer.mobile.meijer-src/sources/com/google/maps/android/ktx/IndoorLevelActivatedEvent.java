package com.google.maps.android.ktx;

import Od.C4464l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/google/maps/android/ktx/IndoorLevelActivatedEvent;", "Lcom/google/maps/android/ktx/IndoorChangeEvent;", "LOd/l;", "building", "<init>", "(LOd/l;)V", "component1", "()LOd/l;", "copy", "(LOd/l;)Lcom/google/maps/android/ktx/IndoorLevelActivatedEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LOd/l;", "getBuilding", "maps-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IndoorLevelActivatedEvent extends IndoorChangeEvent {
    private final C4464l building;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IndoorLevelActivatedEvent) && Intrinsics.e(this.building, ((IndoorLevelActivatedEvent) other).building);
    }

    public int hashCode() {
        return this.building.hashCode();
    }

    public String toString() {
        return "IndoorLevelActivatedEvent(building=" + this.building + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndoorLevelActivatedEvent(C4464l building) {
        super(null);
        Intrinsics.j(building, "building");
        this.building = building;
    }

    public static /* synthetic */ IndoorLevelActivatedEvent copy$default(IndoorLevelActivatedEvent indoorLevelActivatedEvent, C4464l c4464l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4464l = indoorLevelActivatedEvent.building;
        }
        return indoorLevelActivatedEvent.copy(c4464l);
    }

    /* renamed from: component1, reason: from getter */
    public final C4464l getBuilding() {
        return this.building;
    }

    public final IndoorLevelActivatedEvent copy(C4464l building) {
        Intrinsics.j(building, "building");
        return new IndoorLevelActivatedEvent(building);
    }

    public final C4464l getBuilding() {
        return this.building;
    }
}
