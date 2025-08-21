package gu;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import java.io.IOException;

/* renamed from: gu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14408a<T> extends h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final h<T> f134468a;

    @Override // com.squareup.moshi.h
    public void toJson(q qVar, T t10) throws IOException {
        if (t10 != null) {
            this.f134468a.toJson(qVar, (q) t10);
            return;
        }
        throw new JsonDataException("Unexpected null at " + qVar.getPath());
    }

    public String toString() {
        return this.f134468a + ".nonNull()";
    }

    public C14408a(h<T> hVar) {
        this.f134468a = hVar;
    }

    @Override // com.squareup.moshi.h
    public T fromJson(k kVar) throws IOException {
        if (kVar.l() != k.c.NULL) {
            return this.f134468a.fromJson(kVar);
        }
        throw new JsonDataException("Unexpected null at " + kVar.getPath());
    }
}
