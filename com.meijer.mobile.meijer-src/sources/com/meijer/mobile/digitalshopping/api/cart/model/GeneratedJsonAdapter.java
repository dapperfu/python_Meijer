package com.meijer.mobile.digitalshopping.api.cart.model;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOmsResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOmsResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOmsResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOmsResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "nullableFacilityAdapter", "Lcom/squareup/moshi/h;", "", "booleanAdapter", "stringAdapter", "", "Lcom/meijer/mobile/digitalshopping/api/cart/model/SupplementalEligibilityOmsResponse;", "nullableListOfSupplementalEligibilityOmsResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.digitalshopping.api.cart.model.AvailablePartnerStoreLocationOmsResponseJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<AvailablePartnerStoreLocationOmsResponse> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<AvailablePartnerStoreLocationOmsResponse> constructorRef;
    private final h<Facility> nullableFacilityAdapter;
    private final h<List<SupplementalEligibilityOmsResponse>> nullableListOfSupplementalEligibilityOmsResponseAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("facility", "addressAllowsAlcohol", "partnerEligibility", "supplementalEligibility");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Facility> hVarF = moshi.f(Facility.class, SetsKt.e(), "facility");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableFacilityAdapter = hVarF;
        h<Boolean> hVarF2 = moshi.f(Boolean.TYPE, SetsKt.e(), "addressAllowsAlcohol");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.booleanAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "partnerEligibility");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.stringAdapter = hVarF3;
        h<List<SupplementalEligibilityOmsResponse>> hVarF4 = moshi.f(x.j(List.class, SupplementalEligibilityOmsResponse.class), SetsKt.e(), "supplementalEligibility");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableListOfSupplementalEligibilityOmsResponseAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AvailablePartnerStoreLocationOmsResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        Boolean boolFromJson = bool;
        Facility facilityFromJson = null;
        String strFromJson = null;
        List<SupplementalEligibilityOmsResponse> listFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                facilityFromJson = this.nullableFacilityAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iZ == 1) {
                boolFromJson = this.booleanAdapter.fromJson(reader);
                if (boolFromJson == null) {
                    throw C14410c.w("addressAllowsAlcohol", "addressAllowsAlcohol", reader);
                }
                i10 &= -3;
            } else if (iZ == 2) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw C14410c.w("partnerEligibility", "partnerEligibility", reader);
                }
                i10 &= -5;
            } else if (iZ == 3) {
                listFromJson = this.nullableListOfSupplementalEligibilityOmsResponseAdapter.fromJson(reader);
                i10 &= -9;
            }
        }
        reader.d();
        if (i10 == -16) {
            boolean zBooleanValue = boolFromJson.booleanValue();
            Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
            return new AvailablePartnerStoreLocationOmsResponse(facilityFromJson, zBooleanValue, strFromJson, listFromJson);
        }
        Constructor<AvailablePartnerStoreLocationOmsResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = AvailablePartnerStoreLocationOmsResponse.class.getDeclaredConstructor(Facility.class, Boolean.TYPE, String.class, List.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        AvailablePartnerStoreLocationOmsResponse availablePartnerStoreLocationOmsResponseNewInstance = declaredConstructor.newInstance(facilityFromJson, boolFromJson, strFromJson, listFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(availablePartnerStoreLocationOmsResponseNewInstance, "newInstance(...)");
        return availablePartnerStoreLocationOmsResponseNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, AvailablePartnerStoreLocationOmsResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("facility");
        this.nullableFacilityAdapter.toJson(writer, (q) value_.getFacility());
        writer.l("addressAllowsAlcohol");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getAddressAllowsAlcohol()));
        writer.l("partnerEligibility");
        this.stringAdapter.toJson(writer, (q) value_.getPartnerEligibility());
        writer.l("supplementalEligibility");
        this.nullableListOfSupplementalEligibilityOmsResponseAdapter.toJson(writer, (q) value_.d());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AvailablePartnerStoreLocationOmsResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
