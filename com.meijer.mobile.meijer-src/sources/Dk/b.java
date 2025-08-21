package Dk;

import Lu.g;
import fv.C14269b;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final C14269b<Object> f6313a = C14269b.e();

    public void a(Object obj) {
        this.f6313a.onNext(obj);
    }

    public <T> Ju.b b(Class<T> cls, g<T> gVar) {
        return this.f6313a.ofType(cls).subscribe((g<? super U>) gVar);
    }
}
