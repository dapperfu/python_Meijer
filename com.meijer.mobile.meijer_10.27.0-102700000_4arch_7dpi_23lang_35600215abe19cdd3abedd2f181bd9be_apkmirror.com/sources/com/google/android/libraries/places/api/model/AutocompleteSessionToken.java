package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.UUID;

/* loaded from: classes6.dex */
public abstract class AutocompleteSessionToken implements Parcelable {
    abstract ParcelUuid zza();

    @RecentlyNonNull
    public static AutocompleteSessionToken newInstance() {
        return new zzcc(new ParcelUuid(UUID.randomUUID()));
    }

    @RecentlyNonNull
    public final String toString() {
        return zza().toString();
    }
}
