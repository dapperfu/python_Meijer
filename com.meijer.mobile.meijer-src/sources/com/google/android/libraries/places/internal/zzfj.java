package com.google.android.libraries.places.internal;

import De.p;
import Vd.AbstractC5516j;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.EVConnectorType;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.RouteModifiers;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.RoutingSummary;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzfj implements zzme {
    private final zzmv zza;
    private final zzmp zzb;
    private final zzmf zzc;

    zzfj(zzmv zzmvVar, zzmp zzmpVar, zzmf zzmfVar) {
        this.zza = zzmvVar;
        this.zzb = zzmpVar;
        this.zzc = zzmfVar;
    }

    private final void zzr(zzaip zzaipVar, zzmo zzmoVar) {
        zzt(zzaipVar, 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
    }

    private final zzamh zzq() {
        Locale localeZzg = this.zzc.zzg();
        Locale locale = Locale.getDefault();
        zzamh zzamhVarZza = zzamj.zza();
        zzamhVarZza.zza(localeZzg.toLanguageTag());
        if (!localeZzg.equals(locale)) {
            zzamhVarZza.zzb(locale.toLanguageTag());
        }
        return zzamhVarZza;
    }

    private final void zzt(zzaip zzaipVar, int i10, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, i10, zzmoVar, zzbVar);
        zzaksVarZzb.zzp(16);
        zzaksVarZzb.zzf(zzaipVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    static final int zzp(AbstractC5516j abstractC5516j) {
        ApiException apiException;
        if (abstractC5516j.r()) {
            return 2;
        }
        Exception exc = (Exception) p.q(abstractC5516j.m());
        if (exc instanceof ApiException) {
            apiException = (ApiException) exc;
        } else {
            apiException = new ApiException(new Status(13, exc.getMessage()));
        }
        int iB = apiException.b();
        if (iB != 7) {
            if (iB != 15) {
                return 1;
            }
            return 3;
        }
        return 4;
    }

    private static final zzani zzs(RoutingParameters routingParameters) {
        int i10;
        zzanh zzanhVarZza = zzani.zza();
        RoutingParameters.TravelMode travelMode = routingParameters.getTravelMode();
        int i11 = 4;
        if (travelMode != null) {
            EVConnectorType eVConnectorType = EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED;
            RoutingParameters.RoutingPreference routingPreference = RoutingParameters.RoutingPreference.ROUTING_PREFERENCE_UNSPECIFIED;
            int iOrdinal = travelMode.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            i10 = 1;
                        } else {
                            i10 = 5;
                        }
                    } else {
                        i10 = 4;
                    }
                } else {
                    i10 = 3;
                }
            } else {
                i10 = 2;
            }
            zzanhVarZza.zzb(i10);
        }
        RouteModifiers routeModifiers = routingParameters.getRouteModifiers();
        if (routeModifiers != null) {
            zzanf zzanfVarZza = zzang.zza();
            zzanfVarZza.zza(routeModifiers.isTollAvoided());
            zzanfVarZza.zzb(routeModifiers.isHighwayAvoided());
            zzanfVarZza.zzc(routeModifiers.isFerryAvoided());
            zzanfVarZza.zzd(routeModifiers.isIndoorAvoided());
            zzanhVarZza.zza((zzang) zzanfVarZza.zzG());
        }
        RoutingParameters.RoutingPreference routingPreference2 = routingParameters.getRoutingPreference();
        if (routingPreference2 != null) {
            EVConnectorType eVConnectorType2 = EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED;
            RoutingParameters.TravelMode travelMode2 = RoutingParameters.TravelMode.TRAVEL_MODE_UNSPECIFIED;
            int iOrdinal2 = routingPreference2.ordinal();
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        i11 = 1;
                    }
                } else {
                    i11 = 3;
                }
            } else {
                i11 = 2;
            }
            zzanhVarZza.zzc(i11);
        }
        return (zzani) zzanhVarZza.zzG();
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zza(FindCurrentPlaceRequest findCurrentPlaceRequest, AbstractC5516j abstractC5516j, long j10, long j11, zzmo zzmoVar) {
        int i10 = 1;
        if (true == abstractC5516j.r()) {
            i10 = 2;
        }
        zzalk zzalkVarZza = zzalm.zza();
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zzll.zza(findCurrentPlaceRequest.getPlaceFields()));
        zzalkVarZza.zzb((zzamd) zzamcVarZza.zzG());
        zzalkVarZza.zza((int) (j11 - j10));
        zzalkVarZza.zzc(i10);
        zzalm zzalmVar = (zzalm) zzalkVarZza.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(6);
        zzaksVarZzb.zzd(zzalmVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzb(AbstractC5516j abstractC5516j, long j10, long j11, zzmo zzmoVar) {
        int size;
        if (abstractC5516j.r()) {
            size = ((FindCurrentPlaceResponse) abstractC5516j.n()).getPlaceLikelihoods().size();
        } else {
            size = 0;
        }
        zzahr zzahrVarZza = zzahs.zza();
        zzahrVarZza.zza(size);
        zzahs zzahsVar = (zzahs) zzahrVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(4);
        zzaikVarZza.zzc(zzahsVar);
        zzaikVarZza.zzg(zzp(abstractC5516j));
        zzaikVarZza.zza((int) (j11 - j10));
        zzr((zzaip) zzaikVarZza.zzG(), zzmoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzc(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar) {
        zzalz zzalzVarZza = zzamb.zza();
        zzalzVarZza.zza(2);
        zzamb zzambVar = (zzamb) zzalzVarZza.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(5);
        zzaksVarZzb.zzc(zzambVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzd(AbstractC5516j abstractC5516j, long j10, long j11, zzmo zzmoVar) {
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(15);
        zzaikVarZza.zzg(zzp(abstractC5516j));
        zzaikVarZza.zza((int) (j11 - j10));
        zzr((zzaip) zzaikVarZza.zzG(), zzmoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zze(SearchByTextRequest searchByTextRequest, zzmo zzmoVar) {
        int i10;
        zzahq zzahqVar;
        zzamq zzamqVarZza = zzamu.zza();
        zzamqVarZza.zzb(searchByTextRequest.isOpenNow());
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zziy.zza(searchByTextRequest.getPlaceFields()));
        zzamqVarZza.zzg((zzamd) zzamcVarZza.zzG());
        SearchByTextRequest.RankPreference rankPreference = searchByTextRequest.getRankPreference();
        if (rankPreference == null) {
            i10 = 1;
        } else if (true != rankPreference.equals(SearchByTextRequest.RankPreference.DISTANCE)) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        zzamqVarZza.zzk(i10);
        zzamqVarZza.zzf(searchByTextRequest.isStrictTypeFiltering());
        zzamqVarZza.zzj(searchByTextRequest.isRoutingSummariesIncluded());
        String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null) {
            zzamqVarZza.zza(includedType);
        }
        Double minRating = searchByTextRequest.getMinRating();
        if (minRating != null) {
            zzamqVarZza.zzc(minRating.doubleValue());
        }
        Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzamqVarZza.zzd(maxResultCount.intValue());
        }
        EVSearchOptions evSearchOptions = searchByTextRequest.getEvSearchOptions();
        if (evSearchOptions != null) {
            zzamr zzamrVarZza = zzams.zza();
            Double minimumChargingRateKw = evSearchOptions.getMinimumChargingRateKw();
            if (minimumChargingRateKw != null) {
                zzamrVarZza.zza(minimumChargingRateKw.doubleValue());
            }
            List<EVConnectorType> connectorTypes = evSearchOptions.getConnectorTypes();
            if (connectorTypes != null) {
                ArrayList arrayList = new ArrayList();
                for (EVConnectorType eVConnectorType : connectorTypes) {
                    EVConnectorType eVConnectorType2 = EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED;
                    RoutingParameters.TravelMode travelMode = RoutingParameters.TravelMode.TRAVEL_MODE_UNSPECIFIED;
                    RoutingParameters.RoutingPreference routingPreference = RoutingParameters.RoutingPreference.ROUTING_PREFERENCE_UNSPECIFIED;
                    int iOrdinal = eVConnectorType.ordinal();
                    if (iOrdinal != 0) {
                        switch (iOrdinal) {
                            case 2:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_J1772;
                                break;
                            case 3:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_TYPE_2;
                                break;
                            case 4:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_CHADEMO;
                                break;
                            case 5:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                                break;
                            case 6:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                                break;
                            case 7:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_TESLA;
                                break;
                            case 8:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                                break;
                            case 9:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                                break;
                            default:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_OTHER;
                                break;
                        }
                    } else {
                        zzahqVar = zzahq.EV_CONNECTOR_TYPE_UNSPECIFIED;
                    }
                    arrayList.add(zzahqVar);
                }
                zzamrVarZza.zzb(arrayList);
            }
            zzamqVarZza.zzh((zzams) zzamrVarZza.zzG());
        }
        RoutingParameters routingParameters = searchByTextRequest.getRoutingParameters();
        if (routingParameters != null) {
            zzamqVarZza.zzi(zzs(routingParameters));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : searchByTextRequest.getPriceLevels()) {
            if (num != null) {
                arrayList2.add(num);
            }
        }
        zzamqVarZza.zze(arrayList2);
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(2);
        zzamhVarZzq.zze((zzamu) zzamqVarZza.zzG());
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 3, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzf(SearchByTextRequest searchByTextRequest, AbstractC5516j abstractC5516j, long j10, long j11, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        int size;
        int size2;
        List<RoutingSummary> routingSummaries;
        int iIntValue = 0;
        if (abstractC5516j.r()) {
            size = ((SearchByTextResponse) abstractC5516j.n()).getPlaces().size();
        } else {
            size = 0;
        }
        if (searchByTextRequest.isRoutingSummariesIncluded() && abstractC5516j.r() && (routingSummaries = ((SearchByTextResponse) abstractC5516j.n()).getRoutingSummaries()) != null) {
            size2 = routingSummaries.size();
        } else {
            size2 = 0;
        }
        Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        zzanu zzanuVarZza = zzanv.zza();
        if (maxResultCount != null) {
            iIntValue = maxResultCount.intValue();
        }
        zzanuVarZza.zza(iIntValue);
        zzanuVarZza.zzb(size);
        zzanuVarZza.zzc(size2);
        zzanv zzanvVar = (zzanv) zzanuVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(10);
        zzaikVarZza.zze(zzanvVar);
        zzaikVarZza.zzg(zzp(abstractC5516j));
        zzaikVarZza.zza((int) (j11 - j10));
        zzt((zzaip) zzaikVarZza.zzG(), 3, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzg(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, zzmo zzmoVar) {
        zzalz zzalzVarZza = zzamb.zza();
        zzalzVarZza.zza(2);
        zzamb zzambVar = (zzamb) zzalzVarZza.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 3, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(5);
        zzaksVarZzb.zzc(zzambVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzh(AbstractC5516j abstractC5516j, long j10, long j11, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(15);
        zzaikVarZza.zzg(zzp(abstractC5516j));
        zzaikVarZza.zza((int) (j11 - j10));
        zzt((zzaip) zzaikVarZza.zzG(), 3, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzi(SearchNearbyRequest searchNearbyRequest, zzmo zzmoVar) {
        int i10;
        zzamv zzamvVarZza = zzamx.zza();
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zziy.zza(searchNearbyRequest.getPlaceFields()));
        zzamvVarZza.zzf((zzamd) zzamcVarZza.zzG());
        SearchNearbyRequest.RankPreference rankPreference = searchNearbyRequest.getRankPreference();
        if (rankPreference == null) {
            i10 = 1;
        } else if (true != rankPreference.equals(SearchNearbyRequest.RankPreference.DISTANCE)) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        zzamvVarZza.zzi(i10);
        zzamvVarZza.zzh(searchNearbyRequest.isRoutingSummariesIncluded());
        List<String> includedTypes = searchNearbyRequest.getIncludedTypes();
        if (includedTypes != null) {
            zzamvVarZza.zza(includedTypes);
        }
        List<String> excludedTypes = searchNearbyRequest.getExcludedTypes();
        if (excludedTypes != null) {
            zzamvVarZza.zzb(excludedTypes);
        }
        List<String> includedPrimaryTypes = searchNearbyRequest.getIncludedPrimaryTypes();
        if (includedPrimaryTypes != null) {
            zzamvVarZza.zzc(includedPrimaryTypes);
        }
        List<String> excludedPrimaryTypes = searchNearbyRequest.getExcludedPrimaryTypes();
        if (excludedPrimaryTypes != null) {
            zzamvVarZza.zzd(excludedPrimaryTypes);
        }
        Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzamvVarZza.zze(maxResultCount.intValue());
        }
        RoutingParameters routingParameters = searchNearbyRequest.getRoutingParameters();
        if (routingParameters != null) {
            zzamvVarZza.zzg(zzs(routingParameters));
        }
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(2);
        zzamhVarZzq.zzf((zzamx) zzamvVarZza.zzG());
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 3, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzj(SearchNearbyRequest searchNearbyRequest, AbstractC5516j abstractC5516j, long j10, long j11, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        int size;
        int size2;
        List<RoutingSummary> routingSummaries;
        int iIntValue = 0;
        if (abstractC5516j.r()) {
            size = ((SearchNearbyResponse) abstractC5516j.n()).getPlaces().size();
        } else {
            size = 0;
        }
        if (searchNearbyRequest.isRoutingSummariesIncluded() && abstractC5516j.r() && (routingSummaries = ((SearchNearbyResponse) abstractC5516j.n()).getRoutingSummaries()) != null) {
            size2 = routingSummaries.size();
        } else {
            size2 = 0;
        }
        Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        zzanu zzanuVarZza = zzanv.zza();
        if (maxResultCount != null) {
            iIntValue = maxResultCount.intValue();
        }
        zzanuVarZza.zza(iIntValue);
        zzanuVarZza.zzb(size);
        zzanuVarZza.zzc(size2);
        zzanv zzanvVar = (zzanv) zzanuVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(10);
        zzaikVarZza.zze(zzanvVar);
        zzaikVarZza.zzg(zzp(abstractC5516j));
        zzaikVarZza.zza((int) (j11 - j10));
        zzt((zzaip) zzaikVarZza.zzG(), 3, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzk(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i10, zzmo zzmoVar) {
        zzajd zzajdVarZza = zzaje.zza();
        List<String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        Integer inputOffset = findAutocompletePredictionsRequest.getInputOffset();
        if (!typesFilter.isEmpty()) {
            Iterator<String> it = typesFilter.iterator();
            while (it.hasNext()) {
                zzajdVarZza.zza(it.next());
            }
        } else if (typeFilter != null) {
            zzajdVarZza.zza(zzlm.zza(typeFilter));
        }
        if (inputOffset != null) {
            zzajdVarZza.zzb(inputOffset.intValue());
        }
        zzaje zzajeVar = (zzaje) zzajdVarZza.zzG();
        zzakc zzakcVarZza = zzakd.zza();
        if (zzajeVar != null) {
            zzakcVarZza.zza(zzajeVar);
        }
        zzakd zzakdVar = (zzakd) zzakcVarZza.zzG();
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(6);
        zzamhVarZzq.zzd(zzakdVar);
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, i10, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zzaksVarZzb.zzh(sessionToken.toString());
        }
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzl(AbstractC5516j abstractC5516j, long j10, long j11, int i10, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        int size;
        if (abstractC5516j.r()) {
            size = ((FindAutocompletePredictionsResponse) abstractC5516j.n()).getAutocompletePredictions().size();
        } else {
            size = 0;
        }
        zzahx zzahxVarZza = zzahy.zza();
        zzahxVarZza.zza(size);
        zzahy zzahyVar = (zzahy) zzahxVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(6);
        zzaikVarZza.zzd(zzahyVar);
        zzaikVarZza.zzg(zzp(abstractC5516j));
        zzaikVarZza.zza((int) (j11 - j10));
        zzt((zzaip) zzaikVarZza.zzG(), i10, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzm(FetchPlaceRequest fetchPlaceRequest, int i10, zzmo zzmoVar) {
        zzale zzaleVarZza = zzalf.zza();
        zzaleVarZza.zza(1);
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zzll.zza(fetchPlaceRequest.getPlaceFields()));
        zzaleVarZza.zzb((zzamd) zzamcVarZza.zzG());
        zzalf zzalfVar = (zzalf) zzaleVarZza.zzG();
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(5);
        zzamhVarZzq.zzc(zzalfVar);
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, i10, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zzaksVarZzb.zzh(sessionToken.toString());
        }
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzn(AbstractC5516j abstractC5516j, long j10, long j11, int i10, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        boolean zR = abstractC5516j.r();
        zzaic zzaicVarZza = zzaid.zza();
        zzaicVarZza.zza(1);
        zzaicVarZza.zzb(zR ? 1 : 0);
        zzaid zzaidVar = (zzaid) zzaicVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(8);
        zzaikVarZza.zzb(zzaidVar);
        zzaikVarZza.zzg(zzp(abstractC5516j));
        zzaikVarZza.zza((int) (j11 - j10));
        zzt((zzaip) zzaikVarZza.zzG(), i10, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzo(FetchPlaceRequest fetchPlaceRequest, int i10, zzmo zzmoVar) {
        zzale zzaleVarZza = zzalf.zza();
        zzaleVarZza.zza(1);
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zzll.zza(fetchPlaceRequest.getPlaceFields()));
        zzaleVarZza.zzb((zzamd) zzamcVarZza.zzG());
        zzalf zzalfVar = (zzalf) zzaleVarZza.zzG();
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(5);
        zzamhVarZzq.zzg(zzalfVar);
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, i10, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }
}
