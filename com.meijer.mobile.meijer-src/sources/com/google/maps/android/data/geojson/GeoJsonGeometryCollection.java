package com.google.maps.android.data.geojson;

import com.google.maps.android.data.Geometry;
import com.google.maps.android.data.MultiGeometry;
import java.util.List;

/* loaded from: classes8.dex */
public class GeoJsonGeometryCollection extends MultiGeometry {
    public GeoJsonGeometryCollection(List<Geometry> list) {
        super(list);
        setGeometryType("GeometryCollection");
    }

    public List<Geometry> getGeometries() {
        return getGeometryObject();
    }

    public String getType() {
        return getGeometryType();
    }
}
