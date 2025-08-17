package com.google.android.libraries.places.api.net;

import Ce.L;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FindCurrentPlaceResponse {
    @RecentlyNonNull
    public abstract List<PlaceLikelihood> getPlaceLikelihoods();

    @RecentlyNonNull
    public static FindCurrentPlaceResponse newInstance(@RecentlyNonNull List<PlaceLikelihood> list) {
        return new zzo(L.s(list));
    }
}
