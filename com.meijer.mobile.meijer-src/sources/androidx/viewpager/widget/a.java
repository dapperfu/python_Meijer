package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final DataSetObservable f59183a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f59184b;

    public abstract void a(ViewGroup viewGroup, int i10, Object obj);

    @Deprecated
    public void b(View view) {
    }

    public abstract int d();

    public int e(Object obj) {
        return -1;
    }

    public CharSequence f(int i10) {
        return null;
    }

    public float g(int i10) {
        return 1.0f;
    }

    public abstract Object h(ViewGroup viewGroup, int i10);

    public abstract boolean i(View view, Object obj);

    public void j() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f59184b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f59183a.notifyChanged();
    }

    public void l(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable m() {
        return null;
    }

    @Deprecated
    public void n(View view, int i10, Object obj) {
    }

    void p(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f59184b = dataSetObserver;
        }
    }

    @Deprecated
    public void q(View view) {
    }

    public void k(DataSetObserver dataSetObserver) {
        this.f59183a.registerObserver(dataSetObserver);
    }

    public void s(DataSetObserver dataSetObserver) {
        this.f59183a.unregisterObserver(dataSetObserver);
    }

    public void c(ViewGroup viewGroup) {
        b(viewGroup);
    }

    public void o(ViewGroup viewGroup, int i10, Object obj) {
        n(viewGroup, i10, obj);
    }

    public void r(ViewGroup viewGroup) {
        q(viewGroup);
    }
}
