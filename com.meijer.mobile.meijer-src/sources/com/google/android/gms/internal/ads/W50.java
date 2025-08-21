package com.google.android.gms.internal.ads;

import Oc.InterfaceC4377a0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class W50 extends AbstractBinderC7031Ko {

    /* renamed from: a, reason: collision with root package name */
    private final M50 f71845a;

    /* renamed from: b, reason: collision with root package name */
    private final B50 f71846b;

    /* renamed from: c, reason: collision with root package name */
    private final C8840m60 f71847c;

    /* renamed from: d, reason: collision with root package name */
    private C10149yL f71848d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71849e = false;

    private final synchronized boolean E9() {
        C10149yL c10149yL = this.f71848d;
        if (c10149yL != null) {
            if (!c10149yL.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized void B(String str) throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.: setCustomData");
        this.f71847c.f77571b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized void C(String str) throws RemoteException {
        com.google.android.gms.common.internal.r.e("setUserId must be called on the main UI thread.");
        this.f71847c.f77570a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized void E(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        try {
            com.google.android.gms.common.internal.r.e("showAd must be called on the main UI thread.");
            if (this.f71848d != null) {
                Activity activity = null;
                if (bVar != null) {
                    Object objC2 = com.google.android.gms.dynamic.d.c2(bVar);
                    if (objC2 instanceof Activity) {
                        activity = (Activity) objC2;
                    }
                }
                this.f71848d.o(this.f71849e, activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized void O(com.google.android.gms.dynamic.b bVar) {
        com.google.android.gms.common.internal.r.e("resume must be called on the main UI thread.");
        if (this.f71848d != null) {
            this.f71848d.d().T0(bVar == null ? null : (Context) com.google.android.gms.dynamic.d.c2(bVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) Oc.A.c().a(com.google.android.gms.internal.ads.C8784lf.f77361t5)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e8(com.google.android.gms.internal.ads.C7234Qo r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.r.e(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.f70489b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f77333r5     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L64
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.Aq r2 = Nc.v.s()     // Catch: java.lang.Throwable -> L20
            r2.x(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.E9()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77361t5     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.D50 r0 = new com.google.android.gms.internal.ads.D50     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.f71848d = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.M50 r1 = r4.f71845a     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.i(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.M50 r1 = r4.f71845a     // Catch: java.lang.Throwable -> L20
            Oc.Y1 r2 = r5.f70488a     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.f70489b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.U50 r3 = new com.google.android.gms.internal.ads.U50     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W50.e8(com.google.android.gms.internal.ads.Qo):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized void q(boolean z10) {
        com.google.android.gms.common.internal.r.e("setImmersiveMode must be called on the main UI thread.");
        this.f71849e = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized Oc.U0 zzc() throws RemoteException {
        C10149yL c10149yL;
        if (((Boolean) Oc.A.c().a(C8784lf.f76761C6)).booleanValue() && (c10149yL = this.f71848d) != null) {
            return c10149yL.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized String zzd() throws RemoteException {
        C10149yL c10149yL = this.f71848d;
        if (c10149yL == null || c10149yL.c() == null) {
            return null;
        }
        return c10149yL.c().zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized void zzf(com.google.android.gms.dynamic.b bVar) {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.f71846b.s(null);
        if (this.f71848d != null) {
            if (bVar != null) {
                context = (Context) com.google.android.gms.dynamic.d.c2(bVar);
            }
            this.f71848d.d().R0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized void zzi(com.google.android.gms.dynamic.b bVar) {
        com.google.android.gms.common.internal.r.e("pause must be called on the main UI thread.");
        if (this.f71848d != null) {
            this.f71848d.d().S0(bVar == null ? null : (Context) com.google.android.gms.dynamic.d.c2(bVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final void zzj() {
        O(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final synchronized void zzq() throws RemoteException {
        E(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final void G6(C6997Jo c6997Jo) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f71846b.d0(c6997Jo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final void e4(InterfaceC4377a0 interfaceC4377a0) {
        com.google.android.gms.common.internal.r.e("setAdMetadataListener can only be called from the UI thread.");
        if (interfaceC4377a0 == null) {
            this.f71846b.s(null);
        } else {
            this.f71846b.s(new V50(this, interfaceC4377a0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final void i5(InterfaceC7200Po interfaceC7200Po) throws RemoteException {
        com.google.android.gms.common.internal.r.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f71846b.N(interfaceC7200Po);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final Bundle zzb() {
        com.google.android.gms.common.internal.r.e("getAdMetadata can only be called from the UI thread.");
        C10149yL c10149yL = this.f71848d;
        return c10149yL != null ? c10149yL.i() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final boolean zzs() throws RemoteException {
        com.google.android.gms.common.internal.r.e("isLoaded must be called on the main UI thread.");
        return E9();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7065Lo
    public final boolean zzt() {
        C10149yL c10149yL = this.f71848d;
        return c10149yL != null && c10149yL.n();
    }

    public W50(M50 m50, B50 b50, C8840m60 c8840m60) {
        this.f71845a = m50;
        this.f71846b = b50;
        this.f71847c = c8840m60;
    }
}
