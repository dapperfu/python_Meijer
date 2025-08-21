package in;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator;
import fj.CardType;
import hn.OrderDetailSummaryDecorator;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.Locale;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16338g;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u001ag\u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aq\u0010\u0018\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001c\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010!\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u0005H\u0003¢\u0006\u0004\b!\u0010\"\u001a3\u0010$\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhn/n;", "decorator", "", "shouldUpdateVisibilityForTipText", "Lkotlin/Function0;", "", "onShowEBTDetailsClicked", "onShowPreAuthToolTipClicked", "onShowExtendedRangeInfoClicked", "onShowCreditCardTransactionClicked", "p", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/n;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lbk/a;", "amount", "Lfj/d;", "cardType", "preAuthAmount", "label", "isDisplayCreditCardTransactionHistory", "onToolTipClicked", "onViewCreditCardTransactionClick", "g", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Lfj/d;Lbk/a;Lbk/a;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "cartOrderSummaryDecorator", "l", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/cart/n0;Landroidx/compose/runtime/Composer;II)V", "", "textString", "showBold", "j", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "onClickCancel", "n", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/n;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: in.B, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14784B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.B$a */
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138355a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138356b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: in.B$a$a, reason: collision with other inner class name */
        static final class C2189a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138357a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f138358b;

            C2189a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f138357a = localThemeScope;
                this.f138358b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1730778395, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderCancelButton.<anonymous>.<anonymous>.<anonymous> (OrderSummaryView.kt:448)");
                }
                LocalThemeScope localThemeScope = this.f138357a;
                q1.Label enabledLabel = this.f138358b.getLabels().getEnabledLabel();
                String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f101190t0, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f138355a = localThemeScope;
            this.f138356b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-672988888, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderCancelButton.<anonymous>.<anonymous> (OrderSummaryView.kt:440)");
            }
            E0.b(this.f138355a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), false, null, 895, null), this.f138356b, ComposableLambdaKt.c(1730778395, true, new C2189a(this.f138355a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.B$b */
    public static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f138359f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.A a10) {
            super(1);
            this.f138359f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f138359f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.B$c */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f138360f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f138361g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f138362h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderDetailSummaryDecorator f138363i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138364j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f138365k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f138366l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0 f138367m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f138368n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f138369o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.n nVar, int i10, Function0 function0, OrderDetailSummaryDecorator orderDetailSummaryDecorator, LocalThemeScope localThemeScope, boolean z10, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
            super(2);
            this.f138361g = nVar;
            this.f138362h = function0;
            this.f138363i = orderDetailSummaryDecorator;
            this.f138364j = localThemeScope;
            this.f138365k = z10;
            this.f138366l = function02;
            this.f138367m = function03;
            this.f138368n = function04;
            this.f138369o = function05;
            this.f138360f = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:135:0x0774  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0776  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x077f  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0782  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0827  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x086f  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0995  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x09bb  */
        /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(androidx.compose.runtime.Composer r48, int r49) {
            /*
                Method dump skipped, instructions count: 2497
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: in.C14784B.c.a(androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.B$d */
    static final class d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138370a;

        d(Function0<Unit> function0) {
            this.f138370a = function0;
        }

        public final void a() {
            this.f138370a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4 A[PHI: r16
      0x00b4: PHI (r16v13 int) = (r16v0 int), (r16v6 int), (r16v7 int) binds: [B:65:0x00b2, B:75:0x00cf, B:74:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r52, androidx.compose.ui.Modifier r53, final bk.AbstractC6392a r54, fj.CardType r55, bk.AbstractC6392a r56, bk.AbstractC6392a r57, boolean r58, final kotlin.jvm.functions.Function0<kotlin.Unit> r59, final kotlin.jvm.functions.Function0<kotlin.Unit> r60, androidx.compose.runtime.Composer r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14784B.g(Ki.M, androidx.compose.ui.Modifier, bk.a, fj.d, bk.a, bk.a, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.B$e */
    static final class e implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f138371a = new e();

        public final void a() {
        }

        e() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.B$f */
    static final class f implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f138372a = new f();

        public final void a() {
        }

        f() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, CardType cardType, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, boolean z10, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, abstractC6392a, cardType, abstractC6392a2, abstractC6392a3, z10, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void j(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final java.lang.String r23, boolean r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14784B.j(Ki.M, androidx.compose.ui.Modifier, java.lang.String, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, String str, boolean z10, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, str, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14784B.l(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.cart.n0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, CartOrderSummaryDecorator cartOrderSummaryDecorator, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, cartOrderSummaryDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void n(final LocalThemeScope localThemeScope, Modifier modifier, final OrderDetailSummaryDecorator decorator, final Function0<Unit> onClickCancel, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(onClickCancel, "onClickCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-492485187);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onClickCancel) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-492485187, i12, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderCancelButton (OrderSummaryView.kt:432)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(modifier, H1.h.p(16)), 0.0f, 1, null);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            composerStartRestartGroup.startReplaceGroup(-1042433269);
            if (decorator.getButtonVisibility()) {
                Ki.Q.e(localThemeScope, InterfaceC15205y.a.e.f142549a, ComposableLambdaKt.c(-672988888, true, new a(localThemeScope, onClickCancel), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.e.f142550b << 3));
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: in.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14784B.o(localThemeScope, modifier2, decorator, onClickCancel, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailSummaryDecorator orderDetailSummaryDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, modifier, orderDetailSummaryDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final hn.OrderDetailSummaryDecorator r23, boolean r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, final kotlin.jvm.functions.Function0<kotlin.Unit> r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14784B.p(Ki.M, androidx.compose.ui.Modifier, hn.n, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailSummaryDecorator orderDetailSummaryDecorator, boolean z10, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, orderDetailSummaryDecorator, z10, function0, function02, function03, function04, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
