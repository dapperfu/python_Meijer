package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import kotlin.jvm.functions.Function1;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13335h implements Q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f124903a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13343p f124904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f124905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f124906d;

    public C13335h(C13343p c13343p, i0 i0Var, Function1 function1) {
        this.f124904b = c13343p;
        this.f124905c = i0Var;
        this.f124906d = function1;
    }

    public final void a() throws CameraAccessException {
        if (this.f124903a) {
            C13343p c13343p = this.f124904b;
            c13343p.a(false);
            InterfaceC13328b0 interfaceC13328b0 = c13343p.f124963l;
            if (interfaceC13328b0 != null) {
                ((d0) interfaceC13328b0).a();
            }
            c13343p.f124970s = false;
            this.f124904b.b();
            this.f124906d.invoke(Boolean.FALSE);
        }
    }
}
