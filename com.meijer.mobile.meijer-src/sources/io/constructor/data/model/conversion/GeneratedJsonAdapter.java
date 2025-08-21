package io.constructor.data.model.conversion;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.C14410c;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lio/constructor/data/model/conversion/ConversionRequestBodyJsonAdapter;", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/conversion/ConversionRequestBody;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lio/constructor/data/model/conversion/ConversionRequestBody;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/q;Lio/constructor/data/model/conversion/ConversionRequestBody;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "intAdapter", "", "listOfNullableStringAdapter", "", "nullableMapOfStringStringAdapter", "", "nullableLongAdapter", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: io.constructor.data.model.conversion.ConversionRequestBodyJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<ConversionRequestBody> {
    private final h<Integer> intAdapter;
    private final h<List<String>> listOfNullableStringAdapter;
    private final h<Boolean> nullableBooleanAdapter;
    private final h<Long> nullableLongAdapter;
    private final h<Map<String, String>> nullableMapOfStringStringAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("search_term", "item_id", "variation_id", "item_name", "revenue", "type", "is_custom_type", "display_name", "c", "i", "s", "key", "ui", "us", "analytics_tags", "beacon", "section", "_dt");
        Intrinsics.i(bVarA, "of(\"search_term\", \"item_…eacon\", \"section\", \"_dt\")");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "searchTerm");
        Intrinsics.i(hVarF, "moshi.adapter(String::cl…et(),\n      \"searchTerm\")");
        this.stringAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "variationId");
        Intrinsics.i(hVarF2, "moshi.adapter(String::cl…mptySet(), \"variationId\")");
        this.nullableStringAdapter = hVarF2;
        h<Boolean> hVarF3 = moshi.f(Boolean.class, SetsKt.e(), "isCustomType");
        Intrinsics.i(hVarF3, "moshi.adapter(Boolean::c…ptySet(), \"isCustomType\")");
        this.nullableBooleanAdapter = hVarF3;
        h<Integer> hVarF4 = moshi.f(Integer.TYPE, SetsKt.e(), "s");
        Intrinsics.i(hVarF4, "moshi.adapter(Int::class.java, emptySet(), \"s\")");
        this.intAdapter = hVarF4;
        h<List<String>> hVarF5 = moshi.f(x.j(List.class, String.class), SetsKt.e(), "us");
        Intrinsics.i(hVarF5, "moshi.adapter(Types.newP…, emptySet(),\n      \"us\")");
        this.listOfNullableStringAdapter = hVarF5;
        h<Map<String, String>> hVarF6 = moshi.f(x.j(Map.class, String.class, String.class), SetsKt.e(), "analyticsTags");
        Intrinsics.i(hVarF6, "moshi.adapter(Types.newP…tySet(), \"analyticsTags\")");
        this.nullableMapOfStringStringAdapter = hVarF6;
        h<Long> hVarF7 = moshi.f(Long.class, SetsKt.e(), "_dt");
        Intrinsics.i(hVarF7, "moshi.adapter(Long::clas…\n      emptySet(), \"_dt\")");
        this.nullableLongAdapter = hVarF7;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public ConversionRequestBody fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Integer numFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        Boolean boolFromJson = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        List<String> listFromJson = null;
        Map<String, String> mapFromJson = null;
        Boolean boolFromJson2 = null;
        String strFromJson12 = null;
        Long lFromJson = null;
        while (true) {
            Integer num = numFromJson;
            String str = strFromJson;
            String str2 = strFromJson2;
            String str3 = strFromJson3;
            String str4 = strFromJson4;
            String str5 = strFromJson5;
            String str6 = strFromJson6;
            Boolean bool = boolFromJson;
            String str7 = strFromJson7;
            String str8 = strFromJson8;
            if (!reader.hasNext()) {
                String str9 = strFromJson9;
                reader.d();
                if (str == null) {
                    JsonDataException jsonDataExceptionO = C14410c.o("searchTerm", "search_term", reader);
                    Intrinsics.i(jsonDataExceptionO, "missingProperty(\"searchT…\", \"search_term\", reader)");
                    throw jsonDataExceptionO;
                }
                if (str2 == null) {
                    JsonDataException jsonDataExceptionO2 = C14410c.o("itemID", "item_id", reader);
                    Intrinsics.i(jsonDataExceptionO2, "missingProperty(\"itemID\", \"item_id\", reader)");
                    throw jsonDataExceptionO2;
                }
                if (str4 == null) {
                    JsonDataException jsonDataExceptionO3 = C14410c.o("itemName", "item_name", reader);
                    Intrinsics.i(jsonDataExceptionO3, "missingProperty(\"itemName\", \"item_name\", reader)");
                    throw jsonDataExceptionO3;
                }
                if (str5 == null) {
                    JsonDataException jsonDataExceptionO4 = C14410c.o("revenue", "revenue", reader);
                    Intrinsics.i(jsonDataExceptionO4, "missingProperty(\"revenue\", \"revenue\", reader)");
                    throw jsonDataExceptionO4;
                }
                if (str8 == null) {
                    JsonDataException jsonDataExceptionO5 = C14410c.o("c", "c", reader);
                    Intrinsics.i(jsonDataExceptionO5, "missingProperty(\"c\", \"c\", reader)");
                    throw jsonDataExceptionO5;
                }
                if (str9 == null) {
                    JsonDataException jsonDataExceptionO6 = C14410c.o("i", "i", reader);
                    Intrinsics.i(jsonDataExceptionO6, "missingProperty(\"i\", \"i\", reader)");
                    throw jsonDataExceptionO6;
                }
                if (num == null) {
                    JsonDataException jsonDataExceptionO7 = C14410c.o("s", "s", reader);
                    Intrinsics.i(jsonDataExceptionO7, "missingProperty(\"s\", \"s\", reader)");
                    throw jsonDataExceptionO7;
                }
                int iIntValue = num.intValue();
                if (strFromJson10 == null) {
                    JsonDataException jsonDataExceptionO8 = C14410c.o("key", "key", reader);
                    Intrinsics.i(jsonDataExceptionO8, "missingProperty(\"key\", \"key\", reader)");
                    throw jsonDataExceptionO8;
                }
                if (listFromJson != null) {
                    return new ConversionRequestBody(str, str2, str3, str4, str5, str6, bool, str7, str8, str9, iIntValue, strFromJson10, strFromJson11, listFromJson, mapFromJson, boolFromJson2, strFromJson12, lFromJson);
                }
                JsonDataException jsonDataExceptionO9 = C14410c.o("us", "us", reader);
                Intrinsics.i(jsonDataExceptionO9, "missingProperty(\"us\", \"us\", reader)");
                throw jsonDataExceptionO9;
            }
            String str10 = strFromJson9;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        JsonDataException jsonDataExceptionW = C14410c.w("searchTerm", "search_term", reader);
                        Intrinsics.i(jsonDataExceptionW, "unexpectedNull(\"searchTe…   \"search_term\", reader)");
                        throw jsonDataExceptionW;
                    }
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        JsonDataException jsonDataExceptionW2 = C14410c.w("itemID", "item_id", reader);
                        Intrinsics.i(jsonDataExceptionW2, "unexpectedNull(\"itemID\",…       \"item_id\", reader)");
                        throw jsonDataExceptionW2;
                    }
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 2:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 3:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        JsonDataException jsonDataExceptionW3 = C14410c.w("itemName", "item_name", reader);
                        Intrinsics.i(jsonDataExceptionW3, "unexpectedNull(\"itemName…     \"item_name\", reader)");
                        throw jsonDataExceptionW3;
                    }
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 4:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        JsonDataException jsonDataExceptionW4 = C14410c.w("revenue", "revenue", reader);
                        Intrinsics.i(jsonDataExceptionW4, "unexpectedNull(\"revenue\"…       \"revenue\", reader)");
                        throw jsonDataExceptionW4;
                    }
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 5:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 6:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 7:
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson8 = str8;
                case 8:
                    strFromJson8 = this.stringAdapter.fromJson(reader);
                    if (strFromJson8 == null) {
                        JsonDataException jsonDataExceptionW5 = C14410c.w("c", "c", reader);
                        Intrinsics.i(jsonDataExceptionW5, "unexpectedNull(\"c\", \"c\", reader)");
                        throw jsonDataExceptionW5;
                    }
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                case 9:
                    strFromJson9 = this.stringAdapter.fromJson(reader);
                    if (strFromJson9 == null) {
                        JsonDataException jsonDataExceptionW6 = C14410c.w("i", "i", reader);
                        Intrinsics.i(jsonDataExceptionW6, "unexpectedNull(\"i\", \"i\", reader)");
                        throw jsonDataExceptionW6;
                    }
                    numFromJson = num;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 10:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        JsonDataException jsonDataExceptionW7 = C14410c.w("s", "s", reader);
                        Intrinsics.i(jsonDataExceptionW7, "unexpectedNull(\"s\", \"s\", reader)");
                        throw jsonDataExceptionW7;
                    }
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 11:
                    strFromJson10 = this.stringAdapter.fromJson(reader);
                    if (strFromJson10 == null) {
                        JsonDataException jsonDataExceptionW8 = C14410c.w("key", "key", reader);
                        Intrinsics.i(jsonDataExceptionW8, "unexpectedNull(\"key\", \"key\",\n            reader)");
                        throw jsonDataExceptionW8;
                    }
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 12:
                    strFromJson11 = this.nullableStringAdapter.fromJson(reader);
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 13:
                    listFromJson = this.listOfNullableStringAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        JsonDataException jsonDataExceptionW9 = C14410c.w("us", "us", reader);
                        Intrinsics.i(jsonDataExceptionW9, "unexpectedNull(\"us\",\n            \"us\", reader)");
                        throw jsonDataExceptionW9;
                    }
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 14:
                    mapFromJson = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 15:
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 16:
                    strFromJson12 = this.nullableStringAdapter.fromJson(reader);
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                case 17:
                    lFromJson = this.nullableLongAdapter.fromJson(reader);
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                default:
                    numFromJson = num;
                    strFromJson9 = str10;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson = bool;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.h
    public void toJson(q writer, ConversionRequestBody value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("search_term");
        this.stringAdapter.toJson(writer, (q) value_.getSearchTerm());
        writer.l("item_id");
        this.stringAdapter.toJson(writer, (q) value_.getItemID());
        writer.l("variation_id");
        this.nullableStringAdapter.toJson(writer, (q) value_.getVariationId());
        writer.l("item_name");
        this.stringAdapter.toJson(writer, (q) value_.getItemName());
        writer.l("revenue");
        this.stringAdapter.toJson(writer, (q) value_.getRevenue());
        writer.l("type");
        this.nullableStringAdapter.toJson(writer, (q) value_.getConversionType());
        writer.l("is_custom_type");
        this.nullableBooleanAdapter.toJson(writer, (q) value_.isCustomType());
        writer.l("display_name");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDisplayName());
        writer.l("c");
        this.stringAdapter.toJson(writer, (q) value_.getC());
        writer.l("i");
        this.stringAdapter.toJson(writer, (q) value_.getI());
        writer.l("s");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getS()));
        writer.l("key");
        this.stringAdapter.toJson(writer, (q) value_.getKey());
        writer.l("ui");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUi());
        writer.l("us");
        this.listOfNullableStringAdapter.toJson(writer, (q) value_.getUs());
        writer.l("analytics_tags");
        this.nullableMapOfStringStringAdapter.toJson(writer, (q) value_.getAnalyticsTags());
        writer.l("beacon");
        this.nullableBooleanAdapter.toJson(writer, (q) value_.getBeacon());
        writer.l("section");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSection());
        writer.l("_dt");
        this.nullableLongAdapter.toJson(writer, (q) value_.get_dt());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ConversionRequestBody");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
