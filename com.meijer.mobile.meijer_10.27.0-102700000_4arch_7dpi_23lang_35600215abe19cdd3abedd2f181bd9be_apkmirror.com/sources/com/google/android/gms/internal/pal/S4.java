package com.google.android.gms.internal.pal;

import Ic.a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public final class S4 extends V4 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10931v3 f82867a;

    /* renamed from: b, reason: collision with root package name */
    private final C10963x3 f82868b;

    /* renamed from: c, reason: collision with root package name */
    private final A3 f82869c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f82870d = false;

    @Deprecated
    private final com.google.android.gms.dynamic.b a2(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, boolean z10) {
        try {
            Uri uri = (Uri) com.google.android.gms.dynamic.d.b2(bVar);
            Context context = (Context) com.google.android.gms.dynamic.d.b2(bVar2);
            return com.google.android.gms.dynamic.d.F2(z10 ? this.f82869c.b(uri, context) : this.f82869c.a(uri, context, null, null));
        } catch (zzcw unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final com.google.android.gms.dynamic.b zzc(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        return a2(bVar, bVar2, false);
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final com.google.android.gms.dynamic.b zzd(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        return a2(bVar, bVar2, true);
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final String zzf(com.google.android.gms.dynamic.b bVar) {
        return zzg(bVar, null);
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zzj() {
        return "ms";
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final boolean e5(String str, boolean z10) {
        if (this.f82868b == null) {
            return false;
        }
        this.f82868b.x(new a.C0217a(str, z10));
        this.f82870d = true;
        return true;
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final int zzb() {
        return this.f82867a instanceof C10995z3 ? 1 : -1;
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zzh(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3, com.google.android.gms.dynamic.b bVar4) {
        return this.f82867a.d((Context) com.google.android.gms.dynamic.d.b2(bVar), (String) com.google.android.gms.dynamic.d.b2(bVar2), (View) com.google.android.gms.dynamic.d.b2(bVar3), (Activity) com.google.android.gms.dynamic.d.b2(bVar4));
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zzi(com.google.android.gms.dynamic.b bVar) {
        return this.f82867a.a((Context) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zzk(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        return this.f82867a.c((Context) com.google.android.gms.dynamic.d.b2(bVar), (View) com.google.android.gms.dynamic.d.b2(bVar2), (Activity) com.google.android.gms.dynamic.d.b2(bVar3));
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final void zzm(com.google.android.gms.dynamic.b bVar) {
        this.f82867a.e((View) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final void zzn(String str, String str2) {
        this.f82869c.d(str, str2);
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final void zzo(String str) {
        this.f82869c.e(str);
    }

    @Deprecated
    public S4(String str, Context context, boolean z10) {
        C10995z3 c10995z3V = C10995z3.v("h.3.2.2/n.android.3.2.2", context, false);
        this.f82867a = c10995z3V;
        this.f82869c = new A3(c10995z3V);
        this.f82868b = C10963x3.v(context);
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final String zze(com.google.android.gms.dynamic.b bVar, String str) {
        return ((AbstractC10947w3) this.f82867a).d((Context) com.google.android.gms.dynamic.d.b2(bVar), str, null, null);
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final String zzg(com.google.android.gms.dynamic.b bVar, byte[] bArr) {
        Context context = (Context) com.google.android.gms.dynamic.d.b2(bVar);
        String strB = this.f82867a.b(context, bArr);
        C10963x3 c10963x3 = this.f82868b;
        if (c10963x3 != null && this.f82870d) {
            String strW = this.f82868b.w(strB, c10963x3.b(context, bArr));
            this.f82870d = false;
            return strW;
        }
        return strB;
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final void zzl(com.google.android.gms.dynamic.b bVar) {
        this.f82869c.c((MotionEvent) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final boolean zzp(com.google.android.gms.dynamic.b bVar) {
        return this.f82869c.g((Uri) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final boolean zzq(com.google.android.gms.dynamic.b bVar) {
        return this.f82869c.f((Uri) com.google.android.gms.dynamic.d.b2(bVar));
    }
}
