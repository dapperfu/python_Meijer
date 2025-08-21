package Vl;

import Pk.Coupon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b%\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u0014¨\u00064"}, d2 = {"LVl/f;", "LVl/b;", "", "cardId", "cardTitle", "LVl/e;", "componentType", "", "LPk/a;", "coupons", "seeAllTitle", "seeAllDeepLink", "carouselBanner", "", "totalCount", "loadBeaconUrl", "viewBeaconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;LVl/e;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCardId", "b", "getCardTitle", "c", "LVl/e;", "getComponentType", "()LVl/e;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "getSeeAllTitle", "f", "getSeeAllDeepLink", "g", "getCarouselBanner", "h", "I", "i", "getLoadBeaconUrl", "j", "getViewBeaconUrl", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vl.f, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class HomeCouponCard implements b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e componentType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Coupon> coupons;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String seeAllTitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String seeAllDeepLink;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String carouselBanner;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String loadBeaconUrl;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String viewBeaconUrl;

    public HomeCouponCard(String cardId, String cardTitle, e componentType, List<Coupon> coupons, String str, String str2, String str3, int i10, String str4, String str5) {
        Intrinsics.j(cardId, "cardId");
        Intrinsics.j(cardTitle, "cardTitle");
        Intrinsics.j(componentType, "componentType");
        Intrinsics.j(coupons, "coupons");
        this.cardId = cardId;
        this.cardTitle = cardTitle;
        this.componentType = componentType;
        this.coupons = coupons;
        this.seeAllTitle = str;
        this.seeAllDeepLink = str2;
        this.carouselBanner = str3;
        this.totalCount = i10;
        this.loadBeaconUrl = str4;
        this.viewBeaconUrl = str5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeCouponCard)) {
            return false;
        }
        HomeCouponCard homeCouponCard = (HomeCouponCard) other;
        return Intrinsics.e(this.cardId, homeCouponCard.cardId) && Intrinsics.e(this.cardTitle, homeCouponCard.cardTitle) && Intrinsics.e(this.componentType, homeCouponCard.componentType) && Intrinsics.e(this.coupons, homeCouponCard.coupons) && Intrinsics.e(this.seeAllTitle, homeCouponCard.seeAllTitle) && Intrinsics.e(this.seeAllDeepLink, homeCouponCard.seeAllDeepLink) && Intrinsics.e(this.carouselBanner, homeCouponCard.carouselBanner) && this.totalCount == homeCouponCard.totalCount && Intrinsics.e(this.loadBeaconUrl, homeCouponCard.loadBeaconUrl) && Intrinsics.e(this.viewBeaconUrl, homeCouponCard.viewBeaconUrl);
    }

    @Override // Vl.b
    public List<Coupon> a() {
        return this.coupons;
    }

    @Override // Vl.b
    /* renamed from: d, reason: from getter */
    public int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        int iHashCode = ((((((this.cardId.hashCode() * 31) + this.cardTitle.hashCode()) * 31) + this.componentType.hashCode()) * 31) + this.coupons.hashCode()) * 31;
        String str = this.seeAllTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.seeAllDeepLink;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.carouselBanner;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.totalCount)) * 31;
        String str4 = this.loadBeaconUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.viewBeaconUrl;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "HomeCouponCard(cardId=" + this.cardId + ", cardTitle=" + this.cardTitle + ", componentType=" + this.componentType + ", coupons=" + this.coupons + ", seeAllTitle=" + this.seeAllTitle + ", seeAllDeepLink=" + this.seeAllDeepLink + ", carouselBanner=" + this.carouselBanner + ", totalCount=" + this.totalCount + ", loadBeaconUrl=" + this.loadBeaconUrl + ", viewBeaconUrl=" + this.viewBeaconUrl + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HomeCouponCard(java.lang.String r14, java.lang.String r15, Vl.e r16, java.util.List r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 8
            if (r1 == 0) goto Lc
            java.util.List r1 = kotlin.collections.CollectionsKt.m()
            r6 = r1
            goto Le
        Lc:
            r6 = r17
        Le:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L15
            r7 = r2
            goto L17
        L15:
            r7 = r18
        L17:
            r1 = r0 & 32
            if (r1 == 0) goto L1d
            r8 = r2
            goto L1f
        L1d:
            r8 = r19
        L1f:
            r1 = r0 & 64
            if (r1 == 0) goto L25
            r9 = r2
            goto L27
        L25:
            r9 = r20
        L27:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2e
            r1 = 0
            r10 = r1
            goto L30
        L2e:
            r10 = r21
        L30:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L36
            r11 = r2
            goto L38
        L36:
            r11 = r22
        L38:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L43
            r12 = r2
            r3 = r14
            r4 = r15
            r5 = r16
            r2 = r13
            goto L4a
        L43:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
        L4a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Vl.HomeCouponCard.<init>(java.lang.String, java.lang.String, Vl.e, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
