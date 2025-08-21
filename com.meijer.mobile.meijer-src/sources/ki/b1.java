package ki;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lki/b1;", "Lki/w1;", "Lki/c0;", "<init>", "()V", "LKi/M;", "themeScope", "a", "(LKi/M;Landroidx/compose/runtime/Composer;I)Lki/c0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b1 implements w1<InterfaceC15162c0> {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f142020a = new b1();

    /* renamed from: b, reason: collision with root package name */
    public static final int f142021b = 0;

    @Override // ki.w1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC15162c0 q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-1161651229);
        if (ComposerKt.M()) {
            ComposerKt.U(-1161651229, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Notifications.Toast.generateAssembly (Notification.kt:176)");
        }
        InterfaceC15162c0 interfaceC15162c0Q = new Z0(new V0()).q(themeScope, composer, i10 & 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return interfaceC15162c0Q;
    }

    private b1() {
    }
}
