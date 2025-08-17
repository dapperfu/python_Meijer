package bk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/app/Activity;", "", "overrideType", "enterAnim", "exitAnim", "backgroundColor", "", "a", "(Landroid/app/Activity;IIII)V", "i18n_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {
    @SuppressLint({"DeprecatedCall"})
    public static final void a(Activity activity, int i10, int i11, int i12, int i13) {
        Intrinsics.j(activity, "<this>");
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 34) {
            if (i14 >= 33) {
                activity.overridePendingTransition(i11, i12, i13);
                return;
            } else {
                activity.overridePendingTransition(i11, i12);
                return;
            }
        }
        int i15 = 0;
        if (i10 != 0 && i10 == 1) {
            i15 = 1;
        }
        activity.overrideActivityTransition(i15, i11, i12, i13);
    }

    public static /* synthetic */ void b(Activity activity, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        a(activity, i10, i11, i12, i13);
    }
}
