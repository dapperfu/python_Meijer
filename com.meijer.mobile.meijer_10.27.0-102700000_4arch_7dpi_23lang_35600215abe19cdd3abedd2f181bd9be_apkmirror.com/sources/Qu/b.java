package Qu;

import gv.C14313a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class b extends AtomicReference<Pu.f> implements Nu.b {
    public b(Pu.f fVar) {
        super(fVar);
    }

    @Override // Nu.b
    public void dispose() {
        Pu.f andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            try {
                andSet.cancel();
            } catch (Exception e10) {
                Ou.a.b(e10);
                C14313a.s(e10);
            }
        }
    }

    @Override // Nu.b
    public boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
