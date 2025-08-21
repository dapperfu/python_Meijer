package com.meijer.mobile.cart.model.hybris.checkout;

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
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequestJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequest;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "", "booleanAdapter", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "nullableHybrisPickupPersonAdapter", "Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "nullableHybrisPickupSlotInfoAdapter", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisContactInformation;", "nullableHybrisContactInformationAdapter", "Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;", "nullableTipJsonAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "nullableHybrisPriceAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.cart.model.hybris.checkout.SubmitOrderRequestJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<SubmitOrderRequest> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<SubmitOrderRequest> constructorRef;
    private final h<HybrisContactInformation> nullableHybrisContactInformationAdapter;
    private final h<HybrisPickupPerson> nullableHybrisPickupPersonAdapter;
    private final h<com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo> nullableHybrisPickupSlotInfoAdapter;
    private final h<HybrisPrice> nullableHybrisPriceAdapter;
    private final h<String> nullableStringAdapter;
    private final h<TipJson> nullableTipJsonAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("deliveryNote", "deliveryPhone", "earlyDelivery", "deliveryEmail", "pickUpPerson", "pickUpSlotInfo", "contactInformation", "substitutionPreferenceTypeId", "tip", "ebtApprovedBalance");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "deliveryNote");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h<Boolean> hVarF2 = moshi.f(Boolean.TYPE, SetsKt.e(), "earlyDelivery");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.booleanAdapter = hVarF2;
        h<HybrisPickupPerson> hVarF3 = moshi.f(HybrisPickupPerson.class, SetsKt.e(), "pickUpPerson");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableHybrisPickupPersonAdapter = hVarF3;
        h<com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo> hVarF4 = moshi.f(com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo.class, SetsKt.e(), "pickUpSlotInfo");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableHybrisPickupSlotInfoAdapter = hVarF4;
        h<HybrisContactInformation> hVarF5 = moshi.f(HybrisContactInformation.class, SetsKt.e(), "contactInformation");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableHybrisContactInformationAdapter = hVarF5;
        h<TipJson> hVarF6 = moshi.f(TipJson.class, SetsKt.e(), "tip");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.nullableTipJsonAdapter = hVarF6;
        h<HybrisPrice> hVarF7 = moshi.f(HybrisPrice.class, SetsKt.e(), "ebtApprovedBalance");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.nullableHybrisPriceAdapter = hVarF7;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SubmitOrderRequest fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        int i10 = -1;
        Boolean boolFromJson = bool;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        HybrisPickupPerson hybrisPickupPersonFromJson = null;
        com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo hybrisPickupSlotInfoFromJson = null;
        HybrisContactInformation hybrisContactInformationFromJson = null;
        String strFromJson4 = null;
        TipJson tipJsonFromJson = null;
        HybrisPrice hybrisPriceFromJson = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw C14410c.w("earlyDelivery", "earlyDelivery", reader);
                    }
                    i10 &= -5;
                    break;
                case 3:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    hybrisPickupPersonFromJson = this.nullableHybrisPickupPersonAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    hybrisPickupSlotInfoFromJson = this.nullableHybrisPickupSlotInfoAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    hybrisContactInformationFromJson = this.nullableHybrisContactInformationAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
                case 8:
                    tipJsonFromJson = this.nullableTipJsonAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
                case 9:
                    hybrisPriceFromJson = this.nullableHybrisPriceAdapter.fromJson(reader);
                    i10 &= -513;
                    break;
            }
        }
        reader.d();
        if (i10 == -1024) {
            return new SubmitOrderRequest(strFromJson, strFromJson2, boolFromJson.booleanValue(), strFromJson3, hybrisPickupPersonFromJson, hybrisPickupSlotInfoFromJson, hybrisContactInformationFromJson, strFromJson4, tipJsonFromJson, hybrisPriceFromJson);
        }
        String str = strFromJson3;
        Constructor<SubmitOrderRequest> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = SubmitOrderRequest.class.getDeclaredConstructor(String.class, String.class, Boolean.TYPE, String.class, HybrisPickupPerson.class, com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo.class, HybrisContactInformation.class, String.class, TipJson.class, HybrisPrice.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        SubmitOrderRequest submitOrderRequestNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, boolFromJson, str, hybrisPickupPersonFromJson, hybrisPickupSlotInfoFromJson, hybrisContactInformationFromJson, strFromJson4, tipJsonFromJson, hybrisPriceFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(submitOrderRequestNewInstance, "newInstance(...)");
        return submitOrderRequestNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, SubmitOrderRequest value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("deliveryNote");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDeliveryNote());
        writer.l("deliveryPhone");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDeliveryPhone());
        writer.l("earlyDelivery");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getEarlyDelivery()));
        writer.l("deliveryEmail");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDeliveryEmail());
        writer.l("pickUpPerson");
        this.nullableHybrisPickupPersonAdapter.toJson(writer, (q) value_.getPickUpPerson());
        writer.l("pickUpSlotInfo");
        this.nullableHybrisPickupSlotInfoAdapter.toJson(writer, (q) value_.getPickUpSlotInfo());
        writer.l("contactInformation");
        this.nullableHybrisContactInformationAdapter.toJson(writer, (q) value_.getContactInformation());
        writer.l("substitutionPreferenceTypeId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSubstitutionPreferenceTypeId());
        writer.l("tip");
        this.nullableTipJsonAdapter.toJson(writer, (q) value_.getTip());
        writer.l("ebtApprovedBalance");
        this.nullableHybrisPriceAdapter.toJson(writer, (q) value_.getEbtApprovedBalance());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SubmitOrderRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
