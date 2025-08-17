package gu;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class b<T> extends h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final h<T> f134096a;

    @Override // com.squareup.moshi.h
    public void toJson(q qVar, T t10) throws IOException {
        if (t10 == null) {
            qVar.m();
        } else {
            this.f134096a.toJson(qVar, (q) t10);
        }
    }

    public String toString() {
        return this.f134096a + ".nullSafe()";
    }

    public b(h<T> hVar) {
        this.f134096a = hVar;
    }

    @Override // com.squareup.moshi.h
    public T fromJson(k kVar) throws IOException {
        if (kVar.l() == k.c.NULL) {
            return (T) kVar.i();
        }
        return this.f134096a.fromJson(kVar);
    }
}
