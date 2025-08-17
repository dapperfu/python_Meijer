package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;

/* renamed from: com.google.android.gms.internal.ads.rh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9304rh {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9198qh f78056a;

    public final InterfaceC9198qh a() {
        return this.f78056a;
    }

    public C9304rh(InterfaceC9198qh interfaceC9198qh) {
        Context context;
        this.f78056a = interfaceC9198qh;
        try {
            context = (Context) com.google.android.gms.dynamic.d.b2(interfaceC9198qh.zzh());
        } catch (RemoteException | NullPointerException e10) {
            Qc.p.e("", e10);
            context = null;
        }
        if (context != null) {
            try {
                this.f78056a.D(com.google.android.gms.dynamic.d.F2(new MediaView(context)));
            } catch (RemoteException e11) {
                Qc.p.e("", e11);
            }
        }
    }

    public final String b() {
        try {
            return this.f78056a.zzi();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }
}
