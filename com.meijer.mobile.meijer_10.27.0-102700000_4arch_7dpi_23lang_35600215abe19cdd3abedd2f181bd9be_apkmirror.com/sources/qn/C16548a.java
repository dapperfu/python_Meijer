package qn;

import Co.ProductFullDetails;
import Qn.FlyBuyState;
import Tq.PointOfService;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderDetailsPickUpTimeDecorator;
import ej.DeliveryMode;
import ej.Entry;
import fj.PickupPerson;
import fj.PickupSlotInfo;
import gj.OrderDetail;
import gj.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b#\n\u0002\u0010\u0006\n\u0002\b\u000f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\t*\u00020\b2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\t*\u00020\b2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f*\u00020\b2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u000f*\u00020\b2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0018J+\u0010\u001a\u001a\u00020\u000f*\u00020\b2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001c*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u00020 *\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040$*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0015\u0010*\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0015\u0010,\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0015\u0010.\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010)R\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050$*\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010&R\u0015\u00102\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010)R\u0015\u00104\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010)R\u0015\u00106\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010)R\u0015\u00108\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u0010)R\u0015\u0010:\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0015\u0010=\u001a\u00020\u000f*\u00020\b8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0015\u0010?\u001a\u00020\u000f*\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0015\u0010A\u001a\u00020\u000f*\u00020\b8F¢\u0006\u0006\u001a\u0004\b@\u0010<R\u0015\u0010C\u001a\u00020\u000f*\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u0010<R\u0015\u0010E\u001a\u00020\u000f*\u00020\b8F¢\u0006\u0006\u001a\u0004\bD\u0010<R\u0015\u0010G\u001a\u00020\u000f*\u00020\b8F¢\u0006\u0006\u001a\u0004\bF\u0010<R\u0015\u0010K\u001a\u00020H*\u00020\b8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0015\u0010M\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\bL\u0010)R\u0015\u0010O\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\bN\u0010)R\u0015\u0010Q\u001a\u00020\t*\u00020\b8F¢\u0006\u0006\u001a\u0004\bP\u0010)R\u0015\u0010T\u001a\u00020H*\u00020\u00058F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0015\u0010V\u001a\u00020H*\u00020\u00058F¢\u0006\u0006\u001a\u0004\bU\u0010S¨\u0006W"}, d2 = {"Lqn/a;", "", "<init>", "()V", "Lej/i;", "Lvo/a;", "J", "(Lej/i;)Lvo/a;", "LQn/K;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "G", "(LQn/K;Ljava/lang/String;)Ljava/lang/String;", "H", "", "w", "(LQn/K;Ljava/lang/String;)Z", "v", "isSubstitutionReviewScreen", "I", "(LQn/K;Z)LQn/K;", "substitutionItemIsAccepted", "A", "(LQn/K;Ljava/lang/String;ZZ)Z", "C", "x", "(LQn/K;Ljava/lang/String;Z)Z", "Lgj/c;", "e", "(LQn/K;)Lgj/c;", "orderDetails", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;", "s", "(LQn/K;)Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;", "timeSlotInfo", "", "h", "(LQn/K;)Ljava/util/List;", "outOfStockItemsWithoutSubstitutions", "j", "(LQn/K;)Ljava/lang/String;", "phoneNumber", "l", "pickupStore", "n", "purchaseId", "m", "products", "a", "fulfillmentType", "f", "orderItemsCount", "k", "pickupDate", "t", "timeSlotSelected", "g", "orderStatus", "d", "(LQn/K;)Z", "hasSubstitutions", "c", "hasOutOfStockItemsWithoutSubstitutions", "b", "hasAlcohol", "z", "isSubmissionSuccessful", "E", "isSubstitutionsAccepted", "F", "isSubstitutionsRejected", "", "r", "(LQn/K;)D", "substitutionsAcceptedRevenue", "u", "totalEffectiveRevenue", "q", "substitutionState", "i", "parkingSpotState", "p", "(Lvo/a;)D", "substitutedItemRevenue", "o", "rejectedItemRevenue", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qn.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16548a {

    /* renamed from: a, reason: collision with root package name */
    public static final C16548a f157336a = new C16548a();

    public static /* synthetic */ boolean B(C16548a c16548a, FlyBuyState flyBuyState, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return c16548a.A(flyBuyState, str, z10, z11);
    }

    public static /* synthetic */ boolean D(C16548a c16548a, FlyBuyState flyBuyState, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return c16548a.C(flyBuyState, str, z10, z11);
    }

    private final OrderDetailsPickUpTimeDecorator s(FlyBuyState flyBuyState) {
        PickupSlotInfo pickupSlotInfo;
        OrderDetailsPickUpTimeDecorator.Companion companion = OrderDetailsPickUpTimeDecorator.INSTANCE;
        OrderDetail orderDetailE = e(flyBuyState);
        if (orderDetailE == null || (pickupSlotInfo = orderDetailE.getPickUpSlotInfo()) == null) {
            pickupSlotInfo = new PickupSlotInfo(null, null, null, null, null, null, false, null, null, null, null, null, false, 8191, null);
        }
        return companion.a(pickupSlotInfo);
    }

    public static /* synthetic */ boolean y(C16548a c16548a, FlyBuyState flyBuyState, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c16548a.x(flyBuyState, str, z10);
    }

    public final boolean A(FlyBuyState flyBuyState, String str, boolean z10, boolean z11) {
        Intrinsics.j(flyBuyState, "<this>");
        return z10 && Intrinsics.e(flyBuyState.getIsSubstitutionsSubmissionsSuccessful(), Boolean.TRUE) && !z11 && !w(flyBuyState, str);
    }

    public final boolean C(FlyBuyState flyBuyState, String str, boolean z10, boolean z11) {
        Intrinsics.j(flyBuyState, "<this>");
        return (z10 || !Intrinsics.e(flyBuyState.getIsSubstitutionsSubmissionsSuccessful(), Boolean.TRUE) || z11 || w(flyBuyState, str)) ? false : true;
    }

    public final boolean E(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        List<OrderSubstitutionItem> listI = flyBuyState.i();
        if ((listI instanceof Collection) && listI.isEmpty()) {
            return false;
        }
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            if (((OrderSubstitutionItem) it.next()).getIsAccepted()) {
                return !flyBuyState.getIsSubstitutionReviewScreen();
            }
        }
        return false;
    }

    public final boolean F(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        List<OrderSubstitutionItem> listI = flyBuyState.i();
        if ((listI instanceof Collection) && listI.isEmpty()) {
            return false;
        }
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            if (!((OrderSubstitutionItem) it.next()).getIsAccepted()) {
                return !flyBuyState.getIsSubstitutionReviewScreen();
            }
        }
        return false;
    }

    public final String G(FlyBuyState flyBuyState, String str) {
        Object next;
        Intrinsics.j(flyBuyState, "<this>");
        Iterator<T> it = h(flyBuyState).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((Entry) next).m().getCode(), str)) {
                break;
            }
        }
        Entry entry = (Entry) next;
        return String.valueOf(entry != null ? Double.valueOf(entry.getActualQuantity()) : null);
    }

    public final String H(FlyBuyState flyBuyState, String str) {
        Double dValueOf;
        Object next;
        mk.b totalPrice;
        Intrinsics.j(flyBuyState, "<this>");
        Iterator<T> it = h(flyBuyState).iterator();
        while (true) {
            dValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((Entry) next).m().getCode(), str)) {
                break;
            }
        }
        Entry entry = (Entry) next;
        if (entry != null && (totalPrice = entry.getTotalPrice()) != null) {
            dValueOf = Double.valueOf(totalPrice.getValue());
        }
        return String.valueOf(dValueOf);
    }

    public final FlyBuyState I(FlyBuyState flyBuyState, boolean z10) {
        Intrinsics.j(flyBuyState, "<this>");
        return flyBuyState.a((16127 & 1) != 0 ? flyBuyState.flyBuyOrder : null, (16127 & 2) != 0 ? flyBuyState.currentOrderDetails : null, (16127 & 4) != 0 ? flyBuyState.substitutionItems : null, (16127 & 8) != 0 ? flyBuyState.isSubstitutionReviewScreen : z10, (16127 & 16) != 0 ? flyBuyState.isSubstitutionsSubmissionsSuccessful : null, (16127 & 32) != 0 ? flyBuyState.isOrderDetailSubstitutionTrackStateEnabled : false, (16127 & 64) != 0 ? flyBuyState.isCheckInSubstitutionsTrackStateEnabled : false, (16127 & 128) != 0 ? flyBuyState.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? flyBuyState.restoreVehicleInfoState : false, (16127 & 512) != 0 ? flyBuyState.isParkingSpotSet : false, (16127 & 1024) != 0 ? flyBuyState.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? flyBuyState.parkingSpot : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? flyBuyState.pickupName : null, (16127 & 8192) != 0 ? flyBuyState.storeInfo : null);
    }

    public final String a(FlyBuyState flyBuyState) {
        DeliveryMode deliveryMode;
        Intrinsics.j(flyBuyState, "<this>");
        OrderDetail orderDetailE = e(flyBuyState);
        String code = (orderDetailE == null || (deliveryMode = orderDetailE.getDeliveryMode()) == null) ? null : deliveryMode.getCode();
        return code == null ? "" : code;
    }

    public final boolean b(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        List<OrderSubstitutionItem> listI = flyBuyState.i();
        if ((listI instanceof Collection) && listI.isEmpty()) {
            return false;
        }
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            ProductFullDetails productSubstituted = ((OrderSubstitutionItem) it.next()).getProductSubstituted();
            if (productSubstituted != null && productSubstituted.getIsAlcohol()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        return (h(flyBuyState).isEmpty() || flyBuyState.getIsSubstitutionReviewScreen()) ? false : true;
    }

    public final boolean d(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        return (flyBuyState.i().isEmpty() || flyBuyState.getIsSubstitutionReviewScreen()) ? false : true;
    }

    public final String f(FlyBuyState flyBuyState) {
        List<Entry> listU;
        Intrinsics.j(flyBuyState, "<this>");
        OrderDetail orderDetailE = e(flyBuyState);
        return String.valueOf((orderDetailE == null || (listU = orderDetailE.u()) == null) ? null : Integer.valueOf(listU.size()));
    }

    public final String g(FlyBuyState flyBuyState) {
        f orderStatus;
        Intrinsics.j(flyBuyState, "<this>");
        OrderDetail orderDetailE = e(flyBuyState);
        String strName = (orderDetailE == null || (orderStatus = orderDetailE.getOrderStatus()) == null) ? null : orderStatus.name();
        return strName == null ? "" : strName;
    }

    public final String i(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        String str = flyBuyState.getIsParkingSpotSet() ? "parkingSpotSet" : null;
        return str == null ? "parkingSpotChanged" : str;
    }

    public final String j(FlyBuyState flyBuyState) throws IOException {
        PickupPerson pickUpPerson;
        Intrinsics.j(flyBuyState, "<this>");
        OrderDetail orderDetailE = e(flyBuyState);
        String phoneNumber = (orderDetailE == null || (pickUpPerson = orderDetailE.getPickUpPerson()) == null) ? null : pickUpPerson.getPhoneNumber();
        if (phoneNumber == null) {
            phoneNumber = "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = phoneNumber.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = phoneNumber.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public final String k(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        String analyticsDate = s(flyBuyState).getAnalyticsDate();
        return analyticsDate == null ? "" : analyticsDate;
    }

    public final String l(FlyBuyState flyBuyState) {
        PointOfService pointOfService;
        Intrinsics.j(flyBuyState, "<this>");
        OrderDetail orderDetailE = e(flyBuyState);
        return String.valueOf((orderDetailE == null || (pointOfService = orderDetailE.getPointOfService()) == null) ? null : Integer.valueOf(pointOfService.getStoreId()));
    }

    public final List<OrderSubstitutionItem> m(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        List<OrderSubstitutionItem> listI = flyBuyState.i();
        List<Entry> listH = h(flyBuyState);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listH, 10));
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(f157336a.J((Entry) it.next()));
        }
        return CollectionsKt.P0(listI, arrayList);
    }

    public final String n(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        OrderDetail orderDetailE = e(flyBuyState);
        String code = orderDetailE != null ? orderDetailE.getCode() : null;
        return code == null ? "" : code;
    }

    public final double o(OrderSubstitutionItem orderSubstitutionItem) {
        Intrinsics.j(orderSubstitutionItem, "<this>");
        mk.b productPrice = orderSubstitutionItem.getProductPrice();
        return (productPrice != null ? productPrice.getValue() : 0.0d) * orderSubstitutionItem.getProductQuantity();
    }

    public final double p(OrderSubstitutionItem orderSubstitutionItem) {
        mk.b price;
        Intrinsics.j(orderSubstitutionItem, "<this>");
        ProductFullDetails productSubstituted = orderSubstitutionItem.getProductSubstituted();
        return ((productSubstituted == null || (price = productSubstituted.getPrice()) == null) ? 0.0d : price.getValue()) * orderSubstitutionItem.getProductQuantity();
    }

    public final String q(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        String str = Intrinsics.e(flyBuyState.getIsSubstitutionsSubmissionsSuccessful(), Boolean.TRUE) ? "successfulSubstitution" : null;
        return str == null ? "errorSubstitution" : str;
    }

    public final double r(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        List<OrderSubstitutionItem> listI = flyBuyState.i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (((OrderSubstitutionItem) obj).getIsAccepted()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        double dP = 0.0d;
        while (it.hasNext()) {
            dP += f157336a.p((OrderSubstitutionItem) it.next());
        }
        return dP;
    }

    public final String t(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        String timeForAdobeTag = s(flyBuyState).getTimeForAdobeTag();
        return timeForAdobeTag == null ? "" : timeForAdobeTag;
    }

    public final String u(FlyBuyState flyBuyState) {
        Entry entry;
        List<Entry> listU;
        Object next;
        Intrinsics.j(flyBuyState, "<this>");
        OrderDetail orderDetailE = e(flyBuyState);
        List<Entry> listU2 = orderDetailE != null ? orderDetailE.u() : null;
        if (listU2 == null) {
            listU2 = CollectionsKt.m();
        }
        List<Entry> list = listU2;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Entry) it.next()).m().getCode());
        }
        List<OrderSubstitutionItem> listI = flyBuyState.i();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listI, 10));
        Iterator<T> it2 = listI.iterator();
        while (it2.hasNext()) {
            ProductFullDetails product = ((OrderSubstitutionItem) it2.next()).getProduct();
            arrayList2.add(product != null ? product.getCode() : null);
        }
        Set<String> setA1 = CollectionsKt.a1(arrayList, CollectionsKt.o1(arrayList2));
        ArrayList arrayList3 = new ArrayList();
        for (String str : setA1) {
            OrderDetail orderDetailE2 = f157336a.e(flyBuyState);
            if (orderDetailE2 == null || (listU = orderDetailE2.u()) == null) {
                entry = null;
            } else {
                Iterator<T> it3 = listU.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    Entry entry2 = (Entry) next;
                    if (Intrinsics.e(entry2.m().getCode(), str) && !entry2.m().getStockInfo().e()) {
                        break;
                    }
                }
                entry = (Entry) next;
            }
            if (entry != null) {
                arrayList3.add(entry);
            }
        }
        Iterator it4 = arrayList3.iterator();
        double value = 0.0d;
        while (it4.hasNext()) {
            value += ((Entry) it4.next()).getTotalPrice().getValue();
        }
        return String.valueOf(value + r(flyBuyState));
    }

    public final boolean v(FlyBuyState flyBuyState, String str) {
        Intrinsics.j(flyBuyState, "<this>");
        return (flyBuyState.i().isEmpty() || flyBuyState.getIsSubstitutionReviewScreen() || w(flyBuyState, str)) ? false : true;
    }

    public final boolean w(FlyBuyState flyBuyState, String str) {
        Intrinsics.j(flyBuyState, "<this>");
        List<Entry> listH = h(flyBuyState);
        if ((listH instanceof Collection) && listH.isEmpty()) {
            return false;
        }
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(((Entry) it.next()).m().getCode(), str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(FlyBuyState flyBuyState, String str, boolean z10) {
        Object next;
        Intrinsics.j(flyBuyState, "<this>");
        Iterator<T> it = h(flyBuyState).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((Entry) next).m().getCode(), str)) {
                break;
            }
        }
        return (next == null || z10) ? false : true;
    }

    public final boolean z(FlyBuyState flyBuyState) {
        Intrinsics.j(flyBuyState, "<this>");
        return Intrinsics.e(flyBuyState.getIsSubstitutionsSubmissionsSuccessful(), Boolean.TRUE) && !flyBuyState.getIsSubstitutionReviewScreen();
    }

    private C16548a() {
    }

    private final OrderSubstitutionItem J(Entry entry) {
        ProductFullDetails productFullDetailsM = entry.m();
        return new OrderSubstitutionItem(0, null, null, null, null, entry.getActualQuantity(), entry.m().getPrice(), null, productFullDetailsM, null, null, false, RecyclerView.m.FLAG_MOVED, null);
    }

    private final OrderDetail e(FlyBuyState flyBuyState) {
        return flyBuyState.getCurrentOrderDetails();
    }

    private final List<Entry> h(FlyBuyState flyBuyState) {
        List<Entry> listM;
        Entry entry;
        List<Entry> listU;
        Object next;
        String code;
        OrderDetail orderDetailE = e(flyBuyState);
        if (orderDetailE != null) {
            listM = orderDetailE.u();
        } else {
            listM = null;
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List<Entry> list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Entry) it.next()).m().getCode());
        }
        List<OrderSubstitutionItem> listI = flyBuyState.i();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listI, 10));
        Iterator<T> it2 = listI.iterator();
        while (it2.hasNext()) {
            ProductFullDetails product = ((OrderSubstitutionItem) it2.next()).getProduct();
            if (product != null) {
                code = product.getCode();
            } else {
                code = null;
            }
            arrayList2.add(code);
        }
        Set<String> setA1 = CollectionsKt.a1(arrayList, CollectionsKt.o1(arrayList2));
        ArrayList arrayList3 = new ArrayList();
        for (String str : setA1) {
            OrderDetail orderDetailE2 = f157336a.e(flyBuyState);
            if (orderDetailE2 != null && (listU = orderDetailE2.u()) != null) {
                Iterator<T> it3 = listU.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        Entry entry2 = (Entry) next;
                        if (Intrinsics.e(entry2.m().getCode(), str) && entry2.m().getStockInfo().e()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                entry = (Entry) next;
            } else {
                entry = null;
            }
            if (entry != null) {
                arrayList3.add(entry);
            }
        }
        return arrayList3;
    }
}
