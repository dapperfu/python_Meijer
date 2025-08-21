package kotlin;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ln0/X;", "a", "(Landroidx/compose/runtime/Composer;I)Ln0/X;", "n0/Y$a", "Ln0/Y$a;", "getRobolectricImpl$annotations", "()V", "RobolectricImpl", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15865Y {

    /* renamed from: a, reason: collision with root package name */
    private static final a f151902a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"n0/Y$a", "Ln0/X;", "Ln0/V;", "prefetchRequest", "", "a", "(Ln0/V;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.Y$a */
    public static final class a implements InterfaceC15864X {
        @Override // kotlin.InterfaceC15864X
        public void a(InterfaceC15862V prefetchRequest) {
        }

        a() {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        f151902a = Intrinsics.e(lowerCase, "robolectric") ? new a() : null;
    }

    public static final InterfaceC15864X a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1141871251, i10, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)");
        }
        InterfaceC15864X interfaceC15864X = f151902a;
        if (interfaceC15864X != null) {
            composer.startReplaceGroup(1213893039);
            composer.P();
        } else {
            composer.startReplaceGroup(1213931944);
            View view = (View) composer.o(AndroidCompositionLocals_androidKt.k());
            boolean zV = composer.V(view);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new RunnableC15867a(view);
                composer.t(objB);
            }
            interfaceC15864X = (RunnableC15867a) objB;
            composer.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC15864X;
    }
}
