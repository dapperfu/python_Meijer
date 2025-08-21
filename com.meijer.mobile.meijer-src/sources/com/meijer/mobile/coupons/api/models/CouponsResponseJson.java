package com.meijer.mobile.coupons.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001:\u00012BO\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJX\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001e\u0010\u001dR*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010.\u001a\u0004\b\u001f\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson;", "", "", "couponCount", "availableCouponCount", "", "Lcom/meijer/mobile/coupons/api/models/CouponJson;", "listOfCoupons", "Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson$CouponsResponseCode;", "responseCode", "", "responseMessage", "", "hasSpecialOffers", "<init>", "(IILjava/util/List;Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson$CouponsResponseCode;Ljava/lang/String;Z)V", "copy", "(IILjava/util/List;Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson$CouponsResponseCode;Ljava/lang/String;Z)Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "setCouponCount", "(I)V", "setAvailableCouponCount", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "setListOfCoupons", "(Ljava/util/List;)V", "Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson$CouponsResponseCode;", "e", "()Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson$CouponsResponseCode;", "setResponseCode", "(Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson$CouponsResponseCode;)V", "Ljava/lang/String;", "f", "setResponseMessage", "(Ljava/lang/String;)V", "Z", "()Z", "setHasSpecialOffers", "(Z)V", "CouponsResponseCode", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CouponsResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private int couponCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private int availableCouponCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private List<CouponJson> listOfCoupons;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private CouponsResponseCode responseCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String responseMessage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean hasSpecialOffers;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson$CouponsResponseCode;", "", "resultCode", "", "<init>", "(Ljava/lang/String;II)V", "SUCCESS", "INVALID_OFFER_CODE", "OFFER_CODE_ANOTHER_ACCOUNT", "OFFER_CODE_ALREADY_CLIPPED", "OFFER_CODE_ALREADY_REDEEMED", "OFFER_CODE_EXPIRED", "OFFER_CODE_EXPIRED_LESS_THAN_TWO_WEEKS", "OFFER_CODE_NOT_AVAILABLE", "SAME_KIND_OF_OFFER_CODE_APPLIED", "OFFER_CODE_ONLY_AVAILABLE_TO_NEW_MEMBERS", "UNAUTH_ERROR", "UNKNOWN_ERROR", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CouponsResponseCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CouponsResponseCode[] $VALUES;
        private final int resultCode;

        @g(name = "0")
        public static final CouponsResponseCode SUCCESS = new CouponsResponseCode("SUCCESS", 0, 0);

        @g(name = "1")
        public static final CouponsResponseCode INVALID_OFFER_CODE = new CouponsResponseCode("INVALID_OFFER_CODE", 1, 1);

        @g(name = "2")
        public static final CouponsResponseCode OFFER_CODE_ANOTHER_ACCOUNT = new CouponsResponseCode("OFFER_CODE_ANOTHER_ACCOUNT", 2, 2);

        @g(name = "3")
        public static final CouponsResponseCode OFFER_CODE_ALREADY_CLIPPED = new CouponsResponseCode("OFFER_CODE_ALREADY_CLIPPED", 3, 3);

        @g(name = "4")
        public static final CouponsResponseCode OFFER_CODE_ALREADY_REDEEMED = new CouponsResponseCode("OFFER_CODE_ALREADY_REDEEMED", 4, 4);

        @g(name = "5")
        public static final CouponsResponseCode OFFER_CODE_EXPIRED = new CouponsResponseCode("OFFER_CODE_EXPIRED", 5, 5);

        @g(name = "6")
        public static final CouponsResponseCode OFFER_CODE_EXPIRED_LESS_THAN_TWO_WEEKS = new CouponsResponseCode("OFFER_CODE_EXPIRED_LESS_THAN_TWO_WEEKS", 6, 6);

        @g(name = "7")
        public static final CouponsResponseCode OFFER_CODE_NOT_AVAILABLE = new CouponsResponseCode("OFFER_CODE_NOT_AVAILABLE", 7, 7);

        @g(name = "8")
        public static final CouponsResponseCode SAME_KIND_OF_OFFER_CODE_APPLIED = new CouponsResponseCode("SAME_KIND_OF_OFFER_CODE_APPLIED", 8, 8);

        @g(name = "9")
        public static final CouponsResponseCode OFFER_CODE_ONLY_AVAILABLE_TO_NEW_MEMBERS = new CouponsResponseCode("OFFER_CODE_ONLY_AVAILABLE_TO_NEW_MEMBERS", 9, 9);

        @g(name = "10")
        public static final CouponsResponseCode UNAUTH_ERROR = new CouponsResponseCode("UNAUTH_ERROR", 10, 10);
        public static final CouponsResponseCode UNKNOWN_ERROR = new CouponsResponseCode("UNKNOWN_ERROR", 11, -1);

        private static final /* synthetic */ CouponsResponseCode[] a() {
            return new CouponsResponseCode[]{SUCCESS, INVALID_OFFER_CODE, OFFER_CODE_ANOTHER_ACCOUNT, OFFER_CODE_ALREADY_CLIPPED, OFFER_CODE_ALREADY_REDEEMED, OFFER_CODE_EXPIRED, OFFER_CODE_EXPIRED_LESS_THAN_TWO_WEEKS, OFFER_CODE_NOT_AVAILABLE, SAME_KIND_OF_OFFER_CODE_APPLIED, OFFER_CODE_ONLY_AVAILABLE_TO_NEW_MEMBERS, UNAUTH_ERROR, UNKNOWN_ERROR};
        }

        static {
            CouponsResponseCode[] couponsResponseCodeArrA = a();
            $VALUES = couponsResponseCodeArrA;
            $ENTRIES = EnumEntriesKt.a(couponsResponseCodeArrA);
        }

        public static CouponsResponseCode valueOf(String str) {
            return (CouponsResponseCode) Enum.valueOf(CouponsResponseCode.class, str);
        }

        public static CouponsResponseCode[] values() {
            return (CouponsResponseCode[]) $VALUES.clone();
        }

        private CouponsResponseCode(String str, int i10, int i11) {
            this.resultCode = i11;
        }
    }

    public CouponsResponseJson() {
        this(0, 0, null, null, null, false, 63, null);
    }

    public final CouponsResponseJson copy(@g(name = "couponCount") int couponCount, @g(name = "availableCouponCount") int availableCouponCount, @g(name = "listOfCoupons") List<CouponJson> listOfCoupons, @g(name = "responseCode") CouponsResponseCode responseCode, @g(name = "responseMessage") String responseMessage, @g(name = "hasSpecialOffers") boolean hasSpecialOffers) {
        return new CouponsResponseJson(couponCount, availableCouponCount, listOfCoupons, responseCode, responseMessage, hasSpecialOffers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponsResponseJson)) {
            return false;
        }
        CouponsResponseJson couponsResponseJson = (CouponsResponseJson) other;
        return this.couponCount == couponsResponseJson.couponCount && this.availableCouponCount == couponsResponseJson.availableCouponCount && Intrinsics.e(this.listOfCoupons, couponsResponseJson.listOfCoupons) && this.responseCode == couponsResponseJson.responseCode && Intrinsics.e(this.responseMessage, couponsResponseJson.responseMessage) && this.hasSpecialOffers == couponsResponseJson.hasSpecialOffers;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.couponCount) * 31) + Integer.hashCode(this.availableCouponCount)) * 31;
        List<CouponJson> list = this.listOfCoupons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        CouponsResponseCode couponsResponseCode = this.responseCode;
        int iHashCode3 = (iHashCode2 + (couponsResponseCode == null ? 0 : couponsResponseCode.hashCode())) * 31;
        String str = this.responseMessage;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasSpecialOffers);
    }

    public String toString() {
        return "CouponsResponseJson(couponCount=" + this.couponCount + ", availableCouponCount=" + this.availableCouponCount + ", listOfCoupons=" + this.listOfCoupons + ", responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", hasSpecialOffers=" + this.hasSpecialOffers + ')';
    }

    public CouponsResponseJson(@g(name = "couponCount") int i10, @g(name = "availableCouponCount") int i11, @g(name = "listOfCoupons") List<CouponJson> list, @g(name = "responseCode") CouponsResponseCode couponsResponseCode, @g(name = "responseMessage") String str, @g(name = "hasSpecialOffers") boolean z10) {
        this.couponCount = i10;
        this.availableCouponCount = i11;
        this.listOfCoupons = list;
        this.responseCode = couponsResponseCode;
        this.responseMessage = str;
        this.hasSpecialOffers = z10;
    }

    /* renamed from: a, reason: from getter */
    public final int getAvailableCouponCount() {
        return this.availableCouponCount;
    }

    /* renamed from: b, reason: from getter */
    public final int getCouponCount() {
        return this.couponCount;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getHasSpecialOffers() {
        return this.hasSpecialOffers;
    }

    public final List<CouponJson> d() {
        return this.listOfCoupons;
    }

    /* renamed from: e, reason: from getter */
    public final CouponsResponseCode getResponseCode() {
        return this.responseCode;
    }

    /* renamed from: f, reason: from getter */
    public final String getResponseMessage() {
        return this.responseMessage;
    }

    public /* synthetic */ CouponsResponseJson(int i10, int i11, List list, CouponsResponseCode couponsResponseCode, String str, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : couponsResponseCode, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? false : z10);
    }
}
