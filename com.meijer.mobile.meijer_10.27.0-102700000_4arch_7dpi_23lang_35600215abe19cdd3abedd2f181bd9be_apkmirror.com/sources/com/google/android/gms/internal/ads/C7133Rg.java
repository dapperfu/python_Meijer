package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Rg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7133Rg extends Hc.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7099Qg f69918a;

    /* renamed from: b, reason: collision with root package name */
    private final List f69919b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f69920c;

    public C7133Rg(InterfaceC7099Qg interfaceC7099Qg) {
        IBinder iBinder;
        this.f69918a = interfaceC7099Qg;
        try {
            this.f69920c = interfaceC7099Qg.zzg();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            this.f69920c = "";
        }
        try {
            for (Object obj : interfaceC7099Qg.zzh()) {
                InterfaceC7334Xg c7268Vg = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    c7268Vg = iInterfaceQueryLocalInterface instanceof InterfaceC7334Xg ? (InterfaceC7334Xg) iInterfaceQueryLocalInterface : new C7268Vg(iBinder);
                }
                if (c7268Vg != null) {
                    this.f69919b.add(new C7367Yg(c7268Vg));
                }
            }
        } catch (RemoteException e11) {
            Qc.p.e("", e11);
        }
    }
}
