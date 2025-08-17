package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.DataPolygon;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class GeoJsonPolygon implements DataPolygon {
    private static final String GEOMETRY_TYPE = "Polygon";
    private static final int POLYGON_INNER_COORDINATE_INDEX = 1;
    private static final int POLYGON_OUTER_COORDINATE_INDEX = 0;
    private final List<? extends List<LatLng>> mCoordinates;

    public List<? extends List<LatLng>> getCoordinates() {
        return this.mCoordinates;
    }

    @Override // com.google.maps.android.data.Geometry
    public List<? extends List<LatLng>> getGeometryObject() {
        return getCoordinates();
    }

    @Override // com.google.maps.android.data.DataPolygon
    public ArrayList<ArrayList<LatLng>> getInnerBoundaryCoordinates() {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i10 = 1; i10 < getCoordinates().size(); i10++) {
            arrayList.add((ArrayList) getCoordinates().get(i10));
        }
        return arrayList;
    }

    @Override // com.google.maps.android.data.DataPolygon
    public ArrayList<LatLng> getOuterBoundaryCoordinates() {
        return (ArrayList) getCoordinates().get(0);
    }

    public String getType() {
        return "Polygon";
    }

    public String toString() {
        return "Polygon{\n coordinates=" + this.mCoordinates + "\n}\n";
    }

    public GeoJsonPolygon(List<? extends List<LatLng>> list) {
        if (list != null) {
            this.mCoordinates = list;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return getType();
    }
}
