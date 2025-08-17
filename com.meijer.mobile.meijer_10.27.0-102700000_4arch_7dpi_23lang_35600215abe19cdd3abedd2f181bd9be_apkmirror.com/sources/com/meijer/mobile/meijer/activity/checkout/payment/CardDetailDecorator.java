package com.meijer.mobile.meijer.activity.checkout.payment;

import Ji.C;
import ak.AbstractC5607a;
import com.meijer.mobile.meijer.activity.checkout.review.T1;
import gk.CardHolderName;
import gk.PaymentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/a;", "", "LJi/C$g;", "cardIcon", "Lak/a;", "cardNumber", "", "cardHolderName", "cardType", "<init>", "(LJi/C$g;Lak/a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/C$g;", "b", "()LJi/C$g;", "Lak/a;", "c", "()Lak/a;", "Ljava/lang/String;", "d", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CardDetailDecorator {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f103863f = AbstractC5607a.f45514b | C.g.f15525d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C.g cardIcon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a cardNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardHolderName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardType;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/a$a;", "", "<init>", "()V", "Lgk/f;", "paymentOption", "Lcom/meijer/mobile/meijer/activity/checkout/payment/a;", "a", "(Lgk/f;)Lcom/meijer/mobile/meijer/activity/checkout/payment/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CardDetailDecorator a(PaymentOption paymentOption) {
            String cardNumber;
            gk.h cardType;
            CardHolderName accountHolderName;
            String brand = null;
            C.g gVarC = T1.c(paymentOption != null ? paymentOption.getCardType() : null);
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i10 = com.meijer.mobile.meijer.Y.f99954a5;
            if (paymentOption == null || (cardNumber = paymentOption.getCardNumber()) == null) {
                cardNumber = "XXXX";
            }
            AbstractC5607a abstractC5607aD = companion.d(i10, cardNumber);
            String fullName = (paymentOption == null || (accountHolderName = paymentOption.getAccountHolderName()) == null) ? null : accountHolderName.getFullName();
            if (fullName == null) {
                fullName = "";
            }
            if (paymentOption != null && (cardType = paymentOption.getCardType()) != null) {
                brand = cardType.getBrand();
            }
            return new CardDetailDecorator(gVarC, abstractC5607aD, fullName, brand != null ? brand : "");
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetailDecorator)) {
            return false;
        }
        CardDetailDecorator cardDetailDecorator = (CardDetailDecorator) other;
        return Intrinsics.e(this.cardIcon, cardDetailDecorator.cardIcon) && Intrinsics.e(this.cardNumber, cardDetailDecorator.cardNumber) && Intrinsics.e(this.cardHolderName, cardDetailDecorator.cardHolderName) && Intrinsics.e(this.cardType, cardDetailDecorator.cardType);
    }

    public int hashCode() {
        return (((((this.cardIcon.hashCode() * 31) + this.cardNumber.hashCode()) * 31) + this.cardHolderName.hashCode()) * 31) + this.cardType.hashCode();
    }

    public String toString() {
        return "CardDetailDecorator(cardIcon=" + this.cardIcon + ", cardNumber=" + this.cardNumber + ", cardHolderName=" + this.cardHolderName + ", cardType=" + this.cardType + ')';
    }

    public CardDetailDecorator(C.g cardIcon, AbstractC5607a cardNumber, String cardHolderName, String cardType) {
        Intrinsics.j(cardIcon, "cardIcon");
        Intrinsics.j(cardNumber, "cardNumber");
        Intrinsics.j(cardHolderName, "cardHolderName");
        Intrinsics.j(cardType, "cardType");
        this.cardIcon = cardIcon;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
    }

    /* renamed from: a, reason: from getter */
    public final String getCardHolderName() {
        return this.cardHolderName;
    }

    /* renamed from: b, reason: from getter */
    public final C.g getCardIcon() {
        return this.cardIcon;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: d, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }
}
