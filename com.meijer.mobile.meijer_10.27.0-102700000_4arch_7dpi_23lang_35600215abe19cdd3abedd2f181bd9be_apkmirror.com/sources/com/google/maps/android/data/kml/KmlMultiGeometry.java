package com.google.maps.android.data.kml;

import com.google.maps.android.data.Geometry;
import com.google.maps.android.data.MultiGeometry;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class KmlMultiGeometry extends MultiGeometry {
    @Override // com.google.maps.android.data.MultiGeometry
    public String toString() {
        return getGeometryType() + "{\n geometries=" + getGeometryObject() + "\n}\n";
    }

    public KmlMultiGeometry(ArrayList<Geometry> arrayList) {
        super(arrayList);
    }

    @Override // com.google.maps.android.data.MultiGeometry, com.google.maps.android.data.Geometry
    public ArrayList<Geometry> getGeometryObject() {
        return new ArrayList<>(super.getGeometryObject());
    }
}
