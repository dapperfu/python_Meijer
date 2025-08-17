package io.constructor.data.model.autocomplete;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import io.constructor.data.model.common.Result;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R.\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR*\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lio/constructor/data/model/autocomplete/AutocompleteResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/autocomplete/AutocompleteResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lio/constructor/data/model/autocomplete/AutocompleteResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/q;Lio/constructor/data/model/autocomplete/AutocompleteResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "", "Lio/constructor/data/model/common/Result;", "nullableMapOfStringListOfResultAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "nullableMapOfStringNullableAnyAdapter", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: io.constructor.data.model.autocomplete.AutocompleteResponseJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<AutocompleteResponse> {
    private final h<Map<String, List<Result>>> nullableMapOfStringListOfResultAdapter;
    private final h<Map<String, Object>> nullableMapOfStringNullableAnyAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("sections", "result_id", "request", "rawData");
        Intrinsics.i(bVarA, "of(\"sections\", \"result_i…    \"request\", \"rawData\")");
        this.options = bVarA;
        h<Map<String, List<Result>>> hVarF = moshi.f(x.j(Map.class, String.class, x.j(List.class, Result.class)), SetsKt.e(), "sections");
        Intrinsics.i(hVarF, "moshi.adapter(Types.newP…, emptySet(), \"sections\")");
        this.nullableMapOfStringListOfResultAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "resultId");
        Intrinsics.i(hVarF2, "moshi.adapter(String::cl…  emptySet(), \"resultId\")");
        this.nullableStringAdapter = hVarF2;
        h<Map<String, Object>> hVarF3 = moshi.f(x.j(Map.class, String.class, Object.class), SetsKt.e(), "request");
        Intrinsics.i(hVarF3, "moshi.adapter(Types.newP…), emptySet(), \"request\")");
        this.nullableMapOfStringNullableAnyAdapter = hVarF3;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public AutocompleteResponse fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Map<String, List<Result>> mapFromJson = null;
        String strFromJson = null;
        Map<String, Object> mapFromJson2 = null;
        String strFromJson2 = null;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                mapFromJson = this.nullableMapOfStringListOfResultAdapter.fromJson(reader);
            } else if (iZ == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (iZ == 2) {
                mapFromJson2 = this.nullableMapOfStringNullableAnyAdapter.fromJson(reader);
            } else if (iZ == 3) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.d();
        return new AutocompleteResponse(mapFromJson, strFromJson, mapFromJson2, strFromJson2);
    }

    @Override // com.squareup.moshi.h
    public void toJson(q writer, AutocompleteResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("sections");
        this.nullableMapOfStringListOfResultAdapter.toJson(writer, (q) value_.getSections());
        writer.l("result_id");
        this.nullableStringAdapter.toJson(writer, (q) value_.getResultId());
        writer.l("request");
        this.nullableMapOfStringNullableAnyAdapter.toJson(writer, (q) value_.getRequest());
        writer.l("rawData");
        this.nullableStringAdapter.toJson(writer, (q) value_.getRawData());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AutocompleteResponse");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
