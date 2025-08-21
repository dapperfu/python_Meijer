package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;

/* renamed from: com.google.android.gms.internal.ads.rh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9429rh {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9323qh f78896a;

    public final InterfaceC9323qh a() {
        return this.f78896a;
    }

    public C9429rh(InterfaceC9323qh interfaceC9323qh) {
        Context context;
        this.f78896a = interfaceC9323qh;
        try {
            context = (Context) com.google.android.gms.dynamic.d.c2(interfaceC9323qh.zzh());
        } catch (RemoteException | NullPointerException e10) {
            Sc.p.e("", e10);
            context = null;
        }
        if (context != null) {
            try {
                this.f78896a.D(com.google.android.gms.dynamic.d.I2(new MediaView(context)));
            } catch (RemoteException e11) {
                Sc.p.e("", e11);
            }
        }
    }

    public final String b() {
        try {
            return this.f78896a.zzi();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }
}
