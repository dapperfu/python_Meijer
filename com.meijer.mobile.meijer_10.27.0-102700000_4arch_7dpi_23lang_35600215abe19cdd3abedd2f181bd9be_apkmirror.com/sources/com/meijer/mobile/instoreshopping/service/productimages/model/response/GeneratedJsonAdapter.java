package com.meijer.mobile.instoreshopping.service.productimages.model.response;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/ProductImagesResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/ProductImagesResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/ProductImagesResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/ProductImagesResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.instoreshopping.service.productimages.model.response.ProductImagesResponseJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<ProductImagesResponse> {
    private volatile Constructor<ProductImagesResponse> constructorRef;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("upc", "title", "version", "description", "angle", "format", "cqTags", "path");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "upc");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "description");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProductImagesResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("upc", "upc", reader);
                    }
                    i10 &= -2;
                    break;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.w("title", "title", reader);
                    }
                    i10 &= -3;
                    break;
                case 2:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw c.w("version", "version", reader);
                    }
                    i10 &= -5;
                    break;
                case 3:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw c.w("angle", "angle", reader);
                    }
                    i10 &= -17;
                    break;
                case 5:
                    strFromJson6 = this.stringAdapter.fromJson(reader);
                    if (strFromJson6 == null) {
                        throw c.w("format", "format", reader);
                    }
                    i10 &= -33;
                    break;
                case 6:
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    strFromJson8 = this.stringAdapter.fromJson(reader);
                    if (strFromJson8 == null) {
                        throw c.w("path", "path", reader);
                    }
                    i10 &= -129;
                    break;
            }
        }
        reader.d();
        if (i10 != -256) {
            Constructor<ProductImagesResponse> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                declaredConstructor = ProductImagesResponse.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c.f134099c);
                this.constructorRef = declaredConstructor;
                Intrinsics.i(declaredConstructor, "also(...)");
            }
            ProductImagesResponse productImagesResponseNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, strFromJson3, strFromJson4, strFromJson5, strFromJson6, strFromJson7, strFromJson8, Integer.valueOf(i10), null);
            Intrinsics.i(productImagesResponseNewInstance, "newInstance(...)");
            return productImagesResponseNewInstance;
        }
        Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.h(strFromJson2, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.h(strFromJson3, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.h(strFromJson5, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.h(strFromJson6, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.h(strFromJson8, "null cannot be cast to non-null type kotlin.String");
        String str = strFromJson8;
        String str2 = strFromJson7;
        String str3 = strFromJson6;
        String str4 = strFromJson5;
        String str5 = strFromJson4;
        return new ProductImagesResponse(strFromJson, strFromJson2, strFromJson3, str5, str4, str3, str2, str);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, ProductImagesResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("upc");
        this.stringAdapter.toJson(writer, (q) value_.getUpc());
        writer.l("title");
        this.stringAdapter.toJson(writer, (q) value_.getTitle());
        writer.l("version");
        this.stringAdapter.toJson(writer, (q) value_.getVersion());
        writer.l("description");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDescription());
        writer.l("angle");
        this.stringAdapter.toJson(writer, (q) value_.getAngle());
        writer.l("format");
        this.stringAdapter.toJson(writer, (q) value_.getFormat());
        writer.l("cqTags");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCqTags());
        writer.l("path");
        this.stringAdapter.toJson(writer, (q) value_.getPath());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ProductImagesResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
