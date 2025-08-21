package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"localTime", "Lcom/google/android/libraries/places/api/model/LocalTime;", "hours", "", "minutes", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalTimeKt {
    public static final LocalTime localTime(int i10, int i11) {
        LocalTime localTimeNewInstance = LocalTime.newInstance(i10, i11);
        Intrinsics.i(localTimeNewInstance, "newInstance(...)");
        return localTimeNewInstance;
    }
}
