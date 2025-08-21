package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Rg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7258Rg extends Jc.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7224Qg f70758a;

    /* renamed from: b, reason: collision with root package name */
    private final List f70759b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f70760c;

    public C7258Rg(InterfaceC7224Qg interfaceC7224Qg) {
        IBinder iBinder;
        this.f70758a = interfaceC7224Qg;
        try {
            this.f70760c = interfaceC7224Qg.zzg();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            this.f70760c = "";
        }
        try {
            for (Object obj : interfaceC7224Qg.zzh()) {
                InterfaceC7459Xg c7393Vg = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    c7393Vg = iInterfaceQueryLocalInterface instanceof InterfaceC7459Xg ? (InterfaceC7459Xg) iInterfaceQueryLocalInterface : new C7393Vg(iBinder);
                }
                if (c7393Vg != null) {
                    this.f70759b.add(new C7492Yg(c7393Vg));
                }
            }
        } catch (RemoteException e11) {
            Sc.p.e("", e11);
        }
    }
}
