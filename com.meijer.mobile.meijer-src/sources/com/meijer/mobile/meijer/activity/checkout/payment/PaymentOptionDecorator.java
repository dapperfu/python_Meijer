package com.meijer.mobile.meijer.activity.checkout.payment;

import Ik.Validation;
import Ik.c;
import bk.AbstractC6392a;
import hk.PaymentOption;
import io.constructor.data.local.PreferencesHelper;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 62\u00020\u0001:\u0001\u0014Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J~\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b*\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u0017R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b+\u0010\u0019R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b$\u00102R\u0013\u00105\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b&\u00104¨\u00067"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "", "", PreferencesHelper.PREF_ID, "", "isPrimary", "authToken", "isExpired", "j$/time/YearMonth", "expirationDate", "isSelected", "cardCVV", "", "validCvvLength", "", "errors", "Lcom/meijer/mobile/meijer/activity/checkout/payment/a;", "cardDetailDecorator", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ZLj$/time/YearMonth;ZLjava/lang/String;ILjava/util/List;Lcom/meijer/mobile/meijer/activity/checkout/payment/a;)V", "a", "(Ljava/lang/String;ZLjava/lang/String;ZLj$/time/YearMonth;ZLjava/lang/String;ILjava/util/List;Lcom/meijer/mobile/meijer/activity/checkout/payment/a;)Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Z", "i", "()Z", "c", "d", "h", "e", "Lj$/time/YearMonth;", "getExpirationDate", "()Lj$/time/YearMonth;", "j", "g", "getCardCVV", "I", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/a;", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/a;", "Lbk/a;", "()Lbk/a;", "expirationDisplayDate", "k", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.q0, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class PaymentOptionDecorator {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f104917l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimary;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authToken;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isExpired;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final YearMonth expirationDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardCVV;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int validCvvLength;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> errors;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardDetailDecorator cardDetailDecorator;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/q0$a;", "", "<init>", "()V", "LIk/b;", "Lhk/f;", "validation", "", "isSelected", "j$/time/YearMonth", "now", "Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "a", "(LIk/b;ZLj$/time/YearMonth;)Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.q0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ PaymentOptionDecorator b(Companion companion, Validation validation, boolean z10, YearMonth yearMonth, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                yearMonth = YearMonth.now();
            }
            return companion.a(validation, z10, yearMonth);
        }

        public final PaymentOptionDecorator a(Validation<? extends PaymentOption> validation, boolean isSelected, YearMonth now) {
            String id2;
            YearMonth yearMonthMinusMonths;
            hk.h cardType;
            Intrinsics.j(validation, "validation");
            Intrinsics.j(now, "now");
            PaymentOption paymentOptionE = validation.e();
            if (paymentOptionE == null || (id2 = paymentOptionE.getId()) == null) {
                id2 = "-1";
            }
            String str = id2;
            PaymentOption paymentOptionE2 = validation.e();
            Boolean boolValueOf = paymentOptionE2 != null ? Boolean.valueOf(paymentOptionE2.getDefaultPayment()) : null;
            Intrinsics.g(boolValueOf);
            boolean zBooleanValue = boolValueOf.booleanValue();
            PaymentOption paymentOptionE3 = validation.e();
            String authToken = paymentOptionE3 != null ? paymentOptionE3.getAuthToken() : null;
            PaymentOption paymentOptionE4 = validation.e();
            Boolean boolValueOf2 = paymentOptionE4 != null ? Boolean.valueOf(paymentOptionE4.o(now)) : null;
            Intrinsics.g(boolValueOf2);
            boolean zBooleanValue2 = boolValueOf2.booleanValue();
            PaymentOption paymentOptionE5 = validation.e();
            if (paymentOptionE5 == null || (yearMonthMinusMonths = paymentOptionE5.getExpiryDate()) == null) {
                yearMonthMinusMonths = now.minusMonths(1L);
            }
            YearMonth yearMonth = yearMonthMinusMonths;
            Intrinsics.g(yearMonth);
            PaymentOption paymentOptionE6 = validation.e();
            String cardCvNumber = paymentOptionE6 != null ? paymentOptionE6.getCardCvNumber() : null;
            PaymentOption paymentOptionE7 = validation.e();
            int validCvvLength = (paymentOptionE7 == null || (cardType = paymentOptionE7.getCardType()) == null) ? 3 : cardType.getValidCvvLength();
            List<Ik.c> listA = validation.getResult().a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (!(((Ik.c) obj) instanceof c.Pending)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Ik.c) it.next()).getMessage());
            }
            return new PaymentOptionDecorator(str, zBooleanValue, authToken, zBooleanValue2, yearMonth, isSelected, cardCvNumber, validCvvLength, arrayList2, CardDetailDecorator.INSTANCE.a(validation.e()));
        }
    }

    public static /* synthetic */ PaymentOptionDecorator b(PaymentOptionDecorator paymentOptionDecorator, String str, boolean z10, String str2, boolean z11, YearMonth yearMonth, boolean z12, String str3, int i10, List list, CardDetailDecorator cardDetailDecorator, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paymentOptionDecorator.id;
        }
        if ((i11 & 2) != 0) {
            z10 = paymentOptionDecorator.isPrimary;
        }
        if ((i11 & 4) != 0) {
            str2 = paymentOptionDecorator.authToken;
        }
        if ((i11 & 8) != 0) {
            z11 = paymentOptionDecorator.isExpired;
        }
        if ((i11 & 16) != 0) {
            yearMonth = paymentOptionDecorator.expirationDate;
        }
        if ((i11 & 32) != 0) {
            z12 = paymentOptionDecorator.isSelected;
        }
        if ((i11 & 64) != 0) {
            str3 = paymentOptionDecorator.cardCVV;
        }
        if ((i11 & 128) != 0) {
            i10 = paymentOptionDecorator.validCvvLength;
        }
        if ((i11 & 256) != 0) {
            list = paymentOptionDecorator.errors;
        }
        if ((i11 & 512) != 0) {
            cardDetailDecorator = paymentOptionDecorator.cardDetailDecorator;
        }
        List list2 = list;
        CardDetailDecorator cardDetailDecorator2 = cardDetailDecorator;
        String str4 = str3;
        int i12 = i10;
        YearMonth yearMonth2 = yearMonth;
        boolean z13 = z12;
        return paymentOptionDecorator.a(str, z10, str2, z11, yearMonth2, z13, str4, i12, list2, cardDetailDecorator2);
    }

    public final PaymentOptionDecorator a(String id2, boolean isPrimary, String authToken, boolean isExpired, YearMonth expirationDate, boolean isSelected, String cardCVV, int validCvvLength, List<String> errors, CardDetailDecorator cardDetailDecorator) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(expirationDate, "expirationDate");
        Intrinsics.j(errors, "errors");
        Intrinsics.j(cardDetailDecorator, "cardDetailDecorator");
        return new PaymentOptionDecorator(id2, isPrimary, authToken, isExpired, expirationDate, isSelected, cardCVV, validCvvLength, errors, cardDetailDecorator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOptionDecorator)) {
            return false;
        }
        PaymentOptionDecorator paymentOptionDecorator = (PaymentOptionDecorator) other;
        return Intrinsics.e(this.id, paymentOptionDecorator.id) && this.isPrimary == paymentOptionDecorator.isPrimary && Intrinsics.e(this.authToken, paymentOptionDecorator.authToken) && this.isExpired == paymentOptionDecorator.isExpired && Intrinsics.e(this.expirationDate, paymentOptionDecorator.expirationDate) && this.isSelected == paymentOptionDecorator.isSelected && Intrinsics.e(this.cardCVV, paymentOptionDecorator.cardCVV) && this.validCvvLength == paymentOptionDecorator.validCvvLength && Intrinsics.e(this.errors, paymentOptionDecorator.errors) && Intrinsics.e(this.cardDetailDecorator, paymentOptionDecorator.cardDetailDecorator);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + Boolean.hashCode(this.isPrimary)) * 31;
        String str = this.authToken;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isExpired)) * 31) + this.expirationDate.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31;
        String str2 = this.cardCVV;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.validCvvLength)) * 31) + this.errors.hashCode()) * 31) + this.cardDetailDecorator.hashCode();
    }

    public String toString() {
        return "PaymentOptionDecorator(id=" + this.id + ", isPrimary=" + this.isPrimary + ", authToken=" + this.authToken + ", isExpired=" + this.isExpired + ", expirationDate=" + this.expirationDate + ", isSelected=" + this.isSelected + ", cardCVV=" + this.cardCVV + ", validCvvLength=" + this.validCvvLength + ", errors=" + this.errors + ", cardDetailDecorator=" + this.cardDetailDecorator + ')';
    }

    public PaymentOptionDecorator(String id2, boolean z10, String str, boolean z11, YearMonth expirationDate, boolean z12, String str2, int i10, List<String> errors, CardDetailDecorator cardDetailDecorator) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(expirationDate, "expirationDate");
        Intrinsics.j(errors, "errors");
        Intrinsics.j(cardDetailDecorator, "cardDetailDecorator");
        this.id = id2;
        this.isPrimary = z10;
        this.authToken = str;
        this.isExpired = z11;
        this.expirationDate = expirationDate;
        this.isSelected = z12;
        this.cardCVV = str2;
        this.validCvvLength = i10;
        this.errors = errors;
        this.cardDetailDecorator = cardDetailDecorator;
    }

    /* renamed from: c, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    /* renamed from: d, reason: from getter */
    public final CardDetailDecorator getCardDetailDecorator() {
        return this.cardDetailDecorator;
    }

    public final AbstractC6392a e() {
        if (this.isExpired) {
            return null;
        }
        return AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101281xb, this.expirationDate.format(C17898a.NUMERIC_MONTH_YEAR_FULL));
    }

    /* renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public final int getValidCvvLength() {
        return this.validCvvLength;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
