package com.google.maps.android.data.geojson;

import Md.C4110c;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Renderer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes8.dex */
public class GeoJsonRenderer extends Renderer implements Observer {
    private static final Object FEATURE_NOT_ON_MAP = null;

    private void redrawFeatureToMap(GeoJsonFeature geoJsonFeature) {
        redrawFeatureToMap(geoJsonFeature, getMap());
    }

    private void redrawFeatureToMap(GeoJsonFeature geoJsonFeature, C4110c c4110c) {
        removeFromMap(getAllFeatures().get(geoJsonFeature));
        putFeatures(geoJsonFeature, FEATURE_NOT_ON_MAP);
        if (c4110c == null || !geoJsonFeature.hasGeometry()) {
            return;
        }
        putFeatures(geoJsonFeature, addGeoJsonFeatureToMap(geoJsonFeature, geoJsonFeature.getGeometry()));
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (observable instanceof GeoJsonFeature) {
            GeoJsonFeature geoJsonFeature = (GeoJsonFeature) observable;
            Object obj2 = getAllFeatures().get(geoJsonFeature);
            Object obj3 = FEATURE_NOT_ON_MAP;
            boolean z10 = obj2 != obj3;
            if (z10 && geoJsonFeature.hasGeometry()) {
                redrawFeatureToMap(geoJsonFeature);
                return;
            }
            if (z10 && !geoJsonFeature.hasGeometry()) {
                removeFromMap(getAllFeatures().get(geoJsonFeature));
                putFeatures(geoJsonFeature, obj3);
            } else {
                if (z10 || !geoJsonFeature.hasGeometry()) {
                    return;
                }
                addFeature(geoJsonFeature);
            }
        }
    }

    GeoJsonRenderer(C4110c c4110c, HashMap<GeoJsonFeature, Object> map, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        super(c4110c, map, markerManager, polygonManager, polylineManager, groundOverlayManager);
    }

    public void addFeature(GeoJsonFeature geoJsonFeature) {
        super.addFeature((Feature) geoJsonFeature);
        if (isLayerOnMap()) {
            geoJsonFeature.addObserver(this);
        }
    }

    public void addLayerToMap() {
        if (!isLayerOnMap()) {
            setLayerVisibility(true);
            Iterator<Feature> it = super.getFeatures().iterator();
            while (it.hasNext()) {
                addFeature((GeoJsonFeature) it.next());
            }
        }
    }

    public void removeFeature(GeoJsonFeature geoJsonFeature) {
        super.removeFeature((Feature) geoJsonFeature);
        if (super.getFeatures().contains(geoJsonFeature)) {
            geoJsonFeature.deleteObserver(this);
        }
    }

    public void removeLayerFromMap() {
        if (isLayerOnMap()) {
            for (Feature feature : super.getFeatures()) {
                removeFromMap(super.getAllFeatures().get(feature));
                feature.deleteObserver(this);
            }
            setLayerVisibility(false);
        }
    }

    @Override // com.google.maps.android.data.Renderer
    public void setMap(C4110c c4110c) {
        super.setMap(c4110c);
        Iterator<Feature> it = super.getFeatures().iterator();
        while (it.hasNext()) {
            redrawFeatureToMap((GeoJsonFeature) it.next(), c4110c);
        }
    }
}
