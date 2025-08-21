package es;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import as.C6293f;
import bk.AbstractC6392a;
import dk.C13698b;
import es.I;
import j0.InterfaceC14882C;
import java.util.List;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import l0.C15432b;
import l0.InterfaceC15433c;
import yu.C18374a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a?\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aS\u0010\u0012\u001a\u00020\b*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u000e\u0010\u0011\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Les/i;", "orders", "Lkotlin/Function1;", "Les/f;", "", "onOrderStatusAction", "i", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "position", "count", "e", "(LKi/M;IILandroidx/compose/runtime/Composer;I)V", "updatedIndex", "g", "(LKi/M;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class I {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<C15429A, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130639a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15429A f130640b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f130641c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<OrderStatusCardDecorator> f130642d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f130643e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13870f, Unit> f130644f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f130645g;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: es.I$a$a, reason: collision with other inner class name */
        public static final class C2062a extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final C2062a f130646f = new C2062a();

            public C2062a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(OrderStatusCardDecorator orderStatusCardDecorator) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class b extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f130647f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f130648g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Function1 function1, List list) {
                super(1);
                this.f130647f = function1;
                this.f130648g = list;
            }

            public final Object a(int i10) {
                return this.f130647f.invoke(this.f130648g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class c extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f130649f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f130650g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C15429A f130651h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130652i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function1 f130653j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ float f130654k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, Function1 function1, C15429A c15429a, LocalThemeScope localThemeScope, Function1 function12, float f10) {
                super(4);
                this.f130649f = list;
                this.f130650g = function1;
                this.f130651h = c15429a;
                this.f130652i = localThemeScope;
                this.f130653j = function12;
                this.f130654k = f10;
            }

            public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.d(i10) ? 32 : 16;
                }
                if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                OrderStatusCardDecorator orderStatusCardDecorator = (OrderStatusCardDecorator) this.f130649f.get(i10);
                composer.startReplaceGroup(-1764442983);
                this.f130650g.invoke(Integer.valueOf(Br.h.b(this.f130651h, composer, 0)));
                x.G(this.f130652i, orderStatusCardDecorator, this.f130653j, interfaceC15433c.e(Modifier.INSTANCE, this.f130654k), composer, LocalThemeScope.f17314g, 0);
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15433c, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        public final void b(final C15429A listState, Composer composer, int i10) {
            int i11;
            Intrinsics.j(listState, "listState");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(listState) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1646425976, i11, -1, "com.meijer.mobile.ui.homescreen.orderstatus.OrderStatusCarousel.<anonymous> (OrderStatusSection.kt:97)");
            }
            InterfaceC14882C interfaceC14882CB = androidx.compose.foundation.layout.D.b(this.f130639a.getAdsSpacing().getFive().getDp(), this.f130639a.getAdsSpacing().getThree().getDp());
            C5800d.f fVarO = C5800d.f48779a.o(this.f130639a.getAdsSpacing().getThree().getDp());
            yu.e eVarB = C18374a.b(this.f130640b, null, null, null, null, composer, 0, 30);
            Modifier modifier = this.f130641c;
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(this.f130642d) | composer.V(this.f130643e) | ((i11 & 14) == 4) | composer.D(this.f130639a) | composer.V(this.f130644f) | composer.b(this.f130645g);
            final List<OrderStatusCardDecorator> list = this.f130642d;
            final Function1<Integer, Unit> function1 = this.f130643e;
            final LocalThemeScope localThemeScope = this.f130639a;
            final Function1<AbstractC13870f, Unit> function12 = this.f130644f;
            final float f10 = this.f130645g;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Function1 function13 = new Function1() { // from class: es.H
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return I.a.c(list, function1, listState, localThemeScope, function12, f10, (l0.w) obj);
                    }
                };
                composer.t(function13);
                objB = function13;
            }
            composer.P();
            C15432b.c(modifier, listState, interfaceC14882CB, false, fVarO, null, eVarB, false, null, (Function1) objB, composer, (i11 << 3) & 112, 424);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, C15429A c15429a, Modifier modifier, List<OrderStatusCardDecorator> list, Function1<? super Integer, Unit> function1, Function1<? super AbstractC13870f, Unit> function12, float f10) {
            this.f130639a = localThemeScope;
            this.f130640b = c15429a;
            this.f130641c = modifier;
            this.f130642d = list;
            this.f130643e = function1;
            this.f130644f = function12;
            this.f130645g = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(List list, Function1 function1, C15429A c15429a, LocalThemeScope localThemeScope, Function1 function12, float f10, l0.w LazyRow) {
            Intrinsics.j(LazyRow, "$this$LazyRow");
            LazyRow.i(list.size(), null, new b(C2062a.f130646f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new c(list, function1, c15429a, localThemeScope, function12, f10)));
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C15429A c15429a, Composer composer, Integer num) {
            b(c15429a, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    private static final void e(final LocalThemeScope localThemeScope, final int i10, final int i11, Composer composer, final int i12) {
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(868610622);
        if ((i12 & 6) == 0) {
            i13 = ((i12 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= composerStartRestartGroup.d(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= composerStartRestartGroup.d(i11) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(868610622, i13, -1, "com.meijer.mobile.ui.homescreen.orderstatus.OrderCount (OrderStatusSection.kt:66)");
            }
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), 0.0f, 0.0f, 12, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 382, null), C13698b.a(AbstractC6392a.INSTANCE.d(C6293f.f59658n, Integer.valueOf(i10), Integer.valueOf(i11)), composerStartRestartGroup, AbstractC6392a.f60445b), null, composerStartRestartGroup, (q1.Label.f142335j << 3) | (i13 & 14) | LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: es.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I.f(localThemeScope, i10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, int i10, int i11, int i12, Composer composer, int i13) {
        e(localThemeScope, i10, i11, composer, J0.a(i12 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void g(final Ki.LocalThemeScope r12, final java.util.List<es.OrderStatusCardDecorator> r13, final kotlin.jvm.functions.Function1<? super es.AbstractC13870f, kotlin.Unit> r14, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r15, androidx.compose.ui.Modifier r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.I.g(Ki.M, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, List list, Function1 function1, Function1 function12, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, list, function1, function12, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final java.util.List<es.OrderStatusCardDecorator> r20, final kotlin.jvm.functions.Function1<? super es.AbstractC13870f, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.I.i(Ki.M, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, modifier, list, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final int j(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    private static final void k(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(InterfaceC5868j0 interfaceC5868j0, int i10) {
        k(interfaceC5868j0, i10);
        return Unit.f143329a;
    }
}
