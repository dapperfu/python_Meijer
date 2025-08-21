package r1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a4\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0012\u001a\u00060\u000fj\u0002`\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"", "b", "()I", "Landroidx/compose/ui/Modifier;", "", "mergeDescendants", "Lkotlin/Function1;", "Lr1/u;", "", "Lkotlin/ExtensionFunctionType;", "properties", "c", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastIdentifier", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16819m {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicInteger f159168a = new AtomicInteger(0);

    public static final Modifier a(Modifier modifier, Function1<? super u, Unit> function1) {
        return modifier.then(new ClearAndSetSemanticsElement(function1));
    }

    public static final int b() {
        return f159168a.addAndGet(1);
    }

    public static final Modifier c(Modifier modifier, boolean z10, Function1<? super u, Unit> function1) {
        return modifier.then(new AppendedSemanticsElement(z10, function1));
    }

    public static /* synthetic */ Modifier d(Modifier modifier, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(modifier, z10, function1);
    }
}
