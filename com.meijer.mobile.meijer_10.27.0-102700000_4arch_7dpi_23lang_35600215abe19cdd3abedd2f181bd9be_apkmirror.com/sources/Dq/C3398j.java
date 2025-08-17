package Dq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15339A;
import l0.C15340B;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll0/A;", "lazyListState", "Lkotlin/Function2;", "", "", "onDragEnd", "onDrag", "LDq/i;", "a", "(Ll0/A;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)LDq/i;", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Dq.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C3398j {
    public static final C3397i a(C15339A c15339a, Function2<? super Integer, ? super Integer, Unit> onDragEnd, Function2<? super Integer, ? super Integer, Unit> onDrag, Composer composer, int i10, int i11) {
        Intrinsics.j(onDragEnd, "onDragEnd");
        Intrinsics.j(onDrag, "onDrag");
        composer.startReplaceGroup(2002916092);
        if ((i11 & 1) != 0) {
            c15339a = C15340B.b(0, 0, composer, 0, 3);
        }
        if (ComposerKt.M()) {
            ComposerKt.U(2002916092, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.rememberDragDropListState (DragDropListState.kt:25)");
        }
        composer.startReplaceGroup(1849434622);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = new C3397i(c15339a, onDragEnd, onDrag);
            composer.t(objB);
        }
        C3397i c3397i = (C3397i) objB;
        composer.P();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return c3397i;
    }
}
