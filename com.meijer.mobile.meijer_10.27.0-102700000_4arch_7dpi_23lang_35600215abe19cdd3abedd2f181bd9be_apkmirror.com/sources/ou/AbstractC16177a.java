package ou;

import J4.a;
import android.view.View;
import java.util.List;
import nu.h;

/* renamed from: ou.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC16177a<T extends J4.a> extends h<b<T>> {
    public abstract void u(T t10, int i10);

    protected abstract T z(View view);

    @Override // nu.h
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void b(b<T> bVar, int i10) {
        throw new RuntimeException("Doesn't get called");
    }

    @Override // nu.h
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(b<T> bVar, int i10, List<Object> list) {
        v(bVar.f155251d, i10, list);
    }

    public void v(T t10, int i10, List<Object> list) {
        u(t10, i10);
    }

    @Override // nu.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b<T> g(View view) {
        return new b<>(z(view));
    }
}
