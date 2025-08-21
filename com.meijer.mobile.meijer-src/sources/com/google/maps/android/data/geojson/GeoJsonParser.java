package com.google.maps.android.data.geojson;

import com.fullstory.FS;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.data.Geometry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class GeoJsonParser {
    private static final String BOUNDING_BOX = "bbox";
    private static final String FEATURE = "Feature";
    private static final String FEATURE_COLLECTION = "FeatureCollection";
    private static final String FEATURE_COLLECTION_ARRAY = "features";
    private static final String FEATURE_GEOMETRY = "geometry";
    private static final String FEATURE_ID = "id";
    private static final String GEOMETRY_COLLECTION = "GeometryCollection";
    private static final String GEOMETRY_COLLECTION_ARRAY = "geometries";
    private static final String GEOMETRY_COORDINATES_ARRAY = "coordinates";
    private static final String LINESTRING = "LineString";
    private static final String LOG_TAG = "GeoJsonParser";
    private static final String MULTILINESTRING = "MultiLineString";
    private static final String MULTIPOINT = "MultiPoint";
    private static final String MULTIPOLYGON = "MultiPolygon";
    private static final String POINT = "Point";
    private static final String POLYGON = "Polygon";
    private static final String PROPERTIES = "properties";
    private final JSONObject mGeoJsonFile;
    private final ArrayList<GeoJsonFeature> mGeoJsonFeatures = new ArrayList<>();
    private LatLngBounds mBoundingBox = null;

    public static Geometry parseGeometry(JSONObject jSONObject) throws JSONException {
        String string;
        JSONArray jSONArray;
        try {
            string = jSONObject.getString("type");
        } catch (JSONException unused) {
        }
        if (!string.equals(GEOMETRY_COLLECTION)) {
            if (isGeometry(string)) {
                jSONArray = jSONObject.getJSONArray(GEOMETRY_COORDINATES_ARRAY);
            }
            return null;
        }
        jSONArray = jSONObject.getJSONArray(GEOMETRY_COLLECTION_ARRAY);
        return createGeometry(string, jSONArray);
    }

    private static class LatLngAlt {
        public final Double altitude;
        public final LatLng latLng;

        LatLngAlt(LatLng latLng, Double d10) {
            this.latLng = latLng;
            this.altitude = d10;
        }
    }

    private static GeoJsonGeometryCollection createGeometryCollection(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Geometry geometry = parseGeometry(jSONArray.getJSONObject(i10));
            if (geometry != null) {
                arrayList.add(geometry);
            }
        }
        return new GeoJsonGeometryCollection(arrayList);
    }

    private static GeoJsonMultiLineString createMultiLineString(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(createLineString(jSONArray.getJSONArray(i10)));
        }
        return new GeoJsonMultiLineString(arrayList);
    }

    private static GeoJsonMultiPoint createMultiPoint(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(createPoint(jSONArray.getJSONArray(i10)));
        }
        return new GeoJsonMultiPoint(arrayList);
    }

    private static GeoJsonMultiPolygon createMultiPolygon(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(createPolygon(jSONArray.getJSONArray(i10)));
        }
        return new GeoJsonMultiPolygon(arrayList);
    }

    private static GeoJsonPolygon createPolygon(JSONArray jSONArray) throws JSONException {
        return new GeoJsonPolygon(parseCoordinatesArrays(jSONArray));
    }

    private static boolean isGeometry(String str) {
        return str.matches("Point|MultiPoint|LineString|MultiLineString|Polygon|MultiPolygon|GeometryCollection");
    }

    private static LatLngBounds parseBoundingBox(JSONArray jSONArray) throws JSONException {
        return new LatLngBounds(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), new LatLng(jSONArray.getDouble(3), jSONArray.getDouble(2)));
    }

    private static LatLngAlt parseCoordinate(JSONArray jSONArray) throws JSONException {
        return new LatLngAlt(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), jSONArray.length() < 3 ? null : Double.valueOf(jSONArray.getDouble(2)));
    }

    private static ArrayList<LatLngAlt> parseCoordinatesArray(JSONArray jSONArray) throws JSONException {
        ArrayList<LatLngAlt> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(parseCoordinate(jSONArray.getJSONArray(i10)));
        }
        return arrayList;
    }

    private static ArrayList<ArrayList<LatLng>> parseCoordinatesArrays(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            ArrayList<LatLngAlt> coordinatesArray = parseCoordinatesArray(jSONArray.getJSONArray(i10));
            ArrayList<LatLng> arrayList2 = new ArrayList<>();
            Iterator<LatLngAlt> it = coordinatesArray.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().latLng);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private static GeoJsonFeature parseFeature(JSONObject jSONObject) {
        HashMap<String, String> map = new HashMap<>();
        try {
            String string = jSONObject.has("id") ? jSONObject.getString("id") : null;
            LatLngBounds boundingBox = jSONObject.has(BOUNDING_BOX) ? parseBoundingBox(jSONObject.getJSONArray(BOUNDING_BOX)) : null;
            Geometry geometry = (!jSONObject.has(FEATURE_GEOMETRY) || jSONObject.isNull(FEATURE_GEOMETRY)) ? null : parseGeometry(jSONObject.getJSONObject(FEATURE_GEOMETRY));
            if (jSONObject.has(PROPERTIES) && !jSONObject.isNull(PROPERTIES)) {
                map = parseProperties(jSONObject.getJSONObject(PROPERTIES));
            }
            return new GeoJsonFeature(geometry, string, map, boundingBox);
        } catch (JSONException unused) {
            FS.log_w(LOG_TAG, "Feature could not be successfully parsed " + jSONObject.toString());
            return null;
        }
    }

    private ArrayList<GeoJsonFeature> parseFeatureCollection(JSONObject jSONObject) throws JSONException {
        ArrayList<GeoJsonFeature> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(FEATURE_COLLECTION_ARRAY);
            if (jSONObject.has(BOUNDING_BOX)) {
                this.mBoundingBox = parseBoundingBox(jSONObject.getJSONArray(BOUNDING_BOX));
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    if (jSONObject2.getString("type").equals(FEATURE)) {
                        GeoJsonFeature feature = parseFeature(jSONObject2);
                        if (feature != null) {
                            arrayList.add(feature);
                        } else {
                            FS.log_w(LOG_TAG, "Index of Feature in Feature Collection that could not be created: " + i10);
                        }
                    }
                } catch (JSONException unused) {
                    FS.log_w(LOG_TAG, "Index of Feature in Feature Collection that could not be created: " + i10);
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
            FS.log_w(LOG_TAG, "Feature Collection could not be created.");
            return arrayList;
        }
    }

    private void parseGeoJson() throws JSONException {
        try {
            String string = this.mGeoJsonFile.getString("type");
            if (string.equals(FEATURE)) {
                GeoJsonFeature feature = parseFeature(this.mGeoJsonFile);
                if (feature != null) {
                    this.mGeoJsonFeatures.add(feature);
                    return;
                }
                return;
            }
            if (string.equals(FEATURE_COLLECTION)) {
                this.mGeoJsonFeatures.addAll(parseFeatureCollection(this.mGeoJsonFile));
                return;
            }
            if (!isGeometry(string)) {
                FS.log_w(LOG_TAG, "GeoJSON file could not be parsed.");
                return;
            }
            GeoJsonFeature geometryToFeature = parseGeometryToFeature(this.mGeoJsonFile);
            if (geometryToFeature != null) {
                this.mGeoJsonFeatures.add(geometryToFeature);
            }
        } catch (JSONException unused) {
            FS.log_w(LOG_TAG, "GeoJSON file could not be parsed.");
        }
    }

    private static HashMap<String, String> parseProperties(JSONObject jSONObject) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
        }
        return map;
    }

    public LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    public ArrayList<GeoJsonFeature> getFeatures() {
        return this.mGeoJsonFeatures;
    }

    public GeoJsonParser(JSONObject jSONObject) throws JSONException {
        this.mGeoJsonFile = jSONObject;
        parseGeoJson();
    }

    private static Geometry createGeometry(String str, JSONArray jSONArray) throws JSONException {
        str.getClass();
        switch (str) {
            case "MultiPolygon":
                return createMultiPolygon(jSONArray);
            case "MultiPoint":
                return createMultiPoint(jSONArray);
            case "MultiLineString":
                return createMultiLineString(jSONArray);
            case "Point":
                return createPoint(jSONArray);
            case "Polygon":
                return createPolygon(jSONArray);
            case "LineString":
                return createLineString(jSONArray);
            case "GeometryCollection":
                return createGeometryCollection(jSONArray);
            default:
                return null;
        }
    }

    private static GeoJsonLineString createLineString(JSONArray jSONArray) throws JSONException {
        ArrayList<LatLngAlt> coordinatesArray = parseCoordinatesArray(jSONArray);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<LatLngAlt> it = coordinatesArray.iterator();
        while (it.hasNext()) {
            LatLngAlt next = it.next();
            arrayList.add(next.latLng);
            Double d10 = next.altitude;
            if (d10 != null) {
                arrayList2.add(d10);
            }
        }
        return new GeoJsonLineString(arrayList, arrayList2);
    }

    private static GeoJsonPoint createPoint(JSONArray jSONArray) throws JSONException {
        LatLngAlt coordinate = parseCoordinate(jSONArray);
        return new GeoJsonPoint(coordinate.latLng, coordinate.altitude);
    }

    private static GeoJsonFeature parseGeometryToFeature(JSONObject jSONObject) throws JSONException {
        Geometry geometry = parseGeometry(jSONObject);
        if (geometry != null) {
            return new GeoJsonFeature(geometry, null, new HashMap(), null);
        }
        FS.log_w(LOG_TAG, "Geometry could not be parsed");
        return null;
    }
}
