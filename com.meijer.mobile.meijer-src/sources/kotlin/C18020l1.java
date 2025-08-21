package kotlin;

import V0.C5489q0;
import V0.C5492s0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lx0/l1;", "", "<init>", "()V", "LV0/q0;", "a", "(Landroidx/compose/runtime/Composer;I)J", "backgroundColor", "b", "primaryActionColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18020l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C18020l1 f169411a = new C18020l1();

    private C18020l1() {
    }

    @JvmName
    public final long a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1630911716, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:203)");
        }
        C17943E0 c17943e0 = C17943E0.f167967a;
        long jG = C5492s0.g(C5489q0.q(c17943e0.a(composer, 6).i(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), c17943e0.a(composer, 6).n());
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jG;
    }

    @JvmName
    public final long b(Composer composer, int i10) {
        long jK;
        if (ComposerKt.M()) {
            ComposerKt.U(-810329402, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:223)");
        }
        Colors colorsA = C17943E0.f167967a.a(composer, 6);
        if (colorsA.o()) {
            jK = C5492s0.g(C5489q0.q(colorsA.n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colorsA.j());
        } else {
            jK = colorsA.k();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jK;
    }
}
