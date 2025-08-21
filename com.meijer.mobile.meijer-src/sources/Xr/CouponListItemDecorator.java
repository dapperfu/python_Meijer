package Xr;

import Pk.Coupon;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import fl.C14018c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0001\u0014B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0094\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b(\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b)\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b*\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b\u000e\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b/\u0010.R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b+\u0010.¨\u00064"}, d2 = {"LXr/c;", "", "LPk/c;", "couponIdentity", "Lbk/a;", "title", "description", "", "imageURL", "hatText", "couponExpiration", "redemptionStartDate", "redemptionEndDate", "", "isAddedToShoppingList", "termsAndConditions", "isClipped", "shouldHideActionButton", "<init>", "(LPk/c;Lbk/a;Lbk/a;Ljava/lang/String;Ljava/lang/String;Lbk/a;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZ)V", "a", "(LPk/c;Lbk/a;Lbk/a;Ljava/lang/String;Ljava/lang/String;Lbk/a;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZ)LXr/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LPk/c;", "d", "()LPk/c;", "b", "Lbk/a;", "i", "()Lbk/a;", "c", "e", "Ljava/lang/String;", "g", "f", "getRedemptionStartDate", "h", "getRedemptionEndDate", "Z", "()Z", "j", "getTermsAndConditions", "k", "l", "m", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xr.c, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class CouponListItemDecorator {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f42649n = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pk.c couponIdentity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hatText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a couponExpiration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionStartDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionEndDate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAddedToShoppingList;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsAndConditions;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClipped;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldHideActionButton;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LXr/c$a;", "", "<init>", "()V", "LPk/a;", "coupon", "LXr/c;", "a", "(LPk/a;)LXr/c;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xr.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CouponListItemDecorator a(Coupon coupon) {
            Intrinsics.j(coupon, "coupon");
            Pk.c cVarA = Pk.e.a(coupon.getOfferId());
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return new CouponListItemDecorator(cVarA, companion.c(coupon.getTitle()), companion.c(coupon.getDescription()), coupon.getImageURL(), coupon.getHatText(), C14018c.f(coupon) ? C14018c.c(coupon) : C14018c.e(coupon, null, 1, null), null, null, coupon.getIsAddedToShoppingList(), coupon.getTermsAndConditions(), coupon.x(), C14018c.g(coupon), 192, null);
        }
    }

    public CouponListItemDecorator(Pk.c couponIdentity, AbstractC6392a title, AbstractC6392a description, String str, String str2, AbstractC6392a abstractC6392a, String str3, String str4, boolean z10, String str5, boolean z11, boolean z12) {
        Intrinsics.j(couponIdentity, "couponIdentity");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        this.couponIdentity = couponIdentity;
        this.title = title;
        this.description = description;
        this.imageURL = str;
        this.hatText = str2;
        this.couponExpiration = abstractC6392a;
        this.redemptionStartDate = str3;
        this.redemptionEndDate = str4;
        this.isAddedToShoppingList = z10;
        this.termsAndConditions = str5;
        this.isClipped = z11;
        this.shouldHideActionButton = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponListItemDecorator)) {
            return false;
        }
        CouponListItemDecorator couponListItemDecorator = (CouponListItemDecorator) other;
        return Intrinsics.e(this.couponIdentity, couponListItemDecorator.couponIdentity) && Intrinsics.e(this.title, couponListItemDecorator.title) && Intrinsics.e(this.description, couponListItemDecorator.description) && Intrinsics.e(this.imageURL, couponListItemDecorator.imageURL) && Intrinsics.e(this.hatText, couponListItemDecorator.hatText) && Intrinsics.e(this.couponExpiration, couponListItemDecorator.couponExpiration) && Intrinsics.e(this.redemptionStartDate, couponListItemDecorator.redemptionStartDate) && Intrinsics.e(this.redemptionEndDate, couponListItemDecorator.redemptionEndDate) && this.isAddedToShoppingList == couponListItemDecorator.isAddedToShoppingList && Intrinsics.e(this.termsAndConditions, couponListItemDecorator.termsAndConditions) && this.isClipped == couponListItemDecorator.isClipped && this.shouldHideActionButton == couponListItemDecorator.shouldHideActionButton;
    }

    public static /* synthetic */ CouponListItemDecorator b(CouponListItemDecorator couponListItemDecorator, Pk.c cVar, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, String str, String str2, AbstractC6392a abstractC6392a3, String str3, String str4, boolean z10, String str5, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = couponListItemDecorator.couponIdentity;
        }
        if ((i10 & 2) != 0) {
            abstractC6392a = couponListItemDecorator.title;
        }
        if ((i10 & 4) != 0) {
            abstractC6392a2 = couponListItemDecorator.description;
        }
        if ((i10 & 8) != 0) {
            str = couponListItemDecorator.imageURL;
        }
        if ((i10 & 16) != 0) {
            str2 = couponListItemDecorator.hatText;
        }
        if ((i10 & 32) != 0) {
            abstractC6392a3 = couponListItemDecorator.couponExpiration;
        }
        if ((i10 & 64) != 0) {
            str3 = couponListItemDecorator.redemptionStartDate;
        }
        if ((i10 & 128) != 0) {
            str4 = couponListItemDecorator.redemptionEndDate;
        }
        if ((i10 & 256) != 0) {
            z10 = couponListItemDecorator.isAddedToShoppingList;
        }
        if ((i10 & 512) != 0) {
            str5 = couponListItemDecorator.termsAndConditions;
        }
        if ((i10 & 1024) != 0) {
            z11 = couponListItemDecorator.isClipped;
        }
        if ((i10 & RecyclerView.m.FLAG_MOVED) != 0) {
            z12 = couponListItemDecorator.shouldHideActionButton;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        boolean z15 = z10;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        AbstractC6392a abstractC6392a4 = abstractC6392a3;
        return couponListItemDecorator.a(cVar, abstractC6392a, abstractC6392a2, str, str9, abstractC6392a4, str7, str8, z15, str6, z13, z14);
    }

    public final CouponListItemDecorator a(Pk.c couponIdentity, AbstractC6392a title, AbstractC6392a description, String imageURL, String hatText, AbstractC6392a couponExpiration, String redemptionStartDate, String redemptionEndDate, boolean isAddedToShoppingList, String termsAndConditions, boolean isClipped, boolean shouldHideActionButton) {
        Intrinsics.j(couponIdentity, "couponIdentity");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        return new CouponListItemDecorator(couponIdentity, title, description, imageURL, hatText, couponExpiration, redemptionStartDate, redemptionEndDate, isAddedToShoppingList, termsAndConditions, isClipped, shouldHideActionButton);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getCouponExpiration() {
        return this.couponExpiration;
    }

    /* renamed from: d, reason: from getter */
    public final Pk.c getCouponIdentity() {
        return this.couponIdentity;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getDescription() {
        return this.description;
    }

    /* renamed from: f, reason: from getter */
    public final String getHatText() {
        return this.hatText;
    }

    /* renamed from: g, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getShouldHideActionButton() {
        return this.shouldHideActionButton;
    }

    public int hashCode() {
        int iHashCode = ((((this.couponIdentity.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        String str = this.imageURL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hatText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AbstractC6392a abstractC6392a = this.couponExpiration;
        int iHashCode4 = (iHashCode3 + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
        String str3 = this.redemptionStartDate;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redemptionEndDate;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isAddedToShoppingList)) * 31;
        String str5 = this.termsAndConditions;
        return ((((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isClipped)) * 31) + Boolean.hashCode(this.shouldHideActionButton);
    }

    /* renamed from: i, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    public String toString() {
        return "CouponListItemDecorator(couponIdentity=" + this.couponIdentity + ", title=" + this.title + ", description=" + this.description + ", imageURL=" + this.imageURL + ", hatText=" + this.hatText + ", couponExpiration=" + this.couponExpiration + ", redemptionStartDate=" + this.redemptionStartDate + ", redemptionEndDate=" + this.redemptionEndDate + ", isAddedToShoppingList=" + this.isAddedToShoppingList + ", termsAndConditions=" + this.termsAndConditions + ", isClipped=" + this.isClipped + ", shouldHideActionButton=" + this.shouldHideActionButton + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CouponListItemDecorator(Pk.c r17, bk.AbstractC6392a r18, bk.AbstractC6392a r19, java.lang.String r20, java.lang.String r21, bk.AbstractC6392a r22, java.lang.String r23, java.lang.String r24, boolean r25, java.lang.String r26, boolean r27, boolean r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r20
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L11
            r8 = r2
            goto L13
        L11:
            r8 = r21
        L13:
            r1 = r0 & 32
            if (r1 == 0) goto L19
            r9 = r2
            goto L1b
        L19:
            r9 = r22
        L1b:
            r1 = r0 & 64
            if (r1 == 0) goto L21
            r10 = r2
            goto L23
        L21:
            r10 = r23
        L23:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L29
            r11 = r2
            goto L2b
        L29:
            r11 = r24
        L2b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r3 = 0
            if (r1 == 0) goto L32
            r12 = r3
            goto L34
        L32:
            r12 = r25
        L34:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L3a
            r13 = r2
            goto L3c
        L3a:
            r13 = r26
        L3c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L4c
            r15 = r3
            r4 = r17
            r5 = r18
            r6 = r19
            r14 = r27
            r3 = r16
            goto L58
        L4c:
            r15 = r28
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r14 = r27
        L58:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Xr.CouponListItemDecorator.<init>(Pk.c, bk.a, bk.a, java.lang.String, java.lang.String, bk.a, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
