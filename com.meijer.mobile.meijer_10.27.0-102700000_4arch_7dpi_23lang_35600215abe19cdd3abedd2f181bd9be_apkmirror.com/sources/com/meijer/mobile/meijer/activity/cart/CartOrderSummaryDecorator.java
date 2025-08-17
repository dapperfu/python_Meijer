package com.meijer.mobile.meijer.activity.cart;

import Fo.Savings;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import ej.AvailableFulfillmentEligibility;
import ej.DeliveryMode;
import ej.ShoppingCart;
import ej.TendersItem;
import ej.TransactionDetails;
import gj.OrderDetail;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wo.C17842a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0081\b\u0018\u0000 y2\u00020\u0001:\u000251B¥\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019\u0012\b\b\u0002\u0010 \u001a\u00020\u0019\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b1\u00107R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u00104R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u00104R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u00104R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u00104R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\b8\u00104R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u00104R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b@\u00104R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b<\u0010RR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bO\u0010T\u001a\u0004\bW\u0010VR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b=\u0010X\u001a\u0004\bB\u0010YR\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010TR\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\bE\u0010YR\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\\\u0010X\u001a\u0004\bJ\u0010YR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b]\u00102\u001a\u0004\bP\u00104R\u0017\u0010\u001f\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b^\u0010X\u001a\u0004\b\u001f\u0010YR\u0017\u0010 \u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\bZ\u0010YR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020f0!8\u0006¢\u0006\f\n\u0004\bg\u0010a\u001a\u0004\b5\u0010cR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020f0!8\u0006¢\u0006\f\n\u0004\bi\u0010a\u001a\u0004\bC\u0010cR\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020f0!8\u0006¢\u0006\f\n\u0004\bk\u0010a\u001a\u0004\bF\u0010cR\u0019\u0010p\u001a\u0004\u0018\u00010f8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bS\u0010oR\u0017\u0010r\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bq\u0010n\u001a\u0004\b>\u0010oR\u0019\u0010t\u001a\u0004\u0018\u00010f8\u0006¢\u0006\f\n\u0004\bs\u0010n\u001a\u0004\b:\u0010oR\u0019\u0010v\u001a\u0004\u0018\u00010f8\u0006¢\u0006\f\n\u0004\bu\u0010n\u001a\u0004\bL\u0010oR\u0019\u0010x\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bw\u0010T\u001a\u0004\bN\u0010V¨\u0006z"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/n0;", "", "Lmk/b;", "subtotal", "Lej/h;", "deliveryMode", "depositPrice", "extendedRangeDeliveryFee", "totalTax", "itemsTotal", "totalCosts", "ebtEligibleTotal", "ebtNonEligibleTotal", "ebtSurchargePrice", "LFo/c;", "salesSaving", "mPerksAndPromosSaving", "teamMemberSavings", "totalSavings", "estimatedTotal", "Lej/J;", "ebtTransactionDetails", "Lak/a;", "itemsTotalLabel", "estimatedTotalLabel", "", "finalDiscountTextIsVisible", "formattedNumberOfItems", "promoCodeFieldVisibility", "shouldDisplayEbtFields", "tip", "isEZCDEnabled", "isDisplayCreditCardTransactionHistory", "", "Lej/b;", "availableFulfillmentPartners", "Lej/o;", "selectedFulfillmentPartner", "<init>", "(Lmk/b;Lej/h;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;LFo/c;LFo/c;LFo/c;LFo/c;Lmk/b;Lej/J;Lak/a;Lak/a;ZLak/a;ZZLmk/b;ZZLjava/util/List;Lej/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/b;", "o", "()Lmk/b;", "b", "Lej/h;", "()Lej/h;", "c", "getDepositPrice", "d", "getExtendedRangeDeliveryFee", "e", "s", "f", "getItemsTotal", "g", "getTotalCosts", "h", "i", "getEbtNonEligibleTotal", "j", "k", "LFo/c;", "getSalesSaving", "()LFo/c;", "l", "getMPerksAndPromosSaving", "m", "getTeamMemberSavings", "n", "r", "p", "Lej/J;", "()Lej/J;", "q", "Lak/a;", "getItemsTotalLabel", "()Lak/a;", "getEstimatedTotalLabel", "Z", "()Z", "t", "u", "v", "w", "x", "y", "z", "Ljava/util/List;", "getAvailableFulfillmentPartners", "()Ljava/util/List;", "A", "Lej/o;", "Lcom/meijer/mobile/meijer/activity/cart/n0$b;", "B", "ebtEligibilityList", "C", "priceList", "D", "savingsList", "E", "Lcom/meijer/mobile/meijer/activity/cart/n0$b;", "()Lcom/meijer/mobile/meijer/activity/cart/n0$b;", "tipDecorator", "F", "estimatedPrice", "G", "ebtOveragePrice", "H", "snapRefund", "I", "snapRefundTransId", "J", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.cart.n0, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CartOrderSummaryDecorator {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: K, reason: collision with root package name */
    public static final int f101878K = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final ej.o selectedFulfillmentPartner;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final List<PriceDecorator> ebtEligibilityList;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final List<PriceDecorator> priceList;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final List<PriceDecorator> savingsList;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final PriceDecorator tipDecorator;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final PriceDecorator estimatedPrice;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final PriceDecorator ebtOveragePrice;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final PriceDecorator snapRefund;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a snapRefundTransId;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b subtotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryMode deliveryMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b depositPrice;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b extendedRangeDeliveryFee;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalTax;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b itemsTotal;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalCosts;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtEligibleTotal;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtNonEligibleTotal;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtSurchargePrice;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings salesSaving;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings mPerksAndPromosSaving;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings teamMemberSavings;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings totalSavings;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b estimatedTotal;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionDetails ebtTransactionDetails;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a itemsTotalLabel;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a estimatedTotalLabel;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean finalDiscountTextIsVisible;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a formattedNumberOfItems;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean promoCodeFieldVisibility;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldDisplayEbtFields;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b tip;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEZCDEnabled;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDisplayCreditCardTransactionHistory;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableFulfillmentEligibility> availableFulfillmentPartners;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/n0$a;", "", "<init>", "()V", "Lej/C;", "cart", "", "promoCodeFieldVisibility", "addSurchargeToTotalPrice", "isEZCDEnabled", "isDisplayCreditCardTransactionHistory", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "b", "(Lej/C;ZZZZ)Lcom/meijer/mobile/meijer/activity/cart/n0;", "Lgj/c;", "orderDetail", "a", "(Lgj/c;ZZZ)Lcom/meijer/mobile/meijer/activity/cart/n0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.cart.n0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CartOrderSummaryDecorator c(Companion companion, ShoppingCart shoppingCart, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return companion.b(shoppingCart, z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13);
        }

        public final CartOrderSummaryDecorator a(OrderDetail orderDetail, boolean addSurchargeToTotalPrice, boolean isEZCDEnabled, boolean isDisplayCreditCardTransactionHistory) {
            Intrinsics.j(orderDetail, "orderDetail");
            AbstractC5607a abstractC5607aD = orderDetail.getIsFinal() ? AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100420xc, new Object[0]) : AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100260pc, new Object[0]);
            mk.b subTotal = orderDetail.getSubTotal();
            DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
            mk.b extendedDeliveryCost = orderDetail.getExtendedDeliveryCost();
            mk.b depositPrice = orderDetail.getDepositPrice();
            mk.b totalTax = orderDetail.getTotalTax();
            mk.b itemsTotal = orderDetail.getItemsTotal();
            mk.b ebtEligibleTotal = orderDetail.getEbtEligibleTotal();
            mk.b ebtNonEligibleTotal = orderDetail.getEbtNonEligibleTotal();
            mk.b ebtSurchargePrice = orderDetail.getEbtSurchargePrice();
            mk.b totalCosts = orderDetail.getTotalCosts();
            Savings totalSavings = orderDetail.getTotalSavings();
            Savings mperksSavings = orderDetail.getMperksSavings();
            Savings teamMemberSavings = orderDetail.getTeamMemberSavings();
            Savings specialsSavings = orderDetail.getSpecialsSavings();
            double value = orderDetail.getTotalPriceWithTax().getValue() + (addSurchargeToTotalPrice ? orderDetail.getEbtSurchargePrice().getValue() : 0.0d);
            String currencyIso = orderDetail.getTotalPriceWithTax().getCurrencyIso();
            if (currencyIso == null) {
                currencyIso = "";
            }
            mk.b bVarF = Co.l.f(currencyIso, null, value, C11758o0.b(Fk.g.c(value)), 0.0d, null, 50, null);
            TendersItem tendersItemR = orderDetail.r();
            return new CartOrderSummaryDecorator(subTotal, deliveryMode, depositPrice, extendedDeliveryCost, totalTax, itemsTotal, totalCosts, ebtEligibleTotal, ebtNonEligibleTotal, ebtSurchargePrice, specialsSavings, mperksSavings, teamMemberSavings, totalSavings, bVarF, tendersItemR != null ? tendersItemR.getTransactionDetails() : null, null, abstractC5607aD, !orderDetail.getIsFinal(), AbstractC5607a.INSTANCE.b(C17842a.f166237a, orderDetail.getTotalItems(), new Object[0]), false, (orderDetail.getMultiTenderPaymentInfo() == null || es.K.f129818a.a(orderDetail)) ? false : true, orderDetail.getTipAndRateDetails().getTipDetails().getTipped() ? orderDetail.getTipAndRateDetails().getTipDetails().getTipAmount() : null, isEZCDEnabled, isDisplayCreditCardTransactionHistory, null, null, 100728832, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator b(ej.ShoppingCart r32, boolean r33, boolean r34, boolean r35, boolean r36) {
            /*
                Method dump skipped, instructions count: 273
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator.Companion.b(ej.C, boolean, boolean, boolean, boolean):com.meijer.mobile.meijer.activity.cart.n0");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b\f\u0010\u001f¨\u0006&"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/n0$b;", "", "Lak/a;", "label", "value", "", "isLabelSemiBold", "isValueSemiBold", "isValueHighlighted", "hasDivider", "isInfoIcon", "infoContent", "isValueBold", "<init>", "(Lak/a;Lak/a;ZZZZZLak/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "b", "()Lak/a;", "c", "Z", "e", "()Z", "d", "g", "f", "h", "getInfoContent", "i", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.n0$b, reason: from toString */
    public static final /* data */ class PriceDecorator {

        /* renamed from: j, reason: collision with root package name */
        public static final int f101914j = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a label;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a value;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLabelSemiBold;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValueSemiBold;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValueHighlighted;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasDivider;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isInfoIcon;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a infoContent;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValueBold;

        public PriceDecorator(AbstractC5607a label, AbstractC5607a value, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC5607a infoContent, boolean z15) {
            Intrinsics.j(label, "label");
            Intrinsics.j(value, "value");
            Intrinsics.j(infoContent, "infoContent");
            this.label = label;
            this.value = value;
            this.isLabelSemiBold = z10;
            this.isValueSemiBold = z11;
            this.isValueHighlighted = z12;
            this.hasDivider = z13;
            this.isInfoIcon = z14;
            this.infoContent = infoContent;
            this.isValueBold = z15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDecorator)) {
                return false;
            }
            PriceDecorator priceDecorator = (PriceDecorator) other;
            return Intrinsics.e(this.label, priceDecorator.label) && Intrinsics.e(this.value, priceDecorator.value) && this.isLabelSemiBold == priceDecorator.isLabelSemiBold && this.isValueSemiBold == priceDecorator.isValueSemiBold && this.isValueHighlighted == priceDecorator.isValueHighlighted && this.hasDivider == priceDecorator.hasDivider && this.isInfoIcon == priceDecorator.isInfoIcon && Intrinsics.e(this.infoContent, priceDecorator.infoContent) && this.isValueBold == priceDecorator.isValueBold;
        }

        public int hashCode() {
            return (((((((((((((((this.label.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isLabelSemiBold)) * 31) + Boolean.hashCode(this.isValueSemiBold)) * 31) + Boolean.hashCode(this.isValueHighlighted)) * 31) + Boolean.hashCode(this.hasDivider)) * 31) + Boolean.hashCode(this.isInfoIcon)) * 31) + this.infoContent.hashCode()) * 31) + Boolean.hashCode(this.isValueBold);
        }

        public String toString() {
            return "PriceDecorator(label=" + this.label + ", value=" + this.value + ", isLabelSemiBold=" + this.isLabelSemiBold + ", isValueSemiBold=" + this.isValueSemiBold + ", isValueHighlighted=" + this.isValueHighlighted + ", hasDivider=" + this.hasDivider + ", isInfoIcon=" + this.isInfoIcon + ", infoContent=" + this.infoContent + ", isValueBold=" + this.isValueBold + ')';
        }

        /* renamed from: a, reason: from getter */
        public final boolean getHasDivider() {
            return this.hasDivider;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC5607a getLabel() {
            return this.label;
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC5607a getValue() {
            return this.value;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsInfoIcon() {
            return this.isInfoIcon;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsLabelSemiBold() {
            return this.isLabelSemiBold;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsValueHighlighted() {
            return this.isValueHighlighted;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsValueSemiBold() {
            return this.isValueSemiBold;
        }

        public /* synthetic */ PriceDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC5607a abstractC5607a3, boolean z15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC5607a, abstractC5607a2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13, (i10 & 64) != 0 ? false : z14, (i10 & 128) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a3, (i10 & 256) != 0 ? false : z15);
        }
    }

    public CartOrderSummaryDecorator() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, false, false, null, null, 134217727, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartOrderSummaryDecorator)) {
            return false;
        }
        CartOrderSummaryDecorator cartOrderSummaryDecorator = (CartOrderSummaryDecorator) other;
        return Intrinsics.e(this.subtotal, cartOrderSummaryDecorator.subtotal) && Intrinsics.e(this.deliveryMode, cartOrderSummaryDecorator.deliveryMode) && Intrinsics.e(this.depositPrice, cartOrderSummaryDecorator.depositPrice) && Intrinsics.e(this.extendedRangeDeliveryFee, cartOrderSummaryDecorator.extendedRangeDeliveryFee) && Intrinsics.e(this.totalTax, cartOrderSummaryDecorator.totalTax) && Intrinsics.e(this.itemsTotal, cartOrderSummaryDecorator.itemsTotal) && Intrinsics.e(this.totalCosts, cartOrderSummaryDecorator.totalCosts) && Intrinsics.e(this.ebtEligibleTotal, cartOrderSummaryDecorator.ebtEligibleTotal) && Intrinsics.e(this.ebtNonEligibleTotal, cartOrderSummaryDecorator.ebtNonEligibleTotal) && Intrinsics.e(this.ebtSurchargePrice, cartOrderSummaryDecorator.ebtSurchargePrice) && Intrinsics.e(this.salesSaving, cartOrderSummaryDecorator.salesSaving) && Intrinsics.e(this.mPerksAndPromosSaving, cartOrderSummaryDecorator.mPerksAndPromosSaving) && Intrinsics.e(this.teamMemberSavings, cartOrderSummaryDecorator.teamMemberSavings) && Intrinsics.e(this.totalSavings, cartOrderSummaryDecorator.totalSavings) && Intrinsics.e(this.estimatedTotal, cartOrderSummaryDecorator.estimatedTotal) && Intrinsics.e(this.ebtTransactionDetails, cartOrderSummaryDecorator.ebtTransactionDetails) && Intrinsics.e(this.itemsTotalLabel, cartOrderSummaryDecorator.itemsTotalLabel) && Intrinsics.e(this.estimatedTotalLabel, cartOrderSummaryDecorator.estimatedTotalLabel) && this.finalDiscountTextIsVisible == cartOrderSummaryDecorator.finalDiscountTextIsVisible && Intrinsics.e(this.formattedNumberOfItems, cartOrderSummaryDecorator.formattedNumberOfItems) && this.promoCodeFieldVisibility == cartOrderSummaryDecorator.promoCodeFieldVisibility && this.shouldDisplayEbtFields == cartOrderSummaryDecorator.shouldDisplayEbtFields && Intrinsics.e(this.tip, cartOrderSummaryDecorator.tip) && this.isEZCDEnabled == cartOrderSummaryDecorator.isEZCDEnabled && this.isDisplayCreditCardTransactionHistory == cartOrderSummaryDecorator.isDisplayCreditCardTransactionHistory && Intrinsics.e(this.availableFulfillmentPartners, cartOrderSummaryDecorator.availableFulfillmentPartners) && this.selectedFulfillmentPartner == cartOrderSummaryDecorator.selectedFulfillmentPartner;
    }

    public int hashCode() {
        int iHashCode = this.subtotal.hashCode() * 31;
        DeliveryMode deliveryMode = this.deliveryMode;
        int iHashCode2 = (((iHashCode + (deliveryMode == null ? 0 : deliveryMode.hashCode())) * 31) + this.depositPrice.hashCode()) * 31;
        mk.b bVar = this.extendedRangeDeliveryFee;
        int iHashCode3 = (((((((((((((((((((((((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.totalTax.hashCode()) * 31) + this.itemsTotal.hashCode()) * 31) + this.totalCosts.hashCode()) * 31) + this.ebtEligibleTotal.hashCode()) * 31) + this.ebtNonEligibleTotal.hashCode()) * 31) + this.ebtSurchargePrice.hashCode()) * 31) + this.salesSaving.hashCode()) * 31) + this.mPerksAndPromosSaving.hashCode()) * 31) + this.teamMemberSavings.hashCode()) * 31) + this.totalSavings.hashCode()) * 31) + this.estimatedTotal.hashCode()) * 31;
        TransactionDetails transactionDetails = this.ebtTransactionDetails;
        int iHashCode4 = (((((((((((((iHashCode3 + (transactionDetails == null ? 0 : transactionDetails.hashCode())) * 31) + this.itemsTotalLabel.hashCode()) * 31) + this.estimatedTotalLabel.hashCode()) * 31) + Boolean.hashCode(this.finalDiscountTextIsVisible)) * 31) + this.formattedNumberOfItems.hashCode()) * 31) + Boolean.hashCode(this.promoCodeFieldVisibility)) * 31) + Boolean.hashCode(this.shouldDisplayEbtFields)) * 31;
        mk.b bVar2 = this.tip;
        int iHashCode5 = (((((((iHashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31) + Boolean.hashCode(this.isEZCDEnabled)) * 31) + Boolean.hashCode(this.isDisplayCreditCardTransactionHistory)) * 31) + this.availableFulfillmentPartners.hashCode()) * 31;
        ej.o oVar = this.selectedFulfillmentPartner;
        return iHashCode5 + (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "CartOrderSummaryDecorator(subtotal=" + this.subtotal + ", deliveryMode=" + this.deliveryMode + ", depositPrice=" + this.depositPrice + ", extendedRangeDeliveryFee=" + this.extendedRangeDeliveryFee + ", totalTax=" + this.totalTax + ", itemsTotal=" + this.itemsTotal + ", totalCosts=" + this.totalCosts + ", ebtEligibleTotal=" + this.ebtEligibleTotal + ", ebtNonEligibleTotal=" + this.ebtNonEligibleTotal + ", ebtSurchargePrice=" + this.ebtSurchargePrice + ", salesSaving=" + this.salesSaving + ", mPerksAndPromosSaving=" + this.mPerksAndPromosSaving + ", teamMemberSavings=" + this.teamMemberSavings + ", totalSavings=" + this.totalSavings + ", estimatedTotal=" + this.estimatedTotal + ", ebtTransactionDetails=" + this.ebtTransactionDetails + ", itemsTotalLabel=" + this.itemsTotalLabel + ", estimatedTotalLabel=" + this.estimatedTotalLabel + ", finalDiscountTextIsVisible=" + this.finalDiscountTextIsVisible + ", formattedNumberOfItems=" + this.formattedNumberOfItems + ", promoCodeFieldVisibility=" + this.promoCodeFieldVisibility + ", shouldDisplayEbtFields=" + this.shouldDisplayEbtFields + ", tip=" + this.tip + ", isEZCDEnabled=" + this.isEZCDEnabled + ", isDisplayCreditCardTransactionHistory=" + this.isDisplayCreditCardTransactionHistory + ", availableFulfillmentPartners=" + this.availableFulfillmentPartners + ", selectedFulfillmentPartner=" + this.selectedFulfillmentPartner + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CartOrderSummaryDecorator(mk.b r34, ej.DeliveryMode r35, mk.b r36, mk.b r37, mk.b r38, mk.b r39, mk.b r40, mk.b r41, mk.b r42, mk.b r43, Fo.Savings r44, Fo.Savings r45, Fo.Savings r46, Fo.Savings r47, mk.b r48, ej.TransactionDetails r49, ak.AbstractC5607a r50, ak.AbstractC5607a r51, boolean r52, ak.AbstractC5607a r53, boolean r54, boolean r55, mk.b r56, boolean r57, boolean r58, java.util.List<ej.AvailableFulfillmentEligibility> r59, ej.o r60) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator.<init>(mk.b, ej.h, mk.b, mk.b, mk.b, mk.b, mk.b, mk.b, mk.b, mk.b, Fo.c, Fo.c, Fo.c, Fo.c, mk.b, ej.J, ak.a, ak.a, boolean, ak.a, boolean, boolean, mk.b, boolean, boolean, java.util.List, ej.o):void");
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    public final List<PriceDecorator> b() {
        return this.ebtEligibilityList;
    }

    /* renamed from: c, reason: from getter */
    public final mk.b getEbtEligibleTotal() {
        return this.ebtEligibleTotal;
    }

    /* renamed from: d, reason: from getter */
    public final PriceDecorator getEbtOveragePrice() {
        return this.ebtOveragePrice;
    }

    /* renamed from: e, reason: from getter */
    public final TransactionDetails getEbtTransactionDetails() {
        return this.ebtTransactionDetails;
    }

    /* renamed from: f, reason: from getter */
    public final PriceDecorator getEstimatedPrice() {
        return this.estimatedPrice;
    }

    /* renamed from: g, reason: from getter */
    public final mk.b getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getFinalDiscountTextIsVisible() {
        return this.finalDiscountTextIsVisible;
    }

    public final List<PriceDecorator> i() {
        return this.priceList;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getPromoCodeFieldVisibility() {
        return this.promoCodeFieldVisibility;
    }

    public final List<PriceDecorator> k() {
        return this.savingsList;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getShouldDisplayEbtFields() {
        return this.shouldDisplayEbtFields;
    }

    /* renamed from: m, reason: from getter */
    public final PriceDecorator getSnapRefund() {
        return this.snapRefund;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC5607a getSnapRefundTransId() {
        return this.snapRefundTransId;
    }

    /* renamed from: o, reason: from getter */
    public final mk.b getSubtotal() {
        return this.subtotal;
    }

    /* renamed from: p, reason: from getter */
    public final mk.b getTip() {
        return this.tip;
    }

    /* renamed from: q, reason: from getter */
    public final PriceDecorator getTipDecorator() {
        return this.tipDecorator;
    }

    /* renamed from: r, reason: from getter */
    public final Savings getTotalSavings() {
        return this.totalSavings;
    }

    /* renamed from: s, reason: from getter */
    public final mk.b getTotalTax() {
        return this.totalTax;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsDisplayCreditCardTransactionHistory() {
        return this.isDisplayCreditCardTransactionHistory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CartOrderSummaryDecorator(mk.b bVar, DeliveryMode deliveryMode, mk.b bVar2, mk.b bVar3, mk.b bVar4, mk.b bVar5, mk.b bVar6, mk.b bVar7, mk.b bVar8, mk.b bVar9, Savings savings, Savings savings2, Savings savings3, Savings savings4, mk.b bVar10, TransactionDetails transactionDetails, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z10, AbstractC5607a abstractC5607a3, boolean z11, boolean z12, mk.b bVar11, boolean z13, boolean z14, List list, ej.o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        DeliveryMode deliveryMode2;
        mk.b bVar12;
        AbstractC5607a abstractC5607aD;
        AbstractC5607a abstractC5607a4;
        AbstractC5607a abstractC5607aD2;
        AbstractC5607a abstractC5607a5;
        boolean z15;
        AbstractC5607a abstractC5607aB;
        ej.o fulfillmentPartner;
        Object next;
        mk.b bVarF = (i10 & 1) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar;
        DeliveryMode deliveryMode3 = (i10 & 2) != 0 ? null : deliveryMode;
        mk.b bVarF2 = (i10 & 4) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar2;
        mk.b bVar13 = (i10 & 8) != 0 ? null : bVar3;
        mk.b bVarF3 = (i10 & 16) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar4;
        mk.b bVarF4 = (i10 & 32) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar5;
        mk.b bVarF5 = (i10 & 64) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar6;
        mk.b bVarF6 = (i10 & 128) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar7;
        mk.b bVarF7 = (i10 & 256) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar8;
        mk.b bVarF8 = (i10 & 512) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar9;
        Savings savings5 = (i10 & 1024) != 0 ? new Savings(null, 0.0d, 3, null) : savings;
        Savings savings6 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? new Savings(null, 0.0d, 3, null) : savings2;
        Savings savings7 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new Savings(null, 0.0d, 3, null) : savings3;
        Savings savings8 = (i10 & 8192) != 0 ? new Savings(null, 0.0d, 3, null) : savings4;
        mk.b bVarF9 = (i10 & 16384) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar10;
        TransactionDetails transactionDetails2 = (i10 & 32768) != 0 ? null : transactionDetails;
        mk.b bVar14 = bVarF;
        if ((i10 & 65536) != 0) {
            deliveryMode2 = deliveryMode3;
            bVar12 = bVarF9;
            abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100280qc, new Object[0]);
        } else {
            deliveryMode2 = deliveryMode3;
            bVar12 = bVarF9;
            abstractC5607aD = abstractC5607a;
        }
        if ((i10 & 131072) != 0) {
            abstractC5607a4 = abstractC5607aD;
            abstractC5607aD2 = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100260pc, new Object[0]);
        } else {
            abstractC5607a4 = abstractC5607aD;
            abstractC5607aD2 = abstractC5607a2;
        }
        boolean z16 = (i10 & 262144) != 0 ? false : z10;
        if ((i10 & 524288) != 0) {
            abstractC5607a5 = abstractC5607aD2;
            z15 = z16;
            abstractC5607aB = AbstractC5607a.INSTANCE.b(C17842a.f166237a, 0, new Object[0]);
        } else {
            abstractC5607a5 = abstractC5607aD2;
            z15 = z16;
            abstractC5607aB = abstractC5607a3;
        }
        boolean z17 = (i10 & 1048576) != 0 ? true : z11;
        boolean z18 = (i10 & 2097152) != 0 ? false : z12;
        mk.b bVar15 = (i10 & 4194304) != 0 ? null : bVar11;
        boolean z19 = (i10 & 8388608) != 0 ? false : z13;
        boolean z20 = (i10 & 16777216) == 0 ? z14 : false;
        List listM = (i10 & 33554432) != 0 ? CollectionsKt.m() : list;
        if ((i10 & 67108864) != 0) {
            Iterator it = listM.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((AvailableFulfillmentEligibility) next).getIsSelected()) {
                        break;
                    }
                }
            }
            AvailableFulfillmentEligibility availableFulfillmentEligibility = (AvailableFulfillmentEligibility) next;
            fulfillmentPartner = availableFulfillmentEligibility != null ? availableFulfillmentEligibility.getFulfillmentPartner() : null;
        } else {
            fulfillmentPartner = oVar;
        }
        this(bVar14, deliveryMode2, bVarF2, bVar13, bVarF3, bVarF4, bVarF5, bVarF6, bVarF7, bVarF8, savings5, savings6, savings7, savings8, bVar12, transactionDetails2, abstractC5607a4, abstractC5607a5, z15, abstractC5607aB, z17, z18, bVar15, z19, z20, listM, fulfillmentPartner);
    }
}
