package Lk;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/os/Vibrator;", "", "duration", "", "amplitude", "", "a", "(Landroid/os/Vibrator;JI)V", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c {
    public static final void a(Vibrator vibrator, long j10, int i10) {
        Intrinsics.j(vibrator, "<this>");
        if (vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(j10, i10));
            } else {
                vibrator.vibrate(j10);
            }
        }
    }

    public static /* synthetic */ void b(Vibrator vibrator, long j10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = 250;
        }
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        a(vibrator, j10, i10);
    }
}
