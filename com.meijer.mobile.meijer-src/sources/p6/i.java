package p6;

import android.graphics.PointF;
import java.util.List;
import k6.AbstractC15093a;
import w6.C17845a;

/* loaded from: classes4.dex */
public class i implements o<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final C16407b f156163a;

    /* renamed from: b, reason: collision with root package name */
    private final C16407b f156164b;

    @Override // p6.o
    public AbstractC15093a<PointF, PointF> a() {
        return new k6.n(this.f156163a.a(), this.f156164b.a());
    }

    @Override // p6.o
    public List<C17845a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p6.o
    public boolean g() {
        return this.f156163a.g() && this.f156164b.g();
    }

    public i(C16407b c16407b, C16407b c16407b2) {
        this.f156163a = c16407b;
        this.f156164b = c16407b2;
    }
}
