package Mu;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes10.dex */
public final class a extends AtomicReferenceArray<Ju.b> implements Ju.b {
    @Override // Ju.b
    public void dispose() {
        Ju.b andSet;
        if (get(0) != d.DISPOSED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                Ju.b bVar = get(i10);
                d dVar = d.DISPOSED;
                if (bVar != dVar && (andSet = getAndSet(i10, dVar)) != dVar && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return get(0) == d.DISPOSED;
    }

    public a(int i10) {
        super(i10);
    }

    public boolean a(int i10, Ju.b bVar) {
        Ju.b bVar2;
        do {
            bVar2 = get(i10);
            if (bVar2 == d.DISPOSED) {
                bVar.dispose();
                return false;
            }
        } while (!compareAndSet(i10, bVar2, bVar));
        if (bVar2 != null) {
            bVar2.dispose();
            return true;
        }
        return true;
    }
}
