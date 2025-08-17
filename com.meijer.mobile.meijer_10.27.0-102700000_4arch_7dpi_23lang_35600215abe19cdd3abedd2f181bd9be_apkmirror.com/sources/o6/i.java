package o6;

import android.graphics.PointF;
import j6.AbstractC14861a;
import java.util.List;
import v6.C17512a;

/* loaded from: classes4.dex */
public class i implements o<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final C15998b f153171a;

    /* renamed from: b, reason: collision with root package name */
    private final C15998b f153172b;

    @Override // o6.o
    public AbstractC14861a<PointF, PointF> a() {
        return new j6.n(this.f153171a.a(), this.f153172b.a());
    }

    @Override // o6.o
    public List<C17512a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // o6.o
    public boolean g() {
        return this.f153171a.g() && this.f153172b.g();
    }

    public i(C15998b c15998b, C15998b c15998b2) {
        this.f153171a = c15998b;
        this.f153172b = c15998b2;
    }
}
