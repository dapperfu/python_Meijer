package hh;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes8.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private gh.q f135521a;

    /* renamed from: b, reason: collision with root package name */
    private int f135522b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f135523c = false;

    /* renamed from: d, reason: collision with root package name */
    private q f135524d = new n();

    public gh.q b(boolean z10) {
        gh.q qVar = this.f135521a;
        if (qVar == null) {
            return null;
        }
        return z10 ? qVar.b() : qVar;
    }

    public int c() {
        return this.f135522b;
    }

    public Rect d(gh.q qVar) {
        return this.f135524d.d(qVar, this.f135521a);
    }

    public void e(q qVar) {
        this.f135524d = qVar;
    }

    public m(int i10, gh.q qVar) {
        this.f135522b = i10;
        this.f135521a = qVar;
    }

    public gh.q a(List<gh.q> list, boolean z10) {
        return this.f135524d.b(list, b(z10));
    }
}
