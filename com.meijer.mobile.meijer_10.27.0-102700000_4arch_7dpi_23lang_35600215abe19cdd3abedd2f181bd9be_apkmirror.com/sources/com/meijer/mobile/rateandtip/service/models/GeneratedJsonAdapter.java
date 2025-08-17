package com.meijer.mobile.rateandtip.service.models;

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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/rateandtip/service/models/RateAndTipShopperErrorResponseJsonJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/rateandtip/service/models/RateAndTipShopperErrorResponseJson;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/rateandtip/service/models/RateAndTipShopperErrorResponseJson;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/rateandtip/service/models/RateAndTipShopperErrorResponseJson;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "booleanAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.rateandtip.service.models.RateAndTipShopperErrorResponseJsonJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<RateAndTipShopperErrorResponseJson> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<RateAndTipShopperErrorResponseJson> constructorRef;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("success", "error_type", "message");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Boolean> hVarF = moshi.f(Boolean.TYPE, SetsKt.e(), "success");
        Intrinsics.i(hVarF, "adapter(...)");
        this.booleanAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "errorType");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RateAndTipShopperErrorResponseJson fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Boolean boolFromJson = Boolean.FALSE;
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                boolFromJson = this.booleanAdapter.fromJson(reader);
                if (boolFromJson == null) {
                    throw c.w("success", "success", reader);
                }
                i10 &= -2;
            } else if (iZ == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iZ == 2) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -5;
            }
        }
        reader.d();
        if (i10 == -8) {
            return new RateAndTipShopperErrorResponseJson(boolFromJson.booleanValue(), strFromJson, strFromJson2);
        }
        Constructor<RateAndTipShopperErrorResponseJson> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = RateAndTipShopperErrorResponseJson.class.getDeclaredConstructor(Boolean.TYPE, String.class, String.class, Integer.TYPE, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        RateAndTipShopperErrorResponseJson rateAndTipShopperErrorResponseJsonNewInstance = declaredConstructor.newInstance(boolFromJson, strFromJson, strFromJson2, Integer.valueOf(i10), null);
        Intrinsics.i(rateAndTipShopperErrorResponseJsonNewInstance, "newInstance(...)");
        return rateAndTipShopperErrorResponseJsonNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, RateAndTipShopperErrorResponseJson value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("success");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getSuccess()));
        writer.l("error_type");
        this.nullableStringAdapter.toJson(writer, (q) value_.getErrorType());
        writer.l("message");
        this.nullableStringAdapter.toJson(writer, (q) value_.getMessage());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RateAndTipShopperErrorResponseJson");
        sb2.append(')');
        return sb2.toString();
    }
}
