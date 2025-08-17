package Ao;

import Ao.W;
import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJk\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\n\u0010\u0010\u001a\u00060\u0007j\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0010\u001a\u00060\u0007j\u0002`\u000f2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJO\u0010%\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00072\n\u0010\u0010\u001a\u00060\u0007j\u0002`\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130#¢\u0006\u0004\b%\u0010&Jc\u0010-\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130#¢\u0006\u0004\b-\u0010.Jc\u00101\u001a\u00020\u00172\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130#2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"LAo/A;", "", "<init>", "()V", "", "isEditMode", "isCartEditOrder", "", "g", "(ZLjava/lang/Boolean;)Ljava/lang/String;", "deliveryMode", "f", "(Ljava/lang/String;)Ljava/lang/String;", "totalItems", "estimatedTotal", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "savingsValue", "", "LAo/W$b;", "trackingAnalyticsProducts", "isBopasEligible", "fulfillmentEligibility", "Lhi/f;", "h", "(ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lhi/f;", "dismissSelected", "lowStockProducts", "", "actualQuantity", "n", "(ZLjava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;DLjava/lang/String;)Lhi/f;", "dateForAdobeTag", "timeForAdobeTag", "isContinue", "", "products", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lhi/f;", "substitution", "totalTax", "deliveryCost", "deliveryNote", "zipCode", "pickUpStore", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lhi/f;", "orderFees", "phoneNumber", "j", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhi/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f1157a = new A();

    private final String f(String deliveryMode) {
        return Intrinsics.e(deliveryMode, "delivery") ? "deliveryDate" : "pickupDate";
    }

    private final String g(boolean isEditMode, Boolean isCartEditOrder) {
        return isEditMode ? "Cart: edit items" : Intrinsics.e(isCartEditOrder, Boolean.TRUE) ? "Cart: edit order" : "cart page";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.h("Cart Items Count", str);
        TrackingData.h("CartEstimatedValue", str2);
        TrackingData.h("cartID", str3);
        TrackingData.h("cartSavings", str4);
        TrackingData.h("fulfillmentMethod", str5);
        TrackingData.e(W.j(list));
        TrackingData.h("bopasEligibleCart", str6);
        TrackingData.h("fulfillmentEligibility", str7);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.e(W.j(list));
        TrackingData.h("brandSubstitution", str);
        TrackingData.h("fulfillmentType", str2);
        TrackingData.h("orderFees", str3);
        TrackingData.h("orderTaxAmount", str4);
        TrackingData.h("phoneNumber", str5);
        TrackingData.h(f1157a.f(str2), str6);
        TrackingData.h("pickupStore", str7);
        TrackingData.h("timeslotSelected", str8);
        TrackingData.h("zipcode", str9);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.o("checkout review order");
        TrackingData.h(f1157a.f(str), str2);
        TrackingData.h("fulfillmentType", str);
        TrackingData.h("brandSubstitution", str3);
        TrackingData.h("timeslotSelected", str4);
        TrackingData.h("orderTaxAmount", str5);
        TrackingData.h("orderFees", str6);
        TrackingData.h("deliveryNote", str7);
        TrackingData.h("zipcode", str8);
        TrackingData.h("pickupStore", str9);
        TrackingData.e(W.j(list));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z10, Boolean bool, String str, double d10, String str2, String str3, boolean z11, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(f1157a.g(z10, bool));
        TrackingData.h("cartID", str);
        TrackingData.c(W.f1200a.k(Double.valueOf(d10)));
        TrackingData.h("Cart Items Count", str2);
        TrackingData.h("lowStockProducts", str3);
        TrackingData.h(z11 ? "DismissSelected" : "AddBackupSelected", "yes");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(String str, String str2, String str3, boolean z10, String str4, String str5, List list, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.o("checkout review order");
        TrackingData.v("cart");
        TrackingData.h(f1157a.f(str), str2);
        TrackingData.h("fulfillmentType", str);
        TrackingData.h("timeslotSelected", str3);
        TrackingData.h("optionSelected", z10 ? "Continue" : "Update Date");
        TrackingData.h("CartEstimatedValue", str4);
        TrackingData.h("cartID", str5);
        TrackingData.c(W.c(list));
        TrackingData.c(W.f1200a.d(list));
        return Unit.f142422a;
    }

    public final TrackingData h(boolean isEditMode, Boolean isCartEditOrder, final String totalItems, final String estimatedTotal, final String cartId, final String savingsValue, final String deliveryMode, final List<W.Details> trackingAnalyticsProducts, final String isBopasEligible, final String fulfillmentEligibility) {
        Intrinsics.j(totalItems, "totalItems");
        Intrinsics.j(estimatedTotal, "estimatedTotal");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(savingsValue, "savingsValue");
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(trackingAnalyticsProducts, "trackingAnalyticsProducts");
        Intrinsics.j(isBopasEligible, "isBopasEligible");
        return C14480g.a(C14476c.h(g(isEditMode, isCartEditOrder)), new Function1() { // from class: Ao.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.i(totalItems, estimatedTotal, cartId, savingsValue, deliveryMode, trackingAnalyticsProducts, isBopasEligible, fulfillmentEligibility, (TrackingData) obj);
            }
        });
    }

    public final TrackingData j(final List<W.Details> products, final String substitution, final String deliveryMode, final String orderFees, final String totalTax, final String phoneNumber, final String dateForAdobeTag, final String pickUpStore, final String timeForAdobeTag, final String zipCode) {
        Intrinsics.j(products, "products");
        Intrinsics.j(substitution, "substitution");
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(orderFees, "orderFees");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(dateForAdobeTag, "dateForAdobeTag");
        Intrinsics.j(pickUpStore, "pickUpStore");
        Intrinsics.j(timeForAdobeTag, "timeForAdobeTag");
        Intrinsics.j(zipCode, "zipCode");
        return C14480g.a(C14476c.h("Place Order"), new Function1() { // from class: Ao.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.k(products, substitution, deliveryMode, orderFees, totalTax, phoneNumber, dateForAdobeTag, pickUpStore, timeForAdobeTag, zipCode, (TrackingData) obj);
            }
        });
    }

    public final TrackingData l(final String deliveryMode, final String dateForAdobeTag, final String substitution, final String timeForAdobeTag, final String totalTax, final String deliveryCost, final String deliveryNote, final String zipCode, final String pickUpStore, final List<W.Details> products) {
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(dateForAdobeTag, "dateForAdobeTag");
        Intrinsics.j(substitution, "substitution");
        Intrinsics.j(timeForAdobeTag, "timeForAdobeTag");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(deliveryNote, "deliveryNote");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(pickUpStore, "pickUpStore");
        Intrinsics.j(products, "products");
        return C14480g.a(C14476c.h("Meijer: Review Order"), new Function1() { // from class: Ao.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.m(deliveryMode, dateForAdobeTag, substitution, timeForAdobeTag, totalTax, deliveryCost, deliveryNote, zipCode, pickUpStore, products, (TrackingData) obj);
            }
        });
    }

    public final TrackingData n(final boolean isEditMode, final Boolean isCartEditOrder, final String cartId, final boolean dismissSelected, final String lowStockProducts, final double actualQuantity, final String totalItems) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(lowStockProducts, "lowStockProducts");
        Intrinsics.j(totalItems, "totalItems");
        return C14480g.a(C14476c.a("low stock item prompt"), new Function1() { // from class: Ao.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.o(isEditMode, isCartEditOrder, cartId, actualQuantity, totalItems, lowStockProducts, dismissSelected, (TrackingData) obj);
            }
        });
    }

    public final TrackingData p(final String deliveryMode, final String dateForAdobeTag, final String timeForAdobeTag, final boolean isContinue, final String estimatedTotal, final String cartId, final List<W.Details> products) {
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(dateForAdobeTag, "dateForAdobeTag");
        Intrinsics.j(timeForAdobeTag, "timeForAdobeTag");
        Intrinsics.j(estimatedTotal, "estimatedTotal");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(products, "products");
        return C14480g.a(C14476c.a("future timeslot alert"), new Function1() { // from class: Ao.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.q(deliveryMode, dateForAdobeTag, timeForAdobeTag, isContinue, estimatedTotal, cartId, products, (TrackingData) obj);
            }
        });
    }

    private A() {
    }
}
