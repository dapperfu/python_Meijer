package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import ej.HighValuePromoData;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001\u000eB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001d\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b!\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f;", "", "", "promoDesc", "Lak/a;", "expirationDate", "validThroughExpirationDate", "", "daysUntilExpired", "promoNum", "", "isChecked", "<init>", "(Ljava/lang/String;Lak/a;Lak/a;Ljava/lang/Integer;Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Lak/a;Lak/a;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lak/a;", "getExpirationDate", "()Lak/a;", "c", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "Z", "g", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class HighValuePromoOfferDecorator {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f103355h = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoDesc;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a expirationDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a validThroughExpirationDate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer daysUntilExpired;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoNum;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChecked;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f$a;", "", "<init>", "()V", "", "promptResponse", "", "b", "(Ljava/lang/String;)Z", "Lej/p;", "highValuePromo", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f;", "a", "(Lej/p;)Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final boolean b(String promptResponse) {
            return Intrinsics.e(promptResponse, "execute");
        }

        public final HighValuePromoOfferDecorator a(HighValuePromoData highValuePromo) {
            Intrinsics.j(highValuePromo, "highValuePromo");
            String promoDesc = highValuePromo.getPromoDesc();
            String str = promoDesc == null ? "" : promoDesc;
            ZonedDateTime expirationDate = highValuePromo.getExpirationDate();
            Integer num = null;
            AbstractC5607a abstractC5607aD = expirationDate != null ? AbstractC5607a.INSTANCE.d(Y.f99976b7, expirationDate.format(C17590a.f164803a.f())) : null;
            ZonedDateTime expirationDate2 = highValuePromo.getExpirationDate();
            AbstractC5607a abstractC5607aD2 = expirationDate2 != null ? AbstractC5607a.INSTANCE.d(Y.f99539E8, expirationDate2.minusDays(1L).format(C17590a.DATE_FORMAT_MM_DD_YYYY)) : null;
            ZonedDateTime expirationDate3 = highValuePromo.getExpirationDate();
            if (expirationDate3 != null) {
                Integer numValueOf = Integer.valueOf((int) ChronoUnit.DAYS.between(ZonedDateTime.now(), expirationDate3));
                if (numValueOf.intValue() >= 0) {
                    num = numValueOf;
                }
            }
            Integer num2 = num;
            boolean zB = HighValuePromoOfferDecorator.INSTANCE.b(highValuePromo.getPromptResponse());
            String promoNum = highValuePromo.getPromoNum();
            return new HighValuePromoOfferDecorator(str, abstractC5607aD, abstractC5607aD2, num2, promoNum == null ? "" : promoNum, zB);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighValuePromoOfferDecorator)) {
            return false;
        }
        HighValuePromoOfferDecorator highValuePromoOfferDecorator = (HighValuePromoOfferDecorator) other;
        return Intrinsics.e(this.promoDesc, highValuePromoOfferDecorator.promoDesc) && Intrinsics.e(this.expirationDate, highValuePromoOfferDecorator.expirationDate) && Intrinsics.e(this.validThroughExpirationDate, highValuePromoOfferDecorator.validThroughExpirationDate) && Intrinsics.e(this.daysUntilExpired, highValuePromoOfferDecorator.daysUntilExpired) && Intrinsics.e(this.promoNum, highValuePromoOfferDecorator.promoNum) && this.isChecked == highValuePromoOfferDecorator.isChecked;
    }

    public int hashCode() {
        int iHashCode = this.promoDesc.hashCode() * 31;
        AbstractC5607a abstractC5607a = this.expirationDate;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.validThroughExpirationDate;
        int iHashCode3 = (iHashCode2 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
        Integer num = this.daysUntilExpired;
        return ((((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.promoNum.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
    }

    public String toString() {
        return "HighValuePromoOfferDecorator(promoDesc=" + this.promoDesc + ", expirationDate=" + this.expirationDate + ", validThroughExpirationDate=" + this.validThroughExpirationDate + ", daysUntilExpired=" + this.daysUntilExpired + ", promoNum=" + this.promoNum + ", isChecked=" + this.isChecked + ')';
    }

    public HighValuePromoOfferDecorator(String promoDesc, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Integer num, String promoNum, boolean z10) {
        Intrinsics.j(promoDesc, "promoDesc");
        Intrinsics.j(promoNum, "promoNum");
        this.promoDesc = promoDesc;
        this.expirationDate = abstractC5607a;
        this.validThroughExpirationDate = abstractC5607a2;
        this.daysUntilExpired = num;
        this.promoNum = promoNum;
        this.isChecked = z10;
    }

    public static /* synthetic */ HighValuePromoOfferDecorator b(HighValuePromoOfferDecorator highValuePromoOfferDecorator, String str, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Integer num, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = highValuePromoOfferDecorator.promoDesc;
        }
        if ((i10 & 2) != 0) {
            abstractC5607a = highValuePromoOfferDecorator.expirationDate;
        }
        if ((i10 & 4) != 0) {
            abstractC5607a2 = highValuePromoOfferDecorator.validThroughExpirationDate;
        }
        if ((i10 & 8) != 0) {
            num = highValuePromoOfferDecorator.daysUntilExpired;
        }
        if ((i10 & 16) != 0) {
            str2 = highValuePromoOfferDecorator.promoNum;
        }
        if ((i10 & 32) != 0) {
            z10 = highValuePromoOfferDecorator.isChecked;
        }
        String str3 = str2;
        boolean z11 = z10;
        return highValuePromoOfferDecorator.a(str, abstractC5607a, abstractC5607a2, num, str3, z11);
    }

    public final HighValuePromoOfferDecorator a(String promoDesc, AbstractC5607a expirationDate, AbstractC5607a validThroughExpirationDate, Integer daysUntilExpired, String promoNum, boolean isChecked) {
        Intrinsics.j(promoDesc, "promoDesc");
        Intrinsics.j(promoNum, "promoNum");
        return new HighValuePromoOfferDecorator(promoDesc, expirationDate, validThroughExpirationDate, daysUntilExpired, promoNum, isChecked);
    }

    /* renamed from: c, reason: from getter */
    public final Integer getDaysUntilExpired() {
        return this.daysUntilExpired;
    }

    /* renamed from: d, reason: from getter */
    public final String getPromoDesc() {
        return this.promoDesc;
    }

    /* renamed from: e, reason: from getter */
    public final String getPromoNum() {
        return this.promoNum;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC5607a getValidThroughExpirationDate() {
        return this.validThroughExpirationDate;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }
}
