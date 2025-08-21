package com.meijer.mobile.core.error.model.json;

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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBodyJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "", "nullableIntAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "json_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.core.error.model.json.StandardRestErrorBodyJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<StandardRestErrorBody> {
    private volatile Constructor<StandardRestErrorBody> constructorRef;
    private final h<Integer> nullableIntAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("type", "title", "detail", "status", "traceId", "referenceCode", "source");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "type");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.class, SetsKt.e(), "status");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableIntAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "traceId");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public StandardRestErrorBody fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        Integer numFromJson = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw C14410c.w("type", "type", reader);
                    }
                    break;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw C14410c.w("title", "title", reader);
                    }
                    break;
                case 2:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw C14410c.w("detail", "detail", reader);
                    }
                    break;
                case 3:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
            }
        }
        reader.d();
        if (i10 == -121) {
            String str = strFromJson6;
            String str2 = strFromJson5;
            String str3 = strFromJson4;
            Integer num = numFromJson;
            String str4 = strFromJson3;
            String str5 = strFromJson2;
            String str6 = strFromJson;
            if (str6 == null) {
                throw C14410c.o("type", "type", reader);
            }
            if (str5 == null) {
                throw C14410c.o("title", "title", reader);
            }
            if (str4 != null) {
                return new StandardRestErrorBody(str6, str5, str4, num, str3, str2, str);
            }
            throw C14410c.o("detail", "detail", reader);
        }
        String str7 = strFromJson6;
        String str8 = strFromJson5;
        String str9 = strFromJson4;
        Integer num2 = numFromJson;
        String str10 = strFromJson3;
        String str11 = strFromJson2;
        String str12 = strFromJson;
        Constructor<StandardRestErrorBody> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = StandardRestErrorBody.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        Constructor<StandardRestErrorBody> constructor = declaredConstructor;
        if (str12 == null) {
            throw C14410c.o("type", "type", reader);
        }
        if (str11 == null) {
            throw C14410c.o("title", "title", reader);
        }
        if (str10 == null) {
            throw C14410c.o("detail", "detail", reader);
        }
        StandardRestErrorBody standardRestErrorBodyNewInstance = constructor.newInstance(str12, str11, str10, num2, str9, str8, str7, Integer.valueOf(i10), null);
        Intrinsics.i(standardRestErrorBodyNewInstance, "newInstance(...)");
        return standardRestErrorBodyNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, StandardRestErrorBody value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("type");
        this.stringAdapter.toJson(writer, (q) value_.getType());
        writer.l("title");
        this.stringAdapter.toJson(writer, (q) value_.getTitle());
        writer.l("detail");
        this.stringAdapter.toJson(writer, (q) value_.getDetail());
        writer.l("status");
        this.nullableIntAdapter.toJson(writer, (q) value_.getStatus());
        writer.l("traceId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTraceId());
        writer.l("referenceCode");
        this.nullableStringAdapter.toJson(writer, (q) value_.getReferenceCode());
        writer.l("source");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSource());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("StandardRestErrorBody");
        sb2.append(')');
        return sb2.toString();
    }
}
