package com.google.android.libraries.places.widget;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceSearchFragmentListener;", "", "onLoad", "", "places", "", "Lcom/google/android/libraries/places/api/model/Place;", "onPlaceSelected", "place", "onRequestError", "e", "Ljava/lang/Exception;", "java.com.google.android.libraries.places.widget_place_search_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PlaceSearchFragmentListener {
    void onLoad(@RecentlyNonNull List<? extends Place> places);

    default void onPlaceSelected(@RecentlyNonNull Place place) {
        Intrinsics.j(place, "place");
    }

    void onRequestError(@RecentlyNonNull Exception e10);
}
