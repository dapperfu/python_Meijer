package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.AddressComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"addressComponent", "Lcom/google/android/libraries/places/api/model/AddressComponent;", "name", "", "types", "", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/AddressComponent$Builder;", "", "Lkotlin/ExtensionFunctionType;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressComponentKt {
    public static final AddressComponent addressComponent(@RecentlyNonNull String name, @RecentlyNonNull List<String> types, Function1<? super AddressComponent.Builder, Unit> function1) {
        Intrinsics.j(name, "name");
        Intrinsics.j(types, "types");
        AddressComponent.Builder builder = AddressComponent.builder(name, types);
        if (function1 != null) {
            function1.invoke(builder);
        }
        AddressComponent addressComponentBuild = builder.build();
        Intrinsics.i(addressComponentBuild, "build(...)");
        return addressComponentBuild;
    }

    @RecentlyNonNull
    public static /* synthetic */ AddressComponent addressComponent$default(@RecentlyNonNull String str, @RecentlyNonNull List list, @RecentlyNonNull Function1 function1, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return addressComponent(str, list, function1);
    }
}
