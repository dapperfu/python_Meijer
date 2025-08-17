package com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/AvailableItemsResponse;", "listOfAvailableItemsResponseAdapter", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/UnavailableItemsResponse;", "listOfUnavailableItemsResponseAdapter", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies.SuppliesListResponseJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<SuppliesListResponse> {
    private final h<List<AvailableItemsResponse>> listOfAvailableItemsResponseAdapter;
    private final h<List<UnavailableItemsResponse>> listOfUnavailableItemsResponseAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("class_name", "school_year", "updated_at", "school_name", "grade", "available_items", "unavailable_items");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "classroomName");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<List<AvailableItemsResponse>> hVarF2 = moshi.f(x.j(List.class, AvailableItemsResponse.class), SetsKt.e(), "availableItems");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.listOfAvailableItemsResponseAdapter = hVarF2;
        h<List<UnavailableItemsResponse>> hVarF3 = moshi.f(x.j(List.class, UnavailableItemsResponse.class), SetsKt.e(), "unavailableItems");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.listOfUnavailableItemsResponseAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SuppliesListResponse fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        List<AvailableItemsResponse> listFromJson = null;
        List<UnavailableItemsResponse> list = null;
        while (true) {
            String str = strFromJson;
            String str2 = strFromJson2;
            String str3 = strFromJson3;
            String str4 = strFromJson4;
            String str5 = strFromJson5;
            List<AvailableItemsResponse> list2 = listFromJson;
            List<UnavailableItemsResponse> list3 = list;
            if (!reader.hasNext()) {
                reader.d();
                if (str == null) {
                    throw c.o("classroomName", "class_name", reader);
                }
                if (str2 == null) {
                    throw c.o("schoolYear", "school_year", reader);
                }
                if (str3 == null) {
                    throw c.o("updatedTimestamp", "updated_at", reader);
                }
                if (str4 == null) {
                    throw c.o("schoolName", "school_name", reader);
                }
                if (str5 == null) {
                    throw c.o("gradeLevel", "grade", reader);
                }
                if (list2 == null) {
                    throw c.o("availableItems", "available_items", reader);
                }
                if (list3 != null) {
                    return new SuppliesListResponse(str, str2, str3, str4, str5, list2, list3);
                }
                throw c.o("unavailableItems", "unavailable_items", reader);
            }
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    listFromJson = list2;
                    list = list3;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("classroomName", "class_name", reader);
                    }
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    listFromJson = list2;
                    list = list3;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.w("schoolYear", "school_year", reader);
                    }
                    strFromJson = str;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    listFromJson = list2;
                    list = list3;
                case 2:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw c.w("updatedTimestamp", "updated_at", reader);
                    }
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    listFromJson = list2;
                    list = list3;
                case 3:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw c.w("schoolName", "school_name", reader);
                    }
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson5 = str5;
                    listFromJson = list2;
                    list = list3;
                case 4:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw c.w("gradeLevel", "grade", reader);
                    }
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    listFromJson = list2;
                    list = list3;
                case 5:
                    listFromJson = this.listOfAvailableItemsResponseAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw c.w("availableItems", "available_items", reader);
                    }
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    list = list3;
                case 6:
                    List<UnavailableItemsResponse> listFromJson2 = this.listOfUnavailableItemsResponseAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw c.w("unavailableItems", "unavailable_items", reader);
                    }
                    list = listFromJson2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    listFromJson = list2;
                default:
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    listFromJson = list2;
                    list = list3;
            }
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, SuppliesListResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("class_name");
        this.stringAdapter.toJson(writer, (q) value_.getClassroomName());
        writer.l("school_year");
        this.stringAdapter.toJson(writer, (q) value_.getSchoolYear());
        writer.l("updated_at");
        this.stringAdapter.toJson(writer, (q) value_.getUpdatedTimestamp());
        writer.l("school_name");
        this.stringAdapter.toJson(writer, (q) value_.getSchoolName());
        writer.l("grade");
        this.stringAdapter.toJson(writer, (q) value_.getGradeLevel());
        writer.l("available_items");
        this.listOfAvailableItemsResponseAdapter.toJson(writer, (q) value_.a());
        writer.l("unavailable_items");
        this.listOfUnavailableItemsResponseAdapter.toJson(writer, (q) value_.f());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SuppliesListResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
