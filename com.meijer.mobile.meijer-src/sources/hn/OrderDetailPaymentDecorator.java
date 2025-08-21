package hn;

import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import es.AbstractC13866b;
import es.K;
import fj.MultiTenderPaymentInfo;
import fj.PaymentDetailItem;
import fj.TendersItem;
import fj.TransactionDetails;
import hj.OrderDetail;
import hn.OrderDetailPaymentDecorator;
import j$.time.OffsetDateTime;
import j$.time.YearMonth;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;
import yk.C18328d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0001&B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001d\u00101R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u00101¨\u00065"}, d2 = {"Lhn/j;", "Les/b;", "Lbk/a;", "title", "cardInfo", "cardExpiration", "mperksNumber", "authorizationCode", "ebtCardInfo", "ebtCardExpiration", "ebtTransactionInfo", "ebtFinalSnapPaymentLabel", "ebtFinalSnapPaymentValue", "creditCardBalance", "", "authorizationCodeVisibility", "shouldDisplayEbtPaymentInfo", "<init>", "(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lbk/a;", "h", "()Lbk/a;", "c", "d", "e", "g", "f", "a", "i", "getEbtTransactionInfo", "j", "getEbtFinalSnapPaymentLabel", "k", "getEbtFinalSnapPaymentValue", "l", "getCreditCardBalance", "m", "Z", "()Z", "n", "getShouldDisplayEbtPaymentInfo", "o", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.j, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderDetailPaymentDecorator extends AbstractC13866b {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f135931p;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a cardInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a cardExpiration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a mperksNumber;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a authorizationCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a ebtCardInfo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a ebtCardExpiration;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a ebtTransactionInfo;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a ebtFinalSnapPaymentLabel;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a ebtFinalSnapPaymentValue;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a creditCardBalance;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean authorizationCodeVisibility;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldDisplayEbtPaymentInfo;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u0010*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, d2 = {"Lhn/j$a;", "", "<init>", "()V", "Lhj/c;", "order", "", "d", "(Lhj/c;)Z", "Lhn/j;", "c", "(Lhj/c;)Lhn/j;", "Lfj/G;", "f", "(Lhj/c;)Lfj/G;", "creditPayment", "Lbk/a;", "h", "(Lhj/c;)Lbk/a;", "toEbtTransactionInfo", "g", "toCreditCardBalance", "e", "creditCardExpirationDate", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final hn.OrderDetailPaymentDecorator c(hj.OrderDetail r20) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hn.OrderDetailPaymentDecorator.Companion.c(hj.c):hn.j");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double b(OrderDetail orderDetail) {
            return orderDetail.getTotalPriceWithTax().getValue();
        }

        private final boolean d(OrderDetail order) {
            if (order.getCaptureAuthCode() != null) {
                return true;
            }
            return false;
        }

        private final AbstractC6392a e(OrderDetail orderDetail) {
            String str;
            TendersItem tendersItemF = f(orderDetail);
            String str2 = "";
            String str3 = null;
            if (tendersItemF != null) {
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                int i10 = Y.f100841ba;
                YearMonth expiryDate = tendersItemF.getExpiryDate();
                if (expiryDate != null) {
                    str = expiryDate.format(C17898a.NUMERIC_MONTH_YEAR_SHORT);
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                AbstractC6392a abstractC6392aD = companion.d(i10, str);
                if (abstractC6392aD != null) {
                    return abstractC6392aD;
                }
            }
            PaymentDetailItem paymentInfo = orderDetail.getPaymentInfo();
            if (paymentInfo == null) {
                return null;
            }
            AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
            int i11 = Y.f100841ba;
            YearMonth expiryDate2 = paymentInfo.getExpiryDate();
            if (expiryDate2 != null) {
                str3 = expiryDate2.format(C17898a.NUMERIC_MONTH_YEAR_SHORT);
            }
            if (str3 != null) {
                str2 = str3;
            }
            return companion2.d(i11, str2);
        }

        private final TendersItem f(OrderDetail orderDetail) {
            List<TendersItem> listA;
            MultiTenderPaymentInfo multiTenderPaymentInfo = orderDetail.getMultiTenderPaymentInfo();
            Object obj = null;
            if (multiTenderPaymentInfo == null || (listA = multiTenderPaymentInfo.a()) == null) {
                return null;
            }
            Iterator<T> it = listA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!K.f130659a.c((TendersItem) next)) {
                    obj = next;
                    break;
                }
            }
            return (TendersItem) obj;
        }

        private final AbstractC6392a g(final OrderDetail orderDetail) {
            Double dValueOf;
            if (orderDetail.getMultiTenderPaymentInfo() != null) {
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                int i10 = Y.f100837b6;
                nk.b rtsCapturedBalance = orderDetail.getRtsCapturedBalance();
                if (rtsCapturedBalance != null) {
                    dValueOf = Double.valueOf(rtsCapturedBalance.getValue());
                } else {
                    dValueOf = null;
                }
                AbstractC6392a abstractC6392aD = companion.d(i10, Double.valueOf(C18328d.a(dValueOf, new Function0() { // from class: hn.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Double.valueOf(OrderDetailPaymentDecorator.Companion.b(orderDetail));
                    }
                })));
                if (abstractC6392aD != null) {
                    return abstractC6392aD;
                }
            }
            return AbstractC6392a.INSTANCE.d(Y.f100837b6, Double.valueOf(orderDetail.getTotalPriceWithTax().getValue()));
        }

        private final AbstractC6392a h(OrderDetail orderDetail) {
            String str;
            ZonedDateTime zonedDateTimeAtZoneSameInstant;
            String ebtCaptureTranId;
            TransactionDetails transactionDetails;
            TransactionDetails transactionDetails2;
            OffsetDateTime ebtCaptureDateTime;
            TendersItem tendersItemR = orderDetail.r();
            String str2 = "";
            if (tendersItemR == null || (transactionDetails2 = tendersItemR.getTransactionDetails()) == null || (ebtCaptureDateTime = transactionDetails2.getEbtCaptureDateTime()) == null || (str = ebtCaptureDateTime.format(C17898a.DATE_FORMAT_MM_DD_YYYY)) == null) {
                OffsetDateTime created = orderDetail.getCreated();
                if (created != null && (zonedDateTimeAtZoneSameInstant = created.atZoneSameInstant(ZoneId.systemDefault())) != null) {
                    str = zonedDateTimeAtZoneSameInstant.format(C17898a.DATE_FORMAT_MM_DD_YYYY);
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            }
            TendersItem tendersItemR2 = orderDetail.r();
            if (tendersItemR2 != null && (transactionDetails = tendersItemR2.getTransactionDetails()) != null) {
                ebtCaptureTranId = transactionDetails.getEbtCaptureTranId();
            } else {
                ebtCaptureTranId = null;
            }
            if (ebtCaptureTranId != null) {
                str2 = ebtCaptureTranId;
            }
            if (orderDetail.getMultiTenderPaymentInfo() == null) {
                return null;
            }
            return AbstractC6392a.INSTANCE.d(Y.f100875d4, str, str2);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailPaymentDecorator)) {
            return false;
        }
        OrderDetailPaymentDecorator orderDetailPaymentDecorator = (OrderDetailPaymentDecorator) other;
        return Intrinsics.e(this.title, orderDetailPaymentDecorator.title) && Intrinsics.e(this.cardInfo, orderDetailPaymentDecorator.cardInfo) && Intrinsics.e(this.cardExpiration, orderDetailPaymentDecorator.cardExpiration) && Intrinsics.e(this.mperksNumber, orderDetailPaymentDecorator.mperksNumber) && Intrinsics.e(this.authorizationCode, orderDetailPaymentDecorator.authorizationCode) && Intrinsics.e(this.ebtCardInfo, orderDetailPaymentDecorator.ebtCardInfo) && Intrinsics.e(this.ebtCardExpiration, orderDetailPaymentDecorator.ebtCardExpiration) && Intrinsics.e(this.ebtTransactionInfo, orderDetailPaymentDecorator.ebtTransactionInfo) && Intrinsics.e(this.ebtFinalSnapPaymentLabel, orderDetailPaymentDecorator.ebtFinalSnapPaymentLabel) && Intrinsics.e(this.ebtFinalSnapPaymentValue, orderDetailPaymentDecorator.ebtFinalSnapPaymentValue) && Intrinsics.e(this.creditCardBalance, orderDetailPaymentDecorator.creditCardBalance) && this.authorizationCodeVisibility == orderDetailPaymentDecorator.authorizationCodeVisibility && this.shouldDisplayEbtPaymentInfo == orderDetailPaymentDecorator.shouldDisplayEbtPaymentInfo;
    }

    static {
        int i10 = AbstractC13866b.f130668a;
        int i11 = AbstractC6392a.f60445b;
        f135931p = i10 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11;
    }

    public OrderDetailPaymentDecorator(AbstractC6392a title, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a mperksNumber, AbstractC6392a authorizationCode, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, AbstractC6392a abstractC6392a5, AbstractC6392a abstractC6392a6, AbstractC6392a abstractC6392a7, AbstractC6392a abstractC6392a8, boolean z10, boolean z11) {
        Intrinsics.j(title, "title");
        Intrinsics.j(mperksNumber, "mperksNumber");
        Intrinsics.j(authorizationCode, "authorizationCode");
        this.title = title;
        this.cardInfo = abstractC6392a;
        this.cardExpiration = abstractC6392a2;
        this.mperksNumber = mperksNumber;
        this.authorizationCode = authorizationCode;
        this.ebtCardInfo = abstractC6392a3;
        this.ebtCardExpiration = abstractC6392a4;
        this.ebtTransactionInfo = abstractC6392a5;
        this.ebtFinalSnapPaymentLabel = abstractC6392a6;
        this.ebtFinalSnapPaymentValue = abstractC6392a7;
        this.creditCardBalance = abstractC6392a8;
        this.authorizationCodeVisibility = z10;
        this.shouldDisplayEbtPaymentInfo = z11;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getAuthorizationCode() {
        return this.authorizationCode;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getAuthorizationCodeVisibility() {
        return this.authorizationCodeVisibility;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getCardExpiration() {
        return this.cardExpiration;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getCardInfo() {
        return this.cardInfo;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getEbtCardExpiration() {
        return this.ebtCardExpiration;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC6392a getEbtCardInfo() {
        return this.ebtCardInfo;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC6392a getMperksNumber() {
        return this.mperksNumber;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AbstractC6392a abstractC6392a = this.cardInfo;
        int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
        AbstractC6392a abstractC6392a2 = this.cardExpiration;
        int iHashCode3 = (((((iHashCode2 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31) + this.mperksNumber.hashCode()) * 31) + this.authorizationCode.hashCode()) * 31;
        AbstractC6392a abstractC6392a3 = this.ebtCardInfo;
        int iHashCode4 = (iHashCode3 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31;
        AbstractC6392a abstractC6392a4 = this.ebtCardExpiration;
        int iHashCode5 = (iHashCode4 + (abstractC6392a4 == null ? 0 : abstractC6392a4.hashCode())) * 31;
        AbstractC6392a abstractC6392a5 = this.ebtTransactionInfo;
        int iHashCode6 = (iHashCode5 + (abstractC6392a5 == null ? 0 : abstractC6392a5.hashCode())) * 31;
        AbstractC6392a abstractC6392a6 = this.ebtFinalSnapPaymentLabel;
        int iHashCode7 = (iHashCode6 + (abstractC6392a6 == null ? 0 : abstractC6392a6.hashCode())) * 31;
        AbstractC6392a abstractC6392a7 = this.ebtFinalSnapPaymentValue;
        int iHashCode8 = (iHashCode7 + (abstractC6392a7 == null ? 0 : abstractC6392a7.hashCode())) * 31;
        AbstractC6392a abstractC6392a8 = this.creditCardBalance;
        return ((((iHashCode8 + (abstractC6392a8 != null ? abstractC6392a8.hashCode() : 0)) * 31) + Boolean.hashCode(this.authorizationCodeVisibility)) * 31) + Boolean.hashCode(this.shouldDisplayEbtPaymentInfo);
    }

    public String toString() {
        return "OrderDetailPaymentDecorator(title=" + this.title + ", cardInfo=" + this.cardInfo + ", cardExpiration=" + this.cardExpiration + ", mperksNumber=" + this.mperksNumber + ", authorizationCode=" + this.authorizationCode + ", ebtCardInfo=" + this.ebtCardInfo + ", ebtCardExpiration=" + this.ebtCardExpiration + ", ebtTransactionInfo=" + this.ebtTransactionInfo + ", ebtFinalSnapPaymentLabel=" + this.ebtFinalSnapPaymentLabel + ", ebtFinalSnapPaymentValue=" + this.ebtFinalSnapPaymentValue + ", creditCardBalance=" + this.creditCardBalance + ", authorizationCodeVisibility=" + this.authorizationCodeVisibility + ", shouldDisplayEbtPaymentInfo=" + this.shouldDisplayEbtPaymentInfo + ')';
    }
}
