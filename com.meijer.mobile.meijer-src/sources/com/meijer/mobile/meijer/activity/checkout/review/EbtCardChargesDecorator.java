package com.meijer.mobile.meijer.activity.checkout.review;

import Ik.Validation;
import Ki.C;
import bk.AbstractC6392a;
import hk.EbtPaymentOption;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0015B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "", "Lbk/a;", "amountToChargeCard", "cardType", "LKi/C$g;", "cardIcon", "adjustAmount", "availableBalance", "<init>", "(Lbk/a;Lbk/a;LKi/C$g;Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "b", "()Lbk/a;", "e", "c", "LKi/C$g;", "d", "()LKi/C$g;", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.N1, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class EbtCardChargesDecorator {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f105430g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a amountToChargeCard;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a cardType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final C.g cardIcon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a adjustAmount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a availableBalance;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/N1$a;", "", "<init>", "()V", "LIk/b;", "Lhk/d;", "validation", "Lnk/b;", "amountToChargeCard", "Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "a", "(LIk/b;Lnk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "", "b", "(D)Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.N1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EbtCardChargesDecorator a(Validation<EbtPaymentOption> validation, nk.b amountToChargeCard) {
            Intrinsics.j(validation, "validation");
            Intrinsics.j(amountToChargeCard, "amountToChargeCard");
            EbtPaymentOption ebtPaymentOptionE = validation.e();
            if (ebtPaymentOptionE == null) {
                return null;
            }
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return new EbtCardChargesDecorator(companion.d(com.meijer.mobile.meijer.Y.f100384Dc, Gk.g.c(amountToChargeCard.getValue())), null, null, companion.d(com.meijer.mobile.meijer.Y.f100415F3, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100434G3, LocalDateTime.now().format(C17898a.f167225a.f()).toString(), Gk.g.c(Double.parseDouble(ebtPaymentOptionE.getEbtBalance()))), 6, null);
        }

        public final EbtCardChargesDecorator b(double amountToChargeCard) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return new EbtCardChargesDecorator(companion.d(com.meijer.mobile.meijer.Y.f100384Dc, Gk.g.c(amountToChargeCard)), null, null, companion.d(com.meijer.mobile.meijer.Y.f100415F3, new Object[0]), null, 6, null);
        }
    }

    static {
        int i10 = AbstractC6392a.f60445b;
        f105430g = i10 | C.g.f17069d | i10 | i10;
    }

    public EbtCardChargesDecorator() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbtCardChargesDecorator)) {
            return false;
        }
        EbtCardChargesDecorator ebtCardChargesDecorator = (EbtCardChargesDecorator) other;
        return Intrinsics.e(this.amountToChargeCard, ebtCardChargesDecorator.amountToChargeCard) && Intrinsics.e(this.cardType, ebtCardChargesDecorator.cardType) && Intrinsics.e(this.cardIcon, ebtCardChargesDecorator.cardIcon) && Intrinsics.e(this.adjustAmount, ebtCardChargesDecorator.adjustAmount) && Intrinsics.e(this.availableBalance, ebtCardChargesDecorator.availableBalance);
    }

    public int hashCode() {
        AbstractC6392a abstractC6392a = this.amountToChargeCard;
        int iHashCode = (((((abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31) + this.cardType.hashCode()) * 31) + this.cardIcon.hashCode()) * 31;
        AbstractC6392a abstractC6392a2 = this.adjustAmount;
        int iHashCode2 = (iHashCode + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        AbstractC6392a abstractC6392a3 = this.availableBalance;
        return iHashCode2 + (abstractC6392a3 != null ? abstractC6392a3.hashCode() : 0);
    }

    public String toString() {
        return "EbtCardChargesDecorator(amountToChargeCard=" + this.amountToChargeCard + ", cardType=" + this.cardType + ", cardIcon=" + this.cardIcon + ", adjustAmount=" + this.adjustAmount + ", availableBalance=" + this.availableBalance + ')';
    }

    public EbtCardChargesDecorator(AbstractC6392a abstractC6392a, AbstractC6392a cardType, C.g cardIcon, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3) {
        Intrinsics.j(cardType, "cardType");
        Intrinsics.j(cardIcon, "cardIcon");
        this.amountToChargeCard = abstractC6392a;
        this.cardType = cardType;
        this.cardIcon = cardIcon;
        this.adjustAmount = abstractC6392a2;
        this.availableBalance = abstractC6392a3;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getAdjustAmount() {
        return this.adjustAmount;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getAmountToChargeCard() {
        return this.amountToChargeCard;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getAvailableBalance() {
        return this.availableBalance;
    }

    /* renamed from: d, reason: from getter */
    public final C.g getCardIcon() {
        return this.cardIcon;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getCardType() {
        return this.cardType;
    }

    public /* synthetic */ EbtCardChargesDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, C.g gVar, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC6392a, (i10 & 2) != 0 ? AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100548M3, new Object[0]) : abstractC6392a2, (i10 & 4) != 0 ? C.g.f.f17076e : gVar, (i10 & 8) != 0 ? null : abstractC6392a3, (i10 & 16) != 0 ? null : abstractC6392a4);
    }
}
