package androidx.compose.runtime.internal;

import J0.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.I0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001c"}, d2 = {"", "bits", "slot", "a", "(II)I", "e", "(I)I", "b", "Landroidx/compose/runtime/H0;", "other", "", "d", "(Landroidx/compose/runtime/H0;Landroidx/compose/runtime/H0;)Z", "Landroidx/compose/runtime/Composer;", "composer", "key", "tracked", "", "block", "Landroidx/compose/runtime/internal/ComposableLambda;", "composableLambda", "(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;", "composableLambdaInstance", "(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;", "c", "(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;", "Ljava/lang/Object;", "lambdaKey", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposableLambdaKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f50281a = new Object();

    public static final int b(int i10) {
        return a(2, i10);
    }

    public static final ComposableLambda composableLambda(Composer composer, int i10, boolean z10, Object obj) {
        b bVar;
        composer.startMovableGroup(Integer.rotateLeft(i10, 1), f50281a);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            bVar = new b(i10, z10, obj);
            composer.t(bVar);
        } else {
            Intrinsics.h(objB, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) objB;
            bVar.k(obj);
        }
        composer.T();
        return bVar;
    }

    public static final int e(int i10) {
        return a(1, i10);
    }

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final ComposableLambda composableLambdaInstance(int i10, boolean z10, Object obj) {
        return new b(i10, z10, obj);
    }

    public static final boolean d(H0 h02, H0 h03) {
        if (h02 == null) {
            return true;
        }
        if (!(h02 instanceof I0) || !(h03 instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) h02;
        return !i02.u() || Intrinsics.e(h02, h03) || Intrinsics.e(i02.getAnchor(), ((I0) h03).getAnchor());
    }

    public static final ComposableLambda c(int i10, boolean z10, Object obj, Composer composer, int i11) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1366)");
        }
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = new b(i10, z10, obj);
            composer.t(objB);
        }
        b bVar = (b) objB;
        bVar.k(obj);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return bVar;
    }
}
