package com.meijer.mobile.cart.model.hybris.orders;

import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPriceJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPrice;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPrice;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPrice;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "hybrisPriceAdapter", "Lcom/squareup/moshi/h;", "", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionResult;", "listOfHybrisPromotionResultAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.cart.model.hybris.orders.HybrisOrderPriceJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<HybrisOrderPrice> {
    private volatile Constructor<HybrisOrderPrice> constructorRef;
    private final h<HybrisPrice> hybrisPriceAdapter;
    private final h<List<HybrisPromotionResult>> listOfHybrisPromotionResultAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("totalPrice", "billingTime", "totalTax", "subTotal", "deliveryCost", "totalDiscounts", "appliedProductPromotions", "appliedOrderPromotions", "potentialProductPromotions", "potentialOrderPromotions");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<HybrisPrice> hVarF = moshi.f(HybrisPrice.class, SetsKt.e(), "totalPrice");
        Intrinsics.i(hVarF, "adapter(...)");
        this.hybrisPriceAdapter = hVarF;
        h<List<HybrisPromotionResult>> hVarF2 = moshi.f(x.j(List.class, HybrisPromotionResult.class), SetsKt.e(), "appliedProductPromotions");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.listOfHybrisPromotionResultAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybrisOrderPrice fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        HybrisPrice hybrisPriceFromJson = null;
        HybrisPrice hybrisPriceFromJson2 = null;
        HybrisPrice hybrisPriceFromJson3 = null;
        HybrisPrice hybrisPriceFromJson4 = null;
        HybrisPrice hybrisPriceFromJson5 = null;
        HybrisPrice hybrisPriceFromJson6 = null;
        List<HybrisPromotionResult> listFromJson = null;
        List<HybrisPromotionResult> listFromJson2 = null;
        List<HybrisPromotionResult> listFromJson3 = null;
        List<HybrisPromotionResult> listFromJson4 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    hybrisPriceFromJson = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson == null) {
                        throw c.w("totalPrice", "totalPrice", reader);
                    }
                    i10 &= -2;
                    break;
                case 1:
                    hybrisPriceFromJson2 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson2 == null) {
                        throw c.w("billingTime", "billingTime", reader);
                    }
                    i10 &= -3;
                    break;
                case 2:
                    hybrisPriceFromJson3 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson3 == null) {
                        throw c.w("totalTax", "totalTax", reader);
                    }
                    i10 &= -5;
                    break;
                case 3:
                    hybrisPriceFromJson4 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson4 == null) {
                        throw c.w("subTotal", "subTotal", reader);
                    }
                    i10 &= -9;
                    break;
                case 4:
                    hybrisPriceFromJson5 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson5 == null) {
                        throw c.w("deliveryCost", "deliveryCost", reader);
                    }
                    i10 &= -17;
                    break;
                case 5:
                    hybrisPriceFromJson6 = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson6 == null) {
                        throw c.w("totalDiscounts", "totalDiscounts", reader);
                    }
                    i10 &= -33;
                    break;
                case 6:
                    listFromJson = this.listOfHybrisPromotionResultAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw c.w("appliedProductPromotions", "appliedProductPromotions", reader);
                    }
                    i10 &= -65;
                    break;
                case 7:
                    listFromJson2 = this.listOfHybrisPromotionResultAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw c.w("appliedOrderPromotions", "appliedOrderPromotions", reader);
                    }
                    i10 &= -129;
                    break;
                case 8:
                    listFromJson3 = this.listOfHybrisPromotionResultAdapter.fromJson(reader);
                    if (listFromJson3 == null) {
                        throw c.w("potentialProductPromotions", "potentialProductPromotions", reader);
                    }
                    i10 &= -257;
                    break;
                case 9:
                    listFromJson4 = this.listOfHybrisPromotionResultAdapter.fromJson(reader);
                    if (listFromJson4 == null) {
                        throw c.w("potentialOrderPromotions", "potentialOrderPromotions", reader);
                    }
                    i10 &= -513;
                    break;
            }
        }
        reader.d();
        if (i10 != -1024) {
            Constructor<HybrisOrderPrice> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                declaredConstructor = HybrisOrderPrice.class.getDeclaredConstructor(HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, HybrisPrice.class, List.class, List.class, List.class, List.class, Integer.TYPE, c.f134099c);
                this.constructorRef = declaredConstructor;
                Intrinsics.i(declaredConstructor, "also(...)");
            }
            HybrisOrderPrice hybrisOrderPriceNewInstance = declaredConstructor.newInstance(hybrisPriceFromJson, hybrisPriceFromJson2, hybrisPriceFromJson3, hybrisPriceFromJson4, hybrisPriceFromJson5, hybrisPriceFromJson6, listFromJson, listFromJson2, listFromJson3, listFromJson4, Integer.valueOf(i10), null);
            Intrinsics.i(hybrisOrderPriceNewInstance, "newInstance(...)");
            return hybrisOrderPriceNewInstance;
        }
        Intrinsics.h(hybrisPriceFromJson, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson2, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson3, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson4, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson5, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(hybrisPriceFromJson6, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult>");
        Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult>");
        Intrinsics.h(listFromJson3, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult>");
        Intrinsics.h(listFromJson4, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult>");
        List<HybrisPromotionResult> list = listFromJson3;
        List<HybrisPromotionResult> list2 = listFromJson2;
        List<HybrisPromotionResult> list3 = listFromJson;
        HybrisPrice hybrisPrice = hybrisPriceFromJson6;
        HybrisPrice hybrisPrice2 = hybrisPriceFromJson5;
        HybrisPrice hybrisPrice3 = hybrisPriceFromJson4;
        return new HybrisOrderPrice(hybrisPriceFromJson, hybrisPriceFromJson2, hybrisPriceFromJson3, hybrisPrice3, hybrisPrice2, hybrisPrice, list3, list2, list, listFromJson4);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HybrisOrderPrice value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("totalPrice");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalPrice());
        writer.l("billingTime");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getBillingTime());
        writer.l("totalTax");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalTax());
        writer.l("subTotal");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getSubTotal());
        writer.l("deliveryCost");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getDeliveryCost());
        writer.l("totalDiscounts");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getTotalDiscounts());
        writer.l("appliedProductPromotions");
        this.listOfHybrisPromotionResultAdapter.toJson(writer, (q) value_.b());
        writer.l("appliedOrderPromotions");
        this.listOfHybrisPromotionResultAdapter.toJson(writer, (q) value_.a());
        writer.l("potentialProductPromotions");
        this.listOfHybrisPromotionResultAdapter.toJson(writer, (q) value_.f());
        writer.l("potentialOrderPromotions");
        this.listOfHybrisPromotionResultAdapter.toJson(writer, (q) value_.e());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HybrisOrderPrice");
        sb2.append(')');
        return sb2.toString();
    }
}
