package com.meijer.mobile.product.service.recommendations.models;

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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/product/service/recommendations/models/PersonalizedProductsResponseV2JsonJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/product/service/recommendations/models/PersonalizedProductsResponseV2Json;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/product/service/recommendations/models/PersonalizedProductsResponseV2Json;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/product/service/recommendations/models/PersonalizedProductsResponseV2Json;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "intAdapter", "Lcom/squareup/moshi/h;", "stringAdapter", "", "Lio/constructor/data/model/common/ResultData;", "listOfResultDataAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "recommendations_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.product.service.recommendations.models.PersonalizedProductsResponseV2JsonJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<PersonalizedProductsResponseV2Json> {
    private volatile Constructor<PersonalizedProductsResponseV2Json> constructorRef;
    private final h<Integer> intAdapter;
    private final h<List<ResultData>> listOfResultDataAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("resultCode", "resultDescription", "totalProducts", "products", "onViewBeacon", "onLoadBeacon");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Integer> hVarF = moshi.f(Integer.TYPE, SetsKt.e(), "resultCode");
        Intrinsics.i(hVarF, "adapter(...)");
        this.intAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "resultDescription");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.stringAdapter = hVarF2;
        h<List<ResultData>> hVarF3 = moshi.f(x.j(List.class, ResultData.class), SetsKt.e(), "products");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.listOfResultDataAdapter = hVarF3;
        h<String> hVarF4 = moshi.f(String.class, SetsKt.e(), "onViewBeacon");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableStringAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PersonalizedProductsResponseV2Json fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        Integer numFromJson = 0;
        Integer numFromJson2 = null;
        String strFromJson = null;
        List<ResultData> listFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w("resultCode", "resultCode", reader);
                    }
                    i10 &= -2;
                    break;
                case 1:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("resultDescription", "resultDescription", reader);
                    }
                    i10 &= -3;
                    break;
                case 2:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw c.w("totalProducts", "totalProducts", reader);
                    }
                    i10 &= -5;
                    break;
                case 3:
                    listFromJson = this.listOfResultDataAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw c.w("products", "products", reader);
                    }
                    i10 &= -9;
                    break;
                case 4:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.d();
        if (i10 == -64) {
            String str = strFromJson2;
            int iIntValue = numFromJson.intValue();
            Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
            int iIntValue2 = numFromJson2.intValue();
            Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<io.constructor.data.model.common.ResultData>");
            return new PersonalizedProductsResponseV2Json(iIntValue, strFromJson, iIntValue2, listFromJson, str, strFromJson3);
        }
        String str2 = strFromJson2;
        Constructor<PersonalizedProductsResponseV2Json> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = c.f134099c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = PersonalizedProductsResponseV2Json.class.getDeclaredConstructor(cls2, String.class, cls2, List.class, String.class, String.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        PersonalizedProductsResponseV2Json personalizedProductsResponseV2JsonNewInstance = declaredConstructor.newInstance(numFromJson, strFromJson, numFromJson2, listFromJson, str2, strFromJson3, Integer.valueOf(i10), null);
        Intrinsics.i(personalizedProductsResponseV2JsonNewInstance, "newInstance(...)");
        return personalizedProductsResponseV2JsonNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, PersonalizedProductsResponseV2Json value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("resultCode");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getResultCode()));
        writer.l("resultDescription");
        this.stringAdapter.toJson(writer, (q) value_.getResultDescription());
        writer.l("totalProducts");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTotalProducts()));
        writer.l("products");
        this.listOfResultDataAdapter.toJson(writer, (q) value_.c());
        writer.l("onViewBeacon");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOnViewBeacon());
        writer.l("onLoadBeacon");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOnLoadBeacon());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PersonalizedProductsResponseV2Json");
        sb2.append(')');
        return sb2.toString();
    }
}
