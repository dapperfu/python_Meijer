package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8101gL implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f74297a;

    /* renamed from: b, reason: collision with root package name */
    private final String f74298b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7069Pi f74299c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8315iL f74300d;

    /* synthetic */ C8101gL(C8315iL c8315iL, WeakReference weakReference, String str, InterfaceC7069Pi interfaceC7069Pi, C8208hL c8208hL) {
        this.f74300d = c8315iL;
        this.f74297a = weakReference;
        this.f74298b = str;
        this.f74299c = interfaceC7069Pi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        Object obj2 = this.f74297a.get();
        if (obj2 == null) {
            this.f74300d.n(this.f74298b, this);
        } else {
            this.f74299c.a(obj2, map);
        }
    }
}
