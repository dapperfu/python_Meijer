package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class AddressComponents implements Parcelable {
    @RecentlyNonNull
    public abstract List<AddressComponent> asList();

    @RecentlyNonNull
    public static AddressComponents newInstance(@RecentlyNonNull List<AddressComponent> list) {
        return new zzbs(list);
    }
}
