package Mu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class h extends AtomicReference<Ju.b> implements Ju.b {
    public h() {
    }

    public h(Ju.b bVar) {
        lazySet(bVar);
    }

    public boolean a(Ju.b bVar) {
        return d.e(this, bVar);
    }

    public boolean b(Ju.b bVar) {
        return d.m(this, bVar);
    }

    @Override // Ju.b
    public void dispose() {
        d.a(this);
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return d.b(get());
    }
}
