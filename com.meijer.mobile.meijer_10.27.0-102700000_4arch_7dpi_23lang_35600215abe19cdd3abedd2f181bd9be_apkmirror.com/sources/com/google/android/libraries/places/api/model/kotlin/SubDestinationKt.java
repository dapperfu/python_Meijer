package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.SubDestination;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"subDestination", "Lcom/google/android/libraries/places/api/model/SubDestination;", PreferencesHelper.PREF_ID, "", "name", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubDestinationKt {
    public static final SubDestination subDestination(@RecentlyNonNull String id2, @RecentlyNonNull String name) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(name, "name");
        SubDestination subDestinationNewInstance = SubDestination.newInstance(id2, name);
        Intrinsics.i(subDestinationNewInstance, "newInstance(...)");
        return subDestinationNewInstance;
    }
}
