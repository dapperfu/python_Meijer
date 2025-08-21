package uh;

import Ik.Validation;
import hk.PaymentOption;
import java.util.List;
import kl.z;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import vh.AccountCreditCard;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BU\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010\u0014R(\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006."}, d2 = {"Luh/a;", "LIk/a;", "", "Lvh/a;", "accountCreditCards", "LIk/b;", "Lhk/f;", "availableOptions", "selectedOption", "", "completePayment", "", "savedPaymentOptionsError", "<init>", "(Ljava/util/List;Ljava/util/List;LIk/b;ZLjava/lang/String;)V", "l", "()Luh/a;", "e", "(Ljava/util/List;Ljava/util/List;LIk/b;ZLjava/lang/String;)Luh/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "h", "c", "LIk/b;", "k", "()LIk/b;", "d", "Z", "i", "()Z", "Ljava/lang/String;", "j", "f", "validations", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uh.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class PaymentOptions implements Ik.a<PaymentOptions> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AccountCreditCard> accountCreditCards;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Validation<PaymentOption>> availableOptions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<PaymentOption> selectedOption;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean completePayment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String savedPaymentOptionsError;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Validation<PaymentOption>> validations;

    public PaymentOptions() {
        this(null, null, null, false, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOptions)) {
            return false;
        }
        PaymentOptions paymentOptions = (PaymentOptions) other;
        return Intrinsics.e(this.accountCreditCards, paymentOptions.accountCreditCards) && Intrinsics.e(this.availableOptions, paymentOptions.availableOptions) && Intrinsics.e(this.selectedOption, paymentOptions.selectedOption) && this.completePayment == paymentOptions.completePayment && Intrinsics.e(this.savedPaymentOptionsError, paymentOptions.savedPaymentOptionsError);
    }

    public PaymentOptions(List<AccountCreditCard> accountCreditCards, List<Validation<PaymentOption>> availableOptions, Validation<PaymentOption> selectedOption, boolean z10, String str) {
        Intrinsics.j(accountCreditCards, "accountCreditCards");
        Intrinsics.j(availableOptions, "availableOptions");
        Intrinsics.j(selectedOption, "selectedOption");
        this.accountCreditCards = accountCreditCards;
        this.availableOptions = availableOptions;
        this.selectedOption = selectedOption;
        this.completePayment = z10;
        this.savedPaymentOptionsError = str;
        this.validations = CollectionsKt.e(selectedOption);
    }

    public static /* synthetic */ PaymentOptions f(PaymentOptions paymentOptions, List list, List list2, Validation validation, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = paymentOptions.accountCreditCards;
        }
        if ((i10 & 2) != 0) {
            list2 = paymentOptions.availableOptions;
        }
        if ((i10 & 4) != 0) {
            validation = paymentOptions.selectedOption;
        }
        if ((i10 & 8) != 0) {
            z10 = paymentOptions.completePayment;
        }
        if ((i10 & 16) != 0) {
            str = paymentOptions.savedPaymentOptionsError;
        }
        String str2 = str;
        Validation validation2 = validation;
        return paymentOptions.e(list, list2, validation2, z10, str2);
    }

    @Override // Ik.a
    public List<Validation<PaymentOption>> a() {
        return this.validations;
    }

    public final PaymentOptions e(List<AccountCreditCard> accountCreditCards, List<Validation<PaymentOption>> availableOptions, Validation<PaymentOption> selectedOption, boolean completePayment, String savedPaymentOptionsError) {
        Intrinsics.j(accountCreditCards, "accountCreditCards");
        Intrinsics.j(availableOptions, "availableOptions");
        Intrinsics.j(selectedOption, "selectedOption");
        return new PaymentOptions(accountCreditCards, availableOptions, selectedOption, completePayment, savedPaymentOptionsError);
    }

    public final List<AccountCreditCard> g() {
        return this.accountCreditCards;
    }

    public final List<Validation<PaymentOption>> h() {
        return this.availableOptions;
    }

    public int hashCode() {
        int iHashCode = ((((((this.accountCreditCards.hashCode() * 31) + this.availableOptions.hashCode()) * 31) + this.selectedOption.hashCode()) * 31) + Boolean.hashCode(this.completePayment)) * 31;
        String str = this.savedPaymentOptionsError;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i, reason: from getter */
    public final boolean getCompletePayment() {
        return this.completePayment;
    }

    /* renamed from: j, reason: from getter */
    public final String getSavedPaymentOptionsError() {
        return this.savedPaymentOptionsError;
    }

    public final Validation<PaymentOption> k() {
        return this.selectedOption;
    }

    public PaymentOptions l() {
        return f(this, null, null, this.selectedOption.j(new z(new PropertyReference0Impl(this) { // from class: uh.a.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PaymentOptions) this.receiver).k();
            }
        })), false, null, 27, null);
    }

    public String toString() {
        return "PaymentOptions(accountCreditCards=" + this.accountCreditCards + ", availableOptions=" + this.availableOptions + ", selectedOption=" + this.selectedOption + ", completePayment=" + this.completePayment + ", savedPaymentOptionsError=" + this.savedPaymentOptionsError + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PaymentOptions(java.util.List r2, java.util.List r3, Ik.Validation r4, boolean r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.m()
        L8:
            r8 = r7 & 2
            if (r8 == 0) goto L10
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
        L10:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L1b
            Ik.b r4 = new Ik.b
            r8 = 2
            r4.<init>(r0, r0, r8, r0)
        L1b:
            r8 = r7 & 8
            if (r8 == 0) goto L20
            r5 = 0
        L20:
            r7 = r7 & 16
            if (r7 == 0) goto L2b
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L31
        L2b:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L31:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.PaymentOptions.<init>(java.util.List, java.util.List, Ik.b, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
