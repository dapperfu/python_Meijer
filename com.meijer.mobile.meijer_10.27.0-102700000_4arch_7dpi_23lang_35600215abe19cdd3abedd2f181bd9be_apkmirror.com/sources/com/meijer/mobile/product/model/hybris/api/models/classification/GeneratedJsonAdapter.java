package com.meijer.mobile.product.model.hybris.api.models.classification;

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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeatureJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeature;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeature;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeature;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "", "booleanAdapter", "", "Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeatureValue;", "listOfHybrisClassificationFeatureValueAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.product.model.hybris.api.models.classification.HybrisClassificationFeatureJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<HybrisClassificationFeature> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<HybrisClassificationFeature> constructorRef;
    private final h<List<HybrisClassificationFeatureValue>> listOfHybrisClassificationFeatureValueAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("code", "comparable", "featureValues", "name", "range");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "code");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<Boolean> hVarF2 = moshi.f(Boolean.TYPE, SetsKt.e(), "comparable");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.booleanAdapter = hVarF2;
        h<List<HybrisClassificationFeatureValue>> hVarF3 = moshi.f(x.j(List.class, HybrisClassificationFeatureValue.class), SetsKt.e(), "featureValues");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.listOfHybrisClassificationFeatureValueAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybrisClassificationFeature fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        String strFromJson = null;
        List<HybrisClassificationFeatureValue> listFromJson = null;
        String strFromJson2 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw c.w("code", "code", reader);
                }
                i10 &= -2;
            } else if (iZ == 1) {
                boolFromJson = this.booleanAdapter.fromJson(reader);
                if (boolFromJson == null) {
                    throw c.w("comparable", "comparable", reader);
                }
                i10 &= -3;
            } else if (iZ == 2) {
                listFromJson = this.listOfHybrisClassificationFeatureValueAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw c.w("featureValues", "featureValues", reader);
                }
                i10 &= -5;
            } else if (iZ == 3) {
                strFromJson2 = this.stringAdapter.fromJson(reader);
                if (strFromJson2 == null) {
                    throw c.w("name", "name", reader);
                }
                i10 &= -9;
            } else if (iZ == 4) {
                boolFromJson2 = this.booleanAdapter.fromJson(reader);
                if (boolFromJson2 == null) {
                    throw c.w("range", "range", reader);
                }
                i10 &= -17;
            } else {
                continue;
            }
        }
        reader.d();
        if (i10 == -32) {
            Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
            boolean zBooleanValue = boolFromJson.booleanValue();
            Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.hybris.api.models.classification.HybrisClassificationFeatureValue>");
            Intrinsics.h(strFromJson2, "null cannot be cast to non-null type kotlin.String");
            return new HybrisClassificationFeature(strFromJson, zBooleanValue, listFromJson, strFromJson2, boolFromJson2.booleanValue());
        }
        Constructor<HybrisClassificationFeature> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = c.f134099c;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = HybrisClassificationFeature.class.getDeclaredConstructor(String.class, cls3, List.class, String.class, cls3, cls, cls2);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        HybrisClassificationFeature hybrisClassificationFeatureNewInstance = declaredConstructor.newInstance(strFromJson, boolFromJson, listFromJson, strFromJson2, boolFromJson2, Integer.valueOf(i10), null);
        Intrinsics.i(hybrisClassificationFeatureNewInstance, "newInstance(...)");
        return hybrisClassificationFeatureNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HybrisClassificationFeature value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("code");
        this.stringAdapter.toJson(writer, (q) value_.getCode());
        writer.l("comparable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getComparable()));
        writer.l("featureValues");
        this.listOfHybrisClassificationFeatureValueAdapter.toJson(writer, (q) value_.c());
        writer.l("name");
        this.stringAdapter.toJson(writer, (q) value_.getName());
        writer.l("range");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getRange()));
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HybrisClassificationFeature");
        sb2.append(')');
        return sb2.toString();
    }
}
