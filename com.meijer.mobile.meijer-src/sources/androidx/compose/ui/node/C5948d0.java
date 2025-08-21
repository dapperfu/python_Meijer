package androidx.compose.ui.node;

import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u0012\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier$b;", "prev", "next", "", "d", "(Landroidx/compose/ui/Modifier$b;Landroidx/compose/ui/Modifier$b;)I", "Landroidx/compose/ui/Modifier$c;", "T", "Landroidx/compose/ui/node/Y;", "node", "", "f", "(Landroidx/compose/ui/node/Y;Landroidx/compose/ui/Modifier$c;)V", "Landroidx/compose/ui/Modifier;", "LD0/c;", "result", "e", "(Landroidx/compose/ui/Modifier;LD0/c;)LD0/c;", "androidx/compose/ui/node/d0$a", "a", "Landroidx/compose/ui/node/d0$a;", "SentinelHead", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5948d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f51733a;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/d0$a", "Landroidx/compose/ui/Modifier$c;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.d0$a */
    public static final class a extends Modifier.c {
        public String toString() {
            return "<Head>";
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier$b;", "element", "", "invoke", "(Landroidx/compose/ui/Modifier$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.d0$b */
    static final class b extends Lambda implements Function1<Modifier.b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D0.c<Modifier.b> f51734f;

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Modifier.b bVar) {
            this.f51734f.c(bVar);
            return Boolean.TRUE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D0.c<Modifier.b> cVar) {
            super(1);
            this.f51734f = cVar;
        }
    }

    static {
        a aVar = new a();
        aVar.z2(-1);
        f51733a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Modifier.c> void f(Y<T> y10, Modifier.c cVar) {
        Intrinsics.h(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        y10.e(cVar);
    }

    public static final int d(Modifier.b bVar, Modifier.b bVar2) {
        if (Intrinsics.e(bVar, bVar2)) {
            return 2;
        }
        if (P0.d.a(bVar, bVar2)) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final D0.c<Modifier.b> e(Modifier modifier, D0.c<Modifier.b> cVar) {
        D0.c cVar2 = new D0.c(new Modifier[RangesKt.f(cVar.getSize(), 16)], 0);
        cVar2.c(modifier);
        b bVar = null;
        while (cVar2.getSize() != 0) {
            Modifier modifier2 = (Modifier) cVar2.u(cVar2.getSize() - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                cVar2.c(combinedModifier.getInner());
                cVar2.c(combinedModifier.getOuter());
            } else if (modifier2 instanceof Modifier.b) {
                cVar.c(modifier2);
            } else {
                if (bVar == null) {
                    bVar = new b(cVar);
                }
                modifier2.all(bVar);
                bVar = bVar;
            }
        }
        return cVar;
    }
}
