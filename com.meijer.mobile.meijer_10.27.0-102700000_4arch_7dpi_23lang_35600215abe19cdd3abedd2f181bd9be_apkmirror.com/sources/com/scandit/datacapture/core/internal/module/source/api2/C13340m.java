package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13340m implements InterfaceC13349w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f124930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13343p f124931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f124932c;

    public final void a(K result) {
        Intrinsics.j(result, "result");
        if (Intrinsics.e(result, I.f124848a)) {
            this.f124930a.invoke(Boolean.FALSE);
            return;
        }
        if (result instanceof J) {
            C13343p c13343p = this.f124931b;
            if (c13343p.f124962k == null) {
                this.f124930a.invoke(Boolean.FALSE);
            } else {
                c13343p.f124963l = ((J) result).f124849a;
                this.f124930a.invoke(Boolean.TRUE);
            }
        }
    }

    public C13340m(Function1 function1, C13343p c13343p, p0 p0Var) {
        this.f124930a = function1;
        this.f124931b = c13343p;
        this.f124932c = p0Var;
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
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.source.api2.C13340m.a(android.media.Image):void");
    }
}
