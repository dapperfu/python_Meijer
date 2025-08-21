package com.google.maps.android.data.kml;

import Od.C4462j;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class KmlContainer {
    private String mContainerId;
    private final ArrayList<KmlContainer> mContainers;
    private final HashMap<KmlGroundOverlay, C4462j> mGroundOverlays;
    private final HashMap<KmlPlacemark, Object> mPlacemarks;
    private final HashMap<String, String> mProperties;
    private final HashMap<String, String> mStyleMap;
    private HashMap<String, KmlStyle> mStyles;

    public String getContainerId() {
        return this.mContainerId;
    }

    public Iterable<KmlContainer> getContainers() {
        return this.mContainers;
    }

    HashMap<KmlGroundOverlay, C4462j> getGroundOverlayHashMap() {
        return this.mGroundOverlays;
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return this.mGroundOverlays.keySet();
    }

    public Iterable<KmlPlacemark> getPlacemarks() {
        return this.mPlacemarks.keySet();
    }

    HashMap<KmlPlacemark, Object> getPlacemarksHashMap() {
        return this.mPlacemarks;
    }

    public Iterable<String> getProperties() {
        return this.mProperties.keySet();
    }

    public String getProperty(String str) {
        return this.mProperties.get(str);
    }

    public KmlStyle getStyle(String str) {
        return this.mStyles.get(str);
    }

    public String getStyleIdFromMap(String str) {
        return this.mStyleMap.get(str);
    }

    HashMap<String, String> getStyleMap() {
        return this.mStyleMap;
    }

    HashMap<String, KmlStyle> getStyles() {
        return this.mStyles;
    }

    public boolean hasContainers() {
        return this.mContainers.size() > 0;
    }

    public boolean hasPlacemarks() {
        return this.mPlacemarks.size() > 0;
    }

    public boolean hasProperties() {
        return this.mProperties.size() > 0;
    }

    public boolean hasProperty(String str) {
        return this.mProperties.containsKey(str);
    }

    void setPlacemark(KmlPlacemark kmlPlacemark, Object obj) {
        this.mPlacemarks.put(kmlPlacemark, obj);
    }

    public String toString() {
        return "Container{\n properties=" + this.mProperties + ",\n placemarks=" + this.mPlacemarks + ",\n containers=" + this.mContainers + ",\n ground overlays=" + this.mGroundOverlays + ",\n style maps=" + this.mStyleMap + ",\n styles=" + this.mStyles + "\n}\n";
    }

    KmlContainer(HashMap<String, String> map, HashMap<String, KmlStyle> map2, HashMap<KmlPlacemark, Object> map3, HashMap<String, String> map4, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, C4462j> map5, String str) {
        this.mProperties = map;
        this.mPlacemarks = map3;
        this.mStyles = map2;
        this.mStyleMap = map4;
        this.mContainers = arrayList;
        this.mGroundOverlays = map5;
        this.mContainerId = str;
    }
}
