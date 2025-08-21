package com.google.android.libraries.places.api.net.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"findAutocompletePredictionsRequest", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FindAutocompletePredictionsRequestKt {
    public static final FindAutocompletePredictionsRequest findAutocompletePredictionsRequest(@RecentlyNonNull Function1<? super FindAutocompletePredictionsRequest.Builder, Unit> actions) {
        Intrinsics.j(actions, "actions");
        FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
        actions.invoke(builder);
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequestBuild = builder.build();
        Intrinsics.i(findAutocompletePredictionsRequestBuild, "build(...)");
        return findAutocompletePredictionsRequestBuild;
    }
}
