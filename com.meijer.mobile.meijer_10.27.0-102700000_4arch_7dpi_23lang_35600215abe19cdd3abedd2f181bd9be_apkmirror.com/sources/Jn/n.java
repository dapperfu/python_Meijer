package Jn;

import Co.ProductFullDetails;
import Qn.FlyBuyState;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qn.C16548a;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001cJ\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u001cJ\u0015\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001cJ\u0015\u0010%\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u001cJ\u0015\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u001cJ\u0015\u0010'\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u001cJ\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u001cJ\u0015\u0010)\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u001cR\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010/\u001a\u00020\u000f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00104\u001a\u0004\u0018\u00010\u000f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010.¨\u00065"}, d2 = {"LJn/n;", "", "<init>", "()V", "LQn/K;", "Lvo/a;", "orderSubstitutionItem", "", "", "y", "(LQn/K;Lvo/a;)Ljava/util/List;", "t", "(LQn/K;Lvo/a;)Ljava/lang/String;", "", "quantity", "Lhi/i$b;", "O", "(Ljava/lang/Double;)Lhi/i$b;", "Lhi/f;", "flyBuyState", "R", "(Lhi/f;LQn/K;)Lhi/f;", "", "Lhi/i;", "A", "(LQn/K;)[Lhi/i;", "z", "K", "(LQn/K;)Lhi/f;", "", "isOrderDetailPage", "F", "(LQn/K;Z)Lhi/f;", "I", "u", "P", "w", "n", "r", "M", "p", "S", "C", "(Lvo/a;)Ljava/util/List;", "eVars", "E", "(LQn/K;)Lhi/i$b;", "productDetails", "D", "(LQn/K;)Ljava/util/List;", "eventsList", "B", "bopasEvent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f16050a = new n();

    private final AbstractC14482i[] A(FlyBuyState flyBuyState) {
        String strB0;
        n nVar = f16050a;
        AbstractC14482i.Extra extraE = nVar.E(flyBuyState);
        List<String> listD = nVar.D(flyBuyState);
        AbstractC14482i.Extra extraB = null;
        if (listD.isEmpty()) {
            listD = null;
        }
        if (listD != null && (strB0 = CollectionsKt.B0(listD, ",", null, null, 0, null, null, 62, null)) != null) {
            extraB = C14476c.b("&&events", strB0);
        }
        Iterator<T> it = flyBuyState.i().iterator();
        double productQuantity = 0.0d;
        while (it.hasNext()) {
            productQuantity += ((OrderSubstitutionItem) it.next()).getProductQuantity();
        }
        return (AbstractC14482i[]) CollectionsKt.r(extraE, extraB, f16050a.O(Double.valueOf(productQuantity))).toArray(new AbstractC14482i[0]);
    }

    private final List<String> D(FlyBuyState flyBuyState) {
        String str;
        String str2;
        C16548a c16548a = C16548a.f157336a;
        boolean zB = c16548a.b(flyBuyState);
        Boolean boolValueOf = Boolean.valueOf(zB);
        if (!zB) {
            boolValueOf = null;
        }
        String str3 = boolValueOf != null ? "event80" : null;
        boolean zD = c16548a.d(flyBuyState);
        Boolean boolValueOf2 = Boolean.valueOf(zD);
        if (!zD) {
            boolValueOf2 = null;
        }
        String str4 = boolValueOf2 != null ? "event90" : null;
        boolean zC = c16548a.c(flyBuyState);
        Boolean boolValueOf3 = Boolean.valueOf(zC);
        if (!zC) {
            boolValueOf3 = null;
        }
        String str5 = boolValueOf3 != null ? "event91" : null;
        boolean z10 = c16548a.z(flyBuyState);
        Boolean boolValueOf4 = Boolean.valueOf(z10);
        if (!z10) {
            boolValueOf4 = null;
        }
        String str6 = boolValueOf4 != null ? "event92" : null;
        boolean zE = c16548a.E(flyBuyState);
        Boolean boolValueOf5 = Boolean.valueOf(zE);
        if (!zE) {
            boolValueOf5 = null;
        }
        String str7 = boolValueOf5 != null ? "event94" : null;
        boolean zF = c16548a.F(flyBuyState);
        Boolean boolValueOf6 = Boolean.valueOf(zF);
        if (!zF) {
            boolValueOf6 = null;
        }
        String str8 = boolValueOf6 != null ? "event95" : null;
        boolean isSubstitutionReviewScreen = flyBuyState.getIsSubstitutionReviewScreen();
        Boolean boolValueOf7 = Boolean.valueOf(isSubstitutionReviewScreen);
        if (isSubstitutionReviewScreen) {
            boolValueOf7 = null;
        }
        if (boolValueOf7 != null) {
            str = "event127=" + c16548a.f(flyBuyState);
        } else {
            str = null;
        }
        boolean zC2 = c16548a.c(flyBuyState);
        Boolean boolValueOf8 = Boolean.valueOf(zC2);
        if (!zC2) {
            boolValueOf8 = null;
        }
        String str9 = boolValueOf8 != null ? "event128" : null;
        boolean zE2 = c16548a.E(flyBuyState);
        Boolean boolValueOf9 = Boolean.valueOf(zE2);
        if (!zE2) {
            boolValueOf9 = null;
        }
        String str10 = boolValueOf9 != null ? "event129" : null;
        boolean zF2 = c16548a.F(flyBuyState);
        Boolean boolValueOf10 = Boolean.valueOf(zF2);
        if (!zF2) {
            boolValueOf10 = null;
        }
        String str11 = boolValueOf10 != null ? "event130" : null;
        boolean isSubstitutionReviewScreen2 = flyBuyState.getIsSubstitutionReviewScreen();
        Boolean boolValueOf11 = Boolean.valueOf(isSubstitutionReviewScreen2);
        if (isSubstitutionReviewScreen2) {
            boolValueOf11 = null;
        }
        if (boolValueOf11 != null) {
            str2 = "event131=" + c16548a.u(flyBuyState);
        } else {
            str2 = null;
        }
        boolean zD2 = c16548a.d(flyBuyState);
        Boolean boolValueOf12 = Boolean.valueOf(zD2);
        if (!zD2) {
            boolValueOf12 = null;
        }
        String str12 = boolValueOf12 != null ? "event132" : null;
        boolean zC3 = c16548a.c(flyBuyState);
        Boolean boolValueOf13 = Boolean.valueOf(zC3);
        if (!zC3) {
            boolValueOf13 = null;
        }
        String str13 = boolValueOf13 != null ? "event133" : null;
        boolean zE3 = c16548a.E(flyBuyState);
        Boolean boolValueOf14 = Boolean.valueOf(zE3);
        if (!zE3) {
            boolValueOf14 = null;
        }
        String str14 = boolValueOf14 != null ? "event134" : null;
        boolean zF3 = c16548a.F(flyBuyState);
        Boolean boolValueOf15 = Boolean.valueOf(zF3);
        if (!zF3) {
            boolValueOf15 = null;
        }
        String str15 = boolValueOf15 != null ? "event135" : null;
        boolean isBopasTimeSlot = flyBuyState.getIsBopasTimeSlot();
        Boolean boolValueOf16 = Boolean.valueOf(isBopasTimeSlot);
        if (!isBopasTimeSlot) {
            boolValueOf16 = null;
        }
        return CollectionsKt.r(str3, str4, str5, str6, str7, str8, str, str9, str10, str11, str2, str12, str13, str14, str15, boolValueOf16 != null ? "event182" : null);
    }

    private final AbstractC14482i.Extra E(final FlyBuyState flyBuyState) {
        return C14476c.b("&&products", CollectionsKt.B0(C16548a.f157336a.m(flyBuyState), ",", null, null, 0, null, new Function1() { // from class: Jn.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.m(flyBuyState, (OrderSubstitutionItem) obj);
            }
        }, 30, null));
    }

    public static /* synthetic */ TrackingData G(n nVar, FlyBuyState flyBuyState, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return nVar.F(flyBuyState, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(FlyBuyState flyBuyState, boolean z10, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("order details: Flybuy");
        f16050a.R(TrackingData, flyBuyState);
        if (!z10) {
            TrackingData.p("On my way: I am here");
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("order details: Flybuy");
        f16050a.R(TrackingData, flyBuyState);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("Order History");
        TrackingData.h(C16548a.f157336a.q(flyBuyState), "1");
        n nVar = f16050a;
        TrackingData.e(nVar.z(flyBuyState));
        TrackingData.e(nVar.A(flyBuyState));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("order details: Flybuy");
        f16050a.R(TrackingData, flyBuyState);
        return Unit.f142422a;
    }

    private final AbstractC14482i.Extra O(Double quantity) {
        return C14476c.b("quantity", String.valueOf(quantity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("order details: Flybuy");
        n nVar = f16050a;
        TrackingData.e(nVar.z(flyBuyState));
        TrackingData.e(nVar.A(flyBuyState));
        return Unit.f142422a;
    }

    private final TrackingData R(TrackingData trackingData, FlyBuyState flyBuyState) {
        n nVar = f16050a;
        trackingData.e(nVar.z(flyBuyState));
        AbstractC14482i.Extra extraB = nVar.B(flyBuyState);
        if (extraB != null) {
            return trackingData.c(extraB);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("Order History");
        TrackingData.n("Meijer:Order Details Page");
        f16050a.R(TrackingData, flyBuyState);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(FlyBuyState flyBuyState, OrderSubstitutionItem item) {
        Intrinsics.j(item, "item");
        return f16050a.t(flyBuyState, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("order details: Flybuy");
        f16050a.R(TrackingData, flyBuyState);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("order details: Flybuy");
        n nVar = f16050a;
        TrackingData.e(nVar.z(flyBuyState));
        TrackingData.e(nVar.A(flyBuyState));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("order details: Flybuy");
        f16050a.R(TrackingData, flyBuyState);
        TrackingData.h("parkingSpot", flyBuyState.getParkingSpot());
        TrackingData.h(C16548a.f157336a.i(flyBuyState), "1");
        return Unit.f142422a;
    }

    private final String t(FlyBuyState flyBuyState, OrderSubstitutionItem orderSubstitutionItem) {
        mk.b price;
        ProductFullDetails product = orderSubstitutionItem.getProduct();
        Double dValueOf = null;
        String department = product != null ? product.getDepartment() : null;
        ProductFullDetails product2 = orderSubstitutionItem.getProduct();
        String code = product2 != null ? product2.getCode() : null;
        String strValueOf = String.valueOf(orderSubstitutionItem.getProductQuantity());
        ProductFullDetails product3 = orderSubstitutionItem.getProduct();
        if (product3 != null && (price = product3.getPrice()) != null) {
            dValueOf = Double.valueOf(price.getValue());
        }
        String strValueOf2 = String.valueOf(dValueOf);
        n nVar = f16050a;
        return CollectionsKt.B0(CollectionsKt.p(department, code, strValueOf, strValueOf2, CollectionsKt.B0(nVar.y(flyBuyState, orderSubstitutionItem), "|", null, null, 0, null, null, 62, null), CollectionsKt.B0(nVar.C(orderSubstitutionItem), "|", null, null, 0, null, null, 62, null)), ";", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("Order History");
        TrackingData.n("Order Details");
        f16050a.R(TrackingData, flyBuyState);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(FlyBuyState flyBuyState, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("order details: Flybuy");
        f16050a.R(TrackingData, flyBuyState);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.String> y(Qn.FlyBuyState r22, vo.OrderSubstitutionItem r23) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jn.n.y(Qn.K, vo.a):java.util.List");
    }

    private final AbstractC14482i[] z(FlyBuyState flyBuyState) {
        C16548a c16548a = C16548a.f157336a;
        return (AbstractC14482i[]) CollectionsKt.p(C14476c.b("fulfillmentType", c16548a.a(flyBuyState)), C14476c.b("orderStatus", c16548a.g(flyBuyState)), C14476c.b("purchaseID", c16548a.n(flyBuyState)), C14476c.b("timeslotSelected", c16548a.t(flyBuyState)), C14476c.b("pickupDate", c16548a.k(flyBuyState)), C14476c.b("phoneNumber", c16548a.j(flyBuyState)), C14476c.b("pickupStore", c16548a.l(flyBuyState))).toArray(new AbstractC14482i[0]);
    }

    public final TrackingData F(final FlyBuyState flyBuyState, final boolean isOrderDetailPage) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.a("I am Here"), new Function1() { // from class: Jn.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.H(flyBuyState, isOrderDetailPage, (TrackingData) obj);
            }
        });
    }

    public final TrackingData I(final FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.a("On my way"), new Function1() { // from class: Jn.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.J(flyBuyState, (TrackingData) obj);
            }
        });
    }

    public final TrackingData K(final FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.h("Meijer:Order Details Page"), new Function1() { // from class: Jn.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.L(flyBuyState, (TrackingData) obj);
            }
        });
    }

    public final TrackingData M(final FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.a("event: FlyBuy: pickup complete"), new Function1() { // from class: Jn.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.N(flyBuyState, (TrackingData) obj);
            }
        });
    }

    public final TrackingData P(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        final FlyBuyState flyBuyStateI = C16548a.f157336a.I(flyBuyState, true);
        return C14480g.a(C14476c.h("FlyBuy: review substitutions"), new Function1() { // from class: Jn.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.Q(flyBuyStateI, (TrackingData) obj);
            }
        });
    }

    public final TrackingData S(final FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.a("view mPerks dashboard"), new Function1() { // from class: Jn.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.T(flyBuyState, (TrackingData) obj);
            }
        });
    }

    public final TrackingData n(final FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.a("Change Spot Number"), new Function1() { // from class: Jn.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.o(flyBuyState, (TrackingData) obj);
            }
        });
    }

    public final TrackingData p(final FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.h("FlyBuy: check in"), new Function1() { // from class: Jn.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.q(flyBuyState, (TrackingData) obj);
            }
        });
    }

    public final TrackingData r(final FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.h("FlyBuy: customer arrived"), new Function1() { // from class: Jn.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.s(flyBuyState, (TrackingData) obj);
            }
        });
    }

    public final TrackingData u(final FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.a("event: edit Order Phone Number"), new Function1() { // from class: Jn.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.v(flyBuyState, (TrackingData) obj);
            }
        });
    }

    public final TrackingData w(final FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "flyBuyState");
        return C14480g.a(C14476c.a("Enter Spot Number"), new Function1() { // from class: Jn.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.x(flyBuyState, (TrackingData) obj);
            }
        });
    }

    private n() {
    }

    private final AbstractC14482i.Extra B(FlyBuyState flyBuyState) {
        boolean isBopasTimeSlot = flyBuyState.getIsBopasTimeSlot();
        Boolean boolValueOf = Boolean.valueOf(isBopasTimeSlot);
        if (!isBopasTimeSlot) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        return C14476c.b("&&events", "event182");
    }

    private final List<String> C(OrderSubstitutionItem orderSubstitutionItem) {
        String str;
        ProductFullDetails productSubstituted = orderSubstitutionItem.getProductSubstituted();
        if (productSubstituted != null) {
            str = "eVar91=" + productSubstituted.getCode();
        } else {
            str = null;
        }
        return CollectionsKt.q(str);
    }
}
