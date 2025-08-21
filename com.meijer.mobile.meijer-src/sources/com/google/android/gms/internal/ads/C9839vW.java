package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.vW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9839vW {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f79914a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C8653kM f79915b;

    public final InterfaceC10295zm a(String str) {
        if (this.f79914a.containsKey(str)) {
            return (InterfaceC10295zm) this.f79914a.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.f79914a.put(str, this.f79915b.b(str));
        } catch (RemoteException e10) {
            Rc.p0.l("Couldn't create RTB adapter : ", e10);
        }
    }

    public C9839vW(C8653kM c8653kM) {
        this.f79915b = c8653kM;
    }
}
