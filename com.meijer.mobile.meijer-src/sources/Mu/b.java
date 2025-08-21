package Mu;

import cv.C13558a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class b extends AtomicReference<Lu.f> implements Ju.b {
    public b(Lu.f fVar) {
        super(fVar);
    }

    @Override // Ju.b
    public void dispose() {
        Lu.f andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            try {
                andSet.cancel();
            } catch (Exception e10) {
                Ku.a.b(e10);
                C13558a.s(e10);
            }
        }
    }

    @Override // Ju.b
    public boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
