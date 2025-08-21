package com.meijer.mobile.product.model.hybris.api.models;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.model.hybris.api.models.classification.HybrisClassification;
import com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutritionLabel;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisDiscount;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
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

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\"\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000201\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProductJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "booleanAdapter", "Lcom/squareup/moshi/h;", "", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisCategory;", "nullableListOfHybrisCategoryAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassification;", "listOfHybrisClassificationAdapter", "stringAdapter", "nullableStringAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisDiscount;", "nullableHybrisDiscountAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "nullableHybrisPriceAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;", "listOfHybrisImageAdapter", "", "nullableIntAdapter", "intAdapter", "hybrisPriceAdapter", "", "doubleAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;", "hybrisStockInfoAdapter", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;", "nullableHybrisNutritionLabelAdapter", "", "nullableListOfLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.product.model.hybris.api.models.HybrisProductJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends h<HybrisProduct> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<HybrisProduct> constructorRef;
    private final h<Double> doubleAdapter;
    private final h<HybrisPrice> hybrisPriceAdapter;
    private final h<HybrisStockInfo> hybrisStockInfoAdapter;
    private final h<Integer> intAdapter;
    private final h<List<HybrisClassification>> listOfHybrisClassificationAdapter;
    private final h<List<HybrisImage>> listOfHybrisImageAdapter;
    private final h<HybrisDiscount> nullableHybrisDiscountAdapter;
    private final h<HybrisNutritionLabel> nullableHybrisNutritionLabelAdapter;
    private final h<HybrisPrice> nullableHybrisPriceAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<List<HybrisCategory>> nullableListOfHybrisCategoryAdapter;
    private final h<List<Long>> nullableListOfLongAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("ageRestricted", "alcohol", "alcoholRestricted", "availableForPickup", "bopas", "buyable", "categories", "chokingHazard", "classifications", "clickAndCollect", "code", "countryOfOrigin", "description", "descriptiveFeatures", "disabled", "disclaimer", "discount", "discountedPrice", "displayable", "ean", "hasMPerks", "homeDeliveryNotAvailable", "images", "ingredients", "itemUnitOfMeasure", "manufacturer", "map", "meijerBrand", "name", "numberOfReviews", "orderQuantityInterval", "prepareItem", "price", "priceByWeight", "primaryUpcFlag", "depositPrice", "packageSize", "purchasable", "qtyIncrement", "sale", "stock", "summary", "priceUnit", "unit", "unitCode", "upcType", "ebtFoodstampable", "url", "validDates", "nutritionLabel", "maxOrderQuantity", "mperksOfferIds", "isCriteoSponsored", "storeId", "subscriptionAvailable");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Boolean> hVarF = moshi.f(Boolean.TYPE, SetsKt.e(), "ageRestricted");
        Intrinsics.i(hVarF, "adapter(...)");
        this.booleanAdapter = hVarF;
        h<List<HybrisCategory>> hVarF2 = moshi.f(x.j(List.class, HybrisCategory.class), SetsKt.e(), "categories");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableListOfHybrisCategoryAdapter = hVarF2;
        h<List<HybrisClassification>> hVarF3 = moshi.f(x.j(List.class, HybrisClassification.class), SetsKt.e(), "classifications");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.listOfHybrisClassificationAdapter = hVarF3;
        h<String> hVarF4 = moshi.f(String.class, SetsKt.e(), "code");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.stringAdapter = hVarF4;
        h<String> hVarF5 = moshi.f(String.class, SetsKt.e(), "countryOfOrigin");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableStringAdapter = hVarF5;
        h<HybrisDiscount> hVarF6 = moshi.f(HybrisDiscount.class, SetsKt.e(), "discount");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.nullableHybrisDiscountAdapter = hVarF6;
        h<HybrisPrice> hVarF7 = moshi.f(HybrisPrice.class, SetsKt.e(), "discountedPrice");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.nullableHybrisPriceAdapter = hVarF7;
        h<List<HybrisImage>> hVarF8 = moshi.f(x.j(List.class, HybrisImage.class), SetsKt.e(), "images");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.listOfHybrisImageAdapter = hVarF8;
        h<Integer> hVarF9 = moshi.f(Integer.class, SetsKt.e(), "numberOfReviews");
        Intrinsics.i(hVarF9, "adapter(...)");
        this.nullableIntAdapter = hVarF9;
        h<Integer> hVarF10 = moshi.f(Integer.TYPE, SetsKt.e(), "orderQuantityInterval");
        Intrinsics.i(hVarF10, "adapter(...)");
        this.intAdapter = hVarF10;
        h<HybrisPrice> hVarF11 = moshi.f(HybrisPrice.class, SetsKt.e(), "price");
        Intrinsics.i(hVarF11, "adapter(...)");
        this.hybrisPriceAdapter = hVarF11;
        h<Double> hVarF12 = moshi.f(Double.TYPE, SetsKt.e(), "qtyIncrement");
        Intrinsics.i(hVarF12, "adapter(...)");
        this.doubleAdapter = hVarF12;
        h<HybrisStockInfo> hVarF13 = moshi.f(HybrisStockInfo.class, SetsKt.e(), "stockInfo");
        Intrinsics.i(hVarF13, "adapter(...)");
        this.hybrisStockInfoAdapter = hVarF13;
        h<HybrisNutritionLabel> hVarF14 = moshi.f(HybrisNutritionLabel.class, SetsKt.e(), "nutritionLabel");
        Intrinsics.i(hVarF14, "adapter(...)");
        this.nullableHybrisNutritionLabelAdapter = hVarF14;
        h<List<Long>> hVarF15 = moshi.f(x.j(List.class, Long.class), SetsKt.e(), "mPerksOfferIds");
        Intrinsics.i(hVarF15, "adapter(...)");
        this.nullableListOfLongAdapter = hVarF15;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybrisProduct fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        Double dValueOf = Double.valueOf(0.0d);
        reader.b();
        String strFromJson = null;
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        Boolean boolFromJson3 = boolFromJson2;
        Boolean boolFromJson4 = boolFromJson3;
        Boolean boolFromJson5 = boolFromJson4;
        Boolean boolFromJson6 = boolFromJson5;
        Boolean boolFromJson7 = boolFromJson6;
        Boolean boolFromJson8 = boolFromJson7;
        Boolean boolFromJson9 = boolFromJson8;
        Boolean boolFromJson10 = boolFromJson9;
        Boolean boolFromJson11 = boolFromJson10;
        Boolean boolFromJson12 = boolFromJson11;
        Boolean boolFromJson13 = boolFromJson12;
        Boolean boolFromJson14 = boolFromJson13;
        Boolean boolFromJson15 = boolFromJson14;
        Boolean boolFromJson16 = boolFromJson15;
        Boolean boolFromJson17 = boolFromJson16;
        Boolean boolFromJson18 = boolFromJson17;
        Boolean boolFromJson19 = boolFromJson18;
        Boolean boolFromJson20 = boolFromJson19;
        Boolean boolFromJson21 = boolFromJson20;
        Boolean boolFromJson22 = boolFromJson21;
        Boolean boolFromJson23 = boolFromJson22;
        Integer numFromJson = 0;
        Integer numFromJson2 = null;
        Double dFromJson = dValueOf;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        HybrisPrice hybrisPriceFromJson = null;
        HybrisStockInfo hybrisStockInfoFromJson = null;
        String strFromJson6 = null;
        List<HybrisClassification> listFromJson = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        Integer numFromJson3 = null;
        String strFromJson11 = null;
        String strFromJson12 = null;
        String strFromJson13 = null;
        String strFromJson14 = null;
        String strFromJson15 = null;
        List<HybrisCategory> listFromJson2 = null;
        HybrisDiscount hybrisDiscountFromJson = null;
        HybrisPrice hybrisPriceFromJson2 = null;
        HybrisPrice hybrisPriceFromJson3 = null;
        String strFromJson16 = null;
        String strFromJson17 = null;
        HybrisNutritionLabel hybrisNutritionLabelFromJson = null;
        Integer numFromJson4 = null;
        List<Long> listFromJson3 = null;
        int i11 = -1;
        int i12 = -1;
        List<HybrisImage> listFromJson4 = null;
        while (reader.hasNext()) {
            Boolean bool2 = boolFromJson;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    boolFromJson = bool2;
                case 0:
                    boolFromJson4 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson4 == null) {
                        throw C14410c.w("ageRestricted", "ageRestricted", reader);
                    }
                    i11 &= -2;
                    boolFromJson = bool2;
                case 1:
                    boolFromJson5 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson5 == null) {
                        throw C14410c.w("alcohol", "alcohol", reader);
                    }
                    i11 &= -3;
                    boolFromJson = bool2;
                case 2:
                    boolFromJson7 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson7 == null) {
                        throw C14410c.w("alcoholRestricted", "alcoholRestricted", reader);
                    }
                    i11 &= -5;
                    boolFromJson = bool2;
                case 3:
                    boolFromJson8 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson8 == null) {
                        throw C14410c.w("availableForPickup", "availableForPickup", reader);
                    }
                    i11 &= -9;
                    boolFromJson = bool2;
                case 4:
                    boolFromJson9 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson9 == null) {
                        throw C14410c.w("isBopas", "bopas", reader);
                    }
                    i11 &= -17;
                    boolFromJson = bool2;
                case 5:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw C14410c.w("buyable", "buyable", reader);
                    }
                    i11 &= -33;
                case 6:
                    listFromJson2 = this.nullableListOfHybrisCategoryAdapter.fromJson(reader);
                    i11 &= -65;
                    boolFromJson = bool2;
                case 7:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw C14410c.w("chokingHazard", "chokingHazard", reader);
                    }
                    i11 &= -129;
                    boolFromJson = bool2;
                case 8:
                    listFromJson = this.listOfHybrisClassificationAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw C14410c.w("classifications", "classifications", reader);
                    }
                    i11 &= -257;
                    boolFromJson = bool2;
                case 9:
                    boolFromJson3 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson3 == null) {
                        throw C14410c.w("clickAndCollect", "clickAndCollect", reader);
                    }
                    i11 &= -513;
                    boolFromJson = bool2;
                case 10:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw C14410c.w("code", "code", reader);
                    }
                    i11 &= -1025;
                    boolFromJson = bool2;
                case 11:
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    boolFromJson = bool2;
                case 12:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    boolFromJson = bool2;
                case 13:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw C14410c.w("descriptiveFeatures", "descriptiveFeatures", reader);
                    }
                    i11 &= -8193;
                    boolFromJson = bool2;
                case 14:
                    boolFromJson6 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson6 == null) {
                        throw C14410c.w("disabled", "disabled", reader);
                    }
                    i11 &= -16385;
                    boolFromJson = bool2;
                case 15:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw C14410c.w("disclaimer", "disclaimer", reader);
                    }
                    i11 &= -32769;
                    boolFromJson = bool2;
                case 16:
                    hybrisDiscountFromJson = this.nullableHybrisDiscountAdapter.fromJson(reader);
                    i11 &= -65537;
                    boolFromJson = bool2;
                case 17:
                    hybrisPriceFromJson2 = this.nullableHybrisPriceAdapter.fromJson(reader);
                    i11 &= -131073;
                    boolFromJson = bool2;
                case 18:
                    boolFromJson10 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson10 == null) {
                        throw C14410c.w("displayable", "displayable", reader);
                    }
                    i11 &= -262145;
                    boolFromJson = bool2;
                case 19:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw C14410c.w("ean", "ean", reader);
                    }
                    i11 &= -524289;
                    boolFromJson = bool2;
                case 20:
                    boolFromJson11 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson11 == null) {
                        throw C14410c.w("hasMPerksOffers", "hasMPerks", reader);
                    }
                    i11 &= -1048577;
                    boolFromJson = bool2;
                case 21:
                    boolFromJson12 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson12 == null) {
                        throw C14410c.w("homeDeliveryNotAvailable", "homeDeliveryNotAvailable", reader);
                    }
                    i11 &= -2097153;
                    boolFromJson = bool2;
                case b.RECONNECTION_TIMED_OUT /* 22 */:
                    listFromJson4 = this.listOfHybrisImageAdapter.fromJson(reader);
                    if (listFromJson4 == null) {
                        throw C14410c.w("images", "images", reader);
                    }
                    i11 &= -4194305;
                    boolFromJson = bool2;
                case 23:
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -8388609;
                    i11 &= i10;
                    boolFromJson = bool2;
                case 24:
                    strFromJson6 = this.stringAdapter.fromJson(reader);
                    if (strFromJson6 == null) {
                        throw C14410c.w("itemUnitOfMeasure", "itemUnitOfMeasure", reader);
                    }
                    i10 = -16777217;
                    i11 &= i10;
                    boolFromJson = bool2;
                case 25:
                    strFromJson10 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -33554433;
                    i11 &= i10;
                    boolFromJson = bool2;
                case 26:
                    boolFromJson13 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson13 == null) {
                        throw C14410c.w("isMap", "map", reader);
                    }
                    i10 = -67108865;
                    i11 &= i10;
                    boolFromJson = bool2;
                case 27:
                    boolFromJson14 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson14 == null) {
                        throw C14410c.w("meijerBrand", "meijerBrand", reader);
                    }
                    i10 = -134217729;
                    i11 &= i10;
                    boolFromJson = bool2;
                case 28:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw C14410c.w("name", "name", reader);
                    }
                    i10 = -268435457;
                    i11 &= i10;
                    boolFromJson = bool2;
                case 29:
                    numFromJson3 = this.nullableIntAdapter.fromJson(reader);
                    i10 = -536870913;
                    i11 &= i10;
                    boolFromJson = bool2;
                case 30:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw C14410c.w("orderQuantityInterval", "orderQuantityInterval", reader);
                    }
                    i10 = -1073741825;
                    i11 &= i10;
                    boolFromJson = bool2;
                case 31:
                    boolFromJson15 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson15 == null) {
                        throw C14410c.w("prepareItem", "prepareItem", reader);
                    }
                    i10 = a.e.API_PRIORITY_OTHER;
                    i11 &= i10;
                    boolFromJson = bool2;
                case l3.f93325e /* 32 */:
                    hybrisPriceFromJson = this.hybrisPriceAdapter.fromJson(reader);
                    if (hybrisPriceFromJson == null) {
                        throw C14410c.w("price", "price", reader);
                    }
                    i12 &= -2;
                    boolFromJson = bool2;
                case 33:
                    boolFromJson16 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson16 == null) {
                        throw C14410c.w("priceByWeight", "priceByWeight", reader);
                    }
                    i12 &= -3;
                    boolFromJson = bool2;
                case 34:
                    boolFromJson17 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson17 == null) {
                        throw C14410c.w("primaryUpcFlag", "primaryUpcFlag", reader);
                    }
                    i12 &= -5;
                    boolFromJson = bool2;
                case 35:
                    hybrisPriceFromJson3 = this.nullableHybrisPriceAdapter.fromJson(reader);
                    i12 &= -9;
                    boolFromJson = bool2;
                case 36:
                    strFromJson16 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -17;
                    boolFromJson = bool2;
                case 37:
                    boolFromJson18 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson18 == null) {
                        throw C14410c.w("purchasable", "purchasable", reader);
                    }
                    i12 &= -33;
                    boolFromJson = bool2;
                case 38:
                    dFromJson = this.doubleAdapter.fromJson(reader);
                    if (dFromJson == null) {
                        throw C14410c.w("qtyIncrement", "qtyIncrement", reader);
                    }
                    i12 &= -65;
                    boolFromJson = bool2;
                case 39:
                    boolFromJson19 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson19 == null) {
                        throw C14410c.w("sale", "sale", reader);
                    }
                    i12 &= -129;
                    boolFromJson = bool2;
                case 40:
                    hybrisStockInfoFromJson = this.hybrisStockInfoAdapter.fromJson(reader);
                    if (hybrisStockInfoFromJson == null) {
                        throw C14410c.w("stockInfo", "stock", reader);
                    }
                    i12 &= -257;
                    boolFromJson = bool2;
                case 41:
                    strFromJson11 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -513;
                    boolFromJson = bool2;
                case 42:
                    strFromJson12 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -1025;
                    boolFromJson = bool2;
                case 43:
                    strFromJson13 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2049;
                    boolFromJson = bool2;
                case 44:
                    strFromJson14 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -4097;
                    boolFromJson = bool2;
                case 45:
                    strFromJson15 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -8193;
                    boolFromJson = bool2;
                case 46:
                    boolFromJson20 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson20 == null) {
                        throw C14410c.w("isEbtProduct", "ebtFoodstampable", reader);
                    }
                    i12 &= -16385;
                    boolFromJson = bool2;
                case 47:
                    strFromJson17 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -32769;
                    boolFromJson = bool2;
                case 48:
                    boolFromJson21 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson21 == null) {
                        throw C14410c.w("validDates", "validDates", reader);
                    }
                    i12 &= -65537;
                    boolFromJson = bool2;
                case 49:
                    hybrisNutritionLabelFromJson = this.nullableHybrisNutritionLabelAdapter.fromJson(reader);
                    i12 &= -131073;
                    boolFromJson = bool2;
                case 50:
                    numFromJson4 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -262145;
                    boolFromJson = bool2;
                case 51:
                    listFromJson3 = this.nullableListOfLongAdapter.fromJson(reader);
                    i12 &= -524289;
                    boolFromJson = bool2;
                case 52:
                    boolFromJson22 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson22 == null) {
                        throw C14410c.w("isSponsoredCriteo", "isCriteoSponsored", reader);
                    }
                    i12 &= -1048577;
                    boolFromJson = bool2;
                case 53:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw C14410c.w("storeId", "storeId", reader);
                    }
                    i12 &= -2097153;
                    boolFromJson = bool2;
                case 54:
                    boolFromJson23 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson23 == null) {
                        throw C14410c.w("isSubscriptionAvailable", "subscriptionAvailable", reader);
                    }
                    i12 &= -4194305;
                    boolFromJson = bool2;
                default:
                    boolFromJson = bool2;
            }
        }
        Boolean bool3 = boolFromJson;
        reader.d();
        if (i11 != 0 || i12 != -8388608) {
            String str = strFromJson2;
            String str2 = strFromJson3;
            String str3 = strFromJson4;
            String str4 = strFromJson;
            List<HybrisImage> list = listFromJson4;
            String str5 = strFromJson5;
            HybrisPrice hybrisPrice = hybrisPriceFromJson;
            HybrisStockInfo hybrisStockInfo = hybrisStockInfoFromJson;
            String str6 = strFromJson6;
            Constructor<HybrisProduct> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                Class<?> cls = C14410c.f134472c;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Integer.TYPE;
                declaredConstructor = HybrisProduct.class.getDeclaredConstructor(cls2, cls2, cls2, cls2, cls2, cls2, List.class, cls2, List.class, cls2, String.class, String.class, String.class, String.class, cls2, String.class, HybrisDiscount.class, HybrisPrice.class, cls2, String.class, cls2, cls2, List.class, String.class, String.class, String.class, cls2, cls2, String.class, Integer.class, cls3, cls2, HybrisPrice.class, cls2, cls2, HybrisPrice.class, String.class, cls2, Double.TYPE, cls2, HybrisStockInfo.class, String.class, String.class, String.class, String.class, String.class, cls2, String.class, cls2, HybrisNutritionLabel.class, Integer.class, List.class, cls2, cls3, cls2, cls3, cls3, cls);
                this.constructorRef = declaredConstructor;
                Intrinsics.i(declaredConstructor, "also(...)");
            }
            HybrisProduct hybrisProductNewInstance = declaredConstructor.newInstance(boolFromJson4, boolFromJson5, boolFromJson7, boolFromJson8, boolFromJson9, bool3, listFromJson2, boolFromJson2, listFromJson, boolFromJson3, str4, strFromJson7, strFromJson8, str, boolFromJson6, str2, hybrisDiscountFromJson, hybrisPriceFromJson2, boolFromJson10, str3, boolFromJson11, boolFromJson12, list, strFromJson9, str6, strFromJson10, boolFromJson13, boolFromJson14, str5, numFromJson3, numFromJson, boolFromJson15, hybrisPrice, boolFromJson16, boolFromJson17, hybrisPriceFromJson3, strFromJson16, boolFromJson18, dFromJson, boolFromJson19, hybrisStockInfo, strFromJson11, strFromJson12, strFromJson13, strFromJson14, strFromJson15, boolFromJson20, strFromJson17, boolFromJson21, hybrisNutritionLabelFromJson, numFromJson4, listFromJson3, boolFromJson22, numFromJson2, boolFromJson23, Integer.valueOf(i11), Integer.valueOf(i12), null);
            Intrinsics.i(hybrisProductNewInstance, "newInstance(...)");
            return hybrisProductNewInstance;
        }
        boolean zBooleanValue = boolFromJson4.booleanValue();
        boolean zBooleanValue2 = boolFromJson5.booleanValue();
        boolean zBooleanValue3 = boolFromJson7.booleanValue();
        boolean zBooleanValue4 = boolFromJson8.booleanValue();
        boolean zBooleanValue5 = boolFromJson9.booleanValue();
        boolean zBooleanValue6 = bool3.booleanValue();
        boolean zBooleanValue7 = boolFromJson2.booleanValue();
        Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.hybris.api.models.classification.HybrisClassification>");
        boolean zBooleanValue8 = boolFromJson3.booleanValue();
        Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.h(strFromJson2, "null cannot be cast to non-null type kotlin.String");
        boolean zBooleanValue9 = boolFromJson6.booleanValue();
        Intrinsics.h(strFromJson3, "null cannot be cast to non-null type kotlin.String");
        boolean zBooleanValue10 = boolFromJson10.booleanValue();
        Intrinsics.h(strFromJson4, "null cannot be cast to non-null type kotlin.String");
        boolean zBooleanValue11 = boolFromJson11.booleanValue();
        boolean zBooleanValue12 = boolFromJson12.booleanValue();
        Intrinsics.h(listFromJson4, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.hybris.api.models.HybrisImage>");
        Intrinsics.h(strFromJson6, "null cannot be cast to non-null type kotlin.String");
        boolean zBooleanValue13 = boolFromJson13.booleanValue();
        boolean zBooleanValue14 = boolFromJson14.booleanValue();
        Intrinsics.h(strFromJson5, "null cannot be cast to non-null type kotlin.String");
        int iIntValue = numFromJson.intValue();
        boolean zBooleanValue15 = boolFromJson15.booleanValue();
        Intrinsics.h(hybrisPriceFromJson, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice");
        boolean zBooleanValue16 = boolFromJson16.booleanValue();
        boolean zBooleanValue17 = boolFromJson17.booleanValue();
        boolean zBooleanValue18 = boolFromJson18.booleanValue();
        double dDoubleValue = dFromJson.doubleValue();
        boolean zBooleanValue19 = boolFromJson19.booleanValue();
        Intrinsics.h(hybrisStockInfoFromJson, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.HybrisStockInfo");
        return new HybrisProduct(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, listFromJson2, zBooleanValue7, listFromJson, zBooleanValue8, strFromJson, strFromJson7, strFromJson8, strFromJson2, zBooleanValue9, strFromJson3, hybrisDiscountFromJson, hybrisPriceFromJson2, zBooleanValue10, strFromJson4, zBooleanValue11, zBooleanValue12, listFromJson4, strFromJson9, strFromJson6, strFromJson10, zBooleanValue13, zBooleanValue14, strFromJson5, numFromJson3, iIntValue, zBooleanValue15, hybrisPriceFromJson, zBooleanValue16, zBooleanValue17, hybrisPriceFromJson3, strFromJson16, zBooleanValue18, dDoubleValue, zBooleanValue19, hybrisStockInfoFromJson, strFromJson11, strFromJson12, strFromJson13, strFromJson14, strFromJson15, boolFromJson20.booleanValue(), strFromJson17, boolFromJson21.booleanValue(), hybrisNutritionLabelFromJson, numFromJson4, listFromJson3, boolFromJson22.booleanValue(), numFromJson2.intValue(), boolFromJson23.booleanValue());
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HybrisProduct value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("ageRestricted");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getAgeRestricted()));
        writer.l("alcohol");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getAlcohol()));
        writer.l("alcoholRestricted");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getAlcoholRestricted()));
        writer.l("availableForPickup");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getAvailableForPickup()));
        writer.l("bopas");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsBopas()));
        writer.l("buyable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getBuyable()));
        writer.l("categories");
        this.nullableListOfHybrisCategoryAdapter.toJson(writer, (q) value_.g());
        writer.l("chokingHazard");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getChokingHazard()));
        writer.l("classifications");
        this.listOfHybrisClassificationAdapter.toJson(writer, (q) value_.i());
        writer.l("clickAndCollect");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getClickAndCollect()));
        writer.l("code");
        this.stringAdapter.toJson(writer, (q) value_.getCode());
        writer.l("countryOfOrigin");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCountryOfOrigin());
        writer.l("description");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDescription());
        writer.l("descriptiveFeatures");
        this.stringAdapter.toJson(writer, (q) value_.getDescriptiveFeatures());
        writer.l("disabled");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getDisabled()));
        writer.l("disclaimer");
        this.stringAdapter.toJson(writer, (q) value_.getDisclaimer());
        writer.l("discount");
        this.nullableHybrisDiscountAdapter.toJson(writer, (q) value_.getDiscount());
        writer.l("discountedPrice");
        this.nullableHybrisPriceAdapter.toJson(writer, (q) value_.getDiscountedPrice());
        writer.l("displayable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getDisplayable()));
        writer.l("ean");
        this.stringAdapter.toJson(writer, (q) value_.getEan());
        writer.l("hasMPerks");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getHasMPerksOffers()));
        writer.l("homeDeliveryNotAvailable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getHomeDeliveryNotAvailable()));
        writer.l("images");
        this.listOfHybrisImageAdapter.toJson(writer, (q) value_.x());
        writer.l("ingredients");
        this.nullableStringAdapter.toJson(writer, (q) value_.getIngredients());
        writer.l("itemUnitOfMeasure");
        this.stringAdapter.toJson(writer, (q) value_.getItemUnitOfMeasure());
        writer.l("manufacturer");
        this.nullableStringAdapter.toJson(writer, (q) value_.getManufacturer());
        writer.l("map");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsMap()));
        writer.l("meijerBrand");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getMeijerBrand()));
        writer.l("name");
        this.stringAdapter.toJson(writer, (q) value_.getName());
        writer.l("numberOfReviews");
        this.nullableIntAdapter.toJson(writer, (q) value_.getNumberOfReviews());
        writer.l("orderQuantityInterval");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getOrderQuantityInterval()));
        writer.l("prepareItem");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getPrepareItem()));
        writer.l("price");
        this.hybrisPriceAdapter.toJson(writer, (q) value_.getPrice());
        writer.l("priceByWeight");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getPriceByWeight()));
        writer.l("primaryUpcFlag");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getPrimaryUpcFlag()));
        writer.l("depositPrice");
        this.nullableHybrisPriceAdapter.toJson(writer, (q) value_.getDepositPrice());
        writer.l("packageSize");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPackageSize());
        writer.l("purchasable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getPurchasable()));
        writer.l("qtyIncrement");
        this.doubleAdapter.toJson(writer, (q) Double.valueOf(value_.getQtyIncrement()));
        writer.l("sale");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getSale()));
        writer.l("stock");
        this.hybrisStockInfoAdapter.toJson(writer, (q) value_.getStockInfo());
        writer.l("summary");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSummary());
        writer.l("priceUnit");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPriceUnit());
        writer.l("unit");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUnit());
        writer.l("unitCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUnitCode());
        writer.l("upcType");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUpcType());
        writer.l("ebtFoodstampable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsEbtProduct()));
        writer.l("url");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUrl());
        writer.l("validDates");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getValidDates()));
        writer.l("nutritionLabel");
        this.nullableHybrisNutritionLabelAdapter.toJson(writer, (q) value_.getNutritionLabel());
        writer.l("maxOrderQuantity");
        this.nullableIntAdapter.toJson(writer, (q) value_.getMaxOrderQuantity());
        writer.l("mperksOfferIds");
        this.nullableListOfLongAdapter.toJson(writer, (q) value_.A());
        writer.l("isCriteoSponsored");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsSponsoredCriteo()));
        writer.l("storeId");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getStoreId()));
        writer.l("subscriptionAvailable");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsSubscriptionAvailable()));
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HybrisProduct");
        sb2.append(')');
        return sb2.toString();
    }
}
