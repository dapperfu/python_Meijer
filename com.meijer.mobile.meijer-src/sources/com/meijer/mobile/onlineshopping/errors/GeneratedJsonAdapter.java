package com.meijer.mobile.onlineshopping.errors;

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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/onlineshopping/errors/ErrorsJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/onlineshopping/errors/Errors;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/onlineshopping/errors/Errors;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/onlineshopping/errors/Errors;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lcom/meijer/mobile/onlineshopping/errors/DigitalShoppingApiError;", "listOfDigitalShoppingApiErrorAdapter", "Lcom/squareup/moshi/h;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "errors_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.onlineshopping.errors.ErrorsJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<Errors> {
    private volatile Constructor<Errors> constructorRef;
    private final h<List<DigitalShoppingApiError>> listOfDigitalShoppingApiErrorAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("errors");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<List<DigitalShoppingApiError>> hVarF = moshi.f(x.j(List.class, DigitalShoppingApiError.class), SetsKt.e(), "errors");
        Intrinsics.i(hVarF, "adapter(...)");
        this.listOfDigitalShoppingApiErrorAdapter = hVarF;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Errors fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        List<DigitalShoppingApiError> listFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                listFromJson = this.listOfDigitalShoppingApiErrorAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw C14410c.w("errors", "errors", reader);
                }
                i10 = -2;
            } else {
                continue;
            }
        }
        reader.d();
        if (i10 == -2) {
            Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiError>");
            return new Errors(listFromJson);
        }
        Constructor<Errors> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Errors.class.getDeclaredConstructor(List.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        Errors errorsNewInstance = declaredConstructor.newInstance(listFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(errorsNewInstance, "newInstance(...)");
        return errorsNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, Errors value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("errors");
        this.listOfDigitalShoppingApiErrorAdapter.toJson(writer, (q) value_.a());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Errors");
        sb2.append(')');
        return sb2.toString();
    }
}
