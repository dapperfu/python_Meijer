package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.data.Geometry;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
class KmlFeatureParser {
    private static final int ALTITUDE_INDEX = 2;
    private static final String BOUNDARY_REGEX = "outerBoundaryIs|innerBoundaryIs";
    private static final String COMPASS_REGEX = "north|south|east|west";
    private static final String EXTENDED_DATA = "ExtendedData";
    private static final String GEOMETRY_REGEX = "Point|LineString|Polygon|MultiGeometry|Track|MultiTrack";
    private static final int LATITUDE_INDEX = 1;
    private static final String LAT_LNG_ALT_SEPARATOR = ",";
    private static final int LONGITUDE_INDEX = 0;
    private static final String PROPERTY_REGEX = "name|description|drawOrder|visibility|open|address|phoneNumber";
    private static final String STYLE_TAG = "Style";
    private static final String STYLE_URL_TAG = "styleUrl";

    private static LatLngAlt convertToLatLngAlt(String str) {
        return convertToLatLngAlt(str, LAT_LNG_ALT_SEPARATOR);
    }

    private static class LatLngAlt {
        public final Double altitude;
        public final LatLng latLng;

        LatLngAlt(LatLng latLng, Double d10) {
            this.latLng = latLng;
            this.altitude = d10;
        }
    }

    private static LatLngAlt convertToLatLngAlt(String str, String str2) throws NumberFormatException {
        String[] strArrSplit = str.split(str2);
        if (strArrSplit.length < 2) {
            throw new IllegalArgumentException("Wrong coordinate, latitude and longitude must be set");
        }
        return new LatLngAlt(new LatLng(Double.parseDouble(strArrSplit[1]), Double.parseDouble(strArrSplit[0])), strArrSplit.length > 2 ? Double.valueOf(Double.parseDouble(strArrSplit[2])) : null);
    }

    private static ArrayList<LatLngAlt> convertToLatLngAltArray(String str) {
        ArrayList<LatLngAlt> arrayList = new ArrayList<>();
        for (String str2 : str.trim().split("(\\s+)")) {
            arrayList.add(convertToLatLngAlt(str2));
        }
        return arrayList;
    }

