package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8035fn extends NativeAd.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f74174a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private String f74175b;

    public C8035fn(InterfaceC7099Qg interfaceC7099Qg) {
        try {
            this.f74175b = interfaceC7099Qg.zzg();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            this.f74175b = "";
        }
        try {
            for (Object obj : interfaceC7099Qg.zzh()) {
                InterfaceC7334Xg interfaceC7334XgB9 = obj instanceof IBinder ? AbstractBinderC7301Wg.B9((IBinder) obj) : null;
                if (interfaceC7334XgB9 != null) {
                    this.f74174a.add(new C8142gn(interfaceC7334XgB9));
                }
            }
        } catch (RemoteException e11) {
            Qc.p.e("", e11);
        }
    }
}
