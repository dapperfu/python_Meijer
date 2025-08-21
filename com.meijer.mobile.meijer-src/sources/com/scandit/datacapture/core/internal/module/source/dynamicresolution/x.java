package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Function3 f126023a;

    /* renamed from: b, reason: collision with root package name */
    public final Function3 f126024b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f126025c;

    /* renamed from: d, reason: collision with root package name */
    public s f126026d;

    /* renamed from: e, reason: collision with root package name */
    public w f126027e;

    /* renamed from: f, reason: collision with root package name */
    public o f126028f;

    public final synchronized void a(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        if (this.f126025c) {
            return;
        }
        n nVar = new n(frameSource);
        if (!Intrinsics.e(nVar, this.f126028f)) {
            this.f126028f = nVar;
            a();
        }
    }

    public final synchronized void b() {
        if (this.f126025c) {
            return;
        }
        t tVar = t.f126020a;
        if (!Intrinsics.e(tVar, this.f126027e)) {
            this.f126027e = tVar;
            a();
        }
    }

    public final synchronized void c() {
        if (this.f126025c) {
            return;
        }
        this.f126024b.invoke(this.f126027e.a(), this.f126028f.a(), this.f126026d.a());
        this.f126028f = l.f126014a;
        this.f126027e = v.f126022a;
        this.f126026d = r.f126019a;
        this.f126025c = true;
    }

    public x(f start, g stop) {
        Intrinsics.j(start, "start");
        Intrinsics.j(stop, "stop");
        this.f126023a = start;
        this.f126024b = stop;
        this.f126026d = r.f126019a;
        this.f126027e = v.f126022a;
        this.f126028f = l.f126014a;
    }

    public final void a() {
        s sVar = this.f126026d;
        p pVar = sVar instanceof p ? (p) sVar : null;
        if (pVar == null) {
            a(this);
            return;
        }
        w wVar = this.f126027e;
        u uVar = wVar instanceof u ? (u) wVar : null;
        if (uVar == null) {
            a(this);
            return;
        }
        o oVar = this.f126028f;
        m mVar = oVar instanceof m ? (m) oVar : null;
        if (mVar == null) {
            a(this);
        } else {
            this.f126023a.invoke(uVar.f126021a, mVar.f126015a, pVar.f126017a);
        }
    }

    public static void a(x xVar) {
        s sVar = xVar.f126026d;
        xVar.f126024b.invoke(xVar.f126027e.a(), xVar.f126028f.a(), sVar.a());
    }
}
