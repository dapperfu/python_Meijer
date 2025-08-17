package com.google.maps.android.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class MultiGeometry implements Geometry {
    private String geometryType = "MultiGeometry";
    private List<Geometry> mGeometries;

    @Override // com.google.maps.android.data.Geometry
    public List<Geometry> getGeometryObject() {
        return this.mGeometries;
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return this.geometryType;
    }

    public void setGeometryType(String str) {
        this.geometryType = str;
    }

    public String toString() {
        String str = this.geometryType.equals("MultiPoint") ? "LineStrings=" : "Geometries=";
        if (this.geometryType.equals("MultiLineString")) {
            str = "points=";
        }
        if (this.geometryType.equals("MultiPolygon")) {
            str = "Polygons=";
        }
        StringBuilder sb2 = new StringBuilder(getGeometryType());
        sb2.append("{");
        sb2.append("\n " + str);
        sb2.append(getGeometryObject());
        sb2.append("\n}\n");
        return sb2.toString();
    }

    public MultiGeometry(List<? extends Geometry> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Geometry> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            this.mGeometries = arrayList;
            return;
        }
        throw new IllegalArgumentException("Geometries cannot be null");
    }
}
