package com.google.android.gms.vision.clearcut;

import Wd.d;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.C11168j;
import com.google.android.gms.internal.vision.C11183o;
import com.google.android.gms.internal.vision.C11194s;
import com.google.android.gms.internal.vision.C11206w;
import com.google.android.gms.internal.vision.C11209x;
import com.google.android.gms.internal.vision.G2;
import com.google.android.gms.internal.vision.O0;
import com.google.android.gms.internal.vision.r;
import java.util.ArrayList;
import java.util.List;
import sd.C17067f;

@Keep
/* loaded from: classes6.dex */
public class LogUtils {
    public static C11209x zza(long j10, int i10, String str, String str2, List<C11206w> list, G2 g22) {
        r.a aVarP = r.p();
        C11183o.b bVarN = C11183o.p().m(str2).k(j10).n(i10);
        bVarN.l(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((C11183o) ((O0) bVarN.zzf()));
        return (C11209x) ((O0) C11209x.p().k((r) ((O0) aVarP.l(arrayList).k((C11194s) ((O0) C11194s.p().l(g22.f85144b).k(g22.f85143a).m(g22.f85145c).n(g22.f85146d).zzf())).zzf())).zzf());
    }

    private static String zzb(Context context) {
        try {
            return C17067f.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            d.c(e10, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static C11168j zza(Context context) {
        C11168j.a aVarK = C11168j.p().k(context.getPackageName());
        String strZzb = zzb(context);
        if (strZzb != null) {
            aVarK.l(strZzb);
        }
        return (C11168j) ((O0) aVarK.zzf());
    }
}
