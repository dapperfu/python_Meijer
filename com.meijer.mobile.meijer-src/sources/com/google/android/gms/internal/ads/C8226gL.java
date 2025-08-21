package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8226gL implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f75137a;

    /* renamed from: b, reason: collision with root package name */
    private final String f75138b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7194Pi f75139c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8440iL f75140d;

    /* synthetic */ C8226gL(C8440iL c8440iL, WeakReference weakReference, String str, InterfaceC7194Pi interfaceC7194Pi, C8333hL c8333hL) {
        this.f75140d = c8440iL;
        this.f75137a = weakReference;
        this.f75138b = str;
        this.f75139c = interfaceC7194Pi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        Object obj2 = this.f75137a.get();
        if (obj2 == null) {
            this.f75140d.n(this.f75138b, this);
        } else {
            this.f75139c.a(obj2, map);
        }
    }
}
