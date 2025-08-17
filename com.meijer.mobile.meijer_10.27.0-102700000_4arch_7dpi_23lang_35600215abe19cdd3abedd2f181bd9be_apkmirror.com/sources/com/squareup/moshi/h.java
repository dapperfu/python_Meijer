package com.squareup.moshi;

import com.squareup.moshi.k;
import gu.C14312a;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kw.C15328e;
import kw.InterfaceC15329f;
import kw.InterfaceC15330g;

/* loaded from: classes11.dex */
public abstract class h<T> {

    class a extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f126338a;

        a(h hVar) {
            this.f126338a = hVar;
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            return (T) this.f126338a.fromJson(kVar);
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return this.f126338a.isLenient();
        }

        public String toString() {
            return this.f126338a + ".serializeNulls()";
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            boolean zI = qVar.i();
            qVar.H(true);
            try {
                this.f126338a.toJson(qVar, (q) t10);
            } finally {
                qVar.H(zI);
            }
        }
    }

    class b extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f126340a;

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return true;
        }

        b(h hVar) {
            this.f126340a = hVar;
        }

        public String toString() {
            return this.f126340a + ".lenient()";
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            boolean zH = kVar.h();
            kVar.D(true);
            try {
                return (T) this.f126340a.fromJson(kVar);
            } finally {
                kVar.D(zH);
            }
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            boolean zJ = qVar.j();
            qVar.D(true);
            try {
                this.f126340a.toJson(qVar, (q) t10);
            } finally {
                qVar.D(zJ);
            }
        }
    }

    class c extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f126342a;

        c(h hVar) {
            this.f126342a = hVar;
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return this.f126342a.isLenient();
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            this.f126342a.toJson(qVar, (q) t10);
        }

        public String toString() {
            return this.f126342a + ".failOnUnknown()";
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            boolean zG = kVar.g();
            kVar.B(true);
            try {
                return (T) this.f126342a.fromJson(kVar);
            } finally {
                kVar.B(zG);
            }
        }
    }

    class d extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f126344a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f126345b;

        d(h hVar, String str) {
            this.f126344a = hVar;
            this.f126345b = str;
        }

        @Override // com.squareup.moshi.h
        public T fromJson(k kVar) throws IOException {
            return (T) this.f126344a.fromJson(kVar);
        }

        @Override // com.squareup.moshi.h
        boolean isLenient() {
            return this.f126344a.isLenient();
        }

        public String toString() {
            return this.f126344a + ".indent(\"" + this.f126345b + "\")";
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, T t10) throws IOException {
            String strH = qVar.h();
            qVar.B(this.f126345b);
            try {
                this.f126344a.toJson(qVar, (q) t10);
            } finally {
                qVar.B(strH);
            }
        }
    }

    public interface e {
        h<?> a(Type type, Set<? extends Annotation> set, t tVar);
    }

    public abstract T fromJson(k kVar) throws IOException;

    public final T fromJson(InterfaceC15330g interfaceC15330g) throws IOException {
        return fromJson(k.j(interfaceC15330g));
    }

    boolean isLenient() {
        return false;
    }

    public abstract void toJson(q qVar, T t10) throws IOException;

    public final void toJson(InterfaceC15329f interfaceC15329f, T t10) throws IOException {
        toJson(q.p(interfaceC15329f), (q) t10);
    }

    public final h<T> failOnUnknown() {
        return new c(this);
    }

    public final T fromJson(String str) throws IOException {
        k kVarJ = k.j(new C15328e().I0(str));
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
        return this instanceof C14312a ? this : new C14312a(this);
    }

    public final h<T> nullSafe() {
        return this instanceof gu.b ? this : new gu.b(this);
    }

    public final h<T> serializeNulls() {
        return new a(this);
    }

    public final Object toJsonValue(T t10) {
        p pVar = new p();
        try {
            toJson((q) pVar, (p) t10);
            return pVar.c0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toJson(T t10) {
        C15328e c15328e = new C15328e();
        try {
            toJson((InterfaceC15329f) c15328e, (C15328e) t10);
            return c15328e.n3();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
