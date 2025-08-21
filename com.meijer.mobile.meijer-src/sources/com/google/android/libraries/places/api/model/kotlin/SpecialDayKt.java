package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.LocalDate;
import com.google.android.libraries.places.api.model.SpecialDay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001b\b\u0002\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"specialDay", "Lcom/google/android/libraries/places/api/model/SpecialDay;", "date", "Lcom/google/android/libraries/places/api/model/LocalDate;", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/SpecialDay$Builder;", "", "Lkotlin/ExtensionFunctionType;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpecialDayKt {
    public static final SpecialDay specialDay(@RecentlyNonNull LocalDate date, Function1<? super SpecialDay.Builder, Unit> function1) {
        Intrinsics.j(date, "date");
        SpecialDay.Builder builder = SpecialDay.builder(date);
        if (function1 != null) {
            function1.invoke(builder);
        }
        SpecialDay specialDayBuild = builder.build();
        Intrinsics.i(specialDayBuild, "build(...)");
        return specialDayBuild;
    }

    @RecentlyNonNull
    public static /* synthetic */ SpecialDay specialDay$default(@RecentlyNonNull LocalDate localDate, @RecentlyNonNull Function1 function1, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return specialDay(localDate, function1);
    }
}
