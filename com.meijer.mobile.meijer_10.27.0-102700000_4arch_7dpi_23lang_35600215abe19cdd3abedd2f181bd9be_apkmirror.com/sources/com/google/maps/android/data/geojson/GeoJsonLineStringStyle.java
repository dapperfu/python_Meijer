package com.google.maps.android.data.geojson;

import Md.C4190p;
import Md.C4195v;
import com.google.maps.android.data.Style;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class GeoJsonLineStringStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"LineString", "MultiLineString", "GeometryCollection"};

    public int getColor() {
        return this.mPolylineOptions.g1();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public List<C4190p> getPattern() {
        return this.mPolylineOptions.a2();
    }

    public float getWidth() {
        return this.mPolylineOptions.l2();
    }

    public float getZIndex() {
        return this.mPolylineOptions.J2();
    }

    public boolean isClickable() {
        return this.mPolylineOptions.M2();
    }

    public boolean isGeodesic() {
        return this.mPolylineOptions.O2();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolylineOptions.T2();
    }

    public void setClickable(boolean z10) {
        this.mPolylineOptions.q0(z10);
        styleChanged();
    }

    public void setColor(int i10) {
        this.mPolylineOptions.K0(i10);
        styleChanged();
    }

    public void setGeodesic(boolean z10) {
        this.mPolylineOptions.d1(z10);
        styleChanged();
    }

    public void setPattern(List<C4190p> list) {
        this.mPolylineOptions.B3(list);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z10) {
        this.mPolylineOptions.V3(z10);
        styleChanged();
    }

    public void setZIndex(float f10) {
        this.mPolylineOptions.X3(f10);
        styleChanged();
    }

    public C4195v toPolylineOptions() {
        C4195v c4195v = new C4195v();
        c4195v.K0(this.mPolylineOptions.g1());
        c4195v.q0(this.mPolylineOptions.M2());
        c4195v.d1(this.mPolylineOptions.O2());
        c4195v.V3(this.mPolylineOptions.T2());
        c4195v.W3(this.mPolylineOptions.l2());
        c4195v.X3(this.mPolylineOptions.J2());
        c4195v.B3(getPattern());
        return c4195v;
    }

    public String toString() {
        return "LineStringStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n color=" + getColor() + ",\n clickable=" + isClickable() + ",\n geodesic=" + isGeodesic() + ",\n visible=" + isVisible() + ",\n width=" + getWidth() + ",\n z index=" + getZIndex() + ",\n pattern=" + getPattern() + "\n}\n";
    }

    public GeoJsonLineStringStyle() {
        C4195v c4195v = new C4195v();
        this.mPolylineOptions = c4195v;
        c4195v.q0(true);
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public void setWidth(float f10) {
        setLineStringWidth(f10);
        styleChanged();
    }
}
