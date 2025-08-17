package com.google.maps.android.data.kml;

import Md.C4189o;
import Md.C4193t;
import Md.C4195v;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Geometry;
import java.util.Map;

/* loaded from: classes7.dex */
public class KmlPlacemark extends Feature {
    private final KmlStyle mInlineStyle;
    private final String mStyle;

    public KmlStyle getInlineStyle() {
        return this.mInlineStyle;
    }

    public C4189o getMarkerOptions() {
        KmlStyle kmlStyle = this.mInlineStyle;
        if (kmlStyle == null) {
            return null;
        }
        return kmlStyle.getMarkerOptions();
    }

    public C4193t getPolygonOptions() {
        KmlStyle kmlStyle = this.mInlineStyle;
        if (kmlStyle == null) {
            return null;
        }
        return kmlStyle.getPolygonOptions();
    }

    public C4195v getPolylineOptions() {
        KmlStyle kmlStyle = this.mInlineStyle;
        if (kmlStyle == null) {
            return null;
        }
        return kmlStyle.getPolylineOptions();
    }

    public String toString() {
        return "Placemark{\n style id=" + this.mStyle + ",\n inline style=" + this.mInlineStyle + "\n}\n";
    }

    public KmlPlacemark(Geometry geometry, String str, KmlStyle kmlStyle, Map<String, String> map) {
        super(geometry, str, map);
        this.mStyle = str;
        this.mInlineStyle = kmlStyle;
    }

    public String getStyleId() {
        return super.getId();
    }
}
