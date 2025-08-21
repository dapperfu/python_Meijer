package com.meijer.mobile.meijer.activity.checkout.review;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001\u0018Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010¨\u0006'"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "", "Lbk/a;", "eligibleEbtItemTotal", "", "maxEbtPaymentAllowed", "ebtApprovedAmount", "initialEbtPaymentAmount", "maxEbtAmountErrorMessage", "minEbtAmountErrorMessage", "currentEbtCardBalance", "", "ebtApprovedPrice", "<init>", "(Lbk/a;Ljava/lang/Double;Lbk/a;Ljava/lang/Double;Lbk/a;Lbk/a;Lbk/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "c", "()Lbk/a;", "b", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "d", "e", "g", "h", "Ljava/lang/String;", "getEbtApprovedPrice", "i", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.p, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class AdjustEbtPaymentDecorator {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f105851j = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a eligibleEbtItemTotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double maxEbtPaymentAllowed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a ebtApprovedAmount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double initialEbtPaymentAmount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a maxEbtAmountErrorMessage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a minEbtAmountErrorMessage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a currentEbtCardBalance;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ebtApprovedPrice;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/p$a;", "", "<init>", "()V", "Lnk/b;", "ebtEligibleItemTotal", "ebtApprovedAmount", "", "currentEbtCardBalance", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "a", "(Lnk/b;Lnk/b;Ljava/lang/Double;)Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.p$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator a(nk.b r13, nk.b r14, java.lang.Double r15) {
            /*
                r12 = this;
                java.lang.String r0 = "ebtEligibleItemTotal"
                kotlin.jvm.internal.Intrinsics.j(r13, r0)
                if (r14 == 0) goto L93
                bk.a$a r0 = bk.AbstractC6392a.INSTANCE
                int r1 = com.meijer.mobile.meijer.Y.f100384Dc
                double r2 = r13.getValue()
                java.lang.String r2 = Gk.g.c(r2)
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                bk.a r4 = r0.d(r1, r2)
                double r1 = r13.getValue()
                java.lang.Double r5 = java.lang.Double.valueOf(r1)
                int r1 = com.meijer.mobile.meijer.Y.f100384Dc
                double r2 = r14.getValue()
                java.lang.String r2 = Gk.g.c(r2)
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                bk.a r6 = r0.d(r1, r2)
                double r1 = r14.getValue()
                java.lang.Double r7 = java.lang.Double.valueOf(r1)
                int r1 = com.meijer.mobile.meijer.Y.f100644R4
                double r2 = r13.getValue()
                java.lang.String r13 = Gk.g.c(r2)
                java.lang.Object[] r13 = new java.lang.Object[]{r13}
                bk.a r8 = r0.d(r1, r13)
                int r13 = com.meijer.mobile.meijer.Y.f100663S4
                r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                java.lang.String r1 = Gk.g.c(r1)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                bk.a r9 = r0.d(r13, r1)
                if (r15 == 0) goto L7b
                double r1 = r15.doubleValue()
                int r13 = com.meijer.mobile.meijer.Y.f100384Dc
                java.lang.String r15 = Gk.g.c(r1)
                java.lang.Object[] r15 = new java.lang.Object[]{r15}
                bk.a r13 = r0.d(r13, r15)
                if (r13 != 0) goto L79
                goto L7b
            L79:
                r10 = r13
                goto L85
            L7b:
                int r13 = com.meijer.mobile.meijer.Y.f100758X4
                r15 = 0
                java.lang.Object[] r15 = new java.lang.Object[r15]
                bk.a r13 = r0.d(r13, r15)
                goto L79
            L85:
                double r13 = r14.getValue()
                java.lang.String r11 = java.lang.String.valueOf(r13)
                com.meijer.mobile.meijer.activity.checkout.review.p r3 = new com.meijer.mobile.meijer.activity.checkout.review.p
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return r3
            L93:
                r13 = 0
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator.Companion.a(nk.b, nk.b, java.lang.Double):com.meijer.mobile.meijer.activity.checkout.review.p");
        }
    }

    public AdjustEbtPaymentDecorator(AbstractC6392a abstractC6392a, Double d10, AbstractC6392a abstractC6392a2, Double d11, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, AbstractC6392a currentEbtCardBalance, String str) {
        Intrinsics.j(currentEbtCardBalance, "currentEbtCardBalance");
        this.eligibleEbtItemTotal = abstractC6392a;
        this.maxEbtPaymentAllowed = d10;
        this.ebtApprovedAmount = abstractC6392a2;
        this.initialEbtPaymentAmount = d11;
        this.maxEbtAmountErrorMessage = abstractC6392a3;
        this.minEbtAmountErrorMessage = abstractC6392a4;
        this.currentEbtCardBalance = currentEbtCardBalance;
        this.ebtApprovedPrice = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdjustEbtPaymentDecorator)) {
            return false;
        }
        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = (AdjustEbtPaymentDecorator) other;
        return Intrinsics.e(this.eligibleEbtItemTotal, adjustEbtPaymentDecorator.eligibleEbtItemTotal) && Intrinsics.e(this.maxEbtPaymentAllowed, adjustEbtPaymentDecorator.maxEbtPaymentAllowed) && Intrinsics.e(this.ebtApprovedAmount, adjustEbtPaymentDecorator.ebtApprovedAmount) && Intrinsics.e(this.initialEbtPaymentAmount, adjustEbtPaymentDecorator.initialEbtPaymentAmount) && Intrinsics.e(this.maxEbtAmountErrorMessage, adjustEbtPaymentDecorator.maxEbtAmountErrorMessage) && Intrinsics.e(this.minEbtAmountErrorMessage, adjustEbtPaymentDecorator.minEbtAmountErrorMessage) && Intrinsics.e(this.currentEbtCardBalance, adjustEbtPaymentDecorator.currentEbtCardBalance) && Intrinsics.e(this.ebtApprovedPrice, adjustEbtPaymentDecorator.ebtApprovedPrice);
    }

    public int hashCode() {
        AbstractC6392a abstractC6392a = this.eligibleEbtItemTotal;
        int iHashCode = (abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31;
        Double d10 = this.maxEbtPaymentAllowed;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        AbstractC6392a abstractC6392a2 = this.ebtApprovedAmount;
        int iHashCode3 = (iHashCode2 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        Double d11 = this.initialEbtPaymentAmount;
        int iHashCode4 = (iHashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        AbstractC6392a abstractC6392a3 = this.maxEbtAmountErrorMessage;
        int iHashCode5 = (iHashCode4 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31;
        AbstractC6392a abstractC6392a4 = this.minEbtAmountErrorMessage;
        int iHashCode6 = (((iHashCode5 + (abstractC6392a4 == null ? 0 : abstractC6392a4.hashCode())) * 31) + this.currentEbtCardBalance.hashCode()) * 31;
        String str = this.ebtApprovedPrice;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AdjustEbtPaymentDecorator(eligibleEbtItemTotal=" + this.eligibleEbtItemTotal + ", maxEbtPaymentAllowed=" + this.maxEbtPaymentAllowed + ", ebtApprovedAmount=" + this.ebtApprovedAmount + ", initialEbtPaymentAmount=" + this.initialEbtPaymentAmount + ", maxEbtAmountErrorMessage=" + this.maxEbtAmountErrorMessage + ", minEbtAmountErrorMessage=" + this.minEbtAmountErrorMessage + ", currentEbtCardBalance=" + this.currentEbtCardBalance + ", ebtApprovedPrice=" + this.ebtApprovedPrice + ')';
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getCurrentEbtCardBalance() {
        return this.currentEbtCardBalance;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getEbtApprovedAmount() {
        return this.ebtApprovedAmount;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getEligibleEbtItemTotal() {
        return this.eligibleEbtItemTotal;
    }

    /* renamed from: d, reason: from getter */
    public final Double getInitialEbtPaymentAmount() {
        return this.initialEbtPaymentAmount;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getMaxEbtAmountErrorMessage() {
        return this.maxEbtAmountErrorMessage;
    }

    /* renamed from: f, reason: from getter */
    public final Double getMaxEbtPaymentAllowed() {
        return this.maxEbtPaymentAllowed;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC6392a getMinEbtAmountErrorMessage() {
        return this.minEbtAmountErrorMessage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdjustEbtPaymentDecorator(AbstractC6392a abstractC6392a, Double d10, AbstractC6392a abstractC6392a2, Double d11, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, AbstractC6392a abstractC6392a5, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        AbstractC6392a abstractC6392a6;
        AbstractC6392a abstractC6392a7;
        abstractC6392a = (i10 & 1) != 0 ? null : abstractC6392a;
        d10 = (i10 & 2) != 0 ? null : d10;
        abstractC6392a2 = (i10 & 4) != 0 ? null : abstractC6392a2;
        d11 = (i10 & 8) != 0 ? null : d11;
        abstractC6392a3 = (i10 & 16) != 0 ? null : abstractC6392a3;
        if ((i10 & 32) != 0) {
            str2 = str;
            abstractC6392a6 = abstractC6392a5;
            abstractC6392a7 = null;
        } else {
            str2 = str;
            abstractC6392a6 = abstractC6392a5;
            abstractC6392a7 = abstractC6392a4;
        }
        this(abstractC6392a, d10, abstractC6392a2, d11, abstractC6392a3, abstractC6392a7, abstractC6392a6, str2);
    }
}
