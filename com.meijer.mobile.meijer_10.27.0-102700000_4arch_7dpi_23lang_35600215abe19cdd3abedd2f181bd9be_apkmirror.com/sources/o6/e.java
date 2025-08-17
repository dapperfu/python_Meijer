package o6;

import android.graphics.PointF;
import j6.AbstractC14861a;
import j6.C14870j;
import java.util.List;
import v6.C17512a;

/* loaded from: classes4.dex */
public class e implements o<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final List<C17512a<PointF>> f153170a;

    @Override // o6.o
    public AbstractC14861a<PointF, PointF> a() {
        return this.f153170a.get(0).i() ? new j6.k(this.f153170a) : new C14870j(this.f153170a);
    }

    @Override // o6.o
    public List<C17512a<PointF>> b() {
        return this.f153170a;
    }

    @Override // o6.o
    public boolean g() {
        return this.f153170a.size() == 1 && this.f153170a.get(0).i();
    }

    public e(List<C17512a<PointF>> list) {
        this.f153170a = list;
    }
}
