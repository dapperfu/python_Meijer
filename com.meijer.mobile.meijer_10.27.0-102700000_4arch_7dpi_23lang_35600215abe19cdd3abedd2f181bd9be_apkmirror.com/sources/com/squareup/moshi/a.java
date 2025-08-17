package com.squareup.moshi;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
final class a implements h.e {

    /* renamed from: a, reason: collision with root package name */
    private final List<f> f126290a;

    /* renamed from: b, reason: collision with root package name */
    private final List<f> f126291b;

    /* renamed from: com.squareup.moshi.a$a, reason: collision with other inner class name */
    class C1981a extends h<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f126292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f126293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f126294c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f126295d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f126296e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Type f126297f;

        C1981a(f fVar, h hVar, t tVar, f fVar2, Set set, Type type) {
            this.f126292a = fVar;
            this.f126293b = hVar;
            this.f126294c = tVar;
            this.f126295d = fVar2;
            this.f126296e = set;
            this.f126297f = type;
        }

        @Override // com.squareup.moshi.h
        public Object fromJson(k kVar) throws IOException {
            f fVar = this.f126295d;
            if (fVar == null) {
                return this.f126293b.fromJson(kVar);
            }
            if (!fVar.f126315g && kVar.l() == k.c.NULL) {
                kVar.i();
                return null;
            }
            try {
                return this.f126295d.b(this.f126294c, kVar);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + kVar.getPath(), cause);
            }
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, Object obj) throws IOException {
            f fVar = this.f126292a;
            if (fVar == null) {
                this.f126293b.toJson(qVar, (q) obj);
                return;
            }
            if (!fVar.f126315g && obj == null) {
                qVar.m();
                return;
            }
            try {
                fVar.e(this.f126294c, qVar, obj);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + qVar.getPath(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f126296e + "(" + this.f126297f + ")";
        }
    }

    class c extends f {

        /* renamed from: h, reason: collision with root package name */
        private h<Object> f126299h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f126300i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f126301j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f126302k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f126303l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f126300i = typeArr;
            this.f126301j = type2;
            this.f126302k = set2;
            this.f126303l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(t tVar, h.e eVar) {
            h<Object> hVarE;
            super.a(tVar, eVar);
            if (x.d(this.f126300i[0], this.f126301j) && this.f126302k.equals(this.f126303l)) {
                hVarE = tVar.i(eVar, this.f126301j, this.f126303l);
            } else {
                hVarE = tVar.e(this.f126301j, this.f126303l);
            }
            this.f126299h = hVarE;
        }

        @Override // com.squareup.moshi.a.f
        public void e(t tVar, q qVar, Object obj) throws IOException, InvocationTargetException {
            this.f126299h.toJson(qVar, (q) c(obj));
        }
    }

    class e extends f {

        /* renamed from: h, reason: collision with root package name */
        h<Object> f126304h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f126305i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f126306j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f126307k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f126308l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f126305i = typeArr;
            this.f126306j = type2;
            this.f126307k = set2;
            this.f126308l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public Object b(t tVar, k kVar) throws IOException, InvocationTargetException {
            return c(this.f126304h.fromJson(kVar));
        }

        @Override // com.squareup.moshi.a.f
        public void a(t tVar, h.e eVar) {
            h<Object> hVarE;
            super.a(tVar, eVar);
            if (x.d(this.f126305i[0], this.f126306j) && this.f126307k.equals(this.f126308l)) {
                hVarE = tVar.i(eVar, this.f126305i[0], this.f126307k);
            } else {
                hVarE = tVar.e(this.f126305i[0], this.f126307k);
            }
            this.f126304h = hVarE;
        }
    }

    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        final Type f126309a;

        /* renamed from: b, reason: collision with root package name */
        final Set<? extends Annotation> f126310b;

        /* renamed from: c, reason: collision with root package name */
        final Object f126311c;

        /* renamed from: d, reason: collision with root package name */
        final Method f126312d;

        /* renamed from: e, reason: collision with root package name */
        final int f126313e;

        /* renamed from: f, reason: collision with root package name */
        final h<?>[] f126314f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f126315g;

        public void a(t tVar, h.e eVar) {
            if (this.f126314f.length > 0) {
                Type[] genericParameterTypes = this.f126312d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f126312d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i10 = this.f126313e; i10 < length; i10++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setL = gu.c.l(parameterAnnotations[i10]);
                    this.f126314f[i10 - this.f126313e] = (x.d(this.f126309a, type) && this.f126310b.equals(setL)) ? tVar.i(eVar, type, setL) : tVar.e(type, setL);
                }
            }
        }

        public Object b(t tVar, k kVar) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        protected Object c(Object obj) throws InvocationTargetException {
            h<?>[] hVarArr = this.f126314f;
            Object[] objArr = new Object[hVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f126312d.invoke(this.f126311c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        protected Object d(Object obj, Object obj2) throws InvocationTargetException {
            h<?>[] hVarArr = this.f126314f;
            Object[] objArr = new Object[hVarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f126312d.invoke(this.f126311c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(t tVar, q qVar, Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f126309a = gu.c.a(type);
            this.f126310b = set;
            this.f126311c = obj;
            this.f126312d = method;
            this.f126313e = i11;
            this.f126314f = new h[i10 - i11];
            this.f126315g = z10;
        }
    }

    static f b(Object obj, Method method) throws SecurityException {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> setK = gu.c.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 1 && genericParameterTypes[0] == k.class && genericReturnType != cls && e(1, genericParameterTypes)) {
            return new d(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            return new e(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, gu.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, gu.c.l(parameterAnnotations[0]), setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    private static boolean e(int i10, Type[] typeArr) {
        int length = typeArr.length;
        while (i10 < length) {
            Type type = typeArr[i10];
            if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != h.class) {
                return false;
            }
            i10++;
        }
        return true;
    }

    static f f(Object obj, Method method) throws SecurityException {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 2 && genericParameterTypes[0] == q.class && genericReturnType == cls && e(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], gu.c.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            Set<? extends Annotation> setK = gu.c.k(method);
            Set<? extends Annotation> setL = gu.c.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], setL, obj, method, genericParameterTypes.length, 1, gu.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setL, setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
    }

    class b extends f {
        b(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // com.squareup.moshi.a.f
        public void e(t tVar, q qVar, Object obj) throws IOException, InvocationTargetException {
            d(qVar, obj);
        }
    }

    class d extends f {
        d(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // com.squareup.moshi.a.f
        public Object b(t tVar, k kVar) throws IOException, InvocationTargetException {
            return c(kVar);
        }
    }

    public static a d(Object obj) throws SecurityException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(w.class)) {
                    f fVarF = f(obj, method);
                    f fVarC = c(arrayList, fVarF.f126309a, fVarF.f126310b);
                    if (fVarC != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + fVarC.f126312d + "\n    " + fVarF.f126312d);
                    }
                    arrayList.add(fVarF);
                }
                if (method.isAnnotationPresent(com.squareup.moshi.f.class)) {
                    f fVarB = b(obj, method);
                    f fVarC2 = c(arrayList2, fVarB.f126309a, fVarB.f126310b);
                    if (fVarC2 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + fVarC2.f126312d + "\n    " + fVarB.f126312d);
                    }
                    arrayList2.add(fVarB);
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    @Override // com.squareup.moshi.h.e
    public h<?> a(Type type, Set<? extends Annotation> set, t tVar) {
        f fVarC = c(this.f126290a, type, set);
        f fVarC2 = c(this.f126291b, type, set);
        h hVarI = null;
        if (fVarC == null && fVarC2 == null) {
            return null;
        }
        if (fVarC == null || fVarC2 == null) {
            try {
                hVarI = tVar.i(this, type, set);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("No " + (fVarC == null ? "@ToJson" : "@FromJson") + " adapter for " + gu.c.u(type, set), e10);
            }
        }
        h hVar = hVarI;
        if (fVarC != null) {
            fVarC.a(tVar, this);
        }
        if (fVarC2 != null) {
            fVarC2.a(tVar, this);
        }
        return new C1981a(fVarC, hVar, tVar, fVarC2, set, type);
    }

    a(List<f> list, List<f> list2) {
        this.f126290a = list;
        this.f126291b = list2;
    }

    private static f c(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = list.get(i10);
            if (x.d(fVar.f126309a, type) && fVar.f126310b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }
}
