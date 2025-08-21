package Lh;

import Gh.a;
import Ki.LocalThemeScope;
import Vh.OrderCardEmptyOrErrorStateDecorator;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import j0.C14890K;
import j0.C14903g;
import java.util.List;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ol.OrderHistoryItem;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aS\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\f*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\f*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u001b²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "isLoading", "", "Lol/b;", "orderHistory", "LVh/b;", "orderCardEmptyOrErrorStateDecorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "g", "(LKi/M;ZLjava/util/List;LVh/b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "n", "(LKi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "orderHistoryItem", "l", "(LKi/M;Lol/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "p", "(LKi/M;LVh/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "j", "", "lastAction", "state", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class O {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f18529a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderCardEmptyOrErrorStateDecorator f18531c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f18532d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<OrderHistoryItem> f18533e;

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-369237061, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.OrderHistoryCard.<anonymous> (OrderHistoryCard.kt:87)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(this.f18529a, this.f18530b.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f18530b;
            OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator = this.f18531c;
            boolean z10 = this.f18532d;
            List<OrderHistoryItem> list = this.f18533e;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            int i11 = LocalThemeScope.f17314g;
            int i12 = AbstractC6392a.f60445b;
            O.j(localThemeScope, orderCardEmptyOrErrorStateDecorator, null, composer, i11 | (i12 << 3), 2);
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (z10) {
                composer.startReplaceGroup(681271998);
                yr.N.b(localThemeScope, null, composer, i11, 1);
                composer.P();
            } else if (list != null) {
                composer.startReplaceGroup(681273758);
                O.n(localThemeScope, list, null, composer, i11, 2);
                composer.P();
            } else if (orderCardEmptyOrErrorStateDecorator != null) {
                composer.startReplaceGroup(681277336);
                O.p(localThemeScope, orderCardEmptyOrErrorStateDecorator, null, composer, i11 | (i12 << 3), 2);
                composer.P();
            } else {
                composer.startReplaceGroup(-355095439);
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(Modifier modifier, LocalThemeScope localThemeScope, OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator, boolean z10, List<OrderHistoryItem> list) {
            this.f18529a = modifier;
            this.f18530b = localThemeScope;
            this.f18531c = orderCardEmptyOrErrorStateDecorator;
            this.f18532d = z10;
            this.f18533e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r23, final boolean r24, final java.util.List<ol.OrderHistoryItem> r25, final Vh.OrderCardEmptyOrErrorStateDecorator r26, androidx.compose.ui.Modifier r27, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.O.g(Ki.M, boolean, java.util.List, Vh.b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator) {
        function1.invoke((orderCardEmptyOrErrorStateDecorator == null || orderCardEmptyOrErrorStateDecorator.getEmptyOrErrorStateImage() != Gh.e.f12649n) ? new a.Orders(false) : a.g.f12609a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, boolean z10, List list, OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, z10, list, orderCardEmptyOrErrorStateDecorator, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r30, final Vh.OrderCardEmptyOrErrorStateDecorator r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.O.j(Ki.M, Vh.b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, orderCardEmptyOrErrorStateDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void l(final Ki.LocalThemeScope r34, final ol.OrderHistoryItem r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.O.l(Ki.M, ol.b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, OrderHistoryItem orderHistoryItem, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, orderHistoryItem, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0246 A[LOOP:0: B:74:0x0240->B:76:0x0246, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ki.LocalThemeScope r23, final java.util.List<ol.OrderHistoryItem> r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.O.n(Ki.M, java.util.List, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, List list, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, list, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r29, final Vh.OrderCardEmptyOrErrorStateDecorator r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.O.p(Ki.M, Vh.b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, orderCardEmptyOrErrorStateDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
