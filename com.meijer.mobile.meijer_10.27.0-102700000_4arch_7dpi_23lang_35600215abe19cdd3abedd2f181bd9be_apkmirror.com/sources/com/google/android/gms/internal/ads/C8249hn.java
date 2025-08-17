package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8249hn extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7203Th f74781a;

    /* renamed from: c, reason: collision with root package name */
    private final C8142gn f74783c;

    /* renamed from: d, reason: collision with root package name */
    private final NativeAd.a f74784d;

    /* renamed from: b, reason: collision with root package name */
    private final List f74782b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List f74785e = new ArrayList();

    public C8249hn(InterfaceC7203Th interfaceC7203Th) {
        InterfaceC7334Xg interfaceC7334XgZzk;
        this.f74781a = interfaceC7203Th;
        C8035fn c8035fn = null;
        try {
            List listZzu = interfaceC7203Th.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    InterfaceC7334Xg interfaceC7334XgB9 = obj instanceof IBinder ? AbstractBinderC7301Wg.B9((IBinder) obj) : null;
                    if (interfaceC7334XgB9 != null) {
                        this.f74782b.add(new C8142gn(interfaceC7334XgB9));
                    }
                }
            }
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
        try {
            List listZzv = this.f74781a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    Mc.D0 d0B9 = obj2 instanceof IBinder ? Mc.C0.B9((IBinder) obj2) : null;
                    if (d0B9 != null) {
                        this.f74785e.add(new Mc.E0(d0B9));
                    }
                }
            }
        } catch (RemoteException e11) {
            Qc.p.e("", e11);
        }
        try {
            interfaceC7334XgZzk = this.f74781a.zzk();
        } catch (RemoteException e12) {
            Qc.p.e("", e12);
        }
        C8142gn c8142gn = interfaceC7334XgZzk != null ? new C8142gn(interfaceC7334XgZzk) : null;
        this.f74783c = c8142gn;
        try {
            if (this.f74781a.zzi() != null) {
                c8035fn = new C8035fn(this.f74781a.zzi());
            }
        } catch (RemoteException e13) {
            Qc.p.e("", e13);
        }
        this.f74784d = c8035fn;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String a() {
        try {
            return this.f74781a.zzo();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f74781a.zzq();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Ec.p c() {
        Mc.U0 u0Zzg;
        try {
            u0Zzg = this.f74781a.zzg();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            u0Zzg = null;
        }
        return Ec.p.d(u0Zzg);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ Object d() {
        try {
            return this.f74781a.zzm();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(Bundle bundle) {
        try {
            this.f74781a.T6(bundle);
        } catch (RemoteException e10) {
            Qc.p.e("Failed to record native event", e10);
        }
    }
}
