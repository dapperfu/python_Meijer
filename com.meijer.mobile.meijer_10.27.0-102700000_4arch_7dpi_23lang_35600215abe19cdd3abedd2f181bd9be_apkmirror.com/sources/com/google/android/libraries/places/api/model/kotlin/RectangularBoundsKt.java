package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.RectangularBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"rectangularBounds", "Lcom/google/android/libraries/places/api/model/RectangularBounds;", "bounds", "Lcom/google/android/gms/maps/model/LatLngBounds;", "southwest", "Lcom/google/android/gms/maps/model/LatLng;", "northeast", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RectangularBoundsKt {
    public static final RectangularBounds rectangularBounds(@RecentlyNonNull LatLng southwest, @RecentlyNonNull LatLng northeast) {
        Intrinsics.j(southwest, "southwest");
        Intrinsics.j(northeast, "northeast");
        RectangularBounds rectangularBoundsNewInstance = RectangularBounds.newInstance(southwest, northeast);
        Intrinsics.i(rectangularBoundsNewInstance, "newInstance(...)");
        return rectangularBoundsNewInstance;
    }

    public static final RectangularBounds rectangularBounds(@RecentlyNonNull LatLngBounds bounds) {
        Intrinsics.j(bounds, "bounds");
        RectangularBounds rectangularBoundsNewInstance = RectangularBounds.newInstance(bounds);
        Intrinsics.i(rectangularBoundsNewInstance, "newInstance(...)");
        return rectangularBoundsNewInstance;
    }
}
