package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class s extends e {

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f47795d;

    @Override // androidx.camera.core.e, androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        if (this.f47795d.getAndSet(true)) {
            return;
        }
        super.close();
    }

    s(n nVar) {
        super(nVar);
        this.f47795d = new AtomicBoolean(false);
    }
}
