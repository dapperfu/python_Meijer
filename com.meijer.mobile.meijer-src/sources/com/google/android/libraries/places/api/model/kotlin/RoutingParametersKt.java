package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.RoutingParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u001b\b\u0002\u0010\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"routingParameters", "Lcom/google/android/libraries/places/api/model/RoutingParameters;", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/RoutingParameters$Builder;", "", "Lkotlin/ExtensionFunctionType;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoutingParametersKt {
    @RecentlyNonNull
    public static /* synthetic */ RoutingParameters routingParameters$default(@RecentlyNonNull Function1 function1, int i10, @RecentlyNonNull Object obj) {
        if (1 == (i10 & 1)) {
            function1 = null;
        }
        return routingParameters(function1);
    }

    public static final RoutingParameters routingParameters(Function1<? super RoutingParameters.Builder, Unit> function1) {
        RoutingParameters.Builder builder = RoutingParameters.builder();
        if (function1 != null) {
            function1.invoke(builder);
        }
        RoutingParameters routingParametersBuild = builder.build();
        Intrinsics.i(routingParametersBuild, "build(...)");
        return routingParametersBuild;
    }
}
