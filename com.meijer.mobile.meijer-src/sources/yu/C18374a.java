package yu;

import androidx.compose.runtime.Composer;
import kotlin.Deprecated;
import kotlin.InterfaceC6452i;
import kotlin.InterfaceC6468y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.y;
import l0.C15429A;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a±\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u000028\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2>\b\u0002\u0010\u0013\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aÁ\u0001\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u000028\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2>\b\u0002\u0010\u0013\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aQ\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u000028\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Ll0/A;", "lazyListState", "Lkotlin/Function2;", "Lyu/h;", "Lkotlin/ParameterName;", "name", "layoutInfo", "Lyu/i;", "item", "", "snapOffsetForItem", "Lc0/y;", "", "decayAnimationSpec", "Lc0/i;", "springAnimationSpec", "Lkotlin/Function3;", "startIndex", "targetIndex", "snapIndex", "Lyu/e;", "b", "(Ll0/A;Lkotlin/jvm/functions/Function2;Lc0/y;Lc0/i;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lyu/e;", "LH1/h;", "endContentPadding", "c", "(Ll0/A;Lkotlin/jvm/functions/Function2;FLc0/y;Lc0/i;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lyu/e;", "Lyu/b;", "a", "(Ll0/A;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)Lyu/b;", "lib_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* renamed from: yu.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18374a {
    public static final b a(C15429A lazyListState, Function2<? super h, ? super SnapperLayoutItemInfo, Integer> function2, Composer composer, int i10, int i11) {
        Intrinsics.j(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-1015087902);
        if ((i11 & 2) != 0) {
            function2 = d.f172098a.a();
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

    public static final e b(C15429A lazyListState, Function2<? super h, ? super SnapperLayoutItemInfo, Integer> function2, InterfaceC6468y<Float> interfaceC6468y, InterfaceC6452i<Float> interfaceC6452i, Function3<? super h, ? super Integer, ? super Integer, Integer> function3, Composer composer, int i10, int i11) {
        Intrinsics.j(lazyListState, "lazyListState");
        composer.startReplaceableGroup(340674139);
        Function2<? super h, ? super SnapperLayoutItemInfo, Integer> function2A = (i11 & 2) != 0 ? d.f172098a.a() : function2;
        InterfaceC6468y<Float> interfaceC6468yB = (i11 & 4) != 0 ? y.b(composer, 0) : interfaceC6468y;
        InterfaceC6452i<Float> interfaceC6452iC = (i11 & 8) != 0 ? f.f172139a.c() : interfaceC6452i;
        InterfaceC6468y<Float> interfaceC6468y2 = interfaceC6468yB;
        e eVarA = g.a(a(lazyListState, function2A, composer, i10 & 126, 0), interfaceC6468y2, interfaceC6452iC, (i11 & 16) != 0 ? f.f172139a.b() : function3, composer, ((i10 >> 3) & 7168) | 576, 0);
        composer.U();
        return eVarA;
    }

    @Deprecated
    public static final e c(C15429A lazyListState, Function2<? super h, ? super SnapperLayoutItemInfo, Integer> function2, float f10, InterfaceC6468y<Float> interfaceC6468y, InterfaceC6452i<Float> interfaceC6452i, Function3<? super h, ? super Integer, ? super Integer, Integer> function3, Composer composer, int i10, int i11) {
        Intrinsics.j(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-1780164387);
        if ((i11 & 2) != 0) {
            function2 = d.f172098a.a();
        }
        if ((i11 & 4) != 0) {
            H1.h.p(0);
        }
        if ((i11 & 8) != 0) {
            interfaceC6468y = y.b(composer, 0);
        }
        InterfaceC6468y<Float> interfaceC6468y2 = interfaceC6468y;
        if ((i11 & 16) != 0) {
            interfaceC6452i = f.f172139a.c();
        }
        InterfaceC6452i<Float> interfaceC6452i2 = interfaceC6452i;
        if ((i11 & 32) != 0) {
            function3 = f.f172139a.b();
        }
        e eVarA = g.a(a(lazyListState, function2, composer, i10 & 126, 0), interfaceC6468y2, interfaceC6452i2, function3, composer, ((i10 >> 6) & 7168) | 576, 0);
        composer.U();
        return eVarA;
    }
}
