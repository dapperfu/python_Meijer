package com.google.maps.android.data.kml;

import Md.C4178d;
import Md.C4189o;
import Md.C4193t;
import Md.C4195v;
import android.graphics.Color;
import com.google.maps.android.data.Style;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* loaded from: classes7.dex */
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

    private static C4189o createMarkerOptions(C4189o c4189o, boolean z10, float f10) {
        C4189o c4189o2 = new C4189o();
        c4189o2.V3(c4189o.d2());
        c4189o2.T(c4189o.d1(), c4189o.g1());
        if (z10) {
            c4189o.M2(C4178d.a(getHueValue(computeRandomColor((int) f10))));
        }
        c4189o2.M2(c4189o.i1());
        return c4189o2;
    }

    private static C4193t createPolygonOptions(C4193t c4193t, boolean z10, boolean z11) {
        float fA2;
        C4193t c4193t2 = new C4193t();
        if (z10) {
            c4193t2.q0(c4193t.W0());
        }
        if (z11) {
            c4193t2.M2(c4193t.g1());
            fA2 = c4193t.a2();
        } else {
            fA2 = 0.0f;
        }
        c4193t2.W2(fA2);
        c4193t2.c0(c4193t.d2());
        return c4193t2;
    }

    private static C4195v createPolylineOptions(C4195v c4195v) {
        C4195v c4195v2 = new C4195v();
        c4195v2.K0(c4195v.g1());
        c4195v2.W3(c4195v.l2());
        c4195v2.q0(c4195v.M2());
        return c4195v2;
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

    public C4189o getMarkerOptions() {
        return createMarkerOptions(this.mMarkerOptions, isIconRandomColorMode(), this.mMarkerColor);
    }

    public C4193t getPolygonOptions() {
        return createPolygonOptions(this.mPolygonOptions, this.mFill, this.mOutline);
    }

    public C4195v getPolylineOptions() {
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
        this.mMarkerOptions.M2(C4178d.a(hueValue));
        this.mStylesSet.add("markerColor");
    }

    void setOutline(boolean z10) {
        this.mOutline = z10;
        this.mStylesSet.add("outline");
    }

    void setOutlineColor(String str) {
        this.mPolylineOptions.K0(Color.parseColor("#" + convertColor(str)));
        this.mPolygonOptions.M2(Color.parseColor("#" + convertColor(str)));
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
