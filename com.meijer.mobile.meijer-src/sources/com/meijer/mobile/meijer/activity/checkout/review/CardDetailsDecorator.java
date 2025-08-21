package com.meijer.mobile.meijer.activity.checkout.review;

import Ik.Validation;
import bk.AbstractC6392a;
import hk.PaymentOption;
import io.constructor.data.local.PreferencesHelper;
import j$.time.YearMonth;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/q;", "", "", PreferencesHelper.PREF_ID, "Lbk/a;", "description", "expiration", "error", "<init>", "(Ljava/lang/String;Lbk/a;Lbk/a;Lbk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lbk/a;", "()Lbk/a;", "c", "d", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.q, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class CardDetailsDecorator {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f105864f = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a expiration;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a error;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/q$a;", "", "<init>", "()V", "LIk/b;", "Lhk/f;", "validation", "Lcom/meijer/mobile/meijer/activity/checkout/review/q;", "a", "(LIk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/q;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.q$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CardDetailsDecorator a(Validation<PaymentOption> validation) {
            AbstractC6392a abstractC6392aD;
            YearMonth expiryDate;
            String brand;
            Intrinsics.j(validation, "validation");
            PaymentOption paymentOptionE = validation.e();
            AbstractC6392a abstractC6392a = null;
            String id2 = paymentOptionE != null ? paymentOptionE.getId() : null;
            PaymentOption paymentOptionE2 = validation.e();
            if (paymentOptionE2 != null) {
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                int i10 = com.meijer.mobile.meijer.Y.f100702U5;
                hk.h cardType = paymentOptionE2.getCardType();
                if (cardType == null || (brand = cardType.getBrand()) == null) {
                    brand = "Card";
                }
                String cardNumber = paymentOptionE2.getCardNumber();
                if (cardNumber == null) {
                    cardNumber = "";
                }
                abstractC6392aD = companion.d(i10, brand, cardNumber);
            } else {
                abstractC6392aD = null;
            }
            PaymentOption paymentOptionE3 = validation.e();
            AbstractC6392a abstractC6392aD2 = (paymentOptionE3 == null || (expiryDate = paymentOptionE3.getExpiryDate()) == null) ? null : AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100721V5, expiryDate.format(C17898a.NUMERIC_MONTH_YEAR_FULL));
            AbstractC6392a abstractC6392aD3 = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100612Pa, new Object[0]);
            List<Ik.c> listA = validation.getResult().a();
            if (listA != null && !listA.isEmpty()) {
                abstractC6392a = abstractC6392aD3;
            }
            return new CardDetailsDecorator(id2, abstractC6392aD, abstractC6392aD2, abstractC6392a);
        }
    }

    public CardDetailsDecorator() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetailsDecorator)) {
            return false;
        }
        CardDetailsDecorator cardDetailsDecorator = (CardDetailsDecorator) other;
        return Intrinsics.e(this.id, cardDetailsDecorator.id) && Intrinsics.e(this.description, cardDetailsDecorator.description) && Intrinsics.e(this.expiration, cardDetailsDecorator.expiration) && Intrinsics.e(this.error, cardDetailsDecorator.error);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.description;
        int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
        AbstractC6392a abstractC6392a2 = this.expiration;
        int iHashCode3 = (iHashCode2 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        AbstractC6392a abstractC6392a3 = this.error;
        return iHashCode3 + (abstractC6392a3 != null ? abstractC6392a3.hashCode() : 0);
    }

    public String toString() {
        return "CardDetailsDecorator(id=" + this.id + ", description=" + this.description + ", expiration=" + this.expiration + ", error=" + this.error + ')';
    }

    public CardDetailsDecorator(String str, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3) {
        this.id = str;
        this.description = abstractC6392a;
        this.expiration = abstractC6392a2;
        this.error = abstractC6392a3;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getExpiration() {
        return this.expiration;
    }

    public /* synthetic */ CardDetailsDecorator(String str, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : abstractC6392a, (i10 & 4) != 0 ? null : abstractC6392a2, (i10 & 8) != 0 ? null : abstractC6392a3);
    }
}
