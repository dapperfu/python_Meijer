package com.squareup.moshi;

import com.squareup.moshi.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes12.dex */
final class b extends h<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final h.e f127268c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f127269a;

    /* renamed from: b, reason: collision with root package name */
    private final h<Object> f127270b;

    class a implements h.e {
        a() {
        }

        @Override // com.squareup.moshi.h.e
        public h<?> a(Type type, Set<? extends Annotation> set, t tVar) {
            Type typeA = x.a(type);
            if (typeA == null || !set.isEmpty()) {
                return null;
            }
            return new b(x.g(typeA), tVar.d(typeA)).nullSafe();
        }
    }

    @Override // com.squareup.moshi.h
    public Object fromJson(k kVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        ArrayList arrayList = new ArrayList();
        kVar.a();
        while (kVar.hasNext()) {
            arrayList.add(this.f127270b.fromJson(kVar));
        }
        kVar.c();
        Object objNewInstance = Array.newInstance(this.f127269a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    public String toString() {
        return this.f127270b + ".array()";
    }

    b(Class<?> cls, h<Object> hVar) {
        this.f127269a = cls;
        this.f127270b = hVar;
    }

    @Override // com.squareup.moshi.h
    public void toJson(q qVar, Object obj) throws IOException {
        qVar.a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f127270b.toJson(qVar, (q) Array.get(obj, i10));
        }
        qVar.d();
    }
}
