package com.google.maps.android.data.geojson;

import Od.C4455c;
import Od.C4467o;
import com.google.maps.android.data.Style;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class GeoJsonPointStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"Point", "MultiPoint", "GeometryCollection"};

    public float getAlpha() {
        return this.mMarkerOptions.U0();
    }

    public float getAnchorU() {
        return this.mMarkerOptions.d1();
    }

    public float getAnchorV() {
        return this.mMarkerOptions.h1();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public C4455c getIcon() {
        return this.mMarkerOptions.j1();
    }

    public float getInfoWindowAnchorU() {
        return this.mMarkerOptions.y1();
    }

    public float getInfoWindowAnchorV() {
        return this.mMarkerOptions.P1();
    }

    @Override // com.google.maps.android.data.Style
    public float getRotation() {
        return this.mMarkerOptions.c2();
    }

    public String getSnippet() {
        return this.mMarkerOptions.j2();
    }

    public String getTitle() {
        return this.mMarkerOptions.getTitle();
    }

    public float getZIndex() {
        return this.mMarkerOptions.H2();
    }

    public boolean isDraggable() {
        return this.mMarkerOptions.U2();
    }

    public boolean isFlat() {
        return this.mMarkerOptions.W2();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mMarkerOptions.A3();
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
        this.mMarkerOptions.r0(z10);
        styleChanged();
    }

    public void setFlat(boolean z10) {
        this.mMarkerOptions.I0(z10);
        styleChanged();
    }

    public void setIcon(C4455c c4455c) {
        this.mMarkerOptions.L2(c4455c);
        styleChanged();
    }

    public void setInfoWindowAnchor(float f10, float f11) {
        this.mMarkerOptions.N2(f10, f11);
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

    public C4467o toMarkerOptions() {
        C4467o c4467o = new C4467o();
        c4467o.B(this.mMarkerOptions.U0());
        c4467o.T(this.mMarkerOptions.d1(), this.mMarkerOptions.h1());
        c4467o.r0(this.mMarkerOptions.U2());
        c4467o.I0(this.mMarkerOptions.W2());
        c4467o.L2(this.mMarkerOptions.j1());
        c4467o.N2(this.mMarkerOptions.y1(), this.mMarkerOptions.P1());
        c4467o.V3(this.mMarkerOptions.c2());
        c4467o.W3(this.mMarkerOptions.j2());
        c4467o.X3(this.mMarkerOptions.getTitle());
        c4467o.Y3(this.mMarkerOptions.A3());
        c4467o.Z3(this.mMarkerOptions.H2());
        return c4467o;
    }

    public String toString() {
        return "PointStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n alpha=" + getAlpha() + ",\n anchor U=" + getAnchorU() + ",\n anchor V=" + getAnchorV() + ",\n draggable=" + isDraggable() + ",\n flat=" + isFlat() + ",\n info window anchor U=" + getInfoWindowAnchorU() + ",\n info window anchor V=" + getInfoWindowAnchorV() + ",\n rotation=" + getRotation() + ",\n snippet=" + getSnippet() + ",\n title=" + getTitle() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + "\n}\n";
    }

    public GeoJsonPointStyle() {
        this.mMarkerOptions = new C4467o();
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
