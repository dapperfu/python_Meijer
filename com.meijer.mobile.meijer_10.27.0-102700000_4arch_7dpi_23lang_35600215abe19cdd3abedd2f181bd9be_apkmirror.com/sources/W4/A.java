package W4;

import N4.AbstractC4333v;
import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes4.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38467a = AbstractC4333v.i("PackageManagerHelper");

    private static boolean b(int i10, boolean z10) {
        return i10 == 0 ? z10 : i10 == 1;
    }

    public static void c(Context context, Class<?> cls, boolean z10) {
        try {
            if (z10 == b(a(context, cls.getName()), false)) {
                AbstractC4333v.e().a(f38467a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC4333v abstractC4333vE = AbstractC4333v.e();
            String str = f38467a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            abstractC4333vE.a(str, sb2.toString());
        } catch (Exception e10) {
            AbstractC4333v abstractC4333vE2 = AbstractC4333v.e();
            String str2 = f38467a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            abstractC4333vE2.b(str2, sb3.toString(), e10);
        }
    }

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }
}
