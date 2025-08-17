package com.google.maps.android.data;

import Kd.C3945c;
import com.google.maps.android.data.geojson.GeoJsonLineStringStyle;
import com.google.maps.android.data.geojson.GeoJsonPointStyle;
import com.google.maps.android.data.geojson.GeoJsonPolygonStyle;
import com.google.maps.android.data.geojson.GeoJsonRenderer;
import com.google.maps.android.data.kml.KmlContainer;
import com.google.maps.android.data.kml.KmlGroundOverlay;
import com.google.maps.android.data.kml.KmlRenderer;

/* loaded from: classes7.dex */
public abstract class Layer {
    private Renderer mRenderer;

    public interface OnFeatureClickListener {
        void onFeatureClick(Feature feature);
    }

    public abstract void addLayerToMap();

    protected void addFeature(Feature feature) {
        this.mRenderer.addFeature(feature);
    }

    protected void addGeoJsonToMap() {
        Renderer renderer = this.mRenderer;
        if (!(renderer instanceof GeoJsonRenderer)) {
            throw new UnsupportedOperationException("Stored renderer is not a GeoJsonRenderer");
        }
        ((GeoJsonRenderer) renderer).addLayerToMap();
    }

    protected void addKMLToMap() {
        Renderer renderer = this.mRenderer;
        if (!(renderer instanceof KmlRenderer)) {
            throw new UnsupportedOperationException("Stored renderer is not a KmlRenderer");
        }
        ((KmlRenderer) renderer).addLayerToMap();
    }

    public Feature getContainerFeature(Object obj) {
        return this.mRenderer.getContainerFeature(obj);
    }

    protected Iterable<KmlContainer> getContainers() {
        Renderer renderer = this.mRenderer;
        if (renderer instanceof KmlRenderer) {
            return ((KmlRenderer) renderer).getNestedContainers();
        }
        return null;
    }

    public GeoJsonLineStringStyle getDefaultLineStringStyle() {
        return this.mRenderer.getDefaultLineStringStyle();
    }

    public GeoJsonPointStyle getDefaultPointStyle() {
        return this.mRenderer.getDefaultPointStyle();
    }

    public GeoJsonPolygonStyle getDefaultPolygonStyle() {
        return this.mRenderer.getDefaultPolygonStyle();
    }

    public Feature getFeature(Object obj) {
        return this.mRenderer.getFeature(obj);
    }

    public Iterable<? extends Feature> getFeatures() {
        return this.mRenderer.getFeatures();
    }

    protected Iterable<KmlGroundOverlay> getGroundOverlays() {
        Renderer renderer = this.mRenderer;
        if (renderer instanceof KmlRenderer) {
            return ((KmlRenderer) renderer).getGroundOverlays();
        }
        return null;
    }

    public C3945c getMap() {
        return this.mRenderer.getMap();
    }

    protected boolean hasContainers() {
        Renderer renderer = this.mRenderer;
        if (renderer instanceof KmlRenderer) {
            return ((KmlRenderer) renderer).hasNestedContainers();
        }
        return false;
    }

    protected boolean hasFeatures() {
        return this.mRenderer.hasFeatures();
    }

    public boolean isLayerOnMap() {
        return this.mRenderer.isLayerOnMap();
    }

    protected void removeFeature(Feature feature) {
        this.mRenderer.removeFeature(feature);
    }

    public void removeLayerFromMap() {
        Renderer renderer = this.mRenderer;
        if (renderer instanceof GeoJsonRenderer) {
            ((GeoJsonRenderer) renderer).removeLayerFromMap();
        } else if (renderer instanceof KmlRenderer) {
            ((KmlRenderer) renderer).removeLayerFromMap();
        }
    }

    public void setMap(C3945c c3945c) {
        this.mRenderer.setMap(c3945c);
    }

    public void setOnFeatureClickListener(OnFeatureClickListener onFeatureClickListener) {
        this.mRenderer.setOnFeatureClickListener(onFeatureClickListener);
    }

    protected void storeRenderer(Renderer renderer) {
        this.mRenderer = renderer;
    }
}
