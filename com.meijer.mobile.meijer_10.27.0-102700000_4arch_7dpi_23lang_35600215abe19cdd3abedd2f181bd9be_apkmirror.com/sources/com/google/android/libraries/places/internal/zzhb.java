package com.google.android.libraries.places.internal;

import Be.p;
import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5225c;
import Td.InterfaceC5231i;
import android.location.Location;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.IsOpenRequest;
import com.google.android.libraries.places.api.net.IsOpenResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class zzhb implements PlacesClient {
    private final zzfm zza;
    private final zzfc zzb;
    private final zzfh zzc;
    private final zzme zzd;
    private final zzdy zze;
    private final zzip zzf;
    private final zzer zzg;
    private final zzmf zzh;

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest) {
        return zzg(findCurrentPlaceRequest, null, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j zzf(FindCurrentPlaceRequest findCurrentPlaceRequest, zzmo zzmoVar) {
        return zzg(findCurrentPlaceRequest, null, zzmoVar);
    }

    private static void zzK(zzez zzezVar, zzfa zzfaVar) {
        zzez.zzb(zzezVar, zzez.zza("Duration"));
        zzed.zza();
        zzed.zza();
        zzez.zzb(zzezVar, zzez.zza("Battery"));
        zzed.zza();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j<FetchPhotoResponse> fetchPhoto(FetchPhotoRequest fetchPhotoRequest) {
        return zzb(fetchPhotoRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j<FetchPlaceResponse> fetchPlace(FetchPlaceRequest fetchPlaceRequest) {
        return zzd(fetchPlaceRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j<FetchResolvedPhotoUriResponse> fetchResolvedPhotoUri(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest) {
        return zzc(fetchResolvedPhotoUriRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j<FindAutocompletePredictionsResponse> findAutocompletePredictions(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        return zza(findAutocompletePredictionsRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j<IsOpenResponse> isOpen(IsOpenRequest isOpenRequest) {
        return zzh(isOpenRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j<SearchByTextResponse> searchByText(SearchByTextRequest searchByTextRequest) {
        return zzi(searchByTextRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j<SearchNearbyResponse> searchNearby(SearchNearbyRequest searchNearbyRequest) {
        return zzj(searchNearbyRequest, zzmo.PROGRAMMATIC_API);
    }

    final /* synthetic */ FindCurrentPlaceResponse zzA(FindCurrentPlaceRequest findCurrentPlaceRequest, long j10, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zza(findCurrentPlaceRequest, abstractC5232j, j10, this.zze.zzb(), zzmoVar);
        zzK(zzez.zza("FindCurrentPlace"), zzfaVar);
        return (FindCurrentPlaceResponse) abstractC5232j.n();
    }

    final /* synthetic */ FetchPlaceResponse zzC(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zzo(fetchPlaceRequest, 2, zzmoVar);
        zzK(zzez.zza("IsOpenFetchPlace"), zzfaVar);
        return (FetchPlaceResponse) abstractC5232j.n();
    }

    final /* synthetic */ FetchPlaceResponse zzE(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zzo(fetchPlaceRequest, 3, zzmoVar);
        zzK(zzez.zza("IsOpenGetPlace"), zzfaVar);
        return (FetchPlaceResponse) abstractC5232j.n();
    }

    final /* synthetic */ SearchByTextResponse zzG(SearchByTextRequest searchByTextRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zze(searchByTextRequest, zzmoVar);
        zzK(zzez.zza("SearchByText"), zzfaVar);
        return (SearchByTextResponse) abstractC5232j.n();
    }

    final /* synthetic */ SearchNearbyResponse zzI(SearchNearbyRequest searchNearbyRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zzi(searchNearbyRequest, zzmoVar);
        zzK(zzez.zza("SearchNearby"), zzfaVar);
        return (SearchNearbyResponse) abstractC5232j.n();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j zza(final FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, final zzmo zzmoVar) throws Throwable {
        try {
            p.r(findAutocompletePredictionsRequest, "Request must not be null.");
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            if (!zzmoVar.equals(zzmo.PLACES_UI_KIT) && !zzmoVar.equals(zzmo.ONE_PLATFORM_AUTOCOMPLETE_WIDGET) && (!this.zzh.zzh() || zzmoVar.equals(zzmo.AUTOCOMPLETE_WIDGET))) {
                return this.zza.zza(findAutocompletePredictionsRequest, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzha
                    @Override // Td.InterfaceC5225c
                    public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                        return this.zza.zzn(findAutocompletePredictionsRequest, zzmoVar, zzfaVarZza, abstractC5232j);
                    }
                }).k(zzgc.zza);
            }
            return this.zzf.zzb(findAutocompletePredictionsRequest, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgn
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzp(findAutocompletePredictionsRequest, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).k(zzgs.zza);
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j zzb(final FetchPhotoRequest fetchPhotoRequest, final zzmo zzmoVar) {
        try {
            p.r(fetchPhotoRequest, "Request must not be null.");
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zza.zzb(fetchPhotoRequest, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgt
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzr(fetchPhotoRequest, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).k(zzgu.zza);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j zzc(final FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, final zzmo zzmoVar) {
        try {
            p.r(fetchResolvedPhotoUriRequest, "Request must not be null.");
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zzf.zzd(fetchResolvedPhotoUriRequest, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgv
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzt(fetchResolvedPhotoUriRequest, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).k(zzgw.zza);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j zzd(final FetchPlaceRequest fetchPlaceRequest, final zzmo zzmoVar) throws Throwable {
        try {
            p.r(fetchPlaceRequest, "Request must not be null.");
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return (!this.zzh.zzh() || zzmoVar.equals(zzmo.AUTOCOMPLETE_WIDGET)) ? this.zza.zzc(fetchPlaceRequest, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgx
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzv(fetchPlaceRequest, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).k(zzgy.zza) : this.zzf.zzc(fetchPlaceRequest, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgz
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzx(fetchPlaceRequest, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).k(zzgd.zza);
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j zze(LatLng latLng) {
        return this.zzf.zze(latLng);
    }

    public final AbstractC5232j zzg(final FindCurrentPlaceRequest findCurrentPlaceRequest, String str, final zzmo zzmoVar) {
        try {
            p.r(findCurrentPlaceRequest, "Request must not be null.");
            final long jZzb = this.zze.zzb();
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            final String str2 = null;
            return this.zzb.zza(findCurrentPlaceRequest.getCancellationToken()).s(new InterfaceC5231i(findCurrentPlaceRequest, str2, zzmoVar) { // from class: com.google.android.libraries.places.internal.zzge
                private final /* synthetic */ FindCurrentPlaceRequest zzb;
                private final /* synthetic */ zzmo zzc;

                {
                    this.zzc = zzmoVar;
                }

                @Override // Td.InterfaceC5231i
                public final /* synthetic */ AbstractC5232j then(Object obj) {
                    return this.zza.zzz(this.zzb, null, this.zzc, (Location) obj);
                }
            }).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgf
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzA(findCurrentPlaceRequest, jZzb, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).k(zzgg.zza);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j zzh(IsOpenRequest isOpenRequest, final zzmo zzmoVar) throws Throwable {
        List arrayList;
        try {
            p.r(isOpenRequest, "Request must not be null.");
            final Place place = isOpenRequest.getPlace();
            String placeId = isOpenRequest.getPlaceId();
            final long utcTimeMillis = isOpenRequest.getUtcTimeMillis();
            final C5233k c5233k = new C5233k();
            if (place == null) {
                int i10 = com.google.android.libraries.places.api.model.zzes.zza;
                arrayList = Arrays.asList(Place.Field.BUSINESS_STATUS, Place.Field.CURRENT_OPENING_HOURS, Place.Field.OPENING_HOURS, Place.Field.UTC_OFFSET);
            } else {
                int i11 = com.google.android.libraries.places.api.model.zzes.zza;
                arrayList = new ArrayList();
                Place.BusinessStatus businessStatus = place.getBusinessStatus();
                if (businessStatus == null || businessStatus == Place.BusinessStatus.OPERATIONAL) {
                    if (businessStatus == null) {
                        arrayList.add(Place.Field.BUSINESS_STATUS);
                    }
                    if (place.getCurrentOpeningHours() == null) {
                        arrayList.add(Place.Field.CURRENT_OPENING_HOURS);
                    }
                    if (place.getOpeningHours() == null) {
                        arrayList.add(Place.Field.OPENING_HOURS);
                    }
                    if (place.getUtcOffsetMinutes() == null) {
                        arrayList.add(Place.Field.UTC_OFFSET);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                c5233k.c(IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzes.zza((Place) p.q(place), utcTimeMillis)));
                return c5233k.a();
            }
            if (place != null) {
                placeId = place.getId();
            }
            FetchPlaceRequest.Builder builder = FetchPlaceRequest.builder((String) p.q(placeId), arrayList);
            builder.setCancellationToken(isOpenRequest.getCancellationToken());
            final FetchPlaceRequest fetchPlaceRequestBuild = builder.build();
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zzh.zzh() ? this.zzf.zzc(fetchPlaceRequestBuild, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgk
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzE(fetchPlaceRequestBuild, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).s(new InterfaceC5231i() { // from class: com.google.android.libraries.places.internal.zzgl
                @Override // Td.InterfaceC5231i
                public final /* synthetic */ AbstractC5232j then(Object obj) {
                    Place place2 = ((FetchPlaceResponse) obj).getPlace();
                    Place.BusinessStatus businessStatus2 = place2.getBusinessStatus();
                    OpeningHours currentOpeningHours = place2.getCurrentOpeningHours();
                    OpeningHours openingHours = place2.getOpeningHours();
                    Integer utcOffsetMinutes = place2.getUtcOffsetMinutes();
                    Place place3 = place;
                    if (place3 != null) {
                        if (utcOffsetMinutes == null) {
                            utcOffsetMinutes = place3.getUtcOffsetMinutes();
                        }
                        if (businessStatus2 == null) {
                            businessStatus2 = place3.getBusinessStatus();
                        }
                        if (currentOpeningHours == null) {
                            currentOpeningHours = place3.getCurrentOpeningHours();
                        }
                        if (openingHours == null) {
                            openingHours = place3.getOpeningHours();
                        }
                    }
                    C5233k c5233k2 = c5233k;
                    long j10 = utcTimeMillis;
                    Place.Builder builder2 = Place.builder();
                    builder2.setBusinessStatus(businessStatus2);
                    builder2.setCurrentOpeningHours(currentOpeningHours);
                    builder2.setOpeningHours(openingHours);
                    builder2.setUtcOffsetMinutes(utcOffsetMinutes);
                    c5233k2.c(IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzes.zza(builder2.build(), j10)));
                    return c5233k2.a();
                }
            }).k(zzgm.zza) : this.zza.zzc(fetchPlaceRequestBuild, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgh
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzC(fetchPlaceRequestBuild, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).s(new InterfaceC5231i() { // from class: com.google.android.libraries.places.internal.zzgi
                @Override // Td.InterfaceC5231i
                public final /* synthetic */ AbstractC5232j then(Object obj) {
                    Place place2 = ((FetchPlaceResponse) obj).getPlace();
                    Place.BusinessStatus businessStatus2 = place2.getBusinessStatus();
                    OpeningHours currentOpeningHours = place2.getCurrentOpeningHours();
                    OpeningHours openingHours = place2.getOpeningHours();
                    Integer utcOffsetMinutes = place2.getUtcOffsetMinutes();
                    Place place3 = place;
                    if (place3 != null) {
                        if (utcOffsetMinutes == null) {
                            utcOffsetMinutes = place3.getUtcOffsetMinutes();
                        }
                        if (businessStatus2 == null) {
                            businessStatus2 = place3.getBusinessStatus();
                        }
                        if (currentOpeningHours == null) {
                            currentOpeningHours = place3.getCurrentOpeningHours();
                        }
                        if (openingHours == null) {
                            openingHours = place3.getOpeningHours();
                        }
                    }
                    C5233k c5233k2 = c5233k;
                    long j10 = utcTimeMillis;
                    Place.Builder builder2 = Place.builder();
                    builder2.setBusinessStatus(businessStatus2);
                    builder2.setCurrentOpeningHours(currentOpeningHours);
                    builder2.setOpeningHours(openingHours);
                    builder2.setUtcOffsetMinutes(utcOffsetMinutes);
                    c5233k2.c(IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzes.zza(builder2.build(), j10)));
                    return c5233k2.a();
                }
            }).k(zzgj.zza);
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j zzi(final SearchByTextRequest searchByTextRequest, final zzmo zzmoVar) {
        try {
            p.r(searchByTextRequest, "Request must not be null.");
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zzf.zza(searchByTextRequest, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgo
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzG(searchByTextRequest, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).k(zzgp.zza);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final AbstractC5232j zzj(final SearchNearbyRequest searchNearbyRequest, final zzmo zzmoVar) {
        try {
            p.r(searchNearbyRequest, "Request must not be null.");
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zzf.zzf(searchNearbyRequest, zzmoVar).i(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzgq
                @Override // Td.InterfaceC5225c
                public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zzI(searchNearbyRequest, zzmoVar, zzfaVarZza, abstractC5232j);
                }
            }).k(zzgr.zza);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final void zzk() {
        this.zzf.zzg();
        this.zzg.zzb();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final void zzl() {
        this.zzf.zzh();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final void zzm() {
        this.zzf.zzi();
    }

    final /* synthetic */ FindAutocompletePredictionsResponse zzn(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zzk(findAutocompletePredictionsRequest, 2, zzmoVar);
        zzK(zzez.zza("FindAutocompletePredictions"), zzfaVar);
        return (FindAutocompletePredictionsResponse) abstractC5232j.n();
    }

    final /* synthetic */ FindAutocompletePredictionsResponse zzp(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zzk(findAutocompletePredictionsRequest, 3, zzmoVar);
        zzK(zzez.zza("FindAutocompletePredictionsOnePlatform"), zzfaVar);
        return (FindAutocompletePredictionsResponse) abstractC5232j.n();
    }

    final /* synthetic */ FetchPhotoResponse zzr(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zzc(fetchPhotoRequest, zzmoVar);
        zzK(zzez.zza("FetchPhoto"), zzfaVar);
        return (FetchPhotoResponse) abstractC5232j.n();
    }

    final /* synthetic */ FetchResolvedPhotoUriResponse zzt(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zzg(fetchResolvedPhotoUriRequest, zzmoVar);
        zzK(zzez.zza("GetPhotoMedia"), zzfaVar);
        return (FetchResolvedPhotoUriResponse) abstractC5232j.n();
    }

    final /* synthetic */ FetchPlaceResponse zzv(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zzm(fetchPlaceRequest, 2, zzmoVar);
        zzK(zzez.zza("FetchPlace"), zzfaVar);
        return (FetchPlaceResponse) abstractC5232j.n();
    }

    final /* synthetic */ FetchPlaceResponse zzx(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar, zzfa zzfaVar, AbstractC5232j abstractC5232j) {
        this.zzd.zzm(fetchPlaceRequest, 3, zzmoVar);
        zzK(zzez.zza("GetPlace"), zzfaVar);
        return (FetchPlaceResponse) abstractC5232j.n();
    }

    final /* synthetic */ AbstractC5232j zzz(FindCurrentPlaceRequest findCurrentPlaceRequest, String str, zzmo zzmoVar, Location location) {
        p.r(location, "Location must not be null.");
        return this.zza.zzd(findCurrentPlaceRequest, location, this.zzc.zza(null), zzmoVar);
    }

    zzhb(zzmf zzmfVar, zzfm zzfmVar, zzfc zzfcVar, zzfh zzfhVar, zzme zzmeVar, zzdy zzdyVar, zzip zzipVar, zzer zzerVar) {
        this.zzh = zzmfVar;
        this.zza = zzfmVar;
        this.zzb = zzfcVar;
        this.zzc = zzfhVar;
        this.zzd = zzmeVar;
        this.zze = zzdyVar;
        this.zzf = zzipVar;
        this.zzg = zzerVar;
        zzerVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC5232j zzL(AbstractC5232j abstractC5232j) {
        ApiException apiException;
        Exception excM = abstractC5232j.m();
        if (excM != null) {
            if (excM instanceof ApiException) {
                apiException = (ApiException) excM;
            } else if (excM instanceof zzbjy) {
                apiException = zzfl.zzb((zzbjy) excM);
            } else if ((excM instanceof ExecutionException) && (excM.getCause() instanceof zzbjy)) {
                apiException = zzfl.zzb((zzbjy) excM.getCause());
            } else {
                apiException = new ApiException(new Status(13, excM.toString()));
            }
            return C5235m.e(apiException);
        }
        return abstractC5232j;
    }
}
