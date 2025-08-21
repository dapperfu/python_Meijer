package el;

import Pk.Coupon;
import android.content.Context;
import com.medallia.digital.mobilesdk.l3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qk.f;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013Jd\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001fR*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u00101R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00102\u001a\u0004\b-\u00103\"\u0004\b4\u00105R$\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010.\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u00101R\u001a\u00108\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b8\u00103R\u001c\u0010=\u001a\u0004\u0018\u0001098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lel/a;", "", "", "couponCount", "availableCouponCount", "", "LPk/a;", "listOfCoupons", "Lel/a$a;", "responseCode", "", "responseMessage", "", "hasSpecialOffers", "specialOffersUrl", "<init>", "(IILjava/util/List;Lel/a$a;Ljava/lang/String;ZLjava/lang/String;)V", "other", "i", "(Lel/a;)Lel/a;", "a", "(IILjava/util/List;Lel/a$a;Ljava/lang/String;ZLjava/lang/String;)Lel/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "I", "d", "setCouponCount", "(I)V", "b", "c", "setAvailableCouponCount", "Ljava/util/List;", "f", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "Lel/a$a;", "g", "()Lel/a$a;", "setResponseCode", "(Lel/a$a;)V", "e", "Ljava/lang/String;", "getResponseMessage", "setResponseMessage", "(Ljava/lang/String;)V", "Z", "()Z", "j", "(Z)V", "h", "l", "isSuccess", "Lsk/b;", "Lsk/b;", "getErrorType", "()Lsk/b;", "errorType", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: el.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class CouponsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private int couponCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private int availableCouponCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private List<Coupon> listOfCoupons;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private EnumC2049a responseCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String responseMessage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean hasSpecialOffers;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String specialOffersUrl;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isSuccess;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final sk.b errorType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lel/a$a;", "Lsk/b;", "", "", "resultCode", "messageResourceId", "<init>", "(Ljava/lang/String;III)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "I", "getResultCode", "()I", "b", "getErrorResourceId", "errorResourceId", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: el.a$a, reason: collision with other inner class name */
    public static final class EnumC2049a implements sk.b {

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC2049a f130224c = new EnumC2049a("SUCCESS", 0, 0, f.f158514l);

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC2049a f130225d = new EnumC2049a("INVALID_OFFER_CODE", 1, 1, Zk.a.f43864o);

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC2049a f130226e = new EnumC2049a("OFFER_CODE_ANOTHER_ACCOUNT", 2, 2, Zk.a.f43862m);

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC2049a f130227f = new EnumC2049a("OFFER_CODE_ALREADY_CLIPPED", 3, 3, Zk.a.f43860k);

        /* renamed from: g, reason: collision with root package name */
        public static final EnumC2049a f130228g = new EnumC2049a("OFFER_CODE_ALREADY_REDEEMED", 4, 4, Zk.a.f43861l);

        /* renamed from: h, reason: collision with root package name */
        public static final EnumC2049a f130229h = new EnumC2049a("OFFER_CODE_EXPIRED", 5, 5, Zk.a.f43864o);

        /* renamed from: i, reason: collision with root package name */
        public static final EnumC2049a f130230i = new EnumC2049a("OFFER_CODE_EXPIRED_LESS_THAN_TWO_WEEKS", 6, 6, Zk.a.f43863n);

        /* renamed from: j, reason: collision with root package name */
        public static final EnumC2049a f130231j = new EnumC2049a("OFFER_CODE_NOT_AVAILABLE", 7, 7, Zk.a.f43865p);

        /* renamed from: k, reason: collision with root package name */
        public static final EnumC2049a f130232k = new EnumC2049a("SAME_KIND_OF_OFFER_CODE_APPLIED", 8, 8, Zk.a.f43860k);

        /* renamed from: l, reason: collision with root package name */
        public static final EnumC2049a f130233l = new EnumC2049a("OFFER_CODE_ONLY_AVAILABLE_TO_NEW_MEMBERS", 9, 9, Zk.a.f43866q);

        /* renamed from: m, reason: collision with root package name */
        public static final EnumC2049a f130234m = new EnumC2049a("UNAUTH_ERROR", 10, 10, Zk.a.f43868s);

        /* renamed from: n, reason: collision with root package name */
        public static final EnumC2049a f130235n = new EnumC2049a("UNKNOWN_ERROR", 11, -1, Zk.a.f43867r);

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumC2049a[] f130236o;

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f130237p;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int resultCode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int messageResourceId;

        static {
            EnumC2049a[] enumC2049aArrA = a();
            f130236o = enumC2049aArrA;
            f130237p = EnumEntriesKt.a(enumC2049aArrA);
        }

        private static final /* synthetic */ EnumC2049a[] a() {
            return new EnumC2049a[]{f130224c, f130225d, f130226e, f130227f, f130228g, f130229h, f130230i, f130231j, f130232k, f130233l, f130234m, f130235n};
        }

        public static EnumC2049a valueOf(String str) {
            return (EnumC2049a) Enum.valueOf(EnumC2049a.class, str);
        }

        public static EnumC2049a[] values() {
            return (EnumC2049a[]) f130236o.clone();
        }

        @Override // sk.b
        /* renamed from: getErrorResourceId, reason: from getter */
        public int getMessageResourceId() {
            return this.messageResourceId;
        }

        @Override // sk.b
        public String getErrorString(Context context) {
            Intrinsics.j(context, "context");
            String string = context.getString(this.messageResourceId);
            Intrinsics.i(string, "getString(...)");
            return string;
        }

        @Override // sk.b
        public int getResultCode() {
            return this.resultCode;
        }

        private EnumC2049a(String str, int i10, int i11, int i12) {
            this.resultCode = i11;
            this.messageResourceId = i12;
        }
    }

    public CouponsResponse() {
        this(0, 0, null, null, null, false, null, l3.f93324d, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponsResponse)) {
            return false;
        }
        CouponsResponse couponsResponse = (CouponsResponse) other;
        return this.couponCount == couponsResponse.couponCount && this.availableCouponCount == couponsResponse.availableCouponCount && Intrinsics.e(this.listOfCoupons, couponsResponse.listOfCoupons) && this.responseCode == couponsResponse.responseCode && Intrinsics.e(this.responseMessage, couponsResponse.responseMessage) && this.hasSpecialOffers == couponsResponse.hasSpecialOffers && Intrinsics.e(this.specialOffersUrl, couponsResponse.specialOffersUrl);
    }

    public CouponsResponse(int i10, int i11, List<Coupon> list, EnumC2049a enumC2049a, String str, boolean z10, String str2) {
        this.couponCount = i10;
        this.availableCouponCount = i11;
        this.listOfCoupons = list;
        this.responseCode = enumC2049a;
        this.responseMessage = str;
        this.hasSpecialOffers = z10;
        this.specialOffersUrl = str2;
        this.isSuccess = EnumC2049a.f130224c == enumC2049a;
        this.errorType = enumC2049a;
    }

    public static /* synthetic */ CouponsResponse b(CouponsResponse couponsResponse, int i10, int i11, List list, EnumC2049a enumC2049a, String str, boolean z10, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = couponsResponse.couponCount;
        }
        if ((i12 & 2) != 0) {
            i11 = couponsResponse.availableCouponCount;
        }
        if ((i12 & 4) != 0) {
            list = couponsResponse.listOfCoupons;
        }
        if ((i12 & 8) != 0) {
            enumC2049a = couponsResponse.responseCode;
        }
        if ((i12 & 16) != 0) {
            str = couponsResponse.responseMessage;
        }
        if ((i12 & 32) != 0) {
            z10 = couponsResponse.hasSpecialOffers;
        }
        if ((i12 & 64) != 0) {
            str2 = couponsResponse.specialOffersUrl;
        }
        boolean z11 = z10;
        String str3 = str2;
        String str4 = str;
        List list2 = list;
        return couponsResponse.a(i10, i11, list2, enumC2049a, str4, z11, str3);
    }

    public final CouponsResponse a(int couponCount, int availableCouponCount, List<Coupon> listOfCoupons, EnumC2049a responseCode, String responseMessage, boolean hasSpecialOffers, String specialOffersUrl) {
        return new CouponsResponse(couponCount, availableCouponCount, listOfCoupons, responseCode, responseMessage, hasSpecialOffers, specialOffersUrl);
    }

    /* renamed from: c, reason: from getter */
    public final int getAvailableCouponCount() {
        return this.availableCouponCount;
    }

    /* renamed from: d, reason: from getter */
    public final int getCouponCount() {
        return this.couponCount;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getHasSpecialOffers() {
        return this.hasSpecialOffers;
    }

    public final List<Coupon> f() {
        return this.listOfCoupons;
    }

    /* renamed from: g, reason: from getter */
    public final EnumC2049a getResponseCode() {
        return this.responseCode;
    }

    /* renamed from: h, reason: from getter */
    public final String getSpecialOffersUrl() {
        return this.specialOffersUrl;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.couponCount) * 31) + Integer.hashCode(this.availableCouponCount)) * 31;
        List<Coupon> list = this.listOfCoupons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        EnumC2049a enumC2049a = this.responseCode;
        int iHashCode3 = (iHashCode2 + (enumC2049a == null ? 0 : enumC2049a.hashCode())) * 31;
        String str = this.responseMessage;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hasSpecialOffers)) * 31;
        String str2 = this.specialOffersUrl;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final CouponsResponse i(CouponsResponse other) {
        Intrinsics.j(other, "other");
        int i10 = this.couponCount + other.couponCount;
        int i11 = this.availableCouponCount + other.availableCouponCount;
        List<Coupon> listM = this.listOfCoupons;
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List<Coupon> list = listM;
        List<Coupon> listM2 = other.listOfCoupons;
        if (listM2 == null) {
            listM2 = CollectionsKt.m();
        }
        List listP0 = CollectionsKt.P0(list, listM2);
        boolean z10 = this.hasSpecialOffers || other.hasSpecialOffers;
        String str = this.specialOffersUrl;
        if (str == null) {
            str = other.specialOffersUrl;
        }
        return b(this, i10, i11, listP0, null, null, z10, str, 24, null);
    }

    public final void j(boolean z10) {
        this.hasSpecialOffers = z10;
    }

    public final void k(List<Coupon> list) {
        this.listOfCoupons = list;
    }

    public final void l(String str) {
        this.specialOffersUrl = str;
    }

    public String toString() {
        return "CouponsResponse(couponCount=" + this.couponCount + ", availableCouponCount=" + this.availableCouponCount + ", listOfCoupons=" + this.listOfCoupons + ", responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", hasSpecialOffers=" + this.hasSpecialOffers + ", specialOffersUrl=" + this.specialOffersUrl + ')';
    }

    public /* synthetic */ CouponsResponse(int i10, int i11, List list, EnumC2049a enumC2049a, String str, boolean z10, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? CollectionsKt.m() : list, (i12 & 8) != 0 ? null : enumC2049a, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? false : z10, (i12 & 64) != 0 ? null : str2);
    }
}
