package nn;

import Hk.UIEvent;
import Jh.H;
import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.Locale;
import ki.C15207z;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import kotlin.C17972T0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nn.C15986r;
import oi.E0;
import p1.C16338g;
import sn.C17085a;
import z1.TransformedText;
import z1.W;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\u001al\u0010\u0011\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a6\u0010\u0013\u001a\u00020\r*\u00020\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001ah\u0010\u0015\u001a\u00020\r*\u00020\u00002\u000e\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0019\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aH\u0010\u001b\u001a\u00020\r*\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001aV\u0010\u001d\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\r*\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\u001f\u0010 \u001aY\u0010(\u001a\u00020\r*\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0003¢\u0006\u0004\b(\u0010)\"\u0016\u0010,\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006.²\u0006\u000e\u0010-\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lsn/a$c;", "viewState", "Lkotlin/Function1;", "Lsn/a$a;", "Lkotlin/ParameterName;", "name", "action", "", "onAction", "Lkotlin/Function0;", "exitScreen", "G", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lsn/a$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "r", "(LKi/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "E", "(LKi/M;Ljava/lang/String;Lsn/a$c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/focus/y;", "focusRequester", "M", "(LKi/M;Landroidx/compose/ui/focus/y;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "K", "(LKi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "z", "(LKi/M;Landroidx/compose/ui/focus/y;Lsn/a$c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "I", "(LKi/M;Lsn/a$c;Landroidx/compose/runtime/Composer;II)V", "", "title", "message", "positiveButtonText", "negativeButtonText", "onPositiveButtonListener", "onNegativeButtonListener", "u", "(LKi/M;IIILjava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "a", "Ljava/lang/String;", "phoneNumberInput", "textState", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: nn.r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15986r {

    /* renamed from: a, reason: collision with root package name */
    private static String f152589a = "";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.r$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152590a;

        a(LocalThemeScope localThemeScope) {
            this.f152590a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(816432209, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.AppBar.<anonymous> (EditPhoneNumberScreen.kt:94)");
            }
            Dr.g.g(this.f152590a, C16338g.c(Y.f100584O1, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.r$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152591a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152592b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f152593c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f152594d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: nn.r$b$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152595a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f152596b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f152597c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f152598d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: nn.r$b$a$a, reason: collision with other inner class name */
            static final class C2358a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f152599a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f152600b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f152601c;

                C2358a(LocalThemeScope localThemeScope, j1 j1Var, int i10) {
                    this.f152599a = localThemeScope;
                    this.f152600b = j1Var;
                    this.f152601c = i10;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1912631242, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.DisplayAlertDialog.<anonymous>.<anonymous>.<anonymous> (EditPhoneNumberScreen.kt:309)");
                    }
                    si.j.h(this.f152599a, this.f152600b.getLabels().getEnabledLabel(), C16338g.c(this.f152601c, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, InterfaceC5872l0<Boolean> interfaceC5872l0, int i10) {
                this.f152595a = localThemeScope;
                this.f152596b = function0;
                this.f152597c = interfaceC5872l0;
                this.f152598d = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5872l0 interfaceC5872l0, Function0 function0) {
                interfaceC5872l0.setValue(Boolean.FALSE);
                function0.invoke();
                return Unit.f143329a;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1962940215, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.DisplayAlertDialog.<anonymous>.<anonymous> (EditPhoneNumberScreen.kt:293)");
                }
                LocalThemeScope localThemeScope = this.f152595a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                float f10 = 16;
                float fP = H1.h.p(f10);
                float fP2 = H1.h.p(f10);
                InterfaceC14882C contentPadding = Assemble.getButtons().getEnabledButton().getContentPadding();
                float top = contentPadding != null ? contentPadding.getTop() : H1.h.p(0);
                InterfaceC14882C contentPadding2 = Assemble.getButtons().getEnabledButton().getContentPadding();
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, D.d(fP, top, fP2, contentPadding2 != null ? contentPadding2.getBottom() : H1.h.p(0)), null, false, null, 959, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f152596b);
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f152597c;
                final Function0<Unit> function0 = this.f152596b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: nn.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15986r.b.a.c(interfaceC5872l0, function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1912631242, true, new C2358a(this.f152595a, Assemble, this.f152598d), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(LocalThemeScope localThemeScope, Function0<Unit> function0, InterfaceC5872l0<Boolean> interfaceC5872l0, int i10) {
            this.f152591a = localThemeScope;
            this.f152592b = function0;
            this.f152593c = interfaceC5872l0;
            this.f152594d = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1611743131, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.DisplayAlertDialog.<anonymous> (EditPhoneNumberScreen.kt:292)");
            }
            LocalThemeScope localThemeScope = this.f152591a;
            Q.e(localThemeScope, C15207z.f142557a, ComposableLambdaKt.c(-1962940215, true, new a(localThemeScope, this.f152592b, this.f152593c, this.f152594d), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15207z.f142558b << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.r$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f152602a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152603b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152604c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f152605d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: nn.r$c$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152606a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f152607b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f152608c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Integer f152609d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: nn.r$c$a$a, reason: collision with other inner class name */
            static final class C2359a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f152610a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f152611b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Integer f152612c;

                C2359a(LocalThemeScope localThemeScope, j1 j1Var, Integer num) {
                    this.f152610a = localThemeScope;
                    this.f152611b = j1Var;
                    this.f152612c = num;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-777455038, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.DisplayAlertDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditPhoneNumberScreen.kt:335)");
                    }
                    si.j.h(this.f152610a, this.f152611b.getLabels().getEnabledLabel(), C16338g.c(this.f152612c.intValue(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, InterfaceC5872l0<Boolean> interfaceC5872l0, Integer num) {
                this.f152606a = localThemeScope;
                this.f152607b = function0;
                this.f152608c = interfaceC5872l0;
                this.f152609d = num;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5872l0 interfaceC5872l0, Function0 function0) {
                interfaceC5872l0.setValue(Boolean.FALSE);
                function0.invoke();
                return Unit.f143329a;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(700803093, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.DisplayAlertDialog.<anonymous>.<anonymous>.<anonymous> (EditPhoneNumberScreen.kt:319)");
                }
                LocalThemeScope localThemeScope = this.f152606a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                float f10 = 16;
                float fP = H1.h.p(f10);
                float fP2 = H1.h.p(f10);
                InterfaceC14882C contentPadding = enabledButton.getContentPadding();
                float top = contentPadding != null ? contentPadding.getTop() : H1.h.p(0);
                InterfaceC14882C contentPadding2 = enabledButton.getContentPadding();
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, D.d(fP, top, fP2, contentPadding2 != null ? contentPadding2.getBottom() : H1.h.p(0)), null, false, null, 959, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f152607b);
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f152608c;
                final Function0<Unit> function0 = this.f152607b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: nn.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15986r.c.a.c(interfaceC5872l0, function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-777455038, true, new C2359a(this.f152606a, Assemble, this.f152609d), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(Integer num, LocalThemeScope localThemeScope, Function0<Unit> function0, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f152602a = num;
            this.f152603b = localThemeScope;
            this.f152604c = function0;
            this.f152605d = interfaceC5872l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1962304743, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.DisplayAlertDialog.<anonymous> (EditPhoneNumberScreen.kt:317)");
            }
            Integer num = this.f152602a;
            if (num != null) {
                LocalThemeScope localThemeScope = this.f152603b;
                Q.e(localThemeScope, C15207z.f142557a, ComposableLambdaKt.c(700803093, true, new a(localThemeScope, this.f152604c, this.f152605d, num), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15207z.f142558b << 3));
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.r$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152613a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f152614b;

        d(LocalThemeScope localThemeScope, int i10) {
            this.f152613a = localThemeScope;
            this.f152614b = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1601845032, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.DisplayAlertDialog.<anonymous> (EditPhoneNumberScreen.kt:280)");
            }
            si.j.h(this.f152613a, new q1.Label(null, null, null, null, 0, false, 0, this.f152613a.getAdsTypography().getBody().getTwo(), null, 383, null), C16338g.c(this.f152614b, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.r$e */
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f152616b;

        e(LocalThemeScope localThemeScope, int i10) {
            this.f152615a = localThemeScope;
            this.f152616b = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1241385321, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.DisplayAlertDialog.<anonymous> (EditPhoneNumberScreen.kt:286)");
            }
            si.j.h(this.f152615a, new q1.Label(null, null, null, null, 0, false, 0, this.f152615a.getAdsTypography().getBody().getTwo(), null, 383, null), C16338g.c(this.f152616b, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.r$f */
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152617a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<C17085a.AbstractC2511a, Unit> f152618b;

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, Function1<? super C17085a.AbstractC2511a, Unit> function1) {
            this.f152617a = localThemeScope;
            this.f152618b = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1471520361, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.EditPhoneNumberScreen.<anonymous> (EditPhoneNumberScreen.kt:78)");
            }
            C15986r.r(this.f152617a, this.f152618b, composer, LocalThemeScope.f17314g);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.r$g */
    static final class g implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152619a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f152620b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17085a.ViewState f152621c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<C17085a.AbstractC2511a, Unit> f152622d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152623e;

        /* JADX WARN: Multi-variable type inference failed */
        g(LocalThemeScope localThemeScope, String str, C17085a.ViewState cVar, Function1<? super C17085a.AbstractC2511a, Unit> function1, Function0<Unit> function0) {
            this.f152619a = localThemeScope;
            this.f152620b = str;
            this.f152621c = cVar;
            this.f152622d = function1;
            this.f152623e = function0;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1356772816, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.EditPhoneNumberScreen.<anonymous> (EditPhoneNumberScreen.kt:80)");
            }
            C15986r.E(this.f152619a, this.f152620b, this.f152621c, D.h(Modifier.INSTANCE, paddingValues), this.f152622d, this.f152623e, composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: nn.r$h */
    static final class h implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152624a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<C17085a.AbstractC2511a, Unit> f152625b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f152626c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nn.r$h$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152627a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f152628b;

            a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f152627a = localThemeScope;
                this.f152628b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1383503961, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.MainActionContent.<anonymous>.<anonymous> (EditPhoneNumberScreen.kt:194)");
                }
                LocalThemeScope localThemeScope = this.f152627a;
                q1.Label enabledLabel = this.f152628b.getLabels().getEnabledLabel();
                String upperCase = C16338g.c(Y.f100558Md, composer, 0).toUpperCase(Locale.ROOT);
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

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, Function1<? super C17085a.AbstractC2511a, Unit> function1, String str) {
            this.f152624a = localThemeScope;
            this.f152625b = function1;
            this.f152626c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, String str) {
            String str2 = C15986r.f152589a;
            if (str == null) {
                str = "";
            }
            function1.invoke(new C17085a.AbstractC2511a.UpdatePhoneNumber(str2, str));
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-165100122, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.MainActionContent.<anonymous> (EditPhoneNumberScreen.kt:179)");
            }
            LocalThemeScope localThemeScope = this.f152624a;
            float f10 = 16;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, J.h(D.j(Modifier.INSTANCE, H1.h.p(f10), H1.h.p(f10)), 0.0f, 1, null), false, null, 895, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f152625b) | composer.V(this.f152626c);
            final Function1<C17085a.AbstractC2511a, Unit> function1 = this.f152625b;
            final String str = this.f152626c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: nn.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15986r.h.c(function1, str);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1383503961, true, new a(this.f152624a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.r$i */
    /* synthetic */ class i extends FunctionReferenceImpl implements Function1<AnnotatedString, TransformedText> {
        i(Object obj) {
            super(1, obj, H.class, "formatter", "formatter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TransformedText invoke(AnnotatedString p02) {
            Intrinsics.j(p02, "p0");
            return ((H) this.receiver).a(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.r$j */
    static final class j implements W, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f152629a;

        j(Function1 function) {
            Intrinsics.j(function, "function");
            this.f152629a = function;
        }

        @Override // z1.W
        public final /* synthetic */ TransformedText a(AnnotatedString annotatedString) {
            return (TransformedText) this.f152629a.invoke(annotatedString);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f152629a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function1 function1) {
        function1.invoke(C17085a.AbstractC2511a.b.f161228a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1) {
        function1.invoke(C17085a.AbstractC2511a.C2512a.f161227a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1) {
        function1.invoke(C17085a.AbstractC2511a.b.f161228a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, y yVar, C17085a.ViewState cVar, Function0 function0, Function1 function1, int i10, Composer composer, int i11) {
        z(localThemeScope, yVar, cVar, function0, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(final Ki.LocalThemeScope r25, final java.lang.String r26, final sn.C17085a.ViewState r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function1<? super sn.C17085a.AbstractC2511a, kotlin.Unit> r29, final kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C15986r.E(Ki.M, java.lang.String, sn.a$c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, String str, C17085a.ViewState cVar, Modifier modifier, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, str, cVar, modifier, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(final Ki.LocalThemeScope r35, androidx.compose.ui.Modifier r36, java.lang.String r37, sn.C17085a.ViewState r38, final kotlin.jvm.functions.Function1<? super sn.C17085a.AbstractC2511a, kotlin.Unit> r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C15986r.G(Ki.M, androidx.compose.ui.Modifier, java.lang.String, sn.a$c, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, Modifier modifier, String str, C17085a.ViewState cVar, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        G(localThemeScope, modifier, str, cVar, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, C17085a.ViewState cVar, int i10, int i11, Composer composer, int i12) {
        I(localThemeScope, cVar, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(LocalThemeScope localThemeScope, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        K(localThemeScope, str, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void M(final Ki.LocalThemeScope r61, final androidx.compose.ui.focus.y r62, androidx.compose.ui.Modifier r63, java.lang.String r64, androidx.compose.runtime.Composer r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C15986r.M(Ki.M, androidx.compose.ui.focus.y, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(String str, InterfaceC5834y KeyboardActions) {
        Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
        String str2 = f152589a;
        if (str == null) {
            str = "";
        }
        new C17085a.AbstractC2511a.UpdatePhoneNumber(str2, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(InterfaceC5872l0 interfaceC5872l0, String input) {
        Intrinsics.j(input, "input");
        if (input.length() <= 10) {
            R(interfaceC5872l0, input);
            f152589a = input;
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(LocalThemeScope localThemeScope, y yVar, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        M(localThemeScope, yVar, modifier, str, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final LocalThemeScope localThemeScope, final Function1<? super C17085a.AbstractC2511a, Unit> function1, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1707851503);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1707851503, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.AppBar (EditPhoneNumberScreen.kt:91)");
            }
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Cj.o.f5080p, new Object[0]);
            boolean z10 = false;
            C.f.d dVar = C.f.d.f17051e;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(816432209, true, new a(localThemeScope), composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i11 & 112) == 32) {
                z10 = true;
            }
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: nn.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15986r.s(function1);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composerStartRestartGroup, LocalThemeScope.f17314g | 24576 | (i11 & 14) | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15986r.t(localThemeScope, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1) {
        function1.invoke(C17085a.AbstractC2511a.C2512a.f161227a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, Function1 function1, int i10, Composer composer, int i11) {
        r(localThemeScope, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void u(final Ki.LocalThemeScope r24, final int r25, final int r26, final int r27, java.lang.Integer r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C15986r.u(Ki.M, int, int, int, java.lang.Integer, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, int i10, int i11, int i12, Integer num, Function0 function0, Function0 function02, int i13, int i14, Composer composer, int i15) {
        u(localThemeScope, i10, i11, i12, num, function0, function02, composer, J0.a(i13 | 1), i14);
        return Unit.f143329a;
    }

    private static final void z(final LocalThemeScope localThemeScope, final y yVar, final C17085a.ViewState cVar, final Function0<Unit> function0, final Function1<? super C17085a.AbstractC2511a, Unit> function1, Composer composer, final int i10) {
        int i11;
        boolean z10;
        UIEvent<C17085a.b> uIEventC;
        Composer composerStartRestartGroup = composer.startRestartGroup(1918337492);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(yVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(cVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1918337492, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.DisplayViewEvent (EditPhoneNumberScreen.kt:209)");
            }
            D1 d12 = (D1) composerStartRestartGroup.o(C6034t0.q());
            C17085a.b bVarA = (cVar == null || (uIEventC = cVar.c()) == null) ? null : uIEventC.a();
            if (bVarA != null) {
                if (bVarA instanceof C17085a.b.c) {
                    composerStartRestartGroup.startReplaceGroup(-324318827);
                    I(localThemeScope, cVar, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | ((i11 >> 3) & 112), 0);
                    composerStartRestartGroup.P();
                } else if (bVarA instanceof C17085a.b.e) {
                    composerStartRestartGroup.startReplaceGroup(-324316694);
                    composerStartRestartGroup.P();
                    function0.invoke();
                } else if (bVarA instanceof C17085a.b.f) {
                    composerStartRestartGroup.startReplaceGroup(-1463831460);
                    composerStartRestartGroup.P();
                    y.h(yVar, 0, 1, null);
                    if (d12 != null) {
                        d12.a();
                    }
                } else if (bVarA instanceof C17085a.b.DiscardChangesDialogUIEvent) {
                    composerStartRestartGroup.startReplaceGroup(-1463671066);
                    C17085a.b.DiscardChangesDialogUIEvent c2513a = (C17085a.b.DiscardChangesDialogUIEvent) bVarA;
                    int iD = c2513a.getTitle();
                    int i12 = i11;
                    int iA = c2513a.getMessage();
                    int iC = c2513a.getPositiveButton();
                    Integer numValueOf = Integer.valueOf(c2513a.getNegativeButton());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z10 = (i12 & 57344) == 16384;
                    Object objB = composerStartRestartGroup.B();
                    if (z10 || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: nn.p
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C15986r.A(function1);
                            }
                        };
                        composerStartRestartGroup.t(objB);
                    }
                    composerStartRestartGroup.P();
                    u(localThemeScope, iD, iA, iC, numValueOf, (Function0) objB, function0, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | ((i12 << 9) & 3670016), 0);
                    composerStartRestartGroup.P();
                } else {
                    int i13 = i11;
                    if (bVarA instanceof C17085a.b.FailureDialogUIEvent) {
                        composerStartRestartGroup.startReplaceGroup(-1463223426);
                        C17085a.b.FailureDialogUIEvent c2514b = (C17085a.b.FailureDialogUIEvent) bVarA;
                        int iC2 = c2514b.getTitle();
                        int iA2 = c2514b.getMessage();
                        int iB = c2514b.getPositiveButton();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z10 = (i13 & 57344) == 16384;
                        Object objB2 = composerStartRestartGroup.B();
                        if (z10 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: nn.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C15986r.B(function1);
                                }
                            };
                            composerStartRestartGroup.t(objB2);
                        }
                        composerStartRestartGroup.P();
                        u(localThemeScope, iC2, iA2, iB, null, (Function0) objB2, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i13 & 14), 40);
                        composerStartRestartGroup.P();
                    } else {
                        if (!(bVarA instanceof C17085a.b.PhoneNumberNotTextableDialogUIEvent)) {
                            composerStartRestartGroup.startReplaceGroup(-324318963);
                            composerStartRestartGroup.P();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1462876288);
                        C17085a.b.PhoneNumberNotTextableDialogUIEvent dVar = (C17085a.b.PhoneNumberNotTextableDialogUIEvent) bVarA;
                        int iC3 = dVar.getTitle();
                        int iA3 = dVar.getMessage();
                        int iB2 = dVar.getPositiveButton();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z10 = (i13 & 57344) == 16384;
                        Object objB3 = composerStartRestartGroup.B();
                        if (z10 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: nn.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C15986r.C(function1);
                                }
                            };
                            composerStartRestartGroup.t(objB3);
                        }
                        composerStartRestartGroup.P();
                        u(localThemeScope, iC3, iA3, iB2, null, (Function0) objB3, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i13 & 14), 40);
                        composerStartRestartGroup.P();
                    }
                }
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15986r.D(localThemeScope, yVar, cVar, function0, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void I(final LocalThemeScope localThemeScope, final C17085a.ViewState cVar, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1476687591);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(cVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                cVar = null;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1476687591, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.LoadingState (EditPhoneNumberScreen.kt:255)");
            }
            if (cVar != null && cVar.getProgressIsVisible()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Modifier modifierF = J.f(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.b(), P0.e.INSTANCE.g(), composerStartRestartGroup, 54);
                int iA = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierF);
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
                Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14903g c14903g = C14903g.f139698a;
                C17972T0.a(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), 0.0f, 0L, 0, composerStartRestartGroup, 0, 29);
                composerStartRestartGroup.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15986r.J(localThemeScope, cVar, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void K(final LocalThemeScope localThemeScope, String str, final Function1<? super C17085a.AbstractC2511a, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(1142273930);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                str = null;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1142273930, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.editphonenumber.MainActionContent (EditPhoneNumberScreen.kt:177)");
            }
            Q.e(localThemeScope, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(-165100122, true, new h(localThemeScope, function1, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.d.f142548b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final String str2 = str;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15986r.L(localThemeScope, str2, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String Q(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void R(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }
}
