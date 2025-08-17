package f3;

import d3.C13466a;
import d3.P;
import java.util.ArrayList;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13836a implements InterfaceC13839d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f130624a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<o> f130625b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f130626c;

    /* renamed from: d, reason: collision with root package name */
    private g f130627d;

    protected final void p(g gVar) {
        for (int i10 = 0; i10 < this.f130626c; i10++) {
            this.f130625b.get(i10).g(this, gVar, this.f130624a);
        }
    }

    protected final void n(int i10) {
        g gVar = (g) P.h(this.f130627d);
        for (int i11 = 0; i11 < this.f130626c; i11++) {
            this.f130625b.get(i11).d(this, gVar, this.f130624a, i10);
        }
    }

    protected final void o() {
        g gVar = (g) P.h(this.f130627d);
        for (int i10 = 0; i10 < this.f130626c; i10++) {
            this.f130625b.get(i10).b(this, gVar, this.f130624a);
        }
        this.f130627d = null;
    }

    protected final void q(g gVar) {
        this.f130627d = gVar;
        for (int i10 = 0; i10 < this.f130626c; i10++) {
            this.f130625b.get(i10).a(this, gVar, this.f130624a);
        }
    }

    protected AbstractC13836a(boolean z10) {
        this.f130624a = z10;
    }

    @Override // f3.InterfaceC13839d
    public final void e(o oVar) {
        C13466a.e(oVar);
        if (!this.f130625b.contains(oVar)) {
            this.f130625b.add(oVar);
            this.f130626c++;
        }
    }
}
