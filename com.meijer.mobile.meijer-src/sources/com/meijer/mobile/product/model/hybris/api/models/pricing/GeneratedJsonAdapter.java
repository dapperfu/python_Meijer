package com.meijer.mobile.product.model.hybris.api.models.pricing;

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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPriceJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "stringAdapter", "", "doubleAdapter", "nullableDoubleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPriceJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends h<HybrisPrice> {
    private volatile Constructor<HybrisPrice> constructorRef;
    private final h<Double> doubleAdapter;
    private final h<Double> nullableDoubleAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("currencyIso", "formattedValue", "priceType", "unit", "value", "averagePoundEach", "priceText");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "currencyIso");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "formattedValue");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.stringAdapter = hVarF2;
        h<Double> hVarF3 = moshi.f(Double.TYPE, SetsKt.e(), "value");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.doubleAdapter = hVarF3;
        h<Double> hVarF4 = moshi.f(Double.class, SetsKt.e(), "averagePoundEach");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableDoubleAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybrisPrice fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Double dValueOf = Double.valueOf(0.0d);
        reader.b();
        int i10 = -1;
        Double dFromJson = dValueOf;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        Double dFromJson2 = null;
        String strFromJson5 = null;
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
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw C14410c.w("formattedValue", "formattedValue", reader);
                    }
                    i10 &= -3;
                    break;
                case 2:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    dFromJson = this.doubleAdapter.fromJson(reader);
                    if (dFromJson == null) {
                        throw C14410c.w("value__", "value", reader);
                    }
                    i10 &= -17;
                    break;
                case 5:
                    dFromJson2 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
            }
        }
        reader.d();
        if (i10 == -128) {
            Intrinsics.h(strFromJson2, "null cannot be cast to non-null type kotlin.String");
            return new HybrisPrice(strFromJson, strFromJson2, strFromJson3, strFromJson4, dFromJson.doubleValue(), dFromJson2, strFromJson5);
        }
        Constructor<HybrisPrice> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = HybrisPrice.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Double.TYPE, Double.class, String.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        HybrisPrice hybrisPriceNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, strFromJson3, strFromJson4, dFromJson, dFromJson2, strFromJson5, Integer.valueOf(i10), null);
        Intrinsics.i(hybrisPriceNewInstance, "newInstance(...)");
        return hybrisPriceNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HybrisPrice value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("currencyIso");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurrencyIso());
        writer.l("formattedValue");
        this.stringAdapter.toJson(writer, (q) value_.getFormattedValue());
        writer.l("priceType");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPriceType());
        writer.l("unit");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUnit());
        writer.l("value");
        this.doubleAdapter.toJson(writer, (q) Double.valueOf(value_.getValue()));
        writer.l("averagePoundEach");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getAveragePoundEach());
        writer.l("priceText");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPriceText());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HybrisPrice");
        sb2.append(')');
        return sb2.toString();
    }
}
