package com.meijer.mobile.mperks.networking.api.models;

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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/AutoClaimEnrollRequestJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/mperks/networking/api/models/AutoClaimEnrollRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/mperks/networking/api/models/AutoClaimEnrollRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/mperks/networking/api/models/AutoClaimEnrollRequest;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "booleanAdapter", "Lcom/squareup/moshi/h;", "", "nullableDoubleAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.mperks.networking.api.models.AutoClaimEnrollRequestJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<AutoClaimEnrollRequest> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<AutoClaimEnrollRequest> constructorRef;
    private final h<Double> nullableDoubleAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("enroll", "autoClaimAmount", "autoClaimType");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Boolean> hVarF = moshi.f(Boolean.TYPE, SetsKt.e(), "enroll");
        Intrinsics.i(hVarF, "adapter(...)");
        this.booleanAdapter = hVarF;
        h<Double> hVarF2 = moshi.f(Double.class, SetsKt.e(), "autoClaimAmount");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableDoubleAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "autoClaimType");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AutoClaimEnrollRequest fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Boolean boolFromJson = null;
        Double dFromJson = null;
        String strFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                boolFromJson = this.booleanAdapter.fromJson(reader);
                if (boolFromJson == null) {
                    throw c.w("enroll", "enroll", reader);
                }
            } else if (iZ == 1) {
                dFromJson = this.nullableDoubleAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iZ == 2) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                i10 &= -5;
            }
        }
        reader.d();
        if (i10 == -7) {
            if (boolFromJson != null) {
                return new AutoClaimEnrollRequest(boolFromJson.booleanValue(), dFromJson, strFromJson);
            }
            throw c.o("enroll", "enroll", reader);
        }
        Constructor<AutoClaimEnrollRequest> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = AutoClaimEnrollRequest.class.getDeclaredConstructor(Boolean.TYPE, Double.class, String.class, Integer.TYPE, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        if (boolFromJson == null) {
            throw c.o("enroll", "enroll", reader);
        }
        AutoClaimEnrollRequest autoClaimEnrollRequestNewInstance = declaredConstructor.newInstance(boolFromJson, dFromJson, strFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(autoClaimEnrollRequestNewInstance, "newInstance(...)");
        return autoClaimEnrollRequestNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, AutoClaimEnrollRequest value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("enroll");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getEnroll()));
        writer.l("autoClaimAmount");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getAutoClaimAmount());
        writer.l("autoClaimType");
        this.nullableStringAdapter.toJson(writer, (q) value_.getAutoClaimType());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AutoClaimEnrollRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
