package Qu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class h extends AtomicReference<Nu.b> implements Nu.b {
    public h() {
    }

    public h(Nu.b bVar) {
        lazySet(bVar);
    }

    public boolean a(Nu.b bVar) {
        return d.e(this, bVar);
    }

    public boolean b(Nu.b bVar) {
        return d.m(this, bVar);
    }

    @Override // Nu.b
    public void dispose() {
        d.a(this);
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return d.b(get());
    }
}
