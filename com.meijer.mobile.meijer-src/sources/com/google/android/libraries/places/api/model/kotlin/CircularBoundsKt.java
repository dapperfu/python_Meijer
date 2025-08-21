package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.CircularBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"circularBounds", "Lcom/google/android/libraries/places/api/model/CircularBounds;", "center", "Lcom/google/android/gms/maps/model/LatLng;", "radius", "", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CircularBoundsKt {
    public static final CircularBounds circularBounds(@RecentlyNonNull LatLng center, double d10) {
        Intrinsics.j(center, "center");
        CircularBounds circularBoundsNewInstance = CircularBounds.newInstance(center, d10);
        Intrinsics.i(circularBoundsNewInstance, "newInstance(...)");
        return circularBoundsNewInstance;
    }
}
