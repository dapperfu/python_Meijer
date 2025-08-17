package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes6.dex */
final class zzaq extends Place.Builder {
    private String zzA;
    private String zzB;
    private List zzC;
    private List zzD;
    private List zzE;
    private PlusCode zzF;
    private Integer zzG;
    private zzey zzH;
    private String zzI;
    private String zzJ;
    private String zzK;
    private Double zzL;
    private Place.BooleanPlaceAttributeValue zzM;
    private List zzN;
    private List zzO;
    private Place.BooleanPlaceAttributeValue zzP;
    private Place.BooleanPlaceAttributeValue zzQ;
    private Place.BooleanPlaceAttributeValue zzR;
    private Place.BooleanPlaceAttributeValue zzS;
    private Place.BooleanPlaceAttributeValue zzT;
    private Place.BooleanPlaceAttributeValue zzU;
    private Place.BooleanPlaceAttributeValue zzV;
    private Place.BooleanPlaceAttributeValue zzW;
    private List zzX;
    private Integer zzY;
    private Integer zzZ;
    private String zza;
    private Integer zzaa;
    private LatLngBounds zzab;
    private Uri zzac;
    private Uri zzad;
    private Place.BooleanPlaceAttributeValue zzae;
    private AccessibilityOptions zzaf;
    private ParkingOptions zzag;
    private PaymentOptions zzah;
    private EVChargeOptions zzai;
    private Place.BooleanPlaceAttributeValue zzaj;
    private Place.BooleanPlaceAttributeValue zzak;
    private Place.BooleanPlaceAttributeValue zzal;
    private Place.BooleanPlaceAttributeValue zzam;
    private Place.BooleanPlaceAttributeValue zzan;
    private Place.BooleanPlaceAttributeValue zzao;
    private Place.BooleanPlaceAttributeValue zzap;
    private Place.BooleanPlaceAttributeValue zzaq;
    private Place.BooleanPlaceAttributeValue zzar;
    private Place.BooleanPlaceAttributeValue zzas;
    private Place.BooleanPlaceAttributeValue zzat;
    private List zzau;
    private FuelOptions zzav;
    private Place.BooleanPlaceAttributeValue zzaw;
    private String zzb;
    private String zzc;
    private String zzd;
    private AddressComponents zze;
    private List zzf;
    private Place.BusinessStatus zzg;
    private Place.BooleanPlaceAttributeValue zzh;
    private OpeningHours zzi;
    private Place.BooleanPlaceAttributeValue zzj;
    private Place.BooleanPlaceAttributeValue zzk;
    private String zzl;
    private String zzm;
    private Integer zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private LatLng zzr;
    private LatLng zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private String zzx;
    private OpeningHours zzy;
    private String zzz;

