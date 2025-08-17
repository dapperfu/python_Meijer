package androidx.databinding;

import java.io.Serializable;

/* loaded from: classes.dex */
public class i<T> extends b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private T f54098a;

    public i(T t10) {
        this.f54098a = t10;
    }

    public T M() {
        return this.f54098a;
    }

    public void N(T t10) {
        if (t10 != this.f54098a) {
            this.f54098a = t10;
            notifyChange();
        }
    }

    public i() {
    }
}
