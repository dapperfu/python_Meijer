package Tq;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.address.model.common.GeoPoint;
import di.StoreAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\b\u0086\b\u0018\u0000 X2\u00020\u0001:\u0001%B\u0085\u0002\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\t\u0012\b\b\u0002\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0090\u0002\u0010%\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b/\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b<\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u00108R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010:\u001a\u0004\b=\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bA\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b?\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\b\u0014\u00108R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bH\u00107\u001a\u0004\b\u0015\u00108R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b/\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bL\u00101\u001a\u0004\bG\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bM\u00101\u001a\u0004\bH\u0010(R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bN\u0010(R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b8\u0006¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010RR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bU\u00107\u001a\u0004\bL\u00108R\u0017\u0010!\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bM\u00108R\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bW\u00107\u001a\u0004\bC\u00108¨\u0006Y"}, d2 = {"LTq/c;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "displayName", "Ldi/g;", PlaceTypes.ADDRESS, "", "curbSideEligibility", "", "curbSideFee", "curbsidePartner", "mfcStoreId", "isEligibleForDelivery", "deliveryFee", "deliveryPartner", "Lcom/meijer/mobile/address/model/common/GeoPoint;", "geoPoint", "isMobilePaymentEnabledEventsStrategy", "isMobileShoppingEnabled", "LTq/a;", "openingHours", "phone", "pickupHelpNumber", "storeDirector", "", "LTq/i;", "storeLocatorFeatures", "LTq/l;", "storeTenants", "isAlcoholDeliveryEnabled", "isAlcoholPickupEnabled", "ebtEnabled", "<init>", "(ILjava/lang/String;Ldi/g;ZDLjava/lang/String;Ljava/lang/Integer;ZDLjava/lang/String;Lcom/meijer/mobile/address/model/common/GeoPoint;ZZLTq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZ)V", "a", "(ILjava/lang/String;Ldi/g;ZDLjava/lang/String;Ljava/lang/Integer;ZDLjava/lang/String;Lcom/meijer/mobile/address/model/common/GeoPoint;ZZLTq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZ)LTq/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "n", "b", "Ljava/lang/String;", "i", "c", "Ldi/g;", "()Ldi/g;", "d", "Z", "()Z", "e", "D", "()D", "f", "g", "Ljava/lang/Integer;", "k", "()Ljava/lang/Integer;", "h", "q", "j", "Lcom/meijer/mobile/address/model/common/GeoPoint;", "getGeoPoint", "()Lcom/meijer/mobile/address/model/common/GeoPoint;", "l", "m", "LTq/a;", "getOpeningHours", "()LTq/a;", "o", "p", "getStoreDirector", "r", "Ljava/util/List;", "getStoreLocatorFeatures", "()Ljava/util/List;", "s", "getStoreTenants", "t", "u", "v", "w", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tq.c, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class PointOfService {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreAddress address;

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
    private final GeoPoint geoPoint;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMobilePaymentEnabledEventsStrategy;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMobileShoppingEnabled;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final OpeningHours openingHours;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupHelpNumber;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeDirector;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<StoreLocatorFeature> storeLocatorFeatures;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<StoreTenant> storeTenants;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcoholDeliveryEnabled;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcoholPickupEnabled;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean ebtEnabled;

    public PointOfService(int i10, String str, StoreAddress storeAddress, boolean z10, double d10, String str2, Integer num, boolean z11, double d11, String str3, GeoPoint geoPoint, boolean z12, boolean z13, OpeningHours openingHours, String str4, String str5, String str6, List<StoreLocatorFeature> storeLocatorFeatures, List<StoreTenant> storeTenants, boolean z14, boolean z15, boolean z16) {
        Intrinsics.j(storeLocatorFeatures, "storeLocatorFeatures");
        Intrinsics.j(storeTenants, "storeTenants");
        this.storeId = i10;
        this.displayName = str;
        this.address = storeAddress;
        this.curbSideEligibility = z10;
        this.curbSideFee = d10;
        this.curbsidePartner = str2;
        this.mfcStoreId = num;
        this.isEligibleForDelivery = z11;
        this.deliveryFee = d11;
        this.deliveryPartner = str3;
        this.geoPoint = geoPoint;
        this.isMobilePaymentEnabledEventsStrategy = z12;
        this.isMobileShoppingEnabled = z13;
        this.openingHours = openingHours;
        this.phone = str4;
        this.pickupHelpNumber = str5;
        this.storeDirector = str6;
        this.storeLocatorFeatures = storeLocatorFeatures;
        this.storeTenants = storeTenants;
        this.isAlcoholDeliveryEnabled = z14;
        this.isAlcoholPickupEnabled = z15;
        this.ebtEnabled = z16;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointOfService)) {
            return false;
        }
        PointOfService pointOfService = (PointOfService) other;
        return this.storeId == pointOfService.storeId && Intrinsics.e(this.displayName, pointOfService.displayName) && Intrinsics.e(this.address, pointOfService.address) && this.curbSideEligibility == pointOfService.curbSideEligibility && Double.compare(this.curbSideFee, pointOfService.curbSideFee) == 0 && Intrinsics.e(this.curbsidePartner, pointOfService.curbsidePartner) && Intrinsics.e(this.mfcStoreId, pointOfService.mfcStoreId) && this.isEligibleForDelivery == pointOfService.isEligibleForDelivery && Double.compare(this.deliveryFee, pointOfService.deliveryFee) == 0 && Intrinsics.e(this.deliveryPartner, pointOfService.deliveryPartner) && Intrinsics.e(this.geoPoint, pointOfService.geoPoint) && this.isMobilePaymentEnabledEventsStrategy == pointOfService.isMobilePaymentEnabledEventsStrategy && this.isMobileShoppingEnabled == pointOfService.isMobileShoppingEnabled && Intrinsics.e(this.openingHours, pointOfService.openingHours) && Intrinsics.e(this.phone, pointOfService.phone) && Intrinsics.e(this.pickupHelpNumber, pointOfService.pickupHelpNumber) && Intrinsics.e(this.storeDirector, pointOfService.storeDirector) && Intrinsics.e(this.storeLocatorFeatures, pointOfService.storeLocatorFeatures) && Intrinsics.e(this.storeTenants, pointOfService.storeTenants) && this.isAlcoholDeliveryEnabled == pointOfService.isAlcoholDeliveryEnabled && this.isAlcoholPickupEnabled == pointOfService.isAlcoholPickupEnabled && this.ebtEnabled == pointOfService.ebtEnabled;
    }

    public static /* synthetic */ PointOfService b(PointOfService pointOfService, int i10, String str, StoreAddress storeAddress, boolean z10, double d10, String str2, Integer num, boolean z11, double d11, String str3, GeoPoint geoPoint, boolean z12, boolean z13, OpeningHours openingHours, String str4, String str5, String str6, List list, List list2, boolean z14, boolean z15, boolean z16, int i11, Object obj) {
        boolean z17;
        boolean z18;
        int i12 = (i11 & 1) != 0 ? pointOfService.storeId : i10;
        String str7 = (i11 & 2) != 0 ? pointOfService.displayName : str;
        StoreAddress storeAddress2 = (i11 & 4) != 0 ? pointOfService.address : storeAddress;
        boolean z19 = (i11 & 8) != 0 ? pointOfService.curbSideEligibility : z10;
        double d12 = (i11 & 16) != 0 ? pointOfService.curbSideFee : d10;
        String str8 = (i11 & 32) != 0 ? pointOfService.curbsidePartner : str2;
        Integer num2 = (i11 & 64) != 0 ? pointOfService.mfcStoreId : num;
        boolean z20 = (i11 & 128) != 0 ? pointOfService.isEligibleForDelivery : z11;
        double d13 = (i11 & 256) != 0 ? pointOfService.deliveryFee : d11;
        String str9 = (i11 & 512) != 0 ? pointOfService.deliveryPartner : str3;
        GeoPoint geoPoint2 = (i11 & 1024) != 0 ? pointOfService.geoPoint : geoPoint;
        boolean z21 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? pointOfService.isMobilePaymentEnabledEventsStrategy : z12;
        int i13 = i12;
        boolean z22 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? pointOfService.isMobileShoppingEnabled : z13;
        OpeningHours openingHours2 = (i11 & 8192) != 0 ? pointOfService.openingHours : openingHours;
        String str10 = (i11 & 16384) != 0 ? pointOfService.phone : str4;
        String str11 = (i11 & 32768) != 0 ? pointOfService.pickupHelpNumber : str5;
        String str12 = (i11 & 65536) != 0 ? pointOfService.storeDirector : str6;
        List list3 = (i11 & 131072) != 0 ? pointOfService.storeLocatorFeatures : list;
        List list4 = (i11 & 262144) != 0 ? pointOfService.storeTenants : list2;
        boolean z23 = (i11 & 524288) != 0 ? pointOfService.isAlcoholDeliveryEnabled : z14;
        boolean z24 = (i11 & 1048576) != 0 ? pointOfService.isAlcoholPickupEnabled : z15;
        if ((i11 & 2097152) != 0) {
            z18 = z24;
            z17 = pointOfService.ebtEnabled;
        } else {
            z17 = z16;
            z18 = z24;
        }
        return pointOfService.a(i13, str7, storeAddress2, z19, d12, str8, num2, z20, d13, str9, geoPoint2, z21, z22, openingHours2, str10, str11, str12, list3, list4, z23, z18, z17);
    }

    public final PointOfService a(int storeId, String displayName, StoreAddress address, boolean curbSideEligibility, double curbSideFee, String curbsidePartner, Integer mfcStoreId, boolean isEligibleForDelivery, double deliveryFee, String deliveryPartner, GeoPoint geoPoint, boolean isMobilePaymentEnabledEventsStrategy, boolean isMobileShoppingEnabled, OpeningHours openingHours, String phone, String pickupHelpNumber, String storeDirector, List<StoreLocatorFeature> storeLocatorFeatures, List<StoreTenant> storeTenants, boolean isAlcoholDeliveryEnabled, boolean isAlcoholPickupEnabled, boolean ebtEnabled) {
        Intrinsics.j(storeLocatorFeatures, "storeLocatorFeatures");
        Intrinsics.j(storeTenants, "storeTenants");
        return new PointOfService(storeId, displayName, address, curbSideEligibility, curbSideFee, curbsidePartner, mfcStoreId, isEligibleForDelivery, deliveryFee, deliveryPartner, geoPoint, isMobilePaymentEnabledEventsStrategy, isMobileShoppingEnabled, openingHours, phone, pickupHelpNumber, storeDirector, storeLocatorFeatures, storeTenants, isAlcoholDeliveryEnabled, isAlcoholPickupEnabled, ebtEnabled);
    }

    /* renamed from: c, reason: from getter */
    public final StoreAddress getAddress() {
        return this.address;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getCurbSideEligibility() {
        return this.curbSideEligibility;
    }

    /* renamed from: e, reason: from getter */
    public final double getCurbSideFee() {
        return this.curbSideFee;
    }

    /* renamed from: f, reason: from getter */
    public final String getCurbsidePartner() {
        return this.curbsidePartner;
    }

    /* renamed from: g, reason: from getter */
    public final double getDeliveryFee() {
        return this.deliveryFee;
    }

    /* renamed from: h, reason: from getter */
    public final String getDeliveryPartner() {
        return this.deliveryPartner;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.storeId) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        StoreAddress storeAddress = this.address;
        int iHashCode3 = (((((iHashCode2 + (storeAddress == null ? 0 : storeAddress.hashCode())) * 31) + Boolean.hashCode(this.curbSideEligibility)) * 31) + Double.hashCode(this.curbSideFee)) * 31;
        String str2 = this.curbsidePartner;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.mfcStoreId;
        int iHashCode5 = (((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isEligibleForDelivery)) * 31) + Double.hashCode(this.deliveryFee)) * 31;
        String str3 = this.deliveryPartner;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GeoPoint geoPoint = this.geoPoint;
        int iHashCode7 = (((((iHashCode6 + (geoPoint == null ? 0 : geoPoint.hashCode())) * 31) + Boolean.hashCode(this.isMobilePaymentEnabledEventsStrategy)) * 31) + Boolean.hashCode(this.isMobileShoppingEnabled)) * 31;
        OpeningHours openingHours = this.openingHours;
        int iHashCode8 = (iHashCode7 + (openingHours == null ? 0 : openingHours.hashCode())) * 31;
        String str4 = this.phone;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pickupHelpNumber;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.storeDirector;
        return ((((((((((iHashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.storeLocatorFeatures.hashCode()) * 31) + this.storeTenants.hashCode()) * 31) + Boolean.hashCode(this.isAlcoholDeliveryEnabled)) * 31) + Boolean.hashCode(this.isAlcoholPickupEnabled)) * 31) + Boolean.hashCode(this.ebtEnabled);
    }

    /* renamed from: i, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getEbtEnabled() {
        return this.ebtEnabled;
    }

    /* renamed from: k, reason: from getter */
    public final Integer getMfcStoreId() {
        return this.mfcStoreId;
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
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsAlcoholDeliveryEnabled() {
        return this.isAlcoholDeliveryEnabled;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsAlcoholPickupEnabled() {
        return this.isAlcoholPickupEnabled;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsEligibleForDelivery() {
        return this.isEligibleForDelivery;
    }

    public String toString() {
        return "PointOfService(storeId=" + this.storeId + ", displayName=" + this.displayName + ", address=" + this.address + ", curbSideEligibility=" + this.curbSideEligibility + ", curbSideFee=" + this.curbSideFee + ", curbsidePartner=" + this.curbsidePartner + ", mfcStoreId=" + this.mfcStoreId + ", isEligibleForDelivery=" + this.isEligibleForDelivery + ", deliveryFee=" + this.deliveryFee + ", deliveryPartner=" + this.deliveryPartner + ", geoPoint=" + this.geoPoint + ", isMobilePaymentEnabledEventsStrategy=" + this.isMobilePaymentEnabledEventsStrategy + ", isMobileShoppingEnabled=" + this.isMobileShoppingEnabled + ", openingHours=" + this.openingHours + ", phone=" + this.phone + ", pickupHelpNumber=" + this.pickupHelpNumber + ", storeDirector=" + this.storeDirector + ", storeLocatorFeatures=" + this.storeLocatorFeatures + ", storeTenants=" + this.storeTenants + ", isAlcoholDeliveryEnabled=" + this.isAlcoholDeliveryEnabled + ", isAlcoholPickupEnabled=" + this.isAlcoholPickupEnabled + ", ebtEnabled=" + this.ebtEnabled + ')';
    }

    public /* synthetic */ PointOfService(int i10, String str, StoreAddress storeAddress, boolean z10, double d10, String str2, Integer num, boolean z11, double d11, String str3, GeoPoint geoPoint, boolean z12, boolean z13, OpeningHours openingHours, String str4, String str5, String str6, List list, List list2, boolean z14, boolean z15, boolean z16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : storeAddress, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? 0.0d : d10, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? false : z11, (i11 & 256) == 0 ? d11 : 0.0d, (i11 & 512) != 0 ? null : str3, (i11 & 1024) != 0 ? null : geoPoint, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z12, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z13, (i11 & 8192) != 0 ? null : openingHours, (i11 & 16384) != 0 ? null : str4, (i11 & 32768) != 0 ? null : str5, (i11 & 65536) != 0 ? null : str6, (i11 & 131072) != 0 ? CollectionsKt.m() : list, (i11 & 262144) != 0 ? CollectionsKt.m() : list2, (i11 & 524288) != 0 ? false : z14, (i11 & 1048576) != 0 ? false : z15, (i11 & 2097152) != 0 ? false : z16);
    }
}
