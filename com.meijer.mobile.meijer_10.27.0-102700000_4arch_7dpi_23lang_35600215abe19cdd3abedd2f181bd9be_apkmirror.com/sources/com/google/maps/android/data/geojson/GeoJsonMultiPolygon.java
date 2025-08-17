package com.google.maps.android.data.geojson;

import com.google.maps.android.data.Geometry;
import com.google.maps.android.data.MultiGeometry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class GeoJsonMultiPolygon extends MultiGeometry {
    public GeoJsonMultiPolygon(List<GeoJsonPolygon> list) {
        super(list);
        setGeometryType("MultiPolygon");
    }

    public List<GeoJsonPolygon> getPolygons() {
        List<Geometry> geometryObject = getGeometryObject();
        ArrayList arrayList = new ArrayList();
        Iterator<Geometry> it = geometryObject.iterator();
        while (it.hasNext()) {
            arrayList.add((GeoJsonPolygon) it.next());
        }
        return arrayList;
    }

    public String getType() {
        return getGeometryType();
    }
}
