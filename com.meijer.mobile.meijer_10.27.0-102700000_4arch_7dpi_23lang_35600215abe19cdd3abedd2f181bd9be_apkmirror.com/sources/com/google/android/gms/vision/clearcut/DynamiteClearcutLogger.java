package com.google.android.gms.vision.clearcut;

import Ud.d;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.C11015c;
import com.google.android.gms.internal.vision.C11059o0;
import com.google.android.gms.internal.vision.C11084x;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes6.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza = C11015c.a().j(2, C11059o0.f84611a);
    private b zzb = new b(0.03333333333333333d);
    private VisionClearcutLogger zzc;

    public final void zza(int i10, C11084x c11084x) {
        if (i10 != 3 || this.zzb.a()) {
            zza.execute(new a(this, i10, c11084x));
        } else {
            d.e("Skipping image analysis log due to rate limiting", new Object[0]);
        }
    }

    public DynamiteClearcutLogger(@RecentlyNonNull Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }
}
