package kotlin;

import H1.t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.InterfaceC6342y;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.y;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf0/G;", "", "<init>", "()V", "Lf0/s;", "a", "(Landroidx/compose/runtime/Composer;I)Lf0/s;", "LH1/t;", "layoutDirection", "Lf0/z;", "orientation", "", "reverseScrolling", "b", "(LH1/t;Lf0/z;Z)Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13789G {

    /* renamed from: a, reason: collision with root package name */
    public static final C13789G f130137a = new C13789G();

    public final boolean b(t layoutDirection, EnumC13827z orientation, boolean reverseScrolling) {
        return (layoutDirection != t.f12007b || orientation == EnumC13827z.f130585a) ? !reverseScrolling : reverseScrolling;
    }

    private C13789G() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC13820s a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:536)");
        }
        InterfaceC6342y interfaceC6342yB = y.b(composer, 0);
        boolean zV = composer.V(interfaceC6342yB);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new C13812k(interfaceC6342yB, null, 2, 0 == true ? 1 : 0);
            composer.t(objB);
        }
        C13812k c13812k = (C13812k) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c13812k;
    }
}
