package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Uh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7362Uh extends Jc.f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7328Th f71515a;

    /* renamed from: c, reason: collision with root package name */
    private final C7492Yg f71517c;

    /* renamed from: b, reason: collision with root package name */
    private final List f71516b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Gc.r f71518d = new Gc.r();

    /* renamed from: e, reason: collision with root package name */
    private final List f71519e = new ArrayList();

    @Override // Jc.f
    public final Double c() {
        try {
            double dZze = this.f71515a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // Jc.f
    public final List k() {
        return this.f71516b;
    }

    public C7362Uh(InterfaceC7328Th interfaceC7328Th) {
        InterfaceC7459Xg c7393Vg;
        IBinder iBinder;
        this.f71515a = interfaceC7328Th;
        C7492Yg c7492Yg = null;
        try {
            List listZzu = interfaceC7328Th.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        c7393Vg = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        c7393Vg = iInterfaceQueryLocalInterface instanceof InterfaceC7459Xg ? (InterfaceC7459Xg) iInterfaceQueryLocalInterface : new C7393Vg(iBinder);
                    }
                    if (c7393Vg != null) {
                        this.f71516b.add(new C7492Yg(c7393Vg));
                    }
                }
            }
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
        try {
            List listZzv = this.f71515a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    Oc.D0 d0B9 = obj2 instanceof IBinder ? Oc.C0.B9((IBinder) obj2) : null;
                    if (d0B9 != null) {
                        this.f71519e.add(new Oc.E0(d0B9));
                    }
                }
            }
        } catch (RemoteException e11) {
            Sc.p.e("", e11);
        }
        try {
            InterfaceC7459Xg interfaceC7459XgZzk = this.f71515a.zzk();
            if (interfaceC7459XgZzk != null) {
                c7492Yg = new C7492Yg(interfaceC7459XgZzk);
            }
        } catch (RemoteException e12) {
            Sc.p.e("", e12);
        }
        this.f71517c = c7492Yg;
        try {
            if (this.f71515a.zzi() != null) {
                new C7258Rg(this.f71515a.zzi());
            }
        } catch (RemoteException e13) {
            Sc.p.e("", e13);
        }
    }

    @Override // Jc.f
    public final Gc.r a() {
        try {
            if (this.f71515a.zzh() != null) {
                this.f71518d.c(this.f71515a.zzh());
            }
        } catch (RemoteException e10) {
            Sc.p.e("Exception occurred while getting video controller", e10);
        }
        return this.f71518d;
    }

    @Override // Jc.f
    public final Jc.c b() {
        return this.f71517c;
    }

    @Override // Jc.f
    public final Object d() {
        try {
            com.google.android.gms.dynamic.b bVarZzl = this.f71515a.zzl();
            if (bVarZzl != null) {
                return com.google.android.gms.dynamic.d.c2(bVarZzl);
            }
            return null;
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // Jc.f
    public final String e() {
        try {
            return this.f71515a.zzn();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // Jc.f
    public final String f() {
        try {
            return this.f71515a.zzo();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // Jc.f
    public final String g() {
        try {
            return this.f71515a.zzp();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // Jc.f
    public final String h() {
        try {
            return this.f71515a.zzq();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // Jc.f
    public final String i() {
        try {
            return this.f71515a.zzs();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }

    @Override // Jc.f
    public final String j() {
        try {
            return this.f71515a.zzt();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            return null;
        }
    }
}
