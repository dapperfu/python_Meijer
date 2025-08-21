package Ju;

import av.j;
import av.o;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class a implements b, Mu.c {

    /* renamed from: a, reason: collision with root package name */
    o<b> f16234a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f16235b;

    @Override // Mu.c
    public boolean a(b bVar) {
        Nu.b.e(bVar, "disposables is null");
        if (this.f16235b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f16235b) {
                    return false;
                }
                o<b> oVar = this.f16234a;
                if (oVar != null && oVar.e(bVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // Mu.c
    public boolean b(b bVar) {
        Nu.b.e(bVar, "disposable is null");
        if (!this.f16235b) {
            synchronized (this) {
                try {
                    if (!this.f16235b) {
                        o<b> oVar = this.f16234a;
                        if (oVar == null) {
                            oVar = new o<>();
                            this.f16234a = oVar;
                        }
                        oVar.a(bVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        bVar.dispose();
        return false;
    }

    public void d() {
        if (this.f16235b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f16235b) {
                    return;
                }
                o<b> oVar = this.f16234a;
                this.f16234a = null;
                e(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Ju.b
    public void dispose() {
        if (this.f16235b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f16235b) {
                    return;
                }
                this.f16235b = true;
                o<b> oVar = this.f16234a;
                this.f16234a = null;
                e(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e(o<b> oVar) {
        if (oVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : oVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).dispose();
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw j.d((Throwable) arrayList.get(0));
        }
    }

    public int f() {
        if (this.f16235b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f16235b) {
                    return 0;
                }
                o<b> oVar = this.f16234a;
                return oVar != null ? oVar.g() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this.f16235b;
    }

    @Override // Mu.c
    public boolean c(b bVar) {
        if (a(bVar)) {
            bVar.dispose();
            return true;
        }
        return false;
    }
}
