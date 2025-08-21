package com.google.maps.android.compose;

import android.location.Location;
import androidx.compose.runtime.InterfaceC5872l0;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bRG\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RG\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R;\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR;\u0010%\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fRG\u0010*\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0007\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014RG\u0010/\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0007\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014¨\u00060"}, d2 = {"Lcom/google/maps/android/compose/MapClickListeners;", "", "<init>", "()V", "Lcom/google/maps/android/compose/IndoorStateChangeListener;", "<set-?>", "indoorStateChangeListener$delegate", "Landroidx/compose/runtime/l0;", "getIndoorStateChangeListener", "()Lcom/google/maps/android/compose/IndoorStateChangeListener;", "setIndoorStateChangeListener", "(Lcom/google/maps/android/compose/IndoorStateChangeListener;)V", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "", "onMapClick$delegate", "getOnMapClick", "()Lkotlin/jvm/functions/Function1;", "setOnMapClick", "(Lkotlin/jvm/functions/Function1;)V", "onMapClick", "onMapLongClick$delegate", "getOnMapLongClick", "setOnMapLongClick", "onMapLongClick", "Lkotlin/Function0;", "onMapLoaded$delegate", "getOnMapLoaded", "()Lkotlin/jvm/functions/Function0;", "setOnMapLoaded", "(Lkotlin/jvm/functions/Function0;)V", "onMapLoaded", "", "onMyLocationButtonClick$delegate", "getOnMyLocationButtonClick", "setOnMyLocationButtonClick", "onMyLocationButtonClick", "Landroid/location/Location;", "onMyLocationClick$delegate", "getOnMyLocationClick", "setOnMyLocationClick", "onMyLocationClick", "LOd/r;", "onPOIClick$delegate", "getOnPOIClick", "setOnPOIClick", "onPOIClick", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapClickListeners {
    public static final int $stable = 0;

    /* renamed from: indoorStateChangeListener$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 indoorStateChangeListener = androidx.compose.runtime.t1.e(DefaultIndoorStateChangeListener.INSTANCE, null, 2, null);

    /* renamed from: onMapClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 onMapClick = androidx.compose.runtime.t1.e(null, null, 2, null);

    /* renamed from: onMapLongClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 onMapLongClick = androidx.compose.runtime.t1.e(null, null, 2, null);

    /* renamed from: onMapLoaded$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 onMapLoaded = androidx.compose.runtime.t1.e(null, null, 2, null);

    /* renamed from: onMyLocationButtonClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 onMyLocationButtonClick = androidx.compose.runtime.t1.e(null, null, 2, null);

    /* renamed from: onMyLocationClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 onMyLocationClick = androidx.compose.runtime.t1.e(null, null, 2, null);

    /* renamed from: onPOIClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 onPOIClick = androidx.compose.runtime.t1.e(null, null, 2, null);

    public final IndoorStateChangeListener getIndoorStateChangeListener() {
        return (IndoorStateChangeListener) this.indoorStateChangeListener.getValue();
    }

    public final Function1<LatLng, Unit> getOnMapClick() {
        return (Function1) this.onMapClick.getValue();
    }

    public final Function0<Unit> getOnMapLoaded() {
        return (Function0) this.onMapLoaded.getValue();
    }

    public final Function1<LatLng, Unit> getOnMapLongClick() {
        return (Function1) this.onMapLongClick.getValue();
    }

    public final Function0<Boolean> getOnMyLocationButtonClick() {
        return (Function0) this.onMyLocationButtonClick.getValue();
    }

    public final Function1<Location, Unit> getOnMyLocationClick() {
        return (Function1) this.onMyLocationClick.getValue();
    }

    public final Function1<Od.r, Unit> getOnPOIClick() {
        return (Function1) this.onPOIClick.getValue();
    }

    public final void setIndoorStateChangeListener(IndoorStateChangeListener indoorStateChangeListener) {
        Intrinsics.j(indoorStateChangeListener, "<set-?>");
        this.indoorStateChangeListener.setValue(indoorStateChangeListener);
    }

    public final void setOnMapClick(Function1<? super LatLng, Unit> function1) {
        this.onMapClick.setValue(function1);
    }

    public final void setOnMapLoaded(Function0<Unit> function0) {
        this.onMapLoaded.setValue(function0);
    }

    public final void setOnMapLongClick(Function1<? super LatLng, Unit> function1) {
        this.onMapLongClick.setValue(function1);
    }

    public final void setOnMyLocationButtonClick(Function0<Boolean> function0) {
        this.onMyLocationButtonClick.setValue(function0);
    }

    public final void setOnMyLocationClick(Function1<? super Location, Unit> function1) {
        this.onMyLocationClick.setValue(function1);
    }

    public final void setOnPOIClick(Function1<? super Od.r, Unit> function1) {
        this.onPOIClick.setValue(function1);
    }
}
