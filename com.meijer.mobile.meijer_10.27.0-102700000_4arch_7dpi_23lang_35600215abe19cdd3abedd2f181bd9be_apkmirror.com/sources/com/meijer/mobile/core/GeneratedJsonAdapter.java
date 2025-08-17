package com.meijer.mobile.core;

import com.meijer.mobile.core.GetMMAConfigResponse;
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

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/meijer/mobile/core/GetMMAConfigResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/core/GetMMAConfigResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/core/GetMMAConfigResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/core/GetMMAConfigResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "booleanAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "intAdapter", "Lcom/meijer/mobile/core/GetMMAConfigResponse$RatingsPromptCriteria;", "ratingsPromptCriteriaAdapter", "Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "mMAConfigVersionInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.core.GetMMAConfigResponseJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<GetMMAConfigResponse> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<GetMMAConfigResponse> constructorRef;
    private final h<Integer> intAdapter;
    private final h<MMAConfigVersionInfo> mMAConfigVersionInfoAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<GetMMAConfigResponse.RatingsPromptCriteria> ratingsPromptCriteriaAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("forceUserAccountsToUpdate", "updateAppMessage", "updateAppMessageTitle", "enableRatingsPrompt", "percentChanceOfLoggingRatingsPromptEvent", "ratingsPromptCriteria", "currentAppVersionAndroid", "forceAppVersionAndroid", "ld_variation");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Boolean> hVarF = moshi.f(Boolean.TYPE, SetsKt.e(), "forceUserAccountsToUpdate");
        Intrinsics.i(hVarF, "adapter(...)");
        this.booleanAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "updateAppMessage");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
        h<Integer> hVarF3 = moshi.f(Integer.TYPE, SetsKt.e(), "percentChanceOfLoggingRatingsPromptEvent");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.intAdapter = hVarF3;
        h<GetMMAConfigResponse.RatingsPromptCriteria> hVarF4 = moshi.f(GetMMAConfigResponse.RatingsPromptCriteria.class, SetsKt.e(), "ratingsPromptCriteria");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.ratingsPromptCriteriaAdapter = hVarF4;
        h<MMAConfigVersionInfo> hVarF5 = moshi.f(MMAConfigVersionInfo.class, SetsKt.e(), "currentAppVersion");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.mMAConfigVersionInfoAdapter = hVarF5;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetMMAConfigResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        int i10 = -1;
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        Integer numFromJson = 0;
        String strFromJson = null;
        GetMMAConfigResponse.RatingsPromptCriteria ratingsPromptCriteriaFromJson = null;
        MMAConfigVersionInfo mMAConfigVersionInfoFromJson = null;
        MMAConfigVersionInfo mMAConfigVersionInfoFromJson2 = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw c.w("forceUserAccountsToUpdate", "forceUserAccountsToUpdate", reader);
                    }
                    i10 &= -2;
                    break;
                case 1:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw c.w("enableRatingsPrompt", "enableRatingsPrompt", reader);
                    }
                    i10 &= -9;
                    break;
                case 4:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w("percentChanceOfLoggingRatingsPromptEvent", "percentChanceOfLoggingRatingsPromptEvent", reader);
                    }
                    i10 &= -17;
                    break;
                case 5:
                    ratingsPromptCriteriaFromJson = this.ratingsPromptCriteriaAdapter.fromJson(reader);
                    if (ratingsPromptCriteriaFromJson == null) {
                        throw c.w("ratingsPromptCriteria", "ratingsPromptCriteria", reader);
                    }
                    i10 &= -33;
                    break;
                case 6:
                    mMAConfigVersionInfoFromJson = this.mMAConfigVersionInfoAdapter.fromJson(reader);
                    if (mMAConfigVersionInfoFromJson == null) {
                        throw c.w("currentAppVersion", "currentAppVersionAndroid", reader);
                    }
                    i10 &= -65;
                    break;
                case 7:
                    mMAConfigVersionInfoFromJson2 = this.mMAConfigVersionInfoAdapter.fromJson(reader);
                    if (mMAConfigVersionInfoFromJson2 == null) {
                        throw c.w("forceAppVersionAndroid", "forceAppVersionAndroid", reader);
                    }
                    i10 &= -129;
                    break;
                case 8:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
            }
        }
        reader.d();
        if (i10 == -512) {
            boolean zBooleanValue = boolFromJson.booleanValue();
            boolean zBooleanValue2 = boolFromJson2.booleanValue();
            int iIntValue = numFromJson.intValue();
            Intrinsics.h(ratingsPromptCriteriaFromJson, "null cannot be cast to non-null type com.meijer.mobile.core.GetMMAConfigResponse.RatingsPromptCriteria");
            Intrinsics.h(mMAConfigVersionInfoFromJson, "null cannot be cast to non-null type com.meijer.mobile.core.MMAConfigVersionInfo");
            Intrinsics.h(mMAConfigVersionInfoFromJson2, "null cannot be cast to non-null type com.meijer.mobile.core.MMAConfigVersionInfo");
            return new GetMMAConfigResponse(zBooleanValue, strFromJson, strFromJson2, zBooleanValue2, iIntValue, ratingsPromptCriteriaFromJson, mMAConfigVersionInfoFromJson, mMAConfigVersionInfoFromJson2, strFromJson3);
        }
        GetMMAConfigResponse.RatingsPromptCriteria ratingsPromptCriteria = ratingsPromptCriteriaFromJson;
        MMAConfigVersionInfo mMAConfigVersionInfo = mMAConfigVersionInfoFromJson;
        MMAConfigVersionInfo mMAConfigVersionInfo2 = mMAConfigVersionInfoFromJson2;
        Constructor<GetMMAConfigResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = c.f134099c;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            declaredConstructor = GetMMAConfigResponse.class.getDeclaredConstructor(cls2, String.class, String.class, cls2, cls3, GetMMAConfigResponse.RatingsPromptCriteria.class, MMAConfigVersionInfo.class, MMAConfigVersionInfo.class, String.class, cls3, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        GetMMAConfigResponse getMMAConfigResponseNewInstance = declaredConstructor.newInstance(boolFromJson, strFromJson, strFromJson2, boolFromJson2, numFromJson, ratingsPromptCriteria, mMAConfigVersionInfo, mMAConfigVersionInfo2, strFromJson3, Integer.valueOf(i10), null);
        Intrinsics.i(getMMAConfigResponseNewInstance, "newInstance(...)");
        return getMMAConfigResponseNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, GetMMAConfigResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("forceUserAccountsToUpdate");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getForceUserAccountsToUpdate()));
        writer.l("updateAppMessage");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUpdateAppMessage());
        writer.l("updateAppMessageTitle");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUpdateAppMessageTitle());
        writer.l("enableRatingsPrompt");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getEnableRatingsPrompt()));
        writer.l("percentChanceOfLoggingRatingsPromptEvent");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getPercentChanceOfLoggingRatingsPromptEvent()));
        writer.l("ratingsPromptCriteria");
        this.ratingsPromptCriteriaAdapter.toJson(writer, (q) value_.getRatingsPromptCriteria());
        writer.l("currentAppVersionAndroid");
        this.mMAConfigVersionInfoAdapter.toJson(writer, (q) value_.getCurrentAppVersion());
        writer.l("forceAppVersionAndroid");
        this.mMAConfigVersionInfoAdapter.toJson(writer, (q) value_.getForceAppVersionAndroid());
        writer.l("ld_variation");
        this.nullableStringAdapter.toJson(writer, (q) value_.getLaunchDarklyVariation());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GetMMAConfigResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
