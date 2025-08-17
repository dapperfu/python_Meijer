package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7820dm implements Sc.i, Sc.l, Sc.n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835Il f73472a;

    /* renamed from: b, reason: collision with root package name */
    private Sc.s f73473b;

    /* renamed from: c, reason: collision with root package name */
    private C9304rh f73474c;

    public C7820dm(InterfaceC6835Il interfaceC6835Il) {
        this.f73472a = interfaceC6835Il;
    }

    public final C9304rh u() {
        return this.f73474c;
    }

    @Override // Sc.n
    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdOpened.");
        try {
            this.f73472a.zzp();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.l
    public final void b(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.f73472a.zzg(i10);
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.n
    public final void c(MediationNativeAdapter mediationNativeAdapter, C9304rh c9304rh) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(c9304rh.b())));
        this.f73474c = c9304rh;
        try {
            this.f73472a.zzo();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.n
    public final void d(MediationNativeAdapter mediationNativeAdapter, Sc.s sVar) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdLoaded.");
        this.f73473b = sVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            Ec.r rVar = new Ec.r();
            rVar.c(new BinderC7140Rl());
            if (sVar != null && sVar.r()) {
                sVar.K(rVar);
            }
        }
        try {
            this.f73472a.zzo();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.i
    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdClicked.");
        try {
            this.f73472a.zze();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.n
    public final void f(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdClosed.");
        try {
            this.f73472a.zzf();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.i
    public final void g(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdLoaded.");
        try {
            this.f73472a.zzo();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.n
    public final void h(MediationNativeAdapter mediationNativeAdapter, C9304rh c9304rh, String str) {
        try {
            this.f73472a.F8(c9304rh.a(), str);
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.n
    public final void i(MediationNativeAdapter mediationNativeAdapter, Ec.a aVar) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f73472a.G1(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.l
    public final void j(MediationInterstitialAdapter mediationInterstitialAdapter, Ec.a aVar) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f73472a.G1(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.i
    public final void k(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdOpened.");
        try {
            this.f73472a.zzp();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.n
    public final void l(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.s sVar = this.f73473b;
        if (this.f73474c == null) {
            if (sVar == null) {
                Qc.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!sVar.m()) {
                Qc.p.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        Qc.p.b("Adapter called onAdImpression.");
        try {
            this.f73472a.zzm();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.i
    public final void m(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdClosed.");
        try {
            this.f73472a.zzf();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.i
    public final void n(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAppEvent.");
        try {
            this.f73472a.I0(str, str2);
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.n
    public final void o(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.s sVar = this.f73473b;
        if (this.f73474c == null) {
            if (sVar == null) {
                Qc.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!sVar.l()) {
                Qc.p.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        Qc.p.b("Adapter called onAdClicked.");
        try {
            this.f73472a.zze();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.l
    public final void p(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdLoaded.");
        try {
            this.f73472a.zzo();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.l
    public final void q(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdClosed.");
        try {
            this.f73472a.zzf();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.i
    public final void r(MediationBannerAdapter mediationBannerAdapter, Ec.a aVar) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f73472a.G1(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Sc.l
    public final void s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Qc.p.b("Adapter called onAdOpened.");
        try {
            this.f73472a.zzp();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final Sc.s t() {
        return this.f73473b;
    }
}
