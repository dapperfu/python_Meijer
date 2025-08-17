package com.google.android.gms.internal.ads;

import Mc.InterfaceC4099a0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class W50 extends AbstractBinderC6906Ko {

    /* renamed from: a, reason: collision with root package name */
    private final M50 f71005a;

    /* renamed from: b, reason: collision with root package name */
    private final B50 f71006b;

    /* renamed from: c, reason: collision with root package name */
    private final C8715m60 f71007c;

    /* renamed from: d, reason: collision with root package name */
    private C10024yL f71008d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71009e = false;

    private final synchronized boolean E9() {
        C10024yL c10024yL = this.f71008d;
        if (c10024yL != null) {
            if (!c10024yL.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized void B(String str) throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.: setCustomData");
        this.f71007c.f76731b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized void C(String str) throws RemoteException {
        com.google.android.gms.common.internal.r.e("setUserId must be called on the main UI thread.");
        this.f71007c.f76730a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized void E(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        try {
            com.google.android.gms.common.internal.r.e("showAd must be called on the main UI thread.");
            if (this.f71008d != null) {
                Activity activity = null;
                if (bVar != null) {
                    Object objB2 = com.google.android.gms.dynamic.d.b2(bVar);
                    if (objB2 instanceof Activity) {
                        activity = (Activity) objB2;
                    }
                }
                this.f71008d.o(this.f71009e, activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized void O(com.google.android.gms.dynamic.b bVar) {
        com.google.android.gms.common.internal.r.e("resume must be called on the main UI thread.");
        if (this.f71008d != null) {
            this.f71008d.d().T0(bVar == null ? null : (Context) com.google.android.gms.dynamic.d.b2(bVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) Mc.A.c().a(com.google.android.gms.internal.ads.C8659lf.f76521t5)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g8(com.google.android.gms.internal.ads.C7109Qo r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.r.e(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.f69649b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f76493r5     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L20
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
            com.google.android.gms.internal.ads.Aq r2 = Lc.v.s()     // Catch: java.lang.Throwable -> L20
            r2.x(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.E9()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76521t5     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.jf r1 = Mc.A.c()     // Catch: java.lang.Throwable -> L20
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
            r4.f71008d = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.M50 r1 = r4.f71005a     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.i(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.M50 r1 = r4.f71005a     // Catch: java.lang.Throwable -> L20
            Mc.Y1 r2 = r5.f69648a     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.f69649b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.U50 r3 = new com.google.android.gms.internal.ads.U50     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W50.g8(com.google.android.gms.internal.ads.Qo):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized void q(boolean z10) {
        com.google.android.gms.common.internal.r.e("setImmersiveMode must be called on the main UI thread.");
        this.f71009e = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized Mc.U0 zzc() throws RemoteException {
        C10024yL c10024yL;
        if (((Boolean) Mc.A.c().a(C8659lf.f75921C6)).booleanValue() && (c10024yL = this.f71008d) != null) {
            return c10024yL.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized String zzd() throws RemoteException {
        C10024yL c10024yL = this.f71008d;
        if (c10024yL == null || c10024yL.c() == null) {
            return null;
        }
        return c10024yL.c().zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized void zzf(com.google.android.gms.dynamic.b bVar) {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.f71006b.s(null);
        if (this.f71008d != null) {
            if (bVar != null) {
                context = (Context) com.google.android.gms.dynamic.d.b2(bVar);
            }
            this.f71008d.d().R0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized void zzi(com.google.android.gms.dynamic.b bVar) {
        com.google.android.gms.common.internal.r.e("pause must be called on the main UI thread.");
        if (this.f71008d != null) {
            this.f71008d.d().S0(bVar == null ? null : (Context) com.google.android.gms.dynamic.d.b2(bVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final void zzj() {
        O(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final synchronized void zzq() throws RemoteException {
        E(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final void V4(InterfaceC7075Po interfaceC7075Po) throws RemoteException {
        com.google.android.gms.common.internal.r.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f71006b.L(interfaceC7075Po);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final void f5(InterfaceC4099a0 interfaceC4099a0) {
        com.google.android.gms.common.internal.r.e("setAdMetadataListener can only be called from the UI thread.");
        if (interfaceC4099a0 == null) {
            this.f71006b.s(null);
        } else {
            this.f71006b.s(new V50(this, interfaceC4099a0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final void r6(C6872Jo c6872Jo) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f71006b.N(c6872Jo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final Bundle zzb() {
        com.google.android.gms.common.internal.r.e("getAdMetadata can only be called from the UI thread.");
        C10024yL c10024yL = this.f71008d;
        return c10024yL != null ? c10024yL.i() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final boolean zzs() throws RemoteException {
        com.google.android.gms.common.internal.r.e("isLoaded must be called on the main UI thread.");
        return E9();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6940Lo
    public final boolean zzt() {
        C10024yL c10024yL = this.f71008d;
        return c10024yL != null && c10024yL.n();
    }

    public W50(M50 m50, B50 b50, C8715m60 c8715m60) {
        this.f71005a = m50;
        this.f71006b = b50;
        this.f71007c = c8715m60;
    }
}
