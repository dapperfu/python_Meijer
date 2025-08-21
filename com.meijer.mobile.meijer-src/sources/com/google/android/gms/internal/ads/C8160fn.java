package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8160fn extends NativeAd.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f75014a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private String f75015b;

    public C8160fn(InterfaceC7224Qg interfaceC7224Qg) {
        try {
            this.f75015b = interfaceC7224Qg.zzg();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            this.f75015b = "";
        }
        try {
            for (Object obj : interfaceC7224Qg.zzh()) {
                InterfaceC7459Xg interfaceC7459XgB9 = obj instanceof IBinder ? AbstractBinderC7426Wg.B9((IBinder) obj) : null;
                if (interfaceC7459XgB9 != null) {
                    this.f75014a.add(new C8267gn(interfaceC7459XgB9));
                }
            }
        } catch (RemoteException e11) {
            Sc.p.e("", e11);
        }
    }
}
