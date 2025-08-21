package com.google.android.gms.internal.pal;

import Kc.a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public final class S4 extends V4 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11056v3 f83707a;

    /* renamed from: b, reason: collision with root package name */
    private final C11088x3 f83708b;

    /* renamed from: c, reason: collision with root package name */
    private final A3 f83709c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f83710d = false;

    @Deprecated
    private final com.google.android.gms.dynamic.b a2(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, boolean z10) {
        try {
            Uri uri = (Uri) com.google.android.gms.dynamic.d.c2(bVar);
            Context context = (Context) com.google.android.gms.dynamic.d.c2(bVar2);
            return com.google.android.gms.dynamic.d.I2(z10 ? this.f83709c.b(uri, context) : this.f83709c.a(uri, context, null, null));
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
    public final boolean o5(String str, boolean z10) {
        if (this.f83708b == null) {
            return false;
        }
        this.f83708b.x(new a.C0277a(str, z10));
        this.f83710d = true;
        return true;
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final int zzb() {
        return this.f83707a instanceof C11120z3 ? 1 : -1;
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zzh(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3, com.google.android.gms.dynamic.b bVar4) {
        return this.f83707a.d((Context) com.google.android.gms.dynamic.d.c2(bVar), (String) com.google.android.gms.dynamic.d.c2(bVar2), (View) com.google.android.gms.dynamic.d.c2(bVar3), (Activity) com.google.android.gms.dynamic.d.c2(bVar4));
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zzi(com.google.android.gms.dynamic.b bVar) {
        return this.f83707a.a((Context) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zzk(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        return this.f83707a.c((Context) com.google.android.gms.dynamic.d.c2(bVar), (View) com.google.android.gms.dynamic.d.c2(bVar2), (Activity) com.google.android.gms.dynamic.d.c2(bVar3));
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final void zzm(com.google.android.gms.dynamic.b bVar) {
        this.f83707a.e((View) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final void zzn(String str, String str2) {
        this.f83709c.d(str, str2);
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final void zzo(String str) {
        this.f83709c.e(str);
    }

    @Deprecated
    public S4(String str, Context context, boolean z10) {
        C11120z3 c11120z3V = C11120z3.v("h.3.2.2/n.android.3.2.2", context, false);
        this.f83707a = c11120z3V;
        this.f83709c = new A3(c11120z3V);
        this.f83708b = C11088x3.v(context);
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final String zze(com.google.android.gms.dynamic.b bVar, String str) {
        return ((AbstractC11072w3) this.f83707a).d((Context) com.google.android.gms.dynamic.d.c2(bVar), str, null, null);
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final String zzg(com.google.android.gms.dynamic.b bVar, byte[] bArr) {
        Context context = (Context) com.google.android.gms.dynamic.d.c2(bVar);
        String strB = this.f83707a.b(context, bArr);
        C11088x3 c11088x3 = this.f83708b;
        if (c11088x3 != null && this.f83710d) {
            String strW = this.f83708b.w(strB, c11088x3.b(context, bArr));
            this.f83710d = false;
            return strW;
        }
        return strB;
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final void zzl(com.google.android.gms.dynamic.b bVar) {
        this.f83709c.c((MotionEvent) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final boolean zzp(com.google.android.gms.dynamic.b bVar) {
        return this.f83709c.g((Uri) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // com.google.android.gms.internal.pal.W4
    @Deprecated
    public final boolean zzq(com.google.android.gms.dynamic.b bVar) {
        return this.f83709c.f((Uri) com.google.android.gms.dynamic.d.c2(bVar));
    }
}
