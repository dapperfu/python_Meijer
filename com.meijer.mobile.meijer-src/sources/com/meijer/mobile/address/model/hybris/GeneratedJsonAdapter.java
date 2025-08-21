package com.meijer.mobile.address.model.hybris;

import com.google.android.libraries.places.api.model.PlaceTypes;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddressJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "stringAdapter", "Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "hybrisRegionAdapter", "Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", "hybrisCountryAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.address.model.hybris.HybrisCustomerAddressJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<HybrisCustomerAddress> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<HybrisCustomerAddress> constructorRef;
    private final h<HybrisCountry> hybrisCountryAdapter;
    private final h<HybrisRegion> hybrisRegionAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a(PreferencesHelper.PREF_ID, "title", "titleCode", "firstName", "lastName", "companyName", "line1", "line2", "town", "region", "postalCode", "phone", "email", PlaceTypes.COUNTRY, "shippingAddress", "billingAddress", "defaultAddress", "visibleInAddressBook");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), PreferencesHelper.PREF_ID);
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "line1");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.stringAdapter = hVarF2;
        h<HybrisRegion> hVarF3 = moshi.f(HybrisRegion.class, SetsKt.e(), "region");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.hybrisRegionAdapter = hVarF3;
        h<HybrisCountry> hVarF4 = moshi.f(HybrisCountry.class, SetsKt.e(), PlaceTypes.COUNTRY);
        Intrinsics.i(hVarF4, "adapter(...)");
        this.hybrisCountryAdapter = hVarF4;
        h<Boolean> hVarF5 = moshi.f(Boolean.TYPE, SetsKt.e(), "isShippingAddress");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.booleanAdapter = hVarF5;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybrisCustomerAddress fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        int i11;
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        int i12 = -1;
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        Boolean boolFromJson3 = boolFromJson2;
        Boolean boolFromJson4 = boolFromJson3;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        HybrisRegion hybrisRegionFromJson = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        HybrisCountry hybrisCountryFromJson = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        String strFromJson12 = null;
        while (reader.hasNext()) {
            String str = strFromJson;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    strFromJson = str;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -3;
                    strFromJson = str;
                case 2:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -5;
                    strFromJson = str;
                case 3:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    strFromJson = str;
                case 4:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -17;
                    strFromJson = str;
                case 5:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    strFromJson = str;
                case 6:
                    strFromJson10 = this.stringAdapter.fromJson(reader);
                    if (strFromJson10 == null) {
                        throw C14410c.w("line1", "line1", reader);
                    }
                    strFromJson = str;
                case 7:
                    strFromJson11 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -129;
                    strFromJson = str;
                case 8:
                    strFromJson12 = this.stringAdapter.fromJson(reader);
                    if (strFromJson12 == null) {
                        throw C14410c.w("town", "town", reader);
                    }
                    strFromJson = str;
                case 9:
                    hybrisRegionFromJson = this.hybrisRegionAdapter.fromJson(reader);
                    if (hybrisRegionFromJson == null) {
                        throw C14410c.w("region", "region", reader);
                    }
                    strFromJson = str;
                case 10:
                    strFromJson7 = this.stringAdapter.fromJson(reader);
                    if (strFromJson7 == null) {
                        throw C14410c.w("postalCode", "postalCode", reader);
                    }
                    strFromJson = str;
                case 11:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2049;
                    strFromJson = str;
                case 12:
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -4097;
                    strFromJson = str;
                case 13:
                    hybrisCountryFromJson = this.hybrisCountryAdapter.fromJson(reader);
                    if (hybrisCountryFromJson == null) {
                        throw C14410c.w(PlaceTypes.COUNTRY, PlaceTypes.COUNTRY, reader);
                    }
                    strFromJson = str;
                case 14:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw C14410c.w("isShippingAddress", "shippingAddress", reader);
                    }
                    i12 &= -16385;
                    strFromJson = str;
                case 15:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw C14410c.w("isBillingAddress", "billingAddress", reader);
                    }
                    i11 = -32769;
                    i12 &= i11;
                    strFromJson = str;
                case 16:
                    boolFromJson3 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson3 == null) {
                        throw C14410c.w("isDefault", "defaultAddress", reader);
                    }
                    i11 = -65537;
                    i12 &= i11;
                    strFromJson = str;
                case 17:
                    boolFromJson4 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson4 == null) {
                        throw C14410c.w("isVisibleInAddressBook", "visibleInAddressBook", reader);
                    }
                    i11 = -131073;
                    i12 &= i11;
                    strFromJson = str;
                default:
                    strFromJson = str;
            }
        }
        String str2 = strFromJson;
        reader.d();
        if (i12 == -252096) {
            if (strFromJson10 == null) {
                throw C14410c.o("line1", "line1", reader);
            }
            if (strFromJson12 == null) {
                throw C14410c.o("town", "town", reader);
            }
            if (hybrisRegionFromJson == null) {
                throw C14410c.o("region", "region", reader);
            }
            if (strFromJson7 == null) {
                throw C14410c.o("postalCode", "postalCode", reader);
            }
            if (hybrisCountryFromJson == null) {
                throw C14410c.o(PlaceTypes.COUNTRY, PlaceTypes.COUNTRY, reader);
            }
            return new HybrisCustomerAddress(str2, strFromJson2, strFromJson3, strFromJson4, strFromJson5, strFromJson6, strFromJson10, strFromJson11, strFromJson12, hybrisRegionFromJson, strFromJson7, strFromJson8, strFromJson9, hybrisCountryFromJson, boolFromJson.booleanValue(), boolFromJson2.booleanValue(), boolFromJson3.booleanValue(), boolFromJson4.booleanValue());
        }
        Constructor<HybrisCustomerAddress> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = C14410c.f134472c;
            Class cls3 = Boolean.TYPE;
            i10 = i12;
            declaredConstructor = HybrisCustomerAddress.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, HybrisRegion.class, String.class, String.class, String.class, HybrisCountry.class, cls3, cls3, cls3, cls3, cls, cls2);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        } else {
            i10 = i12;
        }
        Constructor<HybrisCustomerAddress> constructor = declaredConstructor;
        if (strFromJson10 == null) {
            throw C14410c.o("line1", "line1", reader);
        }
        if (strFromJson12 == null) {
            throw C14410c.o("town", "town", reader);
        }
        if (hybrisRegionFromJson == null) {
            throw C14410c.o("region", "region", reader);
        }
        if (strFromJson7 == null) {
            throw C14410c.o("postalCode", "postalCode", reader);
        }
        if (hybrisCountryFromJson == null) {
            throw C14410c.o(PlaceTypes.COUNTRY, PlaceTypes.COUNTRY, reader);
        }
        HybrisCustomerAddress hybrisCustomerAddressNewInstance = constructor.newInstance(str2, strFromJson2, strFromJson3, strFromJson4, strFromJson5, strFromJson6, strFromJson10, strFromJson11, strFromJson12, hybrisRegionFromJson, strFromJson7, strFromJson8, strFromJson9, hybrisCountryFromJson, boolFromJson, boolFromJson2, boolFromJson3, boolFromJson4, Integer.valueOf(i10), null);
        Intrinsics.i(hybrisCustomerAddressNewInstance, "newInstance(...)");
        return hybrisCustomerAddressNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HybrisCustomerAddress value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l(PreferencesHelper.PREF_ID);
        this.nullableStringAdapter.toJson(writer, (q) value_.getId());
        writer.l("title");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTitle());
        writer.l("titleCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTitleCode());
        writer.l("firstName");
        this.nullableStringAdapter.toJson(writer, (q) value_.getFirstName());
        writer.l("lastName");
        this.nullableStringAdapter.toJson(writer, (q) value_.getLastName());
        writer.l("companyName");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCompanyName());
        writer.l("line1");
        this.stringAdapter.toJson(writer, (q) value_.getLine1());
        writer.l("line2");
        this.nullableStringAdapter.toJson(writer, (q) value_.getLine2());
        writer.l("town");
        this.stringAdapter.toJson(writer, (q) value_.getTown());
        writer.l("region");
        this.hybrisRegionAdapter.toJson(writer, (q) value_.getRegion());
        writer.l("postalCode");
        this.stringAdapter.toJson(writer, (q) value_.getPostalCode());
        writer.l("phone");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPhone());
        writer.l("email");
        this.nullableStringAdapter.toJson(writer, (q) value_.getEmail());
        writer.l(PlaceTypes.COUNTRY);
        this.hybrisCountryAdapter.toJson(writer, (q) value_.getCountry());
        writer.l("shippingAddress");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsShippingAddress()));
        writer.l("billingAddress");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsBillingAddress()));
        writer.l("defaultAddress");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsDefault()));
        writer.l("visibleInAddressBook");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsVisibleInAddressBook()));
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HybrisCustomerAddress");
        sb2.append(')');
        return sb2.toString();
    }
}
