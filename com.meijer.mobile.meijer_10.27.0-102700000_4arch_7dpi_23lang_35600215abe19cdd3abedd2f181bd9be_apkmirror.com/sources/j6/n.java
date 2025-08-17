package j6;

import android.graphics.PointF;
import java.util.Collections;
import v6.C17512a;
import v6.C17514c;

/* loaded from: classes4.dex */
public class n extends AbstractC14861a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f139465i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f139466j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC14861a<Float, Float> f139467k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC14861a<Float, Float> f139468l;

    /* renamed from: m, reason: collision with root package name */
    protected C17514c<Float> f139469m;

    /* renamed from: n, reason: collision with root package name */
    protected C17514c<Float> f139470n;

    @Override // j6.AbstractC14861a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    public n(AbstractC14861a<Float, Float> abstractC14861a, AbstractC14861a<Float, Float> abstractC14861a2) {
        super(Collections.EMPTY_LIST);
        this.f139465i = new PointF();
        this.f139466j = new PointF();
        this.f139467k = abstractC14861a;
        this.f139468l = abstractC14861a2;
        n(f());
    }

    @Override // j6.AbstractC14861a
    public void n(float f10) {
        this.f139467k.n(f10);
        this.f139468l.n(f10);
        this.f139465i.set(this.f139467k.h().floatValue(), this.f139468l.h().floatValue());
        for (int i10 = 0; i10 < this.f139423a.size(); i10++) {
            this.f139423a.get(i10).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j6.AbstractC14861a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(C17512a<PointF> c17512a, float f10) {
        Float fB;
        C17512a<Float> c17512aB;
        C17512a<Float> c17512aB2;
        Float fB2 = null;
        if (this.f139469m == null || (c17512aB2 = this.f139467k.b()) == null) {
            fB = null;
        } else {
            Float f11 = c17512aB2.f164567h;
            C17514c<Float> c17514c = this.f139469m;
            float f12 = c17512aB2.f164566g;
            fB = c17514c.b(f12, f11 == null ? f12 : f11.floatValue(), c17512aB2.f164561b, c17512aB2.f164562c, this.f139467k.d(), this.f139467k.e(), this.f139467k.f());
        }
        if (this.f139470n != null && (c17512aB = this.f139468l.b()) != null) {
            Float f13 = c17512aB.f164567h;
            C17514c<Float> c17514c2 = this.f139470n;
            float f14 = c17512aB.f164566g;
            fB2 = c17514c2.b(f14, f13 == null ? f14 : f13.floatValue(), c17512aB.f164561b, c17512aB.f164562c, this.f139468l.d(), this.f139468l.e(), this.f139468l.f());
        }
        if (fB == null) {
            this.f139466j.set(this.f139465i.x, 0.0f);
        } else {
            this.f139466j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f139466j;
            pointF.set(pointF.x, this.f139465i.y);
        } else {
            PointF pointF2 = this.f139466j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f139466j;
    }

    public void t(C17514c<Float> c17514c) {
        C17514c<Float> c17514c2 = this.f139469m;
        if (c17514c2 != null) {
            c17514c2.c(null);
        }
        this.f139469m = c17514c;
        if (c17514c != null) {
            c17514c.c(this);
        }
    }

    public void u(C17514c<Float> c17514c) {
        C17514c<Float> c17514c2 = this.f139470n;
        if (c17514c2 != null) {
            c17514c2.c(null);
        }
        this.f139470n = c17514c;
        if (c17514c != null) {
            c17514c.c(this);
        }
    }
}
