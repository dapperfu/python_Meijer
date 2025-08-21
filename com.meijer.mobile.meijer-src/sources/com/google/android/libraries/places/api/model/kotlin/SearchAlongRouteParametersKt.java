package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Polyline;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"searchAlongRouteParameters", "Lcom/google/android/libraries/places/api/model/SearchAlongRouteParameters;", "polyline", "Lcom/google/android/libraries/places/api/model/Polyline;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchAlongRouteParametersKt {
    public static final SearchAlongRouteParameters searchAlongRouteParameters(@RecentlyNonNull Polyline polyline) {
        Intrinsics.j(polyline, "polyline");
        SearchAlongRouteParameters searchAlongRouteParametersNewInstance = SearchAlongRouteParameters.newInstance(polyline);
        Intrinsics.i(searchAlongRouteParametersNewInstance, "newInstance(...)");
        return searchAlongRouteParametersNewInstance;
    }
}
