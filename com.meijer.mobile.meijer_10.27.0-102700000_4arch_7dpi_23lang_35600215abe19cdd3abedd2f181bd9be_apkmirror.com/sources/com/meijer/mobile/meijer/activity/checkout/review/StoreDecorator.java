package com.meijer.mobile.meijer.activity.checkout.review;

import Hk.Validation;
import Tq.PointOfService;
import androidx.recyclerview.widget.RecyclerView;
import ci.Region;
import ci.StoreAddress;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ok.StoreDetails;
import sk.C16981a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0001\u001cB\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b(\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b#\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b'\u0010\"¨\u00061"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "", "", "name", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "phoneNumber", "pickupHelpNumber", "addressLine1", "addressCityStateZip", "zipCode", "curbsidePartner", "deliveryPartner", "", "deliveryFee", "curbsideFee", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "c", "getPhoneNumber", "d", "g", "e", "i", "j", "D", "getDeliveryFee", "()D", "k", "getCurbsideFee", "l", "m", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.X1, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class StoreDecorator {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer storeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupHelpNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressCityStateZip;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsidePartner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryPartner;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final double deliveryFee;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final double curbsideFee;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer error;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/X1$a;", "", "<init>", "()V", "LHk/b;", "LTq/c;", "validation", "Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "e", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "pointOfService", "", "error", "a", "(LTq/c;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "Lok/h;", "storeDetails", "b", "(Lok/h;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.X1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ StoreDecorator c(Companion companion, PointOfService pointOfService, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.a(pointOfService, str);
        }

        public static /* synthetic */ StoreDecorator d(Companion companion, StoreDetails storeDetails, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.b(storeDetails, str);
        }

        public final StoreDecorator a(PointOfService pointOfService, String error) {
            String strC;
            if (pointOfService == null) {
                return new StoreDecorator(null, null, null, null, null, null, null, null, null, 0.0d, 0.0d, Integer.valueOf(com.meijer.mobile.meijer.Y.f99788Ra), 2047, null);
            }
            String displayName = pointOfService.getDisplayName();
            Integer numValueOf = Integer.valueOf(pointOfService.getStoreId());
            String phone = pointOfService.getPhone();
            String pickupHelpNumber = pointOfService.getPickupHelpNumber();
            StoreAddress address = pointOfService.getAddress();
            String line1 = address != null ? address.getLine1() : null;
            StoreAddress address2 = pointOfService.getAddress();
            if (address2 != null) {
                C16981a c16981a = C16981a.f160555a;
                String town = address2.getTown();
                Region region = address2.getRegion();
                String isoCodeShort = region.getIsoCodeShort();
                if (isoCodeShort == null) {
                    isoCodeShort = StringsKt.J0(region.getIsoCode(), "US-");
                }
                strC = c16981a.c(town, isoCodeShort, address2.getPostalCode());
            } else {
                strC = null;
            }
            C16981a c16981a2 = C16981a.f160555a;
            StoreAddress address3 = pointOfService.getAddress();
            String strG = c16981a2.g(address3 != null ? address3.getPostalCode() : null);
            String curbsidePartner = pointOfService.getCurbsidePartner();
            String deliveryPartner = pointOfService.getDeliveryPartner();
            double deliveryFee = pointOfService.getDeliveryFee();
            double curbSideFee = pointOfService.getCurbSideFee();
            Integer numValueOf2 = Integer.valueOf(com.meijer.mobile.meijer.Y.f99788Ra);
            if (error == null || error.length() == 0) {
                numValueOf2 = null;
            }
            return new StoreDecorator(displayName, numValueOf, phone, pickupHelpNumber, line1, strC, strG, curbsidePartner, deliveryPartner, deliveryFee, curbSideFee, numValueOf2);
        }

        public final StoreDecorator b(StoreDetails storeDetails, String error) {
            if (storeDetails != null) {
                String name = storeDetails.getName();
                Integer numValueOf = Integer.valueOf(storeDetails.getStoreId());
                String storePhoneNumber = storeDetails.getStorePhoneNumber();
                String streetAddress = storeDetails.getStreetAddress();
                String strC = C16981a.f160555a.c(storeDetails.getCity(), storeDetails.getState(), storeDetails.getZipCode());
                String zipCode = storeDetails.getZipCode();
                Integer numValueOf2 = Integer.valueOf(com.meijer.mobile.meijer.Y.f99788Ra);
                if (error == null || error.length() == 0) {
                    numValueOf2 = null;
                }
                return new StoreDecorator(name, numValueOf, storePhoneNumber, null, streetAddress, strC, zipCode, null, null, 0.0d, 0.0d, numValueOf2, 1928, null);
            }
            return new StoreDecorator(null, null, null, null, null, null, null, null, null, 0.0d, 0.0d, Integer.valueOf(com.meijer.mobile.meijer.Y.f99788Ra), 2047, null);
        }

        public final StoreDecorator e(Validation<PointOfService> validation) {
            Intrinsics.j(validation, "validation");
            PointOfService pointOfServiceE = validation.e();
            Hk.c cVar = (Hk.c) CollectionsKt.u0(validation.getResult().a());
            return a(pointOfServiceE, cVar != null ? cVar.getMessage() : null);
        }
    }

    public StoreDecorator() {
        this(null, null, null, null, null, null, null, null, null, 0.0d, 0.0d, null, l3.f92483b, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreDecorator)) {
            return false;
        }
        StoreDecorator storeDecorator = (StoreDecorator) other;
        return Intrinsics.e(this.name, storeDecorator.name) && Intrinsics.e(this.storeId, storeDecorator.storeId) && Intrinsics.e(this.phoneNumber, storeDecorator.phoneNumber) && Intrinsics.e(this.pickupHelpNumber, storeDecorator.pickupHelpNumber) && Intrinsics.e(this.addressLine1, storeDecorator.addressLine1) && Intrinsics.e(this.addressCityStateZip, storeDecorator.addressCityStateZip) && Intrinsics.e(this.zipCode, storeDecorator.zipCode) && Intrinsics.e(this.curbsidePartner, storeDecorator.curbsidePartner) && Intrinsics.e(this.deliveryPartner, storeDecorator.deliveryPartner) && Double.compare(this.deliveryFee, storeDecorator.deliveryFee) == 0 && Double.compare(this.curbsideFee, storeDecorator.curbsideFee) == 0 && Intrinsics.e(this.error, storeDecorator.error);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.storeId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.phoneNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pickupHelpNumber;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine1;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressCityStateZip;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zipCode;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.curbsidePartner;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deliveryPartner;
        int iHashCode9 = (((((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + Double.hashCode(this.deliveryFee)) * 31) + Double.hashCode(this.curbsideFee)) * 31;
        Integer num2 = this.error;
        return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "StoreDecorator(name=" + this.name + ", storeId=" + this.storeId + ", phoneNumber=" + this.phoneNumber + ", pickupHelpNumber=" + this.pickupHelpNumber + ", addressLine1=" + this.addressLine1 + ", addressCityStateZip=" + this.addressCityStateZip + ", zipCode=" + this.zipCode + ", curbsidePartner=" + this.curbsidePartner + ", deliveryPartner=" + this.deliveryPartner + ", deliveryFee=" + this.deliveryFee + ", curbsideFee=" + this.curbsideFee + ", error=" + this.error + ')';
    }

    public StoreDecorator(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, double d10, double d11, Integer num2) {
        this.name = str;
        this.storeId = num;
        this.phoneNumber = str2;
        this.pickupHelpNumber = str3;
        this.addressLine1 = str4;
        this.addressCityStateZip = str5;
        this.zipCode = str6;
        this.curbsidePartner = str7;
        this.deliveryPartner = str8;
        this.deliveryFee = d10;
        this.curbsideFee = d11;
        this.error = num2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddressCityStateZip() {
        return this.addressCityStateZip;
    }

    /* renamed from: b, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: c, reason: from getter */
    public final String getCurbsidePartner() {
        return this.curbsidePartner;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeliveryPartner() {
        return this.deliveryPartner;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getError() {
        return this.error;
    }

    /* renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: g, reason: from getter */
    public final String getPickupHelpNumber() {
        return this.pickupHelpNumber;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getStoreId() {
        return this.storeId;
    }

    /* renamed from: i, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    public /* synthetic */ StoreDecorator(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, double d10, double d11, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? null : str8, (i10 & 512) != 0 ? 0.0d : d10, (i10 & 1024) == 0 ? d11 : 0.0d, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : num2);
    }
}
