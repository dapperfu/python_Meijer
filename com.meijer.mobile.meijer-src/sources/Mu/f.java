package Mu;

import av.j;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes10.dex */
public final class f implements Ju.b, c {

    /* renamed from: a, reason: collision with root package name */
    List<Ju.b> f20436a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f20437b;

    @Override // Mu.c
    public boolean a(Ju.b bVar) {
        Nu.b.e(bVar, "Disposable item is null");
        if (this.f20437b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f20437b) {
                    return false;
                }
                List<Ju.b> list = this.f20436a;
                if (list != null && list.remove(bVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // Mu.c
    public boolean b(Ju.b bVar) {
        Nu.b.e(bVar, "d is null");
        if (!this.f20437b) {
            synchronized (this) {
                try {
                    if (!this.f20437b) {
                        List linkedList = this.f20436a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f20436a = linkedList;
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

    void d(List<Ju.b> list) {
        if (list == null) {
            return;
        }
        Iterator<Ju.b> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th2) {
                Ku.a.b(th2);
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

    @Override // Ju.b
    public void dispose() {
        if (this.f20437b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f20437b) {
                    return;
                }
                this.f20437b = true;
                List<Ju.b> list = this.f20436a;
                this.f20436a = null;
                d(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this.f20437b;
    }

    @Override // Mu.c
    public boolean c(Ju.b bVar) {
        if (a(bVar)) {
            bVar.dispose();
            return true;
        }
        return false;
    }
}
