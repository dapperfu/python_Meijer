package com.squareup.moshi;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import gu.C14410c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes12.dex */
final class a implements h.e {

    /* renamed from: a, reason: collision with root package name */
    private final List<f> f127242a;

    /* renamed from: b, reason: collision with root package name */
    private final List<f> f127243b;

    /* renamed from: com.squareup.moshi.a$a, reason: collision with other inner class name */
    class C1990a extends h<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f127244a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f127245b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f127246c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f127247d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f127248e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Type f127249f;

        C1990a(f fVar, h hVar, t tVar, f fVar2, Set set, Type type) {
            this.f127244a = fVar;
            this.f127245b = hVar;
            this.f127246c = tVar;
            this.f127247d = fVar2;
            this.f127248e = set;
            this.f127249f = type;
        }

        @Override // com.squareup.moshi.h
        public Object fromJson(k kVar) throws IOException {
            f fVar = this.f127247d;
            if (fVar == null) {
                return this.f127245b.fromJson(kVar);
            }
            if (!fVar.f127267g && kVar.l() == k.c.NULL) {
                kVar.i();
                return null;
            }
            try {
                return this.f127247d.b(this.f127246c, kVar);
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
            f fVar = this.f127244a;
            if (fVar == null) {
                this.f127245b.toJson(qVar, (q) obj);
                return;
            }
            if (!fVar.f127267g && obj == null) {
                qVar.m();
                return;
            }
            try {
                fVar.e(this.f127246c, qVar, obj);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + qVar.getPath(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f127248e + "(" + this.f127249f + ")";
        }
    }

    class c extends f {

        /* renamed from: h, reason: collision with root package name */
        private h<Object> f127251h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f127252i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f127253j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f127254k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f127255l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f127252i = typeArr;
            this.f127253j = type2;
            this.f127254k = set2;
            this.f127255l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(t tVar, h.e eVar) {
            h<Object> hVarE;
            super.a(tVar, eVar);
            if (x.d(this.f127252i[0], this.f127253j) && this.f127254k.equals(this.f127255l)) {
                hVarE = tVar.i(eVar, this.f127253j, this.f127255l);
            } else {
                hVarE = tVar.e(this.f127253j, this.f127255l);
            }
            this.f127251h = hVarE;
        }

        @Override // com.squareup.moshi.a.f
        public void e(t tVar, q qVar, Object obj) throws IOException, InvocationTargetException {
            this.f127251h.toJson(qVar, (q) c(obj));
        }
    }

    class e extends f {

        /* renamed from: h, reason: collision with root package name */
        h<Object> f127256h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f127257i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f127258j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f127259k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f127260l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f127257i = typeArr;
            this.f127258j = type2;
            this.f127259k = set2;
            this.f127260l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public Object b(t tVar, k kVar) throws IOException, InvocationTargetException {
            return c(this.f127256h.fromJson(kVar));
        }

        @Override // com.squareup.moshi.a.f
        public void a(t tVar, h.e eVar) {
            h<Object> hVarE;
            super.a(tVar, eVar);
            if (x.d(this.f127257i[0], this.f127258j) && this.f127259k.equals(this.f127260l)) {
                hVarE = tVar.i(eVar, this.f127257i[0], this.f127259k);
            } else {
                hVarE = tVar.e(this.f127257i[0], this.f127259k);
            }
            this.f127256h = hVarE;
        }
    }

    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        final Type f127261a;

        /* renamed from: b, reason: collision with root package name */
        final Set<? extends Annotation> f127262b;

        /* renamed from: c, reason: collision with root package name */
        final Object f127263c;

        /* renamed from: d, reason: collision with root package name */
        final Method f127264d;

        /* renamed from: e, reason: collision with root package name */
        final int f127265e;

        /* renamed from: f, reason: collision with root package name */
        final h<?>[] f127266f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f127267g;

        public void a(t tVar, h.e eVar) {
            if (this.f127266f.length > 0) {
                Type[] genericParameterTypes = this.f127264d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f127264d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i10 = this.f127265e; i10 < length; i10++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setL = C14410c.l(parameterAnnotations[i10]);
                    this.f127266f[i10 - this.f127265e] = (x.d(this.f127261a, type) && this.f127262b.equals(setL)) ? tVar.i(eVar, type, setL) : tVar.e(type, setL);
                }
            }
        }

        public Object b(t tVar, k kVar) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        protected Object c(Object obj) throws InvocationTargetException {
            h<?>[] hVarArr = this.f127266f;
            Object[] objArr = new Object[hVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f127264d.invoke(this.f127263c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        protected Object d(Object obj, Object obj2) throws InvocationTargetException {
            h<?>[] hVarArr = this.f127266f;
            Object[] objArr = new Object[hVarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f127264d.invoke(this.f127263c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(t tVar, q qVar, Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f127261a = C14410c.a(type);
            this.f127262b = set;
            this.f127263c = obj;
            this.f127264d = method;
            this.f127265e = i11;
            this.f127266f = new h[i10 - i11];
            this.f127267g = z10;
        }
    }

    static f b(Object obj, Method method) throws SecurityException {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> setK = C14410c.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 1 && genericParameterTypes[0] == k.class && genericReturnType != cls && e(1, genericParameterTypes)) {
            return new d(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            return new e(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, C14410c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, C14410c.l(parameterAnnotations[0]), setK);
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
            return new b(genericParameterTypes[1], C14410c.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            Set<? extends Annotation> setK = C14410c.k(method);
            Set<? extends Annotation> setL = C14410c.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], setL, obj, method, genericParameterTypes.length, 1, C14410c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setL, setK);
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
                    f fVarC = c(arrayList, fVarF.f127261a, fVarF.f127262b);
                    if (fVarC != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + fVarC.f127264d + "\n    " + fVarF.f127264d);
                    }
                    arrayList.add(fVarF);
                }
                if (method.isAnnotationPresent(com.squareup.moshi.f.class)) {
                    f fVarB = b(obj, method);
                    f fVarC2 = c(arrayList2, fVarB.f127261a, fVarB.f127262b);
                    if (fVarC2 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + fVarC2.f127264d + "\n    " + fVarB.f127264d);
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
        f fVarC = c(this.f127242a, type, set);
        f fVarC2 = c(this.f127243b, type, set);
        h hVarI = null;
        if (fVarC == null && fVarC2 == null) {
            return null;
        }
        if (fVarC == null || fVarC2 == null) {
            try {
                hVarI = tVar.i(this, type, set);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("No " + (fVarC == null ? "@ToJson" : "@FromJson") + " adapter for " + C14410c.u(type, set), e10);
            }
        }
        h hVar = hVarI;
        if (fVarC != null) {
            fVarC.a(tVar, this);
        }
        if (fVarC2 != null) {
            fVarC2.a(tVar, this);
        }
        return new C1990a(fVarC, hVar, tVar, fVarC2, set, type);
    }

    a(List<f> list, List<f> list2) {
        this.f127242a = list;
        this.f127243b = list2;
    }

    private static f c(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = list.get(i10);
            if (x.d(fVar.f127261a, type) && fVar.f127262b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }
}
