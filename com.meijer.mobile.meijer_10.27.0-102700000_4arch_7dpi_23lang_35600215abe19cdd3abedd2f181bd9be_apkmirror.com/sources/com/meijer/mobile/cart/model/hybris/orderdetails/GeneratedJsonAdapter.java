package com.meijer.mobile.cart.model.hybris.orderdetails;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.cart.model.hybris.CustomerDataResponse;
import com.meijer.mobile.cart.model.hybris.DeliveryOrderGroup;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import com.meijer.mobile.cart.model.hybris.HybrisDeliveryMode;
import com.meijer.mobile.cart.model.hybris.HybrisLightningCartReward;
import com.meijer.mobile.cart.model.hybris.HybrisSubstitutePreference;
import com.meijer.mobile.cart.model.hybris.MultiTenderPaymentInfoResponse;
import com.meijer.mobile.cart.model.hybris.PaymentDetails;
import com.meijer.mobile.cart.model.hybris.PickupOrderGroup;
import com.meijer.mobile.cart.model.hybris.TenderResponse;
import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupPerson;
import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupSlotInfo;
import com.meijer.mobile.cart.model.hybris.orders.HybrisOrderPrice;
import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult;
import com.meijer.mobile.cart.model.hybris.orders.HybrisVoucher;
import com.meijer.mobile.cart.model.hybris.principal.HybrisPrincipal;
import com.meijer.mobile.core.util.moshi.SkipBadElements;
import com.meijer.mobile.core.util.moshi.Stringable;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0018R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0018R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0018R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0018R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0018R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0018R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0018R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0018R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0018R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0018R\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0018R\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0018R\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0018R \u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0018R\"\u0010K\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020J\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0018R\u001c\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0018R \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0018R\"\u0010Q\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020P\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0018R\u001c\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0018R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0018R\"\u0010W\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020V\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0018R\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "booleanAtStringableAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "hybrisPriceAdapter", "nullableHybrisPriceAdapter", "", "Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "listOfEntryJsonAtSkipBadElementsAdapter", "", "intAdapter", "Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "nullableHybrisDeliveryModeAdapter", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "nullableHybrisCustomerAddressAdapter", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "nullablePaymentDetailsAdapter", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionResult;", "listOfHybrisPromotionResultAdapter", "", "doubleAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "hybrisSavingsAdapter", "booleanAdapter", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisVoucher;", "listOfHybrisVoucherAdapter", "Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;", "nullableHybrisPrincipalAdapter", "Lcom/meijer/mobile/cart/model/hybris/PickupOrderGroup;", "listOfPickupOrderGroupAdapter", "Lcom/meijer/mobile/cart/model/hybris/DeliveryOrderGroup;", "listOfDeliveryOrderGroupAdapter", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPrice;", "listOfHybrisOrderPriceAdapter", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "nullableHybrisPointOfServiceAdapter", "Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "nullableHybrisSubstitutePreferenceAdapter", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;", "hybrisPickupSlotInfoAdapter", "Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "nullableCustomerDataResponseAdapter", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisShopperInfo;", "nullableHybrisShopperInfoAdapter", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "nullableHybrisTipAmountAdapter", "nullableIntAdapter", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderEntryJson;", "listOfOrderEntryJsonAtSkipBadElementsAdapter", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse;", "nullableListOfEbtTransactionResponseAdapter", "Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "nullableMultiTenderPaymentInfoResponseAdapter", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTotalTaxValue;", "listOfHybrisTotalTaxValueAdapter", "Lcom/meijer/mobile/cart/model/hybris/HybrisLightningCartReward;", "nullableListOfHybrisLightningCartRewardAdapter", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "nullableHybrisPickupPersonAdapter", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "tipAndRateDetailsResponseAdapter", "Lcom/meijer/mobile/cart/model/hybris/TenderResponse;", "nullableListOfTenderResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.cart.model.hybris.orderdetails.OrderDetailResponseJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<OrderDetailResponse> {
    private final h<Boolean> booleanAdapter;
    private final h<Boolean> booleanAtStringableAdapter;
    private volatile Constructor<OrderDetailResponse> constructorRef;
    private final h<Double> doubleAdapter;
    private final h<HybrisPickupSlotInfo> hybrisPickupSlotInfoAdapter;
    private final h<HybrisPrice> hybrisPriceAdapter;
    private final h<HybrisSavings> hybrisSavingsAdapter;
    private final h<Integer> intAdapter;
    private final h<List<DeliveryOrderGroup>> listOfDeliveryOrderGroupAdapter;
    private final h<List<EntryJson>> listOfEntryJsonAtSkipBadElementsAdapter;
    private final h<List<HybrisOrderPrice>> listOfHybrisOrderPriceAdapter;
    private final h<List<HybrisPromotionResult>> listOfHybrisPromotionResultAdapter;
    private final h<List<HybrisTotalTaxValue>> listOfHybrisTotalTaxValueAdapter;
    private final h<List<HybrisVoucher>> listOfHybrisVoucherAdapter;
    private final h<List<OrderEntryJson>> listOfOrderEntryJsonAtSkipBadElementsAdapter;
    private final h<List<PickupOrderGroup>> listOfPickupOrderGroupAdapter;
    private final h<CustomerDataResponse> nullableCustomerDataResponseAdapter;
    private final h<HybrisCustomerAddress> nullableHybrisCustomerAddressAdapter;
    private final h<HybrisDeliveryMode> nullableHybrisDeliveryModeAdapter;
    private final h<HybrisPickupPerson> nullableHybrisPickupPersonAdapter;
    private final h<HybrisPointOfService> nullableHybrisPointOfServiceAdapter;
    private final h<HybrisPrice> nullableHybrisPriceAdapter;
    private final h<HybrisPrincipal> nullableHybrisPrincipalAdapter;
    private final h<HybrisShopperInfo> nullableHybrisShopperInfoAdapter;
    private final h<HybrisSubstitutePreference> nullableHybrisSubstitutePreferenceAdapter;
    private final h<HybrisTipAmount> nullableHybrisTipAmountAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<List<EbtTransactionResponse>> nullableListOfEbtTransactionResponseAdapter;
    private final h<List<HybrisLightningCartReward>> nullableListOfHybrisLightningCartRewardAdapter;
    private final h<List<TenderResponse>> nullableListOfTenderResponseAdapter;
    private final h<MultiTenderPaymentInfoResponse> nullableMultiTenderPaymentInfoResponseAdapter;
    private final h<PaymentDetails> nullablePaymentDetailsAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;
    private final h<TipAndRateDetailsResponse> tipAndRateDetailsResponseAdapter;

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public OrderDetailResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        int i11;
        int i12;
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        Double dValueOf = Double.valueOf(0.0d);
        reader.b();
        HybrisPrice hybrisPriceFromJson = null;
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        Boolean boolFromJson3 = boolFromJson2;
        Boolean boolFromJson4 = boolFromJson3;
        Boolean boolFromJson5 = boolFromJson4;
        Boolean boolFromJson6 = boolFromJson5;
        Boolean boolFromJson7 = boolFromJson6;
        Boolean boolFromJson8 = boolFromJson7;
        Boolean boolFromJson9 = boolFromJson8;
        Boolean boolFromJson10 = boolFromJson9;
        Boolean boolFromJson11 = boolFromJson10;
        Integer numFromJson = 0;
        Integer numFromJson2 = null;
        Integer numFromJson3 = null;
        Integer numFromJson4 = null;
        Double dFromJson = dValueOf;
        HybrisPrice hybrisPriceFromJson2 = null;
        HybrisPrice hybrisPriceFromJson3 = null;
        HybrisPrice hybrisPriceFromJson4 = null;
        String strFromJson = null;
        HybrisPrice hybrisPriceFromJson5 = null;
        HybrisPrice hybrisPriceFromJson6 = null;
        HybrisPrice hybrisPriceFromJson7 = null;
        HybrisPrice hybrisPriceFromJson8 = null;
        HybrisPrincipal hybrisPrincipalFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        CustomerDataResponse customerDataResponseFromJson = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        List<EbtTransactionResponse> listFromJson = null;
        MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponseFromJson = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        HybrisPrice hybrisPriceFromJson9 = null;
        HybrisPrice hybrisPriceFromJson10 = null;
        HybrisDeliveryMode hybrisDeliveryModeFromJson = null;
        HybrisCustomerAddress hybrisCustomerAddressFromJson = null;
        PaymentDetails paymentDetailsFromJson = null;
        List<HybrisPromotionResult> listFromJson2 = null;
        List<HybrisPromotionResult> listFromJson3 = null;
        HybrisPrice hybrisPriceFromJson11 = null;
        HybrisPrice hybrisPriceFromJson12 = null;
        HybrisPrice hybrisPriceFromJson13 = null;
        String strFromJson9 = null;
        HybrisPointOfService hybrisPointOfServiceFromJson = null;
        HybrisSubstitutePreference hybrisSubstitutePreferenceFromJson = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        HybrisShopperInfo hybrisShopperInfoFromJson = null;
        String strFromJson12 = null;
        HybrisTipAmount hybrisTipAmountFromJson = null;
        String strFromJson13 = null;
        String strFromJson14 = null;
        Integer numFromJson5 = null;
        String strFromJson15 = null;
        String strFromJson16 = null;
        String strFromJson17 = null;
        String strFromJson18 = null;
        HybrisPrice hybrisPriceFromJson14 = null;
        List<HybrisLightningCartReward> listFromJson4 = null;
        HybrisPickupPerson hybrisPickupPersonFromJson = null;
        String strFromJson19 = null;
        String strFromJson20 = null;
        List<TenderResponse> listFromJson5 = null;
        HybrisPrice hybrisPriceFromJson15 = null;
        String strFromJson21 = null;
        HybrisPrice hybrisPriceFromJson16 = null;
        HybrisSavings hybrisSavingsFromJson = null;
        HybrisPrice hybrisPriceFromJson17 = null;
        String strFromJson22 = null;
        String strFromJson23 = null;
        HybrisSavings hybrisSavingsFromJson2 = null;
        HybrisSavings hybrisSavingsFromJson3 = null;
        HybrisSavings hybrisSavingsFromJson4 = null;
        HybrisSavings hybrisSavingsFromJson5 = null;
        String strFromJson24 = null;
        List<HybrisVoucher> listFromJson6 = null;
        List<PickupOrderGroup> listFromJson7 = null;
        List<DeliveryOrderGroup> listFromJson8 = null;
        List<HybrisOrderPrice> listFromJson9 = null;
        String strFromJson25 = null;
        HybrisPrice hybrisPriceFromJson18 = null;
        HybrisPickupSlotInfo hybrisPickupSlotInfoFromJson = null;
        HybrisPickupSlotInfo hybrisPickupSlotInfoFromJson2 = null;
        HybrisPrice hybrisPriceFromJson19 = null;
        String strFromJson26 = null;
        String strFromJson27 = null;
        List<OrderEntryJson> listFromJson10 = null;
        HybrisPrice hybrisPriceFromJson20 = null;
        HybrisPrice hybrisPriceFromJson21 = null;
        HybrisPrice hybrisPriceFromJson22 = null;
        HybrisPrice hybrisPriceFromJson23 = null;
        String strFromJson28 = null;
        String strFromJson29 = null;
        List<HybrisTotalTaxValue> listFromJson11 = null;
        List<EntryJson> listFromJson12 = null;
        TipAndRateDetailsResponse tipAndRateDetailsResponseFromJson = null;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        List<EntryJson> listFromJson13 = null;
        while (reader.hasNext()) {
            List<EntryJson> list = listFromJson13;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    listFromJson13 = list;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("code", "code", reader);
                    }
                    i16 &= -2;
                    listFromJson13 = list;
                case 1:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i16 &= -3;
                    listFromJson13 = list;
                case 2:
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    i16 &= -5;
                    listFromJson13 = list;
                case 3:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i16 &= -9;
                    listFromJson13 = list;
                case 4:
                    boolFromJson = this.booleanAtStringableAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw c.w("net", "net", reader);
                    }
                    i16 &= -17;
                    listFromJson13 = list;
                case 5:
                    hybrisPriceFromJson5 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson5 == null) {
                        throw c.w("itemsTotal", "itemsTotal", reader);
                    }
                    i16 &= -33;
                    listFromJson13 = list;
                case 6:
                    hybrisPriceFromJson6 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson6 == null) {
                        throw c.w("totalCosts", "totalCosts", reader);
                    }
                    i16 &= -65;
                    listFromJson13 = list;
                case 7:
                    hybrisPriceFromJson7 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson7 == null) {
                        throw c.w("totalPriceWithTax", "totalPriceWithTax", reader);
                    }
                    i16 &= -129;
                    listFromJson13 = list;
                case 8:
                    hybrisPriceFromJson8 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson8 == null) {
                        throw c.w("totalPrice", "totalPrice", reader);
                    }
                    i16 &= -257;
                    listFromJson13 = list;
                case 9:
                    hybrisPriceFromJson = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson == null) {
                        throw c.w("totalTax", "totalTax", reader);
                    }
                    i16 &= -513;
                    listFromJson13 = list;
                case 10:
                    hybrisPriceFromJson2 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson2 == null) {
                        throw c.w("subTotal", "subTotal", reader);
                    }
                    i16 &= -1025;
                    listFromJson13 = list;
                case 11:
                    hybrisPriceFromJson3 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson3 == null) {
                        throw c.w("subTotalWithoutQuoteDiscounts", "subTotalWithoutQuoteDiscounts", reader);
                    }
                    i16 &= -2049;
                    listFromJson13 = list;
                case 12:
                    hybrisPriceFromJson9 = this.nullableHybrisPriceAdapter.fromJson(reader);
                    i16 &= -4097;
                    listFromJson13 = list;
                case 13:
                    hybrisPriceFromJson4 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson4 == null) {
                        throw c.w("deliveryCost", "deliveryCost", reader);
                    }
                    i16 &= -8193;
                    listFromJson13 = list;
                case 14:
                    hybrisPriceFromJson10 = this.nullableHybrisPriceAdapter.fromJson(reader);
                    i16 &= -16385;
                    listFromJson13 = list;
                case 15:
                    listFromJson13 = this.listOfEntryJsonAtSkipBadElementsAdapter.fromJson(reader);
                    if (listFromJson13 == null) {
                        throw c.w("entries", "entries", reader);
                    }
                    i16 &= -32769;
                case 16:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w("totalItems", "totalItems", reader);
                    }
                    i10 = -65537;
                    i16 &= i10;
                    listFromJson13 = list;
                case 17:
                    hybrisDeliveryModeFromJson = this.nullableHybrisDeliveryModeAdapter.fromJson(reader);
                    i10 = -131073;
                    i16 &= i10;
                    listFromJson13 = list;
                case 18:
                    hybrisCustomerAddressFromJson = this.nullableHybrisCustomerAddressAdapter.fromJson(reader);
                    i10 = -262145;
                    i16 &= i10;
                    listFromJson13 = list;
                case 19:
                    paymentDetailsFromJson = this.nullablePaymentDetailsAdapter.fromJson(reader);
                    i10 = -524289;
                    i16 &= i10;
                    listFromJson13 = list;
                case 20:
                    listFromJson2 = this.listOfHybrisPromotionResultAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw c.w("appliedOrderPromotions", "appliedOrderPromotions", reader);
                    }
                    i10 = -1048577;
                    i16 &= i10;
                    listFromJson13 = list;
                case 21:
                    listFromJson3 = this.listOfHybrisPromotionResultAdapter.fromJson(reader);
                    if (listFromJson3 == null) {
                        throw c.w("appliedProductPromotions", "appliedProductPromotions", reader);
                    }
                    i16 &= -2097153;
                    listFromJson13 = list;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    hybrisPriceFromJson11 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson11 == null) {
                        throw c.w("productDiscounts", "productDiscounts", reader);
                    }
                    i16 &= -4194305;
                    listFromJson13 = list;
                case 23:
                    hybrisPriceFromJson12 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson12 == null) {
                        throw c.w("orderDiscounts", "orderDiscounts", reader);
                    }
                    i16 &= -8388609;
                    listFromJson13 = list;
                case 24:
                    hybrisPriceFromJson15 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson15 == null) {
                        throw c.w("quoteDiscounts", "quoteDiscounts", reader);
                    }
                    i16 &= -16777217;
                    listFromJson13 = list;
                case 25:
                    dFromJson = this.doubleAdapter.fromJson(reader);
                    if (dFromJson == null) {
                        throw c.w("quoteDiscountsRate", "quoteDiscountsRate", reader);
                    }
                    i16 &= -33554433;
                    listFromJson13 = list;
                case 26:
                    strFromJson21 = this.stringAdapter.fromJson(reader);
                    if (strFromJson21 == null) {
                        throw c.w("quoteDiscountsType", "quoteDiscountsType", reader);
                    }
                    i16 &= -67108865;
                    listFromJson13 = list;
                case 27:
                    hybrisPriceFromJson16 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson16 == null) {
                        throw c.w("totalDiscounts", "totalDiscounts", reader);
                    }
                    i16 &= -134217729;
                    listFromJson13 = list;
                case 28:
                    hybrisSavingsFromJson = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson == null) {
                        throw c.w("totalSavings", "totalSavings", reader);
                    }
                    i16 &= -268435457;
                    listFromJson13 = list;
                case 29:
                    hybrisPriceFromJson17 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson17 == null) {
                        throw c.w("totalDiscountsWithQuoteDiscounts", "totalDiscountsWithQuoteDiscounts", reader);
                    }
                    i16 &= -536870913;
                    listFromJson13 = list;
                case 30:
                    hybrisPriceFromJson13 = this.nullableHybrisPriceAdapter.fromJson(reader);
                    i16 &= -1073741825;
                    listFromJson13 = list;
                case 31:
                    strFromJson22 = this.stringAdapter.fromJson(reader);
                    if (strFromJson22 == null) {
                        throw c.w("site", "site", reader);
                    }
                    i16 &= a.e.API_PRIORITY_OTHER;
                    listFromJson13 = list;
                case l3.f92486e /* 32 */:
                    strFromJson23 = this.stringAdapter.fromJson(reader);
                    if (strFromJson23 == null) {
                        throw c.w(PlaceTypes.STORE, PlaceTypes.STORE, reader);
                    }
                    i15 &= -2;
                    listFromJson13 = list;
                case 33:
                    hybrisSavingsFromJson2 = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson2 == null) {
                        throw c.w("couponsSavings", "couponsSavings", reader);
                    }
                    i15 &= -3;
                    listFromJson13 = list;
                case 34:
                    hybrisSavingsFromJson3 = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson3 == null) {
                        throw c.w("mperksSavings", "mperksSavings", reader);
                    }
                    i15 &= -5;
                    listFromJson13 = list;
                case 35:
                    hybrisSavingsFromJson4 = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson4 == null) {
                        throw c.w("specialsSavings", "specialsSavings", reader);
                    }
                    i15 &= -9;
                    listFromJson13 = list;
                case 36:
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -17;
                    listFromJson13 = list;
                case 37:
                    hybrisSavingsFromJson5 = this.hybrisSavingsAdapter.fromJson(reader);
                    if (hybrisSavingsFromJson5 == null) {
                        throw c.w("teamMemberSavings", "teamMemberSavings", reader);
                    }
                    i15 &= -33;
                    listFromJson13 = list;
                case 38:
                    strFromJson24 = this.stringAdapter.fromJson(reader);
                    if (strFromJson24 == null) {
                        throw c.w("guid", "guid", reader);
                    }
                    i15 &= -65;
                    listFromJson13 = list;
                case 39:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw c.w("calculated", "calculated", reader);
                    }
                    i15 &= -129;
                    listFromJson13 = list;
                case 40:
                    listFromJson6 = this.listOfHybrisVoucherAdapter.fromJson(reader);
                    if (listFromJson6 == null) {
                        throw c.w("appliedVouchers", "appliedVouchers", reader);
                    }
                    i15 &= -257;
                    listFromJson13 = list;
                case 41:
                    hybrisPrincipalFromJson = this.nullableHybrisPrincipalAdapter.fromJson(reader);
                    i15 &= -513;
                    listFromJson13 = list;
                case 42:
                    listFromJson7 = this.listOfPickupOrderGroupAdapter.fromJson(reader);
                    if (listFromJson7 == null) {
                        throw c.w("pickupOrderGroups", "pickupOrderGroups", reader);
                    }
                    i15 &= -1025;
                    listFromJson13 = list;
                case 43:
                    listFromJson8 = this.listOfDeliveryOrderGroupAdapter.fromJson(reader);
                    if (listFromJson8 == null) {
                        throw c.w("deliveryOrderGroups", "deliveryOrderGroups", reader);
                    }
                    i15 &= -2049;
                    listFromJson13 = list;
                case 44:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw c.w("pickupItemsQuantity", "pickupItemsQuantity", reader);
                    }
                    i15 &= -4097;
                    listFromJson13 = list;
                case 45:
                    numFromJson3 = this.intAdapter.fromJson(reader);
                    if (numFromJson3 == null) {
                        throw c.w("deliveryItemsQuantity", "deliveryItemsQuantity", reader);
                    }
                    i15 &= -8193;
                    listFromJson13 = list;
                case 46:
                    numFromJson4 = this.intAdapter.fromJson(reader);
                    if (numFromJson4 == null) {
                        throw c.w("totalUnitCount", "totalUnitCount", reader);
                    }
                    i15 &= -16385;
                    listFromJson13 = list;
                case 47:
                    listFromJson9 = this.listOfHybrisOrderPriceAdapter.fromJson(reader);
                    if (listFromJson9 == null) {
                        throw c.w("orderPrices", "orderPrices", reader);
                    }
                    i11 = -32769;
                    i15 &= i11;
                    listFromJson13 = list;
                case 48:
                    strFromJson25 = this.stringAdapter.fromJson(reader);
                    if (strFromJson25 == null) {
                        throw c.w("merchantCustomerId", "merchantCustomerId", reader);
                    }
                    i11 = -65537;
                    i15 &= i11;
                    listFromJson13 = list;
                case 49:
                    hybrisPriceFromJson18 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson18 == null) {
                        throw c.w("depositPrice", "depositPrice", reader);
                    }
                    i11 = -131073;
                    i15 &= i11;
                    listFromJson13 = list;
                case 50:
                    hybrisPointOfServiceFromJson = this.nullableHybrisPointOfServiceAdapter.fromJson(reader);
                    i11 = -262145;
                    i15 &= i11;
                    listFromJson13 = list;
                case 51:
                    hybrisSubstitutePreferenceFromJson = this.nullableHybrisSubstitutePreferenceAdapter.fromJson(reader);
                    i11 = -524289;
                    i15 &= i11;
                    listFromJson13 = list;
                case 52:
                    boolFromJson3 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson3 == null) {
                        throw c.w("phoneNumberTextable", "phoneNumberTextable", reader);
                    }
                    i11 = -1048577;
                    i15 &= i11;
                    listFromJson13 = list;
                case 53:
                    hybrisPickupSlotInfoFromJson = this.hybrisPickupSlotInfoAdapter.fromJson(reader);
                    if (hybrisPickupSlotInfoFromJson == null) {
                        throw c.w("pickUpSlotInfo", "pickUpSlotInfo", reader);
                    }
                    i15 &= -2097153;
                    listFromJson13 = list;
                case 54:
                    hybrisPickupSlotInfoFromJson2 = this.hybrisPickupSlotInfoAdapter.fromJson(reader);
                    if (hybrisPickupSlotInfoFromJson2 == null) {
                        throw c.w("originalPickUpSlotInfo", "originalPickUpSlotInfo", reader);
                    }
                    i15 &= -4194305;
                    listFromJson13 = list;
                case 55:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -8388609;
                    listFromJson13 = list;
                case 56:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -16777217;
                    listFromJson13 = list;
                case 57:
                    customerDataResponseFromJson = this.nullableCustomerDataResponseAdapter.fromJson(reader);
                    i15 &= -33554433;
                    listFromJson13 = list;
                case 58:
                    boolFromJson4 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson4 == null) {
                        throw c.w("editable", "editable", reader);
                    }
                    i15 &= -67108865;
                    listFromJson13 = list;
                case 59:
                    strFromJson10 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -134217729;
                    listFromJson13 = list;
                case 60:
                    strFromJson11 = this.nullableStringAdapter.fromJson(reader);
                    i15 &= -268435457;
                    listFromJson13 = list;
                case 61:
                    boolFromJson5 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson5 == null) {
                        throw c.w("tippablePartner", "tippablePartner", reader);
                    }
                    i15 &= -536870913;
                    listFromJson13 = list;
                case 62:
                    boolFromJson6 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson6 == null) {
                        throw c.w("tippedAndRated", "tippedAndRated", reader);
                    }
                    i15 &= -1073741825;
                    listFromJson13 = list;
                case 63:
                    hybrisShopperInfoFromJson = this.nullableHybrisShopperInfoAdapter.fromJson(reader);
                    i15 &= a.e.API_PRIORITY_OTHER;
                    listFromJson13 = list;
                case 64:
                    hybrisPriceFromJson19 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson19 == null) {
                        throw c.w("convenienceFee", "convenienceFee", reader);
                    }
                    i14 &= -2;
                    listFromJson13 = list;
                case 65:
                    strFromJson12 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -3;
                    listFromJson13 = list;
                case 66:
                    boolFromJson7 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson7 == null) {
                        throw c.w("earlyDelivery", "earlyDelivery", reader);
                    }
                    i14 &= -5;
                    listFromJson13 = list;
                case 67:
                    hybrisTipAmountFromJson = this.nullableHybrisTipAmountAdapter.fromJson(reader);
                    i14 &= -9;
                    listFromJson13 = list;
                case 68:
                    strFromJson13 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -17;
                    listFromJson13 = list;
                case 69:
                    strFromJson14 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -33;
                    listFromJson13 = list;
                case 70:
                    numFromJson5 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -65;
                    listFromJson13 = list;
                case 71:
                    boolFromJson8 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson8 == null) {
                        throw c.w("isMfc", "isMfc", reader);
                    }
                    i14 &= -129;
                    listFromJson13 = list;
                case 72:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -257;
                    listFromJson13 = list;
                case 73:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -513;
                    listFromJson13 = list;
                case 74:
                    strFromJson26 = this.stringAdapter.fromJson(reader);
                    if (strFromJson26 == null) {
                        throw c.w("orderStatus", "status", reader);
                    }
                    i14 &= -1025;
                    listFromJson13 = list;
                case 75:
                    strFromJson27 = this.stringAdapter.fromJson(reader);
                    if (strFromJson27 == null) {
                        throw c.w("statusDisplay", "statusDisplay", reader);
                    }
                    i14 &= -2049;
                    listFromJson13 = list;
                case 76:
                    boolFromJson9 = this.booleanAtStringableAdapter.fromJson(reader);
                    if (boolFromJson9 == null) {
                        throw c.w("guestCustomer", "guestCustomer", reader);
                    }
                    i14 &= -4097;
                    listFromJson13 = list;
                case 77:
                    strFromJson15 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -8193;
                    listFromJson13 = list;
                case 78:
                    strFromJson16 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -16385;
                    listFromJson13 = list;
                case 79:
                    listFromJson10 = this.listOfOrderEntryJsonAtSkipBadElementsAdapter.fromJson(reader);
                    if (listFromJson10 == null) {
                        throw c.w("unconsignedEntries", "unconsignedEntries", reader);
                    }
                    i12 = -32769;
                    i14 &= i12;
                    listFromJson13 = list;
                case BinsView.LABEL_WIDTH_DP /* 80 */:
                    strFromJson17 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -65537;
                    i14 &= i12;
                    listFromJson13 = list;
                case 81:
                    strFromJson18 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -131073;
                    i14 &= i12;
                    listFromJson13 = list;
                case 82:
                    hybrisPriceFromJson20 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson20 == null) {
                        throw c.w("ebtEligibleTotal", "ebtEligibleTotal", reader);
                    }
                    i12 = -262145;
                    i14 &= i12;
                    listFromJson13 = list;
                case 83:
                    hybrisPriceFromJson21 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson21 == null) {
                        throw c.w("ebtNonEligibleTotal", "ebtNonEligibleTotal", reader);
                    }
                    i12 = -524289;
                    i14 &= i12;
                    listFromJson13 = list;
                case 84:
                    hybrisPriceFromJson22 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson22 == null) {
                        throw c.w("ebtCapturedBalance", "ebtCapturedBalance", reader);
                    }
                    i12 = -1048577;
                    i14 &= i12;
                    listFromJson13 = list;
                case 85:
                    hybrisPriceFromJson14 = this.nullableHybrisPriceAdapter.fromJson(reader);
                    i14 &= -2097153;
                    listFromJson13 = list;
                case 86:
                    hybrisPriceFromJson23 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson23 == null) {
                        throw c.w("ebtSurchargePrice", "ebtSurchargePrice", reader);
                    }
                    i14 &= -4194305;
                    listFromJson13 = list;
                case 87:
                    listFromJson = this.nullableListOfEbtTransactionResponseAdapter.fromJson(reader);
                    i14 &= -8388609;
                    listFromJson13 = list;
                case 88:
                    multiTenderPaymentInfoResponseFromJson = this.nullableMultiTenderPaymentInfoResponseAdapter.fromJson(reader);
                    i14 &= -16777217;
                    listFromJson13 = list;
                case 89:
                    boolFromJson10 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson10 == null) {
                        throw c.w("cancellable", "cancellable", reader);
                    }
                    i14 &= -33554433;
                    listFromJson13 = list;
                case 90:
                    boolFromJson11 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson11 == null) {
                        throw c.w("returnable", "returnable", reader);
                    }
                    i14 &= -67108865;
                    listFromJson13 = list;
                case 91:
                    strFromJson28 = this.stringAdapter.fromJson(reader);
                    if (strFromJson28 == null) {
                        throw c.w("timeZone", "timeZone", reader);
                    }
                    i14 &= -134217729;
                    listFromJson13 = list;
                case 92:
                    strFromJson29 = this.stringAdapter.fromJson(reader);
                    if (strFromJson29 == null) {
                        throw c.w("rtsCartId", "rtsCartId", reader);
                    }
                    i14 &= -268435457;
                    listFromJson13 = list;
                case 93:
                    listFromJson11 = this.listOfHybrisTotalTaxValueAdapter.fromJson(reader);
                    if (listFromJson11 == null) {
                        throw c.w("totalTaxValues", "totalTaxValues", reader);
                    }
                    i14 &= -536870913;
                    listFromJson13 = list;
                case 94:
                    listFromJson4 = this.nullableListOfHybrisLightningCartRewardAdapter.fromJson(reader);
                    i14 &= -1073741825;
                    listFromJson13 = list;
                case 95:
                    hybrisPickupPersonFromJson = this.nullableHybrisPickupPersonAdapter.fromJson(reader);
                    i14 &= a.e.API_PRIORITY_OTHER;
                    listFromJson13 = list;
                case 96:
                    strFromJson19 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -2;
                    listFromJson13 = list;
                case 97:
                    listFromJson12 = this.listOfEntryJsonAtSkipBadElementsAdapter.fromJson(reader);
                    if (listFromJson12 == null) {
                        throw c.w("unfulfilledEntries", "unfulfilledEntries", reader);
                    }
                    i13 &= -3;
                    listFromJson13 = list;
                case 98:
                    strFromJson20 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -5;
                    listFromJson13 = list;
                case 99:
                    tipAndRateDetailsResponseFromJson = this.tipAndRateDetailsResponseAdapter.fromJson(reader);
                    if (tipAndRateDetailsResponseFromJson == null) {
                        throw c.w("tipAndRateDetailsResponse", "tipAndRateDetails", reader);
                    }
                    i13 &= -9;
                    listFromJson13 = list;
                case HttpResponseStatus.INFORMATIONAL_CONTINUE /* 100 */:
                    listFromJson5 = this.nullableListOfTenderResponseAdapter.fromJson(reader);
                    i13 &= -17;
                    listFromJson13 = list;
                default:
                    listFromJson13 = list;
            }
        }
        List<EntryJson> list2 = listFromJson13;
        reader.d();
        if (i16 != 0 || i15 != 0 || i14 != 0 || i13 != -32) {
            HybrisPrice hybrisPrice = hybrisPriceFromJson2;
            HybrisPrice hybrisPrice2 = hybrisPriceFromJson3;
            HybrisPrice hybrisPrice3 = hybrisPriceFromJson4;
            HybrisPrice hybrisPrice4 = hybrisPriceFromJson;
            String str = strFromJson;
            HybrisPrice hybrisPrice5 = hybrisPriceFromJson5;
            HybrisPrice hybrisPrice6 = hybrisPriceFromJson6;
            HybrisPrice hybrisPrice7 = hybrisPriceFromJson15;
            String str2 = strFromJson21;
            HybrisPrice hybrisPrice8 = hybrisPriceFromJson16;
            HybrisSavings hybrisSavings = hybrisSavingsFromJson;
            HybrisPrice hybrisPrice9 = hybrisPriceFromJson17;
            String str3 = strFromJson22;
            String str4 = strFromJson23;
            HybrisSavings hybrisSavings2 = hybrisSavingsFromJson2;
            HybrisSavings hybrisSavings3 = hybrisSavingsFromJson3;
            HybrisSavings hybrisSavings4 = hybrisSavingsFromJson4;
            HybrisSavings hybrisSavings5 = hybrisSavingsFromJson5;
            String str5 = strFromJson24;
            List<HybrisVoucher> list3 = listFromJson6;
            List<PickupOrderGroup> list4 = listFromJson7;
            List<DeliveryOrderGroup> list5 = listFromJson8;
            List<HybrisOrderPrice> list6 = listFromJson9;
            String str6 = strFromJson25;
            HybrisPrice hybrisPrice10 = hybrisPriceFromJson18;
            HybrisPickupSlotInfo hybrisPickupSlotInfo = hybrisPickupSlotInfoFromJson;
            HybrisPickupSlotInfo hybrisPickupSlotInfo2 = hybrisPickupSlotInfoFromJson2;
            HybrisPrice hybrisPrice11 = hybrisPriceFromJson19;
            String str7 = strFromJson26;
            String str8 = strFromJson27;
            List<OrderEntryJson> list7 = listFromJson10;
            HybrisPrice hybrisPrice12 = hybrisPriceFromJson20;
            HybrisPrice hybrisPrice13 = hybrisPriceFromJson21;
            HybrisPrice hybrisPrice14 = hybrisPriceFromJson22;
            HybrisPrice hybrisPrice15 = hybrisPriceFromJson23;
            String str9 = strFromJson28;
            String str10 = strFromJson29;
            List<HybrisTotalTaxValue> list8 = listFromJson11;
            List<EntryJson> list9 = listFromJson12;
            TipAndRateDetailsResponse tipAndRateDetailsResponse = tipAndRateDetailsResponseFromJson;
            Constructor<OrderDetailResponse> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                Class<?> cls = c.f134099c;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Integer.TYPE;
                declaredConstructor = OrderDetailResponse.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls2, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, List.class, cls3, HybrisDeliveryMode.class, HybrisCustomerAddress.class, PaymentDetails.class, List.class, List.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, Double.TYPE, String.class, HybrisPrice.class, HybrisSavings.class, HybrisPrice.class, HybrisPrice.class, String.class, String.class, HybrisSavings.class, HybrisSavings.class, HybrisSavings.class, String.class, HybrisSavings.class, String.class, cls2, List.class, HybrisPrincipal.class, List.class, List.class, cls3, cls3, cls3, List.class, String.class, HybrisPrice.class, HybrisPointOfService.class, HybrisSubstitutePreference.class, cls2, HybrisPickupSlotInfo.class, HybrisPickupSlotInfo.class, String.class, String.class, CustomerDataResponse.class, cls2, String.class, String.class, cls2, cls2, HybrisShopperInfo.class, HybrisPrice.class, String.class, cls2, HybrisTipAmount.class, String.class, String.class, Integer.class, cls2, String.class, String.class, String.class, String.class, cls2, String.class, String.class, List.class, String.class, String.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, List.class, MultiTenderPaymentInfoResponse.class, cls2, cls2, String.class, String.class, List.class, List.class, HybrisPickupPerson.class, String.class, List.class, String.class, TipAndRateDetailsResponse.class, List.class, cls3, cls3, cls3, cls3, cls);
                this.constructorRef = declaredConstructor;
                Intrinsics.i(declaredConstructor, "also(...)");
            }
            OrderDetailResponse orderDetailResponseNewInstance = declaredConstructor.newInstance(str, strFromJson6, strFromJson7, strFromJson8, boolFromJson, hybrisPrice5, hybrisPrice6, hybrisPriceFromJson7, hybrisPriceFromJson8, hybrisPrice4, hybrisPrice, hybrisPrice2, hybrisPriceFromJson9, hybrisPrice3, hybrisPriceFromJson10, list2, numFromJson, hybrisDeliveryModeFromJson, hybrisCustomerAddressFromJson, paymentDetailsFromJson, listFromJson2, listFromJson3, hybrisPriceFromJson11, hybrisPriceFromJson12, hybrisPrice7, dFromJson, str2, hybrisPrice8, hybrisSavings, hybrisPrice9, hybrisPriceFromJson13, str3, str4, hybrisSavings2, hybrisSavings3, hybrisSavings4, strFromJson9, hybrisSavings5, str5, boolFromJson2, list3, hybrisPrincipalFromJson, list4, list5, numFromJson2, numFromJson3, numFromJson4, list6, str6, hybrisPrice10, hybrisPointOfServiceFromJson, hybrisSubstitutePreferenceFromJson, boolFromJson3, hybrisPickupSlotInfo, hybrisPickupSlotInfo2, strFromJson2, strFromJson3, customerDataResponseFromJson, boolFromJson4, strFromJson10, strFromJson11, boolFromJson5, boolFromJson6, hybrisShopperInfoFromJson, hybrisPrice11, strFromJson12, boolFromJson7, hybrisTipAmountFromJson, strFromJson13, strFromJson14, numFromJson5, boolFromJson8, strFromJson4, strFromJson5, str7, str8, boolFromJson9, strFromJson15, strFromJson16, list7, strFromJson17, strFromJson18, hybrisPrice12, hybrisPrice13, hybrisPrice14, hybrisPriceFromJson14, hybrisPrice15, listFromJson, multiTenderPaymentInfoResponseFromJson, boolFromJson10, boolFromJson11, str9, str10, list8, listFromJson4, hybrisPickupPersonFromJson, strFromJson19, list9, strFromJson20, tipAndRateDetailsResponse, listFromJson5, Integer.valueOf(i16), Integer.valueOf(i15), Integer.valueOf(i14), Integer.valueOf(i13), null);
            Intrinsics.i(orderDetailResponseNewInstance, "newInstance(...)");
            return orderDetailResponseNewInstance;
        }
        Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
        boolean zBooleanValue = boolFromJson.booleanValue();
        Intrinsics.h(hybrisPriceFromJson5, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson6, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson7, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson8, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson2, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson3, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson4, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(list2, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.EntryJson>");
        int iIntValue = numFromJson.intValue();
        Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult>");
        Intrinsics.h(listFromJson3, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult>");
        Intrinsics.h(hybrisPriceFromJson11, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        HybrisPrice hybrisPrice16 = hybrisPriceFromJson2;
        Intrinsics.h(hybrisPriceFromJson12, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        HybrisPrice hybrisPrice17 = hybrisPriceFromJson15;
        Intrinsics.h(hybrisPrice17, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        double dDoubleValue = dFromJson.doubleValue();
        String str11 = strFromJson21;
        Intrinsics.h(str11, "null cannot be cast to non-null type kotlin.String");
        HybrisPrice hybrisPrice18 = hybrisPriceFromJson16;
        Intrinsics.h(hybrisPrice18, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        HybrisPrice hybrisPrice19 = hybrisPriceFromJson3;
        HybrisSavings hybrisSavings6 = hybrisSavingsFromJson;
        Intrinsics.h(hybrisSavings6, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
        HybrisPrice hybrisPrice20 = hybrisPriceFromJson17;
        Intrinsics.h(hybrisPrice20, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        String str12 = strFromJson22;
        Intrinsics.h(str12, "null cannot be cast to non-null type kotlin.String");
        String str13 = strFromJson23;
        Intrinsics.h(str13, "null cannot be cast to non-null type kotlin.String");
        HybrisSavings hybrisSavings7 = hybrisSavingsFromJson2;
        Intrinsics.h(hybrisSavings7, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
        HybrisSavings hybrisSavings8 = hybrisSavingsFromJson3;
        Intrinsics.h(hybrisSavings8, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
        HybrisSavings hybrisSavings9 = hybrisSavingsFromJson4;
        Intrinsics.h(hybrisSavings9, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
        HybrisSavings hybrisSavings10 = hybrisSavingsFromJson5;
        Intrinsics.h(hybrisSavings10, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings");
        String str14 = strFromJson24;
        Intrinsics.h(str14, "null cannot be cast to non-null type kotlin.String");
        boolean zBooleanValue2 = boolFromJson2.booleanValue();
        List<HybrisVoucher> list10 = listFromJson6;
        Intrinsics.h(list10, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orders.HybrisVoucher>");
        List<PickupOrderGroup> list11 = listFromJson7;
        Intrinsics.h(list11, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.PickupOrderGroup>");
        List<DeliveryOrderGroup> list12 = listFromJson8;
        Intrinsics.h(list12, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.DeliveryOrderGroup>");
        int iIntValue2 = numFromJson2.intValue();
        int iIntValue3 = numFromJson3.intValue();
        int iIntValue4 = numFromJson4.intValue();
        List<HybrisOrderPrice> list13 = listFromJson9;
        Intrinsics.h(list13, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orders.HybrisOrderPrice>");
        String str15 = strFromJson25;
        Intrinsics.h(str15, "null cannot be cast to non-null type kotlin.String");
        HybrisPrice hybrisPrice21 = hybrisPriceFromJson18;
        Intrinsics.h(hybrisPrice21, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        boolean zBooleanValue3 = boolFromJson3.booleanValue();
        HybrisPickupSlotInfo hybrisPickupSlotInfo3 = hybrisPickupSlotInfoFromJson;
        Intrinsics.h(hybrisPickupSlotInfo3, "null cannot be cast to non-null type com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupSlotInfo");
        HybrisPickupSlotInfo hybrisPickupSlotInfo4 = hybrisPickupSlotInfoFromJson2;
        Intrinsics.h(hybrisPickupSlotInfo4, "null cannot be cast to non-null type com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupSlotInfo");
        boolean zBooleanValue4 = boolFromJson4.booleanValue();
        boolean zBooleanValue5 = boolFromJson5.booleanValue();
        boolean zBooleanValue6 = boolFromJson6.booleanValue();
        HybrisPrice hybrisPrice22 = hybrisPriceFromJson19;
        Intrinsics.h(hybrisPrice22, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        boolean zBooleanValue7 = boolFromJson7.booleanValue();
        boolean zBooleanValue8 = boolFromJson8.booleanValue();
        String str16 = strFromJson26;
        Intrinsics.h(str16, "null cannot be cast to non-null type kotlin.String");
        String str17 = strFromJson27;
        Intrinsics.h(str17, "null cannot be cast to non-null type kotlin.String");
        boolean zBooleanValue9 = boolFromJson9.booleanValue();
        List<OrderEntryJson> list14 = listFromJson10;
        Intrinsics.h(list14, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orderdetails.OrderEntryJson>");
        HybrisPrice hybrisPrice23 = hybrisPriceFromJson20;
        Intrinsics.h(hybrisPrice23, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        HybrisPrice hybrisPrice24 = hybrisPriceFromJson21;
        Intrinsics.h(hybrisPrice24, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        HybrisPrice hybrisPrice25 = hybrisPriceFromJson22;
        Intrinsics.h(hybrisPrice25, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        HybrisPrice hybrisPrice26 = hybrisPriceFromJson23;
        Intrinsics.h(hybrisPrice26, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        boolean zBooleanValue10 = boolFromJson10.booleanValue();
        boolean zBooleanValue11 = boolFromJson11.booleanValue();
        String str18 = strFromJson28;
        Intrinsics.h(str18, "null cannot be cast to non-null type kotlin.String");
        String str19 = strFromJson29;
        Intrinsics.h(str19, "null cannot be cast to non-null type kotlin.String");
        List<HybrisTotalTaxValue> list15 = listFromJson11;
        Intrinsics.h(list15, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orderdetails.HybrisTotalTaxValue>");
        List<EntryJson> list16 = listFromJson12;
        Intrinsics.h(list16, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.EntryJson>");
        TipAndRateDetailsResponse tipAndRateDetailsResponse2 = tipAndRateDetailsResponseFromJson;
        Intrinsics.h(tipAndRateDetailsResponse2, "null cannot be cast to non-null type com.meijer.mobile.cart.model.hybris.orderdetails.TipAndRateDetailsResponse");
        return new OrderDetailResponse(strFromJson, strFromJson6, strFromJson7, strFromJson8, zBooleanValue, hybrisPriceFromJson5, hybrisPriceFromJson6, hybrisPriceFromJson7, hybrisPriceFromJson8, hybrisPriceFromJson, hybrisPrice16, hybrisPrice19, hybrisPriceFromJson9, hybrisPriceFromJson4, hybrisPriceFromJson10, list2, iIntValue, hybrisDeliveryModeFromJson, hybrisCustomerAddressFromJson, paymentDetailsFromJson, listFromJson2, listFromJson3, hybrisPriceFromJson11, hybrisPriceFromJson12, hybrisPrice17, dDoubleValue, str11, hybrisPrice18, hybrisSavings6, hybrisPrice20, hybrisPriceFromJson13, str12, str13, hybrisSavings7, hybrisSavings8, hybrisSavings9, strFromJson9, hybrisSavings10, str14, zBooleanValue2, list10, hybrisPrincipalFromJson, list11, list12, iIntValue2, iIntValue3, iIntValue4, list13, str15, hybrisPrice21, hybrisPointOfServiceFromJson, hybrisSubstitutePreferenceFromJson, zBooleanValue3, hybrisPickupSlotInfo3, hybrisPickupSlotInfo4, strFromJson2, strFromJson3, customerDataResponseFromJson, zBooleanValue4, strFromJson10, strFromJson11, zBooleanValue5, zBooleanValue6, hybrisShopperInfoFromJson, hybrisPrice22, strFromJson12, zBooleanValue7, hybrisTipAmountFromJson, strFromJson13, strFromJson14, numFromJson5, zBooleanValue8, strFromJson4, strFromJson5, str16, str17, zBooleanValue9, strFromJson15, strFromJson16, list14, strFromJson17, strFromJson18, hybrisPrice23, hybrisPrice24, hybrisPrice25, hybrisPriceFromJson14, hybrisPrice26, listFromJson, multiTenderPaymentInfoResponseFromJson, zBooleanValue10, zBooleanValue11, str18, str19, list15, listFromJson4, hybrisPickupPersonFromJson, strFromJson19, list16, strFromJson20, tipAndRateDetailsResponse2, listFromJson5);
    }

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("code", "name", "description", "expirationTime", "net", "itemsTotal", "totalCosts", "totalPriceWithTax", "totalPrice", "totalTax", "subTotal", "subTotalWithoutQuoteDiscounts", "creditTransactionAmount", "deliveryCost", "extendedDeliveryCost", "entries", "totalItems", "deliveryMode", "deliveryAddress", "paymentInfo", "appliedOrderPromotions", "appliedProductPromotions", "productDiscounts", "orderDiscounts", "quoteDiscounts", "quoteDiscountsRate", "quoteDiscountsType", "totalDiscounts", "totalSavings", "totalDiscountsWithQuoteDiscounts", "subTotalWithDiscounts", "site", PlaceTypes.STORE, "couponsSavings", "mperksSavings", "specialsSavings", "statusUpdateTimestamp", "teamMemberSavings", "guid", "calculated", "appliedVouchers", "user", "pickupOrderGroups", "deliveryOrderGroups", "pickupItemsQuantity", "deliveryItemsQuantity", "totalUnitCount", "orderPrices", "merchantCustomerId", "depositPrice", "pointOfService", "substitutePreference", "phoneNumberTextable", "pickUpSlotInfo", "originalPickUpSlotInfo", "vehicleDescription", "validAgeAcknowledgementTime", "customerData", "editable", "originalOrderId", "orderNotes", "tippablePartner", "tippedAndRated", "shopperInfo", "convenienceFee", "deliveryNote", "earlyDelivery", "tipAmount", "tipCode", "tipDate", "rating", "isMfc", "created", "captureAuthCode", "status", "statusDisplay", "guestCustomer", "deliveryStatus", "deliveryStatusDisplay", "unconsignedEntries", "fulfillmentEligibility", "partnerEligibility", "ebtEligibleTotal", "ebtNonEligibleTotal", "ebtCapturedBalance", "rtsCapturedBalance", "ebtSurchargePrice", "ebtEditOrderDetailInfo", "multiTenderPaymentInfo", "cancellable", "returnable", "timeZone", "rtsCartId", "totalTaxValues", "lightningCartReward", "pickUpPerson", "tipAuthCode", "unfulfilledEntries", "statusUpdateReason", "tipAndRateDetails", "tenders");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "code");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "name");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
        Set<? extends Annotation> setD = SetsKt.d(new Stringable() { // from class: com.meijer.mobile.cart.model.hybris.orderdetails.OrderDetailResponseJsonAdapter.b
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return Stringable.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof Stringable;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.meijer.mobile.core.util.moshi.Stringable()";
            }
        });
        Class cls = Boolean.TYPE;
        h<Boolean> hVarF3 = moshi.f(cls, setD, "net");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.booleanAtStringableAdapter = hVarF3;
        h<HybrisPrice> hVarF4 = moshi.f(HybrisPrice.class, SetsKt.e(), "itemsTotal");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.hybrisPriceAdapter = hVarF4;
        h<HybrisPrice> hVarF5 = moshi.f(HybrisPrice.class, SetsKt.e(), "creditTransactionAmount");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableHybrisPriceAdapter = hVarF5;
        h<List<EntryJson>> hVarF6 = moshi.f(x.j(List.class, EntryJson.class), SetsKt.d(new SkipBadElements() { // from class: com.meijer.mobile.cart.model.hybris.orderdetails.OrderDetailResponseJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return SkipBadElements.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof SkipBadElements;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.meijer.mobile.core.util.moshi.SkipBadElements()";
            }
        }), "entries");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.listOfEntryJsonAtSkipBadElementsAdapter = hVarF6;
        h<Integer> hVarF7 = moshi.f(Integer.TYPE, SetsKt.e(), "totalItems");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.intAdapter = hVarF7;
        h<HybrisDeliveryMode> hVarF8 = moshi.f(HybrisDeliveryMode.class, SetsKt.e(), "deliveryMode");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.nullableHybrisDeliveryModeAdapter = hVarF8;
        h<HybrisCustomerAddress> hVarF9 = moshi.f(HybrisCustomerAddress.class, SetsKt.e(), "deliveryAddress");
        Intrinsics.i(hVarF9, "adapter(...)");
        this.nullableHybrisCustomerAddressAdapter = hVarF9;
        h<PaymentDetails> hVarF10 = moshi.f(PaymentDetails.class, SetsKt.e(), "paymentInfo");
        Intrinsics.i(hVarF10, "adapter(...)");
        this.nullablePaymentDetailsAdapter = hVarF10;
        h<List<HybrisPromotionResult>> hVarF11 = moshi.f(x.j(List.class, HybrisPromotionResult.class), SetsKt.e(), "appliedOrderPromotions");
        Intrinsics.i(hVarF11, "adapter(...)");
        this.listOfHybrisPromotionResultAdapter = hVarF11;
        h<Double> hVarF12 = moshi.f(Double.TYPE, SetsKt.e(), "quoteDiscountsRate");
        Intrinsics.i(hVarF12, "adapter(...)");
        this.doubleAdapter = hVarF12;
        h<HybrisSavings> hVarF13 = moshi.f(HybrisSavings.class, SetsKt.e(), "totalSavings");
        Intrinsics.i(hVarF13, "adapter(...)");
        this.hybrisSavingsAdapter = hVarF13;
        h<Boolean> hVarF14 = moshi.f(cls, SetsKt.e(), "calculated");
        Intrinsics.i(hVarF14, "adapter(...)");
        this.booleanAdapter = hVarF14;
        h<List<HybrisVoucher>> hVarF15 = moshi.f(x.j(List.class, HybrisVoucher.class), SetsKt.e(), "appliedVouchers");
        Intrinsics.i(hVarF15, "adapter(...)");
        this.listOfHybrisVoucherAdapter = hVarF15;
        h<HybrisPrincipal> hVarF16 = moshi.f(HybrisPrincipal.class, SetsKt.e(), "user");
        Intrinsics.i(hVarF16, "adapter(...)");
        this.nullableHybrisPrincipalAdapter = hVarF16;
        h<List<PickupOrderGroup>> hVarF17 = moshi.f(x.j(List.class, PickupOrderGroup.class), SetsKt.e(), "pickupOrderGroups");
        Intrinsics.i(hVarF17, "adapter(...)");
        this.listOfPickupOrderGroupAdapter = hVarF17;
        h<List<DeliveryOrderGroup>> hVarF18 = moshi.f(x.j(List.class, DeliveryOrderGroup.class), SetsKt.e(), "deliveryOrderGroups");
        Intrinsics.i(hVarF18, "adapter(...)");
        this.listOfDeliveryOrderGroupAdapter = hVarF18;
        h<List<HybrisOrderPrice>> hVarF19 = moshi.f(x.j(List.class, HybrisOrderPrice.class), SetsKt.e(), "orderPrices");
        Intrinsics.i(hVarF19, "adapter(...)");
        this.listOfHybrisOrderPriceAdapter = hVarF19;
        h<HybrisPointOfService> hVarF20 = moshi.f(HybrisPointOfService.class, SetsKt.e(), "pointOfService");
        Intrinsics.i(hVarF20, "adapter(...)");
        this.nullableHybrisPointOfServiceAdapter = hVarF20;
        h<HybrisSubstitutePreference> hVarF21 = moshi.f(HybrisSubstitutePreference.class, SetsKt.e(), "substitutePreference");
        Intrinsics.i(hVarF21, "adapter(...)");
        this.nullableHybrisSubstitutePreferenceAdapter = hVarF21;
        h<HybrisPickupSlotInfo> hVarF22 = moshi.f(HybrisPickupSlotInfo.class, SetsKt.e(), "pickUpSlotInfo");
        Intrinsics.i(hVarF22, "adapter(...)");
        this.hybrisPickupSlotInfoAdapter = hVarF22;
        h<CustomerDataResponse> hVarF23 = moshi.f(CustomerDataResponse.class, SetsKt.e(), "customerData");
        Intrinsics.i(hVarF23, "adapter(...)");
        this.nullableCustomerDataResponseAdapter = hVarF23;
        h<HybrisShopperInfo> hVarF24 = moshi.f(HybrisShopperInfo.class, SetsKt.e(), "shopperInfo");
        Intrinsics.i(hVarF24, "adapter(...)");
        this.nullableHybrisShopperInfoAdapter = hVarF24;
        h<HybrisTipAmount> hVarF25 = moshi.f(HybrisTipAmount.class, SetsKt.e(), "tipAmount");
        Intrinsics.i(hVarF25, "adapter(...)");
        this.nullableHybrisTipAmountAdapter = hVarF25;
        h<Integer> hVarF26 = moshi.f(Integer.class, SetsKt.e(), "rating");
        Intrinsics.i(hVarF26, "adapter(...)");
        this.nullableIntAdapter = hVarF26;
        h<List<OrderEntryJson>> hVarF27 = moshi.f(x.j(List.class, OrderEntryJson.class), SetsKt.d(new SkipBadElements() { // from class: com.meijer.mobile.cart.model.hybris.orderdetails.OrderDetailResponseJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return SkipBadElements.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof SkipBadElements;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.meijer.mobile.core.util.moshi.SkipBadElements()";
            }
        }), "unconsignedEntries");
        Intrinsics.i(hVarF27, "adapter(...)");
        this.listOfOrderEntryJsonAtSkipBadElementsAdapter = hVarF27;
        h<List<EbtTransactionResponse>> hVarF28 = moshi.f(x.j(List.class, EbtTransactionResponse.class), SetsKt.e(), "ebtEditOrderDetailInfoResponse");
        Intrinsics.i(hVarF28, "adapter(...)");
        this.nullableListOfEbtTransactionResponseAdapter = hVarF28;
        h<MultiTenderPaymentInfoResponse> hVarF29 = moshi.f(MultiTenderPaymentInfoResponse.class, SetsKt.e(), "multiTenderPaymentInfo");
        Intrinsics.i(hVarF29, "adapter(...)");
        this.nullableMultiTenderPaymentInfoResponseAdapter = hVarF29;
        h<List<HybrisTotalTaxValue>> hVarF30 = moshi.f(x.j(List.class, HybrisTotalTaxValue.class), SetsKt.e(), "totalTaxValues");
        Intrinsics.i(hVarF30, "adapter(...)");
        this.listOfHybrisTotalTaxValueAdapter = hVarF30;
        h<List<HybrisLightningCartReward>> hVarF31 = moshi.f(x.j(List.class, HybrisLightningCartReward.class), SetsKt.e(), "lightningCartReward");
        Intrinsics.i(hVarF31, "adapter(...)");
        this.nullableListOfHybrisLightningCartRewardAdapter = hVarF31;
        h<HybrisPickupPerson> hVarF32 = moshi.f(HybrisPickupPerson.class, SetsKt.e(), "pickUpPerson");
        Intrinsics.i(hVarF32, "adapter(...)");
        this.nullableHybrisPickupPersonAdapter = hVarF32;
        h<TipAndRateDetailsResponse> hVarF33 = moshi.f(TipAndRateDetailsResponse.class, SetsKt.e(), "tipAndRateDetailsResponse");
        Intrinsics.i(hVarF33, "adapter(...)");
        this.tipAndRateDetailsResponseAdapter = hVarF33;
        h<List<TenderResponse>> hVarF34 = moshi.f(x.j(List.class, TenderResponse.class), SetsKt.e(), "tenders");
        Intrinsics.i(hVarF34, "adapter(...)");
        this.nullableListOfTenderResponseAdapter = hVarF34;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, OrderDetailResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("code");
        this.stringAdapter.toJson(writer, (q) value_.getCode());
        writer.l("name");
        this.nullableStringAdapter.toJson(writer, (q) value_.getName());
        writer.l("description");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDescription());
        writer.l("expirationTime");
        this.nullableStringAdapter.toJson(writer, (q) value_.getExpirationTime());
        writer.l("net");
        this.booleanAtStringableAdapter.toJson(writer, (q) Boolean.valueOf(value_.getNet()));
        writer.l("itemsTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getItemsTotal());
        writer.l("totalCosts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalCosts());
        writer.l("totalPriceWithTax");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalPriceWithTax());
        writer.l("totalPrice");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalPrice());
        writer.l("totalTax");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalTax());
        writer.l("subTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getSubTotal());
        writer.l("subTotalWithoutQuoteDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getSubTotalWithoutQuoteDiscounts());
        writer.l("creditTransactionAmount");
        this.nullableHybrisPriceAdapter.toJson(writer, (q) value_.getCreditTransactionAmount());
        writer.l("deliveryCost");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getDeliveryCost());
        writer.l("extendedDeliveryCost");
        this.nullableHybrisPriceAdapter.toJson(writer, (q) value_.getExtendedDeliveryCost());
        writer.l("entries");
        this.listOfEntryJsonAtSkipBadElementsAdapter.toJson(writer, (q) value_.D());
        writer.l("totalItems");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTotalItems()));
        writer.l("deliveryMode");
        this.nullableHybrisDeliveryModeAdapter.toJson(writer, (q) value_.getDeliveryMode());
        writer.l("deliveryAddress");
        this.nullableHybrisCustomerAddressAdapter.toJson(writer, (q) value_.getDeliveryAddress());
        writer.l("paymentInfo");
        this.nullablePaymentDetailsAdapter.toJson(writer, (q) value_.getPaymentInfo());
        writer.l("appliedOrderPromotions");
        this.listOfHybrisPromotionResultAdapter.toJson(writer, (q) value_.a());
        writer.l("appliedProductPromotions");
        this.listOfHybrisPromotionResultAdapter.toJson(writer, (q) value_.b());
        writer.l("productDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getProductDiscounts());
        writer.l("orderDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getOrderDiscounts());
        writer.l("quoteDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getQuoteDiscounts());
        writer.l("quoteDiscountsRate");
        this.doubleAdapter.toJson(writer, (q) Double.valueOf(value_.getQuoteDiscountsRate()));
        writer.l("quoteDiscountsType");
        this.stringAdapter.toJson(writer, (q) value_.getQuoteDiscountsType());
        writer.l("totalDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalDiscounts());
        writer.l("totalSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getTotalSavings());
        writer.l("totalDiscountsWithQuoteDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalDiscountsWithQuoteDiscounts());
        writer.l("subTotalWithDiscounts");
        this.nullableHybrisPriceAdapter.toJson(writer, (q) value_.getSubTotalWithDiscounts());
        writer.l("site");
        this.stringAdapter.toJson(writer, (q) value_.getSite());
        writer.l(PlaceTypes.STORE);
        this.stringAdapter.toJson(writer, (q) value_.getStore());
        writer.l("couponsSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getCouponsSavings());
        writer.l("mperksSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getMperksSavings());
        writer.l("specialsSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getSpecialsSavings());
        writer.l("statusUpdateTimestamp");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStatusUpdateTimestamp());
        writer.l("teamMemberSavings");
        this.hybrisSavingsAdapter.toJson(writer, (q) value_.getTeamMemberSavings());
        writer.l("guid");
        this.stringAdapter.toJson(writer, (q) value_.getGuid());
        writer.l("calculated");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getCalculated()));
        writer.l("appliedVouchers");
        this.listOfHybrisVoucherAdapter.toJson(writer, (q) value_.c());
        writer.l("user");
        this.nullableHybrisPrincipalAdapter.toJson(writer, (q) value_.getUser());
        writer.l("pickupOrderGroups");
        this.listOfPickupOrderGroupAdapter.toJson(writer, (q) value_.c0());
        writer.l("deliveryOrderGroups");
        this.listOfDeliveryOrderGroupAdapter.toJson(writer, (q) value_.r());
        writer.l("pickupItemsQuantity");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getPickupItemsQuantity()));
        writer.l("deliveryItemsQuantity");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getDeliveryItemsQuantity()));
        writer.l("totalUnitCount");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTotalUnitCount()));
        writer.l("orderPrices");
        this.listOfHybrisOrderPriceAdapter.toJson(writer, (q) value_.S());
        writer.l("merchantCustomerId");
        this.stringAdapter.toJson(writer, (q) value_.getMerchantCustomerId());
        writer.l("depositPrice");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getDepositPrice());
        writer.l("pointOfService");
        this.nullableHybrisPointOfServiceAdapter.toJson(writer, (q) value_.getPointOfService());
        writer.l("substitutePreference");
        this.nullableHybrisSubstitutePreferenceAdapter.toJson(writer, (q) value_.getSubstitutePreference());
        writer.l("phoneNumberTextable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getPhoneNumberTextable()));
        writer.l("pickUpSlotInfo");
        this.hybrisPickupSlotInfoAdapter.toJson(writer, (q) value_.getPickUpSlotInfo());
        writer.l("originalPickUpSlotInfo");
        this.hybrisPickupSlotInfoAdapter.toJson(writer, (q) value_.getOriginalPickUpSlotInfo());
        writer.l("vehicleDescription");
        this.nullableStringAdapter.toJson(writer, (q) value_.getVehicleDescription());
        writer.l("validAgeAcknowledgementTime");
        this.nullableStringAdapter.toJson(writer, (q) value_.getValidAgeAcknowledgementTime());
        writer.l("customerData");
        this.nullableCustomerDataResponseAdapter.toJson(writer, (q) value_.getCustomerData());
        writer.l("editable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getEditable()));
        writer.l("originalOrderId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOriginalOrderId());
        writer.l("orderNotes");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOrderNotes());
        writer.l("tippablePartner");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getTippablePartner()));
        writer.l("tippedAndRated");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getTippedAndRated()));
        writer.l("shopperInfo");
        this.nullableHybrisShopperInfoAdapter.toJson(writer, (q) value_.getShopperInfo());
        writer.l("convenienceFee");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getConvenienceFee());
        writer.l("deliveryNote");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDeliveryNote());
        writer.l("earlyDelivery");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getEarlyDelivery()));
        writer.l("tipAmount");
        this.nullableHybrisTipAmountAdapter.toJson(writer, (q) value_.getTipAmount());
        writer.l("tipCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTipCode());
        writer.l("tipDate");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTipDate());
        writer.l("rating");
        this.nullableIntAdapter.toJson(writer, (q) value_.getRating());
        writer.l("isMfc");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsMfc()));
        writer.l("created");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCreated());
        writer.l("captureAuthCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCaptureAuthCode());
        writer.l("status");
        this.stringAdapter.toJson(writer, (q) value_.getOrderStatus());
        writer.l("statusDisplay");
        this.stringAdapter.toJson(writer, (q) value_.getStatusDisplay());
        writer.l("guestCustomer");
        this.booleanAtStringableAdapter.toJson(writer, (q) Boolean.valueOf(value_.getGuestCustomer()));
        writer.l("deliveryStatus");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDeliveryStatus());
        writer.l("deliveryStatusDisplay");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDeliveryStatusDisplay());
        writer.l("unconsignedEntries");
        this.listOfOrderEntryJsonAtSkipBadElementsAdapter.toJson(writer, (q) value_.R0());
        writer.l("fulfillmentEligibility");
        this.nullableStringAdapter.toJson(writer, (q) value_.getFulfillmentEligibility());
        writer.l("partnerEligibility");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPartnerEligibility());
        writer.l("ebtEligibleTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getEbtEligibleTotal());
        writer.l("ebtNonEligibleTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getEbtNonEligibleTotal());
        writer.l("ebtCapturedBalance");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getEbtCapturedBalance());
        writer.l("rtsCapturedBalance");
        this.nullableHybrisPriceAdapter.toJson(writer, (q) value_.getRtsCapturedBalance());
        writer.l("ebtSurchargePrice");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getEbtSurchargePrice());
        writer.l("ebtEditOrderDetailInfo");
        this.nullableListOfEbtTransactionResponseAdapter.toJson(writer, (q) value_.y());
        writer.l("multiTenderPaymentInfo");
        this.nullableMultiTenderPaymentInfoResponseAdapter.toJson(writer, (q) value_.getMultiTenderPaymentInfo());
        writer.l("cancellable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getCancellable()));
        writer.l("returnable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getReturnable()));
        writer.l("timeZone");
        this.stringAdapter.toJson(writer, (q) value_.getTimeZone());
        writer.l("rtsCartId");
        this.stringAdapter.toJson(writer, (q) value_.getRtsCartId());
        writer.l("totalTaxValues");
        this.listOfHybrisTotalTaxValueAdapter.toJson(writer, (q) value_.P0());
        writer.l("lightningCartReward");
        this.nullableListOfHybrisLightningCartRewardAdapter.toJson(writer, (q) value_.K());
        writer.l("pickUpPerson");
        this.nullableHybrisPickupPersonAdapter.toJson(writer, (q) value_.getPickUpPerson());
        writer.l("tipAuthCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTipAuthCode());
        writer.l("unfulfilledEntries");
        this.listOfEntryJsonAtSkipBadElementsAdapter.toJson(writer, (q) value_.S0());
        writer.l("statusUpdateReason");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStatusUpdateReason());
        writer.l("tipAndRateDetails");
        this.tipAndRateDetailsResponseAdapter.toJson(writer, (q) value_.getTipAndRateDetailsResponse());
        writer.l("tenders");
        this.nullableListOfTenderResponseAdapter.toJson(writer, (q) value_.y0());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OrderDetailResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
