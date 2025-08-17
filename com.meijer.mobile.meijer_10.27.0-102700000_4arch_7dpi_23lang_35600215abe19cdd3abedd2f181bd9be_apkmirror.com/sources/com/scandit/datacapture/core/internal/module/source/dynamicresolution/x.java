package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Function3 f125071a;

    /* renamed from: b, reason: collision with root package name */
    public final Function3 f125072b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f125073c;

    /* renamed from: d, reason: collision with root package name */
    public s f125074d;

    /* renamed from: e, reason: collision with root package name */
    public w f125075e;

    /* renamed from: f, reason: collision with root package name */
    public o f125076f;

    public final synchronized void a(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        if (this.f125073c) {
            return;
        }
        n nVar = new n(frameSource);
        if (!Intrinsics.e(nVar, this.f125076f)) {
            this.f125076f = nVar;
            a();
        }
    }

    public final synchronized void b() {
        if (this.f125073c) {
            return;
        }
        t tVar = t.f125068a;
        if (!Intrinsics.e(tVar, this.f125075e)) {
            this.f125075e = tVar;
            a();
        }
    }

    public final synchronized void c() {
        if (this.f125073c) {
            return;
        }
        this.f125072b.invoke(this.f125075e.a(), this.f125076f.a(), this.f125074d.a());
        this.f125076f = l.f125062a;
        this.f125075e = v.f125070a;
        this.f125074d = r.f125067a;
        this.f125073c = true;
    }

    public x(f start, g stop) {
        Intrinsics.j(start, "start");
        Intrinsics.j(stop, "stop");
        this.f125071a = start;
        this.f125072b = stop;
        this.f125074d = r.f125067a;
        this.f125075e = v.f125070a;
        this.f125076f = l.f125062a;
    }

    public final void a() {
        s sVar = this.f125074d;
        p pVar = sVar instanceof p ? (p) sVar : null;
        if (pVar == null) {
            a(this);
            return;
        }
        w wVar = this.f125075e;
        u uVar = wVar instanceof u ? (u) wVar : null;
        if (uVar == null) {
            a(this);
            return;
        }
        o oVar = this.f125076f;
        m mVar = oVar instanceof m ? (m) oVar : null;
        if (mVar == null) {
            a(this);
        } else {
            this.f125071a.invoke(uVar.f125069a, mVar.f125063a, pVar.f125065a);
        }
    }

    public static void a(x xVar) {
        s sVar = xVar.f125074d;
        xVar.f125072b.invoke(xVar.f125075e.a(), xVar.f125076f.a(), sVar.a());
    }
}
