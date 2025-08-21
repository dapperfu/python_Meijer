package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.RouteModifiers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u001b\b\u0002\u0010\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"routeModifiers", "Lcom/google/android/libraries/places/api/model/RouteModifiers;", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/RouteModifiers$Builder;", "", "Lkotlin/ExtensionFunctionType;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RouteModifiersKt {
    @RecentlyNonNull
    public static /* synthetic */ RouteModifiers routeModifiers$default(@RecentlyNonNull Function1 function1, int i10, @RecentlyNonNull Object obj) {
        if (1 == (i10 & 1)) {
            function1 = null;
        }
        return routeModifiers(function1);
    }

    public static final RouteModifiers routeModifiers(Function1<? super RouteModifiers.Builder, Unit> function1) {
        RouteModifiers.Builder builder = RouteModifiers.builder();
        if (function1 != null) {
            function1.invoke(builder);
        }
        RouteModifiers routeModifiersBuild = builder.build();
        Intrinsics.i(routeModifiersBuild, "build(...)");
        return routeModifiersBuild;
    }
}
