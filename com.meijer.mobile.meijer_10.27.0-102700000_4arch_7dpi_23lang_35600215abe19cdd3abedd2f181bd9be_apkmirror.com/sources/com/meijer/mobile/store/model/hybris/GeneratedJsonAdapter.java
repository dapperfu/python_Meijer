package com.meijer.mobile.store.model.hybris;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.address.model.hybris.HybrisGeoPoint;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisPointOfServiceJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "intAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", "nullableHybrisStoreAddressAdapter", "", "booleanAdapter", "", "doubleAdapter", "nullableIntAdapter", "Lcom/meijer/mobile/address/model/hybris/HybrisGeoPoint;", "nullableHybrisGeoPointAdapter", "Lcom/meijer/mobile/store/model/hybris/HybrisOpeningHours;", "nullableHybrisOpeningHoursAdapter", "", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreLocatorFeature;", "listOfHybrisStoreLocatorFeatureAdapter", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreTenant;", "listOfHybrisStoreTenantAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.store.model.hybris.HybrisPointOfServiceJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<HybrisPointOfService> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<HybrisPointOfService> constructorRef;
    private final h<Double> doubleAdapter;
    private final h<Integer> intAdapter;
    private final h<List<HybrisStoreLocatorFeature>> listOfHybrisStoreLocatorFeatureAdapter;
    private final h<List<HybrisStoreTenant>> listOfHybrisStoreTenantAdapter;
    private final h<HybrisGeoPoint> nullableHybrisGeoPointAdapter;
    private final h<HybrisOpeningHours> nullableHybrisOpeningHoursAdapter;
    private final h<HybrisStoreAddress> nullableHybrisStoreAddressAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("name", "displayName", PlaceTypes.ADDRESS, "curbSideEligibility", "curbSideFee", "curbsidePartner", "mfcStoreId", "deliveryEligibility", "deliveryFee", "deliveryPartner", "geoPoint", "mobilePaymentEnabled", "mobileShoppingEnabled", "openingHours", "phone", "pickupHelpNumber", "storeDirector", "storeLocatorFeatures", "storeTenants", "alcoholDelivery", "alcoholPickup", "ebtEnabled");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Integer> hVarF = moshi.f(Integer.TYPE, SetsKt.e(), "storeId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.intAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "displayName");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
        h<HybrisStoreAddress> hVarF3 = moshi.f(HybrisStoreAddress.class, SetsKt.e(), PlaceTypes.ADDRESS);
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableHybrisStoreAddressAdapter = hVarF3;
        h<Boolean> hVarF4 = moshi.f(Boolean.TYPE, SetsKt.e(), "curbSideEligibility");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.booleanAdapter = hVarF4;
        h<Double> hVarF5 = moshi.f(Double.TYPE, SetsKt.e(), "curbSideFee");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.doubleAdapter = hVarF5;
        h<Integer> hVarF6 = moshi.f(Integer.class, SetsKt.e(), "mfcStoreId");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.nullableIntAdapter = hVarF6;
        h<HybrisGeoPoint> hVarF7 = moshi.f(HybrisGeoPoint.class, SetsKt.e(), "geoPoint");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.nullableHybrisGeoPointAdapter = hVarF7;
        h<HybrisOpeningHours> hVarF8 = moshi.f(HybrisOpeningHours.class, SetsKt.e(), "openingHours");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.nullableHybrisOpeningHoursAdapter = hVarF8;
        h<List<HybrisStoreLocatorFeature>> hVarF9 = moshi.f(x.j(List.class, HybrisStoreLocatorFeature.class), SetsKt.e(), "storeLocatorFeatures");
        Intrinsics.i(hVarF9, "adapter(...)");
        this.listOfHybrisStoreLocatorFeatureAdapter = hVarF9;
        h<List<HybrisStoreTenant>> hVarF10 = moshi.f(x.j(List.class, HybrisStoreTenant.class), SetsKt.e(), "storeTenants");
        Intrinsics.i(hVarF10, "adapter(...)");
        this.listOfHybrisStoreTenantAdapter = hVarF10;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybrisPointOfService fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        Double dValueOf = Double.valueOf(0.0d);
        reader.b();
        List<HybrisStoreLocatorFeature> listFromJson = null;
        int i11 = -1;
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        Boolean boolFromJson3 = boolFromJson2;
        Boolean boolFromJson4 = boolFromJson3;
        Boolean boolFromJson5 = boolFromJson4;
        Boolean boolFromJson6 = boolFromJson5;
        Boolean boolFromJson7 = boolFromJson6;
        Double dFromJson = dValueOf;
        Double dFromJson2 = dFromJson;
        List<HybrisStoreTenant> listFromJson2 = null;
        Integer numFromJson = null;
        String strFromJson = null;
        HybrisGeoPoint hybrisGeoPointFromJson = null;
        HybrisOpeningHours hybrisOpeningHoursFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        HybrisStoreAddress hybrisStoreAddressFromJson = null;
        String strFromJson4 = null;
        Integer numFromJson2 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    continue;
                case 0:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w("storeId", "name", reader);
                    }
                    continue;
                case 1:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    continue;
                case 2:
                    hybrisStoreAddressFromJson = this.nullableHybrisStoreAddressAdapter.fromJson(reader);
                    i11 &= -5;
                    continue;
                case 3:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw c.w("curbSideEligibility", "curbSideEligibility", reader);
                    }
                    i11 &= -9;
                    continue;
                case 4:
                    dFromJson = this.doubleAdapter.fromJson(reader);
                    if (dFromJson == null) {
                        throw c.w("curbSideFee", "curbSideFee", reader);
                    }
                    i11 &= -17;
                    continue;
                case 5:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    continue;
                case 6:
                    numFromJson2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -65;
                    continue;
                case 7:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw c.w("isEligibleForDelivery", "deliveryEligibility", reader);
                    }
                    i11 &= -129;
                    continue;
                case 8:
                    dFromJson2 = this.doubleAdapter.fromJson(reader);
                    if (dFromJson2 == null) {
                        throw c.w("deliveryFee", "deliveryFee", reader);
                    }
                    i11 &= -257;
                    continue;
                case 9:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    continue;
                case 10:
                    hybrisGeoPointFromJson = this.nullableHybrisGeoPointAdapter.fromJson(reader);
                    i11 &= -1025;
                    continue;
                case 11:
                    boolFromJson3 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson3 == null) {
                        throw c.w("isMobilePaymentEnabledEventsStrategy", "mobilePaymentEnabled", reader);
                    }
                    i11 &= -2049;
                    continue;
                case 12:
                    boolFromJson4 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson4 == null) {
                        throw c.w("isMobileShoppingEnabled", "mobileShoppingEnabled", reader);
                    }
                    i11 &= -4097;
                    continue;
                case 13:
                    hybrisOpeningHoursFromJson = this.nullableHybrisOpeningHoursAdapter.fromJson(reader);
                    i11 &= -8193;
                    continue;
                case 14:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -16385;
                    continue;
                case 15:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -32769;
                    break;
                case 16:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -65537;
                    break;
                case 17:
                    listFromJson = this.listOfHybrisStoreLocatorFeatureAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw c.w("storeLocatorFeatures", "storeLocatorFeatures", reader);
                    }
                    i10 = -131073;
                    break;
                case 18:
                    listFromJson2 = this.listOfHybrisStoreTenantAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw c.w("storeTenants", "storeTenants", reader);
                    }
                    i10 = -262145;
                    break;
                case 19:
                    boolFromJson5 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson5 == null) {
                        throw c.w("isAlcoholDeliveryEnabled", "alcoholDelivery", reader);
                    }
                    i10 = -524289;
                    break;
                case 20:
                    boolFromJson6 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson6 == null) {
                        throw c.w("isAlcoholPickupEnabled", "alcoholPickup", reader);
                    }
                    i10 = -1048577;
                    break;
                case 21:
                    boolFromJson7 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson7 == null) {
                        throw c.w("ebtEnabled", "ebtEnabled", reader);
                    }
                    i10 = -2097153;
                    break;
            }
            i11 &= i10;
        }
        reader.d();
        if (i11 == -4194303) {
            if (numFromJson == null) {
                throw c.o("storeId", "name", reader);
            }
            int iIntValue = numFromJson.intValue();
            boolean zBooleanValue = boolFromJson.booleanValue();
            double dDoubleValue = dFromJson.doubleValue();
            boolean zBooleanValue2 = boolFromJson2.booleanValue();
            double dDoubleValue2 = dFromJson2.doubleValue();
            boolean zBooleanValue3 = boolFromJson3.booleanValue();
            boolean zBooleanValue4 = boolFromJson4.booleanValue();
            Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.store.model.hybris.HybrisStoreLocatorFeature>");
            Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.store.model.hybris.HybrisStoreTenant>");
            return new HybrisPointOfService(iIntValue, strFromJson3, hybrisStoreAddressFromJson, zBooleanValue, dDoubleValue, strFromJson4, numFromJson2, zBooleanValue2, dDoubleValue2, strFromJson, hybrisGeoPointFromJson, zBooleanValue3, zBooleanValue4, hybrisOpeningHoursFromJson, strFromJson2, strFromJson5, strFromJson6, listFromJson, listFromJson2, boolFromJson5.booleanValue(), boolFromJson6.booleanValue(), boolFromJson7.booleanValue());
        }
        List<HybrisStoreTenant> list = listFromJson2;
        List<HybrisStoreLocatorFeature> list2 = listFromJson;
        Constructor<HybrisPointOfService> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = c.f134099c;
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Double.TYPE;
            declaredConstructor = HybrisPointOfService.class.getDeclaredConstructor(cls2, String.class, HybrisStoreAddress.class, cls3, cls4, String.class, Integer.class, cls3, cls4, String.class, HybrisGeoPoint.class, cls3, cls3, HybrisOpeningHours.class, String.class, String.class, String.class, List.class, List.class, cls3, cls3, cls3, cls2, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        if (numFromJson == null) {
            throw c.o("storeId", "name", reader);
        }
        HybrisPointOfService hybrisPointOfServiceNewInstance = declaredConstructor.newInstance(numFromJson, strFromJson3, hybrisStoreAddressFromJson, boolFromJson, dFromJson, strFromJson4, numFromJson2, boolFromJson2, dFromJson2, strFromJson, hybrisGeoPointFromJson, boolFromJson3, boolFromJson4, hybrisOpeningHoursFromJson, strFromJson2, strFromJson5, strFromJson6, list2, list, boolFromJson5, boolFromJson6, boolFromJson7, Integer.valueOf(i11), null);
        Intrinsics.i(hybrisPointOfServiceNewInstance, "newInstance(...)");
        return hybrisPointOfServiceNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HybrisPointOfService value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("name");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getStoreId()));
        writer.l("displayName");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDisplayName());
        writer.l(PlaceTypes.ADDRESS);
        this.nullableHybrisStoreAddressAdapter.toJson(writer, (q) value_.getAddress());
        writer.l("curbSideEligibility");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getCurbSideEligibility()));
        writer.l("curbSideFee");
        this.doubleAdapter.toJson(writer, (q) Double.valueOf(value_.getCurbSideFee()));
        writer.l("curbsidePartner");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsidePartner());
        writer.l("mfcStoreId");
        this.nullableIntAdapter.toJson(writer, (q) value_.getMfcStoreId());
        writer.l("deliveryEligibility");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsEligibleForDelivery()));
        writer.l("deliveryFee");
        this.doubleAdapter.toJson(writer, (q) Double.valueOf(value_.getDeliveryFee()));
        writer.l("deliveryPartner");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDeliveryPartner());
        writer.l("geoPoint");
        this.nullableHybrisGeoPointAdapter.toJson(writer, (q) value_.getGeoPoint());
        writer.l("mobilePaymentEnabled");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsMobilePaymentEnabledEventsStrategy()));
        writer.l("mobileShoppingEnabled");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsMobileShoppingEnabled()));
        writer.l("openingHours");
        this.nullableHybrisOpeningHoursAdapter.toJson(writer, (q) value_.getOpeningHours());
        writer.l("phone");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPhone());
        writer.l("pickupHelpNumber");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPickupHelpNumber());
        writer.l("storeDirector");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreDirector());
        writer.l("storeLocatorFeatures");
        this.listOfHybrisStoreLocatorFeatureAdapter.toJson(writer, (q) value_.p());
        writer.l("storeTenants");
        this.listOfHybrisStoreTenantAdapter.toJson(writer, (q) value_.q());
        writer.l("alcoholDelivery");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsAlcoholDeliveryEnabled()));
        writer.l("alcoholPickup");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsAlcoholPickupEnabled()));
        writer.l("ebtEnabled");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getEbtEnabled()));
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HybrisPointOfService");
        sb2.append(')');
        return sb2.toString();
    }
}
