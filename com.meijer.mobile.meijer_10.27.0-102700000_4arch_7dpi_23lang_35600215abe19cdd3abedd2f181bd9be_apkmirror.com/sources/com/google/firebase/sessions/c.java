package com.google.firebase.sessions;

import com.google.firebase.sessions.b;
import hg.ApplicationInfo;
import jg.InterfaceC14891b;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class c implements InterfaceC14891b<ApplicationInfo> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<com.google.firebase.f> f89370a;

    public static ApplicationInfo a(com.google.firebase.f fVar) {
        return (ApplicationInfo) jg.d.d(b.InterfaceC1287b.INSTANCE.e(fVar));
    }

    public static c b(InterfaceC15323a<com.google.firebase.f> interfaceC15323a) {
        return new c(interfaceC15323a);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ApplicationInfo get() {
        return a(this.f89370a.get());
    }

    public c(InterfaceC15323a<com.google.firebase.f> interfaceC15323a) {
        this.f89370a = interfaceC15323a;
    }
}
