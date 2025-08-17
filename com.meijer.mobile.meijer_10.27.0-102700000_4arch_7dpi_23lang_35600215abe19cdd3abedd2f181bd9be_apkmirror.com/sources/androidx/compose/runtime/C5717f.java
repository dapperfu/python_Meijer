package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "c", "()V", "Landroidx/compose/runtime/k;", "d", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/k;", "Landroidx/compose/runtime/H0;", "b", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/H0;", "currentRecomposeScope", "", "a", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5717f {
    @PublishedApi
    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    @JvmName
    public static final int a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:213)");
        }
        int iQ = composer.Q();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return iQ;
    }

    @JvmName
    public static final H0 b(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:184)");
        }
        H0 h0Z = composer.z();
        if (h0Z != null) {
            composer.O(h0Z);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            return h0Z;
        }
        throw new IllegalStateException("no recompose scope found");
    }

    public static final AbstractC5727k d(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:461)");
        }
        AbstractC5727k abstractC5727kR = composer.R();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return abstractC5727kR;
    }
}
