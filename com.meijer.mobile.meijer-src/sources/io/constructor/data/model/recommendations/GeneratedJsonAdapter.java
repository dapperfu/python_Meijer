package io.constructor.data.model.recommendations;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.C14410c;
import io.constructor.data.model.common.Result;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lio/constructor/data/model/recommendations/RecommendationsResponseInnerJsonAdapter;", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/recommendations/RecommendationsResponseInner;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lio/constructor/data/model/recommendations/RecommendationsResponseInner;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/q;Lio/constructor/data/model/recommendations/RecommendationsResponseInner;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lio/constructor/data/model/recommendations/Pod;", "nullablePodAdapter", "Lcom/squareup/moshi/h;", "", "Lio/constructor/data/model/common/Result;", "nullableListOfResultAdapter", "", "intAdapter", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: io.constructor.data.model.recommendations.RecommendationsResponseInnerJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<RecommendationsResponseInner> {
    private final h<Integer> intAdapter;
    private final h<List<Result>> nullableListOfResultAdapter;
    private final h<Pod> nullablePodAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("pod", "results", "total_num_results");
        Intrinsics.i(bVarA, "of(\"pod\", \"results\",\n      \"total_num_results\")");
        this.options = bVarA;
        h<Pod> hVarF = moshi.f(Pod.class, SetsKt.e(), "pod");
        Intrinsics.i(hVarF, "moshi.adapter(Pod::class… emptySet(),\n      \"pod\")");
        this.nullablePodAdapter = hVarF;
        h<List<Result>> hVarF2 = moshi.f(x.j(List.class, Result.class), SetsKt.e(), "results");
        Intrinsics.i(hVarF2, "moshi.adapter(Types.newP…tySet(),\n      \"results\")");
        this.nullableListOfResultAdapter = hVarF2;
        h<Integer> hVarF3 = moshi.f(Integer.TYPE, SetsKt.e(), "resultCount");
        Intrinsics.i(hVarF3, "moshi.adapter(Int::class…t(),\n      \"resultCount\")");
        this.intAdapter = hVarF3;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public RecommendationsResponseInner fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Pod podFromJson = null;
        List<Result> listFromJson = null;
        Integer numFromJson = null;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                podFromJson = this.nullablePodAdapter.fromJson(reader);
            } else if (iZ == 1) {
                listFromJson = this.nullableListOfResultAdapter.fromJson(reader);
            } else if (iZ == 2 && (numFromJson = this.intAdapter.fromJson(reader)) == null) {
                JsonDataException jsonDataExceptionW = C14410c.w("resultCount", "total_num_results", reader);
                Intrinsics.i(jsonDataExceptionW, "unexpectedNull(\"resultCo…tal_num_results\", reader)");
                throw jsonDataExceptionW;
            }
        }
        reader.d();
        if (numFromJson != null) {
            return new RecommendationsResponseInner(podFromJson, listFromJson, numFromJson.intValue());
        }
        JsonDataException jsonDataExceptionO = C14410c.o("resultCount", "total_num_results", reader);
        Intrinsics.i(jsonDataExceptionO, "missingProperty(\"resultC…lts\",\n            reader)");
        throw jsonDataExceptionO;
    }

    @Override // com.squareup.moshi.h
    public void toJson(q writer, RecommendationsResponseInner value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("pod");
        this.nullablePodAdapter.toJson(writer, (q) value_.getPod());
        writer.l("results");
        this.nullableListOfResultAdapter.toJson(writer, (q) value_.getResults());
        writer.l("total_num_results");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getResultCount()));
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RecommendationsResponseInner");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
