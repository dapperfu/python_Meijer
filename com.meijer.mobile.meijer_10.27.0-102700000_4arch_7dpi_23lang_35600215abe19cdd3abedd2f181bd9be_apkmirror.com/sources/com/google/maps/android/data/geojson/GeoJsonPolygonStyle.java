package com.google.maps.android.data.geojson;

import Md.C4190p;
import Md.C4193t;
import com.google.maps.android.data.Style;
import com.google.maps.android.data.kml.KmlPolygon;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class GeoJsonPolygonStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {KmlPolygon.GEOMETRY_TYPE, "MultiPolygon", "GeometryCollection"};

    public int getFillColor() {
        return this.mPolygonOptions.W0();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public int getStrokeColor() {
        return this.mPolygonOptions.g1();
    }

    public int getStrokeJointType() {
        return this.mPolygonOptions.i1();
    }

    public List<C4190p> getStrokePattern() {
        return this.mPolygonOptions.P1();
    }

    public float getStrokeWidth() {
        return this.mPolygonOptions.a2();
    }

    public float getZIndex() {
        return this.mPolygonOptions.b2();
    }

    public boolean isClickable() {
        return this.mPolygonOptions.d2();
    }

    public boolean isGeodesic() {
        return this.mPolygonOptions.l2();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolygonOptions.J2();
    }

    public void setClickable(boolean z10) {
        this.mPolygonOptions.c0(z10);
        styleChanged();
    }

    public void setGeodesic(boolean z10) {
        this.mPolygonOptions.K0(z10);
        styleChanged();
    }

    public void setStrokeColor(int i10) {
        this.mPolygonOptions.M2(i10);
        styleChanged();
    }

    public void setStrokeJointType(int i10) {
        this.mPolygonOptions.O2(i10);
        styleChanged();
    }

    public void setStrokePattern(List<C4190p> list) {
        this.mPolygonOptions.T2(list);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z10) {
        this.mPolygonOptions.B3(z10);
        styleChanged();
    }

    public void setZIndex(float f10) {
        this.mPolygonOptions.U3(f10);
        styleChanged();
    }

    public C4193t toPolygonOptions() {
        C4193t c4193t = new C4193t();
        c4193t.q0(this.mPolygonOptions.W0());
        c4193t.K0(this.mPolygonOptions.l2());
        c4193t.M2(this.mPolygonOptions.g1());
        c4193t.O2(this.mPolygonOptions.i1());
        c4193t.T2(this.mPolygonOptions.P1());
        c4193t.W2(this.mPolygonOptions.a2());
        c4193t.B3(this.mPolygonOptions.J2());
        c4193t.U3(this.mPolygonOptions.b2());
        c4193t.c0(this.mPolygonOptions.d2());
        return c4193t;
    }

    public String toString() {
        return "PolygonStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n fill color=" + getFillColor() + ",\n geodesic=" + isGeodesic() + ",\n stroke color=" + getStrokeColor() + ",\n stroke joint type=" + getStrokeJointType() + ",\n stroke pattern=" + getStrokePattern() + ",\n stroke width=" + getStrokeWidth() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + ",\n clickable=" + isClickable() + "\n}\n";
    }

    public GeoJsonPolygonStyle() {
        C4193t c4193t = new C4193t();
        this.mPolygonOptions = c4193t;
        c4193t.c0(true);
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public void setFillColor(int i10) {
        setPolygonFillColor(i10);
        styleChanged();
    }

    public void setStrokeWidth(float f10) {
        setPolygonStrokeWidth(f10);
        styleChanged();
    }
}
