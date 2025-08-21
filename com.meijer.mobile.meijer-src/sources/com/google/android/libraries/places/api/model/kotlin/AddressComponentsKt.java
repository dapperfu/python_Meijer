package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"addressComponents", "Lcom/google/android/libraries/places/api/model/AddressComponents;", "", "Lcom/google/android/libraries/places/api/model/AddressComponent;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressComponentsKt {
    public static final AddressComponents addressComponents(@RecentlyNonNull List<? extends AddressComponent> addressComponents) {
        Intrinsics.j(addressComponents, "addressComponents");
        AddressComponents addressComponentsNewInstance = AddressComponents.newInstance(addressComponents);
        Intrinsics.i(addressComponentsNewInstance, "newInstance(...)");
        return addressComponentsNewInstance;
    }
}
