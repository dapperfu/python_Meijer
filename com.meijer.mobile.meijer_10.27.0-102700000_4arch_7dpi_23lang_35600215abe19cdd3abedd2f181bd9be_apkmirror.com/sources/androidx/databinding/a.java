package androidx.databinding;

import androidx.databinding.h;

/* loaded from: classes.dex */
public class a implements h {
    private transient o mCallbacks;

    @Override // androidx.databinding.h
    public void addOnPropertyChangedCallback(h.a aVar) {
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mCallbacks.a(aVar);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                o oVar = this.mCallbacks;
                if (oVar == null) {
                    return;
                }
                oVar.d(this, 0, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyPropertyChanged(int i10) {
        synchronized (this) {
            try {
                o oVar = this.mCallbacks;
                if (oVar == null) {
                    return;
                }
                oVar.d(this, i10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.h
    public void removeOnPropertyChangedCallback(h.a aVar) {
        synchronized (this) {
            try {
                o oVar = this.mCallbacks;
                if (oVar == null) {
                    return;
                }
                oVar.j(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
