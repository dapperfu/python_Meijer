package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lx0/E0;", "", "<init>", "()V", "Lx0/D;", "a", "(Landroidx/compose/runtime/Composer;I)Lx0/D;", "colors", "Lx0/P1;", "c", "(Landroidx/compose/runtime/Composer;I)Lx0/P1;", "typography", "Lx0/e1;", "b", "(Landroidx/compose/runtime/Composer;I)Lx0/e1;", "shapes", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.E0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17877E0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C17877E0 f166879a = new C17877E0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f166880b = 0;

    private C17877E0() {
    }

    @JvmName
    public final Colors a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1462282791, i10, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:98)");
        }
        Colors colors = (Colors) composer.o(C17876E.e());
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return colors;
    }

    @JvmName
    public final Shapes b(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1586253541, i10, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:110)");
        }
        Shapes shapes = (Shapes) composer.o(C17936f1.a());
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return shapes;
    }

    @JvmName
    public final Typography c(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1630198856, i10, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:106)");
        }
        Typography p12 = (Typography) composer.o(Q1.c());
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return p12;
    }
}
