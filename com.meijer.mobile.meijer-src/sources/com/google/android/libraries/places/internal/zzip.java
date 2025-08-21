package com.google.android.libraries.places.internal;

import De.p;
import Ee.L;
import Vd.AbstractC5507a;
import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import Vd.InterfaceC5514h;
import Vd.InterfaceC5515i;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.CircularBounds;
import com.google.android.libraries.places.api.model.EVConnectorType;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.EncodedPolyline;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import com.google.common.util.concurrent.d;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.u;
import com.google.common.util.concurrent.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class zzip {
    private final zzawy zza;
    private final zzbif zzb;
    private final zzir zzc;
    private final zzme zzd;
    private final zzdy zze;
    private final zzjt zzf;
    private final zzjv zzg;
    private final zzjx zzh;
    private final zziw zzi;
    private final zzjf zzj;
    private final zzjm zzk;
    private final zzbfj zzl;
    private final zzhl zzm;
    private final zzmf zzn;

    /* JADX WARN: Multi-variable type inference failed */
    private final String zzA(zzbdd zzbddVar) throws ExecutionException, InterruptedException {
        return zzbddVar == zzbdd.PLACE_AUTOCOMPLETE ? (String) this.zzk.zzb(zzbddVar).get() : (String) this.zzk.zza(zzbddVar).get();
    }

    private final q zzy() {
        PlacesAppCheckTokenProvider placesAppCheckTokenProviderZzi = this.zzn.zzi();
        if (placesAppCheckTokenProviderZzi == null) {
            return k.c(com.google.android.libraries.places.api.auth.zzb.zza);
        }
        z zVarA = z.a();
        k.a(placesAppCheckTokenProviderZzi.fetchAppCheckToken(), new zzht(this, zVarA), u.a());
        return zVarA;
    }

    private final zzawy zzz(zzmo zzmoVar, String str, com.google.android.libraries.places.api.auth.zzb zzbVar, zzbdd zzbddVar) throws ExecutionException, InterruptedException {
        return (zzawy) this.zza.zze(zzcam.zza(zzmoVar == zzmo.PLACES_UI_KIT ? this.zzc.zzb(zzA((zzbdd) p.q(zzbddVar)), str) : this.zzc.zza(this.zzn.zzf(), str)), zzep.zza(zzbVar.zzb()), this.zzl);
    }

    public final AbstractC5516j zzd(final FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, final zzmo zzmoVar) {
        if (zzmoVar == zzmo.PLACES_UI_KIT && this.zzk.zzc == null) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Get Photo Media for Places UI Kit but widget type is null")));
        }
        final long jZzb = this.zze.zzb();
        final q qVarZzy = zzy();
        final q qVarE = k.e(qVarZzy, new d() { // from class: com.google.android.libraries.places.internal.zzhw
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ q apply(Object obj) {
                return this.zza.zzs(zzmoVar, fetchResolvedPhotoUriRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, u.a());
        AbstractC5507a cancellationToken = fetchResolvedPhotoUriRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.b(new InterfaceC5514h() { // from class: com.google.android.libraries.places.internal.zzhz
                @Override // Vd.InterfaceC5514h
                public final /* synthetic */ void onCanceled() {
                    qVarE.cancel(true);
                }
            });
        }
        return zzeg.zza(qVarE).s(zzhx.zza).k(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzhy
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                this.zza.zzt(jZzb, zzmoVar, qVarZzy, abstractC5516j);
                return abstractC5516j;
            }
        });
    }

    public final void zzg() {
        this.zzb.zzd();
        zzjf zzjfVar = this.zzj;
        zzjfVar.zzb.shutdownNow();
        zzjfVar.zza.zzd();
        this.zzk.zzc();
    }

    public final void zzh() {
        this.zzj.zzb();
    }

    public final void zzi() {
        this.zzk.zzc();
    }

    final /* synthetic */ q zzj(zzmo zzmoVar, String str, SearchByTextRequest searchByTextRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        int i10;
        zzaun zzaunVar;
        zzawy zzawyVarZzz = zzz(zzmoVar, str, zzbVar, zzbdd.PLACE_LIST);
        Locale localeZzg = this.zzn.zzg();
        zzaxz zzaxzVarZza = zzayi.zza();
        String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null) {
            zzaxzVarZza.zzd(includedType);
        }
        LocationBias locationBias = searchByTextRequest.getLocationBias();
        if (locationBias != null) {
            boolean z10 = locationBias instanceof RectangularBounds;
            p.e(z10 || (locationBias instanceof CircularBounds), "LocationBias must be of type RectangularBounds or CircularBounds.");
            zzayc zzaycVarZza = zzayd.zza();
            if (z10) {
                zzaycVarZza.zza(zzhf.zzc((RectangularBounds) locationBias));
            } else {
                zzaycVarZza.zzb(zzhf.zzb((CircularBounds) locationBias));
            }
            zzaxzVarZza.zzj((zzayd) zzaycVarZza.zzG());
        }
        LocationRestriction locationRestriction = searchByTextRequest.getLocationRestriction();
        if (locationRestriction != null) {
            p.e(locationRestriction instanceof RectangularBounds, "LocationRestriction must be of type RectangularBounds.");
            zzaye zzayeVarZza = zzayf.zza();
            zzayeVarZza.zza(zzhf.zzc((RectangularBounds) locationRestriction));
            zzaxzVarZza.zzk((zzayf) zzayeVarZza.zzG());
        }
        Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzaxzVarZza.zzg(maxResultCount.intValue());
        }
        Double minRating = searchByTextRequest.getMinRating();
        if (minRating != null) {
            zzaxzVarZza.zzf(minRating.doubleValue());
        }
        zzaxzVarZza.zze(searchByTextRequest.isOpenNow());
        List<Integer> priceLevels = searchByTextRequest.getPriceLevels();
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = priceLevels.iterator();
        while (true) {
            i10 = 4;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = it.next().intValue();
            if (iIntValue == 0) {
                arrayList.add(zzaxc.PRICE_LEVEL_FREE);
            } else if (iIntValue == 1) {
                arrayList.add(zzaxc.PRICE_LEVEL_INEXPENSIVE);
            } else if (iIntValue == 2) {
                arrayList.add(zzaxc.PRICE_LEVEL_MODERATE);
            } else if (iIntValue == 3) {
                arrayList.add(zzaxc.PRICE_LEVEL_EXPENSIVE);
            } else if (iIntValue == 4) {
                arrayList.add(zzaxc.PRICE_LEVEL_VERY_EXPENSIVE);
            }
        }
        zzaxzVarZza.zzh(arrayList);
        SearchByTextRequest.RankPreference rankPreference = searchByTextRequest.getRankPreference();
        if (rankPreference == null) {
            i10 = 2;
        } else {
            EVConnectorType eVConnectorType = EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED;
            if (rankPreference.ordinal() == 0) {
                i10 = 3;
            }
        }
        zzaxzVarZza.zzp(i10);
        String regionCode = searchByTextRequest.getRegionCode();
        if (regionCode != null) {
            zzaxzVarZza.zzc(regionCode);
        }
        zzaxzVarZza.zzi(searchByTextRequest.isStrictTypeFiltering());
        zzaxzVarZza.zza(searchByTextRequest.getTextQuery());
        zzaxzVarZza.zzb(localeZzg.toLanguageTag());
        EVSearchOptions evSearchOptions = searchByTextRequest.getEvSearchOptions();
        if (evSearchOptions != null) {
            zzaya zzayaVarZza = zzayb.zza();
            Double minimumChargingRateKw = evSearchOptions.getMinimumChargingRateKw();
            if (minimumChargingRateKw != null) {
                zzayaVarZza.zza(minimumChargingRateKw.doubleValue());
            }
            List<EVConnectorType> connectorTypes = evSearchOptions.getConnectorTypes();
            if (connectorTypes != null) {
                ArrayList arrayList2 = new ArrayList();
                for (EVConnectorType eVConnectorType2 : connectorTypes) {
                    EVConnectorType eVConnectorType3 = EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED;
                    SearchByTextRequest.RankPreference rankPreference2 = SearchByTextRequest.RankPreference.DISTANCE;
                    switch (eVConnectorType2.ordinal()) {
                        case 1:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_OTHER;
                            break;
                        case 2:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_J1772;
                            break;
                        case 3:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_TYPE_2;
                            break;
                        case 4:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_CHADEMO;
                            break;
                        case 5:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                            break;
                        case 6:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                            break;
                        case 7:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_TESLA;
                            break;
                        case 8:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                            break;
                        case 9:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                            break;
                        default:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED;
                            break;
                    }
                    arrayList2.add(zzaunVar);
                }
                zzayaVarZza.zzb(arrayList2);
            }
            zzaxzVarZza.zzl((zzayb) zzayaVarZza.zzG());
        }
        SearchAlongRouteParameters searchAlongRouteParameters = searchByTextRequest.getSearchAlongRouteParameters();
        if (searchAlongRouteParameters != null) {
            zzayg zzaygVarZza = zzayh.zza();
            EncodedPolyline encodedPolyline = (EncodedPolyline) searchAlongRouteParameters.getPolyline();
            zzaxa zzaxaVarZza = zzaxb.zza();
            zzaxaVarZza.zza(encodedPolyline.getEncodedPolyline());
            zzaygVarZza.zza((zzaxb) zzaxaVarZza.zzG());
            zzaxzVarZza.zzn((zzayh) zzaygVarZza.zzG());
        }
        RoutingParameters routingParameters = searchByTextRequest.getRoutingParameters();
        if (routingParameters != null) {
            zzaxzVarZza.zzm(zzjo.zza(routingParameters));
        }
        if (searchByTextRequest.isPureServiceAreaBusinessesIncluded()) {
            zzaxzVarZza.zzo(true);
        }
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zzb(), zzawyVarZzz.zzd()), (zzayi) zzaxzVarZza.zzG());
    }

    final /* synthetic */ AbstractC5516j zzk(SearchByTextRequest searchByTextRequest, zzayk zzaykVar) {
        C5517k c5517k = new C5517k();
        List listZza = zzaykVar.zza();
        List listZzc = zzaykVar.zzc();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listZza.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zzi.zza((zzaww) it.next()));
        }
        Iterator it2 = listZzc.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zzjq.zza((zzaxq) it2.next()));
        }
        SearchByTextResponse.Builder builder = SearchByTextResponse.builder(arrayList);
        if (true != searchByTextRequest.isRoutingSummariesIncluded()) {
            arrayList2 = null;
        }
        builder.setRoutingSummaries(arrayList2);
        c5517k.c(builder.build());
        return c5517k.a();
    }

    final /* synthetic */ q zzm(zzmo zzmoVar, FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        zzawy zzawyVarZzz = zzz(zzmoVar, "", zzbVar, zzbdd.PLACE_AUTOCOMPLETE);
        Locale localeZzg = this.zzn.zzg();
        zzasv zzasvVarZza = zzata.zza();
        zzasvVarZza.zza((String) p.q(findAutocompletePredictionsRequest.getQuery()));
        zzasvVarZza.zzf(localeZzg.toLanguageTag());
        Integer inputOffset = findAutocompletePredictionsRequest.getInputOffset();
        if (inputOffset != null) {
            zzasvVarZza.zzi(inputOffset.intValue());
        }
        String regionCode = findAutocompletePredictionsRequest.getRegionCode();
        if (regionCode != null) {
            zzasvVarZza.zzg(regionCode);
        }
        LocationBias locationBias = findAutocompletePredictionsRequest.getLocationBias();
        if (locationBias != null) {
            boolean z10 = locationBias instanceof CircularBounds;
            p.d(z10 || (locationBias instanceof RectangularBounds));
            zzasw zzaswVarZza = zzasx.zza();
            if (z10) {
                zzaswVarZza.zzb(zzhf.zzb((CircularBounds) locationBias));
            }
            if (locationBias instanceof RectangularBounds) {
                zzaswVarZza.zza(zzhf.zzc((RectangularBounds) locationBias));
            }
            zzasvVarZza.zzb((zzasx) zzaswVarZza.zzG());
        }
        LocationRestriction locationRestriction = findAutocompletePredictionsRequest.getLocationRestriction();
        if (locationRestriction != null) {
            boolean z11 = locationRestriction instanceof CircularBounds;
            p.d(z11 || (locationRestriction instanceof RectangularBounds));
            zzasy zzasyVarZza = zzasz.zza();
            if (z11) {
                zzasyVarZza.zzb(zzhf.zzb((CircularBounds) locationRestriction));
            }
            if (locationRestriction instanceof RectangularBounds) {
                zzasyVarZza.zza(zzhf.zzc((RectangularBounds) locationRestriction));
            }
            zzasvVarZza.zzc((zzasz) zzasyVarZza.zzG());
        }
        LatLng origin = findAutocompletePredictionsRequest.getOrigin();
        if (origin != null) {
            zzasvVarZza.zzh(zzhf.zza(origin));
        }
        Iterator<String> it = findAutocompletePredictionsRequest.getCountries().iterator();
        while (it.hasNext()) {
            zzasvVarZza.zze(it.next());
        }
        AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zzasvVarZza.zzj(sessionToken.toString());
        }
        Iterator<String> it2 = findAutocompletePredictionsRequest.getTypesFilter().iterator();
        while (it2.hasNext()) {
            zzasvVarZza.zzd(it2.next());
        }
        if (findAutocompletePredictionsRequest.isPureServiceAreaBusinessesIncluded()) {
            zzasvVarZza.zzk(true);
        }
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zze(), zzawyVarZzz.zzd()), (zzata) zzasvVarZza.zzG());
    }

    final /* synthetic */ AbstractC5516j zzn(zzato zzatoVar) {
        C5517k c5517k = new C5517k();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzatoVar.zza().iterator();
        while (it.hasNext()) {
            arrayList.add(this.zzh.zza((zzatn) it.next()));
        }
        c5517k.c(FindAutocompletePredictionsResponse.newInstance(arrayList));
        return c5517k.a();
    }

    final /* synthetic */ q zzp(zzmo zzmoVar, String str, FetchPlaceRequest fetchPlaceRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        zzawy zzawyVarZzz = zzz(zzmoVar, str, zzbVar, zzbdd.PLACE_DETAILS);
        Locale localeZzg = this.zzn.zzg();
        zzauv zzauvVarZza = zzauw.zza();
        zzauvVarZza.zza("places/".concat(String.valueOf(fetchPlaceRequest.getPlaceId())));
        String regionCode = fetchPlaceRequest.getRegionCode();
        if (regionCode != null) {
            zzauvVarZza.zzc(regionCode);
        }
        AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zzauvVarZza.zzd(sessionToken.toString());
        }
        zzauvVarZza.zzb(localeZzg.toLanguageTag());
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zzd(), zzawyVarZzz.zzd()), (zzauw) zzauvVarZza.zzG());
    }

    final /* synthetic */ AbstractC5516j zzq(zzaww zzawwVar) {
        C5517k c5517k = new C5517k();
        c5517k.c(FetchPlaceResponse.newInstance(this.zzi.zza(zzawwVar)));
        return c5517k.a();
    }

    final /* synthetic */ q zzs(zzmo zzmoVar, FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        zzawy zzawyVarZzz = zzz(zzmoVar, "", zzbVar, this.zzk.zzc);
        zzaut zzautVarZza = zzauu.zza();
        zzautVarZza.zza(String.valueOf((String) p.q(fetchResolvedPhotoUriRequest.getPhotoMetadata().zzb())).concat("/media"));
        Integer maxHeight = fetchResolvedPhotoUriRequest.getMaxHeight();
        if (maxHeight != null) {
            zzautVarZza.zzc(maxHeight.intValue());
        }
        Integer maxWidth = fetchResolvedPhotoUriRequest.getMaxWidth();
        if (maxWidth != null) {
            zzautVarZza.zzb(maxWidth.intValue());
        }
        zzautVarZza.zzd(true);
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zzc(), zzawyVarZzz.zzd()), (zzauu) zzautVarZza.zzG());
    }

    final /* synthetic */ q zzu(LatLng latLng, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        return this.zzm.zza(latLng, zzbVar, zzA(zzbdd.PLACE_DETAILS));
    }

    final /* synthetic */ q zzv(zzmo zzmoVar, String str, SearchNearbyRequest searchNearbyRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        zzawy zzawyVarZzz = zzz(zzmoVar, str, zzbVar, zzbdd.PLACE_LIST);
        Locale localeZzg = this.zzn.zzg();
        zzaxr zzaxrVarZza = zzaxw.zza();
        zzaxrVarZza.zza(localeZzg.toLanguageTag());
        String regionCode = searchNearbyRequest.getRegionCode();
        if (regionCode != null) {
            zzaxrVarZza.zzb(regionCode);
        }
        List<String> includedTypes = searchNearbyRequest.getIncludedTypes();
        if (includedTypes != null) {
            zzaxrVarZza.zzc(includedTypes);
        }
        List<String> excludedTypes = searchNearbyRequest.getExcludedTypes();
        if (excludedTypes != null) {
            zzaxrVarZza.zzd(excludedTypes);
        }
        List<String> includedPrimaryTypes = searchNearbyRequest.getIncludedPrimaryTypes();
        if (includedPrimaryTypes != null) {
            zzaxrVarZza.zze(includedPrimaryTypes);
        }
        List<String> excludedPrimaryTypes = searchNearbyRequest.getExcludedPrimaryTypes();
        if (excludedPrimaryTypes != null) {
            zzaxrVarZza.zzf(excludedPrimaryTypes);
        }
        Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzaxrVarZza.zzg(maxResultCount.intValue());
        }
        RoutingParameters routingParameters = searchNearbyRequest.getRoutingParameters();
        if (routingParameters != null) {
            zzaxrVarZza.zzi(zzjo.zza(routingParameters));
        }
        zzaxu zzaxuVarZza = zzaxv.zza();
        zzaxuVarZza.zza(zzhf.zzb((CircularBounds) searchNearbyRequest.getLocationRestriction()));
        zzaxrVarZza.zzh((zzaxv) zzaxuVarZza.zzG());
        SearchNearbyRequest.RankPreference rankPreference = searchNearbyRequest.getRankPreference();
        zzaxrVarZza.zzj(rankPreference == null ? 2 : rankPreference.ordinal() != 0 ? 4 : 3);
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zza(), zzawyVarZzz.zzd()), (zzaxw) zzaxrVarZza.zzG());
    }

    final /* synthetic */ AbstractC5516j zzw(SearchNearbyRequest searchNearbyRequest, zzaxy zzaxyVar) {
        C5517k c5517k = new C5517k();
        List listZza = zzaxyVar.zza();
        List listZzc = zzaxyVar.zzc();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listZza.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zzi.zza((zzaww) it.next()));
        }
        Iterator it2 = listZzc.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zzjq.zza((zzaxq) it2.next()));
        }
        SearchNearbyResponse.Builder builder = SearchNearbyResponse.builder(arrayList);
        if (true != searchNearbyRequest.isRoutingSummariesIncluded()) {
            arrayList2 = null;
        }
        builder.setRoutingSummaries(arrayList2);
        c5517k.c(builder.build());
        return c5517k.a();
    }

    zzip(zzmf zzmfVar, zzbif zzbifVar, zzme zzmeVar, zzdy zzdyVar, zzjv zzjvVar, zzjt zzjtVar, zzhq zzhqVar, zzhn zzhnVar, zzhd zzhdVar, zziw zziwVar, zzjq zzjqVar, zzjx zzjxVar, zzir zzirVar, zzjf zzjfVar, zzjm zzjmVar, zzbfj zzbfjVar, zzhl zzhlVar) {
        this.zzn = zzmfVar;
        this.zzb = zzbifVar;
        this.zza = zzawz.zzf(zzbifVar);
        this.zzc = zzirVar;
        this.zzd = zzmeVar;
        this.zze = zzdyVar;
        this.zzg = zzjvVar;
        this.zzf = zzjtVar;
        this.zzi = zziwVar;
        this.zzh = zzjxVar;
        this.zzj = zzjfVar;
        this.zzk = zzjmVar;
        this.zzl = zzbfjVar;
        this.zzm = zzhlVar;
    }

    public final AbstractC5516j zza(final SearchByTextRequest searchByTextRequest, final zzmo zzmoVar) {
        List<Place.Field> placeFields = searchByTextRequest.getPlaceFields();
        if (placeFields.isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place fields must not be empty.")));
        }
        if (searchByTextRequest.getTextQuery().isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Text query must not be an empty string.")));
        }
        String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null && includedType.isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Included type must not be an empty string.")));
        }
        String regionCode = searchByTextRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        final long jZzb = this.zze.zzb();
        ArrayList arrayList = new ArrayList();
        if (searchByTextRequest.isRoutingSummariesIncluded()) {
            arrayList.add(zzhi.ROUTING_SUMMARIES);
        }
        final String strZza = zzhj.zza(zziy.zza(placeFields), arrayList);
        final q qVarZzy = zzy();
        final q qVarE = k.e(qVarZzy, new d() { // from class: com.google.android.libraries.places.internal.zzio
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ q apply(Object obj) {
                return this.zza.zzj(zzmoVar, strZza, searchByTextRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, u.a());
        AbstractC5507a cancellationToken = searchByTextRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.b(new InterfaceC5514h() { // from class: com.google.android.libraries.places.internal.zzig
                @Override // Vd.InterfaceC5514h
                public final /* synthetic */ void onCanceled() {
                    qVarE.cancel(true);
                }
            });
        }
        return zzeg.zza(qVarE).s(new InterfaceC5515i() { // from class: com.google.android.libraries.places.internal.zzhu
            @Override // Vd.InterfaceC5515i
            public final /* synthetic */ AbstractC5516j then(Object obj) {
                return this.zza.zzk(searchByTextRequest, (zzayk) obj);
            }
        }).k(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzif
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                this.zza.zzl(searchByTextRequest, jZzb, zzmoVar, qVarZzy, abstractC5516j);
                return abstractC5516j;
            }
        });
    }

    public final AbstractC5516j zzb(final FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, final zzmo zzmoVar) {
        String regionCode = findAutocompletePredictionsRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Query must not be null.")));
        }
        if (TextUtils.isEmpty(query.trim())) {
            return C5519m.f(FindAutocompletePredictionsResponse.newInstance(L.x()));
        }
        final long jZzb = this.zze.zzb();
        final q qVarZzy = zzy();
        final q qVarE = k.e(qVarZzy, new d() { // from class: com.google.android.libraries.places.internal.zzih
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ q apply(Object obj) {
                return this.zza.zzm(zzmoVar, findAutocompletePredictionsRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, u.a());
        AbstractC5507a cancellationToken = findAutocompletePredictionsRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.b(new InterfaceC5514h() { // from class: com.google.android.libraries.places.internal.zzik
                @Override // Vd.InterfaceC5514h
                public final /* synthetic */ void onCanceled() {
                    qVarE.cancel(true);
                }
            });
        }
        return zzeg.zza(qVarE).s(new InterfaceC5515i() { // from class: com.google.android.libraries.places.internal.zzii
            @Override // Vd.InterfaceC5515i
            public final /* synthetic */ AbstractC5516j then(Object obj) {
                return this.zza.zzn((zzato) obj);
            }
        }).k(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzij
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                this.zza.zzo(jZzb, zzmoVar, qVarZzy, abstractC5516j);
                return abstractC5516j;
            }
        });
    }

    public final AbstractC5516j zzc(final FetchPlaceRequest fetchPlaceRequest, final zzmo zzmoVar) {
        if (fetchPlaceRequest.getPlaceId().isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place id must not be an empty string.")));
        }
        List<Place.Field> placeFields = fetchPlaceRequest.getPlaceFields();
        if (placeFields.isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place fields must not be empty.")));
        }
        String regionCode = fetchPlaceRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        final long jZzb = this.zze.zzb();
        final String strZzb = zzhj.zzb(zziy.zza(placeFields));
        final q qVarZzy = zzy();
        final q qVarE = k.e(qVarZzy, new d() { // from class: com.google.android.libraries.places.internal.zzil
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ q apply(Object obj) {
                return this.zza.zzp(zzmoVar, strZzb, fetchPlaceRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, u.a());
        AbstractC5507a cancellationToken = fetchPlaceRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.b(new InterfaceC5514h() { // from class: com.google.android.libraries.places.internal.zzhv
                @Override // Vd.InterfaceC5514h
                public final /* synthetic */ void onCanceled() {
                    qVarE.cancel(true);
                }
            });
        }
        return zzeg.zza(qVarE).s(new InterfaceC5515i() { // from class: com.google.android.libraries.places.internal.zzim
            @Override // Vd.InterfaceC5515i
            public final /* synthetic */ AbstractC5516j then(Object obj) {
                return this.zza.zzq((zzaww) obj);
            }
        }).k(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzin
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                this.zza.zzr(jZzb, zzmoVar, qVarZzy, abstractC5516j);
                return abstractC5516j;
            }
        });
    }

    public final AbstractC5516j zze(final LatLng latLng) {
        return zzeg.zza(k.e(zzy(), new d() { // from class: com.google.android.libraries.places.internal.zzia
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ q apply(Object obj) {
                return this.zza.zzu(latLng, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, u.a()));
    }

    public final AbstractC5516j zzf(final SearchNearbyRequest searchNearbyRequest, final zzmo zzmoVar) {
        List<Place.Field> placeFields = searchNearbyRequest.getPlaceFields();
        if (placeFields.isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place fields must not be empty.")));
        }
        String regionCode = searchNearbyRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        final long jZzb = this.zze.zzb();
        ArrayList arrayList = new ArrayList();
        if (searchNearbyRequest.isRoutingSummariesIncluded()) {
            arrayList.add(zzhi.ROUTING_SUMMARIES);
        }
        final String strZza = zzhj.zza(zziy.zza(placeFields), arrayList);
        final q qVarZzy = zzy();
        final q qVarE = k.e(qVarZzy, new d() { // from class: com.google.android.libraries.places.internal.zzib
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ q apply(Object obj) {
                return this.zza.zzv(zzmoVar, strZza, searchNearbyRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, u.a());
        AbstractC5507a cancellationToken = searchNearbyRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.b(new InterfaceC5514h() { // from class: com.google.android.libraries.places.internal.zzie
                @Override // Vd.InterfaceC5514h
                public final /* synthetic */ void onCanceled() {
                    qVarE.cancel(true);
                }
            });
        }
        return zzeg.zza(qVarE).s(new InterfaceC5515i() { // from class: com.google.android.libraries.places.internal.zzic
            @Override // Vd.InterfaceC5515i
            public final /* synthetic */ AbstractC5516j then(Object obj) {
                return this.zza.zzw(searchNearbyRequest, (zzaxy) obj);
            }
        }).k(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzid
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                this.zza.zzx(searchNearbyRequest, jZzb, zzmoVar, qVarZzy, abstractC5516j);
                return abstractC5516j;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ AbstractC5516j zzl(SearchByTextRequest searchByTextRequest, long j10, zzmo zzmoVar, q qVar, AbstractC5516j abstractC5516j) {
        if (!abstractC5516j.p()) {
            this.zzd.zzf(searchByTextRequest, abstractC5516j, j10, this.zze.zzb(), zzmoVar, (com.google.android.libraries.places.api.auth.zzb) qVar.get());
        }
        return abstractC5516j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ AbstractC5516j zzo(long j10, zzmo zzmoVar, q qVar, AbstractC5516j abstractC5516j) {
        if (!abstractC5516j.p()) {
            this.zzd.zzl(abstractC5516j, j10, this.zze.zzb(), 3, zzmoVar, (com.google.android.libraries.places.api.auth.zzb) qVar.get());
            return abstractC5516j;
        }
        return abstractC5516j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ AbstractC5516j zzr(long j10, zzmo zzmoVar, q qVar, AbstractC5516j abstractC5516j) {
        if (!abstractC5516j.p()) {
            this.zzd.zzn(abstractC5516j, j10, this.zze.zzb(), 3, zzmoVar, (com.google.android.libraries.places.api.auth.zzb) qVar.get());
            return abstractC5516j;
        }
        return abstractC5516j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ AbstractC5516j zzt(long j10, zzmo zzmoVar, q qVar, AbstractC5516j abstractC5516j) {
        if (!abstractC5516j.p()) {
            this.zzd.zzh(abstractC5516j, j10, this.zze.zzb(), zzmoVar, (com.google.android.libraries.places.api.auth.zzb) qVar.get());
            return abstractC5516j;
        }
        return abstractC5516j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ AbstractC5516j zzx(SearchNearbyRequest searchNearbyRequest, long j10, zzmo zzmoVar, q qVar, AbstractC5516j abstractC5516j) {
        if (!abstractC5516j.p()) {
            this.zzd.zzj(searchNearbyRequest, abstractC5516j, j10, this.zze.zzb(), zzmoVar, (com.google.android.libraries.places.api.auth.zzb) qVar.get());
        }
        return abstractC5516j;
    }
}
