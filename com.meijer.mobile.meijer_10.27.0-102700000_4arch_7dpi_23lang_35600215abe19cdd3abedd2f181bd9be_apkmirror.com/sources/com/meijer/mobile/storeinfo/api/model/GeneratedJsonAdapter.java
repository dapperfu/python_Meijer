package com.meijer.mobile.storeinfo.api.model;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
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

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001aR\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/StoreJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/storeinfo/api/model/Store;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/storeinfo/api/model/Store;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/storeinfo/api/model/Store;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lcom/meijer/mobile/storeinfo/api/model/FulfillmentInfo;", "listOfFulfillmentInfoAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;", "nullableAuxUnitInfoAdapter", "Lcom/meijer/mobile/storeinfo/api/model/GasStationAmenities;", "nullableListOfGasStationAmenitiesAdapter", "Lcom/meijer/mobile/storeinfo/api/model/GasStationHours;", "nullableListOfGasStationHoursAdapter", "Lcom/meijer/mobile/storeinfo/api/model/FuelPrices;", "nullableListOfFuelPricesAdapter", "", "intAdapter", "", "nullableDoubleAdapter", "", "nullableBooleanAdapter", "Lcom/meijer/mobile/storeinfo/api/model/Tenants;", "listOfTenantsAdapter", "Lcom/meijer/mobile/storeinfo/api/model/MarketAndRegions;", "nullableMarketAndRegionsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.storeinfo.api.model.StoreJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<Store> {
    private volatile Constructor<Store> constructorRef;
    private final h<Integer> intAdapter;
    private final h<List<FulfillmentInfo>> listOfFulfillmentInfoAdapter;
    private final h<List<Tenants>> listOfTenantsAdapter;
    private final h<AuxUnitInfo> nullableAuxUnitInfoAdapter;
    private final h<Boolean> nullableBooleanAdapter;
    private final h<Double> nullableDoubleAdapter;
    private final h<List<FuelPrices>> nullableListOfFuelPricesAdapter;
    private final h<List<GasStationAmenities>> nullableListOfGasStationAmenitiesAdapter;
    private final h<List<GasStationHours>> nullableListOfGasStationHoursAdapter;
    private final h<MarketAndRegions> nullableMarketAndRegionsAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("FulfillmentInfo", "MfcUnitId", "AuxUnitInfo", "GasStationAmenities", "GasStationHours", "FuelPrices", "StoreFlag", "IsMobileShoppingEnabled", "IsMobilePaymentEnabled", "UnitId", "MilesFrom", "Address", "City", "State", "Zip", "UnitType", "OpenDate", "CloseDate", "PhoneNumber", "Name", "DriveThru", "Clinic", "PharmDailyOpen", "PharmDailyClose", "PharmSatOpen", "PharmSatClose", "PharmSunOpen", "PharmSunClose", "PharmHolidayOpen", "PharmHolidayClose", "PharmDriveThruWeekdayOpen", "PharmDriveThruWeekdayClose", "PharmDriveThruSatOpen", "PharmDriveThruSatClose", "PharmDriveThruSunOpen", "PharmDriveThruSunClose", "PharmTimezone", "PharmAddress", "PharmPhone", "StoreDirName", "StoreDirEmpId", "Latitude", "Longitude", "StoreHours", "StoreWeekdayOpen", "StoreWeekdayClose", "StoreSatOpen", "StoreSatClose", "StoreSunOpen", "StoreSunClose", "PreOrderServiceAllow", "PreOrderPhone", "PreOrderDriveThru", "CurbsideAllow", "CurbsidePhone", "CurbsideDriveThru", "CurbsideWeekdayOpen", "CurbsideWeekdayClose", "CurbsideSatOpen", "CurbsideSatClose", "CurbsideSunOpen", "CurbsideSunClose", "CurbsideHolidayOpen", "CurbsideHolidayClose", "CurbsideInstoreAllow", "PreOrderInstoreAllow", "PreOrderWeekdayOpen", "PreOrderWeekdayClose", "PreOrderSatOpen", "PreOrderSatClose", "PreOrderSunOpen", "PreOrderSunClose", "PreOrderHolidayOpen", "PreOrderHolidayClose", "Tenants", "TimeZone", "DaylightSavings", "Vpos", "VisibleDate", "CNCPickupDescription", "SPOPickupDescription", "Latitude_Rad", "Longitude_Rad", "MarketAndRegion");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<List<FulfillmentInfo>> hVarF = moshi.f(x.j(List.class, FulfillmentInfo.class), SetsKt.e(), "fulfillmentInfo");
        Intrinsics.i(hVarF, "adapter(...)");
        this.listOfFulfillmentInfoAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "mfcUnitId");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
        h<AuxUnitInfo> hVarF3 = moshi.f(AuxUnitInfo.class, SetsKt.e(), "auxUnitInfo");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableAuxUnitInfoAdapter = hVarF3;
        h<List<GasStationAmenities>> hVarF4 = moshi.f(x.j(List.class, GasStationAmenities.class), SetsKt.e(), "gasStationAmenities");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableListOfGasStationAmenitiesAdapter = hVarF4;
        h<List<GasStationHours>> hVarF5 = moshi.f(x.j(List.class, GasStationHours.class), SetsKt.e(), "gasStationHours");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableListOfGasStationHoursAdapter = hVarF5;
        h<List<FuelPrices>> hVarF6 = moshi.f(x.j(List.class, FuelPrices.class), SetsKt.e(), "fuelPrices");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.nullableListOfFuelPricesAdapter = hVarF6;
        h<Integer> hVarF7 = moshi.f(Integer.TYPE, SetsKt.e(), "storeId");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.intAdapter = hVarF7;
        h<Double> hVarF8 = moshi.f(Double.class, SetsKt.e(), "milesFrom");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.nullableDoubleAdapter = hVarF8;
        h<Boolean> hVarF9 = moshi.f(Boolean.class, SetsKt.e(), "driveThru");
        Intrinsics.i(hVarF9, "adapter(...)");
        this.nullableBooleanAdapter = hVarF9;
        h<List<Tenants>> hVarF10 = moshi.f(x.j(List.class, Tenants.class), SetsKt.e(), "tenants");
        Intrinsics.i(hVarF10, "adapter(...)");
        this.listOfTenantsAdapter = hVarF10;
        h<MarketAndRegions> hVarF11 = moshi.f(MarketAndRegions.class, SetsKt.e(), "marketAndRegions");
        Intrinsics.i(hVarF11, "adapter(...)");
        this.nullableMarketAndRegionsAdapter = hVarF11;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Store fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        int i11;
        Intrinsics.j(reader, "reader");
        reader.b();
        List<Tenants> listFromJson = null;
        int i12 = -1;
        Integer numFromJson = 0;
        List<FulfillmentInfo> listFromJson2 = null;
        Double dFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        AuxUnitInfo auxUnitInfoFromJson = null;
        List<GasStationAmenities> listFromJson3 = null;
        List<GasStationHours> listFromJson4 = null;
        List<FuelPrices> listFromJson5 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        String strFromJson12 = null;
        String strFromJson13 = null;
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        String strFromJson14 = null;
        String strFromJson15 = null;
        String strFromJson16 = null;
        String strFromJson17 = null;
        String strFromJson18 = null;
        String strFromJson19 = null;
        String strFromJson20 = null;
        String strFromJson21 = null;
        String strFromJson22 = null;
        String strFromJson23 = null;
        String strFromJson24 = null;
        String strFromJson25 = null;
        String strFromJson26 = null;
        String strFromJson27 = null;
        String strFromJson28 = null;
        String strFromJson29 = null;
        String strFromJson30 = null;
        String strFromJson31 = null;
        String strFromJson32 = null;
        Double dFromJson2 = null;
        Double dFromJson3 = null;
        String strFromJson33 = null;
        String strFromJson34 = null;
        String strFromJson35 = null;
        String strFromJson36 = null;
        String strFromJson37 = null;
        String strFromJson38 = null;
        String strFromJson39 = null;
        String strFromJson40 = null;
        String strFromJson41 = null;
        String strFromJson42 = null;
        String strFromJson43 = null;
        String strFromJson44 = null;
        String strFromJson45 = null;
        String strFromJson46 = null;
        String strFromJson47 = null;
        String strFromJson48 = null;
        String strFromJson49 = null;
        String strFromJson50 = null;
        String strFromJson51 = null;
        String strFromJson52 = null;
        String strFromJson53 = null;
        String strFromJson54 = null;
        String strFromJson55 = null;
        String strFromJson56 = null;
        String strFromJson57 = null;
        String strFromJson58 = null;
        String strFromJson59 = null;
        String strFromJson60 = null;
        String strFromJson61 = null;
        String strFromJson62 = null;
        String strFromJson63 = null;
        String strFromJson64 = null;
        String strFromJson65 = null;
        String strFromJson66 = null;
        String strFromJson67 = null;
        String strFromJson68 = null;
        String strFromJson69 = null;
        Double dFromJson4 = null;
        Double dFromJson5 = null;
        MarketAndRegions marketAndRegionsFromJson = null;
        int i13 = -1;
        int i14 = -1;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                case 0:
                    listFromJson2 = this.listOfFulfillmentInfoAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw c.w("fulfillmentInfo", "FulfillmentInfo", reader);
                    }
                    i12 &= -2;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -3;
                case 2:
                    auxUnitInfoFromJson = this.nullableAuxUnitInfoAdapter.fromJson(reader);
                    i12 &= -5;
                case 3:
                    listFromJson3 = this.nullableListOfGasStationAmenitiesAdapter.fromJson(reader);
                    i12 &= -9;
                case 4:
                    listFromJson4 = this.nullableListOfGasStationHoursAdapter.fromJson(reader);
                    i12 &= -17;
                case 5:
                    listFromJson5 = this.nullableListOfFuelPricesAdapter.fromJson(reader);
                    i12 &= -33;
                case 6:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -65;
                case 7:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -129;
                case 8:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                case 9:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w("storeId", "UnitId", reader);
                    }
                    i12 &= -513;
                case 10:
                    dFromJson = this.nullableDoubleAdapter.fromJson(reader);
                    i12 &= -1025;
                case 11:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2049;
                case 12:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -4097;
                case 13:
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -8193;
                case 14:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -16385;
                case 15:
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -32769;
                case 16:
                    strFromJson10 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -65537;
                case 17:
                    strFromJson11 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -131073;
                case 18:
                    strFromJson12 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -262145;
                case 19:
                    strFromJson13 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -524289;
                case 20:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    i10 = -1048577;
                    i12 &= i10;
                case 21:
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 = -2097153;
                    i12 &= i10;
                case b.RECONNECTION_TIMED_OUT /* 22 */:
                    strFromJson14 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -4194305;
                    i12 &= i10;
                case 23:
                    strFromJson15 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -8388609;
                    i12 &= i10;
                case 24:
                    strFromJson16 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -16777217;
                    i12 &= i10;
                case 25:
                    strFromJson17 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -33554433;
                    i12 &= i10;
                case 26:
                    strFromJson18 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -67108865;
                    i12 &= i10;
                case 27:
                    strFromJson19 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -134217729;
                    i12 &= i10;
                case 28:
                    strFromJson20 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -268435457;
                    i12 &= i10;
                case 29:
                    strFromJson21 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -536870913;
                    i12 &= i10;
                case 30:
                    strFromJson22 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -1073741825;
                    i12 &= i10;
                case 31:
                    strFromJson23 = this.nullableStringAdapter.fromJson(reader);
                    i10 = a.e.API_PRIORITY_OTHER;
                    i12 &= i10;
                case l3.f92486e /* 32 */:
                    strFromJson24 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -2;
                case 33:
                    strFromJson25 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -3;
                case 34:
                    strFromJson26 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -5;
                case 35:
                    strFromJson27 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -9;
                case 36:
                    strFromJson28 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -17;
                case 37:
                    strFromJson29 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -33;
                case 38:
                    strFromJson30 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -65;
                case 39:
                    strFromJson31 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -129;
                case 40:
                    strFromJson32 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -257;
                case 41:
                    dFromJson2 = this.nullableDoubleAdapter.fromJson(reader);
                    i13 &= -513;
                case 42:
                    dFromJson3 = this.nullableDoubleAdapter.fromJson(reader);
                    i13 &= -1025;
                case 43:
                    strFromJson33 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -2049;
                case 44:
                    strFromJson34 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -4097;
                case 45:
                    strFromJson35 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -8193;
                case 46:
                    strFromJson36 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -16385;
                case 47:
                    strFromJson37 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -32769;
                case 48:
                    strFromJson38 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -65537;
                case 49:
                    strFromJson39 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -131073;
                case 50:
                    strFromJson40 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -262145;
                case 51:
                    strFromJson41 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -524289;
                case 52:
                    strFromJson42 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -1048577;
                    i13 &= i11;
                case 53:
                    strFromJson43 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -2097153;
                    i13 &= i11;
                case 54:
                    strFromJson44 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -4194305;
                    i13 &= i11;
                case 55:
                    strFromJson45 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -8388609;
                    i13 &= i11;
                case 56:
                    strFromJson46 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -16777217;
                    i13 &= i11;
                case 57:
                    strFromJson47 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -33554433;
                    i13 &= i11;
                case 58:
                    strFromJson48 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -67108865;
                    i13 &= i11;
                case 59:
                    strFromJson49 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -134217729;
                    i13 &= i11;
                case 60:
                    strFromJson50 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -268435457;
                    i13 &= i11;
                case 61:
                    strFromJson51 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -536870913;
                    i13 &= i11;
                case 62:
                    strFromJson52 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -1073741825;
                    i13 &= i11;
                case 63:
                    strFromJson53 = this.nullableStringAdapter.fromJson(reader);
                    i11 = a.e.API_PRIORITY_OTHER;
                    i13 &= i11;
                case 64:
                    strFromJson54 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -2;
                case 65:
                    strFromJson55 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -3;
                case 66:
                    strFromJson56 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -5;
                case 67:
                    strFromJson57 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -9;
                case 68:
                    strFromJson58 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -17;
                case 69:
                    strFromJson59 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -33;
                case 70:
                    strFromJson60 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -65;
                case 71:
                    strFromJson61 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -129;
                case 72:
                    strFromJson62 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -257;
                case 73:
                    strFromJson63 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -513;
                case 74:
                    listFromJson = this.listOfTenantsAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw c.w("tenants", "Tenants", reader);
                    }
                    i14 &= -1025;
                case 75:
                    strFromJson64 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -2049;
                case 76:
                    strFromJson65 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -4097;
                case 77:
                    strFromJson66 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -8193;
                case 78:
                    strFromJson67 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -16385;
                case 79:
                    strFromJson68 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -32769;
                case BinsView.LABEL_WIDTH_DP /* 80 */:
                    strFromJson69 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -65537;
                case 81:
                    dFromJson4 = this.nullableDoubleAdapter.fromJson(reader);
                    i14 &= -131073;
                case 82:
                    dFromJson5 = this.nullableDoubleAdapter.fromJson(reader);
                    i14 &= -262145;
                case 83:
                    marketAndRegionsFromJson = this.nullableMarketAndRegionsAdapter.fromJson(reader);
                    i14 &= -524289;
            }
        }
        reader.d();
        if (i12 == 0 && i13 == 0 && i14 == -1048576) {
            Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.storeinfo.api.model.FulfillmentInfo>");
            int iIntValue = numFromJson.intValue();
            Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.storeinfo.api.model.Tenants>");
            return new Store(listFromJson2, strFromJson2, auxUnitInfoFromJson, listFromJson3, listFromJson4, listFromJson5, strFromJson3, strFromJson4, strFromJson5, iIntValue, dFromJson, strFromJson, strFromJson6, strFromJson7, strFromJson8, strFromJson9, strFromJson10, strFromJson11, strFromJson12, strFromJson13, boolFromJson, boolFromJson2, strFromJson14, strFromJson15, strFromJson16, strFromJson17, strFromJson18, strFromJson19, strFromJson20, strFromJson21, strFromJson22, strFromJson23, strFromJson24, strFromJson25, strFromJson26, strFromJson27, strFromJson28, strFromJson29, strFromJson30, strFromJson31, strFromJson32, dFromJson2, dFromJson3, strFromJson33, strFromJson34, strFromJson35, strFromJson36, strFromJson37, strFromJson38, strFromJson39, strFromJson40, strFromJson41, strFromJson42, strFromJson43, strFromJson44, strFromJson45, strFromJson46, strFromJson47, strFromJson48, strFromJson49, strFromJson50, strFromJson51, strFromJson52, strFromJson53, strFromJson54, strFromJson55, strFromJson56, strFromJson57, strFromJson58, strFromJson59, strFromJson60, strFromJson61, strFromJson62, strFromJson63, listFromJson, strFromJson64, strFromJson65, strFromJson66, strFromJson67, strFromJson68, strFromJson69, dFromJson4, dFromJson5, marketAndRegionsFromJson);
        }
        List<Tenants> list = listFromJson;
        Double d10 = dFromJson;
        String str = strFromJson;
        List<FulfillmentInfo> list2 = listFromJson2;
        Constructor<Store> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = c.f134099c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = Store.class.getDeclaredConstructor(List.class, String.class, AuxUnitInfo.class, List.class, List.class, List.class, String.class, String.class, String.class, cls2, Double.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Double.class, Double.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, Double.class, Double.class, MarketAndRegions.class, cls2, cls2, cls2, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        Store storeNewInstance = declaredConstructor.newInstance(list2, strFromJson2, auxUnitInfoFromJson, listFromJson3, listFromJson4, listFromJson5, strFromJson3, strFromJson4, strFromJson5, numFromJson, d10, str, strFromJson6, strFromJson7, strFromJson8, strFromJson9, strFromJson10, strFromJson11, strFromJson12, strFromJson13, boolFromJson, boolFromJson2, strFromJson14, strFromJson15, strFromJson16, strFromJson17, strFromJson18, strFromJson19, strFromJson20, strFromJson21, strFromJson22, strFromJson23, strFromJson24, strFromJson25, strFromJson26, strFromJson27, strFromJson28, strFromJson29, strFromJson30, strFromJson31, strFromJson32, dFromJson2, dFromJson3, strFromJson33, strFromJson34, strFromJson35, strFromJson36, strFromJson37, strFromJson38, strFromJson39, strFromJson40, strFromJson41, strFromJson42, strFromJson43, strFromJson44, strFromJson45, strFromJson46, strFromJson47, strFromJson48, strFromJson49, strFromJson50, strFromJson51, strFromJson52, strFromJson53, strFromJson54, strFromJson55, strFromJson56, strFromJson57, strFromJson58, strFromJson59, strFromJson60, strFromJson61, strFromJson62, strFromJson63, list, strFromJson64, strFromJson65, strFromJson66, strFromJson67, strFromJson68, strFromJson69, dFromJson4, dFromJson5, marketAndRegionsFromJson, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), null);
        Intrinsics.i(storeNewInstance, "newInstance(...)");
        return storeNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, Store value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("FulfillmentInfo");
        this.listOfFulfillmentInfoAdapter.toJson(writer, (q) value_.v());
        writer.l("MfcUnitId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getMfcUnitId());
        writer.l("AuxUnitInfo");
        this.nullableAuxUnitInfoAdapter.toJson(writer, (q) value_.getAuxUnitInfo());
        writer.l("GasStationAmenities");
        this.nullableListOfGasStationAmenitiesAdapter.toJson(writer, (q) value_.w());
        writer.l("GasStationHours");
        this.nullableListOfGasStationHoursAdapter.toJson(writer, (q) value_.x());
        writer.l("FuelPrices");
        this.nullableListOfFuelPricesAdapter.toJson(writer, (q) value_.u());
        writer.l("StoreFlag");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreFlag());
        writer.l("IsMobileShoppingEnabled");
        this.nullableStringAdapter.toJson(writer, (q) value_.getIsMobileShoppingEnabled());
        writer.l("IsMobilePaymentEnabled");
        this.nullableStringAdapter.toJson(writer, (q) value_.getIsMobilePaymentEnabled());
        writer.l("UnitId");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getStoreId()));
        writer.l("MilesFrom");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getMilesFrom());
        writer.l("Address");
        this.nullableStringAdapter.toJson(writer, (q) value_.getAddress());
        writer.l("City");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCity());
        writer.l("State");
        this.nullableStringAdapter.toJson(writer, (q) value_.getState());
        writer.l("Zip");
        this.nullableStringAdapter.toJson(writer, (q) value_.getZipCode());
        writer.l("UnitType");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUnitType());
        writer.l("OpenDate");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOpenDate());
        writer.l("CloseDate");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCloseDate());
        writer.l("PhoneNumber");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPhoneNumber());
        writer.l("Name");
        this.nullableStringAdapter.toJson(writer, (q) value_.getName());
        writer.l("DriveThru");
        this.nullableBooleanAdapter.toJson(writer, (q) value_.getDriveThru());
        writer.l("Clinic");
        this.nullableBooleanAdapter.toJson(writer, (q) value_.getClinic());
        writer.l("PharmDailyOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyDailyOpen());
        writer.l("PharmDailyClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyDailyClose());
        writer.l("PharmSatOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacySatOpen());
        writer.l("PharmSatClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacySatClose());
        writer.l("PharmSunOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacySunOpen());
        writer.l("PharmSunClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacySunClose());
        writer.l("PharmHolidayOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyHolidayOpen());
        writer.l("PharmHolidayClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyHolidayClose());
        writer.l("PharmDriveThruWeekdayOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyDriveThruWeekdayOpen());
        writer.l("PharmDriveThruWeekdayClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyDriveThruWeekdayClose());
        writer.l("PharmDriveThruSatOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyDriveThruSatOpen());
        writer.l("PharmDriveThruSatClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyDriveThruSatClose());
        writer.l("PharmDriveThruSunOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyDriveThruSunOpen());
        writer.l("PharmDriveThruSunClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyDriveThruSunClose());
        writer.l("PharmTimezone");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyTimezone());
        writer.l("PharmAddress");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyAddress());
        writer.l("PharmPhone");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPharmacyPhone());
        writer.l("StoreDirName");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreDirName());
        writer.l("StoreDirEmpId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreDirEmpId());
        writer.l("Latitude");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getLatitude());
        writer.l("Longitude");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getLongitude());
        writer.l("StoreHours");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreHours());
        writer.l("StoreWeekdayOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreWeekDayOpen());
        writer.l("StoreWeekdayClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreWeekDayClose());
        writer.l("StoreSatOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreSaturdayOpen());
        writer.l("StoreSatClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreSaturdayClose());
        writer.l("StoreSunOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreSundayOpen());
        writer.l("StoreSunClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getStoreSundayClose());
        writer.l("PreOrderServiceAllow");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderServiceAllow());
        writer.l("PreOrderPhone");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderPhone());
        writer.l("PreOrderDriveThru");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderDriveThru());
        writer.l("CurbsideAllow");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideAllow());
        writer.l("CurbsidePhone");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsidePhone());
        writer.l("CurbsideDriveThru");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideDriveThru());
        writer.l("CurbsideWeekdayOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideWeekdayOpen());
        writer.l("CurbsideWeekdayClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideWeekdayClose());
        writer.l("CurbsideSatOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideSatOpen());
        writer.l("CurbsideSatClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideSatClose());
        writer.l("CurbsideSunOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideSunOpen());
        writer.l("CurbsideSunClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideSunClose());
        writer.l("CurbsideHolidayOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideHolidayOpen());
        writer.l("CurbsideHolidayClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideHolidayClose());
        writer.l("CurbsideInstoreAllow");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurbsideInStoreAllow());
        writer.l("PreOrderInstoreAllow");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderInStoreAllow());
        writer.l("PreOrderWeekdayOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderWeekdayOpen());
        writer.l("PreOrderWeekdayClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderWeekdayClose());
        writer.l("PreOrderSatOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderSatOpen());
        writer.l("PreOrderSatClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderSatClose());
        writer.l("PreOrderSunOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderSunOpen());
        writer.l("PreOrderSunClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderSunClose());
        writer.l("PreOrderHolidayOpen");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderHolidayOpen());
        writer.l("PreOrderHolidayClose");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPreOrderHolidayClose());
        writer.l("Tenants");
        this.listOfTenantsAdapter.toJson(writer, (q) value_.y0());
        writer.l("TimeZone");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTimeZone());
        writer.l("DaylightSavings");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDaylightSavings());
        writer.l("Vpos");
        this.nullableStringAdapter.toJson(writer, (q) value_.getVPos());
        writer.l("VisibleDate");
        this.nullableStringAdapter.toJson(writer, (q) value_.getVisibleDate());
        writer.l("CNCPickupDescription");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCNCPickupDescription());
        writer.l("SPOPickupDescription");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSPOPickupDescription());
        writer.l("Latitude_Rad");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getLatitudeRad());
        writer.l("Longitude_Rad");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getLongitudeRad());
        writer.l("MarketAndRegion");
        this.nullableMarketAndRegionsAdapter.toJson(writer, (q) value_.getMarketAndRegions());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(27);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Store");
        sb2.append(')');
        return sb2.toString();
    }
}
