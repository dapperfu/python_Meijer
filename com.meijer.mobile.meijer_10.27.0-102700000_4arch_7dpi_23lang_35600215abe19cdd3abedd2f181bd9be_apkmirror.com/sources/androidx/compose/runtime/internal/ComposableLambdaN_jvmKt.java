package androidx.compose.runtime.internal;

import J0.c;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/Composer;", "composer", "", "key", "", "tracked", "arity", "", "block", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "composableLambdaN", "(Landroidx/compose/runtime/Composer;IZILjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambdaN;", "composableLambdaNInstance", "(IZILjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambdaN;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposableLambdaN_jvmKt {
    public static final ComposableLambdaN composableLambdaNInstance(int i10, boolean z10, int i11, Object obj) {
        c cVar = new c(i10, z10, i11);
        cVar.b(obj);
        return cVar;
    }

    public static final ComposableLambdaN composableLambdaN(Composer composer, int i10, boolean z10, int i11, Object obj) {
        c cVar;
        composer.startReplaceableGroup(i10);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            cVar = new c(i10, z10, i11);
            composer.t(cVar);
        } else {
            Intrinsics.h(objB, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            cVar = (c) objB;
        }
        cVar.b(obj);
        composer.U();
        return cVar;
    }
}
