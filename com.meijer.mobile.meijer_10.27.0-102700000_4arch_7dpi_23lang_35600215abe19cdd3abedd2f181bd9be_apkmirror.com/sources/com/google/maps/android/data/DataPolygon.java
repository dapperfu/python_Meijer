package com.google.maps.android.data;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes7.dex */
public interface DataPolygon<T> extends Geometry {
    List<List<LatLng>> getInnerBoundaryCoordinates();

    List<LatLng> getOuterBoundaryCoordinates();
}
