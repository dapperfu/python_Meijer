package Qu;

import ev.j;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class f implements Nu.b, c {

    /* renamed from: a, reason: collision with root package name */
    List<Nu.b> f31414a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f31415b;

    @Override // Qu.c
    public boolean a(Nu.b bVar) {
        Ru.b.e(bVar, "d is null");
        if (!this.f31415b) {
            synchronized (this) {
                try {
                    if (!this.f31415b) {
                        List linkedList = this.f31414a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f31414a = linkedList;
                        }
                        linkedList.add(bVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // Qu.c
    public boolean c(Nu.b bVar) {
        Ru.b.e(bVar, "Disposable item is null");
        if (this.f31415b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f31415b) {
                    return false;
                }
                List<Nu.b> list = this.f31414a;
                if (list != null && list.remove(bVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    void d(List<Nu.b> list) {
        if (list == null) {
            return;
        }
        Iterator<Nu.b> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th2) {
                Ou.a.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw j.d((Throwable) arrayList.get(0));
        }
    }

    @Override // Nu.b
    public void dispose() {
        if (this.f31415b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f31415b) {
                    return;
                }
                this.f31415b = true;
                List<Nu.b> list = this.f31414a;
                this.f31414a = null;
                d(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return this.f31415b;
    }

    @Override // Qu.c
    public boolean b(Nu.b bVar) {
        if (c(bVar)) {
            bVar.dispose();
            return true;
        }
        return false;
    }
}
