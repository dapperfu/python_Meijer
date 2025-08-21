package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes6.dex */
abstract class zzar extends Place {
    private final String zzA;
    private final String zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final PlusCode zzF;
    private final Integer zzG;
    private final zzey zzH;
    private final String zzI;
    private final String zzJ;
    private final String zzK;
    private final Double zzL;
    private final Place.BooleanPlaceAttributeValue zzM;
    private final List zzN;
    private final List zzO;
    private final Place.BooleanPlaceAttributeValue zzP;
    private final Place.BooleanPlaceAttributeValue zzQ;
    private final Place.BooleanPlaceAttributeValue zzR;
    private final Place.BooleanPlaceAttributeValue zzS;
    private final Place.BooleanPlaceAttributeValue zzT;
    private final Place.BooleanPlaceAttributeValue zzU;
    private final Place.BooleanPlaceAttributeValue zzV;
    private final Place.BooleanPlaceAttributeValue zzW;
    private final List zzX;
    private final Integer zzY;
    private final Integer zzZ;
    private final String zza;
    private final Integer zzaa;
    private final LatLngBounds zzab;
    private final Uri zzac;
    private final Uri zzad;
    private final Place.BooleanPlaceAttributeValue zzae;
    private final AccessibilityOptions zzaf;
    private final ParkingOptions zzag;
    private final PaymentOptions zzah;
    private final EVChargeOptions zzai;
    private final Place.BooleanPlaceAttributeValue zzaj;
    private final Place.BooleanPlaceAttributeValue zzak;
    private final Place.BooleanPlaceAttributeValue zzal;
    private final Place.BooleanPlaceAttributeValue zzam;
    private final Place.BooleanPlaceAttributeValue zzan;
    private final Place.BooleanPlaceAttributeValue zzao;
    private final Place.BooleanPlaceAttributeValue zzap;
    private final Place.BooleanPlaceAttributeValue zzaq;
    private final Place.BooleanPlaceAttributeValue zzar;
    private final Place.BooleanPlaceAttributeValue zzas;
    private final Place.BooleanPlaceAttributeValue zzat;
    private final List zzau;
    private final FuelOptions zzav;
    private final Place.BooleanPlaceAttributeValue zzaw;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final AddressComponents zze;
    private final List zzf;
    private final Place.BusinessStatus zzg;
    private final Place.BooleanPlaceAttributeValue zzh;
    private final OpeningHours zzi;
    private final Place.BooleanPlaceAttributeValue zzj;
    private final Place.BooleanPlaceAttributeValue zzk;
    private final String zzl;
    private final String zzm;
    private final Integer zzn;
    private final String zzo;
    private final String zzp;
    private final String zzq;
    private final LatLng zzr;
    private final LatLng zzs;
    private final String zzt;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final OpeningHours zzy;
    private final String zzz;

