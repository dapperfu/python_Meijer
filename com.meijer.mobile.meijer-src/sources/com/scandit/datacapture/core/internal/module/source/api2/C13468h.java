package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import kotlin.jvm.functions.Function1;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13468h implements Q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f125855a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13476p f125856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f125857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f125858d;

    public C13468h(C13476p c13476p, i0 i0Var, Function1 function1) {
        this.f125856b = c13476p;
        this.f125857c = i0Var;
        this.f125858d = function1;
    }

    public final void a() throws CameraAccessException {
        if (this.f125855a) {
            C13476p c13476p = this.f125856b;
            c13476p.a(false);
            InterfaceC13461b0 interfaceC13461b0 = c13476p.f125915l;
            if (interfaceC13461b0 != null) {
                ((d0) interfaceC13461b0).a();
            }
            c13476p.f125922s = false;
            this.f125856b.b();
            this.f125858d.invoke(Boolean.FALSE);
        }
    }
}
