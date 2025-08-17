package ji;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import ji.InterfaceC14937h;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lji/C;", "", "<init>", "()V", "LJi/M;", "themeScope", "Lji/j1;", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/j1;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.C, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14900C implements InterfaceC14971y {

    /* renamed from: a, reason: collision with root package name */
    public static final C14900C f139605a = new C14900C();

    /* renamed from: b, reason: collision with root package name */
    public static final int f139606b = 0;

    @Override // ji.w1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j1 q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(884388533);
        if (ComposerKt.M()) {
            ComposerKt.U(884388533, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Buttons.Rectangle.Small.Secondary.generateAssembly (Button.kt:279)");
        }
        j1 j1VarQ = new C14901D(InterfaceC14937h.b.c.f139857b).q(themeScope, composer, i10 & 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return j1VarQ;
    }

    private C14900C() {
    }
}
