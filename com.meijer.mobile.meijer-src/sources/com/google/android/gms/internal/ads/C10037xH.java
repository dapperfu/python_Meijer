package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.xH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10037xH implements ZB, LF {

    /* renamed from: a, reason: collision with root package name */
    private final C7303Sp f80577a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f80578b;

    /* renamed from: c, reason: collision with root package name */
    private final C7436Wp f80579c;

    /* renamed from: d, reason: collision with root package name */
    private final View f80580d;

    /* renamed from: e, reason: collision with root package name */
    private String f80581e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC8247gd f80582f;

    public C10037xH(C7303Sp c7303Sp, Context context, C7436Wp c7436Wp, View view, EnumC8247gd enumC8247gd) {
        this.f80577a = c7303Sp;
        this.f80578b = context;
        this.f80579c = c7436Wp;
        this.f80580d = view;
        this.f80582f = enumC8247gd;
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
    public final void p(InterfaceC6963Io interfaceC6963Io, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f80579c.p(this.f80578b)) {
            try {
                C7436Wp c7436Wp = this.f80579c;
                Context context = this.f80578b;
                c7436Wp.l(context, c7436Wp.a(context), this.f80577a.a(), interfaceC6963Io.zzc(), interfaceC6963Io.zzb());
            } catch (RemoteException e10) {
                Sc.p.h("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zza() {
        this.f80577a.i(false);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.f80580d;
        if (view != null && this.f80581e != null) {
            this.f80579c.o(view.getContext(), this.f80581e);
        }
        this.f80577a.i(true);
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzl() {
        if (this.f80582f == EnumC8247gd.APP_OPEN) {
            return;
        }
        String strC = this.f80579c.c(this.f80578b);
        this.f80581e = strC;
        this.f80581e = String.valueOf(strC).concat(this.f80582f == EnumC8247gd.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
