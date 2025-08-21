package ku;

import K4.a;
import android.view.View;
import java.util.List;
import ju.h;

/* renamed from: ku.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC15424a<T extends K4.a> extends h<b<T>> {
    public abstract void u(T t10, int i10);

    protected abstract T z(View view);

    @Override // ju.h
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void b(b<T> bVar, int i10) {
        throw new RuntimeException("Doesn't get called");
    }

    @Override // ju.h
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(b<T> bVar, int i10, List<Object> list) {
        v(bVar.f148917d, i10, list);
    }

    public void v(T t10, int i10, List<Object> list) {
        u(t10, i10);
    }

    @Override // ju.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b<T> f(View view) {
        return new b<>(z(view));
    }
}
