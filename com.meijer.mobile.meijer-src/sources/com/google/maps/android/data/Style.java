package com.google.maps.android.data;

import Od.C4467o;
import Od.C4471t;
import Od.C4473v;
import com.fullstory.FS;
import java.util.Observable;

/* loaded from: classes8.dex */
public abstract class Style extends Observable {
    private static final String LOG_TAG = "Style";
    protected C4467o mMarkerOptions = new C4467o();
    protected C4471t mPolygonOptions;
    protected C4473v mPolylineOptions;

    public float getRotation() {
        return this.mMarkerOptions.c2();
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
        this.mPolygonOptions.r0(i10);
    }

    public void setPolygonStrokeWidth(float f10) {
        this.mPolygonOptions.W2(f10);
    }

    public Style() {
        C4473v c4473v = new C4473v();
        this.mPolylineOptions = c4473v;
        c4473v.r0(true);
        C4471t c4471t = new C4471t();
        this.mPolygonOptions = c4471t;
        c4471t.b0(true);
    }
}
