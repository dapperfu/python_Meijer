package com.google.maps.android.data.geojson;

import Od.C4468p;
import Od.C4471t;
import com.google.maps.android.data.Style;
import com.google.maps.android.data.kml.KmlPolygon;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class GeoJsonPolygonStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {KmlPolygon.GEOMETRY_TYPE, "MultiPolygon", "GeometryCollection"};

    public int getFillColor() {
        return this.mPolygonOptions.U0();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public int getStrokeColor() {
        return this.mPolygonOptions.h1();
    }

    public int getStrokeJointType() {
        return this.mPolygonOptions.j1();
    }

    public List<C4468p> getStrokePattern() {
        return this.mPolygonOptions.y1();
    }

    public float getStrokeWidth() {
        return this.mPolygonOptions.P1();
    }

    public float getZIndex() {
        return this.mPolygonOptions.a2();
    }

    public boolean isClickable() {
        return this.mPolygonOptions.c2();
    }

    public boolean isGeodesic() {
        return this.mPolygonOptions.j2();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolygonOptions.H2();
    }

    public void setClickable(boolean z10) {
        this.mPolygonOptions.b0(z10);
        styleChanged();
    }

    public void setGeodesic(boolean z10) {
        this.mPolygonOptions.I0(z10);
        styleChanged();
    }

    public void setStrokeColor(int i10) {
        this.mPolygonOptions.L2(i10);
        styleChanged();
    }

    public void setStrokeJointType(int i10) {
        this.mPolygonOptions.N2(i10);
        styleChanged();
    }

    public void setStrokePattern(List<C4468p> list) {
        this.mPolygonOptions.U2(list);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z10) {
        this.mPolygonOptions.A3(z10);
        styleChanged();
    }

    public void setZIndex(float f10) {
        this.mPolygonOptions.U3(f10);
        styleChanged();
    }

    public C4471t toPolygonOptions() {
        C4471t c4471t = new C4471t();
        c4471t.r0(this.mPolygonOptions.U0());
        c4471t.I0(this.mPolygonOptions.j2());
        c4471t.L2(this.mPolygonOptions.h1());
        c4471t.N2(this.mPolygonOptions.j1());
        c4471t.U2(this.mPolygonOptions.y1());
        c4471t.W2(this.mPolygonOptions.P1());
        c4471t.A3(this.mPolygonOptions.H2());
        c4471t.U3(this.mPolygonOptions.a2());
        c4471t.b0(this.mPolygonOptions.c2());
        return c4471t;
    }

    public String toString() {
        return "PolygonStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n fill color=" + getFillColor() + ",\n geodesic=" + isGeodesic() + ",\n stroke color=" + getStrokeColor() + ",\n stroke joint type=" + getStrokeJointType() + ",\n stroke pattern=" + getStrokePattern() + ",\n stroke width=" + getStrokeWidth() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + ",\n clickable=" + isClickable() + "\n}\n";
    }

    public GeoJsonPolygonStyle() {
        C4471t c4471t = new C4471t();
        this.mPolygonOptions = c4471t;
        c4471t.b0(true);
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
