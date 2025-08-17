package Gj;

import Gj.c;
import H1.h;
import H1.w;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.layout.C5775b;
import androidx.compose.ui.layout.C5795w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.text.TextStyle;
import j0.InterfaceC14800I;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C17877E0;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ac\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "LV0/q0;", "backgroundColor", "contentColor", "Lkotlin/Function1;", "Lj0/I;", "", "Lkotlin/ExtensionFunctionType;", "content", "c", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "badgeContent", "Lj0/b;", "d", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f11562a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC14800I f11563b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Gj.c$a$a, reason: collision with other inner class name */
        static final class C0172a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f11564a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14800I f11565b;

            /* JADX WARN: Multi-variable type inference failed */
            C0172a(Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, InterfaceC14800I interfaceC14800I) {
                this.f11564a = function3;
                this.f11565b = interfaceC14800I;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1820263096, i10, -1, "com.meijer.mobile.core.design.compose.widget.badge.Badge.<anonymous>.<anonymous>.<anonymous> (CartBadge.kt:87)");
                }
                this.f11564a.invoke(this.f11565b, composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3, InterfaceC14800I interfaceC14800I) {
            this.f11562a = function3;
            this.f11563b = interfaceC14800I;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1787784039, i10, -1, "com.meijer.mobile.core.design.compose.widget.badge.Badge.<anonymous>.<anonymous> (CartBadge.kt:81)");
            }
            N1.a(TextStyle.c(C17877E0.f166879a.c(composer, C17877E0.f166880b).getButton(), 0L, w.i(10), FontWeight.INSTANCE.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), ComposableLambdaKt.c(-1820263096, true, new C0172a(this.f11562a, this.f11563b), composer, 54), composer, 48);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14800I, Composer, Integer, Unit> f11566a;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super InterfaceC14800I, ? super Composer, ? super Integer, Unit> function3) {
            this.f11566a = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(Function3 function3, f0 f0Var, K k10, f0 f0Var2, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            if (function3 != null) {
                f0.a.l(layout, f0Var, 0, 0, 0.0f, 4, null);
                f0.a.l(layout, f0Var2, f0Var.getWidth() + (-k10.E0(h.p(26))), 10, 0.0f, 4, null);
            } else {
                f0.a.l(layout, f0Var, 0, 0, 0.0f, 4, null);
            }
            return Unit.f142422a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(final K Layout, List<? extends I> measurables, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            List<? extends I> list = measurables;
            for (I i10 : list) {
                if (Intrinsics.e(C5795w.a(i10), "badge")) {
                    final f0 f0VarK0 = i10.k0(H1.b.d(j10, 0, 0, 0, 0, 11, null));
                    for (I i11 : list) {
                        if (Intrinsics.e(C5795w.a(i11), "anchor")) {
                            final f0 f0VarK02 = i11.k0(j10);
                            int iL0 = f0VarK02.l0(C5775b.a());
                            int iL02 = f0VarK02.l0(C5775b.b());
                            int width = f0VarK02.getWidth();
                            int height = f0VarK02.getHeight();
                            Map<AbstractC5774a, Integer> mapO = MapsKt.o(TuplesKt.a(C5775b.a(), Integer.valueOf(iL0)), TuplesKt.a(C5775b.b(), Integer.valueOf(iL02)));
                            final Function3<InterfaceC14800I, Composer, Integer, Unit> function3 = this.f11566a;
                            return Layout.g1(width, height, mapO, new Function1() { // from class: Gj.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return c.b.b(function3, f0VarK02, Layout, f0VarK0, (f0.a) obj);
                                }
                            });
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.Modifier r16, long r17, long r19, kotlin.jvm.functions.Function3<? super j0.InterfaceC14800I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gj.c.c(androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(androidx.compose.ui.Modifier r19, long r20, long r22, kotlin.jvm.functions.Function3<? super j0.InterfaceC14800I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, final kotlin.jvm.functions.Function3<? super j0.InterfaceC14810b, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gj.c.d(androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Modifier modifier, long j10, long j11, Function3 function3, Function3 function32, int i10, int i11, Composer composer, int i12) {
        d(modifier, j10, j11, function3, function32, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Modifier modifier, long j10, long j11, Function3 function3, int i10, int i11, Composer composer, int i12) {
        c(modifier, j10, j11, function3, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
