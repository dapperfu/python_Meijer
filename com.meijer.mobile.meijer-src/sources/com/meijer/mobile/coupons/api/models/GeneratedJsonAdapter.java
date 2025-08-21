package com.meijer.mobile.coupons.api.models;

import com.meijer.mobile.coupon.model.search.CouponsSortType;
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
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/CouponsRequestJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/coupons/api/models/CouponsRequest;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "nullableCouponsSortTypeAdapter", "Lcom/squareup/moshi/h;", "", "intAdapter", "nullableStringAdapter", "nullableIntAdapter", "", "nullableLongAdapter", "", "nullableBooleanAdapter", "", "listOfLongAdapter", "booleanAdapter", "listOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.coupons.api.models.CouponsRequestJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<CouponsRequest> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<CouponsRequest> constructorRef;
    private final h<Integer> intAdapter;
    private final h<List<Long>> listOfLongAdapter;
    private final h<List<String>> listOfStringAdapter;
    private final h<Boolean> nullableBooleanAdapter;
    private final h<CouponsSortType> nullableCouponsSortTypeAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<Long> nullableLongAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("sortType", "pageSize", "currentPage", "categoryId", "offerClass", "searchCriteria", "zip", "storeId", "clippedFromTS", "ceilingCount", "ceilingDuration", "rewardCouponId", "tagId", "getOfferCountPerDepartment", "upcList", "showClippedCoupons", "showOnlySpecialOffers", "showRedeemedOffers", "offerIds", "displayReasonFilters");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<CouponsSortType> hVarF = moshi.f(CouponsSortType.class, SetsKt.e(), "sortType");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableCouponsSortTypeAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.TYPE, SetsKt.e(), "pageSize");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.intAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "categoryId");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
        h<Integer> hVarF4 = moshi.f(Integer.class, SetsKt.e(), "offerClass");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableIntAdapter = hVarF4;
        h<Long> hVarF5 = moshi.f(Long.class, SetsKt.e(), "rewardCouponId");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableLongAdapter = hVarF5;
        h<Boolean> hVarF6 = moshi.f(Boolean.class, SetsKt.e(), "getOfferCountPerCategory");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.nullableBooleanAdapter = hVarF6;
        h<List<Long>> hVarF7 = moshi.f(x.j(List.class, Long.class), SetsKt.e(), "upcList");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.listOfLongAdapter = hVarF7;
        h<Boolean> hVarF8 = moshi.f(Boolean.TYPE, SetsKt.e(), "showOnlySpecialOffers");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.booleanAdapter = hVarF8;
        h<List<String>> hVarF9 = moshi.f(x.j(List.class, String.class), SetsKt.e(), "displayReasonFilters");
        Intrinsics.i(hVarF9, "adapter(...)");
        this.listOfStringAdapter = hVarF9;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CouponsRequest fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        List<Long> listFromJson = null;
        int i11 = -1;
        Integer numFromJson = 0;
        Integer numFromJson2 = null;
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        List<Long> listFromJson2 = null;
        List<String> listFromJson3 = null;
        CouponsSortType couponsSortTypeFromJson = null;
        String strFromJson = null;
        Integer numFromJson3 = null;
        String strFromJson2 = null;
        Integer numFromJson4 = null;
        Integer numFromJson5 = null;
        Long lFromJson = null;
        String strFromJson3 = null;
        Boolean boolFromJson3 = null;
        Boolean boolFromJson4 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        Integer numFromJson6 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    continue;
                case 0:
                    couponsSortTypeFromJson = this.nullableCouponsSortTypeAdapter.fromJson(reader);
                    i11 &= -2;
                    continue;
                case 1:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw C14410c.w("pageSize", "pageSize", reader);
                    }
                    i11 &= -3;
                    continue;
                case 2:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw C14410c.w("currentPage", "currentPage", reader);
                    }
                    i11 &= -5;
                    continue;
                case 3:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    continue;
                case 4:
                    numFromJson3 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -17;
                    continue;
                case 5:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    continue;
                case 6:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    continue;
                case 7:
                    numFromJson6 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -129;
                    continue;
                case 8:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    continue;
                case 9:
                    numFromJson4 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -513;
                    continue;
                case 10:
                    numFromJson5 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -1025;
                    continue;
                case 11:
                    lFromJson = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -2049;
                    continue;
                case 12:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    continue;
                case 13:
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -8193;
                    continue;
                case 14:
                    listFromJson = this.listOfLongAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw C14410c.w("upcList", "upcList", reader);
                    }
                    i11 &= -16385;
                    continue;
                case 15:
                    boolFromJson4 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 = -32769;
                    break;
                case 16:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw C14410c.w("showOnlySpecialOffers", "showOnlySpecialOffers", reader);
                    }
                    i10 = -65537;
                    break;
                case 17:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw C14410c.w("showRedeemedOffers", "showRedeemedOffers", reader);
                    }
                    i10 = -131073;
                    break;
                case 18:
                    listFromJson2 = this.listOfLongAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw C14410c.w("offerIds", "offerIds", reader);
                    }
                    i10 = -262145;
                    break;
                case 19:
                    listFromJson3 = this.listOfStringAdapter.fromJson(reader);
                    if (listFromJson3 == null) {
                        throw C14410c.w("displayReasonFilters", "displayReasonFilters", reader);
                    }
                    i10 = -524289;
                    break;
            }
            i11 &= i10;
        }
        reader.d();
        if (i11 != -1048576) {
            List<Long> list = listFromJson2;
            List<String> list2 = listFromJson3;
            List<Long> list3 = listFromJson;
            Constructor<CouponsRequest> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                Class<?> cls = C14410c.f134472c;
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                declaredConstructor = CouponsRequest.class.getDeclaredConstructor(CouponsSortType.class, cls2, cls2, String.class, Integer.class, String.class, String.class, Integer.class, String.class, Integer.class, Integer.class, Long.class, String.class, Boolean.class, List.class, Boolean.class, cls3, cls3, List.class, List.class, cls3, cls2, cls);
                this.constructorRef = declaredConstructor;
                Intrinsics.i(declaredConstructor, "also(...)");
            }
            CouponsRequest couponsRequestNewInstance = declaredConstructor.newInstance(couponsSortTypeFromJson, numFromJson, numFromJson2, strFromJson, numFromJson3, strFromJson4, strFromJson5, numFromJson6, strFromJson2, numFromJson4, numFromJson5, lFromJson, strFromJson3, boolFromJson3, list3, boolFromJson4, boolFromJson, boolFromJson2, list, list2, Boolean.FALSE, Integer.valueOf(i11), null);
            Intrinsics.i(couponsRequestNewInstance, "newInstance(...)");
            return couponsRequestNewInstance;
        }
        int iIntValue = numFromJson.intValue();
        int iIntValue2 = numFromJson2.intValue();
        Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Long>");
        boolean zBooleanValue = boolFromJson.booleanValue();
        boolean zBooleanValue2 = boolFromJson2.booleanValue();
        Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Long>");
        Intrinsics.h(listFromJson3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        return new CouponsRequest(couponsSortTypeFromJson, iIntValue, iIntValue2, strFromJson, numFromJson3, strFromJson4, strFromJson5, numFromJson6, strFromJson2, numFromJson4, numFromJson5, lFromJson, strFromJson3, boolFromJson3, listFromJson, boolFromJson4, zBooleanValue, zBooleanValue2, listFromJson2, listFromJson3, false, 1048576, null);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, CouponsRequest value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("sortType");
        this.nullableCouponsSortTypeAdapter.toJson(writer, (q) value_.getSortType());
        writer.l("pageSize");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getPageSize()));
        writer.l("currentPage");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getCurrentPage()));
        writer.l("categoryId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCategoryId());
        writer.l("offerClass");
        this.nullableIntAdapter.toJson(writer, (q) value_.getOfferClass());
        writer.l("searchCriteria");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSearchCriteria());
        writer.l("zip");
        this.nullableStringAdapter.toJson(writer, (q) value_.getZip());
        writer.l("storeId");
        this.nullableIntAdapter.toJson(writer, (q) value_.getStoreId());
        writer.l("clippedFromTS");
        this.nullableStringAdapter.toJson(writer, (q) value_.getClippedFromTS());
        writer.l("ceilingCount");
        this.nullableIntAdapter.toJson(writer, (q) value_.getCeilingCount());
        writer.l("ceilingDuration");
        this.nullableIntAdapter.toJson(writer, (q) value_.getCeilingDuration());
        writer.l("rewardCouponId");
        this.nullableLongAdapter.toJson(writer, (q) value_.getRewardCouponId());
        writer.l("tagId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTagId());
        writer.l("getOfferCountPerDepartment");
        this.nullableBooleanAdapter.toJson(writer, (q) value_.getGetOfferCountPerCategory());
        writer.l("upcList");
        this.listOfLongAdapter.toJson(writer, (q) value_.s());
        writer.l("showClippedCoupons");
        this.nullableBooleanAdapter.toJson(writer, (q) value_.getShowClippedCoupons());
        writer.l("showOnlySpecialOffers");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getShowOnlySpecialOffers()));
        writer.l("showRedeemedOffers");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getShowRedeemedOffers()));
        writer.l("offerIds");
        this.listOfLongAdapter.toJson(writer, (q) value_.i());
        writer.l("displayReasonFilters");
        this.listOfStringAdapter.toJson(writer, (q) value_.f());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CouponsRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
