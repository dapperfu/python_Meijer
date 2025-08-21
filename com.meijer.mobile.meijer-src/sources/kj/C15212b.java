package kj;

import Co.ProductFullDetails;
import Fo.Savings;
import Tq.PointOfService;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.cart.model.hybris.Cart;
import com.meijer.mobile.cart.model.hybris.CustomerDataResponse;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import com.meijer.mobile.cart.model.hybris.FulfillmentEligibility;
import com.meijer.mobile.cart.model.hybris.HighValuePromo;
import com.meijer.mobile.cart.model.hybris.HybrisDeliveryMode;
import com.meijer.mobile.cart.model.hybris.HybrisSubstitutePreference;
import com.meijer.mobile.cart.model.hybris.MultiTenderPaymentInfoResponse;
import com.meijer.mobile.cart.model.hybris.PaymentDetails;
import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupPerson;
import com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import di.CustomerAddress;
import ei.C13801b;
import fj.CustomerData;
import fj.DeliveryMode;
import fj.Entry;
import fj.InterfaceC14010f;
import fj.MultiTenderPaymentInfo;
import fj.PaymentDetailItem;
import fj.ShoppingCart;
import fj.SubstitutePreference;
import gj.PickupPerson;
import hk.PaymentOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jj.FulfillmentSlot;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lj.C15513b;
import rj.C16914a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00002\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0000*\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/Cart;", "", "promoCodeMessage", "Lfj/C;", "c", "(Lcom/meijer/mobile/cart/model/hybris/Cart;Ljava/lang/String;)Lfj/C;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "b", "(Lcom/meijer/mobile/cart/model/hybris/Cart;I)Lcom/meijer/mobile/cart/model/hybris/Cart;", "Lfj/f;", "a", "(Lfj/f;)Lcom/meijer/mobile/cart/model/hybris/Cart;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kj.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15212b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Cart a(InterfaceC14010f interfaceC14010f) {
        Intrinsics.j(interfaceC14010f, "<this>");
        Cart cart = interfaceC14010f instanceof Cart ? (Cart) interfaceC14010f : null;
        if (cart != null) {
            return cart;
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        return new Cart(interfaceC14010f.getCode(), null, null, false, 0 == true ? 1 : 0, null, new HybrisPointOfService(interfaceC14010f.u(), null, null, false, 0.0d, null, null, false, 0.0d, null, null, z10, z11, null, null, str, null, null, null, false, false, false, 4194302, null), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0, null, 0 == true ? 1 : 0, false, z10, z11, 0 == true ? 1 : 0, false, str, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, false, null, null, null, 0, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, -66, 1073741823, null);
    }

    public static final Cart b(Cart cart, int i10) {
        Intrinsics.j(cart, "<this>");
        List<EntryJson> listV = cart.v();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listV, 10));
        Iterator<T> it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(C15217g.a((EntryJson) it.next(), i10));
        }
        return cart.copy(((-5) & 1) != 0 ? cart.code : null, ((-5) & 2) != 0 ? cart.outOfStockModifications : null, ((-5) & 4) != 0 ? cart.entries : arrayList, ((-5) & 8) != 0 ? cart.calculated : false, ((-5) & 16) != 0 ? cart.customerData : null, ((-5) & 32) != 0 ? cart.guid : null, ((-5) & 64) != 0 ? cart.pointOfService : null, ((-5) & 128) != 0 ? cart.substitutePreference : null, ((-5) & 256) != 0 ? cart.depositPrice : null, ((-5) & 512) != 0 ? cart.deliveryCost : null, ((-5) & 1024) != 0 ? cart.deliveryMode : null, ((-5) & RecyclerView.m.FLAG_MOVED) != 0 ? cart.deliveryItemsQuantity : 0, ((-5) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? cart.deliveryOrderGroups : null, ((-5) & 8192) != 0 ? cart.deliveryAddress : null, ((-5) & 16384) != 0 ? cart.earlyDelivery : false, ((-5) & 32768) != 0 ? cart.deliveryAddressIsAlcoholEligible : false, ((-5) & 65536) != 0 ? cart.earlyDeliveryAvailable : false, ((-5) & 131072) != 0 ? cart.extendedDeliveryCost : null, ((-5) & 262144) != 0 ? cart.editOrderWet : false, ((-5) & 524288) != 0 ? cart.expirationTime : null, ((-5) & 1048576) != 0 ? cart.net : false, ((-5) & 2097152) != 0 ? cart.couponsSavings : null, ((-5) & 4194304) != 0 ? cart.orderDiscounts : null, ((-5) & 8388608) != 0 ? cart.paymentInfo : null, ((-5) & 16777216) != 0 ? cart.multiTenderPaymentInfo : null, ((-5) & 33554432) != 0 ? cart.pickUpPerson : null, ((-5) & 67108864) != 0 ? cart.pickUpSlotInfo : null, ((-5) & 134217728) != 0 ? cart.pickupItemsQuantity : 0, ((-5) & 268435456) != 0 ? cart.pickupOrderGroups : null, ((-5) & 536870912) != 0 ? cart.phoneNumberTextable : false, ((-5) & 1073741824) != 0 ? cart.productDiscounts : null, ((-5) & Integer.MIN_VALUE) != 0 ? cart.purchaseOrderNumber : null, (1073741823 & 1) != 0 ? cart.saveTime : null, (1073741823 & 2) != 0 ? cart.savedBy : null, (1073741823 & 4) != 0 ? cart.site : null, (1073741823 & 8) != 0 ? cart.specialSavings : null, (1073741823 & 16) != 0 ? cart.store : null, (1073741823 & 32) != 0 ? cart.subTotal : null, (1073741823 & 64) != 0 ? cart.tippedAndRated : false, (1073741823 & 128) != 0 ? cart.teamMemberSavings : null, (1073741823 & 256) != 0 ? cart.mperksSavings : null, (1073741823 & 512) != 0 ? cart.totalDiscounts : null, (1073741823 & 1024) != 0 ? cart.totalItems : 0, (1073741823 & RecyclerView.m.FLAG_MOVED) != 0 ? cart.itemsTotal : null, (1073741823 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? cart.totalCosts : null, (1073741823 & 8192) != 0 ? cart.totalPrice : null, (1073741823 & 16384) != 0 ? cart.totalPriceWithTax : null, (1073741823 & 32768) != 0 ? cart.creditTransactionAmount : null, (1073741823 & 65536) != 0 ? cart.totalSavings : null, (1073741823 & 131072) != 0 ? cart.totalTax : null, (1073741823 & 262144) != 0 ? cart.totalUnitCount : 0, (1073741823 & 524288) != 0 ? cart.user : null, (1073741823 & 1048576) != 0 ? cart.type : null, (1073741823 & 2097152) != 0 ? cart.originalOrderId : null, (1073741823 & 4194304) != 0 ? cart.highValuePromos : null, (1073741823 & 8388608) != 0 ? cart.fulfillmentEligibility : null, (1073741823 & 16777216) != 0 ? cart.partnerEligibility : null, (1073741823 & 33554432) != 0 ? cart.availableFulfillmentEligibilities : null, (1073741823 & 67108864) != 0 ? cart.ebtEligibleTotal : null, (1073741823 & 134217728) != 0 ? cart.ebtNonEligibleTotal : null, (1073741823 & 268435456) != 0 ? cart.ebtSurchargePrice : null, (1073741823 & 536870912) != 0 ? cart.ebtSuggestedTotal : null);
    }

    public static final ShoppingCart c(Cart cart, String str) {
        Intrinsics.j(cart, "<this>");
        String code = cart.getCode();
        List<EntryJson> listV = cart.v();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listV, 10));
        Iterator<T> it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(C15217g.b((EntryJson) it.next()));
        }
        ArrayList<Entry> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((Entry) obj).m().getStockInfo().e()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        for (Entry entry : arrayList2) {
            arrayList3.add(Entry.b(entry, 0, ProductFullDetails.b(entry.m(), null, null, cart.getPointOfService().getStoreId(), false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -5, 268435455, null), 0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, false, 32765, null));
        }
        List<EntryJson> listV2 = cart.v();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.x(listV2, 10));
        Iterator<T> it2 = listV2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(C15217g.b((EntryJson) it2.next()));
        }
        ArrayList<Entry> arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (((Entry) obj2).m().getStockInfo().e()) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.x(arrayList5, 10));
        for (Entry entry2 : arrayList5) {
            arrayList6.add(Entry.b(entry2, 0, ProductFullDetails.b(entry2.m(), null, null, cart.getPointOfService().getStoreId(), false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -5, 268435455, null), 0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, false, 32765, null));
        }
        CustomerDataResponse customerData = cart.getCustomerData();
        CustomerData c14011gA = customerData != null ? C15216f.a(customerData) : null;
        PointOfService cVarA = Uq.c.a(cart.getPointOfService());
        HybrisSubstitutePreference substitutePreference = cart.getSubstitutePreference();
        SubstitutePreference dA = substitutePreference != null ? u.a(substitutePreference) : null;
        HybrisDeliveryMode deliveryMode = cart.getDeliveryMode();
        DeliveryMode c14012hA = deliveryMode != null ? p.a(deliveryMode) : null;
        HybrisCustomerAddress deliveryAddress = cart.getDeliveryAddress();
        CustomerAddress c13685cA = deliveryAddress != null ? C13801b.a(deliveryAddress) : null;
        HybrisPrice extendedDeliveryCost = cart.getExtendedDeliveryCost();
        nk.b bVarA = extendedDeliveryCost != null ? Lo.b.a(extendedDeliveryCost) : null;
        PaymentDetails paymentInfo = cart.getPaymentInfo();
        PaymentDetailItem uVarB = paymentInfo != null ? D.b(paymentInfo) : null;
        PaymentDetails paymentInfo2 = cart.getPaymentInfo();
        PaymentOption fVarC = paymentInfo2 != null ? D.c(paymentInfo2) : null;
        MultiTenderPaymentInfoResponse multiTenderPaymentInfo = cart.getMultiTenderPaymentInfo();
        MultiTenderPaymentInfo sVarA = multiTenderPaymentInfo != null ? x.a(multiTenderPaymentInfo) : null;
        HybrisPickupPerson pickUpPerson = cart.getPickUpPerson();
        PickupPerson c14384bA = pickUpPerson != null ? C15513b.a(pickUpPerson) : null;
        HybrisPickupSlotInfo pickUpSlotInfo = cart.getPickUpSlotInfo();
        FulfillmentSlot cVarA2 = pickUpSlotInfo != null ? C16914a.a(pickUpSlotInfo, cart.getPointOfService().getStoreId()) : null;
        Savings cVarA3 = Lo.c.a(cart.getSpecialSavings());
        Savings cVarA4 = Lo.c.a(cart.getCouponsSavings());
        Savings cVarA5 = Lo.c.a(cart.getMperksSavings());
        Savings cVarA6 = Lo.c.a(cart.getTeamMemberSavings());
        Savings cVarA7 = Lo.c.a(cart.getTotalSavings());
        nk.b bVarA2 = Lo.b.a(cart.getProductDiscounts());
        nk.b bVarA3 = Lo.b.a(cart.getOrderDiscounts());
        nk.b bVarA4 = Lo.b.a(cart.getDepositPrice());
        nk.b bVarA5 = Lo.b.a(cart.getDeliveryCost());
        nk.b bVarA6 = Lo.b.a(cart.getSubTotal());
        nk.b bVarA7 = Lo.b.a(cart.getTotalDiscounts());
        nk.b bVarA8 = Lo.b.a(cart.getTotalPrice());
        nk.b bVarA9 = Lo.b.a(cart.getItemsTotal());
        nk.b bVarA10 = Lo.b.a(cart.getTotalCosts());
        nk.b bVarA11 = Lo.b.a(cart.getTotalTax());
        nk.b bVarA12 = Lo.b.a(cart.getTotalPriceWithTax());
        HybrisPrice creditTransactionAmount = cart.getCreditTransactionAmount();
        nk.b bVarA13 = creditTransactionAmount != null ? Lo.b.a(creditTransactionAmount) : null;
        int totalItems = cart.getTotalItems();
        boolean tippedAndRated = cart.getTippedAndRated();
        String originalOrderId = cart.getOriginalOrderId();
        boolean z10 = (cart.getOriginalOrderId() == null || cart.getEditOrderWet()) ? false : true;
        boolean deliveryAddressIsAlcoholEligible = cart.getDeliveryAddressIsAlcoholEligible();
        CustomerData c14011g = c14011gA;
        List<HighValuePromo> listA = cart.A();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it3 = listA.iterator();
        while (it3.hasNext()) {
            arrayList7.add(l.a((HighValuePromo) it3.next()));
        }
        boolean earlyDeliveryAvailable = cart.getEarlyDeliveryAvailable();
        String fulfillmentEligibility = cart.getFulfillmentEligibility();
        String partnerEligibility = cart.getPartnerEligibility();
        List<FulfillmentEligibility> listB = cart.b();
        ArrayList arrayList8 = new ArrayList();
        for (Object obj3 : listB) {
            boolean z11 = earlyDeliveryAvailable;
            FulfillmentEligibility fulfillmentEligibility2 = (FulfillmentEligibility) obj3;
            if (fulfillmentEligibility2.getFulfillmentEligibility() != null && fulfillmentEligibility2.getPartnerEligibility() != null) {
                arrayList8.add(obj3);
            }
            earlyDeliveryAvailable = z11;
        }
        boolean z12 = earlyDeliveryAvailable;
        ArrayList arrayList9 = new ArrayList(CollectionsKt.x(arrayList8, 10));
        Iterator it4 = arrayList8.iterator();
        while (it4.hasNext()) {
            arrayList9.add(h.a((FulfillmentEligibility) it4.next()));
        }
        return new ShoppingCart(code, arrayList3, c14011g, arrayList6, cVarA, dA, c14012hA, c13685cA, bVarA, uVarB, fVarC, sVarA, c14384bA, cVarA2, cVarA3, cVarA5, cVarA4, cVarA6, cVarA7, bVarA2, bVarA3, bVarA4, bVarA5, bVarA6, bVarA7, bVarA9, bVarA10, bVarA8, bVarA11, bVarA12, bVarA13, totalItems, tippedAndRated, originalOrderId, z10, deliveryAddressIsAlcoholEligible, arrayList7, z12, str, fulfillmentEligibility, partnerEligibility, arrayList9, Lo.b.a(cart.getEbtEligibleTotal()), Lo.b.a(cart.getEbtNonEligibleTotal()), Lo.b.a(cart.getEbtSurchargePrice()), Lo.b.a(cart.getEbtSuggestedTotal()));
    }

    public static /* synthetic */ ShoppingCart d(Cart cart, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c(cart, str);
    }
}
