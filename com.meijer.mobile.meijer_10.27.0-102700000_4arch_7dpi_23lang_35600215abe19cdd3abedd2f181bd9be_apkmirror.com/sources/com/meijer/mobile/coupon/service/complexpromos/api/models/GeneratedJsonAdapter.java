package com.meijer.mobile.coupon.service.complexpromos.api.models;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import io.constructor.data.model.common.ResultData;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/meijer/mobile/coupon/service/complexpromos/api/models/ProductComplexPromoJsonJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/coupon/service/complexpromos/api/models/ProductComplexPromoJson;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/coupon/service/complexpromos/api/models/ProductComplexPromoJson;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/coupon/service/complexpromos/api/models/ProductComplexPromoJson;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "longAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "intAdapter", "", "doubleAdapter", "", "Lio/constructor/data/model/common/ResultData;", "listOfResultDataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "complexpromos_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.coupon.service.complexpromos.api.models.ProductComplexPromoJsonJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<ProductComplexPromoJson> {
    private volatile Constructor<ProductComplexPromoJson> constructorRef;
    private final h<Double> doubleAdapter;
    private final h<Integer> intAdapter;
    private final h<List<ResultData>> listOfResultDataAdapter;
    private final h<Long> longAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("promoId", "promoText", "promoBuyMinQty", "promoValue", "promoBuyMinSpend", "buyProducts", "getProducts");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Long> hVarF = moshi.f(Long.TYPE, SetsKt.e(), "promoId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.longAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "promoText");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
        h<Integer> hVarF3 = moshi.f(Integer.TYPE, SetsKt.e(), "promoBuyMinQty");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.intAdapter = hVarF3;
        h<Double> hVarF4 = moshi.f(Double.TYPE, SetsKt.e(), "promoValue");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.doubleAdapter = hVarF4;
        h<List<ResultData>> hVarF5 = moshi.f(x.j(List.class, ResultData.class), SetsKt.e(), "buyProducts");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.listOfResultDataAdapter = hVarF5;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProductComplexPromoJson fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Double dValueOf = Double.valueOf(0.0d);
        reader.b();
        int i10 = -1;
        Long lFromJson = 0L;
        Integer numFromJson = 0;
        Double dFromJson = dValueOf;
        Double dFromJson2 = dFromJson;
        List<ResultData> listFromJson = null;
        List<ResultData> listFromJson2 = null;
        String strFromJson = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    lFromJson = this.longAdapter.fromJson(reader);
                    if (lFromJson == null) {
                        throw c.w("promoId", "promoId", reader);
                    }
                    i10 &= -2;
                    break;
                case 1:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w("promoBuyMinQty", "promoBuyMinQty", reader);
                    }
                    i10 &= -5;
                    break;
                case 3:
                    dFromJson = this.doubleAdapter.fromJson(reader);
                    if (dFromJson == null) {
                        throw c.w("promoValue", "promoValue", reader);
                    }
                    i10 &= -9;
                    break;
                case 4:
                    dFromJson2 = this.doubleAdapter.fromJson(reader);
                    if (dFromJson2 == null) {
                        throw c.w("promoBuyMinSpend", "promoBuyMinSpend", reader);
                    }
                    i10 &= -17;
                    break;
                case 5:
                    listFromJson = this.listOfResultDataAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw c.w("buyProducts", "buyProducts", reader);
                    }
                    i10 &= -33;
                    break;
                case 6:
                    listFromJson2 = this.listOfResultDataAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw c.w("getProducts", "getProducts", reader);
                    }
                    i10 &= -65;
                    break;
            }
        }
        reader.d();
        if (i10 == -128) {
            long jLongValue = lFromJson.longValue();
            int iIntValue = numFromJson.intValue();
            double dDoubleValue = dFromJson.doubleValue();
            double dDoubleValue2 = dFromJson2.doubleValue();
            Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<io.constructor.data.model.common.ResultData>");
            Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<io.constructor.data.model.common.ResultData>");
            return new ProductComplexPromoJson(jLongValue, strFromJson, iIntValue, dDoubleValue, dDoubleValue2, listFromJson, listFromJson2);
        }
        List<ResultData> list = listFromJson;
        List<ResultData> list2 = listFromJson2;
        Constructor<ProductComplexPromoJson> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = c.f134099c;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            Class cls4 = Double.TYPE;
            declaredConstructor = ProductComplexPromoJson.class.getDeclaredConstructor(cls2, String.class, cls3, cls4, cls4, List.class, List.class, cls3, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        ProductComplexPromoJson productComplexPromoJsonNewInstance = declaredConstructor.newInstance(lFromJson, strFromJson, numFromJson, dFromJson, dFromJson2, list, list2, Integer.valueOf(i10), null);
        Intrinsics.i(productComplexPromoJsonNewInstance, "newInstance(...)");
        return productComplexPromoJsonNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, ProductComplexPromoJson value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("promoId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getPromoId()));
        writer.l("promoText");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPromoText());
        writer.l("promoBuyMinQty");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getPromoBuyMinQty()));
        writer.l("promoValue");
        this.doubleAdapter.toJson(writer, (q) Double.valueOf(value_.getPromoValue()));
        writer.l("promoBuyMinSpend");
        this.doubleAdapter.toJson(writer, (q) Double.valueOf(value_.getPromoBuyMinSpend()));
        writer.l("buyProducts");
        this.listOfResultDataAdapter.toJson(writer, (q) value_.a());
        writer.l("getProducts");
        this.listOfResultDataAdapter.toJson(writer, (q) value_.b());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ProductComplexPromoJson");
        sb2.append(')');
        return sb2.toString();
    }
}
