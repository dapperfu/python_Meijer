package com.google.android.libraries.places.api.net.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"searchByTextRequest", "Lcom/google/android/libraries/places/api/net/SearchByTextRequest;", "textQuery", "", "placeFields", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/SearchByTextRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchByTextRequestKt {
    public static final SearchByTextRequest searchByTextRequest(@RecentlyNonNull String textQuery, @RecentlyNonNull List<? extends Place.Field> placeFields, Function1<? super SearchByTextRequest.Builder, Unit> function1) {
        Intrinsics.j(textQuery, "textQuery");
        Intrinsics.j(placeFields, "placeFields");
        SearchByTextRequest.Builder builder = SearchByTextRequest.builder(textQuery, placeFields);
        if (function1 != null) {
            function1.invoke(builder);
        }
        SearchByTextRequest searchByTextRequestBuild = builder.build();
        Intrinsics.i(searchByTextRequestBuild, "build(...)");
        return searchByTextRequestBuild;
    }

    @RecentlyNonNull
    public static /* synthetic */ SearchByTextRequest searchByTextRequest$default(@RecentlyNonNull String str, @RecentlyNonNull List list, @RecentlyNonNull Function1 function1, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return searchByTextRequest(str, list, function1);
    }
}
