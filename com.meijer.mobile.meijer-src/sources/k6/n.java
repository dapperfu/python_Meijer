package k6;

import android.graphics.PointF;
import java.util.Collections;
import w6.C17845a;
import w6.C17847c;

/* loaded from: classes4.dex */
public class n extends AbstractC15093a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f141663i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f141664j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC15093a<Float, Float> f141665k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC15093a<Float, Float> f141666l;

    /* renamed from: m, reason: collision with root package name */
    protected C17847c<Float> f141667m;

    /* renamed from: n, reason: collision with root package name */
    protected C17847c<Float> f141668n;

    @Override // k6.AbstractC15093a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    public n(AbstractC15093a<Float, Float> abstractC15093a, AbstractC15093a<Float, Float> abstractC15093a2) {
        super(Collections.EMPTY_LIST);
        this.f141663i = new PointF();
        this.f141664j = new PointF();
        this.f141665k = abstractC15093a;
        this.f141666l = abstractC15093a2;
        n(f());
    }

    @Override // k6.AbstractC15093a
    public void n(float f10) {
        this.f141665k.n(f10);
        this.f141666l.n(f10);
        this.f141663i.set(this.f141665k.h().floatValue(), this.f141666l.h().floatValue());
        for (int i10 = 0; i10 < this.f141621a.size(); i10++) {
            this.f141621a.get(i10).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k6.AbstractC15093a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(C17845a<PointF> c17845a, float f10) {
        Float fB;
        C17845a<Float> c17845aB;
        C17845a<Float> c17845aB2;
        Float fB2 = null;
        if (this.f141667m == null || (c17845aB2 = this.f141665k.b()) == null) {
            fB = null;
        } else {
            Float f11 = c17845aB2.f166951h;
            C17847c<Float> c17847c = this.f141667m;
            float f12 = c17845aB2.f166950g;
            fB = c17847c.b(f12, f11 == null ? f12 : f11.floatValue(), c17845aB2.f166945b, c17845aB2.f166946c, this.f141665k.d(), this.f141665k.e(), this.f141665k.f());
        }
        if (this.f141668n != null && (c17845aB = this.f141666l.b()) != null) {
            Float f13 = c17845aB.f166951h;
            C17847c<Float> c17847c2 = this.f141668n;
            float f14 = c17845aB.f166950g;
            fB2 = c17847c2.b(f14, f13 == null ? f14 : f13.floatValue(), c17845aB.f166945b, c17845aB.f166946c, this.f141666l.d(), this.f141666l.e(), this.f141666l.f());
        }
        if (fB == null) {
            this.f141664j.set(this.f141663i.x, 0.0f);
        } else {
            this.f141664j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f141664j;
            pointF.set(pointF.x, this.f141663i.y);
        } else {
            PointF pointF2 = this.f141664j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f141664j;
    }

    public void t(C17847c<Float> c17847c) {
        C17847c<Float> c17847c2 = this.f141667m;
        if (c17847c2 != null) {
            c17847c2.c(null);
        }
        this.f141667m = c17847c;
        if (c17847c != null) {
            c17847c.c(this);
        }
    }

    public void u(C17847c<Float> c17847c) {
        C17847c<Float> c17847c2 = this.f141668n;
        if (c17847c2 != null) {
            c17847c2.c(null);
        }
        this.f141668n = c17847c;
        if (c17847c != null) {
            c17847c.c(this);
        }
    }
}
