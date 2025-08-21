package com.google.firebase.sessions;

import com.google.firebase.sessions.b;
import gv.InterfaceC14411a;
import jg.ApplicationInfo;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class c implements InterfaceC15490b<ApplicationInfo> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<com.google.firebase.f> f90212a;

    public static ApplicationInfo a(com.google.firebase.f fVar) {
        return (ApplicationInfo) lg.d.d(b.InterfaceC1296b.INSTANCE.e(fVar));
    }

    public static c b(InterfaceC14411a<com.google.firebase.f> interfaceC14411a) {
        return new c(interfaceC14411a);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ApplicationInfo get() {
        return a(this.f90212a.get());
    }

    public c(InterfaceC14411a<com.google.firebase.f> interfaceC14411a) {
        this.f90212a = interfaceC14411a;
    }
}
