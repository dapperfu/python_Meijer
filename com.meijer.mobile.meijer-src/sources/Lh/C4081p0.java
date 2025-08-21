package Lh;

import Gh.a;
import Ki.LocalThemeScope;
import Vh.OrderStatusCardDecorator;
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
import androidx.compose.ui.text.TextStyle;
import fj.DeliveryMode;
import j0.C14890K;
import j0.C14903g;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aC\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\t*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00020\u0001*\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001c\u001a\u00020\u0001*\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001e\u001a\u00020\u0001*\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001aK\u0010!\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b!\u0010\"¨\u0006%²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "isLoading", "LVh/c;", "orderStatusCardDecorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "B", "(LKi/M;ZLVh/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Z", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "z", "(LKi/M;LVh/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isPickup", "Lhj/f;", "orderStatus", "hasUserConfirmedSubstitutions", "b0", "(LKi/M;ZLhj/f;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "k0", "(Lhj/f;)Ljava/lang/Integer;", "j0", "(Lhj/f;Z)Z", "i0", "(Lhj/f;)Z", "h0", "", "orderId", "E", "(LKi/M;Ljava/lang/String;Lhj/f;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lastAction", "state", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Lh.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4081p0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Lh.p0$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18810a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18811b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderStatusCardDecorator f18812c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f18813d;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, boolean z10, OrderStatusCardDecorator orderStatusCardDecorator, Function1<? super Gh.a, Unit> function1) {
            this.f18810a = localThemeScope;
            this.f18811b = z10;
            this.f18812c = orderStatusCardDecorator;
            this.f18813d = function1;
        }

        public final void a(Composer composer, int i10) {
            DeliveryMode deliveryMode;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1354614290, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.OrderStatusCard.<anonymous> (OrderStatusCard.kt:86)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f18810a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f18810a;
            boolean z10 = this.f18811b;
            OrderStatusCardDecorator orderStatusCardDecorator = this.f18812c;
            Function1<Gh.a, Unit> function1 = this.f18813d;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            int i11 = LocalThemeScope.f17314g;
            C4081p0.Z(localThemeScope, modifierH, composer, i11 | 48, 0);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (z10) {
                composer.startReplaceGroup(-1701496495);
                yr.N.b(localThemeScope, null, composer, i11, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(-1701413880);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                C4081p0.z(localThemeScope, orderStatusCardDecorator, androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), composer, i11 | 384, 0);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
                C4081p0.b0(localThemeScope, (orderStatusCardDecorator == null || (deliveryMode = orderStatusCardDecorator.getDeliveryMode()) == null || !deliveryMode.f()) ? false : true, orderStatusCardDecorator != null ? orderStatusCardDecorator.getOrderStatus() : null, orderStatusCardDecorator != null && orderStatusCardDecorator.getHasUserConfirmedSubstitutions(), null, composer, i11, 8);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getSix().getDp()), composer, 0);
                String code = orderStatusCardDecorator != null ? orderStatusCardDecorator.getCode() : null;
                Intrinsics.g(code);
                C4081p0.E(localThemeScope, code, orderStatusCardDecorator.getOrderStatus(), orderStatusCardDecorator.getHasUserConfirmedSubstitutions(), null, function1, composer, i11, 8);
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0d55  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0d69  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0d73  */
    /* JADX WARN: Removed duplicated region for block: B:430:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(final Ki.LocalThemeScope r48, final java.lang.String r49, final hj.f r50, final boolean r51, androidx.compose.ui.Modifier r52, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 3508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4081p0.E(Ki.M, java.lang.String, hj.f, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lh.p0$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[hj.f.values().length];
            try {
                iArr[hj.f.f135686c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hj.f.f135687d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hj.f.f135688e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hj.f.f135690g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hj.f.f135691h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[hj.f.f135689f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[hj.f.f135701r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[hj.f.f135692i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[hj.f.f135693j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[hj.f.f135694k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[hj.f.f135696m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[hj.f.f135695l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[hj.f.f135697n.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[hj.f.f135698o.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[hj.f.f135699p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[hj.f.f135700q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[hj.f.f135702s.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[hj.f.f135703t.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, OrderStatusCardDecorator orderStatusCardDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, orderStatusCardDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(final Ki.LocalThemeScope r22, final boolean r23, final Vh.OrderStatusCardDecorator r24, androidx.compose.ui.Modifier r25, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4081p0.B(Ki.M, boolean, Vh.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1, OrderStatusCardDecorator orderStatusCardDecorator) {
        String code = orderStatusCardDecorator != null ? orderStatusCardDecorator.getCode() : null;
        Intrinsics.g(code);
        function1.invoke(new a.NavigateToOrderDetails(code));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, boolean z10, OrderStatusCardDecorator orderStatusCardDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, z10, orderStatusCardDecorator, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(Function1 function1, String str) {
        function1.invoke(new a.NavigateToOrderDetails(str));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(Function1 function1, String str) {
        function1.invoke(new a.NavigateToOrderDetails(str));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(Function1 function1, String str) {
        function1.invoke(new a.NavigateToOrderDetails(str));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(Function1 function1, String str) {
        function1.invoke(new a.NavigateToOrderDetails(str));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Function1 function1, String str) {
        function1.invoke(new a.NavigateToOrderDetails(str));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(Function1 function1, String str) {
        function1.invoke(new a.NavigateToOrderDetails(str));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(LocalThemeScope localThemeScope, String str, hj.f fVar, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, str, fVar, z10, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z(Ki.LocalThemeScope r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4081p0.Z(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        Z(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b0(final Ki.LocalThemeScope r17, final boolean r18, final hj.f r19, final boolean r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4081p0.b0(Ki.M, boolean, hj.f, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(LocalThemeScope localThemeScope, boolean z10, hj.f fVar, boolean z11, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b0(localThemeScope, z10, fVar, z11, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final boolean h0(hj.f fVar) {
        int i10 = fVar == null ? -1 : b.$EnumSwitchMapping$0[fVar.ordinal()];
        return i10 == 13 || i10 == 14;
    }

    private static final boolean i0(hj.f fVar) {
        return fVar == hj.f.f135701r;
    }

    private static final boolean j0(hj.f fVar, boolean z10) {
        int i10 = fVar == null ? -1 : b.$EnumSwitchMapping$0[fVar.ordinal()];
        if (i10 == 6 || i10 == 8) {
            return true;
        }
        return (i10 == 10 || i10 == 12) && !z10;
    }

    private static final Integer k0(hj.f fVar) {
        switch (fVar == null ? -1 : b.$EnumSwitchMapping$0[fVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return 0;
            case 9:
                return 1;
            case 10:
            case 11:
            case 12:
                return 2;
            case 13:
            case 14:
                return 3;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(final Ki.LocalThemeScope r36, final Vh.OrderStatusCardDecorator r37, androidx.compose.ui.Modifier r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4081p0.z(Ki.M, Vh.c, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle F(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle H(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle J(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle K(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle M(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle N(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle O(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle Q(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle R(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle T(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle U(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle V(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle W(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }
}
