package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.clustering.ClusterItem;

/* loaded from: classes7.dex */
public interface ScreenBasedAlgorithm<T extends ClusterItem> extends Algorithm<T> {
    void onCameraChange(CameraPosition cameraPosition);

    boolean shouldReclusterOnMapMovement();
}
