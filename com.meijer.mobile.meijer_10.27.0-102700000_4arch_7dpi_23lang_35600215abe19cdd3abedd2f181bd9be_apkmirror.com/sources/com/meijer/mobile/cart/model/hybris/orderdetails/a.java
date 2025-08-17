package com.meijer.mobile.cart.model.hybris.orderdetails;

import Fo.Savings;
import Lo.c;
import Tq.PointOfService;
import ak.AbstractC5607a;
import ci.CustomerAddress;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.cart.model.hybris.CustomerDataResponse;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import com.meijer.mobile.cart.model.hybris.HybrisDeliveryMode;
import com.meijer.mobile.cart.model.hybris.HybrisLightningCartReward;
import com.meijer.mobile.cart.model.hybris.HybrisSubstitutePreference;
import com.meijer.mobile.cart.model.hybris.MultiTenderPaymentInfoResponse;
import com.meijer.mobile.cart.model.hybris.PaymentDetails;
import com.meijer.mobile.cart.model.hybris.TenderResponse;
import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupPerson;
import com.meijer.mobile.cart.model.hybris.orders.HybrisOrderPrice;
import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult;
import com.meijer.mobile.cart.model.hybris.orders.HybrisVoucher;
import com.meijer.mobile.cart.model.hybris.principal.HybrisPrincipal;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import di.C13525b;
import ej.CustomerData;
import ej.DeliveryMode;
import ej.MultiTenderPaymentInfo;
import ej.PaymentDetailItem;
import ej.SubstitutePreference;
import fj.PickupPerson;
import fj.PickupSlotInfo;
import gj.OrderDetail;
import gj.ShopperInfo;
import gj.TipAmount;
import gj.TipAndRateDetails;
import gj.f;
import hj.Principal;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jj.C14982f;
import jj.C14983g;
import jj.D;
import jj.p;
import jj.q;
import jj.r;
import jj.u;
import jj.x;
import kj.C15169b;
import kj.C15171d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import mj.C15635a;
import mj.C15636b;
import mj.e;
import mj.g;
import mk.b;
import nj.C15876b;
import nj.C15880f;
import nj.C15881g;
import oj.C16089a;
import vk.C17590a;
import vk.d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\u0010\u0010\u001a\u00060\u0007j\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;", "", "isFinal", "canDisplaySubsAndUnfulfilledItems", "Lgj/c;", "e", "(Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;ZZ)Lgj/c;", "", "statusType", "isDeliveryOrder", "isShiptOrder", "Lgj/f;", "b", "(Ljava/lang/String;ZZ)Lgj/f;", "statusUpdateReason", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lak/a;", "c", "(Ljava/lang/String;Ljava/lang/String;)Lak/a;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final ak.AbstractC5607a c(java.lang.String r11, java.lang.String r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.cart.model.hybris.orderdetails.a.c(java.lang.String, java.lang.String):ak.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(String separateReasonWord) {
        String strValueOf;
        Intrinsics.j(separateReasonWord, "separateReasonWord");
        if (separateReasonWord.length() <= 0) {
            return separateReasonWord;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = separateReasonWord.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale locale = Locale.getDefault();
            Intrinsics.i(locale, "getDefault(...)");
            strValueOf = CharsKt.e(cCharAt, locale);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb2.append((Object) strValueOf);
        String strSubstring = separateReasonWord.substring(1);
        Intrinsics.i(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    public static final OrderDetail e(OrderDetailResponse orderDetailResponse, boolean z10, boolean z11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List listD;
        OffsetDateTime offsetDateTime;
        Intrinsics.j(orderDetailResponse, "<this>");
        String strG = orderDetailResponse.getCode();
        String strO = orderDetailResponse.getName();
        String strV = orderDetailResponse.getDescription();
        String strE = orderDetailResponse.getExpirationTime();
        boolean zP = orderDetailResponse.getNet();
        b bVarA = Lo.b.a(orderDetailResponse.getItemsTotal());
        b bVarA2 = Lo.b.a(orderDetailResponse.getTotalCosts());
        b bVarA3 = Lo.b.a(orderDetailResponse.getTotalPriceWithTax());
        b bVarA4 = Lo.b.a(orderDetailResponse.getTotalPrice());
        b bVarA5 = Lo.b.a(orderDetailResponse.getTotalTax());
        b bVarA6 = Lo.b.a(orderDetailResponse.getSubTotal());
        b bVarA7 = Lo.b.a(orderDetailResponse.getSubTotalWithoutQuoteDiscounts());
        HybrisPrice hybrisPriceK = orderDetailResponse.getCreditTransactionAmount();
        b bVarA8 = hybrisPriceK != null ? Lo.b.a(hybrisPriceK) : null;
        b bVarA9 = Lo.b.a(orderDetailResponse.getDeliveryCost());
        List<EntryJson> listD2 = orderDetailResponse.D();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.x(listD2, 10));
        Iterator<T> it = listD2.iterator();
        while (it.hasNext()) {
            arrayList5.add(C14983g.b((EntryJson) it.next()));
        }
        int iK0 = orderDetailResponse.getTotalItems();
        HybrisDeliveryMode hybrisDeliveryModeP = orderDetailResponse.getDeliveryMode();
        DeliveryMode c13680hA = hybrisDeliveryModeP != null ? p.a(hybrisDeliveryModeP) : null;
        HybrisCustomerAddress hybrisCustomerAddressM = orderDetailResponse.getDeliveryAddress();
        CustomerAddress c6395cA = hybrisCustomerAddressM != null ? C13525b.a(hybrisCustomerAddressM) : null;
        PaymentDetails paymentDetailsX = orderDetailResponse.getPaymentInfo();
        PaymentDetailItem uVarB = paymentDetailsX != null ? D.b(paymentDetailsX) : null;
        List<HybrisPromotionResult> listA = orderDetailResponse.a();
        ArrayList arrayList6 = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList6.add(C15880f.a((HybrisPromotionResult) it2.next()));
        }
        List<HybrisPromotionResult> listB = orderDetailResponse.b();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it3 = listB.iterator();
        while (it3.hasNext()) {
            arrayList7.add(C15880f.a((HybrisPromotionResult) it3.next()));
        }
        b bVarA10 = Lo.b.a(orderDetailResponse.getProductDiscounts());
        HybrisPrice hybrisPriceF = orderDetailResponse.getExtendedDeliveryCost();
        b bVarA11 = hybrisPriceF != null ? Lo.b.a(hybrisPriceF) : null;
        b bVarA12 = Lo.b.a(orderDetailResponse.getOrderDiscounts());
        b bVarA13 = Lo.b.a(orderDetailResponse.getQuoteDiscounts());
        double dG0 = orderDetailResponse.getQuoteDiscountsRate();
        String strH0 = orderDetailResponse.getQuoteDiscountsType();
        b bVarA14 = Lo.b.a(orderDetailResponse.getTotalDiscounts());
        Savings cVarA = c.a(orderDetailResponse.getTotalSavings());
        b bVarA15 = Lo.b.a(orderDetailResponse.getTotalDiscountsWithQuoteDiscounts());
        HybrisPrice hybrisPriceU0 = orderDetailResponse.getSubTotalWithDiscounts();
        b bVarA16 = hybrisPriceU0 != null ? Lo.b.a(hybrisPriceU0) : null;
        String strN0 = orderDetailResponse.getSite();
        String strS0 = orderDetailResponse.getStore();
        Savings cVarA2 = c.a(orderDetailResponse.getCouponsSavings());
        Savings cVarA3 = c.a(orderDetailResponse.getMperksSavings());
        Savings cVarA4 = c.a(orderDetailResponse.getSpecialsSavings());
        Savings cVarA5 = c.a(orderDetailResponse.getTeamMemberSavings());
        String strI = orderDetailResponse.getGuid();
        boolean zD = orderDetailResponse.getCalculated();
        List<HybrisVoucher> listC = orderDetailResponse.c();
        b bVar = bVarA11;
        ArrayList arrayList8 = new ArrayList(CollectionsKt.x(listC, 10));
        Iterator<T> it4 = listC.iterator();
        while (it4.hasNext()) {
            arrayList8.add(C15881g.a((HybrisVoucher) it4.next()));
        }
        HybrisPrincipal hybrisPrincipalT0 = orderDetailResponse.getUser();
        Principal c14484aA = hybrisPrincipalT0 != null ? C16089a.a(hybrisPrincipalT0) : null;
        int iB0 = orderDetailResponse.getPickupItemsQuantity();
        int iO = orderDetailResponse.getDeliveryItemsQuantity();
        int iQ0 = orderDetailResponse.getTotalUnitCount();
        List<HybrisOrderPrice> listS = orderDetailResponse.S();
        ArrayList arrayList9 = new ArrayList(CollectionsKt.x(listS, 10));
        Iterator<T> it5 = listS.iterator();
        while (it5.hasNext()) {
            arrayList9.add(C15876b.a((HybrisOrderPrice) it5.next()));
        }
        String strL = orderDetailResponse.getMerchantCustomerId();
        b bVarA17 = Lo.b.a(orderDetailResponse.getDepositPrice());
        HybrisPointOfService hybrisPointOfServiceD0 = orderDetailResponse.getPointOfService();
        PointOfService cVarA6 = hybrisPointOfServiceD0 != null ? Uq.c.a(hybrisPointOfServiceD0) : null;
        HybrisSubstitutePreference hybrisSubstitutePreferenceW0 = orderDetailResponse.getSubstitutePreference();
        SubstitutePreference dA = hybrisSubstitutePreferenceW0 != null ? u.a(hybrisSubstitutePreferenceW0) : null;
        boolean zY = orderDetailResponse.getPhoneNumberTextable();
        PickupSlotInfo cVarA7 = C15171d.a(orderDetailResponse.getPickUpSlotInfo());
        PickupSlotInfo cVarA8 = C15171d.a(orderDetailResponse.getOriginalPickUpSlotInfo());
        String strV0 = orderDetailResponse.getVehicleDescription();
        String strU0 = orderDetailResponse.getValidAgeAcknowledgementTime();
        CustomerDataResponse customerDataResponseL = orderDetailResponse.getCustomerData();
        CustomerData c13679gA = customerDataResponseL != null ? C14982f.a(customerDataResponseL) : null;
        boolean zC = orderDetailResponse.getEditable();
        String strU = orderDetailResponse.getOriginalOrderId();
        String strR = orderDetailResponse.getOrderNotes();
        boolean zF0 = orderDetailResponse.getTippablePartner();
        boolean zG0 = orderDetailResponse.getTippedAndRated();
        HybrisShopperInfo hybrisShopperInfoM0 = orderDetailResponse.getShopperInfo();
        ShopperInfo lVarA = hybrisShopperInfoM0 != null ? C15635a.a(hybrisShopperInfoM0) : null;
        b bVarA18 = Lo.b.a(orderDetailResponse.getConvenienceFee());
        String strQ = orderDetailResponse.getDeliveryNote();
        HybrisTipAmount hybrisTipAmountA0 = orderDetailResponse.getTipAmount();
        TipAmount mVarA = hybrisTipAmountA0 != null ? C15636b.a(hybrisTipAmountA0) : null;
        String strC0 = orderDetailResponse.getTipAuthCode();
        boolean zW0 = orderDetailResponse.getIsMfc();
        String strJ = orderDetailResponse.getCreated();
        OffsetDateTime offsetDateTime2 = strJ != null ? (OffsetDateTime) d.b(strJ, C17590a.f164803a.s(), new r()) : null;
        String strT = orderDetailResponse.getOrderStatus();
        HybrisDeliveryMode hybrisDeliveryModeP2 = orderDetailResponse.getDeliveryMode();
        boolean zE = hybrisDeliveryModeP2 != null ? hybrisDeliveryModeP2.e() : false;
        HybrisPointOfService hybrisPointOfServiceD02 = orderDetailResponse.getPointOfService();
        f fVarB = b(strT, zE, Intrinsics.e(hybrisPointOfServiceD02 != null ? hybrisPointOfServiceD02.getCurbsidePartner() : null, "SHIPT"));
        String strP0 = orderDetailResponse.getStatusDisplay();
        boolean zH = orderDetailResponse.getGuestCustomer();
        String strS = orderDetailResponse.getDeliveryStatus();
        String strT2 = orderDetailResponse.getDeliveryStatusDisplay();
        List<OrderEntryJson> listR0 = orderDetailResponse.R0();
        ArrayList arrayList10 = new ArrayList(CollectionsKt.x(listR0, 10));
        Iterator<T> it6 = listR0.iterator();
        while (it6.hasNext()) {
            arrayList10.add(e.a((OrderEntryJson) it6.next()));
        }
        boolean zE2 = orderDetailResponse.getCancellable();
        boolean zJ0 = orderDetailResponse.getReturnable();
        String strZ0 = orderDetailResponse.getTimeZone();
        String strL0 = orderDetailResponse.getRtsCartId();
        List<HybrisTotalTaxValue> listP0 = orderDetailResponse.P0();
        ArrayList arrayList11 = new ArrayList(CollectionsKt.x(listP0, 10));
        Iterator<T> it7 = listP0.iterator();
        while (it7.hasNext()) {
            arrayList11.add(mj.c.a((HybrisTotalTaxValue) it7.next()));
        }
        List<HybrisLightningCartReward> listK = orderDetailResponse.K();
        if (listK != null) {
            List<HybrisLightningCartReward> list = listK;
            arrayList = arrayList11;
            arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(q.a((HybrisLightningCartReward) it8.next()));
            }
        } else {
            arrayList = arrayList11;
            arrayList2 = null;
        }
        HybrisPickupPerson hybrisPickupPersonZ = orderDetailResponse.getPickUpPerson();
        PickupPerson c13911bA = hybrisPickupPersonZ != null ? C15169b.a(hybrisPickupPersonZ) : null;
        String strD0 = orderDetailResponse.getTipCode();
        String strE0 = orderDetailResponse.getTipDate();
        OffsetDateTime offsetDateTime3 = strE0 != null ? (OffsetDateTime) d.b(strE0, C17590a.f164803a.s(), new r()) : null;
        String strF = orderDetailResponse.getCaptureAuthCode();
        Integer numI0 = orderDetailResponse.getRating();
        List<EntryJson> listS0 = orderDetailResponse.S0();
        ArrayList arrayList12 = arrayList2;
        ArrayList arrayList13 = new ArrayList(CollectionsKt.x(listS0, 10));
        Iterator<T> it9 = listS0.iterator();
        while (it9.hasNext()) {
            arrayList13.add(C14983g.b((EntryJson) it9.next()));
        }
        String strQ0 = orderDetailResponse.getStatusUpdateReason();
        AbstractC5607a abstractC5607aC = strQ0 != null ? c(strQ0, orderDetailResponse.getCode()) : null;
        String strR0 = orderDetailResponse.getStatusUpdateTimestamp();
        ZonedDateTime zonedDateTimeAtZoneSameInstant = (strR0 == null || (offsetDateTime = (OffsetDateTime) d.b(strR0, C17590a.f164803a.s(), new r())) == null) ? null : offsetDateTime.atZoneSameInstant(ZoneId.systemDefault());
        String strG2 = orderDetailResponse.getFulfillmentEligibility();
        String strW = orderDetailResponse.getPartnerEligibility();
        b bVarA19 = Lo.b.a(orderDetailResponse.getEbtCapturedBalance());
        b bVarA20 = Lo.b.a(orderDetailResponse.getEbtSurchargePrice());
        b bVarA21 = Lo.b.a(orderDetailResponse.getEbtNonEligibleTotal());
        b bVarA22 = Lo.b.a(orderDetailResponse.getEbtEligibleTotal());
        List<EbtTransactionResponse> listY = orderDetailResponse.y();
        if (listY != null) {
            List<EbtTransactionResponse> list2 = listY;
            arrayList3 = arrayList13;
            ArrayList arrayList14 = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator<T> it10 = list2.iterator();
            while (it10.hasNext()) {
                arrayList14.add(EbtTransactionResponse.INSTANCE.a((EbtTransactionResponse) it10.next()));
            }
            arrayList4 = arrayList14;
        } else {
            arrayList3 = arrayList13;
            arrayList4 = null;
        }
        HybrisPrice hybrisPriceK0 = orderDetailResponse.getRtsCapturedBalance();
        b bVarA23 = hybrisPriceK0 != null ? Lo.b.a(hybrisPriceK0) : null;
        MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponseN = orderDetailResponse.getMultiTenderPaymentInfo();
        MultiTenderPaymentInfo sVarA = multiTenderPaymentInfoResponseN != null ? x.a(multiTenderPaymentInfoResponseN) : null;
        TipAndRateDetails nVarA = g.a(orderDetailResponse.getTipAndRateDetailsResponse());
        List<TenderResponse> listY0 = orderDetailResponse.y0();
        if (listY0 != null) {
            List<TenderResponse> list3 = listY0;
            listD = new ArrayList(CollectionsKt.x(list3, 10));
            Iterator<T> it11 = list3.iterator();
            while (it11.hasNext()) {
                listD.add(((TenderResponse) it11.next()).s());
            }
        } else {
            PaymentDetails paymentDetailsX2 = orderDetailResponse.getPaymentInfo();
            listD = paymentDetailsX2 != null ? D.d(paymentDetailsX2) : CollectionsKt.m();
        }
        return new OrderDetail(strG, null, z10, z11, strO, strV, strE, zP, bVarA3, bVarA4, bVarA, bVarA2, bVarA5, bVarA6, bVarA7, bVarA8, bVarA9, bVar, arrayList5, iK0, c13680hA, c6395cA, uVarB, arrayList6, arrayList7, bVarA10, bVarA12, bVarA13, dG0, strH0, bVarA14, cVarA, bVarA15, bVarA16, strN0, strS0, cVarA2, cVarA3, cVarA4, cVarA5, strI, zD, arrayList8, c14484aA, iB0, iO, iQ0, arrayList9, strL, bVarA17, cVarA6, dA, zY, cVarA7, cVarA8, strV0, strU0, c13679gA, zC, strU, strR, zF0, zG0, lVarA, bVarA18, strQ, mVarA, zW0, offsetDateTime2, fVarB, strP0, zH, strS, strT2, arrayList10, zE2, zJ0, strZ0, strL0, arrayList, arrayList12, c13911bA, strC0, strD0, offsetDateTime3, strF, numI0, arrayList3, abstractC5607aC, zonedDateTimeAtZoneSameInstant, strG2, strW, bVarA22, bVarA21, bVarA19, bVarA23, bVarA20, arrayList4, sVarA, nVarA, listD, 2, 0, 0, 0, null);
    }

    public static /* synthetic */ OrderDetail f(OrderDetailResponse orderDetailResponse, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return e(orderDetailResponse, z10, z11);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final f b(String str, boolean z10, boolean z11) {
        switch (str.hashCode()) {
            case -1920533136:
                if (str.equals("CANCELLING")) {
                    return f.f133634q;
                }
                break;
            case -1750699932:
                if (str.equals("DELIVERED")) {
                    return f.f133631n;
                }
                break;
            case -1577274056:
                if (str.equals("EXPORT_READY")) {
                    return f.f133620c;
                }
                break;
            case -1509886407:
                if (str.equals("SHOPPED")) {
                    return f.f133628k;
                }
                break;
            case -1031784143:
                if (str.equals("CANCELLED")) {
                    return f.f133633p;
                }
                break;
            case 483552411:
                if (str.equals("UPDATED")) {
                    return f.f133621d;
                }
                break;
            case 630230970:
                if (str.equals("RESCHEDULED")) {
                    return f.f133626i;
                }
                break;
            case 846822844:
                if (str.equals("PROCESSING_ERROR")) {
                    return f.f133635r;
                }
                break;
            case 940508099:
                if (str.equals("UNDER_MODIFICATION")) {
                    return f.f133623f;
                }
                break;
            case 1383663147:
                if (str.equals("COMPLETED")) {
                    if (z10) {
                        return f.f133630m;
                    }
                    return f.f133632o;
                }
                break;
            case 1571299771:
                if (str.equals("CLAIMED")) {
                    return f.f133627j;
                }
                break;
            case 1691945255:
                if (str.equals("READY_FOR_PICK_UP")) {
                    return f.f133629l;
                }
                break;
            case 1703068899:
                if (str.equals("MFC_READY_FOR_PICKUP")) {
                    return f.f133636s;
                }
                break;
            case 1746537160:
                if (str.equals("CREATED")) {
                    return f.f133622e;
                }
                break;
            case 1982485311:
                if (str.equals("CONFIRMED")) {
                    if (z11) {
                        return f.f133624g;
                    }
                    return f.f133625h;
                }
                break;
        }
        return f.f133637t;
    }
}
