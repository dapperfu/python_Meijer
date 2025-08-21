package com.meijer.mobile.subscription.service.api.models;

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

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJsonJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "stringAdapter", "", "intAdapter", "Lcom/meijer/mobile/subscription/service/api/models/StoreInfoRequestJson;", "storeInfoRequestJsonAdapter", "Lcom/meijer/mobile/subscription/service/api/models/ProductInfoRequestJson;", "productInfoRequestJsonAdapter", "Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoRequestJson;", "paymentInfoRequestJsonAdapter", "Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressRequestJson;", "customerDeliveryAddressRequestJsonAdapter", "Lcom/meijer/mobile/subscription/service/api/models/CustomerNameRequestJson;", "nullableCustomerNameRequestJsonAdapter", "Lcom/meijer/mobile/subscription/service/api/models/ContactInfoRequestJson;", "nullableContactInfoRequestJsonAdapter", "Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotRequestJson;", "preferredTimeslotRequestJsonAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.subscription.service.api.models.SubscriptionProductRequestJsonJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends h<SubscriptionProductRequestJson> {
    private volatile Constructor<SubscriptionProductRequestJson> constructorRef;
    private final h<CustomerDeliveryAddressRequestJson> customerDeliveryAddressRequestJsonAdapter;
    private final h<Integer> intAdapter;
    private final h<ContactInfoRequestJson> nullableContactInfoRequestJsonAdapter;
    private final h<CustomerNameRequestJson> nullableCustomerNameRequestJsonAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<PaymentInfoRequestJson> paymentInfoRequestJsonAdapter;
    private final h<PreferredTimeslotRequestJson> preferredTimeslotRequestJsonAdapter;
    private final h<ProductInfoRequestJson> productInfoRequestJsonAdapter;
    private final h<StoreInfoRequestJson> storeInfoRequestJsonAdapter;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("name", "baseSite", "deliveryFrequency", "deliveryFrequencyUnit", "fulfillmentPartner", "fulfillmentType", "storeInfo", "productInfo", "paymentInfo", "customerDeliveryAddress", "customerName", "contactInfo", "preferredTimeslot");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "name");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "baseSite");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.stringAdapter = hVarF2;
        h<Integer> hVarF3 = moshi.f(Integer.TYPE, SetsKt.e(), "deliveryFrequency");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.intAdapter = hVarF3;
        h<StoreInfoRequestJson> hVarF4 = moshi.f(StoreInfoRequestJson.class, SetsKt.e(), "storeInfo");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.storeInfoRequestJsonAdapter = hVarF4;
        h<ProductInfoRequestJson> hVarF5 = moshi.f(ProductInfoRequestJson.class, SetsKt.e(), "productInfo");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.productInfoRequestJsonAdapter = hVarF5;
        h<PaymentInfoRequestJson> hVarF6 = moshi.f(PaymentInfoRequestJson.class, SetsKt.e(), "paymentInfo");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.paymentInfoRequestJsonAdapter = hVarF6;
        h<CustomerDeliveryAddressRequestJson> hVarF7 = moshi.f(CustomerDeliveryAddressRequestJson.class, SetsKt.e(), "customerDeliveryAddress");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.customerDeliveryAddressRequestJsonAdapter = hVarF7;
        h<CustomerNameRequestJson> hVarF8 = moshi.f(CustomerNameRequestJson.class, SetsKt.e(), "customerName");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.nullableCustomerNameRequestJsonAdapter = hVarF8;
        h<ContactInfoRequestJson> hVarF9 = moshi.f(ContactInfoRequestJson.class, SetsKt.e(), "contactInfo");
        Intrinsics.i(hVarF9, "adapter(...)");
        this.nullableContactInfoRequestJsonAdapter = hVarF9;
        h<PreferredTimeslotRequestJson> hVarF10 = moshi.f(PreferredTimeslotRequestJson.class, SetsKt.e(), "preferredTimeslot");
        Intrinsics.i(hVarF10, "adapter(...)");
        this.preferredTimeslotRequestJsonAdapter = hVarF10;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SubscriptionProductRequestJson fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        Intrinsics.j(reader, "reader");
        reader.b();
        int i11 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        Integer numFromJson = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        StoreInfoRequestJson storeInfoRequestJsonFromJson = null;
        ProductInfoRequestJson productInfoRequestJsonFromJson = null;
        PaymentInfoRequestJson paymentInfoRequestJsonFromJson = null;
        CustomerDeliveryAddressRequestJson customerDeliveryAddressRequestJsonFromJson = null;
        CustomerNameRequestJson customerNameRequestJsonFromJson = null;
        ContactInfoRequestJson contactInfoRequestJsonFromJson = null;
        PreferredTimeslotRequestJson preferredTimeslotRequestJsonFromJson = null;
        while (true) {
            String str = strFromJson;
            Integer num = numFromJson;
            StoreInfoRequestJson storeInfoRequestJson = storeInfoRequestJsonFromJson;
            ProductInfoRequestJson productInfoRequestJson = productInfoRequestJsonFromJson;
            if (!reader.hasNext()) {
                PaymentInfoRequestJson paymentInfoRequestJson = paymentInfoRequestJsonFromJson;
                reader.d();
                if (i11 == -3132) {
                    Intrinsics.h(strFromJson2, "null cannot be cast to non-null type kotlin.String");
                    if (num == null) {
                        throw C14410c.o("deliveryFrequency", "deliveryFrequency", reader);
                    }
                    int iIntValue = num.intValue();
                    Intrinsics.h(strFromJson3, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.h(strFromJson4, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.h(strFromJson5, "null cannot be cast to non-null type kotlin.String");
                    if (storeInfoRequestJson == null) {
                        throw C14410c.o("storeInfo", "storeInfo", reader);
                    }
                    if (productInfoRequestJson == null) {
                        throw C14410c.o("productInfo", "productInfo", reader);
                    }
                    if (paymentInfoRequestJson == null) {
                        throw C14410c.o("paymentInfo", "paymentInfo", reader);
                    }
                    if (customerDeliveryAddressRequestJsonFromJson == null) {
                        throw C14410c.o("customerDeliveryAddress", "customerDeliveryAddress", reader);
                    }
                    if (preferredTimeslotRequestJsonFromJson == null) {
                        throw C14410c.o("preferredTimeslot", "preferredTimeslot", reader);
                    }
                    return new SubscriptionProductRequestJson(str, strFromJson2, iIntValue, strFromJson3, strFromJson4, strFromJson5, storeInfoRequestJson, productInfoRequestJson, paymentInfoRequestJson, customerDeliveryAddressRequestJsonFromJson, customerNameRequestJsonFromJson, contactInfoRequestJsonFromJson, preferredTimeslotRequestJsonFromJson);
                }
                Constructor<SubscriptionProductRequestJson> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class<?> cls = C14410c.f134472c;
                    Class cls2 = Integer.TYPE;
                    i10 = i11;
                    declaredConstructor = SubscriptionProductRequestJson.class.getDeclaredConstructor(String.class, String.class, cls2, String.class, String.class, String.class, StoreInfoRequestJson.class, ProductInfoRequestJson.class, PaymentInfoRequestJson.class, CustomerDeliveryAddressRequestJson.class, CustomerNameRequestJson.class, ContactInfoRequestJson.class, PreferredTimeslotRequestJson.class, cls2, cls);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.i(declaredConstructor, "also(...)");
                } else {
                    i10 = i11;
                }
                Constructor<SubscriptionProductRequestJson> constructor = declaredConstructor;
                if (num == null) {
                    throw C14410c.o("deliveryFrequency", "deliveryFrequency", reader);
                }
                if (storeInfoRequestJson == null) {
                    throw C14410c.o("storeInfo", "storeInfo", reader);
                }
                if (productInfoRequestJson == null) {
                    throw C14410c.o("productInfo", "productInfo", reader);
                }
                if (paymentInfoRequestJson == null) {
                    throw C14410c.o("paymentInfo", "paymentInfo", reader);
                }
                if (customerDeliveryAddressRequestJsonFromJson == null) {
                    throw C14410c.o("customerDeliveryAddress", "customerDeliveryAddress", reader);
                }
                if (preferredTimeslotRequestJsonFromJson == null) {
                    throw C14410c.o("preferredTimeslot", "preferredTimeslot", reader);
                }
                SubscriptionProductRequestJson subscriptionProductRequestJsonNewInstance = constructor.newInstance(str, strFromJson2, num, strFromJson3, strFromJson4, strFromJson5, storeInfoRequestJson, productInfoRequestJson, paymentInfoRequestJson, customerDeliveryAddressRequestJsonFromJson, customerNameRequestJsonFromJson, contactInfoRequestJsonFromJson, preferredTimeslotRequestJsonFromJson, Integer.valueOf(i10), null);
                Intrinsics.i(subscriptionProductRequestJsonNewInstance, "newInstance(...)");
                return subscriptionProductRequestJsonNewInstance;
            }
            PaymentInfoRequestJson paymentInfoRequestJson2 = paymentInfoRequestJsonFromJson;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2;
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw C14410c.w("baseSite", "baseSite", reader);
                    }
                    i11 &= -3;
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 2:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw C14410c.w("deliveryFrequency", "deliveryFrequency", reader);
                    }
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 3:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw C14410c.w("deliveryFrequencyUnit", "deliveryFrequencyUnit", reader);
                    }
                    i11 &= -9;
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 4:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw C14410c.w("fulfillmentPartner", "fulfillmentPartner", reader);
                    }
                    i11 &= -17;
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 5:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw C14410c.w("fulfillmentType", "fulfillmentType", reader);
                    }
                    i11 &= -33;
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 6:
                    storeInfoRequestJsonFromJson = this.storeInfoRequestJsonAdapter.fromJson(reader);
                    if (storeInfoRequestJsonFromJson == null) {
                        throw C14410c.w("storeInfo", "storeInfo", reader);
                    }
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 7:
                    productInfoRequestJsonFromJson = this.productInfoRequestJsonAdapter.fromJson(reader);
                    if (productInfoRequestJsonFromJson == null) {
                        throw C14410c.w("productInfo", "productInfo", reader);
                    }
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                case 8:
                    paymentInfoRequestJsonFromJson = this.paymentInfoRequestJsonAdapter.fromJson(reader);
                    if (paymentInfoRequestJsonFromJson == null) {
                        throw C14410c.w("paymentInfo", "paymentInfo", reader);
                    }
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 9:
                    customerDeliveryAddressRequestJsonFromJson = this.customerDeliveryAddressRequestJsonAdapter.fromJson(reader);
                    if (customerDeliveryAddressRequestJsonFromJson == null) {
                        throw C14410c.w("customerDeliveryAddress", "customerDeliveryAddress", reader);
                    }
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 10:
                    customerNameRequestJsonFromJson = this.nullableCustomerNameRequestJsonAdapter.fromJson(reader);
                    i11 &= -1025;
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 11:
                    contactInfoRequestJsonFromJson = this.nullableContactInfoRequestJsonAdapter.fromJson(reader);
                    i11 &= -2049;
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                case 12:
                    preferredTimeslotRequestJsonFromJson = this.preferredTimeslotRequestJsonAdapter.fromJson(reader);
                    if (preferredTimeslotRequestJsonFromJson == null) {
                        throw C14410c.w("preferredTimeslot", "preferredTimeslot", reader);
                    }
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
                default:
                    paymentInfoRequestJsonFromJson = paymentInfoRequestJson2;
                    strFromJson = str;
                    numFromJson = num;
                    storeInfoRequestJsonFromJson = storeInfoRequestJson;
                    productInfoRequestJsonFromJson = productInfoRequestJson;
            }
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, SubscriptionProductRequestJson value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("name");
        this.nullableStringAdapter.toJson(writer, (q) value_.getName());
        writer.l("baseSite");
        this.stringAdapter.toJson(writer, (q) value_.getBaseSite());
        writer.l("deliveryFrequency");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getDeliveryFrequency()));
        writer.l("deliveryFrequencyUnit");
        this.stringAdapter.toJson(writer, (q) value_.getDeliveryFrequencyUnit());
        writer.l("fulfillmentPartner");
        this.stringAdapter.toJson(writer, (q) value_.getFulfillmentPartner());
        writer.l("fulfillmentType");
        this.stringAdapter.toJson(writer, (q) value_.getFulfillmentType());
        writer.l("storeInfo");
        this.storeInfoRequestJsonAdapter.toJson(writer, (q) value_.getStoreInfo());
        writer.l("productInfo");
        this.productInfoRequestJsonAdapter.toJson(writer, (q) value_.getProductInfo());
        writer.l("paymentInfo");
        this.paymentInfoRequestJsonAdapter.toJson(writer, (q) value_.getPaymentInfo());
        writer.l("customerDeliveryAddress");
        this.customerDeliveryAddressRequestJsonAdapter.toJson(writer, (q) value_.getCustomerDeliveryAddress());
        writer.l("customerName");
        this.nullableCustomerNameRequestJsonAdapter.toJson(writer, (q) value_.getCustomerName());
        writer.l("contactInfo");
        this.nullableContactInfoRequestJsonAdapter.toJson(writer, (q) value_.getContactInfo());
        writer.l("preferredTimeslot");
        this.preferredTimeslotRequestJsonAdapter.toJson(writer, (q) value_.getPreferredTimeslot());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SubscriptionProductRequestJson");
        sb2.append(')');
        return sb2.toString();
    }
}
