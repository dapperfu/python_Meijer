package hn;

import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator;
import es.AbstractC13866b;
import es.K;
import fj.CardType;
import fj.MultiTenderPaymentInfo;
import fj.PaymentDetailItem;
import fj.TendersItem;
import fj.TransactionDetails;
import hj.EbtTransaction;
import hj.OrderDetail;
import hn.OrderDetailSummaryDecorator;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rn.C16930b;
import wk.C17898a;
import yk.C18328d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0001\u0019B³\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J¼\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b)\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b3\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b.\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b2\u0010:\u001a\u0004\b5\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b1\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b<\u0010(R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b\u0015\u00100R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b9\u00100¨\u0006>"}, d2 = {"Lhn/n;", "Les/b;", "Lbk/a;", "title", "subtitle", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "cartOrderSummaryDecorator", "", "buttonVisibility", "ebtFinalSnapPaymentValue", "ebtBalanceWithDate", "", "Lhn/d;", "ebtTransactionList", "Lhn/c;", "creditCardTransactionList", "creditCardBalance", "Lfj/d;", "creditCardType", "creditCardLabel", "preAuthAmount", "isOrderComplete", "displayTipCreditCardCharge", "<init>", "(Lbk/a;Lbk/a;Lcom/meijer/mobile/meijer/activity/cart/n0;ZLbk/a;Lbk/a;Ljava/util/List;Ljava/util/List;Lbk/a;Lfj/d;Lbk/a;Lbk/a;ZZ)V", "a", "(Lbk/a;Lbk/a;Lcom/meijer/mobile/meijer/activity/cart/n0;ZLbk/a;Lbk/a;Ljava/util/List;Ljava/util/List;Lbk/a;Lfj/d;Lbk/a;Lbk/a;ZZ)Lhn/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lbk/a;", "o", "()Lbk/a;", "c", "n", "d", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "()Lcom/meijer/mobile/meijer/activity/cart/n0;", "e", "Z", "()Z", "f", "k", "g", "j", "h", "Ljava/util/List;", "l", "()Ljava/util/List;", "i", "Lfj/d;", "()Lfj/d;", "m", "p", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.n, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderDetailSummaryDecorator extends AbstractC13866b {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f135983q = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a subtitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartOrderSummaryDecorator cartOrderSummaryDecorator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean buttonVisibility;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a ebtFinalSnapPaymentValue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a ebtBalanceWithDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EbtTransactionItemDecorator> ebtTransactionList;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<C14544c> creditCardTransactionList;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a creditCardBalance;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardType creditCardType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a creditCardLabel;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a preAuthAmount;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderComplete;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayTipCreditCardCharge;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lhn/n$a;", "", "<init>", "()V", "Lhj/c;", "Lbk/a;", "f", "(Lhj/c;)Lbk/a;", "g", "orderDetail", "", "addSurchargeToTotalPrice", "isEZCDEnabled", "isShowCreditCardTransactionHistoryEnabled", "Lhn/n;", "b", "(Lhj/c;ZZZ)Lhn/n;", "Lfj/G;", "e", "(Lhj/c;)Lfj/G;", "creditPayment", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.n$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ OrderDetailSummaryDecorator c(Companion companion, OrderDetail orderDetail, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            if ((i10 & 8) != 0) {
                z12 = false;
            }
            return companion.b(orderDetail, z10, z11, z12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double d() {
            return 0.0d;
        }

        private final AbstractC6392a g(OrderDetail orderDetail) {
            return K.f130659a.b(orderDetail) ? AbstractC6392a.INSTANCE.d(Y.f100980i9, new Object[0]) : AbstractC6392a.INSTANCE.d(Y.f101101ob, new Object[0]);
        }

        public final OrderDetailSummaryDecorator b(OrderDetail orderDetail, boolean addSurchargeToTotalPrice, boolean isEZCDEnabled, boolean isShowCreditCardTransactionHistoryEnabled) {
            AbstractC6392a abstractC6392aD;
            CardType cardType;
            String formattedValue;
            TransactionDetails transactionDetails;
            ZonedDateTime zonedDateTimeAtZoneSameInstant;
            ZonedDateTime zonedDateTimeAtZoneSameInstant2;
            Intrinsics.j(orderDetail, "orderDetail");
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            boolean z10 = false;
            AbstractC6392a abstractC6392aD2 = companion.d(Y.f100842bb, new Object[0]);
            int i10 = Y.f101201tb;
            OffsetDateTime created = orderDetail.getCreated();
            AbstractC6392a abstractC6392aC = null;
            String str = (created == null || (zonedDateTimeAtZoneSameInstant2 = created.atZoneSameInstant(ZoneId.systemDefault())) == null) ? null : zonedDateTimeAtZoneSameInstant2.format(C17898a.f167225a.l());
            if (str == null) {
                str = "";
            }
            OffsetDateTime created2 = orderDetail.getCreated();
            String str2 = (created2 == null || (zonedDateTimeAtZoneSameInstant = created2.atZoneSameInstant(ZoneId.systemDefault())) == null) ? null : zonedDateTimeAtZoneSameInstant.format(C17898a.f167225a.q());
            if (str2 == null) {
                str2 = "";
            }
            AbstractC6392a abstractC6392aD3 = companion.d(i10, str, str2);
            CartOrderSummaryDecorator cartOrderSummaryDecoratorA = CartOrderSummaryDecorator.INSTANCE.a(orderDetail, addSurchargeToTotalPrice, isEZCDEnabled, isShowCreditCardTransactionHistoryEnabled);
            if (OrderDetail.INSTANCE.a(orderDetail) && !orderDetail.getPickUpSlotInfo().f()) {
                z10 = true;
            }
            boolean z11 = z10;
            orderDetail.getMultiTenderPaymentInfo();
            AbstractC6392a abstractC6392aC2 = companion.c(orderDetail.getEbtCapturedBalance().getFormattedValue());
            TendersItem tendersItemR = orderDetail.r();
            if (tendersItemR == null || (transactionDetails = tendersItemR.getTransactionDetails()) == null) {
                abstractC6392aD = null;
            } else {
                int i11 = Y.f100453H3;
                OffsetDateTime ebtCaptureDateTime = transactionDetails.getEbtCaptureDateTime();
                String str3 = ebtCaptureDateTime != null ? ebtCaptureDateTime.format(C17898a.DATE_FORMAT_MM_DD_YYYY) : null;
                abstractC6392aD = companion.d(i11, str3 != null ? str3 : "", Double.valueOf(C18328d.a(transactionDetails.getRemainingBalanceSNAP(), new Function0() { // from class: hn.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Double.valueOf(OrderDetailSummaryDecorator.Companion.d());
                    }
                }) / 100));
            }
            TendersItem tendersItemR2 = orderDetail.r();
            List<EbtTransaction> listS = orderDetail.s();
            if (listS == null) {
                listS = CollectionsKt.m();
            }
            List<EbtTransactionItemDecorator> listC = C16930b.c(tendersItemR2, listS);
            List<C14544c> listB = C16930b.b(orderDetail.R());
            AbstractC6392a abstractC6392aF = f(orderDetail);
            PaymentDetailItem paymentInfo = orderDetail.getPaymentInfo();
            if (paymentInfo == null || (cardType = paymentInfo.getCardType()) == null) {
                TendersItem tendersItemE = e(orderDetail);
                if (tendersItemE != null) {
                    CardType cardType2 = tendersItemE.getCardType();
                    cardType = cardType2;
                } else {
                    cardType = null;
                }
            } else {
                cardType = cardType2;
            }
            AbstractC6392a abstractC6392aG = g(orderDetail);
            nk.b creditTransactionAmount = orderDetail.getCreditTransactionAmount();
            if (creditTransactionAmount != null && (formattedValue = creditTransactionAmount.getFormattedValue()) != null) {
                abstractC6392aC = companion.c(formattedValue);
            }
            return new OrderDetailSummaryDecorator(abstractC6392aD2, abstractC6392aD3, cartOrderSummaryDecoratorA, z11, abstractC6392aC2, abstractC6392aD, listC, listB, abstractC6392aF, cardType, abstractC6392aG, abstractC6392aC, false, K.f130659a.e(orderDetail), RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, null);
        }

        private final TendersItem e(OrderDetail orderDetail) {
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

        private final AbstractC6392a f(OrderDetail orderDetail) {
            double value;
            nk.b rtsCapturedBalance = orderDetail.getRtsCapturedBalance();
            if (rtsCapturedBalance != null) {
                value = rtsCapturedBalance.getValue();
            } else {
                value = 0.0d;
            }
            return AbstractC6392a.INSTANCE.d(Y.f100837b6, Double.valueOf(value));
        }
    }

    public OrderDetailSummaryDecorator() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, false, false, 16383, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailSummaryDecorator)) {
            return false;
        }
        OrderDetailSummaryDecorator orderDetailSummaryDecorator = (OrderDetailSummaryDecorator) other;
        return Intrinsics.e(this.title, orderDetailSummaryDecorator.title) && Intrinsics.e(this.subtitle, orderDetailSummaryDecorator.subtitle) && Intrinsics.e(this.cartOrderSummaryDecorator, orderDetailSummaryDecorator.cartOrderSummaryDecorator) && this.buttonVisibility == orderDetailSummaryDecorator.buttonVisibility && Intrinsics.e(this.ebtFinalSnapPaymentValue, orderDetailSummaryDecorator.ebtFinalSnapPaymentValue) && Intrinsics.e(this.ebtBalanceWithDate, orderDetailSummaryDecorator.ebtBalanceWithDate) && Intrinsics.e(this.ebtTransactionList, orderDetailSummaryDecorator.ebtTransactionList) && Intrinsics.e(this.creditCardTransactionList, orderDetailSummaryDecorator.creditCardTransactionList) && Intrinsics.e(this.creditCardBalance, orderDetailSummaryDecorator.creditCardBalance) && Intrinsics.e(this.creditCardType, orderDetailSummaryDecorator.creditCardType) && Intrinsics.e(this.creditCardLabel, orderDetailSummaryDecorator.creditCardLabel) && Intrinsics.e(this.preAuthAmount, orderDetailSummaryDecorator.preAuthAmount) && this.isOrderComplete == orderDetailSummaryDecorator.isOrderComplete && this.displayTipCreditCardCharge == orderDetailSummaryDecorator.displayTipCreditCardCharge;
    }

    public /* synthetic */ OrderDetailSummaryDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, CartOrderSummaryDecorator cartOrderSummaryDecorator, boolean z10, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, List list, List list2, AbstractC6392a abstractC6392a5, CardType cardType, AbstractC6392a abstractC6392a6, AbstractC6392a abstractC6392a7, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC6392a, (i10 & 2) != 0 ? null : abstractC6392a2, (i10 & 4) != 0 ? new CartOrderSummaryDecorator(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, false, false, null, null, 134217727, null) : cartOrderSummaryDecorator, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : abstractC6392a3, (i10 & 32) != 0 ? null : abstractC6392a4, (i10 & 64) != 0 ? CollectionsKt.m() : list, (i10 & 128) != 0 ? CollectionsKt.m() : list2, (i10 & 256) != 0 ? null : abstractC6392a5, (i10 & 512) != 0 ? null : cardType, (i10 & 1024) != 0 ? null : abstractC6392a6, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? abstractC6392a7 : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11, (i10 & 8192) != 0 ? false : z12);
    }

    public final OrderDetailSummaryDecorator a(AbstractC6392a title, AbstractC6392a subtitle, CartOrderSummaryDecorator cartOrderSummaryDecorator, boolean buttonVisibility, AbstractC6392a ebtFinalSnapPaymentValue, AbstractC6392a ebtBalanceWithDate, List<EbtTransactionItemDecorator> ebtTransactionList, List<C14544c> creditCardTransactionList, AbstractC6392a creditCardBalance, CardType creditCardType, AbstractC6392a creditCardLabel, AbstractC6392a preAuthAmount, boolean isOrderComplete, boolean displayTipCreditCardCharge) {
        Intrinsics.j(cartOrderSummaryDecorator, "cartOrderSummaryDecorator");
        return new OrderDetailSummaryDecorator(title, subtitle, cartOrderSummaryDecorator, buttonVisibility, ebtFinalSnapPaymentValue, ebtBalanceWithDate, ebtTransactionList, creditCardTransactionList, creditCardBalance, creditCardType, creditCardLabel, preAuthAmount, isOrderComplete, displayTipCreditCardCharge);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getButtonVisibility() {
        return this.buttonVisibility;
    }

    /* renamed from: d, reason: from getter */
    public final CartOrderSummaryDecorator getCartOrderSummaryDecorator() {
        return this.cartOrderSummaryDecorator;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getCreditCardBalance() {
        return this.creditCardBalance;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC6392a getCreditCardLabel() {
        return this.creditCardLabel;
    }

    public final List<C14544c> g() {
        return this.creditCardTransactionList;
    }

    /* renamed from: h, reason: from getter */
    public final CardType getCreditCardType() {
        return this.creditCardType;
    }

    public int hashCode() {
        AbstractC6392a abstractC6392a = this.title;
        int iHashCode = (abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31;
        AbstractC6392a abstractC6392a2 = this.subtitle;
        int iHashCode2 = (((((iHashCode + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31) + this.cartOrderSummaryDecorator.hashCode()) * 31) + Boolean.hashCode(this.buttonVisibility)) * 31;
        AbstractC6392a abstractC6392a3 = this.ebtFinalSnapPaymentValue;
        int iHashCode3 = (iHashCode2 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31;
        AbstractC6392a abstractC6392a4 = this.ebtBalanceWithDate;
        int iHashCode4 = (iHashCode3 + (abstractC6392a4 == null ? 0 : abstractC6392a4.hashCode())) * 31;
        List<EbtTransactionItemDecorator> list = this.ebtTransactionList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<C14544c> list2 = this.creditCardTransactionList;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AbstractC6392a abstractC6392a5 = this.creditCardBalance;
        int iHashCode7 = (iHashCode6 + (abstractC6392a5 == null ? 0 : abstractC6392a5.hashCode())) * 31;
        CardType cardType = this.creditCardType;
        int iHashCode8 = (iHashCode7 + (cardType == null ? 0 : cardType.hashCode())) * 31;
        AbstractC6392a abstractC6392a6 = this.creditCardLabel;
        int iHashCode9 = (iHashCode8 + (abstractC6392a6 == null ? 0 : abstractC6392a6.hashCode())) * 31;
        AbstractC6392a abstractC6392a7 = this.preAuthAmount;
        return ((((iHashCode9 + (abstractC6392a7 != null ? abstractC6392a7.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOrderComplete)) * 31) + Boolean.hashCode(this.displayTipCreditCardCharge);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getDisplayTipCreditCardCharge() {
        return this.displayTipCreditCardCharge;
    }

    /* renamed from: j, reason: from getter */
    public final AbstractC6392a getEbtBalanceWithDate() {
        return this.ebtBalanceWithDate;
    }

    /* renamed from: k, reason: from getter */
    public final AbstractC6392a getEbtFinalSnapPaymentValue() {
        return this.ebtFinalSnapPaymentValue;
    }

    public final List<EbtTransactionItemDecorator> l() {
        return this.ebtTransactionList;
    }

    /* renamed from: m, reason: from getter */
    public final AbstractC6392a getPreAuthAmount() {
        return this.preAuthAmount;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC6392a getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: o, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public String toString() {
        return "OrderDetailSummaryDecorator(title=" + this.title + ", subtitle=" + this.subtitle + ", cartOrderSummaryDecorator=" + this.cartOrderSummaryDecorator + ", buttonVisibility=" + this.buttonVisibility + ", ebtFinalSnapPaymentValue=" + this.ebtFinalSnapPaymentValue + ", ebtBalanceWithDate=" + this.ebtBalanceWithDate + ", ebtTransactionList=" + this.ebtTransactionList + ", creditCardTransactionList=" + this.creditCardTransactionList + ", creditCardBalance=" + this.creditCardBalance + ", creditCardType=" + this.creditCardType + ", creditCardLabel=" + this.creditCardLabel + ", preAuthAmount=" + this.preAuthAmount + ", isOrderComplete=" + this.isOrderComplete + ", displayTipCreditCardCharge=" + this.displayTipCreditCardCharge + ')';
    }

    public OrderDetailSummaryDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, CartOrderSummaryDecorator cartOrderSummaryDecorator, boolean z10, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, List<EbtTransactionItemDecorator> list, List<C14544c> list2, AbstractC6392a abstractC6392a5, CardType cardType, AbstractC6392a abstractC6392a6, AbstractC6392a abstractC6392a7, boolean z11, boolean z12) {
        Intrinsics.j(cartOrderSummaryDecorator, "cartOrderSummaryDecorator");
        this.title = abstractC6392a;
        this.subtitle = abstractC6392a2;
        this.cartOrderSummaryDecorator = cartOrderSummaryDecorator;
        this.buttonVisibility = z10;
        this.ebtFinalSnapPaymentValue = abstractC6392a3;
        this.ebtBalanceWithDate = abstractC6392a4;
        this.ebtTransactionList = list;
        this.creditCardTransactionList = list2;
        this.creditCardBalance = abstractC6392a5;
        this.creditCardType = cardType;
        this.creditCardLabel = abstractC6392a6;
        this.preAuthAmount = abstractC6392a7;
        this.isOrderComplete = z11;
        this.displayTipCreditCardCharge = z12;
    }
}
