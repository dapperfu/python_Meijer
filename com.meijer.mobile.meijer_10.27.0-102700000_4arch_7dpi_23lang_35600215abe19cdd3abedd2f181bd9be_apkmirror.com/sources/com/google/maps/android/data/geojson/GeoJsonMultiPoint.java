package com.google.maps.android.data.geojson;

import com.google.maps.android.data.Geometry;
import com.google.maps.android.data.MultiGeometry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class GeoJsonMultiPoint extends MultiGeometry {
    public GeoJsonMultiPoint(List<GeoJsonPoint> list) {
        super(list);
        setGeometryType("MultiPoint");
    }

    public List<GeoJsonPoint> getPoints() {
        List<Geometry> geometryObject = getGeometryObject();
        ArrayList arrayList = new ArrayList();
        Iterator<Geometry> it = geometryObject.iterator();
        while (it.hasNext()) {
            arrayList.add((GeoJsonPoint) it.next());
        }
        return arrayList;
    }

    public String getType() {
        return getGeometryType();
    }
}
