package com.meijer.mobile.meijer.activity.checkout.payment.ebt.response;

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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtAcculynkResponseJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<EbtAcculynkResponse> {
    public static final int $stable = 8;
    private volatile Constructor<EbtAcculynkResponse> constructorRef;
    private final h<Integer> nullableIntAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("approvalCode", "tranId", "network", "cvn", "remainingBalanceCash", "cashCurrencyCode", "remainingBalanceSNAP", "snapCurrencyCode", "responseCode", "errorCode", "errorMessage", "token");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "approvalCode");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.class, SetsKt.e(), "remainingBalanceCash");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableIntAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EbtAcculynkResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        Integer numFromJson = null;
        String strFromJson5 = null;
        Integer numFromJson2 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    numFromJson2 = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
                case 8:
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
                case 9:
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -513;
                    break;
                case 10:
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -1025;
                    break;
                case 11:
                    strFromJson10 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -2049;
                    break;
            }
        }
        reader.d();
        if (i10 == -4096) {
            String str = strFromJson7;
            String str2 = strFromJson6;
            Integer num = numFromJson2;
            String str3 = strFromJson5;
            Integer num2 = numFromJson;
            String str4 = strFromJson4;
            return new EbtAcculynkResponse(strFromJson, strFromJson2, strFromJson3, str4, num2, str3, num, str2, str, strFromJson8, strFromJson9, strFromJson10);
        }
        String str5 = strFromJson7;
        String str6 = strFromJson6;
        Integer num3 = numFromJson2;
        String str7 = strFromJson5;
        Integer num4 = numFromJson;
        String str8 = strFromJson4;
        String str9 = strFromJson3;
        String str10 = strFromJson2;
        String str11 = strFromJson;
        Constructor<EbtAcculynkResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = EbtAcculynkResponse.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        EbtAcculynkResponse ebtAcculynkResponseNewInstance = declaredConstructor.newInstance(str11, str10, str9, str8, num4, str7, num3, str6, str5, strFromJson8, strFromJson9, strFromJson10, Integer.valueOf(i10), null);
        Intrinsics.i(ebtAcculynkResponseNewInstance, "newInstance(...)");
        return ebtAcculynkResponseNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, EbtAcculynkResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("approvalCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getApprovalCode());
        writer.l("tranId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTranId());
        writer.l("network");
        this.nullableStringAdapter.toJson(writer, (q) value_.getNetwork());
        writer.l("cvn");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCvn());
        writer.l("remainingBalanceCash");
        this.nullableIntAdapter.toJson(writer, (q) value_.getRemainingBalanceCash());
        writer.l("cashCurrencyCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCashCurrencyCode());
        writer.l("remainingBalanceSNAP");
        this.nullableIntAdapter.toJson(writer, (q) value_.getRemainingBalanceSNAP());
        writer.l("snapCurrencyCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSnapCurrencyCode());
        writer.l("responseCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getResponseCode());
        writer.l("errorCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getErrorCode());
        writer.l("errorMessage");
        this.nullableStringAdapter.toJson(writer, (q) value_.getErrorMessage());
        writer.l("token");
        this.nullableStringAdapter.toJson(writer, (q) value_.getToken());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("EbtAcculynkResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
