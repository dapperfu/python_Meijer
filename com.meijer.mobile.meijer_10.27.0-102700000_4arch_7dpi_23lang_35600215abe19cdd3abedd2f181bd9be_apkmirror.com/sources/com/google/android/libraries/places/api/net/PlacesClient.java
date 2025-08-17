package com.google.android.libraries.places.api.net;

import Td.AbstractC5232j;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.internal.zzmo;

/* loaded from: classes6.dex */
public interface PlacesClient {
    @RecentlyNonNull
    AbstractC5232j<FetchPhotoResponse> fetchPhoto(@RecentlyNonNull FetchPhotoRequest fetchPhotoRequest);

    @RecentlyNonNull
    AbstractC5232j<FetchPlaceResponse> fetchPlace(@RecentlyNonNull FetchPlaceRequest fetchPlaceRequest);

    @RecentlyNonNull
    AbstractC5232j<FetchResolvedPhotoUriResponse> fetchResolvedPhotoUri(@RecentlyNonNull FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest);

    @RecentlyNonNull
    AbstractC5232j<FindAutocompletePredictionsResponse> findAutocompletePredictions(@RecentlyNonNull FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    @RecentlyNonNull
    AbstractC5232j<FindCurrentPlaceResponse> findCurrentPlace(@RecentlyNonNull FindCurrentPlaceRequest findCurrentPlaceRequest);

    @RecentlyNonNull
    AbstractC5232j<IsOpenResponse> isOpen(@RecentlyNonNull IsOpenRequest isOpenRequest);

    @RecentlyNonNull
    AbstractC5232j<SearchByTextResponse> searchByText(@RecentlyNonNull SearchByTextRequest searchByTextRequest);

    @RecentlyNonNull
    AbstractC5232j<SearchNearbyResponse> searchNearby(@RecentlyNonNull SearchNearbyRequest searchNearbyRequest);

    AbstractC5232j zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzmo zzmoVar);

    AbstractC5232j zzb(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar);

    AbstractC5232j zzc(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, zzmo zzmoVar);

    AbstractC5232j zzd(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar);

    @RecentlyNonNull
    AbstractC5232j zze(@RecentlyNonNull LatLng latLng);

    AbstractC5232j zzf(FindCurrentPlaceRequest findCurrentPlaceRequest, zzmo zzmoVar);

    AbstractC5232j zzh(IsOpenRequest isOpenRequest, zzmo zzmoVar);

    AbstractC5232j zzi(SearchByTextRequest searchByTextRequest, zzmo zzmoVar);

    AbstractC5232j zzj(SearchNearbyRequest searchNearbyRequest, zzmo zzmoVar);

    void zzk();

    void zzl();

    void zzm();
}
