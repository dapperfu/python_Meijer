package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionJsonJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionJson;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionJson;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionJson;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "", "intAdapter", "nullableStringAdapter", "", "nullableLongAdapter", "Lcom/meijer/mobile/mperks/networking/api/models/RewardAccountTransactionReasonJson;", "rewardAccountTransactionReasonJsonAdapter", "Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;", "nullableSaleDetailsJsonAdapter", "Lcom/meijer/mobile/mperks/networking/api/models/CouponDetailsJson;", "nullableCouponDetailsJsonAdapter", "Lcom/meijer/mobile/mperks/networking/api/models/AdjustmentDetailsJson;", "nullableAdjustmentDetailsJsonAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.mperks.networking.api.models.MperksTransactionJsonJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<MperksTransactionJson> {
    private volatile Constructor<MperksTransactionJson> constructorRef;
    private final h<Integer> intAdapter;
    private final h<AdjustmentDetailsJson> nullableAdjustmentDetailsJsonAdapter;
    private final h<CouponDetailsJson> nullableCouponDetailsJsonAdapter;
    private final h<Long> nullableLongAdapter;
    private final h<SaleDetailsJson> nullableSaleDetailsJsonAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<RewardAccountTransactionReasonJson> rewardAccountTransactionReasonJsonAdapter;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("transactionId", "transactionType", "points", "postedAt", "label", "rewardId", "reason", "saleDetails", "couponDetails", "adjustmentDetails");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "transactionId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.TYPE, SetsKt.e(), "points");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.intAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "label");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
        h<Long> hVarF4 = moshi.f(Long.class, SetsKt.e(), "rewardId");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableLongAdapter = hVarF4;
        h<RewardAccountTransactionReasonJson> hVarF5 = moshi.f(RewardAccountTransactionReasonJson.class, SetsKt.e(), "reason");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.rewardAccountTransactionReasonJsonAdapter = hVarF5;
        h<SaleDetailsJson> hVarF6 = moshi.f(SaleDetailsJson.class, SetsKt.e(), "saleDetails");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.nullableSaleDetailsJsonAdapter = hVarF6;
        h<CouponDetailsJson> hVarF7 = moshi.f(CouponDetailsJson.class, SetsKt.e(), "couponDetails");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.nullableCouponDetailsJsonAdapter = hVarF7;
        h<AdjustmentDetailsJson> hVarF8 = moshi.f(AdjustmentDetailsJson.class, SetsKt.e(), "adjustmentDetails");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.nullableAdjustmentDetailsJsonAdapter = hVarF8;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public MperksTransactionJson fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        Integer numFromJson = 0;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        Long lFromJson = null;
        RewardAccountTransactionReasonJson rewardAccountTransactionReasonJsonFromJson = null;
        SaleDetailsJson saleDetailsJsonFromJson = null;
        CouponDetailsJson couponDetailsJsonFromJson = null;
        AdjustmentDetailsJson adjustmentDetailsJsonFromJson = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw C14410c.w("transactionId", "transactionId", reader);
                    }
                    break;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw C14410c.w("transactionType", "transactionType", reader);
                    }
                    break;
                case 2:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw C14410c.w("points", "points", reader);
                    }
                    i10 &= -5;
                    break;
                case 3:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw C14410c.w("postedAt", "postedAt", reader);
                    }
                    break;
                case 4:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    lFromJson = this.nullableLongAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    rewardAccountTransactionReasonJsonFromJson = this.rewardAccountTransactionReasonJsonAdapter.fromJson(reader);
                    if (rewardAccountTransactionReasonJsonFromJson == null) {
                        throw C14410c.w("reason", "reason", reader);
                    }
                    i10 &= -65;
                    break;
                case 7:
                    saleDetailsJsonFromJson = this.nullableSaleDetailsJsonAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
                case 8:
                    couponDetailsJsonFromJson = this.nullableCouponDetailsJsonAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
                case 9:
                    adjustmentDetailsJsonFromJson = this.nullableAdjustmentDetailsJsonAdapter.fromJson(reader);
                    i10 &= -513;
                    break;
            }
        }
        reader.d();
        if (i10 == -1013) {
            String str = strFromJson3;
            if (strFromJson == null) {
                throw C14410c.o("transactionId", "transactionId", reader);
            }
            if (strFromJson2 == null) {
                throw C14410c.o("transactionType", "transactionType", reader);
            }
            int iIntValue = numFromJson.intValue();
            if (str == null) {
                throw C14410c.o("postedAt", "postedAt", reader);
            }
            Intrinsics.h(rewardAccountTransactionReasonJsonFromJson, "null cannot be cast to non-null type com.meijer.mobile.mperks.networking.api.models.RewardAccountTransactionReasonJson");
            return new MperksTransactionJson(strFromJson, strFromJson2, iIntValue, str, strFromJson4, lFromJson, rewardAccountTransactionReasonJsonFromJson, saleDetailsJsonFromJson, couponDetailsJsonFromJson, adjustmentDetailsJsonFromJson);
        }
        String str2 = strFromJson3;
        Constructor<MperksTransactionJson> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = C14410c.f134472c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = MperksTransactionJson.class.getDeclaredConstructor(String.class, String.class, cls2, String.class, String.class, Long.class, RewardAccountTransactionReasonJson.class, SaleDetailsJson.class, CouponDetailsJson.class, AdjustmentDetailsJson.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        if (strFromJson == null) {
            throw C14410c.o("transactionId", "transactionId", reader);
        }
        if (strFromJson2 == null) {
            throw C14410c.o("transactionType", "transactionType", reader);
        }
        if (str2 == null) {
            throw C14410c.o("postedAt", "postedAt", reader);
        }
        MperksTransactionJson mperksTransactionJsonNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, numFromJson, str2, strFromJson4, lFromJson, rewardAccountTransactionReasonJsonFromJson, saleDetailsJsonFromJson, couponDetailsJsonFromJson, adjustmentDetailsJsonFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(mperksTransactionJsonNewInstance, "newInstance(...)");
        return mperksTransactionJsonNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, MperksTransactionJson value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("transactionId");
        this.stringAdapter.toJson(writer, (q) value_.getTransactionId());
        writer.l("transactionType");
        this.stringAdapter.toJson(writer, (q) value_.getTransactionType());
        writer.l("points");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getPoints()));
        writer.l("postedAt");
        this.stringAdapter.toJson(writer, (q) value_.getPostedAt());
        writer.l("label");
        this.nullableStringAdapter.toJson(writer, (q) value_.getLabel());
        writer.l("rewardId");
        this.nullableLongAdapter.toJson(writer, (q) value_.getRewardId());
        writer.l("reason");
        this.rewardAccountTransactionReasonJsonAdapter.toJson(writer, (q) value_.getReason());
        writer.l("saleDetails");
        this.nullableSaleDetailsJsonAdapter.toJson(writer, (q) value_.getSaleDetails());
        writer.l("couponDetails");
        this.nullableCouponDetailsJsonAdapter.toJson(writer, (q) value_.getCouponDetails());
        writer.l("adjustmentDetails");
        this.nullableAdjustmentDetailsJsonAdapter.toJson(writer, (q) value_.getAdjustmentDetails());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("MperksTransactionJson");
        sb2.append(')');
        return sb2.toString();
    }
}
