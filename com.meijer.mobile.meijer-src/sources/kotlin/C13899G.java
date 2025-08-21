package kotlin;

import H1.t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.InterfaceC6468y;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.y;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf0/G;", "", "<init>", "()V", "Lf0/s;", "a", "(Landroidx/compose/runtime/Composer;I)Lf0/s;", "LH1/t;", "layoutDirection", "Lf0/z;", "orientation", "", "reverseScrolling", "b", "(LH1/t;Lf0/z;Z)Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13899G {

    /* renamed from: a, reason: collision with root package name */
    public static final C13899G f130971a = new C13899G();

    public final boolean b(t layoutDirection, EnumC13937z orientation, boolean reverseScrolling) {
        return (layoutDirection != t.f13339b || orientation == EnumC13937z.f131419a) ? !reverseScrolling : reverseScrolling;
    }

    private C13899G() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC13930s a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:536)");
        }
        InterfaceC6468y interfaceC6468yB = y.b(composer, 0);
        boolean zV = composer.V(interfaceC6468yB);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new C13922k(interfaceC6468yB, null, 2, 0 == true ? 1 : 0);
            composer.t(objB);
        }
        C13922k c13922k = (C13922k) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c13922k;
    }
}
