package Pn;

import android.content.ComponentName;
import android.content.Context;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import zl.AbstractC18503f;
import zl.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0016"}, d2 = {"LPn/b;", "", "Landroid/content/Context;", "context", "Lzl/k;", "featureManager", "<init>", "(Landroid/content/Context;Lzl/k;)V", "", "launcher", "", "e", "(Ljava/lang/String;)V", "c", "b", "a", "()V", "currentIconId", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "Lzl/k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26227d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final List<String> f26228e = CollectionsKt.p("com.meijer.mobile.meijer.launcher.Default", "com.meijer.mobile.meijer.launcher.WinterHolidays");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    public b(Context context, k featureManager) {
        Intrinsics.j(context, "context");
        Intrinsics.j(featureManager, "featureManager");
        this.context = context;
        this.featureManager = featureManager;
    }

    private final void b(String launcher) {
        this.context.getPackageManager().setComponentEnabledSetting(new ComponentName(this.context, launcher), 2, 1);
    }

    private final void c(String launcher) {
        this.context.getPackageManager().setComponentEnabledSetting(new ComponentName(this.context, launcher), 1, 1);
    }

    private final void e(String launcher) {
        qw.a.INSTANCE.a("Setting active launcher: " + launcher, new Object[0]);
        for (String str : f26228e) {
            if (Intrinsics.e(str, launcher)) {
                c(str);
            } else {
                b(str);
            }
        }
    }

    public final void a() {
        k kVar = this.featureManager;
        AbstractC18503f.r0 r0Var = AbstractC18503f.r0.f172899h;
        e(!kVar.e(r0Var) ? d("default") : d(this.featureManager.c(r0Var)));
    }

    public final String d(String currentIconId) {
        Intrinsics.j(currentIconId, "currentIconId");
        String lowerCase = currentIconId.toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return Intrinsics.e(lowerCase, "holiday") ? "com.meijer.mobile.meijer.launcher.WinterHolidays" : "com.meijer.mobile.meijer.launcher.Default";
    }
}
