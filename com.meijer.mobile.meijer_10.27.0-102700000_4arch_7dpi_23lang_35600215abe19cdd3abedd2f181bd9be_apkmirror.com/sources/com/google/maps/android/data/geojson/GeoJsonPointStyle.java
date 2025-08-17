package com.google.maps.android.data.geojson;

import Md.C4177c;
import Md.C4189o;
import com.google.maps.android.data.Style;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class GeoJsonPointStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"Point", "MultiPoint", "GeometryCollection"};

    public float getAlpha() {
        return this.mMarkerOptions.W0();
    }

    public float getAnchorU() {
        return this.mMarkerOptions.d1();
    }

    public float getAnchorV() {
        return this.mMarkerOptions.g1();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public C4177c getIcon() {
        return this.mMarkerOptions.i1();
    }

    public float getInfoWindowAnchorU() {
        return this.mMarkerOptions.P1();
    }

    public float getInfoWindowAnchorV() {
        return this.mMarkerOptions.a2();
    }

    @Override // com.google.maps.android.data.Style
    public float getRotation() {
        return this.mMarkerOptions.d2();
    }

    public String getSnippet() {
        return this.mMarkerOptions.l2();
    }

    public String getTitle() {
        return this.mMarkerOptions.getTitle();
    }

    public float getZIndex() {
        return this.mMarkerOptions.J2();
    }

    public boolean isDraggable() {
        return this.mMarkerOptions.T2();
    }

    public boolean isFlat() {
        return this.mMarkerOptions.W2();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mMarkerOptions.B3();
    }

    public void setAlpha(float f10) {
        this.mMarkerOptions.B(f10);
        styleChanged();
    }

    public void setAnchor(float f10, float f11) {
        setMarkerHotSpot(f10, f11, "fraction", "fraction");
        styleChanged();
    }

    public void setDraggable(boolean z10) {
        this.mMarkerOptions.q0(z10);
        styleChanged();
    }

    public void setFlat(boolean z10) {
        this.mMarkerOptions.K0(z10);
        styleChanged();
    }

    public void setIcon(C4177c c4177c) {
        this.mMarkerOptions.M2(c4177c);
        styleChanged();
    }

    public void setInfoWindowAnchor(float f10, float f11) {
        this.mMarkerOptions.O2(f10, f11);
        styleChanged();
    }

    public void setSnippet(String str) {
        this.mMarkerOptions.W3(str);
        styleChanged();
    }

    public void setTitle(String str) {
        this.mMarkerOptions.X3(str);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z10) {
        this.mMarkerOptions.Y3(z10);
        styleChanged();
    }

    public void setZIndex(float f10) {
        this.mMarkerOptions.Z3(f10);
        styleChanged();
    }

    public C4189o toMarkerOptions() {
        C4189o c4189o = new C4189o();
        c4189o.B(this.mMarkerOptions.W0());
        c4189o.T(this.mMarkerOptions.d1(), this.mMarkerOptions.g1());
        c4189o.q0(this.mMarkerOptions.T2());
        c4189o.K0(this.mMarkerOptions.W2());
        c4189o.M2(this.mMarkerOptions.i1());
        c4189o.O2(this.mMarkerOptions.P1(), this.mMarkerOptions.a2());
        c4189o.V3(this.mMarkerOptions.d2());
        c4189o.W3(this.mMarkerOptions.l2());
        c4189o.X3(this.mMarkerOptions.getTitle());
        c4189o.Y3(this.mMarkerOptions.B3());
        c4189o.Z3(this.mMarkerOptions.J2());
        return c4189o;
    }

    public String toString() {
        return "PointStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n alpha=" + getAlpha() + ",\n anchor U=" + getAnchorU() + ",\n anchor V=" + getAnchorV() + ",\n draggable=" + isDraggable() + ",\n flat=" + isFlat() + ",\n info window anchor U=" + getInfoWindowAnchorU() + ",\n info window anchor V=" + getInfoWindowAnchorV() + ",\n rotation=" + getRotation() + ",\n snippet=" + getSnippet() + ",\n title=" + getTitle() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + "\n}\n";
    }

    public GeoJsonPointStyle() {
        this.mMarkerOptions = new C4189o();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public void setRotation(float f10) {
        setMarkerRotation(f10);
        styleChanged();
    }
}
