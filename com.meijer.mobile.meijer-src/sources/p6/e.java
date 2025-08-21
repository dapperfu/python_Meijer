package p6;

import android.graphics.PointF;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15102j;
import w6.C17845a;

/* loaded from: classes4.dex */
public class e implements o<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final List<C17845a<PointF>> f156162a;

    @Override // p6.o
    public AbstractC15093a<PointF, PointF> a() {
        return this.f156162a.get(0).i() ? new k6.k(this.f156162a) : new C15102j(this.f156162a);
    }

    @Override // p6.o
    public List<C17845a<PointF>> b() {
        return this.f156162a;
    }

    @Override // p6.o
    public boolean g() {
        return this.f156162a.size() == 1 && this.f156162a.get(0).i();
    }

    public e(List<C17845a<PointF>> list) {
        this.f156162a = list;
    }
}
