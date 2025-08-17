package com.google.android.libraries.places.internal;

import Td.AbstractC5232j;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;

/* loaded from: classes6.dex */
public interface zzme {
    void zza(FindCurrentPlaceRequest findCurrentPlaceRequest, AbstractC5232j abstractC5232j, long j10, long j11, zzmo zzmoVar);

    void zzb(AbstractC5232j abstractC5232j, long j10, long j11, zzmo zzmoVar);

    void zzc(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar);

    void zzd(AbstractC5232j abstractC5232j, long j10, long j11, zzmo zzmoVar);

    void zze(SearchByTextRequest searchByTextRequest, zzmo zzmoVar);

    void zzf(SearchByTextRequest searchByTextRequest, AbstractC5232j abstractC5232j, long j10, long j11, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzg(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, zzmo zzmoVar);

    void zzh(AbstractC5232j abstractC5232j, long j10, long j11, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzi(SearchNearbyRequest searchNearbyRequest, zzmo zzmoVar);

    void zzj(SearchNearbyRequest searchNearbyRequest, AbstractC5232j abstractC5232j, long j10, long j11, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzk(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i10, zzmo zzmoVar);

    void zzl(AbstractC5232j abstractC5232j, long j10, long j11, int i10, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzm(FetchPlaceRequest fetchPlaceRequest, int i10, zzmo zzmoVar);

    void zzn(AbstractC5232j abstractC5232j, long j10, long j11, int i10, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzo(FetchPlaceRequest fetchPlaceRequest, int i10, zzmo zzmoVar);
}
