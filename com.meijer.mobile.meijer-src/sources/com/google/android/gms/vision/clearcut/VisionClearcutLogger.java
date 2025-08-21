package com.google.android.gms.vision.clearcut;

import Wd.d;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.A0;
import com.google.android.gms.internal.vision.C11152f;
import com.google.android.gms.internal.vision.C11209x;
import gd.C14346a;

@Keep
/* loaded from: classes6.dex */
public class VisionClearcutLogger {
    private final C14346a zza;
    private boolean zzb = true;

    public VisionClearcutLogger(@RecentlyNonNull Context context) {
        this.zza = new C14346a(context, "VISION", null);
    }

    public final void zza(int i10, C11209x c11209x) {
        byte[] bArrD = c11209x.d();
        if (i10 >= 0 && i10 <= 3) {
            try {
                if (this.zzb) {
                    this.zza.a(bArrD).b(i10).a();
                    return;
                }
                C11209x.a aVarP = C11209x.p();
                try {
                    aVarP.c(bArrD, 0, bArrD.length, A0.c());
                    d.b("Would have logged:\n%s", aVarP.toString());
                    return;
                } catch (Exception e10) {
                    d.c(e10, "Parsing error", new Object[0]);
                    return;
                }
            } catch (Exception e11) {
                C11152f.b(e11);
                d.c(e11, "Failed to log", new Object[0]);
                return;
            }
        }
        d.d("Illegal event code: %d", Integer.valueOf(i10));
    }
}
