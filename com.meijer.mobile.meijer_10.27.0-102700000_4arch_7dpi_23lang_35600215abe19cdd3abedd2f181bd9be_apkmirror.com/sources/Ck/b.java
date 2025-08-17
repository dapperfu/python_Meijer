package Ck;

import Pu.g;
import jv.C15079b;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final C15079b<Object> f4261a = C15079b.e();

    public void a(Object obj) {
        this.f4261a.onNext(obj);
    }

    public <T> Nu.b b(Class<T> cls, g<T> gVar) {
        return this.f4261a.ofType(cls).subscribe((g<? super U>) gVar);
    }
}
