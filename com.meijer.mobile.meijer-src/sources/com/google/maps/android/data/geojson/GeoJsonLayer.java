package com.google.maps.android.data.geojson;

import Md.C4110c;
import android.content.Context;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Layer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class GeoJsonLayer extends Layer {
    private LatLngBounds mBoundingBox;

    public interface GeoJsonOnFeatureClickListener extends Layer.OnFeatureClickListener {
    }

    public GeoJsonLayer(C4110c c4110c, JSONObject jSONObject, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("GeoJSON file cannot be null");
        }
        this.mBoundingBox = null;
        GeoJsonParser geoJsonParser = new GeoJsonParser(jSONObject);
        this.mBoundingBox = geoJsonParser.getBoundingBox();
        HashMap map = new HashMap();
        Iterator<GeoJsonFeature> it = geoJsonParser.getFeatures().iterator();
        while (it.hasNext()) {
            map.put(it.next(), null);
        }
        storeRenderer(new GeoJsonRenderer(c4110c, map, markerManager, polygonManager, polylineManager, groundOverlayManager));
    }

    private static JSONObject createJsonFileObject(InputStream inputStream) throws JSONException, IOException {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return new JSONObject(sb2.toString());
            }
            sb2.append(line);
        }
    }

    public void addFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        super.addFeature((Feature) geoJsonFeature);
    }

    public LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    public void removeFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        super.removeFeature((Feature) geoJsonFeature);
    }

    public String toString() {
        return "Collection{\n Bounding box=" + this.mBoundingBox + "\n}\n";
    }

    @Override // com.google.maps.android.data.Layer
    public void addLayerToMap() {
        super.addGeoJsonToMap();
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<GeoJsonFeature> getFeatures() {
        return super.getFeatures();
    }

    public GeoJsonLayer(C4110c c4110c, int i10, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) throws JSONException, IOException {
        this(c4110c, createJsonFileObject(context.getResources().openRawResource(i10)), markerManager, polygonManager, polylineManager, groundOverlayManager);
    }

    public GeoJsonLayer(C4110c c4110c, JSONObject jSONObject) {
        this(c4110c, jSONObject, null, null, null, null);
    }

    public GeoJsonLayer(C4110c c4110c, int i10, Context context) throws JSONException, IOException {
        this(c4110c, createJsonFileObject(context.getResources().openRawResource(i10)), null, null, null, null);
    }
}
