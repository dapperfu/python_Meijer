package com.meijer.mobile.product.model.search.api;

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

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/product/model/search/api/ResultSourcesJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/product/model/search/api/ResultSources;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/product/model/search/api/ResultSources;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/product/model/search/api/ResultSources;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lcom/meijer/mobile/product/model/search/api/ResultSourcesData;", "nullableResultSourcesDataAdapter", "Lcom/squareup/moshi/h;", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.product.model.search.api.ResultSourcesJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<ResultSources> {
    private volatile Constructor<ResultSources> constructorRef;
    private final h<Integer> intAdapter;
    private final h<ResultSourcesData> nullableResultSourcesDataAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("token_match", "embeddings_match", "totalCount");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<ResultSourcesData> hVarF = moshi.f(ResultSourcesData.class, SetsKt.e(), "tokenMatch");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableResultSourcesDataAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.TYPE, SetsKt.e(), "totalCount");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.intAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ResultSources fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Integer numFromJson = 0;
        reader.b();
        ResultSourcesData resultSourcesDataFromJson = null;
        ResultSourcesData resultSourcesDataFromJson2 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                resultSourcesDataFromJson = this.nullableResultSourcesDataAdapter.fromJson(reader);
            } else if (iZ == 1) {
                resultSourcesDataFromJson2 = this.nullableResultSourcesDataAdapter.fromJson(reader);
            } else if (iZ == 2) {
                numFromJson = this.intAdapter.fromJson(reader);
                if (numFromJson == null) {
                    throw c.w("totalCount", "totalCount", reader);
                }
                i10 = -5;
            } else {
                continue;
            }
        }
        reader.d();
        if (i10 == -5) {
            return new ResultSources(resultSourcesDataFromJson, resultSourcesDataFromJson2, numFromJson.intValue());
        }
        Constructor<ResultSources> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultSources.class.getDeclaredConstructor(ResultSourcesData.class, ResultSourcesData.class, cls, cls, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        ResultSources resultSourcesNewInstance = declaredConstructor.newInstance(resultSourcesDataFromJson, resultSourcesDataFromJson2, numFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(resultSourcesNewInstance, "newInstance(...)");
        return resultSourcesNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, ResultSources value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("token_match");
        this.nullableResultSourcesDataAdapter.toJson(writer, (q) value_.getTokenMatch());
        writer.l("embeddings_match");
        this.nullableResultSourcesDataAdapter.toJson(writer, (q) value_.getEmbeddingsMatch());
        writer.l("totalCount");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTotalCount()));
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ResultSources");
        sb2.append(')');
        return sb2.toString();
    }
}
