package Nu;

import ev.j;
import ev.o;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class a implements b, Qu.c {

    /* renamed from: a, reason: collision with root package name */
    o<b> f22778a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f22779b;

    @Override // Qu.c
    public boolean a(b bVar) {
        Ru.b.e(bVar, "disposable is null");
        if (!this.f22779b) {
            synchronized (this) {
                try {
                    if (!this.f22779b) {
                        o<b> oVar = this.f22778a;
                        if (oVar == null) {
                            oVar = new o<>();
                            this.f22778a = oVar;
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

    @Override // Qu.c
    public boolean c(b bVar) {
        Ru.b.e(bVar, "disposables is null");
        if (this.f22779b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f22779b) {
                    return false;
                }
                o<b> oVar = this.f22778a;
                if (oVar != null && oVar.e(bVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public void d() {
        if (this.f22779b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f22779b) {
                    return;
                }
                o<b> oVar = this.f22778a;
                this.f22778a = null;
                e(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Nu.b
    public void dispose() {
        if (this.f22779b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f22779b) {
                    return;
                }
                this.f22779b = true;
                o<b> oVar = this.f22778a;
                this.f22778a = null;
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
                    Ou.a.b(th2);
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
        if (this.f22779b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f22779b) {
                    return 0;
                }
                o<b> oVar = this.f22778a;
                return oVar != null ? oVar.g() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return this.f22779b;
    }

    @Override // Qu.c
    public boolean b(b bVar) {
        if (c(bVar)) {
            bVar.dispose();
            return true;
        }
        return false;
    }
}
