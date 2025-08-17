package com.meijer.mobile.store.model.hybris;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.address.model.hybris.HybrisGeoPoint;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0001.B\u0087\u0002\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\t\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0003\u0010\u0014\u001a\u00020\t\u0012\b\b\u0003\u0010\u0015\u001a\u00020\t\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u000e\b\u0003\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b\u0012\b\b\u0003\u0010 \u001a\u00020\t\u0012\b\b\u0003\u0010!\u001a\u00020\t\u0012\b\b\u0003\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0090\u0002\u0010%\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000f\u001a\u00020\t2\b\b\u0003\u0010\u0010\u001a\u00020\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0003\u0010\u0014\u001a\u00020\t2\b\b\u0003\u0010\u0015\u001a\u00020\t2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u000e\b\u0003\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b2\b\b\u0003\u0010 \u001a\u00020\t2\b\b\u0003\u0010!\u001a\u00020\t2\b\b\u0003\u0010\"\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b.\u00106R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b1\u00109R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b4\u0010<R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b7\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\bB\u00109R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\b:\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b=\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bC\u0010FR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\bH\u00109R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bJ\u00109R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bD\u0010MR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\bG\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bN\u00102\u001a\u0004\bI\u0010(R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bO\u00102\u001a\u0004\bK\u0010(R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bN\u0010RR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b8\u0006¢\u0006\f\n\u0004\bS\u0010Q\u001a\u0004\bO\u0010RR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bP\u00109R\u0017\u0010!\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bS\u00109R\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bJ\u00108\u001a\u0004\bA\u00109¨\u0006U"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "displayName", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", PlaceTypes.ADDRESS, "", "curbSideEligibility", "", "curbSideFee", "curbsidePartner", "mfcStoreId", "isEligibleForDelivery", "deliveryFee", "deliveryPartner", "Lcom/meijer/mobile/address/model/hybris/HybrisGeoPoint;", "geoPoint", "isMobilePaymentEnabledEventsStrategy", "isMobileShoppingEnabled", "Lcom/meijer/mobile/store/model/hybris/HybrisOpeningHours;", "openingHours", "phone", "pickupHelpNumber", "storeDirector", "", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreLocatorFeature;", "storeLocatorFeatures", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreTenant;", "storeTenants", "isAlcoholDeliveryEnabled", "isAlcoholPickupEnabled", "ebtEnabled", "<init>", "(ILjava/lang/String;Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;ZDLjava/lang/String;Ljava/lang/Integer;ZDLjava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisGeoPoint;ZZLcom/meijer/mobile/store/model/hybris/HybrisOpeningHours;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZ)V", "copy", "(ILjava/lang/String;Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;ZDLjava/lang/String;Ljava/lang/Integer;ZDLjava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisGeoPoint;ZZLcom/meijer/mobile/store/model/hybris/HybrisOpeningHours;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZ)Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "o", "b", "Ljava/lang/String;", "g", "c", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", "()Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", "d", "Z", "()Z", "e", "D", "()D", "f", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "h", "t", "i", "k", "Lcom/meijer/mobile/address/model/hybris/HybrisGeoPoint;", "()Lcom/meijer/mobile/address/model/hybris/HybrisGeoPoint;", "l", "u", "m", "v", "n", "Lcom/meijer/mobile/store/model/hybris/HybrisOpeningHours;", "()Lcom/meijer/mobile/store/model/hybris/HybrisOpeningHours;", "p", "q", "r", "Ljava/util/List;", "()Ljava/util/List;", "s", "w", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisPointOfService {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisStoreAddress address;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean curbSideEligibility;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double curbSideFee;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsidePartner;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer mfcStoreId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEligibleForDelivery;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final double deliveryFee;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryPartner;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisGeoPoint geoPoint;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMobilePaymentEnabledEventsStrategy;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMobileShoppingEnabled;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisOpeningHours openingHours;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupHelpNumber;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeDirector;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisStoreLocatorFeature> storeLocatorFeatures;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisStoreTenant> storeTenants;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcoholDeliveryEnabled;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcoholPickupEnabled;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean ebtEnabled;

    public HybrisPointOfService(@g(name = "name") int i10, @g(name = "displayName") String str, @g(name = PlaceTypes.ADDRESS) HybrisStoreAddress hybrisStoreAddress, @g(name = "curbSideEligibility") boolean z10, @g(name = "curbSideFee") double d10, @g(name = "curbsidePartner") String str2, @g(name = "mfcStoreId") Integer num, @g(name = "deliveryEligibility") boolean z11, @g(name = "deliveryFee") double d11, @g(name = "deliveryPartner") String str3, @g(name = "geoPoint") HybrisGeoPoint hybrisGeoPoint, @g(name = "mobilePaymentEnabled") boolean z12, @g(name = "mobileShoppingEnabled") boolean z13, @g(name = "openingHours") HybrisOpeningHours hybrisOpeningHours, @g(name = "phone") String str4, @g(name = "pickupHelpNumber") String str5, @g(name = "storeDirector") String str6, @g(name = "storeLocatorFeatures") List<HybrisStoreLocatorFeature> storeLocatorFeatures, @g(name = "storeTenants") List<HybrisStoreTenant> storeTenants, @g(name = "alcoholDelivery") boolean z14, @g(name = "alcoholPickup") boolean z15, @g(name = "ebtEnabled") boolean z16) {
        Intrinsics.j(storeLocatorFeatures, "storeLocatorFeatures");
        Intrinsics.j(storeTenants, "storeTenants");
        this.storeId = i10;
        this.displayName = str;
        this.address = hybrisStoreAddress;
        this.curbSideEligibility = z10;
        this.curbSideFee = d10;
        this.curbsidePartner = str2;
        this.mfcStoreId = num;
        this.isEligibleForDelivery = z11;
        this.deliveryFee = d11;
        this.deliveryPartner = str3;
        this.geoPoint = hybrisGeoPoint;
        this.isMobilePaymentEnabledEventsStrategy = z12;
        this.isMobileShoppingEnabled = z13;
        this.openingHours = hybrisOpeningHours;
        this.phone = str4;
        this.pickupHelpNumber = str5;
        this.storeDirector = str6;
        this.storeLocatorFeatures = storeLocatorFeatures;
        this.storeTenants = storeTenants;
        this.isAlcoholDeliveryEnabled = z14;
        this.isAlcoholPickupEnabled = z15;
        this.ebtEnabled = z16;
    }

    public final HybrisPointOfService copy(@g(name = "name") int storeId, @g(name = "displayName") String displayName, @g(name = PlaceTypes.ADDRESS) HybrisStoreAddress address, @g(name = "curbSideEligibility") boolean curbSideEligibility, @g(name = "curbSideFee") double curbSideFee, @g(name = "curbsidePartner") String curbsidePartner, @g(name = "mfcStoreId") Integer mfcStoreId, @g(name = "deliveryEligibility") boolean isEligibleForDelivery, @g(name = "deliveryFee") double deliveryFee, @g(name = "deliveryPartner") String deliveryPartner, @g(name = "geoPoint") HybrisGeoPoint geoPoint, @g(name = "mobilePaymentEnabled") boolean isMobilePaymentEnabledEventsStrategy, @g(name = "mobileShoppingEnabled") boolean isMobileShoppingEnabled, @g(name = "openingHours") HybrisOpeningHours openingHours, @g(name = "phone") String phone, @g(name = "pickupHelpNumber") String pickupHelpNumber, @g(name = "storeDirector") String storeDirector, @g(name = "storeLocatorFeatures") List<HybrisStoreLocatorFeature> storeLocatorFeatures, @g(name = "storeTenants") List<HybrisStoreTenant> storeTenants, @g(name = "alcoholDelivery") boolean isAlcoholDeliveryEnabled, @g(name = "alcoholPickup") boolean isAlcoholPickupEnabled, @g(name = "ebtEnabled") boolean ebtEnabled) {
        Intrinsics.j(storeLocatorFeatures, "storeLocatorFeatures");
        Intrinsics.j(storeTenants, "storeTenants");
        return new HybrisPointOfService(storeId, displayName, address, curbSideEligibility, curbSideFee, curbsidePartner, mfcStoreId, isEligibleForDelivery, deliveryFee, deliveryPartner, geoPoint, isMobilePaymentEnabledEventsStrategy, isMobileShoppingEnabled, openingHours, phone, pickupHelpNumber, storeDirector, storeLocatorFeatures, storeTenants, isAlcoholDeliveryEnabled, isAlcoholPickupEnabled, ebtEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPointOfService)) {
            return false;
        }
        HybrisPointOfService hybrisPointOfService = (HybrisPointOfService) other;
        return this.storeId == hybrisPointOfService.storeId && Intrinsics.e(this.displayName, hybrisPointOfService.displayName) && Intrinsics.e(this.address, hybrisPointOfService.address) && this.curbSideEligibility == hybrisPointOfService.curbSideEligibility && Double.compare(this.curbSideFee, hybrisPointOfService.curbSideFee) == 0 && Intrinsics.e(this.curbsidePartner, hybrisPointOfService.curbsidePartner) && Intrinsics.e(this.mfcStoreId, hybrisPointOfService.mfcStoreId) && this.isEligibleForDelivery == hybrisPointOfService.isEligibleForDelivery && Double.compare(this.deliveryFee, hybrisPointOfService.deliveryFee) == 0 && Intrinsics.e(this.deliveryPartner, hybrisPointOfService.deliveryPartner) && Intrinsics.e(this.geoPoint, hybrisPointOfService.geoPoint) && this.isMobilePaymentEnabledEventsStrategy == hybrisPointOfService.isMobilePaymentEnabledEventsStrategy && this.isMobileShoppingEnabled == hybrisPointOfService.isMobileShoppingEnabled && Intrinsics.e(this.openingHours, hybrisPointOfService.openingHours) && Intrinsics.e(this.phone, hybrisPointOfService.phone) && Intrinsics.e(this.pickupHelpNumber, hybrisPointOfService.pickupHelpNumber) && Intrinsics.e(this.storeDirector, hybrisPointOfService.storeDirector) && Intrinsics.e(this.storeLocatorFeatures, hybrisPointOfService.storeLocatorFeatures) && Intrinsics.e(this.storeTenants, hybrisPointOfService.storeTenants) && this.isAlcoholDeliveryEnabled == hybrisPointOfService.isAlcoholDeliveryEnabled && this.isAlcoholPickupEnabled == hybrisPointOfService.isAlcoholPickupEnabled && this.ebtEnabled == hybrisPointOfService.ebtEnabled;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.storeId) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        HybrisStoreAddress hybrisStoreAddress = this.address;
        int iHashCode3 = (((((iHashCode2 + (hybrisStoreAddress == null ? 0 : hybrisStoreAddress.hashCode())) * 31) + Boolean.hashCode(this.curbSideEligibility)) * 31) + Double.hashCode(this.curbSideFee)) * 31;
        String str2 = this.curbsidePartner;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.mfcStoreId;
        int iHashCode5 = (((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isEligibleForDelivery)) * 31) + Double.hashCode(this.deliveryFee)) * 31;
        String str3 = this.deliveryPartner;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HybrisGeoPoint hybrisGeoPoint = this.geoPoint;
        int iHashCode7 = (((((iHashCode6 + (hybrisGeoPoint == null ? 0 : hybrisGeoPoint.hashCode())) * 31) + Boolean.hashCode(this.isMobilePaymentEnabledEventsStrategy)) * 31) + Boolean.hashCode(this.isMobileShoppingEnabled)) * 31;
        HybrisOpeningHours hybrisOpeningHours = this.openingHours;
        int iHashCode8 = (iHashCode7 + (hybrisOpeningHours == null ? 0 : hybrisOpeningHours.hashCode())) * 31;
        String str4 = this.phone;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pickupHelpNumber;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.storeDirector;
        return ((((((((((iHashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.storeLocatorFeatures.hashCode()) * 31) + this.storeTenants.hashCode()) * 31) + Boolean.hashCode(this.isAlcoholDeliveryEnabled)) * 31) + Boolean.hashCode(this.isAlcoholPickupEnabled)) * 31) + Boolean.hashCode(this.ebtEnabled);
    }

    public String toString() {
        return "HybrisPointOfService(storeId=" + this.storeId + ", displayName=" + this.displayName + ", address=" + this.address + ", curbSideEligibility=" + this.curbSideEligibility + ", curbSideFee=" + this.curbSideFee + ", curbsidePartner=" + this.curbsidePartner + ", mfcStoreId=" + this.mfcStoreId + ", isEligibleForDelivery=" + this.isEligibleForDelivery + ", deliveryFee=" + this.deliveryFee + ", deliveryPartner=" + this.deliveryPartner + ", geoPoint=" + this.geoPoint + ", isMobilePaymentEnabledEventsStrategy=" + this.isMobilePaymentEnabledEventsStrategy + ", isMobileShoppingEnabled=" + this.isMobileShoppingEnabled + ", openingHours=" + this.openingHours + ", phone=" + this.phone + ", pickupHelpNumber=" + this.pickupHelpNumber + ", storeDirector=" + this.storeDirector + ", storeLocatorFeatures=" + this.storeLocatorFeatures + ", storeTenants=" + this.storeTenants + ", isAlcoholDeliveryEnabled=" + this.isAlcoholDeliveryEnabled + ", isAlcoholPickupEnabled=" + this.isAlcoholPickupEnabled + ", ebtEnabled=" + this.ebtEnabled + ')';
    }

    /* renamed from: a, reason: from getter */
    public final HybrisStoreAddress getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCurbSideEligibility() {
        return this.curbSideEligibility;
    }

    /* renamed from: c, reason: from getter */
    public final double getCurbSideFee() {
        return this.curbSideFee;
    }

    /* renamed from: d, reason: from getter */
    public final String getCurbsidePartner() {
        return this.curbsidePartner;
    }

    /* renamed from: e, reason: from getter */
    public final double getDeliveryFee() {
        return this.deliveryFee;
    }

    /* renamed from: f, reason: from getter */
    public final String getDeliveryPartner() {
        return this.deliveryPartner;
    }

    /* renamed from: g, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getEbtEnabled() {
        return this.ebtEnabled;
    }

    /* renamed from: i, reason: from getter */
    public final HybrisGeoPoint getGeoPoint() {
        return this.geoPoint;
    }

    /* renamed from: j, reason: from getter */
    public final Integer getMfcStoreId() {
        return this.mfcStoreId;
    }

    /* renamed from: k, reason: from getter */
    public final HybrisOpeningHours getOpeningHours() {
        return this.openingHours;
    }

    /* renamed from: l, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: m, reason: from getter */
    public final String getPickupHelpNumber() {
        return this.pickupHelpNumber;
    }

    /* renamed from: n, reason: from getter */
    public final String getStoreDirector() {
        return this.storeDirector;
    }

    /* renamed from: o, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public final List<HybrisStoreLocatorFeature> p() {
        return this.storeLocatorFeatures;
    }

    public final List<HybrisStoreTenant> q() {
        return this.storeTenants;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsAlcoholDeliveryEnabled() {
        return this.isAlcoholDeliveryEnabled;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsAlcoholPickupEnabled() {
        return this.isAlcoholPickupEnabled;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsEligibleForDelivery() {
        return this.isEligibleForDelivery;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsMobilePaymentEnabledEventsStrategy() {
        return this.isMobilePaymentEnabledEventsStrategy;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsMobileShoppingEnabled() {
        return this.isMobileShoppingEnabled;
    }

    public /* synthetic */ HybrisPointOfService(int i10, String str, HybrisStoreAddress hybrisStoreAddress, boolean z10, double d10, String str2, Integer num, boolean z11, double d11, String str3, HybrisGeoPoint hybrisGeoPoint, boolean z12, boolean z13, HybrisOpeningHours hybrisOpeningHours, String str4, String str5, String str6, List list, List list2, boolean z14, boolean z15, boolean z16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : hybrisStoreAddress, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? 0.0d : d10, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? false : z11, (i11 & 256) == 0 ? d11 : 0.0d, (i11 & 512) != 0 ? null : str3, (i11 & 1024) != 0 ? null : hybrisGeoPoint, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z12, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z13, (i11 & 8192) != 0 ? null : hybrisOpeningHours, (i11 & 16384) != 0 ? null : str4, (i11 & 32768) != 0 ? null : str5, (i11 & 65536) != 0 ? null : str6, (i11 & 131072) != 0 ? CollectionsKt.m() : list, (i11 & 262144) != 0 ? CollectionsKt.m() : list2, (i11 & 524288) != 0 ? false : z14, (i11 & 1048576) != 0 ? false : z15, (i11 & 2097152) != 0 ? false : z16);
    }
}
