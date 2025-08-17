package com.meijer.mobile.mperks.networking.domain.models;

import com.meijer.mobile.mperks.networking.domain.models.MperkTransaction;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransactionJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "", "intAdapter", "nullableStringAdapter", "", "nullableLongAdapter", "Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction$RewardAccountTransactionReason;", "nullableRewardAccountTransactionReasonAdapter", "Lcom/meijer/mobile/mperks/networking/domain/models/SaleDetails;", "nullableSaleDetailsAdapter", "Lcom/meijer/mobile/mperks/networking/domain/models/CouponDetails;", "nullableCouponDetailsAdapter", "Lcom/meijer/mobile/mperks/networking/domain/models/AdjustmentDetails;", "nullableAdjustmentDetailsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.mperks.networking.domain.models.MperkTransactionJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<MperkTransaction> {
    private volatile Constructor<MperkTransaction> constructorRef;
    private final h<Integer> intAdapter;
    private final h<AdjustmentDetails> nullableAdjustmentDetailsAdapter;
    private final h<CouponDetails> nullableCouponDetailsAdapter;
    private final h<Long> nullableLongAdapter;
    private final h<MperkTransaction.RewardAccountTransactionReason> nullableRewardAccountTransactionReasonAdapter;
    private final h<SaleDetails> nullableSaleDetailsAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("documentType", "transactionId", "transactionType", "points", "postedAt", "label", "rewardId", "reason", "saleDetails", "couponDetails", "adjustmentDetails");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "documentType");
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
        h<MperkTransaction.RewardAccountTransactionReason> hVarF5 = moshi.f(MperkTransaction.RewardAccountTransactionReason.class, SetsKt.e(), "reason");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableRewardAccountTransactionReasonAdapter = hVarF5;
        h<SaleDetails> hVarF6 = moshi.f(SaleDetails.class, SetsKt.e(), "saleDetails");
        Intrinsics.i(hVarF6, "adapter(...)");
        this.nullableSaleDetailsAdapter = hVarF6;
        h<CouponDetails> hVarF7 = moshi.f(CouponDetails.class, SetsKt.e(), "couponDetails");
        Intrinsics.i(hVarF7, "adapter(...)");
        this.nullableCouponDetailsAdapter = hVarF7;
        h<AdjustmentDetails> hVarF8 = moshi.f(AdjustmentDetails.class, SetsKt.e(), "adjustmentDetails");
        Intrinsics.i(hVarF8, "adapter(...)");
        this.nullableAdjustmentDetailsAdapter = hVarF8;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public MperkTransaction fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        Intrinsics.j(reader, "reader");
        reader.b();
        int i11 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        Integer numFromJson = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        Long lFromJson = null;
        MperkTransaction.RewardAccountTransactionReason rewardAccountTransactionReasonFromJson = null;
        SaleDetails saleDetailsFromJson = null;
        CouponDetails couponDetailsFromJson = null;
        AdjustmentDetails adjustmentDetailsFromJson = null;
        while (true) {
            String str = strFromJson;
            String str2 = strFromJson2;
            String str3 = strFromJson3;
            if (!reader.hasNext()) {
                Integer num = numFromJson;
                reader.d();
                if (i11 == -1793) {
                    if (str == null) {
                        throw c.o("documentType", "documentType", reader);
                    }
                    if (str2 == null) {
                        throw c.o("transactionId", "transactionId", reader);
                    }
                    if (str3 == null) {
                        throw c.o("transactionType", "transactionType", reader);
                    }
                    if (num == null) {
                        throw c.o("points", "points", reader);
                    }
                    SaleDetails saleDetails = saleDetailsFromJson;
                    MperkTransaction.RewardAccountTransactionReason rewardAccountTransactionReason = rewardAccountTransactionReasonFromJson;
                    Long l10 = lFromJson;
                    String str4 = strFromJson5;
                    String str5 = strFromJson4;
                    int iIntValue = num.intValue();
                    if (str5 != null) {
                        return new MperkTransaction(str, str2, str3, iIntValue, str5, str4, l10, rewardAccountTransactionReason, saleDetails, couponDetailsFromJson, adjustmentDetailsFromJson);
                    }
                    throw c.o("postedAt", "postedAt", reader);
                }
                SaleDetails saleDetails2 = saleDetailsFromJson;
                MperkTransaction.RewardAccountTransactionReason rewardAccountTransactionReason2 = rewardAccountTransactionReasonFromJson;
                Long l11 = lFromJson;
                String str6 = strFromJson5;
                String str7 = strFromJson4;
                Constructor<MperkTransaction> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class<?> cls = c.f134099c;
                    Class cls2 = Integer.TYPE;
                    i10 = i11;
                    declaredConstructor = MperkTransaction.class.getDeclaredConstructor(String.class, String.class, String.class, cls2, String.class, String.class, Long.class, MperkTransaction.RewardAccountTransactionReason.class, SaleDetails.class, CouponDetails.class, AdjustmentDetails.class, cls2, cls);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.i(declaredConstructor, "also(...)");
                } else {
                    i10 = i11;
                }
                Constructor<MperkTransaction> constructor = declaredConstructor;
                if (str == null) {
                    throw c.o("documentType", "documentType", reader);
                }
                if (str2 == null) {
                    throw c.o("transactionId", "transactionId", reader);
                }
                if (str3 == null) {
                    throw c.o("transactionType", "transactionType", reader);
                }
                if (num == null) {
                    throw c.o("points", "points", reader);
                }
                if (str7 == null) {
                    throw c.o("postedAt", "postedAt", reader);
                }
                MperkTransaction mperkTransactionNewInstance = constructor.newInstance(str, str2, str3, num, str7, str6, l11, rewardAccountTransactionReason2, saleDetails2, couponDetailsFromJson, adjustmentDetailsFromJson, Integer.valueOf(i10), null);
                Intrinsics.i(mperkTransactionNewInstance, "newInstance(...)");
                return mperkTransactionNewInstance;
            }
            Integer num2 = numFromJson;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("documentType", "documentType", reader);
                    }
                    numFromJson = num2;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.w("transactionId", "transactionId", reader);
                    }
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson3 = str3;
                case 2:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw c.w("transactionType", "transactionType", reader);
                    }
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                case 3:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w("points", "points", reader);
                    }
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                case 4:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw c.w("postedAt", "postedAt", reader);
                    }
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                case 5:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                case 6:
                    lFromJson = this.nullableLongAdapter.fromJson(reader);
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                case 7:
                    rewardAccountTransactionReasonFromJson = this.nullableRewardAccountTransactionReasonAdapter.fromJson(reader);
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                case 8:
                    saleDetailsFromJson = this.nullableSaleDetailsAdapter.fromJson(reader);
                    i11 &= -257;
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                case 9:
                    couponDetailsFromJson = this.nullableCouponDetailsAdapter.fromJson(reader);
                    i11 &= -513;
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                case 10:
                    adjustmentDetailsFromJson = this.nullableAdjustmentDetailsAdapter.fromJson(reader);
                    i11 &= -1025;
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                default:
                    numFromJson = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
            }
        }
    }

    @Override // com.squareup.moshi.h
    public void toJson(q writer, MperkTransaction value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("documentType");
        this.stringAdapter.toJson(writer, (q) value_.getDocumentType());
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
        this.nullableRewardAccountTransactionReasonAdapter.toJson(writer, (q) value_.getReason());
        writer.l("saleDetails");
        this.nullableSaleDetailsAdapter.toJson(writer, (q) value_.getSaleDetails());
        writer.l("couponDetails");
        this.nullableCouponDetailsAdapter.toJson(writer, (q) value_.getCouponDetails());
        writer.l("adjustmentDetails");
        this.nullableAdjustmentDetailsAdapter.toJson(writer, (q) value_.getAdjustmentDetails());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("MperkTransaction");
        sb2.append(')');
        return sb2.toString();
    }
}
