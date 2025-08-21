package com.google.android.libraries.places.widget.listener;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
public interface PlaceSelectionListener {
    void onError(@RecentlyNonNull Status status);

    void onPlaceSelected(@RecentlyNonNull Place place);
}
