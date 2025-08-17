package io.constructor.data.model.common;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lio/constructor/data/model/common/ResultJsonAdapter;", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/common/Result;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lio/constructor/data/model/common/Result;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/q;Lio/constructor/data/model/common/Result;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lio/constructor/data/model/common/ResultData;", "resultDataAdapter", "Lcom/squareup/moshi/h;", "", "nullableListOfStringAdapter", "nullableListOfResultAdapter", "", "nullableAnyAdapter", "stringAdapter", "", "nullableBooleanAdapter", "", "nullableMapOfStringBooleanAdapter", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: io.constructor.data.model.common.ResultJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<Result> {
    private final h<Object> nullableAnyAdapter;
    private final h<Boolean> nullableBooleanAdapter;
    private final h<List<Result>> nullableListOfResultAdapter;
    private final h<List<String>> nullableListOfStringAdapter;
    private final h<Map<String, Boolean>> nullableMapOfStringBooleanAdapter;
    private final k.b options;
    private final h<ResultData> resultDataAdapter;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("data", "matched_terms", "variations", "variations_map", "value", "is_slotted", "labels");
        Intrinsics.i(bVarA, "of(\"data\", \"matched_term…, \"is_slotted\", \"labels\")");
        this.options = bVarA;
        h<ResultData> hVarF = moshi.f(ResultData.class, SetsKt.e(), "data");
        Intrinsics.i(hVarF, "moshi.adapter(ResultData…      emptySet(), \"data\")");
        this.resultDataAdapter = hVarF;
        h<List<String>> hVarF2 = moshi.f(x.j(List.class, String.class), SetsKt.e(), "matchedTerms");
        Intrinsics.i(hVarF2, "moshi.adapter(Types.newP…(),\n      \"matchedTerms\")");
        this.nullableListOfStringAdapter = hVarF2;
        h<List<Result>> hVarF3 = moshi.f(x.j(List.class, Result.class), SetsKt.e(), "variations");
        Intrinsics.i(hVarF3, "moshi.adapter(Types.newP…et(),\n      \"variations\")");
        this.nullableListOfResultAdapter = hVarF3;
        h<Object> hVarF4 = moshi.f(Object.class, SetsKt.e(), "variationsMap");
        Intrinsics.i(hVarF4, "moshi.adapter(Any::class…),\n      \"variationsMap\")");
        this.nullableAnyAdapter = hVarF4;
        h<String> hVarF5 = moshi.f(String.class, SetsKt.e(), "value");
        Intrinsics.i(hVarF5, "moshi.adapter(String::cl…mptySet(),\n      \"value\")");
        this.stringAdapter = hVarF5;
        h<Boolean> hVarF6 = moshi.f(Boolean.class, SetsKt.e(), "isSlotted");
        Intrinsics.i(hVarF6, "moshi.adapter(Boolean::c… emptySet(), \"isSlotted\")");
        this.nullableBooleanAdapter = hVarF6;
        h<Map<String, Boolean>> hVarF7 = moshi.f(x.j(Map.class, String.class, Boolean.class), SetsKt.e(), "labels");
        Intrinsics.i(hVarF7, "moshi.adapter(Types.newP…e), emptySet(), \"labels\")");
        this.nullableMapOfStringBooleanAdapter = hVarF7;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public Result fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        ResultData resultDataFromJson = null;
        List<String> listFromJson = null;
        List<Result> listFromJson2 = null;
        Object objFromJson = null;
        String strFromJson = null;
        Boolean boolFromJson = null;
        Map<String, Boolean> mapFromJson = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    resultDataFromJson = this.resultDataAdapter.fromJson(reader);
                    if (resultDataFromJson == null) {
                        JsonDataException jsonDataExceptionW = c.w("data_", "data", reader);
                        Intrinsics.i(jsonDataExceptionW, "unexpectedNull(\"data_\",\n…          \"data\", reader)");
                        throw jsonDataExceptionW;
                    }
                    break;
                case 1:
                    listFromJson = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 2:
                    listFromJson2 = this.nullableListOfResultAdapter.fromJson(reader);
                    break;
                case 3:
                    objFromJson = this.nullableAnyAdapter.fromJson(reader);
                    break;
                case 4:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        JsonDataException jsonDataExceptionW2 = c.w("value__", "value", reader);
                        Intrinsics.i(jsonDataExceptionW2, "unexpectedNull(\"value__\"…         \"value\", reader)");
                        throw jsonDataExceptionW2;
                    }
                    break;
                case 5:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    mapFromJson = this.nullableMapOfStringBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.d();
        if (resultDataFromJson == null) {
            JsonDataException jsonDataExceptionO = c.o("data_", "data", reader);
            Intrinsics.i(jsonDataExceptionO, "missingProperty(\"data_\", \"data\", reader)");
            throw jsonDataExceptionO;
        }
        if (strFromJson != null) {
            return new Result(resultDataFromJson, listFromJson, listFromJson2, objFromJson, strFromJson, boolFromJson, mapFromJson);
        }
        JsonDataException jsonDataExceptionO2 = c.o("value__", "value", reader);
        Intrinsics.i(jsonDataExceptionO2, "missingProperty(\"value__\", \"value\", reader)");
        throw jsonDataExceptionO2;
    }

    @Override // com.squareup.moshi.h
    public void toJson(q writer, Result value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("data");
        this.resultDataAdapter.toJson(writer, (q) value_.getData());
        writer.l("matched_terms");
        this.nullableListOfStringAdapter.toJson(writer, (q) value_.getMatchedTerms());
        writer.l("variations");
        this.nullableListOfResultAdapter.toJson(writer, (q) value_.getVariations());
        writer.l("variations_map");
        this.nullableAnyAdapter.toJson(writer, (q) value_.getVariationsMap());
        writer.l("value");
        this.stringAdapter.toJson(writer, (q) value_.getValue());
        writer.l("is_slotted");
        this.nullableBooleanAdapter.toJson(writer, (q) value_.isSlotted());
        writer.l("labels");
        this.nullableMapOfStringBooleanAdapter.toJson(writer, (q) value_.getLabels());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Result");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
