package com.meijer.mobile.home.service.models.departmentcard;

import com.meijer.mobile.home.service.models.homecard.HomeCardErrorResponse;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.C14410c;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardJsonJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardJson;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardJson;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardJson;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardInfoJson;", "nullableDepartmentCardInfoJsonAdapter", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentDataJson;", "nullableDepartmentDataJsonAdapter", "nullableStringAdapter", "Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;", "nullableHomeCardErrorResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.home.service.models.departmentcard.DepartmentCardJsonJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<DepartmentCardJson> {
    private volatile Constructor<DepartmentCardJson> constructorRef;
    private final h<DepartmentCardInfoJson> nullableDepartmentCardInfoJsonAdapter;
    private final h<DepartmentDataJson> nullableDepartmentDataJsonAdapter;
    private final h<HomeCardErrorResponse> nullableHomeCardErrorResponseAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("card", "data", "type", PreferencesHelper.PREF_ID, "error");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<DepartmentCardInfoJson> hVarF = moshi.f(DepartmentCardInfoJson.class, SetsKt.e(), "card");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableDepartmentCardInfoJsonAdapter = hVarF;
        h<DepartmentDataJson> hVarF2 = moshi.f(DepartmentDataJson.class, SetsKt.e(), "data");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableDepartmentDataJsonAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "type");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
        h<HomeCardErrorResponse> hVarF4 = moshi.f(HomeCardErrorResponse.class, SetsKt.e(), "error");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableHomeCardErrorResponseAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DepartmentCardJson fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        DepartmentCardInfoJson departmentCardInfoJsonFromJson = null;
        DepartmentDataJson departmentDataJsonFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        HomeCardErrorResponse homeCardErrorResponseFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                departmentCardInfoJsonFromJson = this.nullableDepartmentCardInfoJsonAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iZ == 1) {
                departmentDataJsonFromJson = this.nullableDepartmentDataJsonAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iZ == 2) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                i10 &= -5;
            } else if (iZ == 3) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -9;
            } else if (iZ == 4) {
                homeCardErrorResponseFromJson = this.nullableHomeCardErrorResponseAdapter.fromJson(reader);
                i10 &= -17;
            }
        }
        reader.d();
        if (i10 == -32) {
            HomeCardErrorResponse homeCardErrorResponse = homeCardErrorResponseFromJson;
            String str = strFromJson2;
            return new DepartmentCardJson(departmentCardInfoJsonFromJson, departmentDataJsonFromJson, strFromJson, str, homeCardErrorResponse);
        }
        HomeCardErrorResponse homeCardErrorResponse2 = homeCardErrorResponseFromJson;
        String str2 = strFromJson2;
        String str3 = strFromJson;
        DepartmentDataJson departmentDataJson = departmentDataJsonFromJson;
        DepartmentCardInfoJson departmentCardInfoJson = departmentCardInfoJsonFromJson;
        Constructor<DepartmentCardJson> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = DepartmentCardJson.class.getDeclaredConstructor(DepartmentCardInfoJson.class, DepartmentDataJson.class, String.class, String.class, HomeCardErrorResponse.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        DepartmentCardJson departmentCardJsonNewInstance = declaredConstructor.newInstance(departmentCardInfoJson, departmentDataJson, str3, str2, homeCardErrorResponse2, Integer.valueOf(i10), null);
        Intrinsics.i(departmentCardJsonNewInstance, "newInstance(...)");
        return departmentCardJsonNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, DepartmentCardJson value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("card");
        this.nullableDepartmentCardInfoJsonAdapter.toJson(writer, (q) value_.getCard());
        writer.l("data");
        this.nullableDepartmentDataJsonAdapter.toJson(writer, (q) value_.getData());
        writer.l("type");
        this.nullableStringAdapter.toJson(writer, (q) value_.getType());
        writer.l(PreferencesHelper.PREF_ID);
        this.nullableStringAdapter.toJson(writer, (q) value_.getId());
        writer.l("error");
        this.nullableHomeCardErrorResponseAdapter.toJson(writer, (q) value_.getError());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("DepartmentCardJson");
        sb2.append(')');
        return sb2.toString();
    }
}
