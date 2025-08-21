package com.google.maps.android.data.geojson;

import Od.C4468p;
import Od.C4473v;
import com.google.maps.android.data.Style;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class GeoJsonLineStringStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"LineString", "MultiLineString", "GeometryCollection"};

    public int getColor() {
        return this.mPolylineOptions.h1();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public List<C4468p> getPattern() {
        return this.mPolylineOptions.P1();
    }

    public float getWidth() {
        return this.mPolylineOptions.j2();
    }

    public float getZIndex() {
        return this.mPolylineOptions.H2();
    }

    public boolean isClickable() {
        return this.mPolylineOptions.L2();
    }

    public boolean isGeodesic() {
        return this.mPolylineOptions.N2();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolylineOptions.U2();
    }

    public void setClickable(boolean z10) {
        this.mPolylineOptions.r0(z10);
        styleChanged();
    }

    public void setColor(int i10) {
        this.mPolylineOptions.I0(i10);
        styleChanged();
    }

    public void setGeodesic(boolean z10) {
        this.mPolylineOptions.d1(z10);
        styleChanged();
    }

    public void setPattern(List<C4468p> list) {
        this.mPolylineOptions.A3(list);
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

    public C4473v toPolylineOptions() {
        C4473v c4473v = new C4473v();
        c4473v.I0(this.mPolylineOptions.h1());
        c4473v.r0(this.mPolylineOptions.L2());
        c4473v.d1(this.mPolylineOptions.N2());
        c4473v.V3(this.mPolylineOptions.U2());
        c4473v.W3(this.mPolylineOptions.j2());
        c4473v.X3(this.mPolylineOptions.H2());
        c4473v.A3(getPattern());
        return c4473v;
    }

    public String toString() {
        return "LineStringStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n color=" + getColor() + ",\n clickable=" + isClickable() + ",\n geodesic=" + isGeodesic() + ",\n visible=" + isVisible() + ",\n width=" + getWidth() + ",\n z index=" + getZIndex() + ",\n pattern=" + getPattern() + "\n}\n";
    }

    public GeoJsonLineStringStyle() {
        C4473v c4473v = new C4473v();
        this.mPolylineOptions = c4473v;
        c4473v.r0(true);
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
