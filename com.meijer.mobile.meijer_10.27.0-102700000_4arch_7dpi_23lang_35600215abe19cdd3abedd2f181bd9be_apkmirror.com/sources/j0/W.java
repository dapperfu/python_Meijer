package j0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import j0.InterfaceC14806O;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r\"\u0015\u0010\u0014\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r\"\u001e\u0010\u001a\u001a\u00020\u0015*\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lc2/d;", "Lj0/v;", "g", "(Lc2/d;)Lj0/v;", "insets", "", "name", "Lj0/N;", "a", "(Lc2/d;Ljava/lang/String;)Lj0/N;", "Lj0/O$a;", "Lj0/O;", "b", "(Lj0/O$a;Landroidx/compose/runtime/Composer;I)Lj0/O;", "ime", "c", "navigationBars", "d", "statusBars", "e", "systemBars", "", "f", "(Lj0/O$a;Landroidx/compose/runtime/Composer;I)Z", "isImeVisible$annotations", "(Lj0/O$a;)V", "isImeVisible", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W {
    public static final C14805N a(c2.d dVar, String str) {
        return new C14805N(g(dVar), str);
    }

    public static final InsetsValues g(c2.d dVar) {
        return new InsetsValues(dVar.f61362a, dVar.f61363b, dVar.f61364c, dVar.f61365d);
    }

    @JvmName
    public static final InterfaceC14806O b(InterfaceC14806O.Companion companion, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1466917860, i10, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:155)");
        }
        C14809a c14809aD = C14807P.INSTANCE.c(composer, 6).getIme();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c14809aD;
    }

    @JvmName
    public static final InterfaceC14806O c(InterfaceC14806O.Companion companion, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1596175702, i10, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:171)");
        }
        C14809a c14809aE = C14807P.INSTANCE.c(composer, 6).getNavigationBars();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c14809aE;
    }

    @JvmName
    public static final InterfaceC14806O d(InterfaceC14806O.Companion companion, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-675090670, i10, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:175)");
        }
        C14809a c14809aH = C14807P.INSTANCE.c(composer, 6).getStatusBars();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c14809aH;
    }

    @JvmName
    public static final InterfaceC14806O e(InterfaceC14806O.Companion companion, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-282936756, i10, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:179)");
        }
        C14809a c14809aI = C14807P.INSTANCE.c(composer, 6).getSystemBars();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c14809aI;
    }

    @JvmName
    public static final boolean f(InterfaceC14806O.Companion companion, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1873571424, i10, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:300)");
        }
        boolean zF = C14807P.INSTANCE.c(composer, 6).getIme().f();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return zF;
    }
}
