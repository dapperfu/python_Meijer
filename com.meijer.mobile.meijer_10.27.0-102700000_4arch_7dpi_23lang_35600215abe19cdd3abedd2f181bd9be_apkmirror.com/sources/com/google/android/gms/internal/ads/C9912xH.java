package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.xH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9912xH implements ZB, LF {

    /* renamed from: a, reason: collision with root package name */
    private final C7178Sp f79737a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f79738b;

    /* renamed from: c, reason: collision with root package name */
    private final C7311Wp f79739c;

    /* renamed from: d, reason: collision with root package name */
    private final View f79740d;

    /* renamed from: e, reason: collision with root package name */
    private String f79741e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC8122gd f79742f;

    public C9912xH(C7178Sp c7178Sp, Context context, C7311Wp c7311Wp, View view, EnumC8122gd enumC8122gd) {
        this.f79737a = c7178Sp;
        this.f79738b = context;
        this.f79739c = c7311Wp;
        this.f79740d = view;
        this.f79742f = enumC8122gd;
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(InterfaceC6838Io interfaceC6838Io, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f79739c.p(this.f79738b)) {
            try {
                C7311Wp c7311Wp = this.f79739c;
                Context context = this.f79738b;
                c7311Wp.l(context, c7311Wp.a(context), this.f79737a.a(), interfaceC6838Io.zzc(), interfaceC6838Io.zzb());
            } catch (RemoteException e10) {
                Qc.p.h("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zza() {
        this.f79737a.i(false);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.f79740d;
        if (view != null && this.f79741e != null) {
            this.f79739c.o(view.getContext(), this.f79741e);
        }
        this.f79737a.i(true);
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzl() {
        if (this.f79742f == EnumC8122gd.APP_OPEN) {
            return;
        }
        String strC = this.f79739c.c(this.f79738b);
        this.f79741e = strC;
        this.f79741e = String.valueOf(strC).concat(this.f79742f == EnumC8122gd.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
