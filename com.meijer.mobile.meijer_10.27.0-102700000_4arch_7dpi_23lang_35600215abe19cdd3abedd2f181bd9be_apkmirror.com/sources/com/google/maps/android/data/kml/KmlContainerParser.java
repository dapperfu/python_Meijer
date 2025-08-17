package com.google.maps.android.data.kml;

import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
class KmlContainerParser {
    private static final String CONTAINER_REGEX = "Folder|Document";
    private static final String EXTENDED_DATA = "ExtendedData";
    private static final String GROUND_OVERLAY = "GroundOverlay";
    private static final String PLACEMARK = "Placemark";
    private static final String PROPERTY_REGEX = "name|description|visibility|open|address|phoneNumber";
    private static final String STYLE = "Style";
    private static final String STYLE_MAP = "StyleMap";
    private static final String UNSUPPORTED_REGEX = "altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when";

    private static void setContainerStyle(XmlPullParser xmlPullParser, HashMap<String, KmlStyle> map) throws XmlPullParserException, IOException {
        if (xmlPullParser.getAttributeValue(null, PreferencesHelper.PREF_ID) != null) {
            KmlStyle kmlStyleCreateStyle = KmlStyleParser.createStyle(xmlPullParser);
            map.put(kmlStyleCreateStyle.getStyleId(), kmlStyleCreateStyle);
        }
    }

    KmlContainerParser() {
    }

    private static KmlContainer assignPropertiesToContainer(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        String name = xmlPullParser.getName();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        if (xmlPullParser.getAttributeValue(null, PreferencesHelper.PREF_ID) != null) {
            attributeValue = xmlPullParser.getAttributeValue(null, PreferencesHelper.PREF_ID);
        } else {
            attributeValue = null;
        }
        xmlPullParser.next();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(name)) {
                return new KmlContainer(map, map2, map3, map4, arrayList, map5, attributeValue);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(UNSUPPORTED_REGEX)) {
                    KmlParser.skip(xmlPullParser);
                } else if (xmlPullParser.getName().matches(CONTAINER_REGEX)) {
                    arrayList.add(assignPropertiesToContainer(xmlPullParser));
                } else if (xmlPullParser.getName().matches(PROPERTY_REGEX)) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(STYLE_MAP)) {
                    setContainerStyleMap(xmlPullParser, map4);
                } else if (xmlPullParser.getName().equals(STYLE)) {
                    setContainerStyle(xmlPullParser, map2);
                } else if (xmlPullParser.getName().equals(PLACEMARK)) {
                    setContainerPlacemark(xmlPullParser, map3);
                } else if (xmlPullParser.getName().equals(EXTENDED_DATA)) {
                    setExtendedDataProperties(xmlPullParser, map);
                } else if (xmlPullParser.getName().equals(GROUND_OVERLAY)) {
                    map5.put(KmlFeatureParser.createGroundOverlay(xmlPullParser), null);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static KmlContainer createContainer(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return assignPropertiesToContainer(xmlPullParser);
    }

    private static void setContainerPlacemark(XmlPullParser xmlPullParser, HashMap<KmlPlacemark, Object> map) throws XmlPullParserException, IOException {
        map.put(KmlFeatureParser.createPlacemark(xmlPullParser), null);
    }

    private static void setContainerStyleMap(XmlPullParser xmlPullParser, HashMap<String, String> map) throws XmlPullParserException, IOException {
        map.putAll(KmlStyleParser.createStyleMap(xmlPullParser));
    }

    private static void setExtendedDataProperties(XmlPullParser xmlPullParser, HashMap<String, String> map) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        String attributeValue = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(EXTENDED_DATA)) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Data")) {
                    attributeValue = xmlPullParser.getAttributeValue(null, "name");
                } else if (xmlPullParser.getName().equals("value") && attributeValue != null) {
                    map.put(attributeValue, xmlPullParser.nextText());
                    attributeValue = null;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
