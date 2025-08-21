package X4;

import O4.AbstractC4373v;
import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes4.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private static final String f41537a = AbstractC4373v.i("PackageManagerHelper");

    private static boolean b(int i10, boolean z10) {
        return i10 == 0 ? z10 : i10 == 1;
    }

    public static void c(Context context, Class<?> cls, boolean z10) {
        try {
            if (z10 == b(a(context, cls.getName()), false)) {
                AbstractC4373v.e().a(f41537a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC4373v abstractC4373vE = AbstractC4373v.e();
            String str = f41537a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            abstractC4373vE.a(str, sb2.toString());
        } catch (Exception e10) {
            AbstractC4373v abstractC4373vE2 = AbstractC4373v.e();
            String str2 = f41537a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            abstractC4373vE2.b(str2, sb3.toString(), e10);
        }
    }

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }
}
