package Wh;

import Ik.Validation;
import Ik.d;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.accounts.ux.payments.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vh.AccountCreditCard;
import vh.EnumC17677e;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b9\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001BÑ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u00002\n\u0010'\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0000H\u0016¢\u0006\u0004\b*\u0010+JÚ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u001a2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bK\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bN\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bD\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bG\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b<\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b8\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bI\u0010\\\u001a\u0004\b_\u0010^R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bZ\u0010\\\u001a\u0004\b`\u0010^R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bB\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bQ\u0010d\u001a\u0004\be\u0010fR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\be\u0010g\u001a\u0004\bH\u0010hR\u0019\u0010$\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bi\u0010ER\u001f\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0j8\u0006¢\u0006\f\n\u0004\bT\u0010k\u001a\u0004\bl\u0010mR$\u0010p\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010o0j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010mR\u0014\u0010q\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010^¨\u0006r"}, d2 = {"LWh/d;", "", "Lcom/meijer/mobile/accounts/ux/payments/j;", "", "cardId", "", "cardHolderName", "Lcom/meijer/mobile/accounts/ux/payments/j$e;", "addressFullName", "cardTypeName", "Lbk/a;", "cardDescription", "cardExpirationDate", "cardLastFourDigits", "Lcom/meijer/mobile/accounts/ux/payments/j$g;", "addressLine1", "Lcom/meijer/mobile/accounts/ux/payments/j$a;", "apartment", "Lcom/meijer/mobile/accounts/ux/payments/j$b;", "city", "Lcom/meijer/mobile/accounts/ux/payments/j$f;", "state", "Lcom/meijer/mobile/accounts/ux/payments/j$h;", "zipCode", "Lvh/e;", "cardType", "", "isPrimary", "isExpired", "isLinkedToMperks", "Lcom/meijer/mobile/accounts/ux/payments/j$d;", "expirationYear", "Lcom/meijer/mobile/accounts/ux/payments/j$c;", "expirationMonth", "Lvh/a;", "accountCreditCard", "updatePaymentErrorMessage", "<init>", "(JLjava/lang/String;Lcom/meijer/mobile/accounts/ux/payments/j$e;Ljava/lang/String;Lbk/a;Lbk/a;Ljava/lang/String;Lcom/meijer/mobile/accounts/ux/payments/j$g;Lcom/meijer/mobile/accounts/ux/payments/j$a;Lcom/meijer/mobile/accounts/ux/payments/j$b;Lcom/meijer/mobile/accounts/ux/payments/j$f;Lcom/meijer/mobile/accounts/ux/payments/j$h;Lvh/e;ZZZLcom/meijer/mobile/accounts/ux/payments/j$d;Lcom/meijer/mobile/accounts/ux/payments/j$c;Lvh/a;Lbk/a;)V", "field", "A", "(Lcom/meijer/mobile/accounts/ux/payments/j;)LWh/d;", "B", "()LWh/d;", "e", "(JLjava/lang/String;Lcom/meijer/mobile/accounts/ux/payments/j$e;Ljava/lang/String;Lbk/a;Lbk/a;Ljava/lang/String;Lcom/meijer/mobile/accounts/ux/payments/j$g;Lcom/meijer/mobile/accounts/ux/payments/j$a;Lcom/meijer/mobile/accounts/ux/payments/j$b;Lcom/meijer/mobile/accounts/ux/payments/j$f;Lcom/meijer/mobile/accounts/ux/payments/j$h;Lvh/e;ZZZLcom/meijer/mobile/accounts/ux/payments/j$d;Lcom/meijer/mobile/accounts/ux/payments/j$c;Lvh/a;Lbk/a;)LWh/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "n", "()J", "b", "Ljava/lang/String;", "m", "c", "Lcom/meijer/mobile/accounts/ux/payments/j$e;", "h", "()Lcom/meijer/mobile/accounts/ux/payments/j$e;", "d", "q", "Lbk/a;", "k", "()Lbk/a;", "f", "l", "g", "o", "Lcom/meijer/mobile/accounts/ux/payments/j$g;", "i", "()Lcom/meijer/mobile/accounts/ux/payments/j$g;", "Lcom/meijer/mobile/accounts/ux/payments/j$a;", "j", "()Lcom/meijer/mobile/accounts/ux/payments/j$a;", "Lcom/meijer/mobile/accounts/ux/payments/j$b;", "r", "()Lcom/meijer/mobile/accounts/ux/payments/j$b;", "Lcom/meijer/mobile/accounts/ux/payments/j$f;", "u", "()Lcom/meijer/mobile/accounts/ux/payments/j$f;", "Lcom/meijer/mobile/accounts/ux/payments/j$h;", "w", "()Lcom/meijer/mobile/accounts/ux/payments/j$h;", "Lvh/e;", "p", "()Lvh/e;", "Z", "z", "()Z", "x", "y", "Lcom/meijer/mobile/accounts/ux/payments/j$d;", "t", "()Lcom/meijer/mobile/accounts/ux/payments/j$d;", "Lcom/meijer/mobile/accounts/ux/payments/j$c;", "s", "()Lcom/meijer/mobile/accounts/ux/payments/j$c;", "Lvh/a;", "()Lvh/a;", "v", "", "Ljava/util/List;", "getFieldErrors", "()Ljava/util/List;", "fieldErrors", "LIk/b;", "validations", "isValid", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Wh.d, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class PaymentsCardDecorator implements Ik.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long cardId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardHolderName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final j.FullName addressFullName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardTypeName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a cardDescription;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a cardExpirationDate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardLastFourDigits;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final j.StreetAddress addressLine1;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final j.Apartment apartment;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final j.City city;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final j.State state;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final j.ZipCode zipCode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC17677e cardType;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimary;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isExpired;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLinkedToMperks;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final j.ExpirationYear expirationYear;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final j.ExpirationMonth expirationMonth;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccountCreditCard accountCreditCard;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a updatePaymentErrorMessage;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC6392a> fieldErrors;

    public PaymentsCardDecorator() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 1048575, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsCardDecorator)) {
            return false;
        }
        PaymentsCardDecorator paymentsCardDecorator = (PaymentsCardDecorator) other;
        return this.cardId == paymentsCardDecorator.cardId && Intrinsics.e(this.cardHolderName, paymentsCardDecorator.cardHolderName) && Intrinsics.e(this.addressFullName, paymentsCardDecorator.addressFullName) && Intrinsics.e(this.cardTypeName, paymentsCardDecorator.cardTypeName) && Intrinsics.e(this.cardDescription, paymentsCardDecorator.cardDescription) && Intrinsics.e(this.cardExpirationDate, paymentsCardDecorator.cardExpirationDate) && Intrinsics.e(this.cardLastFourDigits, paymentsCardDecorator.cardLastFourDigits) && Intrinsics.e(this.addressLine1, paymentsCardDecorator.addressLine1) && Intrinsics.e(this.apartment, paymentsCardDecorator.apartment) && Intrinsics.e(this.city, paymentsCardDecorator.city) && Intrinsics.e(this.state, paymentsCardDecorator.state) && Intrinsics.e(this.zipCode, paymentsCardDecorator.zipCode) && this.cardType == paymentsCardDecorator.cardType && this.isPrimary == paymentsCardDecorator.isPrimary && this.isExpired == paymentsCardDecorator.isExpired && this.isLinkedToMperks == paymentsCardDecorator.isLinkedToMperks && Intrinsics.e(this.expirationYear, paymentsCardDecorator.expirationYear) && Intrinsics.e(this.expirationMonth, paymentsCardDecorator.expirationMonth) && Intrinsics.e(this.accountCreditCard, paymentsCardDecorator.accountCreditCard) && Intrinsics.e(this.updatePaymentErrorMessage, paymentsCardDecorator.updatePaymentErrorMessage);
    }

    public PaymentsCardDecorator(long j10, String cardHolderName, j.FullName addressFullName, String cardTypeName, AbstractC6392a cardDescription, AbstractC6392a cardExpirationDate, String cardLastFourDigits, j.StreetAddress addressLine1, j.Apartment apartment, j.City city, j.State state, j.ZipCode zipCode, EnumC17677e cardType, boolean z10, boolean z11, boolean z12, j.ExpirationYear expirationYear, j.ExpirationMonth expirationMonth, AccountCreditCard accountCreditCard, AbstractC6392a abstractC6392a) {
        Intrinsics.j(cardHolderName, "cardHolderName");
        Intrinsics.j(addressFullName, "addressFullName");
        Intrinsics.j(cardTypeName, "cardTypeName");
        Intrinsics.j(cardDescription, "cardDescription");
        Intrinsics.j(cardExpirationDate, "cardExpirationDate");
        Intrinsics.j(cardLastFourDigits, "cardLastFourDigits");
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(apartment, "apartment");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(cardType, "cardType");
        Intrinsics.j(expirationYear, "expirationYear");
        Intrinsics.j(expirationMonth, "expirationMonth");
        Intrinsics.j(accountCreditCard, "accountCreditCard");
        this.cardId = j10;
        this.cardHolderName = cardHolderName;
        this.addressFullName = addressFullName;
        this.cardTypeName = cardTypeName;
        this.cardDescription = cardDescription;
        this.cardExpirationDate = cardExpirationDate;
        this.cardLastFourDigits = cardLastFourDigits;
        this.addressLine1 = addressLine1;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.cardType = cardType;
        this.isPrimary = z10;
        this.isExpired = z11;
        this.isLinkedToMperks = z12;
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
        this.accountCreditCard = accountCreditCard;
        this.updatePaymentErrorMessage = abstractC6392a;
        this.fieldErrors = CollectionsKt.p(addressFullName.b(), zipCode.b(), addressLine1.b(), city.b(), state.b());
    }

    public static /* synthetic */ PaymentsCardDecorator f(PaymentsCardDecorator paymentsCardDecorator, long j10, String str, j.FullName fullName, String str2, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, String str3, j.StreetAddress streetAddress, j.Apartment apartment, j.City city, j.State state, j.ZipCode zipCode, EnumC17677e enumC17677e, boolean z10, boolean z11, boolean z12, j.ExpirationYear expirationYear, j.ExpirationMonth expirationMonth, AccountCreditCard accountCreditCard, AbstractC6392a abstractC6392a3, int i10, Object obj) {
        AbstractC6392a abstractC6392a4;
        AccountCreditCard accountCreditCard2;
        long j11 = (i10 & 1) != 0 ? paymentsCardDecorator.cardId : j10;
        String str4 = (i10 & 2) != 0 ? paymentsCardDecorator.cardHolderName : str;
        j.FullName fullName2 = (i10 & 4) != 0 ? paymentsCardDecorator.addressFullName : fullName;
        String str5 = (i10 & 8) != 0 ? paymentsCardDecorator.cardTypeName : str2;
        AbstractC6392a abstractC6392a5 = (i10 & 16) != 0 ? paymentsCardDecorator.cardDescription : abstractC6392a;
        AbstractC6392a abstractC6392a6 = (i10 & 32) != 0 ? paymentsCardDecorator.cardExpirationDate : abstractC6392a2;
        String str6 = (i10 & 64) != 0 ? paymentsCardDecorator.cardLastFourDigits : str3;
        j.StreetAddress streetAddress2 = (i10 & 128) != 0 ? paymentsCardDecorator.addressLine1 : streetAddress;
        j.Apartment apartment2 = (i10 & 256) != 0 ? paymentsCardDecorator.apartment : apartment;
        j.City city2 = (i10 & 512) != 0 ? paymentsCardDecorator.city : city;
        j.State state2 = (i10 & 1024) != 0 ? paymentsCardDecorator.state : state;
        j.ZipCode zipCode2 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? paymentsCardDecorator.zipCode : zipCode;
        EnumC17677e enumC17677e2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? paymentsCardDecorator.cardType : enumC17677e;
        long j12 = j11;
        boolean z13 = (i10 & 8192) != 0 ? paymentsCardDecorator.isPrimary : z10;
        boolean z14 = (i10 & 16384) != 0 ? paymentsCardDecorator.isExpired : z11;
        boolean z15 = (i10 & 32768) != 0 ? paymentsCardDecorator.isLinkedToMperks : z12;
        j.ExpirationYear expirationYear2 = (i10 & 65536) != 0 ? paymentsCardDecorator.expirationYear : expirationYear;
        j.ExpirationMonth expirationMonth2 = (i10 & 131072) != 0 ? paymentsCardDecorator.expirationMonth : expirationMonth;
        AccountCreditCard accountCreditCard3 = (i10 & 262144) != 0 ? paymentsCardDecorator.accountCreditCard : accountCreditCard;
        if ((i10 & 524288) != 0) {
            accountCreditCard2 = accountCreditCard3;
            abstractC6392a4 = paymentsCardDecorator.updatePaymentErrorMessage;
        } else {
            abstractC6392a4 = abstractC6392a3;
            accountCreditCard2 = accountCreditCard3;
        }
        return paymentsCardDecorator.e(j12, str4, fullName2, str5, abstractC6392a5, abstractC6392a6, str6, streetAddress2, apartment2, city2, state2, zipCode2, enumC17677e2, z13, z14, z15, expirationYear2, expirationMonth2, accountCreditCard2, abstractC6392a4);
    }

    public PaymentsCardDecorator A(j<?> field) {
        Intrinsics.j(field, "field");
        if (field instanceof j.FullName) {
            return f(this, 0L, null, ((j.FullName) field).f(), null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 1048571, null);
        }
        if (field instanceof j.StreetAddress) {
            return f(this, 0L, null, null, null, null, null, null, ((j.StreetAddress) field).f(), null, null, null, null, null, false, false, false, null, null, null, null, 1048447, null);
        }
        if (field instanceof j.City) {
            return f(this, 0L, null, null, null, null, null, null, null, null, ((j.City) field).f(), null, null, null, false, false, false, null, null, null, null, 1048063, null);
        }
        if (field instanceof j.State) {
            return f(this, 0L, null, null, null, null, null, null, null, null, null, ((j.State) field).f(), null, null, false, false, false, null, null, null, null, 1047551, null);
        }
        if (field instanceof j.Apartment) {
            return f(this, 0L, null, null, null, null, null, null, null, ((j.Apartment) field).e(), null, null, null, null, false, false, false, null, null, null, null, 1048319, null);
        }
        if (field instanceof j.ZipCode) {
            return f(this, 0L, null, null, null, null, null, null, null, null, null, null, ((j.ZipCode) field).f(), null, false, false, false, null, null, null, null, 1046527, null);
        }
        if (field instanceof j.ExpirationMonth) {
            return f(this, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, ((j.ExpirationMonth) field).f(), null, null, 917503, null);
        }
        if (field instanceof j.ExpirationYear) {
            return f(this, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, ((j.ExpirationYear) field).f(), null, null, null, 983039, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public PaymentsCardDecorator B() {
        return f(this, 0L, null, this.addressFullName.f(), null, null, null, null, this.addressLine1.f(), null, this.city.f(), this.state.f(), this.zipCode.f(), null, false, false, false, this.expirationYear.f(), this.expirationMonth.f(), null, null, 848251, null);
    }

    @Override // Ik.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.p(this.addressFullName.c(), this.addressLine1.c(), this.city.c(), this.state.c(), this.zipCode.c(), this.expirationMonth.c(), this.expirationYear.c());
    }

    public final PaymentsCardDecorator e(long cardId, String cardHolderName, j.FullName addressFullName, String cardTypeName, AbstractC6392a cardDescription, AbstractC6392a cardExpirationDate, String cardLastFourDigits, j.StreetAddress addressLine1, j.Apartment apartment, j.City city, j.State state, j.ZipCode zipCode, EnumC17677e cardType, boolean isPrimary, boolean isExpired, boolean isLinkedToMperks, j.ExpirationYear expirationYear, j.ExpirationMonth expirationMonth, AccountCreditCard accountCreditCard, AbstractC6392a updatePaymentErrorMessage) {
        Intrinsics.j(cardHolderName, "cardHolderName");
        Intrinsics.j(addressFullName, "addressFullName");
        Intrinsics.j(cardTypeName, "cardTypeName");
        Intrinsics.j(cardDescription, "cardDescription");
        Intrinsics.j(cardExpirationDate, "cardExpirationDate");
        Intrinsics.j(cardLastFourDigits, "cardLastFourDigits");
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(apartment, "apartment");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(cardType, "cardType");
        Intrinsics.j(expirationYear, "expirationYear");
        Intrinsics.j(expirationMonth, "expirationMonth");
        Intrinsics.j(accountCreditCard, "accountCreditCard");
        return new PaymentsCardDecorator(cardId, cardHolderName, addressFullName, cardTypeName, cardDescription, cardExpirationDate, cardLastFourDigits, addressLine1, apartment, city, state, zipCode, cardType, isPrimary, isExpired, isLinkedToMperks, expirationYear, expirationMonth, accountCreditCard, updatePaymentErrorMessage);
    }

    /* renamed from: g, reason: from getter */
    public final AccountCreditCard getAccountCreditCard() {
        return this.accountCreditCard;
    }

    /* renamed from: h, reason: from getter */
    public final j.FullName getAddressFullName() {
        return this.addressFullName;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((Long.hashCode(this.cardId) * 31) + this.cardHolderName.hashCode()) * 31) + this.addressFullName.hashCode()) * 31) + this.cardTypeName.hashCode()) * 31) + this.cardDescription.hashCode()) * 31) + this.cardExpirationDate.hashCode()) * 31) + this.cardLastFourDigits.hashCode()) * 31) + this.addressLine1.hashCode()) * 31) + this.apartment.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + this.cardType.hashCode()) * 31) + Boolean.hashCode(this.isPrimary)) * 31) + Boolean.hashCode(this.isExpired)) * 31) + Boolean.hashCode(this.isLinkedToMperks)) * 31) + this.expirationYear.hashCode()) * 31) + this.expirationMonth.hashCode()) * 31) + this.accountCreditCard.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.updatePaymentErrorMessage;
        return iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode());
    }

    /* renamed from: i, reason: from getter */
    public final j.StreetAddress getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: j, reason: from getter */
    public final j.Apartment getApartment() {
        return this.apartment;
    }

    /* renamed from: k, reason: from getter */
    public final AbstractC6392a getCardDescription() {
        return this.cardDescription;
    }

    /* renamed from: l, reason: from getter */
    public final AbstractC6392a getCardExpirationDate() {
        return this.cardExpirationDate;
    }

    /* renamed from: m, reason: from getter */
    public final String getCardHolderName() {
        return this.cardHolderName;
    }

    /* renamed from: n, reason: from getter */
    public final long getCardId() {
        return this.cardId;
    }

    /* renamed from: o, reason: from getter */
    public final String getCardLastFourDigits() {
        return this.cardLastFourDigits;
    }

    /* renamed from: p, reason: from getter */
    public final EnumC17677e getCardType() {
        return this.cardType;
    }

    /* renamed from: q, reason: from getter */
    public final String getCardTypeName() {
        return this.cardTypeName;
    }

    /* renamed from: r, reason: from getter */
    public final j.City getCity() {
        return this.city;
    }

    /* renamed from: s, reason: from getter */
    public final j.ExpirationMonth getExpirationMonth() {
        return this.expirationMonth;
    }

    /* renamed from: t, reason: from getter */
    public final j.ExpirationYear getExpirationYear() {
        return this.expirationYear;
    }

    public String toString() {
        return "PaymentsCardDecorator(cardId=" + this.cardId + ", cardHolderName=" + this.cardHolderName + ", addressFullName=" + this.addressFullName + ", cardTypeName=" + this.cardTypeName + ", cardDescription=" + this.cardDescription + ", cardExpirationDate=" + this.cardExpirationDate + ", cardLastFourDigits=" + this.cardLastFourDigits + ", addressLine1=" + this.addressLine1 + ", apartment=" + this.apartment + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", cardType=" + this.cardType + ", isPrimary=" + this.isPrimary + ", isExpired=" + this.isExpired + ", isLinkedToMperks=" + this.isLinkedToMperks + ", expirationYear=" + this.expirationYear + ", expirationMonth=" + this.expirationMonth + ", accountCreditCard=" + this.accountCreditCard + ", updatePaymentErrorMessage=" + this.updatePaymentErrorMessage + ')';
    }

    /* renamed from: u, reason: from getter */
    public final j.State getState() {
        return this.state;
    }

    /* renamed from: v, reason: from getter */
    public final AbstractC6392a getUpdatePaymentErrorMessage() {
        return this.updatePaymentErrorMessage;
    }

    /* renamed from: w, reason: from getter */
    public final j.ZipCode getZipCode() {
        return this.zipCode;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    /* renamed from: y, reason: from getter */
    public final boolean getIsLinkedToMperks() {
        return this.isLinkedToMperks;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    @Override // Ik.a
    public boolean isValid() {
        List<Validation<? extends Object>> listA = a();
        if ((listA instanceof Collection) && listA.isEmpty()) {
            return true;
        }
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            if (((Validation) it.next()).getResult() instanceof d.Failures) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Ik.b, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public /* synthetic */ PaymentsCardDecorator(long j10, String str, j.FullName fullName, String str2, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, String str3, j.StreetAddress streetAddress, j.Apartment apartment, j.City city, j.State state, j.ZipCode zipCode, EnumC17677e enumC17677e, boolean z10, boolean z11, boolean z12, j.ExpirationYear expirationYear, j.ExpirationMonth expirationMonth, AccountCreditCard accountCreditCard, AbstractC6392a abstractC6392a3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        j.FullName fullName2;
        j.StreetAddress streetAddress2;
        j.Apartment apartment2;
        j.City city2;
        j.State state2;
        j.ZipCode zipCode2;
        boolean z13;
        ?? r02;
        int i11;
        j.ExpirationYear expirationYear2;
        long j11 = (i10 & 1) != 0 ? 0L : j10;
        String str4 = (i10 & 2) != 0 ? "" : str;
        Validation validation = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        int i12 = 1;
        if ((i10 & 4) != 0) {
            fullName2 = new j.FullName(validation, i12, objArr11 == true ? 1 : 0);
        } else {
            fullName2 = fullName;
        }
        String str5 = (i10 & 8) != 0 ? "" : str2;
        AbstractC6392a abstractC6392aA = (i10 & 16) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a;
        AbstractC6392a abstractC6392aA2 = (i10 & 32) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a2;
        String str6 = (i10 & 64) == 0 ? str3 : "";
        if ((i10 & 128) != 0) {
            streetAddress2 = new j.StreetAddress(objArr10 == true ? 1 : 0, i12, objArr9 == true ? 1 : 0);
        } else {
            streetAddress2 = streetAddress;
        }
        if ((i10 & 256) != 0) {
            apartment2 = new j.Apartment(objArr8 == true ? 1 : 0, i12, objArr7 == true ? 1 : 0);
        } else {
            apartment2 = apartment;
        }
        if ((i10 & 512) != 0) {
            city2 = new j.City(objArr6 == true ? 1 : 0, i12, objArr5 == true ? 1 : 0);
        } else {
            city2 = city;
        }
        if ((i10 & 1024) != 0) {
            state2 = new j.State(objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0);
        } else {
            state2 = state;
        }
        if ((i10 & RecyclerView.m.FLAG_MOVED) != 0) {
            zipCode2 = new j.ZipCode(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
        } else {
            zipCode2 = zipCode;
        }
        EnumC17677e enumC17677e2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? EnumC17677e.f165888j : enumC17677e;
        boolean z14 = (i10 & 8192) != 0 ? false : z10;
        long j12 = j11;
        boolean z15 = (i10 & 16384) != 0 ? false : z11;
        boolean z16 = (32768 & i10) == 0 ? z12 : false;
        if ((65536 & i10) != 0) {
            z13 = z15;
            r02 = 0;
            i11 = 1;
            expirationYear2 = new j.ExpirationYear(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        } else {
            z13 = z15;
            r02 = 0;
            i11 = 1;
            expirationYear2 = expirationYear;
        }
        this(j12, str4, fullName2, str5, abstractC6392aA, abstractC6392aA2, str6, streetAddress2, apartment2, city2, state2, zipCode2, enumC17677e2, z14, z13, z16, expirationYear2, (i10 & 131072) != 0 ? new j.ExpirationMonth(r02, i11, r02) : expirationMonth, (i10 & 262144) != 0 ? new AccountCreditCard() : accountCreditCard, (i10 & 524288) != 0 ? r02 : abstractC6392a3);
    }
}
