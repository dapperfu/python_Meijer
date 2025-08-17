package com.meijer.mobile.shoppinglist.teacherlists.service.response.school;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.c;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "intAdapter", "Lcom/squareup/moshi/h;", "stringAdapter", "nullableStringAdapter", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.service.response.school.SchoolResponseJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<SchoolResponse> {
    private volatile Constructor<SchoolResponse> constructorRef;
    private final h<Integer> intAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a(PreferencesHelper.PREF_ID, "school_name", PlaceTypes.ADDRESS, "address2", "city", "state", "zip", "lowest_grade", "highest_grade", "school_year_start", "district_id", "nces_id", "has_dress_code", "has_uniform_policy");
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
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SchoolResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        Integer numFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        Integer numFromJson2 = null;
        String strFromJson10 = null;
        Integer numFromJson3 = null;
        Integer numFromJson4 = null;
        while (true) {
            Integer num = numFromJson;
            String str2 = strFromJson;
            String str3 = strFromJson2;
            String str4 = strFromJson3;
            if (!reader.hasNext()) {
                String str5 = strFromJson4;
                reader.d();
                if (i10 == -12673) {
                    if (num == null) {
                        throw c.o(PreferencesHelper.PREF_ID, PreferencesHelper.PREF_ID, reader);
                    }
                    int iIntValue = num.intValue();
                    if (str2 == null) {
                        throw c.o("schoolName", "school_name", reader);
                    }
                    if (str3 == null) {
                        throw c.o(PlaceTypes.ADDRESS, PlaceTypes.ADDRESS, reader);
                    }
                    if (str5 == null) {
                        throw c.o("city", "city", reader);
                    }
                    if (strFromJson5 == null) {
                        throw c.o("state", "state", reader);
                    }
                    if (strFromJson6 == null) {
                        throw c.o("zip", "zip", reader);
                    }
                    return new SchoolResponse(iIntValue, str2, str3, str4, str5, strFromJson5, strFromJson6, strFromJson7, strFromJson8, strFromJson9, numFromJson2, strFromJson10, numFromJson3, numFromJson4);
                }
                int i11 = i10;
                Constructor<SchoolResponse> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class<?> cls = c.f134099c;
                    Class cls2 = Integer.TYPE;
                    Class[] clsArr = {cls2, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class, Integer.class, cls2, cls};
                    str = str4;
                    declaredConstructor = SchoolResponse.class.getDeclaredConstructor(clsArr);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.i(declaredConstructor, "also(...)");
                } else {
                    str = str4;
                }
                if (num == null) {
                    throw c.o(PreferencesHelper.PREF_ID, PreferencesHelper.PREF_ID, reader);
                }
                if (str2 == null) {
                    throw c.o("schoolName", "school_name", reader);
                }
                if (str3 == null) {
                    throw c.o(PlaceTypes.ADDRESS, PlaceTypes.ADDRESS, reader);
                }
                if (str5 == null) {
                    throw c.o("city", "city", reader);
                }
                if (strFromJson5 == null) {
                    throw c.o("state", "state", reader);
                }
                if (strFromJson6 == null) {
                    throw c.o("zip", "zip", reader);
                }
                String str6 = str;
                SchoolResponse schoolResponseNewInstance = declaredConstructor.newInstance(num, str2, str3, str6, str5, strFromJson5, strFromJson6, strFromJson7, strFromJson8, strFromJson9, numFromJson2, strFromJson10, numFromJson3, numFromJson4, Integer.valueOf(i11), null);
                Intrinsics.i(schoolResponseNewInstance, "newInstance(...)");
                return schoolResponseNewInstance;
            }
            String str7 = strFromJson4;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 0:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w(PreferencesHelper.PREF_ID, PreferencesHelper.PREF_ID, reader);
                    }
                    strFromJson4 = str7;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 1:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("schoolName", "school_name", reader);
                    }
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 2:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.w(PlaceTypes.ADDRESS, PlaceTypes.ADDRESS, reader);
                    }
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson3 = str4;
                case 3:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                case 4:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw c.w("city", "city", reader);
                    }
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 5:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw c.w("state", "state", reader);
                    }
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 6:
                    strFromJson6 = this.stringAdapter.fromJson(reader);
                    if (strFromJson6 == null) {
                        throw c.w("zip", "zip", reader);
                    }
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 7:
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -129;
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 8:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -257;
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 9:
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 10:
                    numFromJson2 = this.nullableIntAdapter.fromJson(reader);
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 11:
                    strFromJson10 = this.nullableStringAdapter.fromJson(reader);
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 12:
                    numFromJson3 = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -4097;
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                case 13:
                    numFromJson4 = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -8193;
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                default:
                    strFromJson4 = str7;
                    numFromJson = num;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
            }
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, SchoolResponse value_) throws IOException {
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
        this.nullableStringAdapter.toJson(writer, (q) value_.getLowestGrade());
        writer.l("highest_grade");
        this.nullableStringAdapter.toJson(writer, (q) value_.getHighestGrade());
        writer.l("school_year_start");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSchoolYearStart());
        writer.l("district_id");
        this.nullableIntAdapter.toJson(writer, (q) value_.getDistrictId());
        writer.l("nces_id");
        this.nullableStringAdapter.toJson(writer, (q) value_.getNcesId());
        writer.l("has_dress_code");
        this.nullableIntAdapter.toJson(writer, (q) value_.getHasDressCode());
        writer.l("has_uniform_policy");
        this.nullableIntAdapter.toJson(writer, (q) value_.getHasUniformPolicy());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SchoolResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
