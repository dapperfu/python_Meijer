package com.google.android.libraries.places.internal;

import De.t;
import Ee.L;
import Ee.M;
import Ee.Q;
import android.graphics.Color;
import android.net.Uri;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.AccessibilityOptions;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.AuthorAttribution;
import com.google.android.libraries.places.api.model.AuthorAttributions;
import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.EVChargeOptions;
import com.google.android.libraries.places.api.model.EVConnectorType;
import com.google.android.libraries.places.api.model.FuelOptions;
import com.google.android.libraries.places.api.model.FuelPrice;
import com.google.android.libraries.places.api.model.LocalDate;
import com.google.android.libraries.places.api.model.LocalTime;
import com.google.android.libraries.places.api.model.Money;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.ParkingOptions;
import com.google.android.libraries.places.api.model.PaymentOptions;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlusCode;
import com.google.android.libraries.places.api.model.Review;
import com.google.android.libraries.places.api.model.SpecialDay;
import com.google.android.libraries.places.api.model.SubDestination;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import com.medallia.digital.mobilesdk.q2;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes6.dex */
final class zziw {
    private final zziz zza;
    private final M zzb = M.a().f(zzavm.OPERATIONAL, Place.BusinessStatus.OPERATIONAL).f(zzavm.CLOSED_TEMPORARILY, Place.BusinessStatus.CLOSED_TEMPORARILY).f(zzavm.CLOSED_PERMANENTLY, Place.BusinessStatus.CLOSED_PERMANENTLY).c();
    private final M zzc = M.a().f(zzawi.ACCESS, OpeningHours.HoursType.ACCESS).f(zzawi.BREAKFAST, OpeningHours.HoursType.BREAKFAST).f(zzawi.BRUNCH, OpeningHours.HoursType.BRUNCH).f(zzawi.DELIVERY, OpeningHours.HoursType.DELIVERY).f(zzawi.DINNER, OpeningHours.HoursType.DINNER).f(zzawi.DRIVE_THROUGH, OpeningHours.HoursType.DRIVE_THROUGH).f(zzawi.HAPPY_HOUR, OpeningHours.HoursType.HAPPY_HOUR).f(zzawi.KITCHEN, OpeningHours.HoursType.KITCHEN).f(zzawi.LUNCH, OpeningHours.HoursType.LUNCH).f(zzawi.ONLINE_SERVICE_HOURS, OpeningHours.HoursType.ONLINE_SERVICE_HOURS).f(zzawi.PICKUP, OpeningHours.HoursType.PICKUP).f(zzawi.SENIOR_HOURS, OpeningHours.HoursType.SENIOR_HOURS).f(zzawi.TAKEOUT, OpeningHours.HoursType.TAKEOUT).c();
    private final M zzd = M.a().f(zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED, EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED).f(zzaun.EV_CONNECTOR_TYPE_OTHER, EVConnectorType.EV_CONNECTOR_TYPE_OTHER).f(zzaun.EV_CONNECTOR_TYPE_J1772, EVConnectorType.EV_CONNECTOR_TYPE_J1772).f(zzaun.EV_CONNECTOR_TYPE_TYPE_2, EVConnectorType.EV_CONNECTOR_TYPE_TYPE_2).f(zzaun.EV_CONNECTOR_TYPE_CHADEMO, EVConnectorType.EV_CONNECTOR_TYPE_CHADEMO).f(zzaun.EV_CONNECTOR_TYPE_CCS_COMBO_1, EVConnectorType.EV_CONNECTOR_TYPE_CCS_COMBO_1).f(zzaun.EV_CONNECTOR_TYPE_CCS_COMBO_2, EVConnectorType.EV_CONNECTOR_TYPE_CCS_COMBO_2).f(zzaun.EV_CONNECTOR_TYPE_TESLA, EVConnectorType.EV_CONNECTOR_TYPE_TESLA).f(zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T, EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T).f(zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET, EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET).c();
    private final M zze = M.a().f(zzauq.FUEL_TYPE_UNSPECIFIED, FuelPrice.FuelType.FUEL_TYPE_UNSPECIFIED).f(zzauq.DIESEL, FuelPrice.FuelType.DIESEL).f(zzauq.REGULAR_UNLEADED, FuelPrice.FuelType.REGULAR_UNLEADED).f(zzauq.MIDGRADE, FuelPrice.FuelType.MIDGRADE).f(zzauq.PREMIUM, FuelPrice.FuelType.PREMIUM).f(zzauq.SP91, FuelPrice.FuelType.SP91).f(zzauq.SP91_E10, FuelPrice.FuelType.SP91_E10).f(zzauq.SP92, FuelPrice.FuelType.SP92).f(zzauq.SP95, FuelPrice.FuelType.SP95).f(zzauq.SP95_E10, FuelPrice.FuelType.SP95_E10).f(zzauq.SP98, FuelPrice.FuelType.SP98).f(zzauq.SP99, FuelPrice.FuelType.SP99).f(zzauq.SP100, FuelPrice.FuelType.SP100).f(zzauq.LPG, FuelPrice.FuelType.LPG).f(zzauq.E80, FuelPrice.FuelType.E80).f(zzauq.E85, FuelPrice.FuelType.E85).f(zzauq.METHANE, FuelPrice.FuelType.METHANE).f(zzauq.BIO_DIESEL, FuelPrice.FuelType.BIO_DIESEL).f(zzauq.TRUCK_DIESEL, FuelPrice.FuelType.TRUCK_DIESEL).c();

