package gn;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import ej.MultiTenderPaymentInfo;
import ej.PaymentDetailItem;
import ej.TendersItem;
import ej.TransactionDetails;
import es.AbstractC13757b;
import es.K;
import gj.OrderDetail;
import gn.OrderDetailPaymentDecorator;
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
import vk.C17590a;
import xk.C18066d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0001&B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001d\u00101R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u00101¨\u00065"}, d2 = {"Lgn/j;", "Les/b;", "Lak/a;", "title", "cardInfo", "cardExpiration", "mperksNumber", "authorizationCode", "ebtCardInfo", "ebtCardExpiration", "ebtTransactionInfo", "ebtFinalSnapPaymentLabel", "ebtFinalSnapPaymentValue", "creditCardBalance", "", "authorizationCodeVisibility", "shouldDisplayEbtPaymentInfo", "<init>", "(Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lak/a;", "h", "()Lak/a;", "c", "d", "e", "g", "f", "a", "i", "getEbtTransactionInfo", "j", "getEbtFinalSnapPaymentLabel", "k", "getEbtFinalSnapPaymentValue", "l", "getCreditCardBalance", "m", "Z", "()Z", "n", "getShouldDisplayEbtPaymentInfo", "o", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gn.j, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderDetailPaymentDecorator extends AbstractC13757b {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f133863p;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a cardInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a cardExpiration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a mperksNumber;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a authorizationCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a ebtCardInfo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a ebtCardExpiration;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a ebtTransactionInfo;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a ebtFinalSnapPaymentLabel;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a ebtFinalSnapPaymentValue;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a creditCardBalance;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean authorizationCodeVisibility;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldDisplayEbtPaymentInfo;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u0010*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, d2 = {"Lgn/j$a;", "", "<init>", "()V", "Lgj/c;", "order", "", "d", "(Lgj/c;)Z", "Lgn/j;", "c", "(Lgj/c;)Lgn/j;", "Lej/G;", "f", "(Lgj/c;)Lej/G;", "creditPayment", "Lak/a;", "h", "(Lgj/c;)Lak/a;", "toEbtTransactionInfo", "g", "toCreditCardBalance", "e", "creditCardExpirationDate", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: gn.j$a, reason: from kotlin metadata */
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
        public final gn.OrderDetailPaymentDecorator c(gj.OrderDetail r20) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gn.OrderDetailPaymentDecorator.Companion.c(gj.c):gn.j");
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

        private final AbstractC5607a e(OrderDetail orderDetail) {
            String str;
            TendersItem tendersItemF = f(orderDetail);
            String str2 = "";
            String str3 = null;
            if (tendersItemF != null) {
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                int i10 = Y.f99920Y9;
                YearMonth expiryDate = tendersItemF.getExpiryDate();
                if (expiryDate != null) {
                    str = expiryDate.format(C17590a.NUMERIC_MONTH_YEAR_SHORT);
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                AbstractC5607a abstractC5607aD = companion.d(i10, str);
                if (abstractC5607aD != null) {
                    return abstractC5607aD;
                }
            }
            PaymentDetailItem paymentInfo = orderDetail.getPaymentInfo();
            if (paymentInfo == null) {
                return null;
            }
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            int i11 = Y.f99920Y9;
            YearMonth expiryDate2 = paymentInfo.getExpiryDate();
            if (expiryDate2 != null) {
                str3 = expiryDate2.format(C17590a.NUMERIC_MONTH_YEAR_SHORT);
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
                if (!K.f129818a.c((TendersItem) next)) {
                    obj = next;
                    break;
                }
            }
            return (TendersItem) obj;
        }

        private final AbstractC5607a g(final OrderDetail orderDetail) {
            Double dValueOf;
            if (orderDetail.getMultiTenderPaymentInfo() != null) {
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                int i10 = Y.f99975b6;
                mk.b rtsCapturedBalance = orderDetail.getRtsCapturedBalance();
                if (rtsCapturedBalance != null) {
                    dValueOf = Double.valueOf(rtsCapturedBalance.getValue());
                } else {
                    dValueOf = null;
                }
                AbstractC5607a abstractC5607aD = companion.d(i10, Double.valueOf(C18066d.a(dValueOf, new Function0() { // from class: gn.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Double.valueOf(OrderDetailPaymentDecorator.Companion.b(orderDetail));
                    }
                })));
                if (abstractC5607aD != null) {
                    return abstractC5607aD;
                }
            }
            return AbstractC5607a.INSTANCE.d(Y.f99975b6, Double.valueOf(orderDetail.getTotalPriceWithTax().getValue()));
        }

        private final AbstractC5607a h(OrderDetail orderDetail) {
            String str;
            ZonedDateTime zonedDateTimeAtZoneSameInstant;
            String ebtCaptureTranId;
            TransactionDetails transactionDetails;
            TransactionDetails transactionDetails2;
            OffsetDateTime ebtCaptureDateTime;
            TendersItem tendersItemR = orderDetail.r();
            String str2 = "";
            if (tendersItemR == null || (transactionDetails2 = tendersItemR.getTransactionDetails()) == null || (ebtCaptureDateTime = transactionDetails2.getEbtCaptureDateTime()) == null || (str = ebtCaptureDateTime.format(C17590a.DATE_FORMAT_MM_DD_YYYY)) == null) {
                OffsetDateTime created = orderDetail.getCreated();
                if (created != null && (zonedDateTimeAtZoneSameInstant = created.atZoneSameInstant(ZoneId.systemDefault())) != null) {
                    str = zonedDateTimeAtZoneSameInstant.format(C17590a.DATE_FORMAT_MM_DD_YYYY);
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
            return AbstractC5607a.INSTANCE.d(Y.f100013d4, str, str2);
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
        int i10 = AbstractC13757b.f129827a;
        int i11 = AbstractC5607a.f45514b;
        f133863p = i10 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11;
    }

    public OrderDetailPaymentDecorator(AbstractC5607a title, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a mperksNumber, AbstractC5607a authorizationCode, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, AbstractC5607a abstractC5607a6, AbstractC5607a abstractC5607a7, AbstractC5607a abstractC5607a8, boolean z10, boolean z11) {
        Intrinsics.j(title, "title");
        Intrinsics.j(mperksNumber, "mperksNumber");
        Intrinsics.j(authorizationCode, "authorizationCode");
        this.title = title;
        this.cardInfo = abstractC5607a;
        this.cardExpiration = abstractC5607a2;
        this.mperksNumber = mperksNumber;
        this.authorizationCode = authorizationCode;
        this.ebtCardInfo = abstractC5607a3;
        this.ebtCardExpiration = abstractC5607a4;
        this.ebtTransactionInfo = abstractC5607a5;
        this.ebtFinalSnapPaymentLabel = abstractC5607a6;
        this.ebtFinalSnapPaymentValue = abstractC5607a7;
        this.creditCardBalance = abstractC5607a8;
        this.authorizationCodeVisibility = z10;
        this.shouldDisplayEbtPaymentInfo = z11;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getAuthorizationCode() {
        return this.authorizationCode;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getAuthorizationCodeVisibility() {
        return this.authorizationCodeVisibility;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getCardExpiration() {
        return this.cardExpiration;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getCardInfo() {
        return this.cardInfo;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getEbtCardExpiration() {
        return this.ebtCardExpiration;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC5607a getEbtCardInfo() {
        return this.ebtCardInfo;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC5607a getMperksNumber() {
        return this.mperksNumber;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AbstractC5607a abstractC5607a = this.cardInfo;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.cardExpiration;
        int iHashCode3 = (((((iHashCode2 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31) + this.mperksNumber.hashCode()) * 31) + this.authorizationCode.hashCode()) * 31;
        AbstractC5607a abstractC5607a3 = this.ebtCardInfo;
        int iHashCode4 = (iHashCode3 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31;
        AbstractC5607a abstractC5607a4 = this.ebtCardExpiration;
        int iHashCode5 = (iHashCode4 + (abstractC5607a4 == null ? 0 : abstractC5607a4.hashCode())) * 31;
        AbstractC5607a abstractC5607a5 = this.ebtTransactionInfo;
        int iHashCode6 = (iHashCode5 + (abstractC5607a5 == null ? 0 : abstractC5607a5.hashCode())) * 31;
        AbstractC5607a abstractC5607a6 = this.ebtFinalSnapPaymentLabel;
        int iHashCode7 = (iHashCode6 + (abstractC5607a6 == null ? 0 : abstractC5607a6.hashCode())) * 31;
        AbstractC5607a abstractC5607a7 = this.ebtFinalSnapPaymentValue;
        int iHashCode8 = (iHashCode7 + (abstractC5607a7 == null ? 0 : abstractC5607a7.hashCode())) * 31;
        AbstractC5607a abstractC5607a8 = this.creditCardBalance;
        return ((((iHashCode8 + (abstractC5607a8 != null ? abstractC5607a8.hashCode() : 0)) * 31) + Boolean.hashCode(this.authorizationCodeVisibility)) * 31) + Boolean.hashCode(this.shouldDisplayEbtPaymentInfo);
    }

    public String toString() {
        return "OrderDetailPaymentDecorator(title=" + this.title + ", cardInfo=" + this.cardInfo + ", cardExpiration=" + this.cardExpiration + ", mperksNumber=" + this.mperksNumber + ", authorizationCode=" + this.authorizationCode + ", ebtCardInfo=" + this.ebtCardInfo + ", ebtCardExpiration=" + this.ebtCardExpiration + ", ebtTransactionInfo=" + this.ebtTransactionInfo + ", ebtFinalSnapPaymentLabel=" + this.ebtFinalSnapPaymentLabel + ", ebtFinalSnapPaymentValue=" + this.ebtFinalSnapPaymentValue + ", creditCardBalance=" + this.creditCardBalance + ", authorizationCodeVisibility=" + this.authorizationCodeVisibility + ", shouldDisplayEbtPaymentInfo=" + this.shouldDisplayEbtPaymentInfo + ')';
    }
}
