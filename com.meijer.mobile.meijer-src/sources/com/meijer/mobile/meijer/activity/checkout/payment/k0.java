package com.meijer.mobile.meijer.activity.checkout.payment;

import androidx.view.InterfaceC6157f;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import fj.ShoppingCart;
import j$.time.Clock;
import j$.time.YearMonth;
import kl.CheckoutState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import qw.a;
import vh.AccountCreditCard;
import vh.EnumC17677e;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u00043@/9B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0012*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f*\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020.028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020)0<8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Luh/k;", "paymentsRepository", "Lkl/t;", "checkoutRepository", "<init>", "(Luh/k;Lkl/t;)V", "Lkl/v;", "checkoutState", "", "A", "(Lkl/v;)V", "Lvh/a;", "accountCreditCard", "B", "(Lvh/a;)V", "", "expirationMonth", "C", "(Ljava/lang/String;)V", "expirationYear", "D", "E", "()V", "", "u", "(I)Ljava/lang/String;", "j$/time/YearMonth", "now", "", "w", "(Lj$/time/YearMonth;Lj$/time/YearMonth;)Z", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c;", "action", "y", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c;)V", "a", "Luh/k;", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e;", "b", "Lpv/A;", "_events", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$d;", "c", "Lpv/B;", "_uiState", "Lpv/P;", "d", "Lpv/P;", "v", "()Lpv/P;", "uiState", "LJu/a;", "e", "LJu/a;", "disposables", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class k0 extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uh.k paymentsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<e> _events;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<CheckoutPaymentUpdateCardViewState> _uiState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pv.P<CheckoutPaymentUpdateCardViewState> uiState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        a(Object obj) {
            super(1, obj, k0.class, "onNewCheckoutState", "onNewCheckoutState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((k0) this.receiver).A(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c;", "", "<init>", "()V", "d", "a", "b", "c", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c$c;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c;", "Lvh/a;", "accountCreditCard", "<init>", "(Lvh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvh/a;", "()Lvh/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.k0$c$a, reason: from toString */
        public static final /* data */ class SetAccountCreditCard extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccountCreditCard accountCreditCard;

            public SetAccountCreditCard(AccountCreditCard accountCreditCard) {
                super(null);
                this.accountCreditCard = accountCreditCard;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetAccountCreditCard) && Intrinsics.e(this.accountCreditCard, ((SetAccountCreditCard) other).accountCreditCard);
            }

            public int hashCode() {
                AccountCreditCard accountCreditCard = this.accountCreditCard;
                if (accountCreditCard == null) {
                    return 0;
                }
                return accountCreditCard.hashCode();
            }

            public String toString() {
                return "SetAccountCreditCard(accountCreditCard=" + this.accountCreditCard + ')';
            }

            /* renamed from: a, reason: from getter */
            public final AccountCreditCard getAccountCreditCard() {
                return this.accountCreditCard;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c;", "", "expirationMonth", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.k0$c$b, reason: from toString */
        public static final /* data */ class SetExpirationMonth extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String expirationMonth;

            public SetExpirationMonth(String str) {
                super(null);
                this.expirationMonth = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetExpirationMonth) && Intrinsics.e(this.expirationMonth, ((SetExpirationMonth) other).expirationMonth);
            }

            public int hashCode() {
                String str = this.expirationMonth;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetExpirationMonth(expirationMonth=" + this.expirationMonth + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getExpirationMonth() {
                return this.expirationMonth;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c$c;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c;", "", "expirationYear", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.k0$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class SetExpirationYear extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String expirationYear;

            public SetExpirationYear(String str) {
                super(null);
                this.expirationYear = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetExpirationYear) && Intrinsics.e(this.expirationYear, ((SetExpirationYear) other).expirationYear);
            }

            public int hashCode() {
                String str = this.expirationYear;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetExpirationYear(expirationYear=" + this.expirationYear + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getExpirationYear() {
                return this.expirationYear;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c$d;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f104871a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1492671887;
            }

            public String toString() {
                return "UpdateCreditCard";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ`\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$d;", "", "Lvh/a;", "accountCreditCard", "Lbk/a;", "paymentCardTypeAndLastFourDigits", "", "expirationMonth", "expirationYear", "cartCode", "", "isPaymentOptionExpired", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$f;", "loadingState", "<init>", "(Lvh/a;Lbk/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/meijer/mobile/meijer/activity/checkout/payment/k0$f;)V", "a", "(Lvh/a;Lbk/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/meijer/mobile/meijer/activity/checkout/payment/k0$f;)Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lvh/a;", "c", "()Lvh/a;", "b", "Lbk/a;", "h", "()Lbk/a;", "Ljava/lang/String;", "e", "d", "f", "Z", "i", "()Z", "g", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$f;", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.k0$d, reason: from toString */
    public static final /* data */ class CheckoutPaymentUpdateCardViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccountCreditCard accountCreditCard;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a paymentCardTypeAndLastFourDigits;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String expirationMonth;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String expirationYear;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cartCode;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPaymentOptionExpired;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final LoadingState loadingState;

        public CheckoutPaymentUpdateCardViewState() {
            this(null, null, null, null, null, false, null, l3.f93324d, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckoutPaymentUpdateCardViewState)) {
                return false;
            }
            CheckoutPaymentUpdateCardViewState checkoutPaymentUpdateCardViewState = (CheckoutPaymentUpdateCardViewState) other;
            return Intrinsics.e(this.accountCreditCard, checkoutPaymentUpdateCardViewState.accountCreditCard) && Intrinsics.e(this.paymentCardTypeAndLastFourDigits, checkoutPaymentUpdateCardViewState.paymentCardTypeAndLastFourDigits) && Intrinsics.e(this.expirationMonth, checkoutPaymentUpdateCardViewState.expirationMonth) && Intrinsics.e(this.expirationYear, checkoutPaymentUpdateCardViewState.expirationYear) && Intrinsics.e(this.cartCode, checkoutPaymentUpdateCardViewState.cartCode) && this.isPaymentOptionExpired == checkoutPaymentUpdateCardViewState.isPaymentOptionExpired && Intrinsics.e(this.loadingState, checkoutPaymentUpdateCardViewState.loadingState);
        }

        public int hashCode() {
            AccountCreditCard accountCreditCard = this.accountCreditCard;
            int iHashCode = (accountCreditCard == null ? 0 : accountCreditCard.hashCode()) * 31;
            AbstractC6392a abstractC6392a = this.paymentCardTypeAndLastFourDigits;
            int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
            String str = this.expirationMonth;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.expirationYear;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cartCode;
            return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPaymentOptionExpired)) * 31) + this.loadingState.hashCode();
        }

        public String toString() {
            return "CheckoutPaymentUpdateCardViewState(accountCreditCard=" + this.accountCreditCard + ", paymentCardTypeAndLastFourDigits=" + this.paymentCardTypeAndLastFourDigits + ", expirationMonth=" + this.expirationMonth + ", expirationYear=" + this.expirationYear + ", cartCode=" + this.cartCode + ", isPaymentOptionExpired=" + this.isPaymentOptionExpired + ", loadingState=" + this.loadingState + ')';
        }

        public CheckoutPaymentUpdateCardViewState(AccountCreditCard accountCreditCard, AbstractC6392a abstractC6392a, String str, String str2, String str3, boolean z10, LoadingState loadingState) {
            Intrinsics.j(loadingState, "loadingState");
            this.accountCreditCard = accountCreditCard;
            this.paymentCardTypeAndLastFourDigits = abstractC6392a;
            this.expirationMonth = str;
            this.expirationYear = str2;
            this.cartCode = str3;
            this.isPaymentOptionExpired = z10;
            this.loadingState = loadingState;
        }

        public static /* synthetic */ CheckoutPaymentUpdateCardViewState b(CheckoutPaymentUpdateCardViewState checkoutPaymentUpdateCardViewState, AccountCreditCard accountCreditCard, AbstractC6392a abstractC6392a, String str, String str2, String str3, boolean z10, LoadingState loadingState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                accountCreditCard = checkoutPaymentUpdateCardViewState.accountCreditCard;
            }
            if ((i10 & 2) != 0) {
                abstractC6392a = checkoutPaymentUpdateCardViewState.paymentCardTypeAndLastFourDigits;
            }
            if ((i10 & 4) != 0) {
                str = checkoutPaymentUpdateCardViewState.expirationMonth;
            }
            if ((i10 & 8) != 0) {
                str2 = checkoutPaymentUpdateCardViewState.expirationYear;
            }
            if ((i10 & 16) != 0) {
                str3 = checkoutPaymentUpdateCardViewState.cartCode;
            }
            if ((i10 & 32) != 0) {
                z10 = checkoutPaymentUpdateCardViewState.isPaymentOptionExpired;
            }
            if ((i10 & 64) != 0) {
                loadingState = checkoutPaymentUpdateCardViewState.loadingState;
            }
            boolean z11 = z10;
            LoadingState loadingState2 = loadingState;
            String str4 = str3;
            String str5 = str;
            return checkoutPaymentUpdateCardViewState.a(accountCreditCard, abstractC6392a, str5, str2, str4, z11, loadingState2);
        }

        public final CheckoutPaymentUpdateCardViewState a(AccountCreditCard accountCreditCard, AbstractC6392a paymentCardTypeAndLastFourDigits, String expirationMonth, String expirationYear, String cartCode, boolean isPaymentOptionExpired, LoadingState loadingState) {
            Intrinsics.j(loadingState, "loadingState");
            return new CheckoutPaymentUpdateCardViewState(accountCreditCard, paymentCardTypeAndLastFourDigits, expirationMonth, expirationYear, cartCode, isPaymentOptionExpired, loadingState);
        }

        /* renamed from: c, reason: from getter */
        public final AccountCreditCard getAccountCreditCard() {
            return this.accountCreditCard;
        }

        /* renamed from: d, reason: from getter */
        public final String getCartCode() {
            return this.cartCode;
        }

        /* renamed from: e, reason: from getter */
        public final String getExpirationMonth() {
            return this.expirationMonth;
        }

        /* renamed from: f, reason: from getter */
        public final String getExpirationYear() {
            return this.expirationYear;
        }

        /* renamed from: g, reason: from getter */
        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: h, reason: from getter */
        public final AbstractC6392a getPaymentCardTypeAndLastFourDigits() {
            return this.paymentCardTypeAndLastFourDigits;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getIsPaymentOptionExpired() {
            return this.isPaymentOptionExpired;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ CheckoutPaymentUpdateCardViewState(AccountCreditCard accountCreditCard, AbstractC6392a abstractC6392a, String str, String str2, String str3, boolean z10, LoadingState loadingState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : accountCreditCard, (i10 & 2) != 0 ? null : abstractC6392a, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? new LoadingState(null, false, 3, 0 == true ? 1 : 0) : loadingState);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f104879a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -2012834077;
            }

            public String toString() {
                return "CardUpdatedSuccessFully";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$e;", "", "title", "message", "buttonText", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.k0$e$b, reason: from toString */
        public static final /* data */ class ShowPaymentErrorDialog extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int buttonText;

            public ShowPaymentErrorDialog(int i10, int i11, int i12) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.buttonText = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowPaymentErrorDialog)) {
                    return false;
                }
                ShowPaymentErrorDialog showPaymentErrorDialog = (ShowPaymentErrorDialog) other;
                return this.title == showPaymentErrorDialog.title && this.message == showPaymentErrorDialog.message && this.buttonText == showPaymentErrorDialog.buttonText;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.buttonText);
            }

            public String toString() {
                return "ShowPaymentErrorDialog(title=" + this.title + ", message=" + this.message + ", buttonText=" + this.buttonText + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getButtonText() {
                return this.buttonText;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/k0$f;", "", "Lbk/a;", "loadingMessage", "", "isLoading", "<init>", "(Lbk/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.k0$f, reason: from toString */
    public static final /* data */ class LoadingState {

        /* renamed from: c, reason: collision with root package name */
        public static final int f104883c = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a loadingMessage;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadingState() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingState)) {
                return false;
            }
            LoadingState loadingState = (LoadingState) other;
            return Intrinsics.e(this.loadingMessage, loadingState.loadingMessage) && this.isLoading == loadingState.isLoading;
        }

        public int hashCode() {
            AbstractC6392a abstractC6392a = this.loadingMessage;
            return ((abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "LoadingState(loadingMessage=" + this.loadingMessage + ", isLoading=" + this.isLoading + ')';
        }

        public LoadingState(AbstractC6392a abstractC6392a, boolean z10) {
            this.loadingMessage = abstractC6392a;
            this.isLoading = z10;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC6392a getLoadingMessage() {
            return this.loadingMessage;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ LoadingState(AbstractC6392a abstractC6392a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : abstractC6392a, (i10 & 2) != 0 ? true : z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentUpdateCardViewModel$updateCreditCard$2$1", f = "CheckoutPaymentUpdateCardViewModel.kt", l = {156, 163, 176}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f104886a;

        /* renamed from: b, reason: collision with root package name */
        Object f104887b;

        /* renamed from: c, reason: collision with root package name */
        Object f104888c;

        /* renamed from: d, reason: collision with root package name */
        Object f104889d;

        /* renamed from: e, reason: collision with root package name */
        int f104890e;

        /* renamed from: f, reason: collision with root package name */
        int f104891f;

        /* renamed from: g, reason: collision with root package name */
        int f104892g;

        /* renamed from: h, reason: collision with root package name */
        int f104893h;

        /* renamed from: i, reason: collision with root package name */
        int f104894i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f104895j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ CheckoutPaymentUpdateCardViewState f104897l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(CheckoutPaymentUpdateCardViewState checkoutPaymentUpdateCardViewState, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f104897l = checkoutPaymentUpdateCardViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = k0.this.new g(this.f104897l, continuation);
            gVar.f104895j = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
        
            if (r3.emit(r4, r23) == r8) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0141, code lost:
        
            if (r4.emit(r6, r23) == r8) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x010f A[PHI: r1 r2
          0x010f: PHI (r1v9 java.lang.Object) = (r1v7 java.lang.Object), (r1v14 java.lang.Object) binds: [B:32:0x00c3, B:39:0x010d] A[DONT_GENERATE, DONT_INLINE]
          0x010f: PHI (r2v8 mv.O) = (r2v7 mv.O), (r2v12 mv.O) binds: [B:32:0x00c3, B:39:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.payment.k0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k0(uh.k paymentsRepository, kl.t checkoutRepository) {
        Intrinsics.j(paymentsRepository, "paymentsRepository");
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        this.paymentsRepository = paymentsRepository;
        this._events = C16555H.b(0, 0, null, 7, null);
        InterfaceC16549B<CheckoutPaymentUpdateCardViewState> interfaceC16549BA = pv.S.a(new CheckoutPaymentUpdateCardViewState(null, null, null, null, null, false, null, l3.f93324d, null));
        this._uiState = interfaceC16549BA;
        this.uiState = interfaceC16549BA;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        io.reactivex.l<CheckoutState> lVarTake = checkoutRepository.s().take(1L);
        final a aVar2 = new a(this);
        Lu.g<? super CheckoutState> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.i0
            @Override // Lu.g
            public final void accept(Object obj) {
                k0.o(aVar2, obj);
            }
        };
        final b bVar = new b(qw.a.INSTANCE);
        Dk.a.a(lVarTake.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.j0
            @Override // Lu.g
            public final void accept(Object obj) {
                k0.p(bVar, obj);
            }
        }), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(CheckoutState checkoutState) {
        CheckoutPaymentUpdateCardViewState value;
        CheckoutPaymentUpdateCardViewState checkoutPaymentUpdateCardViewState;
        ShoppingCart shoppingCartE;
        InterfaceC16549B<CheckoutPaymentUpdateCardViewState> interfaceC16549B = this._uiState;
        do {
            value = interfaceC16549B.getValue();
            checkoutPaymentUpdateCardViewState = value;
            shoppingCartE = checkoutState.i().e();
        } while (!interfaceC16549B.e(value, CheckoutPaymentUpdateCardViewState.b(checkoutPaymentUpdateCardViewState, null, null, null, null, shoppingCartE != null ? shoppingCartE.getCode() : null, false, null, 111, null)));
    }

    private final void B(AccountCreditCard accountCreditCard) {
        String brand;
        String cardLastFourDigits;
        YearMonth expirationDate;
        YearMonth expirationDate2;
        YearMonth expirationDate3;
        EnumC17677e cardType;
        hk.h hVarB;
        InterfaceC16549B<CheckoutPaymentUpdateCardViewState> interfaceC16549B = this._uiState;
        while (true) {
            CheckoutPaymentUpdateCardViewState value = interfaceC16549B.getValue();
            CheckoutPaymentUpdateCardViewState checkoutPaymentUpdateCardViewState = value;
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i10 = com.meijer.mobile.meijer.Y.f100951h0;
            if (accountCreditCard == null || (cardType = accountCreditCard.getCardType()) == null || (hVarB = uh.g.b(cardType)) == null || (brand = hVarB.getBrand()) == null) {
                brand = "Card";
            }
            if (accountCreditCard == null || (cardLastFourDigits = accountCreditCard.getCardLastFourDigits()) == null) {
                cardLastFourDigits = "XXXX";
            }
            AbstractC6392a abstractC6392aD = companion.d(i10, brand, cardLastFourDigits);
            AccountCreditCard accountCreditCard2 = accountCreditCard;
            if (interfaceC16549B.e(value, CheckoutPaymentUpdateCardViewState.b(checkoutPaymentUpdateCardViewState, accountCreditCard2, abstractC6392aD, (accountCreditCard == null || (expirationDate3 = accountCreditCard.getExpirationDate()) == null) ? null : u(expirationDate3.getMonthValue()), String.valueOf((accountCreditCard == null || (expirationDate2 = accountCreditCard.getExpirationDate()) == null) ? null : Integer.valueOf(expirationDate2.getYear())), null, (accountCreditCard == null || (expirationDate = accountCreditCard.getExpirationDate()) == null || !x(this, expirationDate, null, 1, null)) ? false : true, new LoadingState(null, false), 16, null))) {
                return;
            } else {
                accountCreditCard = accountCreditCard2;
            }
        }
    }

    private final void C(String expirationMonth) {
        CheckoutPaymentUpdateCardViewState value;
        CheckoutPaymentUpdateCardViewState checkoutPaymentUpdateCardViewState;
        YearMonth yearMonthOf;
        AccountCreditCard accountCreditCardB;
        String strU;
        String strN1;
        Integer numV;
        Integer numV2;
        InterfaceC16549B<CheckoutPaymentUpdateCardViewState> interfaceC16549B = this._uiState;
        do {
            value = interfaceC16549B.getValue();
            checkoutPaymentUpdateCardViewState = value;
            String expirationYear = checkoutPaymentUpdateCardViewState.getExpirationYear();
            yearMonthOf = YearMonth.of((expirationYear == null || (numV2 = StringsKt.v(expirationYear)) == null) ? YearMonth.now(Clock.systemUTC()).getYear() : numV2.intValue(), (expirationMonth == null || (strN1 = StringsKt.N1(expirationMonth, 2)) == null || (numV = StringsKt.v(strN1)) == null) ? YearMonth.now(Clock.systemUTC()).getMonthValue() : numV.intValue());
            AccountCreditCard accountCreditCard = checkoutPaymentUpdateCardViewState.getAccountCreditCard();
            if (accountCreditCard != null) {
                Intrinsics.g(yearMonthOf);
                accountCreditCardB = AccountCreditCard.b(accountCreditCard, 0L, null, null, null, null, yearMonthOf, null, null, null, false, false, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, 0L, null, null, null, null, false, null, null, false, -33, 1, null);
            } else {
                accountCreditCardB = null;
            }
            strU = u(yearMonthOf.getMonthValue());
            Intrinsics.g(yearMonthOf);
        } while (!interfaceC16549B.e(value, CheckoutPaymentUpdateCardViewState.b(checkoutPaymentUpdateCardViewState, accountCreditCardB, null, strU, null, null, x(this, yearMonthOf, null, 1, null), null, 90, null)));
    }

    private final void D(String expirationYear) {
        CheckoutPaymentUpdateCardViewState value;
        CheckoutPaymentUpdateCardViewState checkoutPaymentUpdateCardViewState;
        YearMonth yearMonthOf;
        AccountCreditCard accountCreditCardB;
        Integer numV;
        Integer numV2;
        InterfaceC16549B<CheckoutPaymentUpdateCardViewState> interfaceC16549B = this._uiState;
        do {
            value = interfaceC16549B.getValue();
            checkoutPaymentUpdateCardViewState = value;
            int year = (expirationYear == null || (numV2 = StringsKt.v(expirationYear)) == null) ? YearMonth.now(Clock.systemUTC()).getYear() : numV2.intValue();
            String expirationMonth = checkoutPaymentUpdateCardViewState.getExpirationMonth();
            yearMonthOf = YearMonth.of(year, (expirationMonth == null || (numV = StringsKt.v(expirationMonth)) == null) ? YearMonth.now(Clock.systemUTC()).getMonthValue() : numV.intValue());
            AccountCreditCard accountCreditCard = checkoutPaymentUpdateCardViewState.getAccountCreditCard();
            if (accountCreditCard != null) {
                Intrinsics.g(yearMonthOf);
                accountCreditCardB = AccountCreditCard.b(accountCreditCard, 0L, null, null, null, null, yearMonthOf, null, null, null, false, false, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, 0L, null, null, null, null, false, null, null, false, -33, 1, null);
            } else {
                accountCreditCardB = null;
            }
            Intrinsics.g(yearMonthOf);
        } while (!interfaceC16549B.e(value, CheckoutPaymentUpdateCardViewState.b(checkoutPaymentUpdateCardViewState, accountCreditCardB, null, null, expirationYear, null, x(this, yearMonthOf, null, 1, null), null, 86, null)));
    }

    private final void E() {
        CheckoutPaymentUpdateCardViewState value;
        InterfaceC16549B<CheckoutPaymentUpdateCardViewState> interfaceC16549B = this._uiState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, CheckoutPaymentUpdateCardViewState.b(value, null, null, null, null, null, false, new LoadingState(AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100657Rh, new Object[0]), true), 63, null)));
        C15809k.d(androidx.view.d0.a(this), null, null, new g(this._uiState.getValue(), null), 3, null);
    }

    private final String u(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10));
        if (sb2.length() == 1) {
            sb2.insert(0, "0");
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    static /* synthetic */ boolean x(k0 k0Var, YearMonth yearMonth, YearMonth yearMonth2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            yearMonth2 = YearMonth.now();
        }
        return k0Var.w(yearMonth, yearMonth2);
    }

    public final InterfaceC16553F<e> getEvents() {
        return C16563h.b(this._events);
    }

    public final pv.P<CheckoutPaymentUpdateCardViewState> v() {
        return this.uiState;
    }

    public final void y(c action) {
        Intrinsics.j(action, "action");
        if (action instanceof c.SetAccountCreditCard) {
            B(((c.SetAccountCreditCard) action).getAccountCreditCard());
            return;
        }
        if (action instanceof c.SetExpirationMonth) {
            C(((c.SetExpirationMonth) action).getExpirationMonth());
        } else if (action instanceof c.SetExpirationYear) {
            D(((c.SetExpirationYear) action).getExpirationYear());
        } else {
            if (!(action instanceof c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final boolean w(YearMonth yearMonth, YearMonth yearMonth2) {
        return yearMonth2.isAfter(yearMonth);
    }
}
