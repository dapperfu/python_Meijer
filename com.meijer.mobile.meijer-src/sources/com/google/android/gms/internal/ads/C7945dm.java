package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7945dm implements Uc.i, Uc.l, Uc.n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6960Il f74312a;

    /* renamed from: b, reason: collision with root package name */
    private Uc.s f74313b;

    /* renamed from: c, reason: collision with root package name */
    private C9429rh f74314c;

    public C7945dm(InterfaceC6960Il interfaceC6960Il) {
        this.f74312a = interfaceC6960Il;
    }

    public final C9429rh u() {
        return this.f74314c;
    }

    @Override // Uc.n
    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdOpened.");
        try {
            this.f74312a.zzp();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.l
    public final void b(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.f74312a.zzg(i10);
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.n
    public final void c(MediationNativeAdapter mediationNativeAdapter, C9429rh c9429rh) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(c9429rh.b())));
        this.f74314c = c9429rh;
        try {
            this.f74312a.zzo();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.i
    public final void d(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdClicked.");
        try {
            this.f74312a.zze();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.n
    public final void e(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdClosed.");
        try {
            this.f74312a.zzf();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.i
    public final void f(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdLoaded.");
        try {
            this.f74312a.zzo();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.n
    public final void g(MediationNativeAdapter mediationNativeAdapter, Gc.a aVar) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f74312a.z8(aVar.d());
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.n
    public final void h(MediationNativeAdapter mediationNativeAdapter, C9429rh c9429rh, String str) {
        try {
            this.f74312a.A8(c9429rh.a(), str);
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.i
    public final void i(MediationBannerAdapter mediationBannerAdapter, Gc.a aVar) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f74312a.z8(aVar.d());
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.i
    public final void j(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdOpened.");
        try {
            this.f74312a.zzp();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.n
    public final void k(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Uc.s sVar = this.f74313b;
        if (this.f74314c == null) {
            if (sVar == null) {
                Sc.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!sVar.m()) {
                Sc.p.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        Sc.p.b("Adapter called onAdImpression.");
        try {
            this.f74312a.zzm();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.i
    public final void l(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdClosed.");
        try {
            this.f74312a.zzf();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.n
    public final void m(MediationNativeAdapter mediationNativeAdapter, Uc.s sVar) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdLoaded.");
        this.f74313b = sVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            Gc.r rVar = new Gc.r();
            rVar.c(new BinderC7265Rl());
            if (sVar != null && sVar.r()) {
                sVar.K(rVar);
            }
        }
        try {
            this.f74312a.zzo();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.i
    public final void n(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAppEvent.");
        try {
            this.f74312a.K0(str, str2);
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.n
    public final void o(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Uc.s sVar = this.f74313b;
        if (this.f74314c == null) {
            if (sVar == null) {
                Sc.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!sVar.l()) {
                Sc.p.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        Sc.p.b("Adapter called onAdClicked.");
        try {
            this.f74312a.zze();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.l
    public final void p(MediationInterstitialAdapter mediationInterstitialAdapter, Gc.a aVar) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f74312a.z8(aVar.d());
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.l
    public final void q(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdLoaded.");
        try {
            this.f74312a.zzo();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.l
    public final void r(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdClosed.");
        try {
            this.f74312a.zzf();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Uc.l
    public final void s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        Sc.p.b("Adapter called onAdOpened.");
        try {
            this.f74312a.zzp();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final Uc.s t() {
        return this.f74313b;
    }
}
