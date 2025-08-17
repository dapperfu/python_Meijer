package io.constructor.data.model.purchase;

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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001a¨\u0006("}, d2 = {"Lio/constructor/data/model/purchase/PurchaseRequestBodyJsonAdapter;", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/purchase/PurchaseRequestBody;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lio/constructor/data/model/purchase/PurchaseRequestBody;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/q;Lio/constructor/data/model/purchase/PurchaseRequestBody;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lio/constructor/data/model/purchase/PurchaseItem;", "nullableListOfPurchaseItemAdapter", "Lcom/squareup/moshi/h;", "stringAdapter", "", "nullableDoubleAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "listOfNullableStringAdapter", "", "nullableMapOfStringStringAdapter", "", "nullableBooleanAdapter", "", "nullableLongAdapter", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: io.constructor.data.model.purchase.PurchaseRequestBodyJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<PurchaseRequestBody> {
    private final h<List<String>> listOfNullableStringAdapter;
    private final h<Boolean> nullableBooleanAdapter;
    private final h<Double> nullableDoubleAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<List<PurchaseItem>> nullableListOfPurchaseItemAdapter;
    private final h<Long> nullableLongAdapter;
    private final h<Map<String, String>> nullableMapOfStringStringAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("items", "order_id", "revenue", "c", "i", "s", "ui", "us", "analytics_tags", "key", "beacon", "_dt");
        Intrinsics.i(bVarA, "of(\"items\", \"order_id\", …, \"key\", \"beacon\", \"_dt\")");
        this.options = bVarA;
        h<List<PurchaseItem>> hVarF = moshi.f(x.j(List.class, PurchaseItem.class), SetsKt.e(), "items");
        Intrinsics.i(hVarF, "moshi.adapter(Types.newP…     emptySet(), \"items\")");
        this.nullableListOfPurchaseItemAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "orderId");
        Intrinsics.i(hVarF2, "moshi.adapter(String::cl…tySet(),\n      \"orderId\")");
        this.stringAdapter = hVarF2;
        h<Double> hVarF3 = moshi.f(Double.class, SetsKt.e(), "revenue");
        Intrinsics.i(hVarF3, "moshi.adapter(Double::cl…e, emptySet(), \"revenue\")");
        this.nullableDoubleAdapter = hVarF3;
        h<String> hVarF4 = moshi.f(String.class, SetsKt.e(), "c");
        Intrinsics.i(hVarF4, "moshi.adapter(String::cl…a,\n      emptySet(), \"c\")");
        this.nullableStringAdapter = hVarF4;
        h<Integer> hVarF5 = moshi.f(Integer.class, SetsKt.e(), "s");
        Intrinsics.i(hVarF5, "moshi.adapter(Int::class…e,\n      emptySet(), \"s\")");
        this.nullableIntAdapter = hVarF5;
        h<List<String>> hVarF6 = moshi.f(x.j(List.class, String.class), SetsKt.e(), "us");
        Intrinsics.i(hVarF6, "moshi.adapter(Types.newP…, emptySet(),\n      \"us\")");
        this.listOfNullableStringAdapter = hVarF6;
        h<Map<String, String>> hVarF7 = moshi.f(x.j(Map.class, String.class, String.class), SetsKt.e(), "analyticsTags");
        Intrinsics.i(hVarF7, "moshi.adapter(Types.newP…tySet(), \"analyticsTags\")");
        this.nullableMapOfStringStringAdapter = hVarF7;
        h<Boolean> hVarF8 = moshi.f(Boolean.class, SetsKt.e(), "beacon");
        Intrinsics.i(hVarF8, "moshi.adapter(Boolean::c…pe, emptySet(), \"beacon\")");
        this.nullableBooleanAdapter = hVarF8;
        h<Long> hVarF9 = moshi.f(Long.class, SetsKt.e(), "_dt");
        Intrinsics.i(hVarF9, "moshi.adapter(Long::clas…\n      emptySet(), \"_dt\")");
        this.nullableLongAdapter = hVarF9;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public PurchaseRequestBody fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        List<PurchaseItem> listFromJson = null;
        String strFromJson = null;
        Double dFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        Integer numFromJson = null;
        String strFromJson4 = null;
        List<String> listFromJson2 = null;
        Map<String, String> mapFromJson = null;
        String strFromJson5 = null;
        Boolean boolFromJson = null;
        Long lFromJson = null;
        while (true) {
            List<PurchaseItem> list = listFromJson;
            if (!reader.hasNext()) {
                String str = strFromJson;
                reader.d();
                if (str == null) {
                    JsonDataException jsonDataExceptionO = c.o("orderId", "order_id", reader);
                    Intrinsics.i(jsonDataExceptionO, "missingProperty(\"orderId\", \"order_id\", reader)");
                    throw jsonDataExceptionO;
                }
                if (listFromJson2 != null) {
                    return new PurchaseRequestBody(list, str, dFromJson, strFromJson2, strFromJson3, numFromJson, strFromJson4, listFromJson2, mapFromJson, strFromJson5, boolFromJson, lFromJson);
                }
                JsonDataException jsonDataExceptionO2 = c.o("us", "us", reader);
                Intrinsics.i(jsonDataExceptionO2, "missingProperty(\"us\", \"us\", reader)");
                throw jsonDataExceptionO2;
            }
            String str2 = strFromJson;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    strFromJson = str2;
                    listFromJson = list;
                case 0:
                    listFromJson = this.nullableListOfPurchaseItemAdapter.fromJson(reader);
                    strFromJson = str2;
                case 1:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        JsonDataException jsonDataExceptionW = c.w("orderId", "order_id", reader);
                        Intrinsics.i(jsonDataExceptionW, "unexpectedNull(\"orderId\"…      \"order_id\", reader)");
                        throw jsonDataExceptionW;
                    }
                    listFromJson = list;
                case 2:
                    dFromJson = this.nullableDoubleAdapter.fromJson(reader);
                    strFromJson = str2;
                    listFromJson = list;
                case 3:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    strFromJson = str2;
                    listFromJson = list;
                case 4:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    strFromJson = str2;
                    listFromJson = list;
                case 5:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    strFromJson = str2;
                    listFromJson = list;
                case 6:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    strFromJson = str2;
                    listFromJson = list;
                case 7:
                    listFromJson2 = this.listOfNullableStringAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        JsonDataException jsonDataExceptionW2 = c.w("us", "us", reader);
                        Intrinsics.i(jsonDataExceptionW2, "unexpectedNull(\"us\",\n            \"us\", reader)");
                        throw jsonDataExceptionW2;
                    }
                    strFromJson = str2;
                    listFromJson = list;
                case 8:
                    mapFromJson = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    strFromJson = str2;
                    listFromJson = list;
                case 9:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    strFromJson = str2;
                    listFromJson = list;
                case 10:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    strFromJson = str2;
                    listFromJson = list;
                case 11:
                    lFromJson = this.nullableLongAdapter.fromJson(reader);
                    strFromJson = str2;
                    listFromJson = list;
                default:
                    strFromJson = str2;
                    listFromJson = list;
            }
        }
    }

    @Override // com.squareup.moshi.h
    public void toJson(q writer, PurchaseRequestBody value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("items");
        this.nullableListOfPurchaseItemAdapter.toJson(writer, (q) value_.getItems());
        writer.l("order_id");
        this.stringAdapter.toJson(writer, (q) value_.getOrderId());
        writer.l("revenue");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getRevenue());
        writer.l("c");
        this.nullableStringAdapter.toJson(writer, (q) value_.getC());
        writer.l("i");
        this.nullableStringAdapter.toJson(writer, (q) value_.getI());
        writer.l("s");
        this.nullableIntAdapter.toJson(writer, (q) value_.getS());
        writer.l("ui");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUi());
        writer.l("us");
        this.listOfNullableStringAdapter.toJson(writer, (q) value_.getUs());
        writer.l("analytics_tags");
        this.nullableMapOfStringStringAdapter.toJson(writer, (q) value_.getAnalyticsTags());
        writer.l("key");
        this.nullableStringAdapter.toJson(writer, (q) value_.getKey());
        writer.l("beacon");
        this.nullableBooleanAdapter.toJson(writer, (q) value_.getBeacon());
        writer.l("_dt");
        this.nullableLongAdapter.toJson(writer, (q) value_.get_dt());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PurchaseRequestBody");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
