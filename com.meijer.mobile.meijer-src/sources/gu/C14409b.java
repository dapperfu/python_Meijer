package gu;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import java.io.IOException;

/* renamed from: gu.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14409b<T> extends h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final h<T> f134469a;

    @Override // com.squareup.moshi.h
    public void toJson(q qVar, T t10) throws IOException {
        if (t10 == null) {
            qVar.m();
        } else {
            this.f134469a.toJson(qVar, (q) t10);
        }
    }

    public String toString() {
        return this.f134469a + ".nullSafe()";
    }

    public C14409b(h<T> hVar) {
        this.f134469a = hVar;
    }

    @Override // com.squareup.moshi.h
    public T fromJson(k kVar) throws IOException {
        if (kVar.l() == k.c.NULL) {
            return (T) kVar.i();
        }
        return this.f134469a.fromJson(kVar);
    }
}
