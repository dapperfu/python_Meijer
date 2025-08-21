package androidx.databinding;

import java.io.Serializable;

/* loaded from: classes.dex */
public class i<T> extends b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private T f54322a;

    public i(T t10) {
        this.f54322a = t10;
    }

    public T M() {
        return this.f54322a;
    }

    public void N(T t10) {
        if (t10 != this.f54322a) {
            this.f54322a = t10;
            notifyChange();
        }
    }

    public i() {
    }
}
