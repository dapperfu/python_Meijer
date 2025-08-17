package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Uh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7237Uh extends Hc.f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7203Th f70675a;

    /* renamed from: c, reason: collision with root package name */
    private final C7367Yg f70677c;

    /* renamed from: b, reason: collision with root package name */
    private final List f70676b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Ec.r f70678d = new Ec.r();

    /* renamed from: e, reason: collision with root package name */
    private final List f70679e = new ArrayList();

    @Override // Hc.f
    public final Double c() {
        try {
            double dZze = this.f70675a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // Hc.f
    public final List k() {
        return this.f70676b;
    }

    public C7237Uh(InterfaceC7203Th interfaceC7203Th) {
        InterfaceC7334Xg c7268Vg;
        IBinder iBinder;
        this.f70675a = interfaceC7203Th;
        C7367Yg c7367Yg = null;
        try {
            List listZzu = interfaceC7203Th.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        c7268Vg = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        c7268Vg = iInterfaceQueryLocalInterface instanceof InterfaceC7334Xg ? (InterfaceC7334Xg) iInterfaceQueryLocalInterface : new C7268Vg(iBinder);
                    }
                    if (c7268Vg != null) {
                        this.f70676b.add(new C7367Yg(c7268Vg));
                    }
                }
            }
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
        try {
            List listZzv = this.f70675a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    Mc.D0 d0B9 = obj2 instanceof IBinder ? Mc.C0.B9((IBinder) obj2) : null;
                    if (d0B9 != null) {
                        this.f70679e.add(new Mc.E0(d0B9));
                    }
                }
            }
        } catch (RemoteException e11) {
            Qc.p.e("", e11);
        }
        try {
            InterfaceC7334Xg interfaceC7334XgZzk = this.f70675a.zzk();
            if (interfaceC7334XgZzk != null) {
                c7367Yg = new C7367Yg(interfaceC7334XgZzk);
            }
        } catch (RemoteException e12) {
            Qc.p.e("", e12);
        }
        this.f70677c = c7367Yg;
        try {
            if (this.f70675a.zzi() != null) {
                new C7133Rg(this.f70675a.zzi());
            }
        } catch (RemoteException e13) {
            Qc.p.e("", e13);
        }
    }

    @Override // Hc.f
    public final Ec.r a() {
        try {
            if (this.f70675a.zzh() != null) {
                this.f70678d.c(this.f70675a.zzh());
            }
        } catch (RemoteException e10) {
            Qc.p.e("Exception occurred while getting video controller", e10);
        }
        return this.f70678d;
    }

    @Override // Hc.f
    public final Hc.c b() {
        return this.f70677c;
    }

    @Override // Hc.f
    public final Object d() {
        try {
            com.google.android.gms.dynamic.b bVarZzl = this.f70675a.zzl();
            if (bVarZzl != null) {
                return com.google.android.gms.dynamic.d.b2(bVarZzl);
            }
            return null;
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // Hc.f
    public final String e() {
        try {
            return this.f70675a.zzn();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // Hc.f
    public final String f() {
        try {
            return this.f70675a.zzo();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // Hc.f
    public final String g() {
        try {
            return this.f70675a.zzp();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // Hc.f
    public final String h() {
        try {
            return this.f70675a.zzq();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // Hc.f
    public final String i() {
        try {
            return this.f70675a.zzs();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }

    @Override // Hc.f
    public final String j() {
        try {
            return this.f70675a.zzt();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            return null;
        }
    }
}
