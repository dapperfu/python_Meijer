package d0;

import V0.C5349s0;
import android.content.Context;
import androidx.compose.runtime.InterfaceC5739q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import f1.C13832e;
import j0.InterfaceC14794C;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/q;", "Ld0/K;", "b", "(Landroidx/compose/runtime/q;)Ld0/K;", "Lf1/e;", "source", "", "c", "(I)F", "LV0/q0;", "a", "J", "DefaultGlowColor", "Lj0/C;", "Lj0/C;", "DefaultGlowPaddingValues", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13436c {

    /* renamed from: a, reason: collision with root package name */
    private static final long f126944a = C5349s0.d(4284900966L);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC14794C f126945b = androidx.compose.foundation.layout.D.c(0.0f, 0.0f, 3, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(int i10) {
        return C13832e.f(i10, C13832e.INSTANCE.c()) ? 4.0f : 1.0f;
    }

    public static final K b(InterfaceC5739q interfaceC5739q) {
        Context context = (Context) interfaceC5739q.e(AndroidCompositionLocals_androidKt.g());
        H1.d dVar = (H1.d) interfaceC5739q.e(C5892t0.g());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) interfaceC5739q.e(I.a());
        if (overscrollConfiguration == null) {
            return null;
        }
        return new C13435b(context, dVar, overscrollConfiguration.getGlowColor(), overscrollConfiguration.getDrawPadding(), null);
    }
}
