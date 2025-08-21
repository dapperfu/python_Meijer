package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8374hn extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7328Th f75621a;

    /* renamed from: c, reason: collision with root package name */
    private final C8267gn f75623c;

    /* renamed from: d, reason: collision with root package name */
    private final NativeAd.a f75624d;

    /* renamed from: b, reason: collision with root package name */
    private final List f75622b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List f75625e = new ArrayList();

    public C8374hn(InterfaceC7328Th interfaceC7328Th) {
        InterfaceC7459Xg interfaceC7459XgZzk;
        this.f75621a = interfaceC7328Th;
        C8160fn c8160fn = null;
        try {
            List listZzu = interfaceC7328Th.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    InterfaceC7459Xg interfaceC7459XgB9 = obj instanceof IBinder ? AbstractBinderC7426Wg.B9((IBinder) obj) : null;
                    if (interfaceC7459XgB9 != null) {
                        this.f75622b.add(new C8267gn(interfaceC7459XgB9));
                    }
                }
            }
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
        try {
            List listZzv = this.f75621a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    Oc.D0 d0B9 = obj2 instanceof IBinder ? Oc.C0.B9((IBinder) obj2) : null;
                    if (d0B9 != null) {
                        this.f75625e.add(new Oc.E0(d0B9));
                    }
                }
            }
        } catch (RemoteException e11) {
            Sc.p.e("", e11);
        }
        try {
            interfaceC7459XgZzk = this.f75621a.zzk();
        } catch (RemoteException e12) {
            Sc.p.e("", e12);
        }
        C8267gn c8267gn = interfaceC7459XgZzk != null ? new C8267gn(interfaceC7459XgZzk) : null;
        this.f75623c = c8267gn;
        try {
            if (this.f75621a.zzi() != null) {
                c8160fn = new C8160fn(this.f75621a.zzi());
            }
        } catch (RemoteException e13) {
            Sc.p.e("", e13);
        }
        this.f75624d = c8160fn;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String a() {
        try {
            return this.f75621a.zzo();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f75621a.zzq();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Gc.p c() {
        Oc.U0 u0Zzg;
        try {
            u0Zzg = this.f75621a.zzg();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            u0Zzg = null;
        }
        return Gc.p.d(u0Zzg);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ Object d() {
        try {
            return this.f75621a.zzm();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(Bundle bundle) {
        try {
            this.f75621a.e7(bundle);
        } catch (RemoteException e10) {
            Sc.p.e("Failed to record native event", e10);
        }
    }
}
