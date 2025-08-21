package com.squareup.moshi;

import com.squareup.moshi.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
final class s<K, V> extends h<Map<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    public static final h.e f127381c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final h<K> f127382a;

    /* renamed from: b, reason: collision with root package name */
    private final h<V> f127383b;

    class a implements h.e {
        a() {
        }

        @Override // com.squareup.moshi.h.e
        public h<?> a(Type type, Set<? extends Annotation> set, t tVar) {
            Class<?> clsG;
            if (!set.isEmpty() || (clsG = x.g(type)) != Map.class) {
                return null;
            }
            Type[] typeArrI = x.i(type, clsG);
            return new s(tVar, typeArrI[0], typeArrI[1]).nullSafe();
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> fromJson(k kVar) throws IOException {
        r rVar = new r();
        kVar.b();
        while (kVar.hasNext()) {
            kVar.p();
            K kFromJson = this.f127382a.fromJson(kVar);
            V vFromJson = this.f127383b.fromJson(kVar);
            V vPut = rVar.put(kFromJson, vFromJson);
            if (vPut != null) {
                throw new JsonDataException("Map key '" + kFromJson + "' has multiple values at path " + kVar.getPath() + ": " + vPut + " and " + vFromJson);
            }
        }
        kVar.d();
        return rVar;
    }

    public String toString() {
        return "JsonAdapter(" + this.f127382a + "=" + this.f127383b + ")";
    }

    s(t tVar, Type type, Type type2) {
        this.f127382a = tVar.d(type);
        this.f127383b = tVar.d(type2);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q qVar, Map<K, V> map) throws IOException {
        qVar.b();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                qVar.w();
                this.f127382a.toJson(qVar, (q) entry.getKey());
                this.f127383b.toJson(qVar, (q) entry.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + qVar.getPath());
            }
        }
        qVar.g();
    }
}
