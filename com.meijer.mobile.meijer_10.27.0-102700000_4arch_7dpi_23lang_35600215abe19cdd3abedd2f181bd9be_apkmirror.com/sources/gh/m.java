package gh;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes7.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private fh.q f133455a;

    /* renamed from: b, reason: collision with root package name */
    private int f133456b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f133457c = false;

    /* renamed from: d, reason: collision with root package name */
    private q f133458d = new n();

    public fh.q b(boolean z10) {
        fh.q qVar = this.f133455a;
        if (qVar == null) {
            return null;
        }
        return z10 ? qVar.b() : qVar;
    }

    public int c() {
        return this.f133456b;
    }

    public Rect d(fh.q qVar) {
        return this.f133458d.d(qVar, this.f133455a);
    }

    public void e(q qVar) {
        this.f133458d = qVar;
    }

    public m(int i10, fh.q qVar) {
        this.f133456b = i10;
        this.f133455a = qVar;
    }

    public fh.q a(List<fh.q> list, boolean z10) {
        return this.f133458d.b(list, b(z10));
    }
}
