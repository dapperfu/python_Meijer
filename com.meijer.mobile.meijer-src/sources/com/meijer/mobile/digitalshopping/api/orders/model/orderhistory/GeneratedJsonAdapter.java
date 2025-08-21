package com.meijer.mobile.digitalshopping.api.orders.model.orderhistory;

import com.meijer.mobile.cart.model.hybris.PaymentDetails;
import com.meijer.mobile.cart.model.hybris.orderdetails.HybrisTipAmount;
import com.meijer.mobile.cart.model.hybris.orderdetails.TipAndRateDetailsResponse;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDtoJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "nullableDeliveryModeEnumAdapter", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;", "pickUpSlotInfoDtoAdapter", "nullableStringAdapter", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "nullableHybrisTipAmountAdapter", "", "booleanAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "hybrisPriceAdapter", "", "intAdapter", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "nullableTipAndRateDetailsResponseAdapter", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "paymentDetailsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.OrderHistoryItemDtoJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<OrderHistoryItemDto> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<OrderHistoryItemDto> constructorRef;
    private final h<HybrisPrice> hybrisPriceAdapter;
    private final h<Integer> intAdapter;
    private final h<DeliveryModeEnum> nullableDeliveryModeEnumAdapter;
    private final h<HybrisTipAmount> nullableHybrisTipAmountAdapter;
    private final h<String> nullableStringAdapter;
    private final h<TipAndRateDetailsResponse> nullableTipAndRateDetailsResponseAdapter;
    private final k.b options;
    private final h<PaymentDetails> paymentDetailsAdapter;
    private final h<PickUpSlotInfoDto> pickUpSlotInfoDtoAdapter;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("code", "deliveryMode", "guid", "pickUpSlotInfo", "placed", "status", "statusDisplay", "tipAmount", "tipAuthCode", "tipCode", "tipDate", "tippablePartner", "tippedAndRated", "total", "totalItems", "tipAndRateDetails", "paymentInfo");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "code");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<DeliveryModeEnum> hVarF2 = moshi.f(DeliveryModeEnum.class, SetsKt.e(), "deliveryMode");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableDeliveryModeEnumAdapter = hVarF2;
        h<PickUpSlotInfoDto> hVarF3 = moshi.f(PickUpSlotInfoDto.class, SetsKt.e(), "pickUpSlotInfo");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.pickUpSlotInfoDtoAdapter = hVarF3;
        h<String> hVarF4 = moshi.f(String.class, SetsKt.e(), "placed");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableStringAdapter = hVarF4;
        h<HybrisTipAmount> hVarF5 = moshi.f(HybrisTipAmount.class, SetsKt.e(), "tipAmount");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableHybrisTipAmountAdapter = hVarF5;
        h<Boolean> hVarF6 = moshi.f(Boolean.TYPE, SetsKt.e(), "tippablePartner");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.booleanAdapter = hVarF6;
        h<HybrisPrice> hVarF7 = moshi.f(HybrisPrice.class, SetsKt.e(), "total");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.hybrisPriceAdapter = hVarF7;
        h<Integer> hVarF8 = moshi.f(Integer.TYPE, SetsKt.e(), "totalItems");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.intAdapter = hVarF8;
        h<TipAndRateDetailsResponse> hVarF9 = moshi.f(TipAndRateDetailsResponse.class, SetsKt.e(), "tipAndRateDetails");
        Intrinsics.i(hVarF9, "adapter(...)");
        this.nullableTipAndRateDetailsResponseAdapter = hVarF9;
        h<PaymentDetails> hVarF10 = moshi.f(PaymentDetails.class, SetsKt.e(), "paymentInfo");
        Intrinsics.i(hVarF10, "adapter(...)");
        this.paymentDetailsAdapter = hVarF10;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public OrderHistoryItemDto fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        HybrisPrice hybrisPriceFromJson = null;
        int i11 = -1;
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        Integer numFromJson = 0;
        PaymentDetails paymentDetailsFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        PickUpSlotInfoDto pickUpSlotInfoDtoFromJson = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        DeliveryModeEnum deliveryModeEnumFromJson = null;
        String strFromJson5 = null;
        HybrisTipAmount hybrisTipAmountFromJson = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        TipAndRateDetailsResponse tipAndRateDetailsResponseFromJson = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    continue;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw C14410c.w("code", "code", reader);
                    }
                    i11 &= -2;
                    continue;
                case 1:
                    deliveryModeEnumFromJson = this.nullableDeliveryModeEnumAdapter.fromJson(reader);
                    i11 &= -3;
                    continue;
                case 2:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw C14410c.w("guid", "guid", reader);
                    }
                    i11 &= -5;
                    continue;
                case 3:
                    pickUpSlotInfoDtoFromJson = this.pickUpSlotInfoDtoAdapter.fromJson(reader);
                    if (pickUpSlotInfoDtoFromJson == null) {
                        throw C14410c.w("pickUpSlotInfo", "pickUpSlotInfo", reader);
                    }
                    i11 &= -9;
                    continue;
                case 4:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    continue;
                case 5:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw C14410c.w("status", "status", reader);
                    }
                    i11 &= -33;
                    continue;
                case 6:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw C14410c.w("statusDisplay", "statusDisplay", reader);
                    }
                    i11 &= -65;
                    continue;
                case 7:
                    hybrisTipAmountFromJson = this.nullableHybrisTipAmountAdapter.fromJson(reader);
                    i11 &= -129;
                    continue;
                case 8:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    continue;
                case 9:
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    continue;
                case 10:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    continue;
                case 11:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw C14410c.w("tippablePartner", "tippablePartner", reader);
                    }
                    i11 &= -2049;
                    continue;
                case 12:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw C14410c.w("tippedAndRated", "tippedAndRated", reader);
                    }
                    i11 &= -4097;
                    continue;
                case 13:
                    hybrisPriceFromJson = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson == null) {
                        throw C14410c.w("total", "total", reader);
                    }
                    i11 &= -8193;
                    continue;
                case 14:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw C14410c.w("totalItems", "totalItems", reader);
                    }
                    i11 &= -16385;
                    continue;
                case 15:
                    tipAndRateDetailsResponseFromJson = this.nullableTipAndRateDetailsResponseAdapter.fromJson(reader);
                    i10 = -32769;
                    break;
                case 16:
                    paymentDetailsFromJson = this.paymentDetailsAdapter.fromJson(reader);
                    if (paymentDetailsFromJson == null) {
                        throw C14410c.w("paymentInfo", "paymentInfo", reader);
                    }
                    i10 = -65537;
                    break;
            }
            i11 &= i10;
        }
        reader.d();
        if (i11 == -131072) {
            Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.h(strFromJson2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.h(pickUpSlotInfoDtoFromJson, "null cannot be cast to non-null type com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.PickUpSlotInfoDto");
            Intrinsics.h(strFromJson3, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.h(strFromJson4, "null cannot be cast to non-null type kotlin.String");
            boolean zBooleanValue = boolFromJson.booleanValue();
            boolean zBooleanValue2 = boolFromJson2.booleanValue();
            Intrinsics.h(hybrisPriceFromJson, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
            int iIntValue = numFromJson.intValue();
            Intrinsics.h(paymentDetailsFromJson, "null cannot be cast to non-null type com.meijer.mobile.cart.model.hybris.PaymentDetails");
            return new OrderHistoryItemDto(strFromJson, deliveryModeEnumFromJson, strFromJson2, pickUpSlotInfoDtoFromJson, strFromJson5, strFromJson3, strFromJson4, hybrisTipAmountFromJson, strFromJson6, strFromJson7, strFromJson8, zBooleanValue, zBooleanValue2, hybrisPriceFromJson, iIntValue, tipAndRateDetailsResponseFromJson, paymentDetailsFromJson);
        }
        PaymentDetails paymentDetails = paymentDetailsFromJson;
        HybrisPrice hybrisPrice = hybrisPriceFromJson;
        String str = strFromJson;
        String str2 = strFromJson2;
        PickUpSlotInfoDto pickUpSlotInfoDto = pickUpSlotInfoDtoFromJson;
        String str3 = strFromJson3;
        String str4 = strFromJson4;
        Constructor<OrderHistoryItemDto> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = C14410c.f134472c;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            declaredConstructor = OrderHistoryItemDto.class.getDeclaredConstructor(String.class, DeliveryModeEnum.class, String.class, PickUpSlotInfoDto.class, String.class, String.class, String.class, HybrisTipAmount.class, String.class, String.class, String.class, cls2, cls2, HybrisPrice.class, cls3, TipAndRateDetailsResponse.class, PaymentDetails.class, cls3, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        OrderHistoryItemDto orderHistoryItemDtoNewInstance = declaredConstructor.newInstance(str, deliveryModeEnumFromJson, str2, pickUpSlotInfoDto, strFromJson5, str3, str4, hybrisTipAmountFromJson, strFromJson6, strFromJson7, strFromJson8, boolFromJson, boolFromJson2, hybrisPrice, numFromJson, tipAndRateDetailsResponseFromJson, paymentDetails, Integer.valueOf(i11), null);
        Intrinsics.i(orderHistoryItemDtoNewInstance, "newInstance(...)");
        return orderHistoryItemDtoNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, OrderHistoryItemDto value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("code");
        this.stringAdapter.toJson(writer, (q) value_.getCode());
        writer.l("deliveryMode");
        this.nullableDeliveryModeEnumAdapter.toJson(writer, (q) value_.getDeliveryMode());
        writer.l("guid");
        this.stringAdapter.toJson(writer, (q) value_.getGuid());
        writer.l("pickUpSlotInfo");
        this.pickUpSlotInfoDtoAdapter.toJson(writer, (q) value_.getPickUpSlotInfo());
        writer.l("placed");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPlaced());
        writer.l("status");
        this.stringAdapter.toJson(writer, (q) value_.getStatus());
        writer.l("statusDisplay");
        this.stringAdapter.toJson(writer, (q) value_.getStatusDisplay());
        writer.l("tipAmount");
        this.nullableHybrisTipAmountAdapter.toJson(writer, (q) value_.getTipAmount());
        writer.l("tipAuthCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTipAuthCode());
        writer.l("tipCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTipCode());
        writer.l("tipDate");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTipDate());
        writer.l("tippablePartner");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getTippablePartner()));
        writer.l("tippedAndRated");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getTippedAndRated()));
        writer.l("total");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotal());
        writer.l("totalItems");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTotalItems()));
        writer.l("tipAndRateDetails");
        this.nullableTipAndRateDetailsResponseAdapter.toJson(writer, (q) value_.getTipAndRateDetails());
        writer.l("paymentInfo");
        this.paymentDetailsAdapter.toJson(writer, (q) value_.getPaymentInfo());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OrderHistoryItemDto");
        sb2.append(')');
        return sb2.toString();
    }
}
