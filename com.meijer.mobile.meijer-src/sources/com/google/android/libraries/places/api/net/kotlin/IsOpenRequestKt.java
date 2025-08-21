package com.google.android.libraries.places.api.net.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.IsOpenRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u000b\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"isOpenRequest", "Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "placeId", "", "utcTimeMillis", "", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/IsOpenRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "place", "Lcom/google/android/libraries/places/api/model/Place;", "(Lcom/google/android/libraries/places/api/model/Place;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IsOpenRequestKt {
    public static final IsOpenRequest isOpenRequest(@RecentlyNonNull Place place, Long l10, Function1<? super IsOpenRequest.Builder, Unit> function1) {
        Intrinsics.j(place, "place");
        IsOpenRequest.Builder builder = l10 == null ? IsOpenRequest.builder(place) : IsOpenRequest.builder(place, l10.longValue());
        if (function1 != null) {
            function1.invoke(builder);
        }
        IsOpenRequest isOpenRequestBuild = builder.build();
        Intrinsics.i(isOpenRequestBuild, "build(...)");
        return isOpenRequestBuild;
    }

    @RecentlyNonNull
    public static /* synthetic */ IsOpenRequest isOpenRequest$default(@RecentlyNonNull Place place, @RecentlyNonNull Long l10, @RecentlyNonNull Function1 function1, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return isOpenRequest(place, l10, (Function1<? super IsOpenRequest.Builder, Unit>) function1);
    }

    @RecentlyNonNull
    public static /* synthetic */ IsOpenRequest isOpenRequest$default(@RecentlyNonNull String str, @RecentlyNonNull Long l10, @RecentlyNonNull Function1 function1, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return isOpenRequest(str, l10, (Function1<? super IsOpenRequest.Builder, Unit>) function1);
    }

    public static final IsOpenRequest isOpenRequest(@RecentlyNonNull String placeId, Long l10, Function1<? super IsOpenRequest.Builder, Unit> function1) {
        IsOpenRequest.Builder builder;
        Intrinsics.j(placeId, "placeId");
        if (l10 == null) {
            builder = IsOpenRequest.builder(placeId);
        } else {
            builder = IsOpenRequest.builder(placeId, l10.longValue());
        }
        if (function1 != null) {
            function1.invoke(builder);
        }
        IsOpenRequest isOpenRequestBuild = builder.build();
        Intrinsics.i(isOpenRequestBuild, "build(...)");
        return isOpenRequestBuild;
    }
}
