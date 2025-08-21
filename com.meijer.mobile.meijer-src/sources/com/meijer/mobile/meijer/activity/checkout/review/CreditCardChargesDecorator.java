package com.meijer.mobile.meijer.activity.checkout.review;

import Ik.Validation;
import Ki.C;
import bk.AbstractC6392a;
import fj.CardType;
import hk.PaymentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0001\u0017BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b!\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u0019R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b\"\u0010\u0019¨\u0006&"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "", "Lbk/a;", "amountToChargeCard", "", "amountToChargeValue", "cardType", "LKi/C$g;", "cardIcon", "ebtNote", "preAuthAmount", "<init>", "(Lbk/a;DLbk/a;LKi/C$g;Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "b", "D", "()D", "c", "d", "LKi/C$g;", "()LKi/C$g;", "e", "f", "g", "formattedCreditCardDescription", "h", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.L1, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class CreditCardChargesDecorator {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f105408i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a amountToChargeCard;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double amountToChargeValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a cardType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final C.g cardIcon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a ebtNote;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a preAuthAmount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a formattedCreditCardDescription;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/L1$a;", "", "<init>", "()V", "LIk/b;", "Lhk/f;", "validation", "Lnk/b;", "amountToChargeCard", "", "displayEbtNote", "", "preAuthAmount", "Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "a", "(LIk/b;Lnk/b;ZLjava/lang/Double;)Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "Lfj/d;", "cardType", "b", "(Lfj/d;Lnk/b;Z)Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.L1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CreditCardChargesDecorator a(Validation<PaymentOption> validation, nk.b amountToChargeCard, boolean displayEbtNote, Double preAuthAmount) {
            Intrinsics.j(validation, "validation");
            Intrinsics.j(amountToChargeCard, "amountToChargeCard");
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            AbstractC6392a abstractC6392aD = companion.d(com.meijer.mobile.meijer.Y.f100384Dc, Gk.g.c(amountToChargeCard.getValue()));
            double value = amountToChargeCard.getValue();
            AbstractC6392a abstractC6392aD2 = companion.d(com.meijer.mobile.meijer.Y.f100736W1, new Object[0]);
            PaymentOption paymentOptionE = validation.e();
            return new CreditCardChargesDecorator(abstractC6392aD, value, abstractC6392aD2, T1.c(paymentOptionE != null ? paymentOptionE.getCardType() : null), displayEbtNote ? companion.d(com.meijer.mobile.meijer.Y.f100755X1, new Object[0]) : null, preAuthAmount != null ? companion.d(com.meijer.mobile.meijer.Y.f100384Dc, Gk.g.c(preAuthAmount.doubleValue())) : null);
        }

        public final CreditCardChargesDecorator b(CardType cardType, nk.b amountToChargeCard, boolean displayEbtNote) {
            Intrinsics.j(amountToChargeCard, "amountToChargeCard");
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return new CreditCardChargesDecorator(companion.d(com.meijer.mobile.meijer.Y.f100384Dc, Gk.g.c(amountToChargeCard.getValue())), amountToChargeCard.getValue(), companion.d(com.meijer.mobile.meijer.Y.f100736W1, new Object[0]), T1.b(cardType), displayEbtNote ? companion.d(com.meijer.mobile.meijer.Y.f100755X1, new Object[0]) : null, null, 32, null);
        }
    }

    static {
        int i10 = AbstractC6392a.f60445b;
        f105408i = i10 | C.g.f17069d | i10 | i10;
    }

    public CreditCardChargesDecorator() {
        this(null, 0.0d, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditCardChargesDecorator)) {
            return false;
        }
        CreditCardChargesDecorator creditCardChargesDecorator = (CreditCardChargesDecorator) other;
        return Intrinsics.e(this.amountToChargeCard, creditCardChargesDecorator.amountToChargeCard) && Double.compare(this.amountToChargeValue, creditCardChargesDecorator.amountToChargeValue) == 0 && Intrinsics.e(this.cardType, creditCardChargesDecorator.cardType) && Intrinsics.e(this.cardIcon, creditCardChargesDecorator.cardIcon) && Intrinsics.e(this.ebtNote, creditCardChargesDecorator.ebtNote) && Intrinsics.e(this.preAuthAmount, creditCardChargesDecorator.preAuthAmount);
    }

    public int hashCode() {
        AbstractC6392a abstractC6392a = this.amountToChargeCard;
        int iHashCode = (((abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31) + Double.hashCode(this.amountToChargeValue)) * 31;
        AbstractC6392a abstractC6392a2 = this.cardType;
        int iHashCode2 = (iHashCode + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        C.g gVar = this.cardIcon;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        AbstractC6392a abstractC6392a3 = this.ebtNote;
        int iHashCode4 = (iHashCode3 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31;
        AbstractC6392a abstractC6392a4 = this.preAuthAmount;
        return iHashCode4 + (abstractC6392a4 != null ? abstractC6392a4.hashCode() : 0);
    }

    public String toString() {
        return "CreditCardChargesDecorator(amountToChargeCard=" + this.amountToChargeCard + ", amountToChargeValue=" + this.amountToChargeValue + ", cardType=" + this.cardType + ", cardIcon=" + this.cardIcon + ", ebtNote=" + this.ebtNote + ", preAuthAmount=" + this.preAuthAmount + ')';
    }

    public CreditCardChargesDecorator(AbstractC6392a abstractC6392a, double d10, AbstractC6392a abstractC6392a2, C.g gVar, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4) {
        this.amountToChargeCard = abstractC6392a;
        this.amountToChargeValue = d10;
        this.cardType = abstractC6392a2;
        this.cardIcon = gVar;
        this.ebtNote = abstractC6392a3;
        this.preAuthAmount = abstractC6392a4;
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        this.formattedCreditCardDescription = companion.d(com.meijer.mobile.meijer.Y.f100793Z1, T1.a(gVar), companion.d(com.meijer.mobile.meijer.Y.f100495J7, new Object[0]));
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getAmountToChargeCard() {
        return this.amountToChargeCard;
    }

    /* renamed from: b, reason: from getter */
    public final double getAmountToChargeValue() {
        return this.amountToChargeValue;
    }

    /* renamed from: c, reason: from getter */
    public final C.g getCardIcon() {
        return this.cardIcon;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getCardType() {
        return this.cardType;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getEbtNote() {
        return this.ebtNote;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC6392a getFormattedCreditCardDescription() {
        return this.formattedCreditCardDescription;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC6392a getPreAuthAmount() {
        return this.preAuthAmount;
    }

    public /* synthetic */ CreditCardChargesDecorator(AbstractC6392a abstractC6392a, double d10, AbstractC6392a abstractC6392a2, C.g gVar, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC6392a, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? null : abstractC6392a2, (i10 & 8) != 0 ? null : gVar, (i10 & 16) != 0 ? null : abstractC6392a3, (i10 & 32) != 0 ? null : abstractC6392a4);
    }
}
