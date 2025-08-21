package com.google.android.libraries.places.api.net;

import Vd.AbstractC5516j;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.internal.zzmo;

/* loaded from: classes6.dex */
public interface PlacesClient {
    @RecentlyNonNull
    AbstractC5516j<FetchPhotoResponse> fetchPhoto(@RecentlyNonNull FetchPhotoRequest fetchPhotoRequest);

    @RecentlyNonNull
    AbstractC5516j<FetchPlaceResponse> fetchPlace(@RecentlyNonNull FetchPlaceRequest fetchPlaceRequest);

    @RecentlyNonNull
    AbstractC5516j<FetchResolvedPhotoUriResponse> fetchResolvedPhotoUri(@RecentlyNonNull FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest);

    @RecentlyNonNull
    AbstractC5516j<FindAutocompletePredictionsResponse> findAutocompletePredictions(@RecentlyNonNull FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    @RecentlyNonNull
    AbstractC5516j<FindCurrentPlaceResponse> findCurrentPlace(@RecentlyNonNull FindCurrentPlaceRequest findCurrentPlaceRequest);

    @RecentlyNonNull
    AbstractC5516j<IsOpenResponse> isOpen(@RecentlyNonNull IsOpenRequest isOpenRequest);

    @RecentlyNonNull
    AbstractC5516j<SearchByTextResponse> searchByText(@RecentlyNonNull SearchByTextRequest searchByTextRequest);

    @RecentlyNonNull
    AbstractC5516j<SearchNearbyResponse> searchNearby(@RecentlyNonNull SearchNearbyRequest searchNearbyRequest);

    AbstractC5516j zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzmo zzmoVar);

    AbstractC5516j zzb(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar);

    AbstractC5516j zzc(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, zzmo zzmoVar);

    AbstractC5516j zzd(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar);

    @RecentlyNonNull
    AbstractC5516j zze(@RecentlyNonNull LatLng latLng);

    AbstractC5516j zzf(FindCurrentPlaceRequest findCurrentPlaceRequest, zzmo zzmoVar);

    AbstractC5516j zzh(IsOpenRequest isOpenRequest, zzmo zzmoVar);

    AbstractC5516j zzi(SearchByTextRequest searchByTextRequest, zzmo zzmoVar);

    AbstractC5516j zzj(SearchNearbyRequest searchNearbyRequest, zzmo zzmoVar);

    void zzk();

    void zzl();

    void zzm();
}
