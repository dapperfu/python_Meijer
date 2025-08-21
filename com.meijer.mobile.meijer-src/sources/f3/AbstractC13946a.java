package f3;

import d3.C13599a;
import d3.P;
import java.util.ArrayList;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13946a implements InterfaceC13949d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f131458a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<o> f131459b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f131460c;

    /* renamed from: d, reason: collision with root package name */
    private g f131461d;

    protected final void p(g gVar) {
        for (int i10 = 0; i10 < this.f131460c; i10++) {
            this.f131459b.get(i10).g(this, gVar, this.f131458a);
        }
    }

    protected final void n(int i10) {
        g gVar = (g) P.h(this.f131461d);
        for (int i11 = 0; i11 < this.f131460c; i11++) {
            this.f131459b.get(i11).d(this, gVar, this.f131458a, i10);
        }
    }

    protected final void o() {
        g gVar = (g) P.h(this.f131461d);
        for (int i10 = 0; i10 < this.f131460c; i10++) {
            this.f131459b.get(i10).b(this, gVar, this.f131458a);
        }
        this.f131461d = null;
    }

    protected final void q(g gVar) {
        this.f131461d = gVar;
        for (int i10 = 0; i10 < this.f131460c; i10++) {
            this.f131459b.get(i10).a(this, gVar, this.f131458a);
        }
    }

    protected AbstractC13946a(boolean z10) {
        this.f131458a = z10;
    }

    @Override // f3.InterfaceC13949d
    public final void e(o oVar) {
        C13599a.e(oVar);
        if (!this.f131459b.contains(oVar)) {
            this.f131459b.add(oVar);
            this.f131460c++;
        }
    }
}
