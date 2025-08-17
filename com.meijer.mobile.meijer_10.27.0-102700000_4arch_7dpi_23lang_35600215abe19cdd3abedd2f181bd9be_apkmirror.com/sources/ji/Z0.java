package ji;

import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lji/Z0;", "Lji/w1;", "Lji/c0;", "Lji/V0;", "anatomy", "<init>", "(Lji/V0;)V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/c0;", "Lji/V0;", "b", "()Lji/V0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class Z0 implements w1<InterfaceC14928c0> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final V0 anatomy;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"ji/Z0$a", "Lji/c0;", "Lji/q1$m$c;", "a", "Lji/q1$m$c;", "getBaseField", "()Lji/q1$m$c;", "baseField", "Lji/Y0;", "b", "Lji/Y0;", "g", "()Lji/Y0;", "toastVariant", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements InterfaceC14928c0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.m.Toast baseField;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final DefaultToast toastVariant;

        a(Z0 z02, LocalThemeScope localThemeScope, Composer composer, int i10) {
            int i11 = i10 & 14;
            q1.m.Toast toastC = z02.getAnatomy().c(localThemeScope, composer, i11);
            this.baseField = toastC;
            int i12 = i11 | 48;
            this.toastVariant = new DefaultToast(toastC, q1.m.Toast.y(toastC, null, q1.m.a.b.f140113a, null, z02.getAnatomy().a(localThemeScope, C.i.e.f15552d, null, composer, i12, 4), null, null, null, 117, null), q1.m.Toast.y(toastC, null, q1.m.a.d.f140117a, null, z02.getAnatomy().a(localThemeScope, C.i.b.f15549d, null, composer, i12, 4), null, null, null, 117, null), q1.m.Toast.y(toastC, null, q1.m.a.c.f140115a, null, z02.getAnatomy().a(localThemeScope, C.i.C0265i.f15559d, null, composer, i12, 4), null, null, null, 117, null), q1.m.Toast.y(toastC, null, q1.m.a.e.f140119a, null, z02.getAnatomy().a(localThemeScope, C.i.n.f15565d, null, composer, i12, 4), null, null, null, 117, null));
        }

        @Override // ji.InterfaceC14928c0
        /* renamed from: g, reason: from getter */
        public DefaultToast getToastVariant() {
            return this.toastVariant;
        }
    }

    public Z0(V0 anatomy) {
        Intrinsics.j(anatomy, "anatomy");
        this.anatomy = anatomy;
    }

    @Override // ji.w1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC14928c0 q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-436030956);
        if (ComposerKt.M()) {
            ComposerKt.U(-436030956, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Notifications.DefaultToast.generateAssembly (Notification.kt:187)");
        }
        a aVar = new a(this, themeScope, composer, i10);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return aVar;
    }

    /* renamed from: b, reason: from getter */
    public final V0 getAnatomy() {
        return this.anatomy;
    }
}
