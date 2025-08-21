package k6;

import android.graphics.Path;
import android.graphics.PointF;
import h6.C14478i;
import w6.C17845a;

/* renamed from: k6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15101i extends C17845a<PointF> {

    /* renamed from: q, reason: collision with root package name */
    private Path f141649q;

    /* renamed from: r, reason: collision with root package name */
    private final C17845a<PointF> f141650r;

    public C15101i(C14478i c14478i, C17845a<PointF> c17845a) {
        super(c14478i, c17845a.f166945b, c17845a.f166946c, c17845a.f166947d, c17845a.f166948e, c17845a.f166949f, c17845a.f166950g, c17845a.f166951h);
        this.f141650r = c17845a;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t10;
        T t11;
        T t12 = this.f166946c;
        boolean z10 = (t12 == 0 || (t11 = this.f166945b) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.f166945b;
        if (t13 == 0 || (t10 = this.f166946c) == 0 || z10) {
            return;
        }
        C17845a<PointF> c17845a = this.f141650r;
        this.f141649q = v6.q.d((PointF) t13, (PointF) t10, c17845a.f166958o, c17845a.f166959p);
    }

    Path k() {
        return this.f141649q;
    }
}
