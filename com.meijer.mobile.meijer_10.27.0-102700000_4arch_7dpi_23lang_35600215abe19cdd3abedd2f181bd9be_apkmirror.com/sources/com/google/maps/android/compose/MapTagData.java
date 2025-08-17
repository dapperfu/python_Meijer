package com.google.maps.android.compose;

import android.content.ComponentCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/google/maps/android/compose/MapTagData;", "", "componentCallbacks", "Landroid/content/ComponentCallbacks;", "lifecycleObserver", "Lcom/google/maps/android/compose/MapLifecycleEventObserver;", "<init>", "(Landroid/content/ComponentCallbacks;Lcom/google/maps/android/compose/MapLifecycleEventObserver;)V", "getComponentCallbacks", "()Landroid/content/ComponentCallbacks;", "getLifecycleObserver", "()Lcom/google/maps/android/compose/MapLifecycleEventObserver;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class MapTagData {
    private final ComponentCallbacks componentCallbacks;
    private final MapLifecycleEventObserver lifecycleObserver;

    public static /* synthetic */ MapTagData copy$default(MapTagData mapTagData, ComponentCallbacks componentCallbacks, MapLifecycleEventObserver mapLifecycleEventObserver, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            componentCallbacks = mapTagData.componentCallbacks;
        }
        if ((i10 & 2) != 0) {
            mapLifecycleEventObserver = mapTagData.lifecycleObserver;
        }
        return mapTagData.copy(componentCallbacks, mapLifecycleEventObserver);
    }

    /* renamed from: component1, reason: from getter */
    public final ComponentCallbacks getComponentCallbacks() {
        return this.componentCallbacks;
    }

    /* renamed from: component2, reason: from getter */
    public final MapLifecycleEventObserver getLifecycleObserver() {
        return this.lifecycleObserver;
    }

    public final MapTagData copy(ComponentCallbacks componentCallbacks, MapLifecycleEventObserver lifecycleObserver) {
        Intrinsics.j(componentCallbacks, "componentCallbacks");
        Intrinsics.j(lifecycleObserver, "lifecycleObserver");
        return new MapTagData(componentCallbacks, lifecycleObserver);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapTagData)) {
            return false;
        }
        MapTagData mapTagData = (MapTagData) other;
        return Intrinsics.e(this.componentCallbacks, mapTagData.componentCallbacks) && Intrinsics.e(this.lifecycleObserver, mapTagData.lifecycleObserver);
    }

    public int hashCode() {
        return (this.componentCallbacks.hashCode() * 31) + this.lifecycleObserver.hashCode();
    }

    public String toString() {
        return "MapTagData(componentCallbacks=" + this.componentCallbacks + ", lifecycleObserver=" + this.lifecycleObserver + ')';
    }

    public MapTagData(ComponentCallbacks componentCallbacks, MapLifecycleEventObserver lifecycleObserver) {
        Intrinsics.j(componentCallbacks, "componentCallbacks");
        Intrinsics.j(lifecycleObserver, "lifecycleObserver");
        this.componentCallbacks = componentCallbacks;
        this.lifecycleObserver = lifecycleObserver;
    }

    public final ComponentCallbacks getComponentCallbacks() {
        return this.componentCallbacks;
    }

    public final MapLifecycleEventObserver getLifecycleObserver() {
        return this.lifecycleObserver;
    }
}
