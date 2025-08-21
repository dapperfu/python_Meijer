package com.squareup.moshi;

import com.squareup.moshi.k;
import gu.C14408a;
import gu.C14409b;
import gw.C14416e;
import gw.InterfaceC14417f;
import gw.InterfaceC14418g;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes12.dex */
public abstract class h<T> {

    class a extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f127290a;

        a(h hVar) {
            this.f127290a = hVar;
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            return (T) this.f127290a.fromJson(kVar);
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return this.f127290a.isLenient();
        }

        public String toString() {
            return this.f127290a + ".serializeNulls()";
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            boolean zI = qVar.i();
            qVar.H(true);
            try {
                this.f127290a.toJson(qVar, (q) t10);
            } finally {
                qVar.H(zI);
            }
        }
    }

    class b extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f127292a;

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return true;
        }

        b(h hVar) {
            this.f127292a = hVar;
        }

        public String toString() {
            return this.f127292a + ".lenient()";
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            boolean zH = kVar.h();
            kVar.D(true);
            try {
                return (T) this.f127292a.fromJson(kVar);
            } finally {
                kVar.D(zH);
            }
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            boolean zJ = qVar.j();
            qVar.D(true);
            try {
                this.f127292a.toJson(qVar, (q) t10);
            } finally {
                qVar.D(zJ);
            }
        }
    }

    class c extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f127294a;

        c(h hVar) {
            this.f127294a = hVar;
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return this.f127294a.isLenient();
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            this.f127294a.toJson(qVar, (q) t10);
        }

        public String toString() {
            return this.f127294a + ".failOnUnknown()";
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            boolean zG = kVar.g();
            kVar.B(true);
            try {
                return (T) this.f127294a.fromJson(kVar);
            } finally {
                kVar.B(zG);
            }
        }
    }

    class d extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f127296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f127297b;

        d(h hVar, String str) {
            this.f127296a = hVar;
            this.f127297b = str;
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            return (T) this.f127296a.fromJson(kVar);
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return this.f127296a.isLenient();
        }

        public String toString() {
            return this.f127296a + ".indent(\"" + this.f127297b + "\")";
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            String strH = qVar.h();
            qVar.B(this.f127297b);
            try {
                this.f127296a.toJson(qVar, (q) t10);
            } finally {
                qVar.B(strH);
            }
        }
    }

    public interface e {
        h<?> a(Type type, Set<? extends Annotation> set, t tVar);
    }

    public abstract T fromJson(k kVar) throws IOException;

    public final T fromJson(InterfaceC14418g interfaceC14418g) throws IOException {
        return fromJson(k.j(interfaceC14418g));
    }

    boolean isLenient() {
        return false;
    }

    public abstract void toJson(q qVar, T t10) throws IOException;

    public final void toJson(InterfaceC14417f interfaceC14417f, T t10) throws IOException {
        toJson(q.p(interfaceC14417f), (q) t10);
    }

    public final h<T> failOnUnknown() {
        return new c(this);
    }

    public final T fromJson(String str) throws IOException {
        k kVarJ = k.j(new C14416e().G0(str));
        T tFromJson = fromJson(kVarJ);
        if (isLenient() || kVarJ.l() == k.c.END_DOCUMENT) {
            return tFromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new o(obj));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public h<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public final h<T> lenient() {
        return new b(this);
    }

    public final h<T> nonNull() {
        return this instanceof C14408a ? this : new C14408a(this);
    }

    public final h<T> nullSafe() {
        return this instanceof C14409b ? this : new C14409b(this);
    }

    public final h<T> serializeNulls() {
        return new a(this);
    }

    public final Object toJsonValue(T t10) {
        p pVar = new p();
        try {
            toJson((q) pVar, (p) t10);
            return pVar.b0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toJson(T t10) {
        C14416e c14416e = new C14416e();
        try {
            toJson((InterfaceC14417f) c14416e, (C14416e) t10);
            return c14416e.n3();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
