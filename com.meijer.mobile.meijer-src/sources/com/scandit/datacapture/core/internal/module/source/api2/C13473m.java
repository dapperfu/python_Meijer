package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13473m implements InterfaceC13482w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f125882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13476p f125883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f125884c;

    public final void a(K result) {
        Intrinsics.j(result, "result");
        if (Intrinsics.e(result, I.f125800a)) {
            this.f125882a.invoke(Boolean.FALSE);
            return;
        }
        if (result instanceof J) {
            C13476p c13476p = this.f125883b;
            if (c13476p.f125914k == null) {
                this.f125882a.invoke(Boolean.FALSE);
            } else {
                c13476p.f125915l = ((J) result).f125801a;
                this.f125882a.invoke(Boolean.TRUE);
            }
        }
    }

    public C13473m(Function1 function1, C13476p c13476p, p0 p0Var) {
        this.f125882a = function1;
        this.f125883b = c13476p;
        this.f125884c = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.media.Image r35) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.source.api2.C13473m.a(android.media.Image):void");
    }
}