    zzaq() {
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final AccessibilityOptions getAccessibilityOptions() {
        return this.zzaf;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getAddress() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final AddressComponents getAddressComponents() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getAdrFormatAddress() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<String> getAttributions() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BusinessStatus getBusinessStatus() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final OpeningHours getCurrentOpeningHours() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<OpeningHours> getCurrentSecondaryOpeningHours() {
        return this.zzO;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getDisplayName() {
        return this.zzu;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getDisplayNameLanguageCode() {
        return this.zzw;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getEditorialSummary() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getEditorialSummaryLanguageCode() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final EVChargeOptions getEvChargeOptions() {
        return this.zzai;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getFormattedAddress() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final FuelOptions getFuelOptions() {
        return this.zzav;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Uri getGoogleMapsUri() {
        return this.zzad;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getIconBackgroundColor() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getIconMaskUrl() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getIconUrl() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getId() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getInternationalPhoneNumber() {
        return this.zzA;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final LatLng getLatLng() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final LatLng getLocation() {
        return this.zzs;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getName() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getNameLanguageCode() {
        return this.zzv;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getNationalPhoneNumber() {
        return this.zzB;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final OpeningHours getOpeningHours() {
        return this.zzy;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final ParkingOptions getParkingOptions() {
        return this.zzag;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final PaymentOptions getPaymentOptions() {
        return this.zzah;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getPhoneNumber() {
        return this.zzz;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzC;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<String> getPlaceTypes() {
        return this.zzE;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final PlusCode getPlusCode() {
        return this.zzF;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getPriceLevel() {
        return this.zzG;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getPrimaryType() {
        return this.zzI;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getPrimaryTypeDisplayName() {
        return this.zzJ;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getPrimaryTypeDisplayNameLanguageCode() {
        return this.zzK;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Double getRating() {
        return this.zzL;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getResourceName() {
        return this.zzx;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<Review> getReviews() {
        return this.zzD;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<OpeningHours> getSecondaryOpeningHours() {
        return this.zzN;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getShortFormattedAddress() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<SubDestination> getSubDestinations() {
        return this.zzau;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<Place.Type> getTypes() {
        return this.zzX;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getUserRatingCount() {
        return this.zzZ;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getUserRatingsTotal() {
        return this.zzY;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getUtcOffsetMinutes() {
        return this.zzaa;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final LatLngBounds getViewport() {
        return this.zzab;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Uri getWebsiteUri() {
        return this.zzac;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAccessibilityOptions(AccessibilityOptions accessibilityOptions) {
        this.zzaf = accessibilityOptions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAddress(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAddressComponents(AddressComponents addressComponents) {
        this.zze = addressComponents;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAdrFormatAddress(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAttributions(List<String> list) {
        this.zzf = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setBusinessStatus(Place.BusinessStatus businessStatus) {
        this.zzg = businessStatus;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setCurrentOpeningHours(OpeningHours openingHours) {
        this.zzi = openingHours;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setCurrentSecondaryOpeningHours(List<OpeningHours> list) {
        this.zzO = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDisplayName(String str) {
        this.zzu = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDisplayNameLanguageCode(String str) {
        this.zzw = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setEditorialSummary(String str) {
        this.zzl = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setEditorialSummaryLanguageCode(String str) {
        this.zzm = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setEvChargeOptions(EVChargeOptions eVChargeOptions) {
        this.zzai = eVChargeOptions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setFormattedAddress(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setFuelOptions(FuelOptions fuelOptions) {
        this.zzav = fuelOptions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setGoogleMapsUri(Uri uri) {
        this.zzad = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setIconBackgroundColor(Integer num) {
        this.zzn = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setIconMaskUrl(String str) {
        this.zzp = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setIconUrl(String str) {
        this.zzo = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setId(String str) {
        this.zzq = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setInternationalPhoneNumber(String str) {
        this.zzA = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setLatLng(LatLng latLng) {
        this.zzr = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setLocation(LatLng latLng) {
        this.zzs = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setName(String str) {
        this.zzt = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setNameLanguageCode(String str) {
        this.zzv = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setNationalPhoneNumber(String str) {
        this.zzB = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setOpeningHours(OpeningHours openingHours) {
        this.zzy = openingHours;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setParkingOptions(ParkingOptions parkingOptions) {
        this.zzag = parkingOptions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPaymentOptions(PaymentOptions paymentOptions) {
        this.zzah = paymentOptions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPhoneNumber(String str) {
        this.zzz = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPhotoMetadatas(List<PhotoMetadata> list) {
        this.zzC = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPlaceTypes(List<String> list) {
        this.zzE = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPlusCode(PlusCode plusCode) {
        this.zzF = plusCode;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPriceLevel(Integer num) {
        this.zzG = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPrimaryType(String str) {
        this.zzI = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPrimaryTypeDisplayName(String str) {
        this.zzJ = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPrimaryTypeDisplayNameLanguageCode(String str) {
        this.zzK = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setRating(Double d10) {
        this.zzL = d10;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setResourceName(String str) {
        this.zzx = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setReviews(List<Review> list) {
        this.zzD = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setSecondaryOpeningHours(List<OpeningHours> list) {
        this.zzN = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setShortFormattedAddress(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setSubDestinations(List<SubDestination> list) {
        this.zzau = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setTypes(List<Place.Type> list) {
        this.zzX = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUserRatingCount(Integer num) {
        this.zzZ = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUserRatingsTotal(Integer num) {
        this.zzY = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUtcOffsetMinutes(Integer num) {
        this.zzaa = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setViewport(LatLngBounds latLngBounds) {
        this.zzab = latLngBounds;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setWebsiteUri(Uri uri) {
        this.zzac = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder zza(zzey zzeyVar) {
        this.zzH = zzeyVar;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getAllowsDogs() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzaq;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"allowsDogs\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getCurbsidePickup() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzh;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"curbsidePickup\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getDelivery() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzj;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"delivery\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getDineIn() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzk;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"dineIn\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getGoodForChildren() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzap;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"goodForChildren\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getGoodForGroups() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzas;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"goodForGroups\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getGoodForWatchingSports() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzat;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"goodForWatchingSports\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getLiveMusic() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzak;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"liveMusic\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getMenuForChildren() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzal;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"menuForChildren\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getOutdoorSeating() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzaj;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"outdoorSeating\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getPureServiceAreaBusiness() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzaw;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"pureServiceAreaBusiness\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getReservable() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzM;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"reservable\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getRestroom() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzar;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"restroom\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesBeer() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzP;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesBeer\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesBreakfast() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzQ;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesBreakfast\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesBrunch() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzR;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesBrunch\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesCocktails() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzam;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesCocktails\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesCoffee() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzao;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesCoffee\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesDessert() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzan;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesDessert\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesDinner() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzS;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesDinner\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesLunch() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzT;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesLunch\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesVegetarianFood() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzU;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesVegetarianFood\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesWine() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzV;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesWine\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getTakeout() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzW;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"takeout\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzae;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"wheelchairAccessibleEntrance\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAllowsDogs(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null allowsDogs");
        }
        this.zzaq = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setCurbsidePickup(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null curbsidePickup");
        }
        this.zzh = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDelivery(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null delivery");
        }
        this.zzj = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDineIn(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null dineIn");
        }
        this.zzk = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setGoodForChildren(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null goodForChildren");
        }
        this.zzap = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setGoodForGroups(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null goodForGroups");
        }
        this.zzas = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setGoodForWatchingSports(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null goodForWatchingSports");
        }
        this.zzat = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setLiveMusic(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null liveMusic");
        }
        this.zzak = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setMenuForChildren(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null menuForChildren");
        }
        this.zzal = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setOutdoorSeating(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null outdoorSeating");
        }
        this.zzaj = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPureServiceAreaBusiness(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null pureServiceAreaBusiness");
        }
        this.zzaw = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setReservable(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null reservable");
        }
        this.zzM = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setRestroom(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null restroom");
        }
        this.zzar = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesBeer(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesBeer");
        }
        this.zzP = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesBreakfast(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesBreakfast");
        }
        this.zzQ = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesBrunch(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesBrunch");
        }
        this.zzR = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesCocktails(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesCocktails");
        }
        this.zzam = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesCoffee(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesCoffee");
        }
        this.zzao = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesDessert(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesDessert");
        }
        this.zzan = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesDinner(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesDinner");
        }
        this.zzS = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesLunch(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesLunch");
        }
        this.zzT = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesVegetarianFood(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesVegetarianFood");
        }
        this.zzU = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesWine(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesWine");
        }
        this.zzV = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setTakeout(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null takeout");
        }
        this.zzW = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setWheelchairAccessibleEntrance(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.zzae = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    final Place zzb() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue25 = this.zzh;
        if (booleanPlaceAttributeValue25 != null && (booleanPlaceAttributeValue = this.zzj) != null && (booleanPlaceAttributeValue2 = this.zzk) != null && (booleanPlaceAttributeValue3 = this.zzM) != null && (booleanPlaceAttributeValue4 = this.zzP) != null && (booleanPlaceAttributeValue5 = this.zzQ) != null && (booleanPlaceAttributeValue6 = this.zzR) != null && (booleanPlaceAttributeValue7 = this.zzS) != null && (booleanPlaceAttributeValue8 = this.zzT) != null && (booleanPlaceAttributeValue9 = this.zzU) != null && (booleanPlaceAttributeValue10 = this.zzV) != null && (booleanPlaceAttributeValue11 = this.zzW) != null && (booleanPlaceAttributeValue12 = this.zzae) != null && (booleanPlaceAttributeValue13 = this.zzaj) != null && (booleanPlaceAttributeValue14 = this.zzak) != null && (booleanPlaceAttributeValue15 = this.zzal) != null && (booleanPlaceAttributeValue16 = this.zzam) != null && (booleanPlaceAttributeValue17 = this.zzan) != null && (booleanPlaceAttributeValue18 = this.zzao) != null && (booleanPlaceAttributeValue19 = this.zzap) != null && (booleanPlaceAttributeValue20 = this.zzaq) != null && (booleanPlaceAttributeValue21 = this.zzar) != null && (booleanPlaceAttributeValue22 = this.zzas) != null && (booleanPlaceAttributeValue23 = this.zzat) != null && (booleanPlaceAttributeValue24 = this.zzaw) != null) {
            return new zzdk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, booleanPlaceAttributeValue25, this.zzi, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzA, this.zzB, this.zzC, this.zzD, this.zzE, this.zzF, this.zzG, this.zzH, this.zzI, this.zzJ, this.zzK, this.zzL, booleanPlaceAttributeValue3, this.zzN, this.zzO, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7, booleanPlaceAttributeValue8, booleanPlaceAttributeValue9, booleanPlaceAttributeValue10, booleanPlaceAttributeValue11, this.zzX, this.zzY, this.zzZ, this.zzaa, this.zzab, this.zzac, this.zzad, booleanPlaceAttributeValue12, this.zzaf, this.zzag, this.zzah, this.zzai, booleanPlaceAttributeValue13, booleanPlaceAttributeValue14, booleanPlaceAttributeValue15, booleanPlaceAttributeValue16, booleanPlaceAttributeValue17, booleanPlaceAttributeValue18, booleanPlaceAttributeValue19, booleanPlaceAttributeValue20, booleanPlaceAttributeValue21, booleanPlaceAttributeValue22, booleanPlaceAttributeValue23, this.zzau, this.zzav, booleanPlaceAttributeValue24);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zzh == null) {
            sb2.append(" curbsidePickup");
        }
        if (this.zzj == null) {
            sb2.append(" delivery");
        }
        if (this.zzk == null) {
            sb2.append(" dineIn");
        }
        if (this.zzM == null) {
            sb2.append(" reservable");
        }
        if (this.zzP == null) {
            sb2.append(" servesBeer");
        }
        if (this.zzQ == null) {
            sb2.append(" servesBreakfast");
        }
        if (this.zzR == null) {
            sb2.append(" servesBrunch");
        }
        if (this.zzS == null) {
            sb2.append(" servesDinner");
        }
        if (this.zzT == null) {
            sb2.append(" servesLunch");
        }
        if (this.zzU == null) {
            sb2.append(" servesVegetarianFood");
        }
        if (this.zzV == null) {
            sb2.append(" servesWine");
        }
        if (this.zzW == null) {
            sb2.append(" takeout");
        }
        if (this.zzae == null) {
            sb2.append(" wheelchairAccessibleEntrance");
        }
        if (this.zzaj == null) {
            sb2.append(" outdoorSeating");
        }
        if (this.zzak == null) {
            sb2.append(" liveMusic");
        }
        if (this.zzal == null) {
            sb2.append(" menuForChildren");
        }
        if (this.zzam == null) {
            sb2.append(" servesCocktails");
        }
        if (this.zzan == null) {
            sb2.append(" servesDessert");
        }
        if (this.zzao == null) {
            sb2.append(" servesCoffee");
        }
        if (this.zzap == null) {
            sb2.append(" goodForChildren");
        }
        if (this.zzaq == null) {
            sb2.append(" allowsDogs");
        }
        if (this.zzar == null) {
            sb2.append(" restroom");
        }
        if (this.zzas == null) {
            sb2.append(" goodForGroups");
        }
        if (this.zzat == null) {
            sb2.append(" goodForWatchingSports");
        }
        if (this.zzaw == null) {
            sb2.append(" pureServiceAreaBusiness");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
