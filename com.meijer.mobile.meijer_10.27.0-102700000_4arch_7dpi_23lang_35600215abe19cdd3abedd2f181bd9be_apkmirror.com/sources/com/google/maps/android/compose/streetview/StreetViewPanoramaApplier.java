package com.google.maps.android.compose.streetview;

import Kd.C3954l;
import androidx.compose.runtime.AbstractC5694a;
import com.google.maps.android.compose.MapNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaApplier;", "Landroidx/compose/runtime/a;", "Lcom/google/maps/android/compose/MapNode;", "LKd/l;", "streetViewPanorama", "<init>", "(LKd/l;)V", "", "onClear", "()V", "", "index", "instance", "insertBottomUp", "(ILcom/google/maps/android/compose/MapNode;)V", "insertTopDown", "from", "to", "count", "move", "(III)V", "remove", "(II)V", "LKd/l;", "getStreetViewPanorama", "()LKd/l;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StreetViewPanoramaApplier extends AbstractC5694a<MapNode> {
    public static final int $stable = 8;
    private final C3954l streetViewPanorama;

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void apply(Function2 function2, Object obj) {
        super.apply(function2, obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, MapNode instance) {
        Intrinsics.j(instance, "instance");
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to2, int count) {
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void onBeginChanges() {
        super.onBeginChanges();
    }

    @Override // androidx.compose.runtime.AbstractC5694a
    protected void onClear() {
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void onEndChanges() {
        super.onEndChanges();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void reuse() {
        super.reuse();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewPanoramaApplier(C3954l streetViewPanorama) {
        super(StreetViewPanoramaNodeRoot.INSTANCE);
        Intrinsics.j(streetViewPanorama, "streetViewPanorama");
        this.streetViewPanorama = streetViewPanorama;
    }

    public final C3954l getStreetViewPanorama() {
        return this.streetViewPanorama;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, MapNode instance) {
        Intrinsics.j(instance, "instance");
        instance.onAttached();
    }
}
