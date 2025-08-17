package com.google.maps.android.data;

import Md.C4189o;
import Md.C4193t;
import Md.C4195v;
import com.fullstory.FS;
import java.util.Observable;

/* loaded from: classes7.dex */
public abstract class Style extends Observable {
    private static final String LOG_TAG = "Style";
    protected C4189o mMarkerOptions = new C4189o();
    protected C4193t mPolygonOptions;
    protected C4195v mPolylineOptions;

    public float getRotation() {
        return this.mMarkerOptions.d2();
    }

    public void setLineStringWidth(float f10) {
        this.mPolylineOptions.W3(f10);
    }

    public void setMarkerHotSpot(float f10, float f11, String str, String str2) {
        if (!str.equals("fraction")) {
            FS.log_w(LOG_TAG, "Hotspot xUnits other than \"fraction\" are not supported.");
            f10 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            FS.log_w(LOG_TAG, "Hotspot yUnits other than \"fraction\" are not supported.");
            f11 = 1.0f;
        }
        this.mMarkerOptions.T(f10, f11);
    }

    public void setMarkerRotation(float f10) {
        this.mMarkerOptions.V3(f10);
    }

    public void setPolygonFillColor(int i10) {
        this.mPolygonOptions.q0(i10);
    }

    public void setPolygonStrokeWidth(float f10) {
        this.mPolygonOptions.W2(f10);
    }

    public Style() {
        C4195v c4195v = new C4195v();
        this.mPolylineOptions = c4195v;
        c4195v.q0(true);
        C4193t c4193t = new C4193t();
        this.mPolygonOptions = c4193t;
        c4193t.c0(true);
    }
}
