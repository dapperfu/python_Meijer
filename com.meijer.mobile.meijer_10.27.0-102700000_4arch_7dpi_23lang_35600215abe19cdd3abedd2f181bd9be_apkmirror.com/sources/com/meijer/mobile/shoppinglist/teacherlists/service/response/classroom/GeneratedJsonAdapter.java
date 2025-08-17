package com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "intAdapter", "Lcom/squareup/moshi/h;", "stringAdapter", "nullableStringAdapter", "nullableIntAdapter", "", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomResponse;", "listOfClassroomResponseAdapter", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom.ClassroomListResponseJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<ClassroomListResponse> {
    private final h<Integer> intAdapter;
    private final h<List<ClassroomResponse>> listOfClassroomResponseAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a(PreferencesHelper.PREF_ID, "school_name", PlaceTypes.ADDRESS, "address2", "city", "state", "zip", "lowest_grade", "highest_grade", "school_year_start", "district_id", "nces_id", "has_dress_code", "has_uniform_policy", "lists");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Integer> hVarF = moshi.f(Integer.TYPE, SetsKt.e(), PreferencesHelper.PREF_ID);
        Intrinsics.i(hVarF, "adapter(...)");
        this.intAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "schoolName");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.stringAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "secondaryAddress");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
        h<Integer> hVarF4 = moshi.f(Integer.class, SetsKt.e(), "districtId");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableIntAdapter = hVarF4;
        h<List<ClassroomResponse>> hVarF5 = moshi.f(x.j(List.class, ClassroomResponse.class), SetsKt.e(), "classroomsList");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.listOfClassroomResponseAdapter = hVarF5;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ClassroomListResponse fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        Integer numFromJson3 = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        Integer numFromJson4 = null;
        String strFromJson10 = null;
        List<ClassroomResponse> listFromJson = null;
        while (true) {
            Integer num = numFromJson;
            Integer num2 = numFromJson2;
            Integer num3 = numFromJson3;
            String str = strFromJson;
            String str2 = strFromJson2;
            String str3 = strFromJson3;
            String str4 = strFromJson4;
            String str5 = strFromJson5;
            String str6 = strFromJson6;
            String str7 = strFromJson7;
            String str8 = strFromJson8;
            String str9 = strFromJson9;
            Integer num4 = numFromJson4;
            String str10 = strFromJson10;
            if (!reader.hasNext()) {
                reader.d();
                if (num == null) {
                    throw c.o(PreferencesHelper.PREF_ID, PreferencesHelper.PREF_ID, reader);
                }
                int iIntValue = num.intValue();
                if (str == null) {
                    throw c.o("schoolName", "school_name", reader);
                }
                if (str2 == null) {
                    throw c.o(PlaceTypes.ADDRESS, PlaceTypes.ADDRESS, reader);
                }
                if (str4 == null) {
                    throw c.o("city", "city", reader);
                }
                if (str5 == null) {
                    throw c.o("state", "state", reader);
                }
                if (str6 == null) {
                    throw c.o("zip", "zip", reader);
                }
                if (str7 == null) {
                    throw c.o("lowestGrade", "lowest_grade", reader);
                }
                if (str8 == null) {
                    throw c.o("highestGrade", "highest_grade", reader);
                }
                if (str10 == null) {
                    throw c.o("ncesId", "nces_id", reader);
                }
                if (num2 == null) {
                    throw c.o("hasDressCode", "has_dress_code", reader);
                }
                int iIntValue2 = num2.intValue();
                if (num3 == null) {
                    throw c.o("hasUniformPolicy", "has_uniform_policy", reader);
                }
                int iIntValue3 = num3.intValue();
                if (listFromJson != null) {
                    return new ClassroomListResponse(iIntValue, str, str2, str3, str4, str5, str6, str7, str8, str9, num4, str10, iIntValue2, iIntValue3, listFromJson);
                }
                throw c.o("classroomsList", "lists", reader);
            }
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 0:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w(PreferencesHelper.PREF_ID, PreferencesHelper.PREF_ID, reader);
                    }
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 1:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("schoolName", "school_name", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 2:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.w(PlaceTypes.ADDRESS, PlaceTypes.ADDRESS, reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 3:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 4:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw c.w("city", "city", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 5:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw c.w("state", "state", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 6:
                    strFromJson6 = this.stringAdapter.fromJson(reader);
                    if (strFromJson6 == null) {
                        throw c.w("zip", "zip", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 7:
                    strFromJson7 = this.stringAdapter.fromJson(reader);
                    if (strFromJson7 == null) {
                        throw c.w("lowestGrade", "lowest_grade", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 8:
                    strFromJson8 = this.stringAdapter.fromJson(reader);
                    if (strFromJson8 == null) {
                        throw c.w("highestGrade", "highest_grade", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 9:
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 10:
                    numFromJson4 = this.nullableIntAdapter.fromJson(reader);
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 11:
                    strFromJson10 = this.stringAdapter.fromJson(reader);
                    if (strFromJson10 == null) {
                        throw c.w("ncesId", "nces_id", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                case 12:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw c.w("hasDressCode", "has_dress_code", reader);
                    }
                    numFromJson = num;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 13:
                    numFromJson3 = this.intAdapter.fromJson(reader);
                    if (numFromJson3 == null) {
                        throw c.w("hasUniformPolicy", "has_uniform_policy", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                case 14:
                    listFromJson = this.listOfClassroomResponseAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw c.w("classroomsList", "lists", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
                default:
                    numFromJson = num;
                    numFromJson2 = num2;
                    numFromJson3 = num3;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    numFromJson4 = num4;
                    strFromJson10 = str10;
            }
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, ClassroomListResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l(PreferencesHelper.PREF_ID);
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getId()));
        writer.l("school_name");
        this.stringAdapter.toJson(writer, (q) value_.getSchoolName());
        writer.l(PlaceTypes.ADDRESS);
        this.stringAdapter.toJson(writer, (q) value_.getAddress());
        writer.l("address2");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSecondaryAddress());
        writer.l("city");
        this.stringAdapter.toJson(writer, (q) value_.getCity());
        writer.l("state");
        this.stringAdapter.toJson(writer, (q) value_.getState());
        writer.l("zip");
        this.stringAdapter.toJson(writer, (q) value_.getZip());
        writer.l("lowest_grade");
        this.stringAdapter.toJson(writer, (q) value_.getLowestGrade());
        writer.l("highest_grade");
        this.stringAdapter.toJson(writer, (q) value_.getHighestGrade());
        writer.l("school_year_start");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSchoolYearStart());
        writer.l("district_id");
        this.nullableIntAdapter.toJson(writer, (q) value_.getDistrictId());
        writer.l("nces_id");
        this.stringAdapter.toJson(writer, (q) value_.getNcesId());
        writer.l("has_dress_code");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getHasDressCode()));
        writer.l("has_uniform_policy");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getHasUniformPolicy()));
        writer.l("lists");
        this.listOfClassroomResponseAdapter.toJson(writer, (q) value_.c());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ClassroomListResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
