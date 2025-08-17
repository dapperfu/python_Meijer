package com.meijer.mobile.weeklyad.services.api.models;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdItemJsonJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdItemJson;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdItemJson;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdItemJson;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "nullableIntAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "nullableListOfStringAdapter", "", "nullableFloatAdapter", "", "", "nullableMutableListOfLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdItemJsonJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<FlippWeeklyAdItemJson> {
    private volatile Constructor<FlippWeeklyAdItemJson> constructorRef;
    private final h<Float> nullableFloatAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<List<String>> nullableListOfStringAdapter;
    private final h<List<Long>> nullableMutableListOfLongAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a(PreferencesHelper.PREF_ID, "flyer_id", "flyer_run_id", "name", "sale_story", "current_price", "original_price", "dollars_off", "percent_off", "sku", "custom_id_field_1", "custom_id_field_2", "custom_id_field_3", "description", "brand", "pre_price_text", "price_text", "post_price_text", "valid_from", "valid_to", "categories", "current_price_range", "original_price_range", "small_image_url", "medium_image_url", "large_image_url", "x_large_image_url", "image_url", "left", "top", "width", "height", "item_type", "page", "page_width", "page_height", "page_relative_left_offset", "page_relative_top_offset", "images", "page_destination", "disclaimer_text", "web_url", "video_url", "video_type", "meijerOfferIdsList");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Integer> hVarF = moshi.f(Integer.class, SetsKt.e(), "itemId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableIntAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "productName");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
        h<List<String>> hVarF3 = moshi.f(x.j(List.class, String.class), SetsKt.e(), "categories");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableListOfStringAdapter = hVarF3;
        h<Float> hVarF4 = moshi.f(Float.class, SetsKt.e(), "left");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableFloatAdapter = hVarF4;
        h<List<Long>> hVarF5 = moshi.f(x.j(List.class, Long.class), SetsKt.e(), "meijerOfferIdsList");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableMutableListOfLongAdapter = hVarF5;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FlippWeeklyAdItemJson fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        Intrinsics.j(reader, "reader");
        reader.b();
        int i11 = -1;
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
        String strFromJson10 = null;
        String strFromJson11 = null;
        String strFromJson12 = null;
        String strFromJson13 = null;
        String strFromJson14 = null;
        String strFromJson15 = null;
        String strFromJson16 = null;
        String strFromJson17 = null;
        List<String> listFromJson = null;
        String strFromJson18 = null;
        String strFromJson19 = null;
        String strFromJson20 = null;
        String strFromJson21 = null;
        String strFromJson22 = null;
        String strFromJson23 = null;
        String strFromJson24 = null;
        Float fFromJson = null;
        Float fFromJson2 = null;
        Float fFromJson3 = null;
        Float fFromJson4 = null;
        Integer numFromJson4 = null;
        Integer numFromJson5 = null;
        Float fFromJson5 = null;
        Float fFromJson6 = null;
        Float fFromJson7 = null;
        Float fFromJson8 = null;
        List<String> listFromJson2 = null;
        Integer numFromJson6 = null;
        String strFromJson25 = null;
        String strFromJson26 = null;
        String strFromJson27 = null;
        Integer numFromJson7 = null;
        List<Long> listFromJson3 = null;
        int i12 = -1;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    continue;
                case 0:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -2;
                    continue;
                case 1:
                    numFromJson2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -3;
                    continue;
                case 2:
                    numFromJson3 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -5;
                    continue;
                case 3:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    continue;
                case 4:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    continue;
                case 5:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    continue;
                case 6:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    continue;
                case 7:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -129;
                    continue;
                case 8:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    continue;
                case 9:
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    continue;
                case 10:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    continue;
                case 11:
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    continue;
                case 12:
                    strFromJson10 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    continue;
                case 13:
                    strFromJson11 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -8193;
                    continue;
                case 14:
                    strFromJson12 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -16385;
                    continue;
                case 15:
                    strFromJson13 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -32769;
                    break;
                case 16:
                    strFromJson14 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -65537;
                    break;
                case 17:
                    strFromJson15 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -131073;
                    break;
                case 18:
                    strFromJson16 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -262145;
                    break;
                case 19:
                    strFromJson17 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -524289;
                    break;
                case 20:
                    listFromJson = this.nullableListOfStringAdapter.fromJson(reader);
                    i10 = -1048577;
                    break;
                case 21:
                    strFromJson18 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -2097153;
                    break;
                case b.RECONNECTION_TIMED_OUT /* 22 */:
                    strFromJson19 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -4194305;
                    break;
                case 23:
                    strFromJson20 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -8388609;
                    break;
                case 24:
                    strFromJson21 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -16777217;
                    break;
                case 25:
                    strFromJson22 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -33554433;
                    break;
                case 26:
                    strFromJson23 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -67108865;
                    break;
                case 27:
                    strFromJson24 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -134217729;
                    break;
                case 28:
                    fFromJson = this.nullableFloatAdapter.fromJson(reader);
                    i10 = -268435457;
                    break;
                case 29:
                    fFromJson2 = this.nullableFloatAdapter.fromJson(reader);
                    i10 = -536870913;
                    break;
                case 30:
                    fFromJson3 = this.nullableFloatAdapter.fromJson(reader);
                    i10 = -1073741825;
                    break;
                case 31:
                    fFromJson4 = this.nullableFloatAdapter.fromJson(reader);
                    i10 = a.e.API_PRIORITY_OTHER;
                    break;
                case l3.f92486e /* 32 */:
                    numFromJson4 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -2;
                    continue;
                case 33:
                    numFromJson5 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -3;
                    continue;
                case 34:
                    fFromJson5 = this.nullableFloatAdapter.fromJson(reader);
                    i12 &= -5;
                    continue;
                case 35:
                    fFromJson6 = this.nullableFloatAdapter.fromJson(reader);
                    i12 &= -9;
                    continue;
                case 36:
                    fFromJson7 = this.nullableFloatAdapter.fromJson(reader);
                    i12 &= -17;
                    continue;
                case 37:
                    fFromJson8 = this.nullableFloatAdapter.fromJson(reader);
                    i12 &= -33;
                    continue;
                case 38:
                    listFromJson2 = this.nullableListOfStringAdapter.fromJson(reader);
                    i12 &= -65;
                    continue;
                case 39:
                    numFromJson6 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -129;
                    continue;
                case 40:
                    strFromJson25 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    continue;
                case 41:
                    strFromJson26 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -513;
                    continue;
                case 42:
                    strFromJson27 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -1025;
                    continue;
                case 43:
                    numFromJson7 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -2049;
                    continue;
                case 44:
                    listFromJson3 = this.nullableMutableListOfLongAdapter.fromJson(reader);
                    i12 &= -8193;
                    continue;
            }
            i11 &= i10;
        }
        reader.d();
        if (i11 == 0 && i12 == -12288) {
            String str = strFromJson6;
            String str2 = strFromJson5;
            String str3 = strFromJson4;
            String str4 = strFromJson3;
            String str5 = strFromJson2;
            String str6 = strFromJson;
            return new FlippWeeklyAdItemJson(numFromJson, numFromJson2, numFromJson3, str6, str5, str4, str3, str2, str, strFromJson7, strFromJson8, strFromJson9, strFromJson10, strFromJson11, strFromJson12, strFromJson13, strFromJson14, strFromJson15, strFromJson16, strFromJson17, listFromJson, strFromJson18, strFromJson19, strFromJson20, strFromJson21, strFromJson22, strFromJson23, strFromJson24, fFromJson, fFromJson2, fFromJson3, fFromJson4, numFromJson4, numFromJson5, fFromJson5, fFromJson6, fFromJson7, fFromJson8, listFromJson2, numFromJson6, strFromJson25, strFromJson26, strFromJson27, numFromJson7, false, listFromJson3, 0, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, null);
        }
        String str7 = strFromJson6;
        List<Long> list = listFromJson3;
        String str8 = strFromJson5;
        String str9 = strFromJson4;
        String str10 = strFromJson3;
        String str11 = strFromJson2;
        String str12 = strFromJson;
        Integer num = numFromJson3;
        Integer num2 = numFromJson2;
        Integer num3 = numFromJson;
        Constructor<FlippWeeklyAdItemJson> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = FlippWeeklyAdItemJson.class.getDeclaredConstructor(Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Float.class, Float.class, Float.class, Float.class, Integer.class, Integer.class, Float.class, Float.class, Float.class, Float.class, List.class, Integer.class, String.class, String.class, String.class, Integer.class, Boolean.TYPE, List.class, cls, cls, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        FlippWeeklyAdItemJson flippWeeklyAdItemJsonNewInstance = declaredConstructor.newInstance(num3, num2, num, str12, str11, str10, str9, str8, str7, strFromJson7, strFromJson8, strFromJson9, strFromJson10, strFromJson11, strFromJson12, strFromJson13, strFromJson14, strFromJson15, strFromJson16, strFromJson17, listFromJson, strFromJson18, strFromJson19, strFromJson20, strFromJson21, strFromJson22, strFromJson23, strFromJson24, fFromJson, fFromJson2, fFromJson3, fFromJson4, numFromJson4, numFromJson5, fFromJson5, fFromJson6, fFromJson7, fFromJson8, listFromJson2, numFromJson6, strFromJson25, strFromJson26, strFromJson27, numFromJson7, Boolean.FALSE, list, Integer.valueOf(i11), Integer.valueOf(i12), null);
        Intrinsics.i(flippWeeklyAdItemJsonNewInstance, "newInstance(...)");
        return flippWeeklyAdItemJsonNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, FlippWeeklyAdItemJson value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l(PreferencesHelper.PREF_ID);
        this.nullableIntAdapter.toJson(writer, (q) value_.getItemId());
        writer.l("flyer_id");
        this.nullableIntAdapter.toJson(writer, (q) value_.getFlyerId());
        writer.l("flyer_run_id");
        this.nullableIntAdapter.toJson(writer, (q) value_.getFlyerRunId());
        writer.l("name");
        this.nullableStringAdapter.toJson(writer, (q) value_.getProductName());
        writer.l("sale_story");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSaleStory());
        writer.l("current_price");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurrentPrice());
        writer.l("original_price");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOriginalPrice());
        writer.l("dollars_off");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDollarsOff());
        writer.l("percent_off");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPercentOff());
        writer.l("sku");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSku());
        writer.l("custom_id_field_1");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCustomIdField1());
        writer.l("custom_id_field_2");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCustomIdField2());
        writer.l("custom_id_field_3");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCustomIdField3());
        writer.l("description");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDescription());
        writer.l("brand");
        this.nullableStringAdapter.toJson(writer, (q) value_.getBrand());
        writer.l("pre_price_text");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPrePriceText());
        writer.l("price_text");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPriceText());
        writer.l("post_price_text");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPostPriceText());
        writer.l("valid_from");
        this.nullableStringAdapter.toJson(writer, (q) value_.getValidFrom());
        writer.l("valid_to");
        this.nullableStringAdapter.toJson(writer, (q) value_.getValidTo());
        writer.l("categories");
        this.nullableListOfStringAdapter.toJson(writer, (q) value_.b());
        writer.l("current_price_range");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCurrentPriceRange());
        writer.l("original_price_range");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOriginalPriceRange());
        writer.l("small_image_url");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSmallImageUrl());
        writer.l("medium_image_url");
        this.nullableStringAdapter.toJson(writer, (q) value_.getMediumImageUrl());
        writer.l("large_image_url");
        this.nullableStringAdapter.toJson(writer, (q) value_.getLargeImageUrl());
        writer.l("x_large_image_url");
        this.nullableStringAdapter.toJson(writer, (q) value_.getXLargeImageUrl());
        writer.l("image_url");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDetailImageUrl());
        writer.l("left");
        this.nullableFloatAdapter.toJson(writer, (q) value_.getLeft());
        writer.l("top");
        this.nullableFloatAdapter.toJson(writer, (q) value_.getTop());
        writer.l("width");
        this.nullableFloatAdapter.toJson(writer, (q) value_.getWidth());
        writer.l("height");
        this.nullableFloatAdapter.toJson(writer, (q) value_.getHeight());
        writer.l("item_type");
        this.nullableIntAdapter.toJson(writer, (q) value_.getItemType());
        writer.l("page");
        this.nullableIntAdapter.toJson(writer, (q) value_.getPage());
        writer.l("page_width");
        this.nullableFloatAdapter.toJson(writer, (q) value_.getPageWidth());
        writer.l("page_height");
        this.nullableFloatAdapter.toJson(writer, (q) value_.getPageHeight());
        writer.l("page_relative_left_offset");
        this.nullableFloatAdapter.toJson(writer, (q) value_.getPageRelativeLeftOffset());
        writer.l("page_relative_top_offset");
        this.nullableFloatAdapter.toJson(writer, (q) value_.getPageRelativeTopOffset());
        writer.l("images");
        this.nullableListOfStringAdapter.toJson(writer, (q) value_.o());
        writer.l("page_destination");
        this.nullableIntAdapter.toJson(writer, (q) value_.getPageDestination());
        writer.l("disclaimer_text");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDisclaimerText());
        writer.l("web_url");
        this.nullableStringAdapter.toJson(writer, (q) value_.getWebUrl());
        writer.l("video_url");
        this.nullableStringAdapter.toJson(writer, (q) value_.getVideoUrl());
        writer.l("video_type");
        this.nullableIntAdapter.toJson(writer, (q) value_.getVideoType());
        writer.l("meijerOfferIdsList");
        this.nullableMutableListOfLongAdapter.toJson(writer, (q) value_.u());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FlippWeeklyAdItemJson");
        sb2.append(')');
        return sb2.toString();
    }
}
