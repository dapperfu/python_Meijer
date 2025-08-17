package j6;

import android.graphics.Path;
import android.graphics.PointF;
import g6.C14209i;
import v6.C17512a;

/* renamed from: j6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14869i extends C17512a<PointF> {

    /* renamed from: q, reason: collision with root package name */
    private Path f139451q;

    /* renamed from: r, reason: collision with root package name */
    private final C17512a<PointF> f139452r;

    public C14869i(C14209i c14209i, C17512a<PointF> c17512a) {
        super(c14209i, c17512a.f164561b, c17512a.f164562c, c17512a.f164563d, c17512a.f164564e, c17512a.f164565f, c17512a.f164566g, c17512a.f164567h);
        this.f139452r = c17512a;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t10;
        T t11;
        T t12 = this.f164562c;
        boolean z10 = (t12 == 0 || (t11 = this.f164561b) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.f164561b;
        if (t13 == 0 || (t10 = this.f164562c) == 0 || z10) {
            return;
        }
        C17512a<PointF> c17512a = this.f139452r;
        this.f139451q = u6.q.d((PointF) t13, (PointF) t10, c17512a.f164574o, c17512a.f164575p);
    }

    Path k() {
        return this.f139451q;
    }
}