    static KmlGroundOverlay createGroundOverlay(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int eventType = xmlPullParser.getEventType();
        float rotation = 0.0f;
        String imageUrl = null;
        int i10 = 1;
        float f10 = 0.0f;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("GroundOverlay")) {
                return new KmlGroundOverlay(imageUrl, createLatLngBounds((Double) map2.get("north"), (Double) map2.get("south"), (Double) map2.get("east"), (Double) map2.get("west")), f10, i10, map, rotation);
            }
            int i11 = i10;
            String str = imageUrl;
            if (eventType != 2) {
                i10 = i11;
                imageUrl = str;
            } else if (xmlPullParser.getName().equals("Icon")) {
                i10 = i11;
                imageUrl = getImageUrl(xmlPullParser);
            } else if (xmlPullParser.getName().equals("drawOrder")) {
                i10 = i11;
                imageUrl = str;
                f10 = Float.parseFloat(xmlPullParser.nextText());
            } else if (xmlPullParser.getName().equals("visibility")) {
                imageUrl = str;
                i10 = Integer.parseInt(xmlPullParser.nextText());
            } else {
                if (xmlPullParser.getName().equals(EXTENDED_DATA)) {
                    map.putAll(setExtendedDataProperties(xmlPullParser));
                } else if (xmlPullParser.getName().equals("rotation")) {
                    i10 = i11;
                    imageUrl = str;
                    rotation = getRotation(xmlPullParser);
                } else if (xmlPullParser.getName().matches(PROPERTY_REGEX) || xmlPullParser.getName().equals("color")) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().matches(COMPASS_REGEX)) {
                    map2.put(xmlPullParser.getName(), Double.valueOf(Double.parseDouble(xmlPullParser.nextText())));
                }
                i10 = i11;
                imageUrl = str;
            }
            eventType = xmlPullParser.next();
        }
    }

    private static LatLngBounds createLatLngBounds(Double d10, Double d11, Double d12, Double d13) {
        return new LatLngBounds(new LatLng(d11.doubleValue(), d13.doubleValue()), new LatLng(d10.doubleValue(), d12.doubleValue()));
    }

    private static KmlLineString createLineString(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineString")) {
                return new KmlLineString(arrayList, arrayList2);
            }
            if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                for (LatLngAlt latLngAlt : convertToLatLngAltArray(xmlPullParser.nextText())) {
                    arrayList.add(latLngAlt.latLng);
                    Double d10 = latLngAlt.altitude;
                    if (d10 != null) {
                        arrayList2.add(d10);
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlMultiGeometry createMultiGeometry(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiGeometry")) {
                return new KmlMultiGeometry(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches(GEOMETRY_REGEX)) {
                arrayList.add(createGeometry(xmlPullParser, xmlPullParser.getName()));
            }
            next = xmlPullParser.next();
        }
    }

    private static KmlMultiTrack createMultiTrack(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiTrack")) {
                return new KmlMultiTrack(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches("Track")) {
                arrayList.add(createTrack(xmlPullParser));
            }
            next = xmlPullParser.next();
        }
    }

    static KmlPlacemark createPlacemark(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        Geometry geometryCreateGeometry = null;
        String strNextText = null;
        KmlStyle kmlStyleCreateStyle = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Placemark")) {
                return new KmlPlacemark(geometryCreateGeometry, strNextText, kmlStyleCreateStyle, map);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(STYLE_URL_TAG)) {
                    strNextText = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().matches(GEOMETRY_REGEX)) {
                    geometryCreateGeometry = createGeometry(xmlPullParser, xmlPullParser.getName());
                } else if (xmlPullParser.getName().matches(PROPERTY_REGEX)) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(EXTENDED_DATA)) {
                    map.putAll(setExtendedDataProperties(xmlPullParser));
                } else if (xmlPullParser.getName().equals(STYLE_TAG)) {
                    kmlStyleCreateStyle = KmlStyleParser.createStyle(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlPolygon createPolygon(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        boolean zEquals = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(KmlPolygon.GEOMETRY_TYPE)) {
                return new KmlPolygon(arrayList, arrayList2);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(BOUNDARY_REGEX)) {
                    zEquals = xmlPullParser.getName().equals("outerBoundaryIs");
                } else if (xmlPullParser.getName().equals("coordinates")) {
                    if (zEquals) {
                        arrayList = convertToLatLngArray(xmlPullParser.nextText());
                    } else {
                        arrayList2.add(convertToLatLngArray(xmlPullParser.nextText()));
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlTrack createTrack(XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Track")) {
                return new KmlTrack(arrayList, arrayList2, arrayList3, map);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("coord")) {
                    LatLngAlt latLngAltConvertToLatLngAlt = convertToLatLngAlt(xmlPullParser.nextText(), " ");
                    arrayList.add(latLngAltConvertToLatLngAlt.latLng);
                    Double d10 = latLngAltConvertToLatLngAlt.altitude;
                    if (d10 != null) {
                        arrayList2.add(d10);
                    }
                } else if (xmlPullParser.getName().equals("when")) {
                    try {
                        arrayList3.add(Long.valueOf(simpleDateFormat.parse(xmlPullParser.nextText()).getTime()));
                    } catch (ParseException e10) {
                        throw new XmlPullParserException("Invalid date", xmlPullParser, e10);
                    }
                } else if (xmlPullParser.getName().equals(EXTENDED_DATA)) {
                    map.putAll(setExtendedDataProperties(xmlPullParser));
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static HashMap<String, String> setExtendedDataProperties(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> map = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        String attributeValue = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(EXTENDED_DATA)) {
                return map;
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

    KmlFeatureParser() {
    }

    private static ArrayList<LatLng> convertToLatLngArray(String str) {
        ArrayList<LatLngAlt> arrayListConvertToLatLngAltArray = convertToLatLngAltArray(str);
        ArrayList<LatLng> arrayList = new ArrayList<>();
        Iterator<LatLngAlt> it = arrayListConvertToLatLngAltArray.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().latLng);
        }
        return arrayList;
    }

    private static Geometry createGeometry(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(str)) {
                return null;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Point")) {
                    return createPoint(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("LineString")) {
                    return createLineString(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("Track")) {
                    return createTrack(xmlPullParser);
                }
                if (xmlPullParser.getName().equals(KmlPolygon.GEOMETRY_TYPE)) {
                    return createPolygon(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiGeometry")) {
                    return createMultiGeometry(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiTrack")) {
                    return createMultiTrack(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlPoint createPoint(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        LatLngAlt latLngAltConvertToLatLngAlt = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Point")) {
                return new KmlPoint(latLngAltConvertToLatLngAlt.latLng, latLngAltConvertToLatLngAlt.altitude);
            }
            if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                latLngAltConvertToLatLngAlt = convertToLatLngAlt(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static String getImageUrl(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Icon")) {
                return null;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                return xmlPullParser.nextText();
            }
            eventType = xmlPullParser.next();
        }
    }

    private static float getRotation(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return -Float.parseFloat(xmlPullParser.nextText());
    }
}
