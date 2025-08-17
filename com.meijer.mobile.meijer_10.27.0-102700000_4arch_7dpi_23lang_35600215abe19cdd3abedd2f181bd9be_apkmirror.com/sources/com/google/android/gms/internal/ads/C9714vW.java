package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.vW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9714vW {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f79074a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C8528kM f79075b;

    public final InterfaceC10170zm a(String str) {
        if (this.f79074a.containsKey(str)) {
            return (InterfaceC10170zm) this.f79074a.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.f79074a.put(str, this.f79075b.b(str));
        } catch (RemoteException e10) {
            Pc.p0.l("Couldn't create RTB adapter : ", e10);
        }
    }

    public C9714vW(C8528kM c8528kM) {
        this.f79075b = c8528kM;
    }
}
