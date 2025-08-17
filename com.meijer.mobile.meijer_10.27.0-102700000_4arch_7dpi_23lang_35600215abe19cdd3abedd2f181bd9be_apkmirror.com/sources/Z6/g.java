package Z6;

import Z6.h;
import android.annotation.SuppressLint;

/* loaded from: classes4.dex */
public class g extends p7.h<V6.e, X6.c<?>> implements h {

    /* renamed from: e, reason: collision with root package name */
    private h.a f42412e;

    @Override // Z6.h
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // Z6.h
    public void d(h.a aVar) {
        this.f42412e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p7.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(X6.c<?> cVar) {
        return cVar == null ? super.i(null) : cVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p7.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(V6.e eVar, X6.c<?> cVar) {
        h.a aVar = this.f42412e;
        if (aVar == null || cVar == null) {
            return;
        }
        aVar.d(cVar);
    }

    public g(long j10) {
        super(j10);
    }

    @Override // Z6.h
    public /* bridge */ /* synthetic */ X6.c c(V6.e eVar) {
        return (X6.c) super.l(eVar);
    }

    @Override // Z6.h
    public /* bridge */ /* synthetic */ X6.c e(V6.e eVar, X6.c cVar) {
        return (X6.c) super.k(eVar, cVar);
    }
}
