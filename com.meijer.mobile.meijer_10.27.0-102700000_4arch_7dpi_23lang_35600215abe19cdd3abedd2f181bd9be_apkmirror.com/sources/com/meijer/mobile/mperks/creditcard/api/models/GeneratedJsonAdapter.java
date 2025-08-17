package com.meijer.mobile.mperks.creditcard.api.models;

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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "longAdapter", "Lcom/squareup/moshi/h;", "", "intAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsResponseJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<RewardClubTermsResponse> {
    private volatile Constructor<RewardClubTermsResponse> constructorRef;
    private final h<Integer> intAdapter;
    private final h<Long> longAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("termsId", "termsSourceId", "termsCouponId", "termsText", "effectiveDate");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Long> hVarF = moshi.f(Long.TYPE, SetsKt.e(), "termsId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.longAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.TYPE, SetsKt.e(), "termsSourceId");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.intAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "termsText");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.stringAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RewardClubTermsResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Long lFromJson = 0L;
        Long lFromJson2 = null;
        Integer numFromJson = 0;
        String strFromJson = null;
        String strFromJson2 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                lFromJson = this.longAdapter.fromJson(reader);
                if (lFromJson == null) {
                    throw c.w("termsId", "termsId", reader);
                }
                i10 &= -2;
            } else if (iZ == 1) {
                numFromJson = this.intAdapter.fromJson(reader);
                if (numFromJson == null) {
                    throw c.w("termsSourceId", "termsSourceId", reader);
                }
                i10 &= -3;
            } else if (iZ == 2) {
                lFromJson2 = this.longAdapter.fromJson(reader);
                if (lFromJson2 == null) {
                    throw c.w("termsCouponId", "termsCouponId", reader);
                }
                i10 &= -5;
            } else if (iZ == 3) {
                strFromJson2 = this.stringAdapter.fromJson(reader);
                if (strFromJson2 == null) {
                    throw c.w("termsText", "termsText", reader);
                }
                i10 &= -9;
            } else if (iZ == 4) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw c.w("effectiveDate", "effectiveDate", reader);
                }
                i10 &= -17;
            } else {
                continue;
            }
        }
        reader.d();
        if (i10 == -32) {
            long jLongValue = lFromJson.longValue();
            int iIntValue = numFromJson.intValue();
            long jLongValue2 = lFromJson2.longValue();
            Intrinsics.h(strFromJson2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
            return new RewardClubTermsResponse(jLongValue, iIntValue, jLongValue2, strFromJson2, strFromJson);
        }
        String str = strFromJson;
        Constructor<RewardClubTermsResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = c.f134099c;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            declaredConstructor = RewardClubTermsResponse.class.getDeclaredConstructor(cls2, cls3, cls2, String.class, String.class, cls3, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        RewardClubTermsResponse rewardClubTermsResponseNewInstance = declaredConstructor.newInstance(lFromJson, numFromJson, lFromJson2, strFromJson2, str, Integer.valueOf(i10), null);
        Intrinsics.i(rewardClubTermsResponseNewInstance, "newInstance(...)");
        return rewardClubTermsResponseNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, RewardClubTermsResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("termsId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getTermsId()));
        writer.l("termsSourceId");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTermsSourceId()));
        writer.l("termsCouponId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getTermsCouponId()));
        writer.l("termsText");
        this.stringAdapter.toJson(writer, (q) value_.getTermsText());
        writer.l("effectiveDate");
        this.stringAdapter.toJson(writer, (q) value_.getEffectiveDate());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RewardClubTermsResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
