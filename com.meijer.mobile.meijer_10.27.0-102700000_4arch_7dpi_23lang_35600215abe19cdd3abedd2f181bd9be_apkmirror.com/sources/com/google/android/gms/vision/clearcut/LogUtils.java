package com.google.android.gms.vision.clearcut;

import Ud.d;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.C11043j;
import com.google.android.gms.internal.vision.C11058o;
import com.google.android.gms.internal.vision.C11069s;
import com.google.android.gms.internal.vision.C11081w;
import com.google.android.gms.internal.vision.C11084x;
import com.google.android.gms.internal.vision.G2;
import com.google.android.gms.internal.vision.O0;
import com.google.android.gms.internal.vision.r;
import java.util.ArrayList;
import java.util.List;
import qd.C16519f;

@Keep
/* loaded from: classes6.dex */
public class LogUtils {
    public static C11084x zza(long j10, int i10, String str, String str2, List<C11081w> list, G2 g22) {
        r.a aVarP = r.p();
        C11058o.b bVarN = C11058o.p().m(str2).k(j10).n(i10);
        bVarN.l(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((C11058o) ((O0) bVarN.zzf()));
        return (C11084x) ((O0) C11084x.p().k((r) ((O0) aVarP.l(arrayList).k((C11069s) ((O0) C11069s.p().l(g22.f84304b).k(g22.f84303a).m(g22.f84305c).n(g22.f84306d).zzf())).zzf())).zzf());
    }

    private static String zzb(Context context) {
        try {
            return C16519f.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            d.c(e10, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static C11043j zza(Context context) {
        C11043j.a aVarK = C11043j.p().k(context.getPackageName());
        String strZzb = zzb(context);
        if (strZzb != null) {
            aVarK.l(strZzb);
        }
        return (C11043j) ((O0) aVarK.zzf());
    }
}
