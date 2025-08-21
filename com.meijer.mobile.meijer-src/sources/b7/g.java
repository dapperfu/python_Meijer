package b7;

import android.annotation.SuppressLint;
import b7.h;

/* loaded from: classes4.dex */
public class g extends r7.h<X6.e, Z6.c<?>> implements h {

    /* renamed from: e, reason: collision with root package name */
    private h.a f60079e;

    @Override // b7.h
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // b7.h
    public void e(h.a aVar) {
        this.f60079e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r7.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(Z6.c<?> cVar) {
        return cVar == null ? super.i(null) : cVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r7.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(X6.e eVar, Z6.c<?> cVar) {
        h.a aVar = this.f60079e;
        if (aVar == null || cVar == null) {
            return;
        }
        aVar.c(cVar);
    }

    public g(long j10) {
        super(j10);
    }

    @Override // b7.h
    public /* bridge */ /* synthetic */ Z6.c c(X6.e eVar, Z6.c cVar) {
        return (Z6.c) super.k(eVar, cVar);
    }

    @Override // b7.h
    public /* bridge */ /* synthetic */ Z6.c d(X6.e eVar) {
        return (Z6.c) super.l(eVar);
    }
}
