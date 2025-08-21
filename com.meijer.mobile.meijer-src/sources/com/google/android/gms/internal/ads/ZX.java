package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes6.dex */
public final class ZX implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final T10 f73036a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f73037b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f73038c;

    /* renamed from: d, reason: collision with root package name */
    private final C6693Aq f73039d;

    ZX(C8133fZ c8133fZ, C9695u60 c9695u60, Context context, C6693Aq c6693Aq) {
        this.f73036a = c8133fZ;
        this.f73037b = c9695u60;
        this.f73038c = context;
        this.f73039d = c6693Aq;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 7;
    }

    final /* synthetic */ C7599aY a(C7872d20 c7872d20) {
        String str;
        boolean z10;
        String strZzj;
        int i10;
        float f10;
        float f11;
        int i11;
        DisplayMetrics displayMetrics;
        Oc.d2 d2Var = this.f73037b.f79579e;
        Oc.d2[] d2VarArr = d2Var.f23406g;
        if (d2VarArr == null) {
            str = d2Var.f23400a;
            z10 = d2Var.f23408i;
        } else {
            String str2 = null;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            for (Oc.d2 d2Var2 : d2VarArr) {
                boolean z14 = d2Var2.f23408i;
                if (!z14 && !z12) {
                    str2 = d2Var2.f23400a;
                    z12 = true;
                }
                if (z14) {
                    if (!z13) {
                        z11 = true;
                    }
                    z13 = true;
                }
                if (z12 && z13) {
                    break;
                }
            }
            str = str2;
            z10 = z11;
        }
        Resources resources = this.f73038c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzj = null;
            i10 = 0;
            f10 = 0.0f;
            f11 = 0.0f;
            i11 = 0;
        } else {
            C6693Aq c6693Aq = this.f73039d;
            float f12 = displayMetrics.density;
            int i12 = displayMetrics.widthPixels;
            int i13 = displayMetrics.heightPixels;
            strZzj = c6693Aq.j().zzj();
            f10 = 0.0f;
            i11 = i12;
            i10 = i13;
            f11 = f12;
        }
        StringBuilder sb2 = new StringBuilder();
        Oc.d2[] d2VarArr2 = d2Var.f23406g;
        if (d2VarArr2 != null) {
            int i14 = 0;
            boolean z15 = false;
            while (true) {
                float f13 = f10;
                if (i14 >= d2VarArr2.length) {
                    break;
                }
                Oc.d2 d2Var3 = d2VarArr2[i14];
                if (d2Var3.f23408i) {
                    z15 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i15 = d2Var3.f23404e;
                    if (i15 == -1) {
                        i15 = f11 != f13 ? (int) (d2Var3.f23405f / f11) : -1;
                    }
                    sb2.append(i15);
                    sb2.append("x");
                    int i16 = d2Var3.f23401b;
                    if (i16 == -2) {
                        i16 = f11 != f13 ? (int) (d2Var3.f23402c / f11) : -2;
                    }
                    sb2.append(i16);
                }
                i14++;
                f10 = f13;
            }
            if (z15) {
                if (sb2.length() != 0) {
                    sb2.insert(0, "|");
                }
                sb2.insert(0, "320x50");
            }
        }
        return new C7599aY(d2Var, str, z10, sb2.toString(), f11, i11, i10, strZzj, this.f73037b.f79591q);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.m(this.f73036a.zzb(), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.YX
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return this.f72409a.a((C7872d20) obj);
            }
        }, C7033Kq.f69020g);
    }
}
