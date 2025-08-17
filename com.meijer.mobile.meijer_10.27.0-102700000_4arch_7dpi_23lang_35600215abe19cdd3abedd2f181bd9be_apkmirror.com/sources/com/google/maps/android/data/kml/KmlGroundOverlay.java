package com.google.maps.android.data.kml;

import Md.C4185k;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class KmlGroundOverlay {
    private final C4185k mGroundOverlayOptions;
    private String mImageUrl;
    private LatLngBounds mLatLngBox;
    private final Map<String, String> mProperties;

    C4185k getGroundOverlayOptions() {
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
        C4185k c4185k = new C4185k();
        this.mGroundOverlayOptions = c4185k;
        this.mImageUrl = str;
        this.mProperties = map;
        if (latLngBounds != null) {
            this.mLatLngBox = latLngBounds;
            c4185k.T2(latLngBounds);
            c4185k.T(f11);
            c4185k.U3(f10);
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c4185k.B3(z10);
            return;
        }
        throw new IllegalArgumentException("No LatLonBox given");
    }
}
