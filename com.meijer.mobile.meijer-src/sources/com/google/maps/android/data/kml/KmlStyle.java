package com.google.maps.android.data.kml;

import Od.C4456d;
import Od.C4467o;
import Od.C4471t;
import Od.C4473v;
import android.graphics.Color;
import com.google.maps.android.data.Style;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* loaded from: classes8.dex */
public class KmlStyle extends Style {
    private static final int HSV_VALUES = 3;
    private static final int HUE_VALUE = 0;
    private static final int INITIAL_SCALE = 1;
    private String mIconUrl;
    private boolean mFill = true;
    private boolean mOutline = true;
    private String mStyleId = null;
    private final HashMap<String, String> mBalloonOptions = new HashMap<>();
    private final HashSet<String> mStylesSet = new HashSet<>();
    private double mScale = 1.0d;
    float mMarkerColor = 0.0f;
    private boolean mIconRandomColorMode = false;
    private boolean mLineRandomColorMode = false;
    private boolean mPolyRandomColorMode = false;

    private static float getHueValue(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        return fArr[0];
    }

    public static int computeRandomColor(int i10) {
        Random random = new Random();
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (iRed != 0) {
            iRed = random.nextInt(iRed);
        }
        if (iBlue != 0) {
            iBlue = random.nextInt(iBlue);
        }
        if (iGreen != 0) {
            iGreen = random.nextInt(iGreen);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    private static C4467o createMarkerOptions(C4467o c4467o, boolean z10, float f10) {
        C4467o c4467o2 = new C4467o();
        c4467o2.V3(c4467o.c2());
        c4467o2.T(c4467o.d1(), c4467o.h1());
        if (z10) {
            c4467o.L2(C4456d.a(getHueValue(computeRandomColor((int) f10))));
        }
        c4467o2.L2(c4467o.j1());
        return c4467o2;
    }

    private static C4471t createPolygonOptions(C4471t c4471t, boolean z10, boolean z11) {
        float fP1;
        C4471t c4471t2 = new C4471t();
        if (z10) {
            c4471t2.r0(c4471t.U0());
        }
        if (z11) {
            c4471t2.L2(c4471t.h1());
            fP1 = c4471t.P1();
        } else {
            fP1 = 0.0f;
        }
        c4471t2.W2(fP1);
        c4471t2.b0(c4471t.c2());
        return c4471t2;
    }

    private static C4473v createPolylineOptions(C4473v c4473v) {
        C4473v c4473v2 = new C4473v();
        c4473v2.I0(c4473v.h1());
        c4473v2.W3(c4473v.j2());
        c4473v2.r0(c4473v.L2());
        return c4473v2;
    }

    public HashMap<String, String> getBalloonOptions() {
        return this.mBalloonOptions;
    }

    public double getIconScale() {
        return this.mScale;
    }

    public String getIconUrl() {
        return this.mIconUrl;
    }

    public C4467o getMarkerOptions() {
        return createMarkerOptions(this.mMarkerOptions, isIconRandomColorMode(), this.mMarkerColor);
    }

    public C4471t getPolygonOptions() {
        return createPolygonOptions(this.mPolygonOptions, this.mFill, this.mOutline);
    }

    public C4473v getPolylineOptions() {
        return createPolylineOptions(this.mPolylineOptions);
    }

    String getStyleId() {
        return this.mStyleId;
    }

    public boolean hasBalloonStyle() {
        return this.mBalloonOptions.size() > 0;
    }

    public boolean hasFill() {
        return this.mFill;
    }

    public boolean hasOutline() {
        return this.mOutline;
    }

    boolean isIconRandomColorMode() {
        return this.mIconRandomColorMode;
    }

    public boolean isLineRandomColorMode() {
        return this.mLineRandomColorMode;
    }

    public boolean isPolyRandomColorMode() {
        return this.mPolyRandomColorMode;
    }

    public boolean isStyleSet(String str) {
        return this.mStylesSet.contains(str);
    }

    public void setFill(boolean z10) {
        this.mFill = z10;
    }

    void setFillColor(String str) {
        setPolygonFillColor(Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add("fillColor");
    }

    void setIconColorMode(String str) {
        this.mIconRandomColorMode = str.equals("random");
        this.mStylesSet.add("iconColorMode");
    }

    void setIconScale(double d10) {
        this.mScale = d10;
        this.mStylesSet.add("iconScale");
    }

    void setIconUrl(String str) {
        this.mIconUrl = str;
        this.mStylesSet.add("iconUrl");
    }

    void setInfoWindowText(String str) {
        this.mBalloonOptions.put("text", str);
    }

    void setLineColorMode(String str) {
        this.mLineRandomColorMode = str.equals("random");
        this.mStylesSet.add("lineColorMode");
    }

    void setMarkerColor(String str) {
        float hueValue = getHueValue(Color.parseColor("#" + convertColor(str)));
        this.mMarkerColor = hueValue;
        this.mMarkerOptions.L2(C4456d.a(hueValue));
        this.mStylesSet.add("markerColor");
    }

    void setOutline(boolean z10) {
        this.mOutline = z10;
        this.mStylesSet.add("outline");
    }

    void setOutlineColor(String str) {
        this.mPolylineOptions.I0(Color.parseColor("#" + convertColor(str)));
        this.mPolygonOptions.L2(Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add("outlineColor");
    }

    void setPolyColorMode(String str) {
        this.mPolyRandomColorMode = str.equals("random");
        this.mStylesSet.add("polyColorMode");
    }

    void setStyleId(String str) {
        this.mStyleId = str;
    }

    public String toString() {
        return "Style{\n balloon options=" + this.mBalloonOptions + ",\n fill=" + this.mFill + ",\n outline=" + this.mOutline + ",\n icon url=" + this.mIconUrl + ",\n scale=" + this.mScale + ",\n style id=" + this.mStyleId + "\n}\n";
    }

    KmlStyle() {
    }

    private static String convertColor(String str) {
        String strTrim = str.trim();
        if (strTrim.length() > 6) {
            return strTrim.substring(0, 2) + strTrim.substring(6, 8) + strTrim.substring(4, 6) + strTrim.substring(2, 4);
        }
        return strTrim.substring(4, 6) + strTrim.substring(2, 4) + strTrim.substring(0, 2);
    }

    void setHeading(float f10) {
        setMarkerRotation(f10);
        this.mStylesSet.add("heading");
    }

    void setHotSpot(float f10, float f11, String str, String str2) {
        setMarkerHotSpot(f10, f11, str, str2);
        this.mStylesSet.add("hotSpot");
    }

    void setWidth(Float f10) {
        setLineStringWidth(f10.floatValue());
        setPolygonStrokeWidth(f10.floatValue());
        this.mStylesSet.add("width");
    }
}
