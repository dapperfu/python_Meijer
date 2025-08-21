package com.google.maps.android.clustering;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes8.dex */
public interface ClusterItem {
    LatLng getPosition();

    String getSnippet();

    String getTitle();

    Float getZIndex();
}
