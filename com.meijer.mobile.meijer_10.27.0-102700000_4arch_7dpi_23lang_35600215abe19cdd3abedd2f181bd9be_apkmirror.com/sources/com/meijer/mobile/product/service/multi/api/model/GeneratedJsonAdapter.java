package com.meijer.mobile.product.service.multi.api.model;

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

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/product/service/multi/api/model/ProductMultiRequestJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/product/service/multi/api/model/ProductMultiRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/product/service/multi/api/model/ProductMultiRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/product/service/multi/api/model/ProductMultiRequest;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "nullableIntAdapter", "Lcom/squareup/moshi/h;", "", "nullableListOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "multi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.product.service.multi.api.model.ProductMultiRequestJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<ProductMultiRequest> {
    private volatile Constructor<ProductMultiRequest> constructorRef;
    private final h<Integer> nullableIntAdapter;
    private final h<List<String>> nullableListOfStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("unitId", "upcs");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Integer> hVarF = moshi.f(Integer.class, SetsKt.e(), "storeId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableIntAdapter = hVarF;
        h<List<String>> hVarF2 = moshi.f(x.j(List.class, String.class), SetsKt.e(), "upcs");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableListOfStringAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProductMultiRequest fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Integer numFromJson = null;
        List<String> listFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                numFromJson = this.nullableIntAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iZ == 1) {
                listFromJson = this.nullableListOfStringAdapter.fromJson(reader);
                i10 &= -3;
            }
        }
        reader.d();
        if (i10 == -4) {
            return new ProductMultiRequest(numFromJson, listFromJson);
        }
        Constructor<ProductMultiRequest> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ProductMultiRequest.class.getDeclaredConstructor(Integer.class, List.class, Integer.TYPE, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        ProductMultiRequest productMultiRequestNewInstance = declaredConstructor.newInstance(numFromJson, listFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(productMultiRequestNewInstance, "newInstance(...)");
        return productMultiRequestNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, ProductMultiRequest value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("unitId");
        this.nullableIntAdapter.toJson(writer, (q) value_.getStoreId());
        writer.l("upcs");
        this.nullableListOfStringAdapter.toJson(writer, (q) value_.b());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ProductMultiRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
