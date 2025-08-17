package com.google.android.libraries.places.internal;

import Ce.L;
import Td.AbstractC5232j;
import android.location.Location;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

/* loaded from: classes6.dex */
public interface zzfm {
    AbstractC5232j zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzmo zzmoVar);

    AbstractC5232j zzb(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar);

    AbstractC5232j zzc(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar);

    AbstractC5232j zzd(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, L l10, zzmo zzmoVar);
}
