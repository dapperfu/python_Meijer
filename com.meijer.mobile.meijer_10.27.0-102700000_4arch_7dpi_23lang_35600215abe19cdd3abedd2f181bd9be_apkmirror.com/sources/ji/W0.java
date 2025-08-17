package ji;

import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lji/W0;", "Lji/w1;", "Lji/b0;", "Lji/V0;", "anatomy", "<init>", "(Lji/V0;)V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/b0;", "Lji/V0;", "b", "()Lji/V0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class W0 implements w1<InterfaceC14926b0> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final V0 anatomy;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"ji/W0$a", "Lji/b0;", "Lji/q1$m$b;", "a", "Lji/q1$m$b;", "getBaseField", "()Lji/q1$m$b;", "baseField", "Lji/X0;", "b", "Lji/X0;", "g", "()Lji/X0;", "toastVariant", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements InterfaceC14926b0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.m.Inline baseField;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final DefaultInline toastVariant;

        a(W0 w02, LocalThemeScope localThemeScope, Composer composer, int i10) {
            int i11 = i10 & 14;
            q1.m.Inline inlineB = w02.getAnatomy().b(localThemeScope, composer, i11);
            this.baseField = inlineB;
            int i12 = i11 | 432;
            this.toastVariant = new DefaultInline(inlineB, q1.m.Inline.y(inlineB, null, q1.m.a.b.f140113a, null, w02.getAnatomy().a(localThemeScope, C.i.e.f15552d, "Error", composer, i12, 0), null, null, null, 117, null), q1.m.Inline.y(inlineB, null, q1.m.a.d.f140117a, null, w02.getAnatomy().a(localThemeScope, C.i.b.f15549d, "Success", composer, i12, 0), null, null, null, 117, null), q1.m.Inline.y(inlineB, null, q1.m.a.c.f140115a, null, w02.getAnatomy().a(localThemeScope, C.i.C0265i.f15559d, "Information", composer, i12, 0), null, null, null, 117, null), q1.m.Inline.y(inlineB, null, q1.m.a.e.f140119a, null, w02.getAnatomy().a(localThemeScope, C.i.n.f15565d, "Warning", composer, i12, 0), null, null, null, 117, null));
        }

        @Override // ji.InterfaceC14926b0
        /* renamed from: g, reason: from getter */
        public DefaultInline getToastVariant() {
            return this.toastVariant;
        }
    }

    public W0(V0 anatomy) {
        Intrinsics.j(anatomy, "anatomy");
        this.anatomy = anatomy;
    }

    @Override // ji.w1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC14926b0 q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-949039924);
        if (ComposerKt.M()) {
            ComposerKt.U(-949039924, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Notifications.DefaultInline.generateAssembly (Notification.kt:239)");
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
