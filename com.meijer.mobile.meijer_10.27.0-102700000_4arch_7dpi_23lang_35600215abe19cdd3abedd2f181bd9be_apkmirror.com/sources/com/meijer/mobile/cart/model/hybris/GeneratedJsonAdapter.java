package com.meijer.mobile.cart.model.hybris;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupPerson;
import com.meijer.mobile.cart.model.hybris.principal.HybrisPrincipal;
import com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0018R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0018R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0018R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0018R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0018R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0018R \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0018R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0018R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0018R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0018R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/CartJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/cart/model/hybris/Cart;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/cart/model/hybris/Cart;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/cart/model/hybris/CartModifications;", "nullableCartModificationsAdapter", "", "Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "listOfEntryJsonAdapter", "", "booleanAdapter", "Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "nullableCustomerDataResponseAdapter", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "hybrisPointOfServiceAdapter", "Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "nullableHybrisSubstitutePreferenceAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "hybrisPriceAdapter", "Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "nullableHybrisDeliveryModeAdapter", "", "intAdapter", "Lcom/meijer/mobile/cart/model/hybris/DeliveryOrderGroup;", "listOfDeliveryOrderGroupAdapter", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "nullableHybrisCustomerAddressAdapter", "nullableHybrisPriceAdapter", "nullableStringAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "hybrisSavingsAdapter", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "nullablePaymentDetailsAdapter", "Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "nullableMultiTenderPaymentInfoResponseAdapter", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "nullableHybrisPickupPersonAdapter", "Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "nullableHybrisPickupSlotInfoAdapter", "Lcom/meijer/mobile/cart/model/hybris/PickupOrderGroup;", "listOfPickupOrderGroupAdapter", "Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;", "nullableHybrisPrincipalAdapter", "Lcom/meijer/mobile/cart/model/hybris/HighValuePromo;", "listOfHighValuePromoAdapter", "Lcom/meijer/mobile/cart/model/hybris/FulfillmentEligibility;", "listOfFulfillmentEligibilityAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.cart.model.hybris.CartJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<Cart> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<Cart> constructorRef;
    private final h<HybrisPointOfService> hybrisPointOfServiceAdapter;
    private final h<HybrisPrice> hybrisPriceAdapter;
    private final h<HybrisSavings> hybrisSavingsAdapter;
    private final h<Integer> intAdapter;
    private final h<List<DeliveryOrderGroup>> listOfDeliveryOrderGroupAdapter;
    private final h<List<EntryJson>> listOfEntryJsonAdapter;
    private final h<List<FulfillmentEligibility>> listOfFulfillmentEligibilityAdapter;
    private final h<List<HighValuePromo>> listOfHighValuePromoAdapter;
    private final h<List<PickupOrderGroup>> listOfPickupOrderGroupAdapter;
    private final h<CartModifications> nullableCartModificationsAdapter;
    private final h<CustomerDataResponse> nullableCustomerDataResponseAdapter;
    private final h<HybrisCustomerAddress> nullableHybrisCustomerAddressAdapter;
    private final h<HybrisDeliveryMode> nullableHybrisDeliveryModeAdapter;
    private final h<HybrisPickupPerson> nullableHybrisPickupPersonAdapter;
    private final h<HybrisPickupSlotInfo> nullableHybrisPickupSlotInfoAdapter;
    private final h<HybrisPrice> nullableHybrisPriceAdapter;
    private final h<HybrisPrincipal> nullableHybrisPrincipalAdapter;
    private final h<HybrisSubstitutePreference> nullableHybrisSubstitutePreferenceAdapter;
    private final h<MultiTenderPaymentInfoResponse> nullableMultiTenderPaymentInfoResponseAdapter;
    private final h<PaymentDetails> nullablePaymentDetailsAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("code", "cartModification", "entries", "calculated", "customerData", "guid", "pointOfService", "substitutePreference", "depositPrice", "deliveryCost", "deliveryMode", "deliveryItemsQuantity", "deliveryOrderGroups", "deliveryAddress", "earlyDelivery", "deliveryAddressIsAlcoholEligible", "earlyDeliveryAvailable", "extendedDeliveryCost", "editOrderWet", "expirationTime", "net", "couponsSavings", "orderDiscounts", "paymentInfo", "multiTenderPaymentInfo", "pickUpPerson", "pickUpSlotInfo", "pickupItemsQuantity", "pickupOrderGroups", "phoneNumberTextable", "productDiscounts", "purchaseOrderNumber", "saveTime", "savedBy", "site", "specialsSavings", PlaceTypes.STORE, "subTotal", "tippedAndRated", "teamMemberSavings", "mperksSavings", "totalDiscounts", "totalItems", "itemsTotal", "totalCosts", "totalPrice", "totalPriceWithTax", "creditTransactionAmount", "totalSavings", "totalTax", "totalUnitCount", "user", "type", "originalOrderId", "highValuePromos", "fulfillmentEligibility", "partnerEligibility", "availableFulfillmentEligibilities", "ebtEligibleTotal", "ebtNonEligibleTotal", "ebtSurchargePrice", "ebtSuggestedTotal");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "code");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<CartModifications> hVarF2 = moshi.f(CartModifications.class, SetsKt.e(), "outOfStockModifications");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableCartModificationsAdapter = hVarF2;
        h<List<EntryJson>> hVarF3 = moshi.f(x.j(List.class, EntryJson.class), SetsKt.e(), "entries");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.listOfEntryJsonAdapter = hVarF3;
        h<Boolean> hVarF4 = moshi.f(Boolean.TYPE, SetsKt.e(), "calculated");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.booleanAdapter = hVarF4;
        h<CustomerDataResponse> hVarF5 = moshi.f(CustomerDataResponse.class, SetsKt.e(), "customerData");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableCustomerDataResponseAdapter = hVarF5;
        h<HybrisPointOfService> hVarF6 = moshi.f(HybrisPointOfService.class, SetsKt.e(), "pointOfService");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.hybrisPointOfServiceAdapter = hVarF6;
        h<HybrisSubstitutePreference> hVarF7 = moshi.f(HybrisSubstitutePreference.class, SetsKt.e(), "substitutePreference");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.nullableHybrisSubstitutePreferenceAdapter = hVarF7;
        h<HybrisPrice> hVarF8 = moshi.f(HybrisPrice.class, SetsKt.e(), "depositPrice");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.hybrisPriceAdapter = hVarF8;
        h<HybrisDeliveryMode> hVarF9 = moshi.f(HybrisDeliveryMode.class, SetsKt.e(), "deliveryMode");
        Intrinsics.i(hVarF9, "adapter(...)");
        this.nullableHybrisDeliveryModeAdapter = hVarF9;
        h<Integer> hVarF10 = moshi.f(Integer.TYPE, SetsKt.e(), "deliveryItemsQuantity");
        Intrinsics.i(hVarF10, "adapter(...)");
        this.intAdapter = hVarF10;
        h<List<DeliveryOrderGroup>> hVarF11 = moshi.f(x.j(List.class, DeliveryOrderGroup.class), SetsKt.e(), "deliveryOrderGroups");
        Intrinsics.i(hVarF11, "adapter(...)");
        this.listOfDeliveryOrderGroupAdapter = hVarF11;
        h<HybrisCustomerAddress> hVarF12 = moshi.f(HybrisCustomerAddress.class, SetsKt.e(), "deliveryAddress");
        Intrinsics.i(hVarF12, "adapter(...)");
        this.nullableHybrisCustomerAddressAdapter = hVarF12;
        h<HybrisPrice> hVarF13 = moshi.f(HybrisPrice.class, SetsKt.e(), "extendedDeliveryCost");
        Intrinsics.i(hVarF13, "adapter(...)");
        this.nullableHybrisPriceAdapter = hVarF13;
        h<String> hVarF14 = moshi.f(String.class, SetsKt.e(), "expirationTime");
        Intrinsics.i(hVarF14, "adapter(...)");
        this.nullableStringAdapter = hVarF14;
        h<HybrisSavings> hVarF15 = moshi.f(HybrisSavings.class, SetsKt.e(), "couponsSavings");
        Intrinsics.i(hVarF15, "adapter(...)");
        this.hybrisSavingsAdapter = hVarF15;
        h<PaymentDetails> hVarF16 = moshi.f(PaymentDetails.class, SetsKt.e(), "paymentInfo");
        Intrinsics.i(hVarF16, "adapter(...)");
        this.nullablePaymentDetailsAdapter = hVarF16;
        h<MultiTenderPaymentInfoResponse> hVarF17 = moshi.f(MultiTenderPaymentInfoResponse.class, SetsKt.e(), "multiTenderPaymentInfo");
        Intrinsics.i(hVarF17, "adapter(...)");
        this.nullableMultiTenderPaymentInfoResponseAdapter = hVarF17;
        h<HybrisPickupPerson> hVarF18 = moshi.f(HybrisPickupPerson.class, SetsKt.e(), "pickUpPerson");
        Intrinsics.i(hVarF18, "adapter(...)");
        this.nullableHybrisPickupPersonAdapter = hVarF18;
        h<HybrisPickupSlotInfo> hVarF19 = moshi.f(HybrisPickupSlotInfo.class, SetsKt.e(), "pickUpSlotInfo");
        Intrinsics.i(hVarF19, "adapter(...)");
        this.nullableHybrisPickupSlotInfoAdapter = hVarF19;
        h<List<PickupOrderGroup>> hVarF20 = moshi.f(x.j(List.class, PickupOrderGroup.class), SetsKt.e(), "pickupOrderGroups");
        Intrinsics.i(hVarF20, "adapter(...)");
        this.listOfPickupOrderGroupAdapter = hVarF20;
        h<HybrisPrincipal> hVarF21 = moshi.f(HybrisPrincipal.class, SetsKt.e(), "savedBy");
        Intrinsics.i(hVarF21, "adapter(...)");
        this.nullableHybrisPrincipalAdapter = hVarF21;
        h<List<HighValuePromo>> hVarF22 = moshi.f(x.j(List.class, HighValuePromo.class), SetsKt.e(), "highValuePromos");
        Intrinsics.i(hVarF22, "adapter(...)");
        this.listOfHighValuePromoAdapter = hVarF22;
        h<List<FulfillmentEligibility>> hVarF23 = moshi.f(x.j(List.class, FulfillmentEligibility.class), SetsKt.e(), "availableFulfillmentEligibilities");
        Intrinsics.i(hVarF23, "adapter(...)");
        this.listOfFulfillmentEligibilityAdapter = hVarF23;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cart fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        int i11;
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        List<DeliveryOrderGroup> listFromJson = null;
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        Boolean boolFromJson3 = boolFromJson2;
        Boolean boolFromJson4 = boolFromJson3;
        Boolean boolFromJson5 = boolFromJson4;
        Boolean boolFromJson6 = boolFromJson5;
        Boolean boolFromJson7 = boolFromJson6;
        Boolean boolFromJson8 = boolFromJson7;
        Integer numFromJson = 0;
        Integer numFromJson2 = null;
        Integer numFromJson3 = null;
        Integer numFromJson4 = null;
        HybrisSavings hybrisSavingsFromJson = null;
        HybrisPrice hybrisPriceFromJson = null;
        String strFromJson = null;
        List<EntryJson> listFromJson2 = null;
        HybrisPrice hybrisPriceFromJson2 = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        HybrisSavings hybrisSavingsFromJson2 = null;
        HybrisPrice hybrisPriceFromJson3 = null;
        HybrisPrice hybrisPriceFromJson4 = null;
        HybrisDeliveryMode hybrisDeliveryModeFromJson = null;
        HybrisCustomerAddress hybrisCustomerAddressFromJson = null;
        HybrisPrice hybrisPriceFromJson5 = null;
        String strFromJson4 = null;
        MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponseFromJson = null;
        HybrisPickupPerson hybrisPickupPersonFromJson = null;
        HybrisPickupSlotInfo hybrisPickupSlotInfoFromJson = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        HybrisPrincipal hybrisPrincipalFromJson = null;
        HybrisPrice hybrisPriceFromJson6 = null;
        HybrisPrincipal hybrisPrincipalFromJson2 = null;
        CartModifications cartModificationsFromJson = null;
        CustomerDataResponse customerDataResponseFromJson = null;
        HybrisPointOfService hybrisPointOfServiceFromJson = null;
        HybrisSubstitutePreference hybrisSubstitutePreferenceFromJson = null;
        PaymentDetails paymentDetailsFromJson = null;
        String strFromJson7 = null;
        HybrisPrice hybrisPriceFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        HybrisSavings hybrisSavingsFromJson3 = null;
        HybrisSavings hybrisSavingsFromJson4 = null;
        HybrisPrice hybrisPriceFromJson8 = null;
        HybrisPrice hybrisPriceFromJson9 = null;
        HybrisPrice hybrisPriceFromJson10 = null;
        HybrisPrice hybrisPriceFromJson11 = null;
        HybrisPrice hybrisPriceFromJson12 = null;
        HybrisSavings hybrisSavingsFromJson5 = null;
        HybrisPrice hybrisPriceFromJson13 = null;
        String strFromJson11 = null;
        List<HighValuePromo> listFromJson3 = null;
        List<FulfillmentEligibility> listFromJson4 = null;
        HybrisPrice hybrisPriceFromJson14 = null;
        HybrisPrice hybrisPriceFromJson15 = null;
        HybrisPrice hybrisPriceFromJson16 = null;
        HybrisPrice hybrisPriceFromJson17 = null;
        int i12 = -1;
        int i13 = -1;
        List<PickupOrderGroup> listFromJson5 = null;
        while (true) {
            HybrisSavings hybrisSavings = hybrisSavingsFromJson2;
            if (!reader.hasNext()) {
                String str = strFromJson3;
                reader.d();
                if (i13 != 64 || i12 != -1073741824) {
                    HybrisSavings hybrisSavings2 = hybrisSavingsFromJson;
                    HybrisPrice hybrisPrice = hybrisPriceFromJson;
                    List<DeliveryOrderGroup> list = listFromJson;
                    List<PickupOrderGroup> list2 = listFromJson5;
                    HybrisPrice hybrisPrice2 = hybrisPriceFromJson2;
                    String str2 = strFromJson2;
                    HybrisPrincipal hybrisPrincipal = hybrisPrincipalFromJson2;
                    HybrisSavings hybrisSavings3 = hybrisSavingsFromJson3;
                    HybrisSavings hybrisSavings4 = hybrisSavingsFromJson4;
                    HybrisPrice hybrisPrice3 = hybrisPriceFromJson8;
                    HybrisPrice hybrisPrice4 = hybrisPriceFromJson9;
                    HybrisPrice hybrisPrice5 = hybrisPriceFromJson10;
                    HybrisPrice hybrisPrice6 = hybrisPriceFromJson11;
                    HybrisPrice hybrisPrice7 = hybrisPriceFromJson12;
                    HybrisSavings hybrisSavings5 = hybrisSavingsFromJson5;
                    HybrisPrice hybrisPrice8 = hybrisPriceFromJson13;
                    String str3 = strFromJson11;
                    List<HighValuePromo> list3 = listFromJson3;
                    List<FulfillmentEligibility> list4 = listFromJson4;
                    HybrisPrice hybrisPrice9 = hybrisPriceFromJson14;
                    HybrisPrice hybrisPrice10 = hybrisPriceFromJson15;
                    HybrisPrice hybrisPrice11 = hybrisPriceFromJson16;
                    HybrisPrice hybrisPrice12 = hybrisPriceFromJson17;
                    Constructor<Cart> declaredConstructor = this.constructorRef;
                    if (declaredConstructor == null) {
                        Class<?> cls = c.f134099c;
                        Class cls2 = Boolean.TYPE;
                        Class cls3 = Integer.TYPE;
                        declaredConstructor = Cart.class.getDeclaredConstructor(String.class, CartModifications.class, List.class, cls2, CustomerDataResponse.class, String.class, HybrisPointOfService.class, HybrisSubstitutePreference.class, HybrisPrice.class, HybrisPrice.class, HybrisDeliveryMode.class, cls3, List.class, HybrisCustomerAddress.class, cls2, cls2, cls2, HybrisPrice.class, cls2, String.class, cls2, HybrisSavings.class, HybrisPrice.class, PaymentDetails.class, MultiTenderPaymentInfoResponse.class, HybrisPickupPerson.class, HybrisPickupSlotInfo.class, cls3, List.class, cls2, HybrisPrice.class, String.class, String.class, HybrisPrincipal.class, String.class, HybrisSavings.class, String.class, HybrisPrice.class, cls2, HybrisSavings.class, HybrisSavings.class, HybrisPrice.class, cls3, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisSavings.class, HybrisPrice.class, cls3, HybrisPrincipal.class, String.class, String.class, List.class, String.class, String.class, List.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, cls3, cls3, cls);
                        this.constructorRef = declaredConstructor;
                        Intrinsics.i(declaredConstructor, "also(...)");
                    }
                    if (hybrisPointOfServiceFromJson == null) {
                        throw c.o("pointOfService", "pointOfService", reader);
                    }
                    Cart cartNewInstance = declaredConstructor.newInstance(strFromJson, cartModificationsFromJson, listFromJson2, boolFromJson, customerDataResponseFromJson, str2, hybrisPointOfServiceFromJson, hybrisSubstitutePreferenceFromJson, hybrisPriceFromJson3, hybrisPriceFromJson4, hybrisDeliveryModeFromJson, numFromJson, list, hybrisCustomerAddressFromJson, boolFromJson2, boolFromJson3, boolFromJson4, hybrisPriceFromJson5, boolFromJson5, strFromJson4, boolFromJson6, hybrisSavings2, hybrisPrice, paymentDetailsFromJson, multiTenderPaymentInfoResponseFromJson, hybrisPickupPersonFromJson, hybrisPickupSlotInfoFromJson, numFromJson2, list2, boolFromJson7, hybrisPrice2, strFromJson5, strFromJson6, hybrisPrincipalFromJson, str, hybrisSavings, strFromJson7, hybrisPriceFromJson7, boolFromJson8, hybrisSavings3, hybrisSavings4, hybrisPrice3, numFromJson3, hybrisPrice4, hybrisPrice5, hybrisPrice6, hybrisPrice7, hybrisPriceFromJson6, hybrisSavings5, hybrisPrice8, numFromJson4, hybrisPrincipal, str3, strFromJson8, list3, strFromJson9, strFromJson10, list4, hybrisPrice9, hybrisPrice10, hybrisPrice11, hybrisPrice12, Integer.valueOf(i13), Integer.valueOf(i12), null);
                    Intrinsics.i(cartNewInstance, "newInstance(...)");
                    return cartNewInstance;
                }
                HybrisPrincipal hybrisPrincipal2 = hybrisPrincipalFromJson2;
                Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.EntryJson>");
                boolean zBooleanValue = boolFromJson.booleanValue();
                Intrinsics.h(strFromJson2, "null cannot be cast to non-null type kotlin.String");
                if (hybrisPointOfServiceFromJson == null) {
                    throw c.o("pointOfService", "pointOfService", reader);
                }
                Intrinsics.h(hybrisPriceFromJson3, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                Intrinsics.h(hybrisPriceFromJson4, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                int iIntValue = numFromJson.intValue();
                Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.DeliveryOrderGroup>");
                boolean zBooleanValue2 = boolFromJson2.booleanValue();
                boolean zBooleanValue3 = boolFromJson3.booleanValue();
                boolean zBooleanValue4 = boolFromJson4.booleanValue();
                boolean zBooleanValue5 = boolFromJson5.booleanValue();
                boolean zBooleanValue6 = boolFromJson6.booleanValue();
                Intrinsics.h(hybrisSavingsFromJson, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
                Intrinsics.h(hybrisPriceFromJson, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                int iIntValue2 = numFromJson2.intValue();
                Intrinsics.h(listFromJson5, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.PickupOrderGroup>");
                boolean zBooleanValue7 = boolFromJson7.booleanValue();
                Intrinsics.h(hybrisPriceFromJson2, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                Intrinsics.h(str, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(hybrisSavings, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
                HybrisSavings hybrisSavings6 = hybrisSavingsFromJson;
                Intrinsics.h(strFromJson7, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(hybrisPriceFromJson7, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                boolean zBooleanValue8 = boolFromJson8.booleanValue();
                HybrisSavings hybrisSavings7 = hybrisSavingsFromJson3;
                Intrinsics.h(hybrisSavings7, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
                HybrisSavings hybrisSavings8 = hybrisSavingsFromJson4;
                Intrinsics.h(hybrisSavings8, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
                HybrisPrice hybrisPrice13 = hybrisPriceFromJson8;
                Intrinsics.h(hybrisPrice13, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                int iIntValue3 = numFromJson3.intValue();
                HybrisPrice hybrisPrice14 = hybrisPriceFromJson9;
                Intrinsics.h(hybrisPrice14, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                HybrisPrice hybrisPrice15 = hybrisPriceFromJson10;
                Intrinsics.h(hybrisPrice15, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                HybrisPrice hybrisPrice16 = hybrisPriceFromJson11;
                Intrinsics.h(hybrisPrice16, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                HybrisPrice hybrisPrice17 = hybrisPriceFromJson12;
                Intrinsics.h(hybrisPrice17, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                HybrisSavings hybrisSavings9 = hybrisSavingsFromJson5;
                Intrinsics.h(hybrisSavings9, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
                HybrisPrice hybrisPrice18 = hybrisPriceFromJson13;
                Intrinsics.h(hybrisPrice18, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                int iIntValue4 = numFromJson4.intValue();
                String str4 = strFromJson11;
                Intrinsics.h(str4, "null cannot be cast to non-null type kotlin.String");
                List<HighValuePromo> list5 = listFromJson3;
                Intrinsics.h(list5, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.HighValuePromo>");
                List<FulfillmentEligibility> list6 = listFromJson4;
                Intrinsics.h(list6, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.FulfillmentEligibility>");
                HybrisPrice hybrisPrice19 = hybrisPriceFromJson14;
                Intrinsics.h(hybrisPrice19, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                HybrisPrice hybrisPrice20 = hybrisPriceFromJson15;
                Intrinsics.h(hybrisPrice20, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                HybrisPrice hybrisPrice21 = hybrisPriceFromJson16;
                Intrinsics.h(hybrisPrice21, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                HybrisPrice hybrisPrice22 = hybrisPriceFromJson17;
                Intrinsics.h(hybrisPrice22, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
                return new Cart(strFromJson, cartModificationsFromJson, listFromJson2, zBooleanValue, customerDataResponseFromJson, strFromJson2, hybrisPointOfServiceFromJson, hybrisSubstitutePreferenceFromJson, hybrisPriceFromJson3, hybrisPriceFromJson4, hybrisDeliveryModeFromJson, iIntValue, listFromJson, hybrisCustomerAddressFromJson, zBooleanValue2, zBooleanValue3, zBooleanValue4, hybrisPriceFromJson5, zBooleanValue5, strFromJson4, zBooleanValue6, hybrisSavings6, hybrisPriceFromJson, paymentDetailsFromJson, multiTenderPaymentInfoResponseFromJson, hybrisPickupPersonFromJson, hybrisPickupSlotInfoFromJson, iIntValue2, listFromJson5, zBooleanValue7, hybrisPriceFromJson2, strFromJson5, strFromJson6, hybrisPrincipalFromJson, str, hybrisSavings, strFromJson7, hybrisPriceFromJson7, zBooleanValue8, hybrisSavings7, hybrisSavings8, hybrisPrice13, iIntValue3, hybrisPrice14, hybrisPrice15, hybrisPrice16, hybrisPrice17, hybrisPriceFromJson6, hybrisSavings9, hybrisPrice18, iIntValue4, hybrisPrincipal2, str4, strFromJson8, list5, strFromJson9, strFromJson10, list6, hybrisPrice19, hybrisPrice20, hybrisPrice21, hybrisPrice22);
            }
            String str5 = strFromJson3;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("code", "code", reader);
                    }
                    i13 &= -2;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 1:
                    cartModificationsFromJson = this.nullableCartModificationsAdapter.fromJson(reader);
                    i13 &= -3;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 2:
                    listFromJson2 = this.listOfEntryJsonAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw c.w("entries", "entries", reader);
                    }
                    i13 &= -5;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 3:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw c.w("calculated", "calculated", reader);
                    }
                    i13 &= -9;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 4:
                    customerDataResponseFromJson = this.nullableCustomerDataResponseAdapter.fromJson(reader);
                    i13 &= -17;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 5:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.w("guid", "guid", reader);
                    }
                    i13 &= -33;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 6:
                    hybrisPointOfServiceFromJson = this.hybrisPointOfServiceAdapter.fromJson(reader);
                    if (hybrisPointOfServiceFromJson == null) {
                        throw c.w("pointOfService", "pointOfService", reader);
                    }
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 7:
                    hybrisSubstitutePreferenceFromJson = this.nullableHybrisSubstitutePreferenceAdapter.fromJson(reader);
                    i13 &= -129;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 8:
                    hybrisPriceFromJson3 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson3 == null) {
                        throw c.w("depositPrice", "depositPrice", reader);
                    }
                    i13 &= -257;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 9:
                    hybrisPriceFromJson4 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson4 == null) {
                        throw c.w("deliveryCost", "deliveryCost", reader);
                    }
                    i13 &= -513;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 10:
                    hybrisDeliveryModeFromJson = this.nullableHybrisDeliveryModeAdapter.fromJson(reader);
                    i13 &= -1025;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 11:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w("deliveryItemsQuantity", "deliveryItemsQuantity", reader);
                    }
                    i13 &= -2049;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 12:
                    listFromJson = this.listOfDeliveryOrderGroupAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw c.w("deliveryOrderGroups", "deliveryOrderGroups", reader);
                    }
                    i13 &= -4097;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 13:
                    hybrisCustomerAddressFromJson = this.nullableHybrisCustomerAddressAdapter.fromJson(reader);
                    i13 &= -8193;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 14:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw c.w("earlyDelivery", "earlyDelivery", reader);
                    }
                    i13 &= -16385;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 15:
                    boolFromJson3 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson3 == null) {
                        throw c.w("deliveryAddressIsAlcoholEligible", "deliveryAddressIsAlcoholEligible", reader);
                    }
                    i10 = -32769;
                    i13 &= i10;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 16:
                    boolFromJson4 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson4 == null) {
                        throw c.w("earlyDeliveryAvailable", "earlyDeliveryAvailable", reader);
                    }
                    i10 = -65537;
                    i13 &= i10;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 17:
                    hybrisPriceFromJson5 = this.nullableHybrisPriceAdapter.fromJson(reader);
                    i10 = -131073;
                    i13 &= i10;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 18:
                    boolFromJson5 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson5 == null) {
                        throw c.w("editOrderWet", "editOrderWet", reader);
                    }
                    i10 = -262145;
                    i13 &= i10;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 19:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -524289;
                    i13 &= i10;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 20:
                    boolFromJson6 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson6 == null) {
                        throw c.w("net", "net", reader);
                    }
                    i10 = -1048577;
                    i13 &= i10;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 21:
                    hybrisSavingsFromJson = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson == null) {
                        throw c.w("couponsSavings", "couponsSavings", reader);
                    }
                    i13 &= -2097153;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case b.RECONNECTION_TIMED_OUT /* 22 */:
                    hybrisPriceFromJson = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson == null) {
                        throw c.w("orderDiscounts", "orderDiscounts", reader);
                    }
                    i13 &= -4194305;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 23:
                    paymentDetailsFromJson = this.nullablePaymentDetailsAdapter.fromJson(reader);
                    i13 &= -8388609;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 24:
                    multiTenderPaymentInfoResponseFromJson = this.nullableMultiTenderPaymentInfoResponseAdapter.fromJson(reader);
                    i13 &= -16777217;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 25:
                    hybrisPickupPersonFromJson = this.nullableHybrisPickupPersonAdapter.fromJson(reader);
                    i13 &= -33554433;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 26:
                    hybrisPickupSlotInfoFromJson = this.nullableHybrisPickupSlotInfoAdapter.fromJson(reader);
                    i13 &= -67108865;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 27:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw c.w("pickupItemsQuantity", "pickupItemsQuantity", reader);
                    }
                    i13 &= -134217729;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 28:
                    listFromJson5 = this.listOfPickupOrderGroupAdapter.fromJson(reader);
                    if (listFromJson5 == null) {
                        throw c.w("pickupOrderGroups", "pickupOrderGroups", reader);
                    }
                    i13 &= -268435457;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 29:
                    boolFromJson7 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson7 == null) {
                        throw c.w("phoneNumberTextable", "phoneNumberTextable", reader);
                    }
                    i13 &= -536870913;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 30:
                    hybrisPriceFromJson2 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson2 == null) {
                        throw c.w("productDiscounts", "productDiscounts", reader);
                    }
                    i10 = -1073741825;
                    i13 &= i10;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 31:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i10 = a.e.API_PRIORITY_OTHER;
                    i13 &= i10;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case l3.f92486e /* 32 */:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 33:
                    hybrisPrincipalFromJson = this.nullableHybrisPrincipalAdapter.fromJson(reader);
                    i12 &= -3;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 34:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw c.w("site", "site", reader);
                    }
                    i12 &= -5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 35:
                    hybrisSavingsFromJson2 = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson2 == null) {
                        throw c.w("specialSavings", "specialsSavings", reader);
                    }
                    i12 &= -9;
                    strFromJson3 = str5;
                case 36:
                    strFromJson7 = this.stringAdapter.fromJson(reader);
                    if (strFromJson7 == null) {
                        throw c.w(PlaceTypes.STORE, PlaceTypes.STORE, reader);
                    }
                    i12 &= -17;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 37:
                    hybrisPriceFromJson7 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson7 == null) {
                        throw c.w("subTotal", "subTotal", reader);
                    }
                    i12 &= -33;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 38:
                    boolFromJson8 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson8 == null) {
                        throw c.w("tippedAndRated", "tippedAndRated", reader);
                    }
                    i12 &= -65;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 39:
                    hybrisSavingsFromJson3 = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson3 == null) {
                        throw c.w("teamMemberSavings", "teamMemberSavings", reader);
                    }
                    i12 &= -129;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 40:
                    hybrisSavingsFromJson4 = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson4 == null) {
                        throw c.w("mperksSavings", "mperksSavings", reader);
                    }
                    i12 &= -257;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 41:
                    hybrisPriceFromJson8 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson8 == null) {
                        throw c.w("totalDiscounts", "totalDiscounts", reader);
                    }
                    i12 &= -513;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 42:
                    numFromJson3 = this.intAdapter.fromJson(reader);
                    if (numFromJson3 == null) {
                        throw c.w("totalItems", "totalItems", reader);
                    }
                    i12 &= -1025;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 43:
                    hybrisPriceFromJson9 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson9 == null) {
                        throw c.w("itemsTotal", "itemsTotal", reader);
                    }
                    i12 &= -2049;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 44:
                    hybrisPriceFromJson10 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson10 == null) {
                        throw c.w("totalCosts", "totalCosts", reader);
                    }
                    i12 &= -4097;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 45:
                    hybrisPriceFromJson11 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson11 == null) {
                        throw c.w("totalPrice", "totalPrice", reader);
                    }
                    i12 &= -8193;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 46:
                    hybrisPriceFromJson12 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson12 == null) {
                        throw c.w("totalPriceWithTax", "totalPriceWithTax", reader);
                    }
                    i12 &= -16385;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 47:
                    hybrisPriceFromJson6 = this.nullableHybrisPriceAdapter.fromJson(reader);
                    i11 = -32769;
                    i12 &= i11;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 48:
                    hybrisSavingsFromJson5 = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson5 == null) {
                        throw c.w("totalSavings", "totalSavings", reader);
                    }
                    i11 = -65537;
                    i12 &= i11;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 49:
                    hybrisPriceFromJson13 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson13 == null) {
                        throw c.w("totalTax", "totalTax", reader);
                    }
                    i11 = -131073;
                    i12 &= i11;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 50:
                    numFromJson4 = this.intAdapter.fromJson(reader);
                    if (numFromJson4 == null) {
                        throw c.w("totalUnitCount", "totalUnitCount", reader);
                    }
                    i11 = -262145;
                    i12 &= i11;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 51:
                    hybrisPrincipalFromJson2 = this.nullableHybrisPrincipalAdapter.fromJson(reader);
                    i11 = -524289;
                    i12 &= i11;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 52:
                    strFromJson11 = this.stringAdapter.fromJson(reader);
                    if (strFromJson11 == null) {
                        throw c.w("type", "type", reader);
                    }
                    i11 = -1048577;
                    i12 &= i11;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 53:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2097153;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 54:
                    listFromJson3 = this.listOfHighValuePromoAdapter.fromJson(reader);
                    if (listFromJson3 == null) {
                        throw c.w("highValuePromos", "highValuePromos", reader);
                    }
                    i12 &= -4194305;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 55:
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -8388609;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 56:
                    strFromJson10 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -16777217;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 57:
                    listFromJson4 = this.listOfFulfillmentEligibilityAdapter.fromJson(reader);
                    if (listFromJson4 == null) {
                        throw c.w("availableFulfillmentEligibilities", "availableFulfillmentEligibilities", reader);
                    }
                    i12 &= -33554433;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 58:
                    hybrisPriceFromJson14 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson14 == null) {
                        throw c.w("ebtEligibleTotal", "ebtEligibleTotal", reader);
                    }
                    i12 &= -67108865;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 59:
                    hybrisPriceFromJson15 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson15 == null) {
                        throw c.w("ebtNonEligibleTotal", "ebtNonEligibleTotal", reader);
                    }
                    i12 &= -134217729;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 60:
                    hybrisPriceFromJson16 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson16 == null) {
                        throw c.w("ebtSurchargePrice", "ebtSurchargePrice", reader);
                    }
                    i12 &= -268435457;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                case 61:
                    hybrisPriceFromJson17 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson17 == null) {
                        throw c.w("ebtSuggestedTotal", "ebtSuggestedTotal", reader);
                    }
                    i12 &= -536870913;
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
                default:
                    strFromJson3 = str5;
                    hybrisSavingsFromJson2 = hybrisSavings;
            }
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, Cart value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("code");
        this.stringAdapter.toJson(writer, (q) value_.getCode());
        writer.l("cartModification");
        this.nullableCartModificationsAdapter.toJson(writer, (q) value_.getOutOfStockModifications());
        writer.l("entries");
        this.listOfEntryJsonAdapter.toJson(writer, (q) value_.v());
        writer.l("calculated");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getCalculated()));
        writer.l("customerData");
        this.nullableCustomerDataResponseAdapter.toJson(writer, (q) value_.getCustomerData());
        writer.l("guid");
        this.stringAdapter.toJson(writer, (q) value_.getGuid());
        writer.l("pointOfService");
        this.hybrisPointOfServiceAdapter.toJson(writer, (q) value_.getPointOfService());
        writer.l("substitutePreference");
        this.nullableHybrisSubstitutePreferenceAdapter.toJson(writer, (q) value_.getSubstitutePreference());
        writer.l("depositPrice");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getDepositPrice());
        writer.l("deliveryCost");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getDeliveryCost());
        writer.l("deliveryMode");
        this.nullableHybrisDeliveryModeAdapter.toJson(writer, (q) value_.getDeliveryMode());
        writer.l("deliveryItemsQuantity");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getDeliveryItemsQuantity()));
        writer.l("deliveryOrderGroups");
        this.listOfDeliveryOrderGroupAdapter.toJson(writer, (q) value_.l());
        writer.l("deliveryAddress");
        this.nullableHybrisCustomerAddressAdapter.toJson(writer, (q) value_.getDeliveryAddress());
        writer.l("earlyDelivery");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getEarlyDelivery()));
        writer.l("deliveryAddressIsAlcoholEligible");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getDeliveryAddressIsAlcoholEligible()));
        writer.l("earlyDeliveryAvailable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getEarlyDeliveryAvailable()));
        writer.l("extendedDeliveryCost");
        this.nullableHybrisPriceAdapter.toJson(writer, (q) value_.getExtendedDeliveryCost());
        writer.l("editOrderWet");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getEditOrderWet()));
        writer.l("expirationTime");
        this.nullableStringAdapter.toJson(writer, (q) value_.getExpirationTime());
        writer.l("net");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getNet()));
        writer.l("couponsSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getCouponsSavings());
        writer.l("orderDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getOrderDiscounts());
        writer.l("paymentInfo");
        this.nullablePaymentDetailsAdapter.toJson(writer, (q) value_.getPaymentInfo());
        writer.l("multiTenderPaymentInfo");
        this.nullableMultiTenderPaymentInfoResponseAdapter.toJson(writer, (q) value_.getMultiTenderPaymentInfo());
        writer.l("pickUpPerson");
        this.nullableHybrisPickupPersonAdapter.toJson(writer, (q) value_.getPickUpPerson());
        writer.l("pickUpSlotInfo");
        this.nullableHybrisPickupSlotInfoAdapter.toJson(writer, (q) value_.getPickUpSlotInfo());
        writer.l("pickupItemsQuantity");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getPickupItemsQuantity()));
        writer.l("pickupOrderGroups");
        this.listOfPickupOrderGroupAdapter.toJson(writer, (q) value_.O());
        writer.l("phoneNumberTextable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getPhoneNumberTextable()));
        writer.l("productDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getProductDiscounts());
        writer.l("purchaseOrderNumber");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPurchaseOrderNumber());
        writer.l("saveTime");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSaveTime());
        writer.l("savedBy");
        this.nullableHybrisPrincipalAdapter.toJson(writer, (q) value_.getSavedBy());
        writer.l("site");
        this.stringAdapter.toJson(writer, (q) value_.getSite());
        writer.l("specialsSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getSpecialSavings());
        writer.l(PlaceTypes.STORE);
        this.stringAdapter.toJson(writer, (q) value_.getStore());
        writer.l("subTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getSubTotal());
        writer.l("tippedAndRated");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getTippedAndRated()));
        writer.l("teamMemberSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getTeamMemberSavings());
        writer.l("mperksSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getMperksSavings());
        writer.l("totalDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalDiscounts());
        writer.l("totalItems");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTotalItems()));
        writer.l("itemsTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getItemsTotal());
        writer.l("totalCosts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalCosts());
        writer.l("totalPrice");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalPrice());
        writer.l("totalPriceWithTax");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalPriceWithTax());
        writer.l("creditTransactionAmount");
        this.nullableHybrisPriceAdapter.toJson(writer, (q) value_.getCreditTransactionAmount());
        writer.l("totalSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getTotalSavings());
        writer.l("totalTax");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalTax());
        writer.l("totalUnitCount");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTotalUnitCount()));
        writer.l("user");
        this.nullableHybrisPrincipalAdapter.toJson(writer, (q) value_.getUser());
        writer.l("type");
        this.stringAdapter.toJson(writer, (q) value_.getType());
        writer.l("originalOrderId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOriginalOrderId());
        writer.l("highValuePromos");
        this.listOfHighValuePromoAdapter.toJson(writer, (q) value_.A());
        writer.l("fulfillmentEligibility");
        this.nullableStringAdapter.toJson(writer, (q) value_.getFulfillmentEligibility());
        writer.l("partnerEligibility");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPartnerEligibility());
        writer.l("availableFulfillmentEligibilities");
        this.listOfFulfillmentEligibilityAdapter.toJson(writer, (q) value_.b());
        writer.l("ebtEligibleTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getEbtEligibleTotal());
        writer.l("ebtNonEligibleTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getEbtNonEligibleTotal());
        writer.l("ebtSurchargePrice");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getEbtSurchargePrice());
        writer.l("ebtSuggestedTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getEbtSuggestedTotal());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Cart");
        sb2.append(')');
        return sb2.toString();
    }
}