    final Place zza(zzaww zzawwVar) throws ApiException {
        AddressComponents addressComponentsNewInstance;
        EVChargeOptions eVChargeOptionsNewInstance;
        Integer numValueOf;
        ArrayList arrayList;
        AuthorAttributions authorAttributionsNewInstance;
        PlusCode plusCodeBuild;
        com.google.android.libraries.places.api.model.zzey zzeyVarZzc;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Place.Builder builder = Place.builder();
        zzave zzaveVarZzaO = zzawwVar.zzaO();
        AccessibilityOptions.Builder builder2 = AccessibilityOptions.builder();
        builder2.setWheelchairAccessibleParking(zzk(zzaveVarZzaO.zza(), zzaveVarZzaO.zzc()));
        builder2.setWheelchairAccessibleEntrance(zzk(zzaveVarZzaO.zzd(), zzaveVarZzaO.zze()));
        builder2.setWheelchairAccessibleRestroom(zzk(zzaveVarZzaO.zzf(), zzaveVarZzaO.zzg()));
        builder2.setWheelchairAccessibleSeating(zzk(zzaveVarZzaO.zzh(), zzaveVarZzaO.zzi()));
        builder.setAccessibilityOptions(builder2.build());
        builder.setAddress(zzi(zzawwVar.zzl()));
        List<zzavg> listZzn = zzawwVar.zzn();
        LatLngBounds latLngBounds = null;
        if (listZzn.isEmpty()) {
            addressComponentsNewInstance = null;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (zzavg zzavgVar : listZzn) {
                try {
                    AddressComponent.Builder builder3 = AddressComponent.builder(zzavgVar.zza(), zzavgVar.zzd());
                    builder3.setShortName(zzi(zzavgVar.zzc()));
                    arrayList4.add(builder3.build());
                } catch (IllegalArgumentException e10) {
                    throw zzh(String.format("AddressComponent is not properly defined: %s.", e10.getMessage()));
                }
            }
            addressComponentsNewInstance = AddressComponents.newInstance(arrayList4);
        }
        builder.setAddressComponents(addressComponentsNewInstance);
        String strZzD = zzawwVar.zzD();
        builder.setAdrFormatAddress(strZzD.isEmpty() ? null : zzuf.zza(strZzD).zza());
        builder.setAllowsDogs(zzk(zzawwVar.zzaD(), zzawwVar.zzaE()));
        List listZzG = zzawwVar.zzG();
        builder.setAttributions(listZzG.isEmpty() ? null : (List) listZzG.stream().map(new Function(this) { // from class: com.google.android.libraries.places.internal.zzis
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                zzavk zzavkVar = (zzavk) obj;
                return zziw.zzr(zziw.zzl(zzavkVar.zzc()), zzavkVar.zza());
            }
        }).collect(L.K()));
        builder.setBusinessStatus((Place.BusinessStatus) this.zzb.getOrDefault(zzawwVar.zzE(), null));
        builder.setCurbsidePickup(zzk(zzawwVar.zzR(), zzawwVar.zzS()));
        builder.setCurrentOpeningHours(zzawwVar.zzaj() ? zzg(zzawwVar.zzak()) : null);
        builder.setCurrentSecondaryOpeningHours(zzf(zzawwVar.zzal()));
        builder.setDelivery(zzk(zzawwVar.zzN(), zzawwVar.zzO()));
        builder.setDineIn(zzk(zzawwVar.zzP(), zzawwVar.zzQ()));
        builder.setDisplayName(zzawwVar.zzd() ? zzi(zzawwVar.zze().zzc()) : null);
        builder.setDisplayNameLanguageCode(zzawwVar.zzd() ? zzi(zzawwVar.zze().zze()) : null);
        builder.setEditorialSummary(zzawwVar.zzan() ? zzi(zzawwVar.zzao().zzc()) : null);
        builder.setEditorialSummaryLanguageCode(zzawwVar.zzan() ? zzi(zzawwVar.zzao().zze()) : null);
        if (zzawwVar.zzaR()) {
            zzaum zzaumVarZzaS = zzawwVar.zzaS();
            eVChargeOptionsNewInstance = EVChargeOptions.newInstance(Integer.valueOf(zzaumVarZzaS.zza()), (L) zzaumVarZzaS.zzc().stream().map(new Function() { // from class: com.google.android.libraries.places.internal.zziu
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return this.zza.zzc((zzauj) obj);
                }
            }).collect(L.K()));
        } else {
            eVChargeOptionsNewInstance = null;
        }
        builder.setEvChargeOptions(eVChargeOptionsNewInstance);
        builder.setFormattedAddress(zzi(zzawwVar.zzl()));
        builder.setFuelOptions(zzawwVar.zzaP() ? FuelOptions.newInstance((L) zzawwVar.zzaQ().zza().stream().map(new Function() { // from class: com.google.android.libraries.places.internal.zzit
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb((zzaur) obj);
            }
        }).collect(L.K())) : null);
        builder.setGoodForChildren(zzk(zzawwVar.zzaB(), zzawwVar.zzaC()));
        builder.setGoodForGroups(zzk(zzawwVar.zzaH(), zzawwVar.zzaI()));
        builder.setGoodForWatchingSports(zzk(zzawwVar.zzaJ(), zzawwVar.zzaK()));
        builder.setGoogleMapsUri(zzs(zzawwVar.zzv()));
        String strZzK = zzawwVar.zzK();
        if (strZzK.isEmpty()) {
            numValueOf = null;
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strZzK));
            } catch (IllegalArgumentException unused) {
            }
        }
        builder.setIconBackgroundColor(numValueOf);
        builder.setIconMaskUrl(zzm(zzawwVar.zzJ()));
        builder.setIconUrl(zzm(zzawwVar.zzJ()));
        builder.setId(zzi(zzawwVar.zzc()));
        builder.setInternationalPhoneNumber(zzi(zzawwVar.zzk()));
        builder.setLatLng(zzawwVar.zzq() ? zzo(zzawwVar.zzr()) : null);
        builder.setLiveMusic(zzk(zzawwVar.zzar(), zzawwVar.zzas()));
        builder.setLocation(zzawwVar.zzq() ? zzo(zzawwVar.zzr()) : null);
        builder.setMenuForChildren(zzk(zzawwVar.zzat(), zzawwVar.zzau()));
        builder.setName(zzawwVar.zzd() ? zzi(zzawwVar.zze().zzc()) : null);
        builder.setNameLanguageCode(zzawwVar.zzd() ? zzi(zzawwVar.zze().zze()) : null);
        builder.setNationalPhoneNumber(zzi(zzawwVar.zzj()));
        builder.setOpeningHours(zzawwVar.zzy() ? zzg(zzawwVar.zzz()) : null);
        builder.setOutdoorSeating(zzk(zzawwVar.zzap(), zzawwVar.zzaq()));
        zzawn zzawnVarZzaM = zzawwVar.zzaM();
        ParkingOptions.Builder builder4 = ParkingOptions.builder();
        builder4.setFreeParkingLot(zzk(zzawnVarZzaM.zza(), zzawnVarZzaM.zzc()));
        builder4.setPaidParkingLot(zzk(zzawnVarZzaM.zzd(), zzawnVarZzaM.zze()));
        builder4.setFreeStreetParking(zzk(zzawnVarZzaM.zzf(), zzawnVarZzaM.zzg()));
        builder4.setPaidStreetParking(zzk(zzawnVarZzaM.zzh(), zzawnVarZzaM.zzi()));
        builder4.setValetParking(zzk(zzawnVarZzaM.zzj(), zzawnVarZzaM.zzk()));
        builder4.setFreeGarageParking(zzk(zzawnVarZzaM.zzl(), zzawnVarZzaM.zzm()));
        builder4.setPaidGarageParking(zzk(zzawnVarZzaM.zzn(), zzawnVarZzaM.zzo()));
        builder.setParkingOptions(builder4.build());
        zzawp zzawpVarZzaL = zzawwVar.zzaL();
        PaymentOptions.Builder builder5 = PaymentOptions.builder();
        builder5.setAcceptsCreditCards(zzk(zzawpVarZzaL.zza(), zzawpVarZzaL.zzc()));
        builder5.setAcceptsDebitCards(zzk(zzawpVarZzaL.zzd(), zzawpVarZzaL.zze()));
        builder5.setAcceptsCashOnly(zzk(zzawpVarZzaL.zzf(), zzawpVarZzaL.zzg()));
        builder5.setAcceptsNfc(zzk(zzawpVarZzaL.zzh(), zzawpVarZzaL.zzi()));
        builder.setPaymentOptions(builder5.build());
        builder.setPhoneNumber(zzi(zzawwVar.zzk()));
        List<zzava> listZzC = zzawwVar.zzC();
        if (listZzC.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (zzava zzavaVar : listZzC) {
                String strZza = zzavaVar.zza();
                if (strZza.isEmpty() || strZza.split(q2.f93563c).length != 4) {
                    throw zzh("Photo reference not provided for a PhotoMetadata result.");
                }
                PhotoMetadata.Builder builder6 = PhotoMetadata.builder((String) Q.d(t.e('/').g(strZza), 3));
                builder6.zzb(zzavaVar.zza());
                builder6.setAttributions((String) zzavaVar.zze().stream().map(new Function(this) { // from class: com.google.android.libraries.places.internal.zziv
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        zzasu zzasuVar = (zzasu) obj;
                        return zziw.zzr(zziw.zzl(zzasuVar.zzc()), zzasuVar.zza());
                    }
                }).collect(Collectors.joining(", ")));
                builder6.setHeight(zzavaVar.zzd());
                builder6.setWidth(zzavaVar.zzc());
                List listZze = zzavaVar.zze();
                if (listZze.isEmpty()) {
                    authorAttributionsNewInstance = null;
                } else {
                    L.a aVarP = L.p();
                    Iterator it = listZze.iterator();
                    while (it.hasNext()) {
                        aVarP.a(zzt((zzasu) it.next()));
                    }
                    authorAttributionsNewInstance = AuthorAttributions.newInstance(aVarP.k());
                }
                builder6.setAuthorAttributions(authorAttributionsNewInstance);
                builder6.zzc(zzs(zzavaVar.zzf()));
                arrayList.add(builder6.build());
            }
        }
        builder.setPhotoMetadatas(arrayList);
        builder.setPlaceTypes(zzawwVar.zzf().isEmpty() ? null : zzawwVar.zzf());
        if (zzawwVar.zzo()) {
            zzawr zzawrVarZzp = zzawwVar.zzp();
            PlusCode.Builder builder7 = PlusCode.builder();
            builder7.setCompoundCode(zzi(zzawrVarZzp.zzc()));
            builder7.setGlobalCode(zzi(zzawrVarZzp.zza()));
            plusCodeBuild = builder7.build();
        } else {
            plusCodeBuild = null;
        }
        builder.setPlusCode(plusCodeBuild);
        int iOrdinal = zzawwVar.zzF().ordinal();
        builder.setPriceLevel(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? null : 4 : 3 : 2 : 1 : 0);
        if (zzawwVar.zzaV().zza()) {
            com.google.android.libraries.places.api.model.zzex zzexVarZzc = com.google.android.libraries.places.api.model.zzey.zzc();
            zzexVarZzc.zza(zzq(zzawwVar.zzaV().zzc()));
            if (zzawwVar.zzaV().zzd()) {
                zzexVarZzc.zzb(zzq(zzawwVar.zzaV().zze()));
            }
            zzeyVarZzc = zzexVarZzc.zzc();
        } else {
            zzeyVarZzc = null;
        }
        builder.zza(zzeyVarZzc);
        builder.setPrimaryType(zzi(zzawwVar.zzg()));
        builder.setPrimaryTypeDisplayName(zzawwVar.zzh() ? zzi(zzawwVar.zzi().zzc()) : null);
        builder.setPrimaryTypeDisplayNameLanguageCode(zzawwVar.zzh() ? zzi(zzawwVar.zzi().zze()) : null);
        builder.setPureServiceAreaBusiness(zzk(zzawwVar.zzaT(), zzawwVar.zzaU()));
        double dZzu = zzawwVar.zzu();
        builder.setRating(dZzu < 1.0d ? null : Double.valueOf(dZzu));
        builder.setReservable(zzk(zzawwVar.zzT(), zzawwVar.zzU()));
        builder.setResourceName(zzi(zzawwVar.zza()));
        builder.setRestroom(zzk(zzawwVar.zzaF(), zzawwVar.zzaG()));
        List<zzaxi> listZzx = zzawwVar.zzx();
        if (listZzx.isEmpty()) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            for (zzaxi zzaxiVar : listZzx) {
                double dZzg = zzaxiVar.zzg();
                if (dZzg == 0.0d) {
                    throw zzh("Review rating not provided for a Review result.");
                }
                if (!zzaxiVar.zzh()) {
                    throw zzh("Author attribution not provided for a Review result.");
                }
                String strZza2 = zzaxiVar.zzj() ? zzbdb.zza(zzaxiVar.zzk()) : null;
                String strZzi = zzaxiVar.zzc() ? zzi(zzaxiVar.zzd().zzc()) : null;
                String strZzi2 = zzaxiVar.zzc() ? zzi(zzaxiVar.zzd().zze()) : null;
                String strZzi3 = zzaxiVar.zze() ? zzi(zzaxiVar.zzf().zzc()) : null;
                String strZzi4 = zzaxiVar.zze() ? zzi(zzaxiVar.zzf().zze()) : null;
                String strZzi5 = zzi(zzaxiVar.zza());
                Review.Builder builder8 = Review.builder(Double.valueOf(dZzg), zzt(zzaxiVar.zzi()));
                builder8.setPublishTime(strZza2);
                builder8.setText(strZzi);
                builder8.setTextLanguageCode(strZzi2);
                builder8.setOriginalText(strZzi3);
                builder8.setOriginalTextLanguageCode(strZzi4);
                builder8.setRelativePublishTimeDescription(strZzi5);
                builder8.setFlagContentUri(zzs(zzaxiVar.zzl()));
                arrayList2.add(builder8.build());
            }
        }
        builder.setReviews(arrayList2);
        builder.setSecondaryOpeningHours(zzf(zzawwVar.zzam()));
        builder.setServesBeer(zzk(zzawwVar.zzab(), zzawwVar.zzac()));
        builder.setServesBreakfast(zzk(zzawwVar.zzV(), zzawwVar.zzW()));
        builder.setServesBrunch(zzk(zzawwVar.zzaf(), zzawwVar.zzag()));
        builder.setServesCocktails(zzk(zzawwVar.zzav(), zzawwVar.zzaw()));
        builder.setServesCoffee(zzk(zzawwVar.zzaz(), zzawwVar.zzaA()));
        builder.setServesDessert(zzk(zzawwVar.zzax(), zzawwVar.zzay()));
        builder.setServesDinner(zzk(zzawwVar.zzZ(), zzawwVar.zzaa()));
        builder.setServesLunch(zzk(zzawwVar.zzX(), zzawwVar.zzY()));
        builder.setServesVegetarianFood(zzk(zzawwVar.zzah(), zzawwVar.zzai()));
        builder.setServesWine(zzk(zzawwVar.zzad(), zzawwVar.zzae()));
        builder.setShortFormattedAddress(zzi(zzawwVar.zzm()));
        List<zzawv> listZzaN = zzawwVar.zzaN();
        if (listZzaN.isEmpty()) {
            arrayList3 = null;
        } else {
            arrayList3 = new ArrayList();
            for (zzawv zzawvVar : listZzaN) {
                arrayList3.add(SubDestination.newInstance(zzawvVar.zzc(), zzawvVar.zza()));
            }
        }
        builder.setSubDestinations(arrayList3);
        builder.setTakeout(zzk(zzawwVar.zzL(), zzawwVar.zzM()));
        builder.setTypes(this.zza.zza(zzawwVar.zzf()));
        builder.setUserRatingCount(zzawwVar.zzH() ? Integer.valueOf(zzawwVar.zzI()) : null);
        builder.setUserRatingsTotal(zzawwVar.zzH() ? Integer.valueOf(zzawwVar.zzI()) : null);
        builder.setUtcOffsetMinutes(zzawwVar.zzA() ? Integer.valueOf(zzawwVar.zzB()) : null);
        if (zzawwVar.zzs()) {
            zzaqo zzaqoVarZzt = zzawwVar.zzt();
            latLngBounds = new LatLngBounds(zzo(zzaqoVarZzt.zza()), zzo(zzaqoVarZzt.zzc()));
        }
        builder.setViewport(latLngBounds);
        builder.setWebsiteUri(zzs(zzawwVar.zzw()));
        builder.setWheelchairAccessibleEntrance(zzk(zzawwVar.zzaO().zzd(), zzawwVar.zzaO().zze()));
        return builder.build();
    }

    private static final ApiException zzh(String str) {
        return new ApiException(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static final Place.BooleanPlaceAttributeValue zzk(boolean z10, boolean z11) {
        return !z10 ? Place.BooleanPlaceAttributeValue.UNKNOWN : z11 ? Place.BooleanPlaceAttributeValue.TRUE : Place.BooleanPlaceAttributeValue.FALSE;
    }

    private static final String zzl(String str) {
        return str.startsWith("//") ? "https:".concat(str) : str;
    }

    private static final LatLng zzo(zzbee zzbeeVar) {
        return new LatLng(zzbeeVar.zzc(), zzbeeVar.zze());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzr(String str, String str2) {
        zzue zzueVar = new zzue("a");
        int i10 = zzuh.zza;
        zzueVar.zza(zzuh.zza(str, zzug.zza));
        zzueVar.zzb(str2);
        return zzueVar.zzc().zza();
    }

    final /* synthetic */ FuelPrice zzb(zzaur zzaurVar) {
        return FuelPrice.newInstance((FuelPrice.FuelType) this.zze.getOrDefault(zzaurVar.zza(), FuelPrice.FuelType.FUEL_TYPE_UNSPECIFIED), zzq(zzaurVar.zzc()), zzn(zzaurVar.zzd()));
    }

    final /* synthetic */ ConnectorAggregation zzc(zzauj zzaujVar) {
        ConnectorAggregation.Builder builder = ConnectorAggregation.builder((EVConnectorType) this.zzd.getOrDefault(zzaujVar.zza(), EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED), Double.valueOf(zzaujVar.zzc()), Integer.valueOf(zzaujVar.zzd()));
        builder.setAvailableCount(zzaujVar.zze() ? Integer.valueOf(zzaujVar.zzf()) : null);
        builder.setOutOfServiceCount(zzaujVar.zzg() ? Integer.valueOf(zzaujVar.zzh()) : null);
        builder.setAvailabilityLastUpdateTime(zzaujVar.zzi() ? zzn(zzaujVar.zzj()) : null);
        return builder.build();
    }

    zziw(zziz zzizVar) {
        this.zza = zzizVar;
    }

    private final List zzf(List list) throws ApiException {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzg((zzawl) it.next()));
        }
        return arrayList;
    }

    private final OpeningHours zzg(zzawl zzawlVar) throws ApiException {
        Instant instantZzj;
        Boolean boolValueOf;
        Instant instantZzj2;
        TimeOfWeek timeOfWeekZzu;
        OpeningHours.Builder builder = OpeningHours.builder();
        List listZzd = zzawlVar.zzd();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzd.iterator();
        while (true) {
            instantZzj = null;
            TimeOfWeek timeOfWeekZzu2 = null;
            if (!it.hasNext()) {
                break;
            }
            zzawh zzawhVar = (zzawh) it.next();
            Period.Builder builder2 = Period.builder();
            if (zzawhVar.zza()) {
                timeOfWeekZzu = zzu(zzawhVar.zzc());
            } else {
                timeOfWeekZzu = null;
            }
            builder2.setOpen(timeOfWeekZzu);
            if (zzawhVar.zzd()) {
                timeOfWeekZzu2 = zzu(zzawhVar.zze());
            }
            builder2.setClose(timeOfWeekZzu2);
            arrayList.add(builder2.build());
        }
        builder.setPeriods(arrayList);
        builder.setWeekdayText(zzawlVar.zze());
        builder.setHoursType((OpeningHours.HoursType) this.zzc.getOrDefault(zzawlVar.zzf(), null));
        List listZzg = zzawlVar.zzg();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listZzg.iterator();
        while (it2.hasNext()) {
            try {
                SpecialDay.Builder builder3 = SpecialDay.builder(zzp(((zzawk) it2.next()).zza()));
                builder3.setExceptional(true);
                arrayList2.add(builder3.build());
            } catch (IllegalArgumentException e10) {
                throw zzh(String.format("Special day is not properly defined: %s", e10.getMessage()));
            }
        }
        builder.setSpecialDays(arrayList2);
        if (zzawlVar.zza()) {
            boolValueOf = Boolean.valueOf(zzawlVar.zzc());
        } else {
            boolValueOf = null;
        }
        builder.zza(boolValueOf);
        if (zzawlVar.zzh()) {
            instantZzj2 = zzj(zzawlVar.zzi());
        } else {
            instantZzj2 = null;
        }
        builder.zzb(instantZzj2);
        if (zzawlVar.zzj()) {
            instantZzj = zzj(zzawlVar.zzk());
        }
        builder.zzc(instantZzj);
        return builder.build();
    }

    private static final String zzi(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static final Instant zzj(zzbck zzbckVar) {
        return Instant.ofEpochSecond(zzbckVar.zzc(), zzbckVar.zze());
    }

    private static final String zzm(String str) {
        if (!str.isEmpty()) {
            return str.concat(".png");
        }
        return null;
    }

    private static final Instant zzn(zzbck zzbckVar) {
        return Instant.ofEpochSecond(zzbckVar.zzc(), zzbckVar.zze());
    }

    private static final LocalDate zzp(zzbec zzbecVar) {
        return LocalDate.newInstance(zzbecVar.zzc(), zzbecVar.zze(), zzbecVar.zzf());
    }

    private static final Money zzq(zzbei zzbeiVar) {
        return Money.newInstance(zzbeiVar.zzc(), Long.valueOf(zzbeiVar.zze()), Integer.valueOf(zzbeiVar.zzf()));
    }

    private static final Uri zzs(String str) {
        if (!str.isEmpty()) {
            return Uri.parse(str);
        }
        return null;
    }

    private static final AuthorAttribution zzt(zzasu zzasuVar) throws ApiException {
        String strZza = zzasuVar.zza();
        if (!strZza.isEmpty()) {
            AuthorAttribution.Builder builder = AuthorAttribution.builder(strZza);
            builder.setUri(zzi(zzasuVar.zzc()));
            builder.setPhotoUri(zzi(zzasuVar.zzd()));
            return builder.build();
        }
        throw zzh("Author name not provided for an AuthorAttribution result.");
    }

    private static final TimeOfWeek zzu(zzawg zzawgVar) throws ApiException {
        LocalDate localDateZzp;
        DayOfWeek dayOfWeek;
        int iZza = zzawgVar.zza();
        LocalTime localTimeNewInstance = LocalTime.newInstance(zzawgVar.zzc(), zzawgVar.zzd());
        if (zzawgVar.zze()) {
            localDateZzp = zzp(zzawgVar.zzf());
        } else {
            localDateZzp = null;
        }
        switch (iZza) {
            case 0:
                dayOfWeek = DayOfWeek.SUNDAY;
                break;
            case 1:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case 2:
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case 3:
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case 4:
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case 5:
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case 6:
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
            default:
                throw zzh("Day of week must an integer between 0 and 6");
        }
        TimeOfWeek.Builder builder = TimeOfWeek.builder(dayOfWeek, localTimeNewInstance);
        builder.setDate(localDateZzp);
        builder.setTruncated(zzawgVar.zzg());
        return builder.build();
    }
}