    zzar(String str, String str2, String str3, String str4, AddressComponents addressComponents, List list, Place.BusinessStatus businessStatus, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, OpeningHours openingHours, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, OpeningHours openingHours2, String str15, String str16, String str17, List list2, List list3, List list4, PlusCode plusCode, Integer num2, zzey zzeyVar, String str18, String str19, String str20, Double d10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, List list5, List list6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13, AccessibilityOptions accessibilityOptions, ParkingOptions parkingOptions, PaymentOptions paymentOptions, EVChargeOptions eVChargeOptions, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24, List list8, FuelOptions fuelOptions, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue25) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = addressComponents;
        this.zzf = list;
        this.zzg = businessStatus;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null curbsidePickup");
        }
        this.zzh = booleanPlaceAttributeValue;
        this.zzi = openingHours;
        if (booleanPlaceAttributeValue2 == null) {
            throw new NullPointerException("Null delivery");
        }
        this.zzj = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            throw new NullPointerException("Null dineIn");
        }
        this.zzk = booleanPlaceAttributeValue3;
        this.zzl = str5;
        this.zzm = str6;
        this.zzn = num;
        this.zzo = str7;
        this.zzp = str8;
        this.zzq = str9;
        this.zzr = latLng;
        this.zzs = latLng2;
        this.zzt = str10;
        this.zzu = str11;
        this.zzv = str12;
        this.zzw = str13;
        this.zzx = str14;
        this.zzy = openingHours2;
        this.zzz = str15;
        this.zzA = str16;
        this.zzB = str17;
        this.zzC = list2;
        this.zzD = list3;
        this.zzE = list4;
        this.zzF = plusCode;
        this.zzG = num2;
        this.zzH = zzeyVar;
        this.zzI = str18;
        this.zzJ = str19;
        this.zzK = str20;
        this.zzL = d10;
        if (booleanPlaceAttributeValue4 == null) {
            throw new NullPointerException("Null reservable");
        }
        this.zzM = booleanPlaceAttributeValue4;
        this.zzN = list5;
        this.zzO = list6;
        if (booleanPlaceAttributeValue5 == null) {
            throw new NullPointerException("Null servesBeer");
        }
        this.zzP = booleanPlaceAttributeValue5;
        if (booleanPlaceAttributeValue6 == null) {
            throw new NullPointerException("Null servesBreakfast");
        }
        this.zzQ = booleanPlaceAttributeValue6;
        if (booleanPlaceAttributeValue7 == null) {
            throw new NullPointerException("Null servesBrunch");
        }
        this.zzR = booleanPlaceAttributeValue7;
        if (booleanPlaceAttributeValue8 == null) {
            throw new NullPointerException("Null servesDinner");
        }
        this.zzS = booleanPlaceAttributeValue8;
        if (booleanPlaceAttributeValue9 == null) {
            throw new NullPointerException("Null servesLunch");
        }
        this.zzT = booleanPlaceAttributeValue9;
        if (booleanPlaceAttributeValue10 == null) {
            throw new NullPointerException("Null servesVegetarianFood");
        }
        this.zzU = booleanPlaceAttributeValue10;
        if (booleanPlaceAttributeValue11 == null) {
            throw new NullPointerException("Null servesWine");
        }
        this.zzV = booleanPlaceAttributeValue11;
        if (booleanPlaceAttributeValue12 == null) {
            throw new NullPointerException("Null takeout");
        }
        this.zzW = booleanPlaceAttributeValue12;
        this.zzX = list7;
        this.zzY = num3;
        this.zzZ = num4;
        this.zzaa = num5;
        this.zzab = latLngBounds;
        this.zzac = uri;
        this.zzad = uri2;
        if (booleanPlaceAttributeValue13 == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.zzae = booleanPlaceAttributeValue13;
        this.zzaf = accessibilityOptions;
        this.zzag = parkingOptions;
        this.zzah = paymentOptions;
        this.zzai = eVChargeOptions;
        if (booleanPlaceAttributeValue14 == null) {
            throw new NullPointerException("Null outdoorSeating");
        }
        this.zzaj = booleanPlaceAttributeValue14;
        if (booleanPlaceAttributeValue15 == null) {
            throw new NullPointerException("Null liveMusic");
        }
        this.zzak = booleanPlaceAttributeValue15;
        if (booleanPlaceAttributeValue16 == null) {
            throw new NullPointerException("Null menuForChildren");
        }
        this.zzal = booleanPlaceAttributeValue16;
        if (booleanPlaceAttributeValue17 == null) {
            throw new NullPointerException("Null servesCocktails");
        }
        this.zzam = booleanPlaceAttributeValue17;
        if (booleanPlaceAttributeValue18 == null) {
            throw new NullPointerException("Null servesDessert");
        }
        this.zzan = booleanPlaceAttributeValue18;
        if (booleanPlaceAttributeValue19 == null) {
            throw new NullPointerException("Null servesCoffee");
        }
        this.zzao = booleanPlaceAttributeValue19;
        if (booleanPlaceAttributeValue20 == null) {
            throw new NullPointerException("Null goodForChildren");
        }
        this.zzap = booleanPlaceAttributeValue20;
        if (booleanPlaceAttributeValue21 == null) {
            throw new NullPointerException("Null allowsDogs");
        }
        this.zzaq = booleanPlaceAttributeValue21;
        if (booleanPlaceAttributeValue22 == null) {
            throw new NullPointerException("Null restroom");
        }
        this.zzar = booleanPlaceAttributeValue22;
        if (booleanPlaceAttributeValue23 == null) {
            throw new NullPointerException("Null goodForGroups");
        }
        this.zzas = booleanPlaceAttributeValue23;
        if (booleanPlaceAttributeValue24 == null) {
            throw new NullPointerException("Null goodForWatchingSports");
        }
        this.zzat = booleanPlaceAttributeValue24;
        this.zzau = list8;
        this.zzav = fuelOptions;
        if (booleanPlaceAttributeValue25 == null) {
            throw new NullPointerException("Null pureServiceAreaBusiness");
        }
        this.zzaw = booleanPlaceAttributeValue25;
    }

    public final boolean equals(Object obj) {
        OpeningHours openingHours;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        LatLng latLng;
        LatLng latLng2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        OpeningHours openingHours2;
        String str11;
        String str12;
        String str13;
        List list;
        List list2;
        List list3;
        PlusCode plusCode;
        Integer num2;
        zzey zzeyVar;
        String str14;
        String str15;
        String str16;
        Double d10;
        List list4;
        List list5;
        List list6;
        Integer num3;
        Integer num4;
        Integer num5;
        LatLngBounds latLngBounds;
        Uri uri;
        Uri uri2;
        AccessibilityOptions accessibilityOptions;
        ParkingOptions parkingOptions;
        PaymentOptions paymentOptions;
        EVChargeOptions eVChargeOptions;
        List list7;
        FuelOptions fuelOptions;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            String str17 = this.zza;
            if (str17 != null ? str17.equals(place.getAddress()) : place.getAddress() == null) {
                String str18 = this.zzb;
                if (str18 != null ? str18.equals(place.getFormattedAddress()) : place.getFormattedAddress() == null) {
                    String str19 = this.zzc;
                    if (str19 != null ? str19.equals(place.getShortFormattedAddress()) : place.getShortFormattedAddress() == null) {
                        String str20 = this.zzd;
                        if (str20 != null ? str20.equals(place.getAdrFormatAddress()) : place.getAdrFormatAddress() == null) {
                            AddressComponents addressComponents = this.zze;
                            if (addressComponents != null ? addressComponents.equals(place.getAddressComponents()) : place.getAddressComponents() == null) {
                                List list8 = this.zzf;
                                if (list8 != null ? list8.equals(place.getAttributions()) : place.getAttributions() == null) {
                                    Place.BusinessStatus businessStatus = this.zzg;
                                    if (businessStatus != null ? businessStatus.equals(place.getBusinessStatus()) : place.getBusinessStatus() == null) {
                                        if (this.zzh.equals(place.getCurbsidePickup()) && ((openingHours = this.zzi) != null ? openingHours.equals(place.getCurrentOpeningHours()) : place.getCurrentOpeningHours() == null) && this.zzj.equals(place.getDelivery()) && this.zzk.equals(place.getDineIn()) && ((str = this.zzl) != null ? str.equals(place.getEditorialSummary()) : place.getEditorialSummary() == null) && ((str2 = this.zzm) != null ? str2.equals(place.getEditorialSummaryLanguageCode()) : place.getEditorialSummaryLanguageCode() == null) && ((num = this.zzn) != null ? num.equals(place.getIconBackgroundColor()) : place.getIconBackgroundColor() == null) && ((str3 = this.zzo) != null ? str3.equals(place.getIconUrl()) : place.getIconUrl() == null) && ((str4 = this.zzp) != null ? str4.equals(place.getIconMaskUrl()) : place.getIconMaskUrl() == null) && ((str5 = this.zzq) != null ? str5.equals(place.getId()) : place.getId() == null) && ((latLng = this.zzr) != null ? latLng.equals(place.getLatLng()) : place.getLatLng() == null) && ((latLng2 = this.zzs) != null ? latLng2.equals(place.getLocation()) : place.getLocation() == null) && ((str6 = this.zzt) != null ? str6.equals(place.getName()) : place.getName() == null) && ((str7 = this.zzu) != null ? str7.equals(place.getDisplayName()) : place.getDisplayName() == null) && ((str8 = this.zzv) != null ? str8.equals(place.getNameLanguageCode()) : place.getNameLanguageCode() == null) && ((str9 = this.zzw) != null ? str9.equals(place.getDisplayNameLanguageCode()) : place.getDisplayNameLanguageCode() == null) && ((str10 = this.zzx) != null ? str10.equals(place.getResourceName()) : place.getResourceName() == null) && ((openingHours2 = this.zzy) != null ? openingHours2.equals(place.getOpeningHours()) : place.getOpeningHours() == null) && ((str11 = this.zzz) != null ? str11.equals(place.getPhoneNumber()) : place.getPhoneNumber() == null) && ((str12 = this.zzA) != null ? str12.equals(place.getInternationalPhoneNumber()) : place.getInternationalPhoneNumber() == null) && ((str13 = this.zzB) != null ? str13.equals(place.getNationalPhoneNumber()) : place.getNationalPhoneNumber() == null) && ((list = this.zzC) != null ? list.equals(place.getPhotoMetadatas()) : place.getPhotoMetadatas() == null) && ((list2 = this.zzD) != null ? list2.equals(place.getReviews()) : place.getReviews() == null) && ((list3 = this.zzE) != null ? list3.equals(place.getPlaceTypes()) : place.getPlaceTypes() == null) && ((plusCode = this.zzF) != null ? plusCode.equals(place.getPlusCode()) : place.getPlusCode() == null) && ((num2 = this.zzG) != null ? num2.equals(place.getPriceLevel()) : place.getPriceLevel() == null) && ((zzeyVar = this.zzH) != null ? zzeyVar.equals(place.zza()) : place.zza() == null) && ((str14 = this.zzI) != null ? str14.equals(place.getPrimaryType()) : place.getPrimaryType() == null) && ((str15 = this.zzJ) != null ? str15.equals(place.getPrimaryTypeDisplayName()) : place.getPrimaryTypeDisplayName() == null) && ((str16 = this.zzK) != null ? str16.equals(place.getPrimaryTypeDisplayNameLanguageCode()) : place.getPrimaryTypeDisplayNameLanguageCode() == null) && ((d10 = this.zzL) != null ? d10.equals(place.getRating()) : place.getRating() == null) && this.zzM.equals(place.getReservable()) && ((list4 = this.zzN) != null ? list4.equals(place.getSecondaryOpeningHours()) : place.getSecondaryOpeningHours() == null) && ((list5 = this.zzO) != null ? list5.equals(place.getCurrentSecondaryOpeningHours()) : place.getCurrentSecondaryOpeningHours() == null) && this.zzP.equals(place.getServesBeer()) && this.zzQ.equals(place.getServesBreakfast()) && this.zzR.equals(place.getServesBrunch()) && this.zzS.equals(place.getServesDinner()) && this.zzT.equals(place.getServesLunch()) && this.zzU.equals(place.getServesVegetarianFood()) && this.zzV.equals(place.getServesWine()) && this.zzW.equals(place.getTakeout()) && ((list6 = this.zzX) != null ? list6.equals(place.getTypes()) : place.getTypes() == null) && ((num3 = this.zzY) != null ? num3.equals(place.getUserRatingsTotal()) : place.getUserRatingsTotal() == null) && ((num4 = this.zzZ) != null ? num4.equals(place.getUserRatingCount()) : place.getUserRatingCount() == null) && ((num5 = this.zzaa) != null ? num5.equals(place.getUtcOffsetMinutes()) : place.getUtcOffsetMinutes() == null) && ((latLngBounds = this.zzab) != null ? latLngBounds.equals(place.getViewport()) : place.getViewport() == null) && ((uri = this.zzac) != null ? uri.equals(place.getWebsiteUri()) : place.getWebsiteUri() == null) && ((uri2 = this.zzad) != null ? uri2.equals(place.getGoogleMapsUri()) : place.getGoogleMapsUri() == null) && this.zzae.equals(place.getWheelchairAccessibleEntrance()) && ((accessibilityOptions = this.zzaf) != null ? accessibilityOptions.equals(place.getAccessibilityOptions()) : place.getAccessibilityOptions() == null) && ((parkingOptions = this.zzag) != null ? parkingOptions.equals(place.getParkingOptions()) : place.getParkingOptions() == null) && ((paymentOptions = this.zzah) != null ? paymentOptions.equals(place.getPaymentOptions()) : place.getPaymentOptions() == null) && ((eVChargeOptions = this.zzai) != null ? eVChargeOptions.equals(place.getEvChargeOptions()) : place.getEvChargeOptions() == null) && this.zzaj.equals(place.getOutdoorSeating()) && this.zzak.equals(place.getLiveMusic()) && this.zzal.equals(place.getMenuForChildren()) && this.zzam.equals(place.getServesCocktails()) && this.zzan.equals(place.getServesDessert()) && this.zzao.equals(place.getServesCoffee()) && this.zzap.equals(place.getGoodForChildren()) && this.zzaq.equals(place.getAllowsDogs()) && this.zzar.equals(place.getRestroom()) && this.zzas.equals(place.getGoodForGroups()) && this.zzat.equals(place.getGoodForWatchingSports()) && ((list7 = this.zzau) != null ? list7.equals(place.getSubDestinations()) : place.getSubDestinations() == null) && ((fuelOptions = this.zzav) != null ? fuelOptions.equals(place.getFuelOptions()) : place.getFuelOptions() == null) && this.zzaw.equals(place.getPureServiceAreaBusiness())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public AccessibilityOptions getAccessibilityOptions() {
        return this.zzaf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getAddress() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public AddressComponents getAddressComponents() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getAdrFormatAddress() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getAllowsDogs() {
        return this.zzaq;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<String> getAttributions() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BusinessStatus getBusinessStatus() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getCurbsidePickup() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public OpeningHours getCurrentOpeningHours() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<OpeningHours> getCurrentSecondaryOpeningHours() {
        return this.zzO;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getDelivery() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getDineIn() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getDisplayName() {
        return this.zzu;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getDisplayNameLanguageCode() {
        return this.zzw;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getEditorialSummary() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getEditorialSummaryLanguageCode() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public EVChargeOptions getEvChargeOptions() {
        return this.zzai;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getFormattedAddress() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public FuelOptions getFuelOptions() {
        return this.zzav;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getGoodForChildren() {
        return this.zzap;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getGoodForGroups() {
        return this.zzas;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getGoodForWatchingSports() {
        return this.zzat;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Uri getGoogleMapsUri() {
        return this.zzad;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getIconBackgroundColor() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getIconMaskUrl() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getIconUrl() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getId() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getInternationalPhoneNumber() {
        return this.zzA;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public LatLng getLatLng() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getLiveMusic() {
        return this.zzak;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public LatLng getLocation() {
        return this.zzs;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getMenuForChildren() {
        return this.zzal;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getName() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getNameLanguageCode() {
        return this.zzv;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getNationalPhoneNumber() {
        return this.zzB;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public OpeningHours getOpeningHours() {
        return this.zzy;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getOutdoorSeating() {
        return this.zzaj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public ParkingOptions getParkingOptions() {
        return this.zzag;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public PaymentOptions getPaymentOptions() {
        return this.zzah;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getPhoneNumber() {
        return this.zzz;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzC;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<String> getPlaceTypes() {
        return this.zzE;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public PlusCode getPlusCode() {
        return this.zzF;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getPriceLevel() {
        return this.zzG;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getPrimaryType() {
        return this.zzI;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getPrimaryTypeDisplayName() {
        return this.zzJ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getPrimaryTypeDisplayNameLanguageCode() {
        return this.zzK;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getPureServiceAreaBusiness() {
        return this.zzaw;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Double getRating() {
        return this.zzL;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getReservable() {
        return this.zzM;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getResourceName() {
        return this.zzx;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getRestroom() {
        return this.zzar;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<Review> getReviews() {
        return this.zzD;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<OpeningHours> getSecondaryOpeningHours() {
        return this.zzN;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesBeer() {
        return this.zzP;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesBreakfast() {
        return this.zzQ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesBrunch() {
        return this.zzR;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesCocktails() {
        return this.zzam;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesCoffee() {
        return this.zzao;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesDessert() {
        return this.zzan;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesDinner() {
        return this.zzS;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesLunch() {
        return this.zzT;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesVegetarianFood() {
        return this.zzU;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesWine() {
        return this.zzV;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getShortFormattedAddress() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<SubDestination> getSubDestinations() {
        return this.zzau;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getTakeout() {
        return this.zzW;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public List<Place.Type> getTypes() {
        return this.zzX;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getUserRatingCount() {
        return this.zzZ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public Integer getUserRatingsTotal() {
        return this.zzY;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getUtcOffsetMinutes() {
        return this.zzaa;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public LatLngBounds getViewport() {
        return this.zzab;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Uri getWebsiteUri() {
        return this.zzac;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        return this.zzae;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final zzey zza() {
        return this.zzH;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i10 = iHashCode ^ 1000003;
        String str3 = this.zzc;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.zzd;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        AddressComponents addressComponents = this.zze;
        int iHashCode5 = (iHashCode4 ^ (addressComponents == null ? 0 : addressComponents.hashCode())) * 1000003;
        List list = this.zzf;
        int iHashCode6 = (iHashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        Place.BusinessStatus businessStatus = this.zzg;
        int iHashCode7 = (((iHashCode6 ^ (businessStatus == null ? 0 : businessStatus.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        OpeningHours openingHours = this.zzi;
        int iHashCode8 = (((((iHashCode7 ^ (openingHours == null ? 0 : openingHours.hashCode())) * 1000003) ^ this.zzj.hashCode()) * 1000003) ^ this.zzk.hashCode()) * 1000003;
        String str5 = this.zzl;
        int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.zzm;
        int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        Integer num = this.zzn;
        int iHashCode11 = (iHashCode10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str7 = this.zzo;
        int iHashCode12 = (iHashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.zzp;
        int iHashCode13 = (iHashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.zzq;
        int iHashCode14 = (iHashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        LatLng latLng = this.zzr;
        int iHashCode15 = (iHashCode14 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        LatLng latLng2 = this.zzs;
        int iHashCode16 = (iHashCode15 ^ (latLng2 == null ? 0 : latLng2.hashCode())) * 1000003;
        String str10 = this.zzt;
        int iHashCode17 = (iHashCode16 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.zzu;
        int iHashCode18 = (iHashCode17 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.zzv;
        int iHashCode19 = (iHashCode18 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        String str13 = this.zzw;
        int iHashCode20 = (iHashCode19 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        String str14 = this.zzx;
        int iHashCode21 = (iHashCode20 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        OpeningHours openingHours2 = this.zzy;
        int iHashCode22 = (iHashCode21 ^ (openingHours2 == null ? 0 : openingHours2.hashCode())) * 1000003;
        String str15 = this.zzz;
        int iHashCode23 = (iHashCode22 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        String str16 = this.zzA;
        int iHashCode24 = (iHashCode23 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        String str17 = this.zzB;
        int iHashCode25 = (iHashCode24 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        List list2 = this.zzC;
        int iHashCode26 = (iHashCode25 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.zzD;
        int iHashCode27 = (iHashCode26 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List list4 = this.zzE;
        int iHashCode28 = (iHashCode27 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        PlusCode plusCode = this.zzF;
        int iHashCode29 = (iHashCode28 ^ (plusCode == null ? 0 : plusCode.hashCode())) * 1000003;
        Integer num2 = this.zzG;
        int iHashCode30 = (iHashCode29 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        zzey zzeyVar = this.zzH;
        int iHashCode31 = (iHashCode30 ^ (zzeyVar == null ? 0 : zzeyVar.hashCode())) * 1000003;
        String str18 = this.zzI;
        int iHashCode32 = (iHashCode31 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        String str19 = this.zzJ;
        int iHashCode33 = (iHashCode32 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        String str20 = this.zzK;
        int iHashCode34 = (iHashCode33 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        Double d10 = this.zzL;
        int iHashCode35 = (((iHashCode34 ^ (d10 == null ? 0 : d10.hashCode())) * 1000003) ^ this.zzM.hashCode()) * 1000003;
        List list5 = this.zzN;
        int iHashCode36 = (iHashCode35 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
        List list6 = this.zzO;
        int iHashCode37 = (((((((((((((((((iHashCode36 ^ (list6 == null ? 0 : list6.hashCode())) * 1000003) ^ this.zzP.hashCode()) * 1000003) ^ this.zzQ.hashCode()) * 1000003) ^ this.zzR.hashCode()) * 1000003) ^ this.zzS.hashCode()) * 1000003) ^ this.zzT.hashCode()) * 1000003) ^ this.zzU.hashCode()) * 1000003) ^ this.zzV.hashCode()) * 1000003) ^ this.zzW.hashCode()) * 1000003;
        List list7 = this.zzX;
        int iHashCode38 = (iHashCode37 ^ (list7 == null ? 0 : list7.hashCode())) * 1000003;
        Integer num3 = this.zzY;
        int iHashCode39 = (iHashCode38 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.zzZ;
        int iHashCode40 = (iHashCode39 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        Integer num5 = this.zzaa;
        int iHashCode41 = (iHashCode40 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
        LatLngBounds latLngBounds = this.zzab;
        int iHashCode42 = (iHashCode41 ^ (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 1000003;
        Uri uri = this.zzac;
        int iHashCode43 = (iHashCode42 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.zzad;
        int iHashCode44 = (((iHashCode43 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003) ^ this.zzae.hashCode()) * 1000003;
        AccessibilityOptions accessibilityOptions = this.zzaf;
        int iHashCode45 = (iHashCode44 ^ (accessibilityOptions == null ? 0 : accessibilityOptions.hashCode())) * 1000003;
        ParkingOptions parkingOptions = this.zzag;
        int iHashCode46 = (iHashCode45 ^ (parkingOptions == null ? 0 : parkingOptions.hashCode())) * 1000003;
        PaymentOptions paymentOptions = this.zzah;
        int iHashCode47 = (iHashCode46 ^ (paymentOptions == null ? 0 : paymentOptions.hashCode())) * 1000003;
        EVChargeOptions eVChargeOptions = this.zzai;
        int iHashCode48 = (((((((((((((((((((((((iHashCode47 ^ (eVChargeOptions == null ? 0 : eVChargeOptions.hashCode())) * 1000003) ^ this.zzaj.hashCode()) * 1000003) ^ this.zzak.hashCode()) * 1000003) ^ this.zzal.hashCode()) * 1000003) ^ this.zzam.hashCode()) * 1000003) ^ this.zzan.hashCode()) * 1000003) ^ this.zzao.hashCode()) * 1000003) ^ this.zzap.hashCode()) * 1000003) ^ this.zzaq.hashCode()) * 1000003) ^ this.zzar.hashCode()) * 1000003) ^ this.zzas.hashCode()) * 1000003) ^ this.zzat.hashCode()) * 1000003;
        List list8 = this.zzau;
        int iHashCode49 = (iHashCode48 ^ (list8 == null ? 0 : list8.hashCode())) * 1000003;
        FuelOptions fuelOptions = this.zzav;
        return ((iHashCode49 ^ (fuelOptions != null ? fuelOptions.hashCode() : 0)) * 1000003) ^ this.zzaw.hashCode();
    }

    public final String toString() {
        List list = this.zzE;
        List list2 = this.zzD;
        List list3 = this.zzC;
        OpeningHours openingHours = this.zzy;
        LatLng latLng = this.zzs;
        LatLng latLng2 = this.zzr;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzk;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2 = this.zzj;
        OpeningHours openingHours2 = this.zzi;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3 = this.zzh;
        Place.BusinessStatus businessStatus = this.zzg;
        List list4 = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(list4);
        String strValueOf3 = String.valueOf(businessStatus);
        String string = booleanPlaceAttributeValue3.toString();
        String strValueOf4 = String.valueOf(openingHours2);
        String string2 = booleanPlaceAttributeValue2.toString();
        String string3 = booleanPlaceAttributeValue.toString();
        String strValueOf5 = String.valueOf(latLng2);
        String strValueOf6 = String.valueOf(latLng);
        String strValueOf7 = String.valueOf(openingHours);
        String strValueOf8 = String.valueOf(list3);
        String strValueOf9 = String.valueOf(list2);
        String strValueOf10 = String.valueOf(list);
        String strValueOf11 = String.valueOf(this.zzF);
        String strValueOf12 = String.valueOf(this.zzH);
        String string4 = this.zzM.toString();
        String strValueOf13 = String.valueOf(this.zzN);
        String strValueOf14 = String.valueOf(this.zzO);
        String string5 = this.zzP.toString();
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4 = this.zzaw;
        FuelOptions fuelOptions = this.zzav;
        List list5 = this.zzau;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5 = this.zzat;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6 = this.zzas;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7 = this.zzar;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8 = this.zzaq;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9 = this.zzap;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10 = this.zzao;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11 = this.zzan;
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        String str4 = this.zzd;
        String str5 = this.zzl;
        String str6 = this.zzm;
        Integer num = this.zzn;
        String str7 = this.zzo;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12 = this.zzQ;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13 = this.zzR;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14 = this.zzS;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15 = this.zzT;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16 = this.zzU;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17 = this.zzV;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18 = this.zzW;
        List list6 = this.zzX;
        LatLngBounds latLngBounds = this.zzab;
        Uri uri = this.zzac;
        Uri uri2 = this.zzad;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19 = this.zzae;
        AccessibilityOptions accessibilityOptions = this.zzaf;
        ParkingOptions parkingOptions = this.zzag;
        PaymentOptions paymentOptions = this.zzah;
        EVChargeOptions eVChargeOptions = this.zzai;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20 = this.zzaj;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21 = this.zzak;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22 = this.zzal;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23 = this.zzam;
        String string6 = booleanPlaceAttributeValue12.toString();
        String string7 = booleanPlaceAttributeValue13.toString();
        String string8 = booleanPlaceAttributeValue14.toString();
        String string9 = booleanPlaceAttributeValue15.toString();
        String string10 = booleanPlaceAttributeValue16.toString();
        String string11 = booleanPlaceAttributeValue17.toString();
        String string12 = booleanPlaceAttributeValue18.toString();
        String strValueOf15 = String.valueOf(list6);
        String strValueOf16 = String.valueOf(latLngBounds);
        String strValueOf17 = String.valueOf(uri);
        String strValueOf18 = String.valueOf(uri2);
        String string13 = booleanPlaceAttributeValue19.toString();
        String strValueOf19 = String.valueOf(accessibilityOptions);
        String strValueOf20 = String.valueOf(parkingOptions);
        String strValueOf21 = String.valueOf(paymentOptions);
        String strValueOf22 = String.valueOf(eVChargeOptions);
        String string14 = booleanPlaceAttributeValue20.toString();
        String string15 = booleanPlaceAttributeValue21.toString();
        String string16 = booleanPlaceAttributeValue22.toString();
        String string17 = booleanPlaceAttributeValue23.toString();
        String string18 = booleanPlaceAttributeValue11.toString();
        String string19 = booleanPlaceAttributeValue10.toString();
        String string20 = booleanPlaceAttributeValue9.toString();
        String string21 = booleanPlaceAttributeValue8.toString();
        String string22 = booleanPlaceAttributeValue7.toString();
        String string23 = booleanPlaceAttributeValue6.toString();
        String string24 = booleanPlaceAttributeValue5.toString();
        String strValueOf23 = String.valueOf(list5);
        String strValueOf24 = String.valueOf(fuelOptions);
        String string25 = booleanPlaceAttributeValue4.toString();
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = strValueOf.length();
        int length6 = strValueOf2.length();
        int length7 = strValueOf3.length();
        int length8 = string.length();
        int length9 = strValueOf4.length();
        int length10 = string2.length();
        int length11 = string3.length();
        int length12 = String.valueOf(str5).length();
        int length13 = String.valueOf(str6).length();
        int length14 = String.valueOf(num).length();
        int length15 = String.valueOf(str7).length();
        Double d10 = this.zzL;
        String str8 = this.zzK;
        String str9 = this.zzJ;
        String str10 = this.zzI;
        Integer num2 = this.zzG;
        String str11 = this.zzB;
        String str12 = this.zzA;
        String str13 = this.zzz;
        String str14 = this.zzx;
        String str15 = this.zzw;
        String str16 = this.zzv;
        String str17 = this.zzu;
        String str18 = this.zzt;
        String str19 = this.zzq;
        String str20 = this.zzp;
        int i10 = length + 33 + length2 + 24 + length3 + 19 + length4 + 20 + length5 + 15 + length6 + 17 + length7 + 17 + length8 + 22 + length9 + 11 + length10 + 9 + length11 + 19 + length12 + 31 + length13 + 22 + length14 + 10 + length15;
        int length16 = String.valueOf(str20).length();
        int length17 = String.valueOf(str19).length();
        int length18 = strValueOf5.length();
        int length19 = strValueOf6.length();
        int length20 = String.valueOf(str18).length();
        int length21 = String.valueOf(str17).length();
        int length22 = String.valueOf(str16).length();
        int length23 = String.valueOf(str15).length();
        int length24 = String.valueOf(str14).length();
        int length25 = strValueOf7.length();
        int length26 = String.valueOf(str13).length();
        int length27 = String.valueOf(str12).length();
        int length28 = String.valueOf(str11).length();
        int length29 = strValueOf8.length();
        int length30 = strValueOf9.length();
        int length31 = strValueOf10.length();
        int length32 = strValueOf11.length();
        int length33 = String.valueOf(num2).length();
        int length34 = strValueOf12.length();
        int length35 = String.valueOf(str10).length();
        int length36 = String.valueOf(str9).length();
        int length37 = String.valueOf(str8).length();
        int length38 = String.valueOf(d10).length();
        int length39 = string4.length();
        int length40 = strValueOf13.length();
        Integer num3 = this.zzaa;
        Integer num4 = this.zzZ;
        Integer num5 = this.zzY;
        StringBuilder sb2 = new StringBuilder(i10 + 14 + length16 + 5 + length17 + 9 + length18 + 11 + length19 + 7 + length20 + 14 + length21 + 19 + length22 + 26 + length23 + 15 + length24 + 15 + length25 + 14 + length26 + 27 + length27 + 22 + length28 + 17 + length29 + 10 + length30 + 13 + length31 + 11 + length32 + 13 + length33 + 13 + length34 + 14 + length35 + 25 + length36 + 37 + length37 + 9 + length38 + 13 + length39 + 24 + length40 + 31 + strValueOf14.length() + 13 + string5.length() + 18 + string6.length() + 15 + string7.length() + 15 + string8.length() + 14 + string9.length() + 23 + string10.length() + 13 + string11.length() + 10 + string12.length() + 8 + strValueOf15.length() + 19 + String.valueOf(num5).length() + 18 + String.valueOf(num4).length() + 19 + String.valueOf(num3).length() + 11 + strValueOf16.length() + 13 + strValueOf17.length() + 16 + strValueOf18.length() + 31 + string13.length() + 23 + strValueOf19.length() + 17 + strValueOf20.length() + 17 + strValueOf21.length() + 18 + strValueOf22.length() + 17 + string14.length() + 12 + string15.length() + 18 + string16.length() + 18 + string17.length() + 16 + string18.length() + 15 + string19.length() + 18 + string20.length() + 13 + string21.length() + 11 + string22.length() + 16 + string23.length() + 24 + string24.length() + 18 + strValueOf23.length() + 14 + strValueOf24.length() + 26 + string25.length() + 1);
        sb2.append("Place{address=");
        sb2.append(str);
        sb2.append(", formattedAddress=");
        sb2.append(str2);
        sb2.append(", shortFormattedAddress=");
        sb2.append(str3);
        sb2.append(", adrFormatAddress=");
        sb2.append(str4);
        sb2.append(", addressComponents=");
        sb2.append(strValueOf);
        sb2.append(", attributions=");
        sb2.append(strValueOf2);
        sb2.append(", businessStatus=");
        sb2.append(strValueOf3);
        sb2.append(", curbsidePickup=");
        sb2.append(string);
        sb2.append(", currentOpeningHours=");
        sb2.append(strValueOf4);
        sb2.append(", delivery=");
        sb2.append(string2);
        sb2.append(", dineIn=");
        sb2.append(string3);
        sb2.append(", editorialSummary=");
        sb2.append(str5);
        sb2.append(", editorialSummaryLanguageCode=");
        sb2.append(str6);
        sb2.append(", iconBackgroundColor=");
        sb2.append(num);
        sb2.append(", iconUrl=");
        sb2.append(str7);
        sb2.append(", iconMaskUrl=");
        sb2.append(str20);
        sb2.append(", id=");
        sb2.append(str19);
        sb2.append(", latLng=");
        sb2.append(strValueOf5);
        sb2.append(", location=");
        sb2.append(strValueOf6);
        sb2.append(", name=");
        sb2.append(str18);
        sb2.append(", displayName=");
        sb2.append(str17);
        sb2.append(", nameLanguageCode=");
        sb2.append(str16);
        sb2.append(", displayNameLanguageCode=");
        sb2.append(str15);
        sb2.append(", resourceName=");
        sb2.append(str14);
        sb2.append(", openingHours=");
        sb2.append(strValueOf7);
        sb2.append(", phoneNumber=");
        sb2.append(str13);
        sb2.append(", internationalPhoneNumber=");
        sb2.append(str12);
        sb2.append(", nationalPhoneNumber=");
        sb2.append(str11);
        sb2.append(", photoMetadatas=");
        sb2.append(strValueOf8);
        sb2.append(", reviews=");
        sb2.append(strValueOf9);
        sb2.append(", placeTypes=");
        sb2.append(strValueOf10);
        sb2.append(", plusCode=");
        sb2.append(strValueOf11);
        sb2.append(", priceLevel=");
        sb2.append(num2);
        sb2.append(", priceRange=");
        sb2.append(strValueOf12);
        sb2.append(", primaryType=");
        sb2.append(str10);
        sb2.append(", primaryTypeDisplayName=");
        sb2.append(str9);
        sb2.append(", primaryTypeDisplayNameLanguageCode=");
        sb2.append(str8);
        sb2.append(", rating=");
        sb2.append(d10);
        sb2.append(", reservable=");
        sb2.append(string4);
        sb2.append(", secondaryOpeningHours=");
        sb2.append(strValueOf13);
        sb2.append(", currentSecondaryOpeningHours=");
        sb2.append(strValueOf14);
        sb2.append(", servesBeer=");
        sb2.append(string5);
        sb2.append(", servesBreakfast=");
        sb2.append(string6);
        sb2.append(", servesBrunch=");
        sb2.append(string7);
        sb2.append(", servesDinner=");
        sb2.append(string8);
        sb2.append(", servesLunch=");
        sb2.append(string9);
        sb2.append(", servesVegetarianFood=");
        sb2.append(string10);
        sb2.append(", servesWine=");
        sb2.append(string11);
        sb2.append(", takeout=");
        sb2.append(string12);
        sb2.append(", types=");
        sb2.append(strValueOf15);
        sb2.append(", userRatingsTotal=");
        sb2.append(num5);
        sb2.append(", userRatingCount=");
        sb2.append(num4);
        sb2.append(", utcOffsetMinutes=");
        sb2.append(num3);
        sb2.append(", viewport=");
        sb2.append(strValueOf16);
        sb2.append(", websiteUri=");
        sb2.append(strValueOf17);
        sb2.append(", googleMapsUri=");
        sb2.append(strValueOf18);
        sb2.append(", wheelchairAccessibleEntrance=");
        sb2.append(string13);
        sb2.append(", accessibilityOptions=");
        sb2.append(strValueOf19);
        sb2.append(", parkingOptions=");
        sb2.append(strValueOf20);
        sb2.append(", paymentOptions=");
        sb2.append(strValueOf21);
        sb2.append(", evChargeOptions=");
        sb2.append(strValueOf22);
        sb2.append(", outdoorSeating=");
        sb2.append(string14);
        sb2.append(", liveMusic=");
        sb2.append(string15);
        sb2.append(", menuForChildren=");
        sb2.append(string16);
        sb2.append(", servesCocktails=");
        sb2.append(string17);
        sb2.append(", servesDessert=");
        sb2.append(string18);
        sb2.append(", servesCoffee=");
        sb2.append(string19);
        sb2.append(", goodForChildren=");
        sb2.append(string20);
        sb2.append(", allowsDogs=");
        sb2.append(string21);
        sb2.append(", restroom=");
        sb2.append(string22);
        sb2.append(", goodForGroups=");
        sb2.append(string23);
        sb2.append(", goodForWatchingSports=");
        sb2.append(string24);
        sb2.append(", subDestinations=");
        sb2.append(strValueOf23);
        sb2.append(", fuelOptions=");
        sb2.append(strValueOf24);
        sb2.append(", pureServiceAreaBusiness=");
        sb2.append(string25);
        sb2.append("}");
        return sb2.toString();
    }
}
