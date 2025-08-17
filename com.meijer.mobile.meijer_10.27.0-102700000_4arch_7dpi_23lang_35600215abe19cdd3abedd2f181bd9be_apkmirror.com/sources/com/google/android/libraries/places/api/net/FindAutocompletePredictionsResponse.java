package com.google.android.libraries.places.api.net;

import Ce.L;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FindAutocompletePredictionsResponse {
    @RecentlyNonNull
    public abstract List<AutocompletePrediction> getAutocompletePredictions();

    @RecentlyNonNull
    public static FindAutocompletePredictionsResponse newInstance(@RecentlyNonNull List<AutocompletePrediction> list) {
        return new zzl(L.s(list));
    }
}
