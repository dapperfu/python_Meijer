package com.google.maps.android.data.kml;

import com.fullstory.FS;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
class KmlStyleParser {
    private static final String COLOR_STYLE_COLOR = "color";
    private static final String COLOR_STYLE_MODE = "colorMode";
    private static final String ICON_STYLE_HEADING = "heading";
    private static final String ICON_STYLE_HOTSPOT = "hotSpot";
    private static final String ICON_STYLE_SCALE = "scale";
    private static final String ICON_STYLE_URL = "Icon";
    private static final String LINE_STYLE_WIDTH = "width";
    private static final String LOG_TAG = "KmlStyleParser";
    private static final String POLY_STYLE_FILL = "fill";
    private static final String POLY_STYLE_OUTLINE = "outline";
    private static final String STYLE_MAP_KEY = "key";
    private static final String STYLE_MAP_NORMAL_STYLE = "normal";
    private static final String STYLE_TAG = "styleUrl";

    static KmlStyle createStyle(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        KmlStyle kmlStyle = new KmlStyle();
        setStyleId(xmlPullParser.getAttributeValue(null, PreferencesHelper.PREF_ID), kmlStyle);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Style")) {
                return kmlStyle;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("IconStyle")) {
                    createIconStyle(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("LineStyle")) {
                    createLineStyle(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("PolyStyle")) {
                    createPolyStyle(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("BalloonStyle")) {
                    createBalloonStyle(xmlPullParser, kmlStyle);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static HashMap<String, String> createStyleMap(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> map = new HashMap<>();
        String str = "#" + xmlPullParser.getAttributeValue(null, PreferencesHelper.PREF_ID);
        int eventType = xmlPullParser.getEventType();
        boolean z10 = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("StyleMap")) {
                return map;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(STYLE_MAP_KEY) && xmlPullParser.nextText().equals(STYLE_MAP_NORMAL_STYLE)) {
                    z10 = true;
                } else if (xmlPullParser.getName().equals(STYLE_TAG) && z10) {
                    map.put(str, xmlPullParser.nextText());
                    z10 = false;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void setIconHotSpot(XmlPullParser xmlPullParser, KmlStyle kmlStyle) {
        try {
            kmlStyle.setHotSpot(Float.parseFloat(xmlPullParser.getAttributeValue(null, "x")), Float.parseFloat(xmlPullParser.getAttributeValue(null, "y")), xmlPullParser.getAttributeValue(null, "xunits"), xmlPullParser.getAttributeValue(null, "yunits"));
        } catch (NullPointerException unused) {
            FS.log_w(LOG_TAG, "Missing 'x' or 'y' attributes in hotSpot for style with id: " + kmlStyle.getStyleId());
        } catch (NumberFormatException unused2) {
            FS.log_w(LOG_TAG, "Invalid number in 'x' or 'y' attributes in hotSpot for style with id: " + kmlStyle.getStyleId());
        }
    }

    private static void setStyleId(String str, KmlStyle kmlStyle) {
        if (str != null) {
            kmlStyle.setStyleId("#" + str);
        }
    }

    KmlStyleParser() {
    }

    private static void createBalloonStyle(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("BalloonStyle")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("text")) {
                kmlStyle.setInfoWindowText(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void createIconStyle(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("IconStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(ICON_STYLE_HEADING)) {
                    kmlStyle.setHeading(Float.parseFloat(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(ICON_STYLE_URL)) {
                    setIconUrl(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals(ICON_STYLE_HOTSPOT)) {
                    setIconHotSpot(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals(ICON_STYLE_SCALE)) {
                    kmlStyle.setIconScale(Double.parseDouble(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(COLOR_STYLE_COLOR)) {
                    kmlStyle.setMarkerColor(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(COLOR_STYLE_MODE)) {
                    kmlStyle.setIconColorMode(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void createLineStyle(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(COLOR_STYLE_COLOR)) {
                    kmlStyle.setOutlineColor(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(LINE_STYLE_WIDTH)) {
                    kmlStyle.setWidth(Float.valueOf(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(COLOR_STYLE_MODE)) {
                    kmlStyle.setLineColorMode(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void createPolyStyle(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("PolyStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(COLOR_STYLE_COLOR)) {
                    kmlStyle.setFillColor(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(POLY_STYLE_OUTLINE)) {
                    kmlStyle.setOutline(KmlBoolean.parseBoolean(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(POLY_STYLE_FILL)) {
                    kmlStyle.setFill(KmlBoolean.parseBoolean(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(COLOR_STYLE_MODE)) {
                    kmlStyle.setPolyColorMode(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void setIconUrl(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(ICON_STYLE_URL)) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                kmlStyle.setIconUrl(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }
}
