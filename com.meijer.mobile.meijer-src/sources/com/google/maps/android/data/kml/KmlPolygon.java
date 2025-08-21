package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.DataPolygon;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class KmlPolygon implements DataPolygon<ArrayList<ArrayList<LatLng>>> {
    public static final String GEOMETRY_TYPE = "Polygon";
    private final List<List<LatLng>> mInnerBoundaryCoordinates;
    private final List<LatLng> mOuterBoundaryCoordinates;

    @Override // com.google.maps.android.data.Geometry
    public List<List<LatLng>> getGeometryObject() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mOuterBoundaryCoordinates);
        List<List<LatLng>> list = this.mInnerBoundaryCoordinates;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    @Override // com.google.maps.android.data.DataPolygon
    public List<List<LatLng>> getInnerBoundaryCoordinates() {
        return this.mInnerBoundaryCoordinates;
    }

    @Override // com.google.maps.android.data.DataPolygon
    public List<LatLng> getOuterBoundaryCoordinates() {
        return this.mOuterBoundaryCoordinates;
    }

    public String toString() {
        return GEOMETRY_TYPE + "{\n outer coordinates=" + this.mOuterBoundaryCoordinates + ",\n inner coordinates=" + this.mInnerBoundaryCoordinates + "\n}\n";
    }

    public KmlPolygon(List<LatLng> list, List<List<LatLng>> list2) {
        if (list != null) {
            this.mOuterBoundaryCoordinates = list;
            this.mInnerBoundaryCoordinates = list2;
            return;
        }
        throw new IllegalArgumentException("Outer boundary coordinates cannot be null");
    }
}
