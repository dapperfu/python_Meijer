package Cu;

import androidx.compose.runtime.Composer;
import kotlin.Deprecated;
import kotlin.InterfaceC6326i;
import kotlin.InterfaceC6342y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.y;
import l0.C15339A;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a±\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u000028\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2>\b\u0002\u0010\u0013\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aÁ\u0001\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u000028\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2>\b\u0002\u0010\u0013\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aQ\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u000028\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Ll0/A;", "lazyListState", "Lkotlin/Function2;", "LCu/h;", "Lkotlin/ParameterName;", "name", "layoutInfo", "LCu/i;", "item", "", "snapOffsetForItem", "Lc0/y;", "", "decayAnimationSpec", "Lc0/i;", "springAnimationSpec", "Lkotlin/Function3;", "startIndex", "targetIndex", "snapIndex", "LCu/e;", "b", "(Ll0/A;Lkotlin/jvm/functions/Function2;Lc0/y;Lc0/i;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)LCu/e;", "LH1/h;", "endContentPadding", "c", "(Ll0/A;Lkotlin/jvm/functions/Function2;FLc0/y;Lc0/i;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)LCu/e;", "LCu/b;", "a", "(Ll0/A;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)LCu/b;", "lib_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    public static final b a(C15339A lazyListState, Function2<? super h, ? super SnapperLayoutItemInfo, Integer> function2, Composer composer, int i10, int i11) {
        Intrinsics.j(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-1015087902);
        if ((i11 & 2) != 0) {
            function2 = d.f4921a.a();
        }
        composer.startReplaceableGroup(511388516);
        boolean zV = composer.V(lazyListState) | composer.V(function2);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new b(lazyListState, function2);
            composer.t(objB);
        }
        composer.U();
        b bVar = (b) objB;
        composer.U();
        return bVar;
    }

    public static final e b(C15339A lazyListState, Function2<? super h, ? super SnapperLayoutItemInfo, Integer> function2, InterfaceC6342y<Float> interfaceC6342y, InterfaceC6326i<Float> interfaceC6326i, Function3<? super h, ? super Integer, ? super Integer, Integer> function3, Composer composer, int i10, int i11) {
        Intrinsics.j(lazyListState, "lazyListState");
        composer.startReplaceableGroup(340674139);
        Function2<? super h, ? super SnapperLayoutItemInfo, Integer> function2A = (i11 & 2) != 0 ? d.f4921a.a() : function2;
        InterfaceC6342y<Float> interfaceC6342yB = (i11 & 4) != 0 ? y.b(composer, 0) : interfaceC6342y;
        InterfaceC6326i<Float> interfaceC6326iC = (i11 & 8) != 0 ? f.f4962a.c() : interfaceC6326i;
        InterfaceC6342y<Float> interfaceC6342y2 = interfaceC6342yB;
        e eVarA = g.a(a(lazyListState, function2A, composer, i10 & 126, 0), interfaceC6342y2, interfaceC6326iC, (i11 & 16) != 0 ? f.f4962a.b() : function3, composer, ((i10 >> 3) & 7168) | 576, 0);
        composer.U();
        return eVarA;
    }

    @Deprecated
    public static final e c(C15339A lazyListState, Function2<? super h, ? super SnapperLayoutItemInfo, Integer> function2, float f10, InterfaceC6342y<Float> interfaceC6342y, InterfaceC6326i<Float> interfaceC6326i, Function3<? super h, ? super Integer, ? super Integer, Integer> function3, Composer composer, int i10, int i11) {
        Intrinsics.j(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-1780164387);
        if ((i11 & 2) != 0) {
            function2 = d.f4921a.a();
        }
        if ((i11 & 4) != 0) {
            H1.h.p(0);
        }
        if ((i11 & 8) != 0) {
            interfaceC6342y = y.b(composer, 0);
        }
        InterfaceC6342y<Float> interfaceC6342y2 = interfaceC6342y;
        if ((i11 & 16) != 0) {
            interfaceC6326i = f.f4962a.c();
        }
        InterfaceC6326i<Float> interfaceC6326i2 = interfaceC6326i;
        if ((i11 & 32) != 0) {
            function3 = f.f4962a.b();
        }
        e eVarA = g.a(a(lazyListState, function2, composer, i10 & 126, 0), interfaceC6342y2, interfaceC6326i2, function3, composer, ((i10 >> 6) & 7168) | 576, 0);
        composer.U();
        return eVarA;
    }
}
