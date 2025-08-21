package Oi;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\fH\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"LOi/c;", "", "", "d", "()Z", "LOi/m;", "getType", "()LOi/m;", "", "subName", "c", "(Ljava/lang/String;)Ljava/lang/String;", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "localThemeScope", "e", "a", "LOi/l;", "getState", "()LOi/l;", "state", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface c {
    default void b(LocalThemeScope localThemeScope, Composer composer, int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        composer.startReplaceGroup(-1658812808);
        if (ComposerKt.M()) {
            ComposerKt.U(-1658812808, i10, -1, "com.meijer.mobile.androidacres.showcase.Showcase.Controls (ShowcaseModel.kt:35)");
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    default String c(String subName) {
        Intrinsics.j(subName, "subName");
        return subName;
    }

    default boolean d() {
        return true;
    }

    void f(LocalThemeScope localThemeScope, Composer composer, int i10);

    String getName();

    l getState();

    default void a(LocalThemeScope localThemeScope, Composer composer, int i10) {
        Intrinsics.j(localThemeScope, "localThemeScope");
        composer.startReplaceGroup(2037495992);
        if (ComposerKt.M()) {
            ComposerKt.U(2037495992, i10, -1, "com.meijer.mobile.androidacres.showcase.Showcase.GetControls (ShowcaseModel.kt:45)");
        }
        b(localThemeScope, composer, i10 & 126);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    default void e(LocalThemeScope localThemeScope, Composer composer, int i10) {
        Intrinsics.j(localThemeScope, "localThemeScope");
        composer.startReplaceGroup(-180677845);
        if (ComposerKt.M()) {
            ComposerKt.U(-180677845, i10, -1, "com.meijer.mobile.androidacres.showcase.Showcase.GetContent (ShowcaseModel.kt:40)");
        }
        f(localThemeScope, composer, i10 & 126);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    default m getType() {
        return getState().getType();
    }
}
