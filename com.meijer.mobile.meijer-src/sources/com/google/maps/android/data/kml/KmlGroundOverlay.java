package com.google.maps.android.data.kml;

import Od.C4463k;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class KmlGroundOverlay {
    private final C4463k mGroundOverlayOptions;
    private String mImageUrl;
    private LatLngBounds mLatLngBox;
    private final Map<String, String> mProperties;

    C4463k getGroundOverlayOptions() {
        return this.mGroundOverlayOptions;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public LatLngBounds getLatLngBox() {
        return this.mLatLngBox;
    }

    public Iterable<String> getProperties() {
        return this.mProperties.keySet();
    }

    public String getProperty(String str) {
        return this.mProperties.get(str);
    }

    public boolean hasProperty(String str) {
        return this.mProperties.get(str) != null;
    }

    public String toString() {
        return "GroundOverlay{\n properties=" + this.mProperties + ",\n image url=" + this.mImageUrl + ",\n LatLngBox=" + this.mLatLngBox + "\n}\n";
    }

    KmlGroundOverlay(String str, LatLngBounds latLngBounds, float f10, int i10, HashMap<String, String> map, float f11) {
        boolean z10;
        C4463k c4463k = new C4463k();
        this.mGroundOverlayOptions = c4463k;
        this.mImageUrl = str;
        this.mProperties = map;
        if (latLngBounds != null) {
            this.mLatLngBox = latLngBounds;
            c4463k.U2(latLngBounds);
            c4463k.T(f11);
            c4463k.U3(f10);
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c4463k.A3(z10);
            return;
        }
        throw new IllegalArgumentException("No LatLonBox given");
    }
}
