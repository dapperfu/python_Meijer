package fn;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsTimeDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.y;
import fn.C14038f;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.Locale;
import ki.j1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16338g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aA\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "decorator", "Lcom/meijer/mobile/meijer/activity/orderoptions/t;", "timeSlot", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "onAction", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/orderoptions/r;Lcom/meijer/mobile/meijer/activity/orderoptions/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fn.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14038f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: fn.f$a */
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f132105a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132106b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderOptionsTimeDecorator f132107c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f132108d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: fn.f$a$a, reason: collision with other inner class name */
        static final class C2094a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f132109a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<y.e, Unit> f132110b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: fn.f$a$a$a, reason: collision with other inner class name */
            static final class C2095a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f132111a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f132112b;

                C2095a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f132111a = localThemeScope;
                    this.f132112b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1680751346, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionInfo.<anonymous>.<anonymous>.<anonymous> (OrderOptionInfo.kt:119)");
                    }
                    LocalThemeScope localThemeScope = this.f132111a;
                    q1.Label enabledLabel = this.f132112b.getLabels().getEnabledLabel();
                    String upperCase = C16338g.c(Il.h.f14939e0, composer, 0).toUpperCase(Locale.ROOT);
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
            C2094a(LocalThemeScope localThemeScope, Function1<? super y.e, Unit> function1) {
                this.f132109a = localThemeScope;
                this.f132110b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(y.e.j.f110886a);
                return Unit.f143329a;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-480064891, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionInfo.<anonymous>.<anonymous> (OrderOptionInfo.kt:111)");
                }
                LocalThemeScope localThemeScope = this.f132109a;
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, J.h(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, 1, null), false, null, 895, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f132110b);
                final Function1<y.e, Unit> function1 = this.f132110b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: fn.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C14038f.a.C2094a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1680751346, true, new C2095a(this.f132109a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(OrderOptionsDecorator orderOptionsDecorator, LocalThemeScope localThemeScope, OrderOptionsTimeDecorator orderOptionsTimeDecorator, Function1<? super y.e, Unit> function1) {
            this.f132105a = orderOptionsDecorator;
            this.f132106b = localThemeScope;
            this.f132107c = orderOptionsTimeDecorator;
            this.f132108d = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(j0.InterfaceC14902f r39, androidx.compose.runtime.Composer r40, int r41) {
            /*
                Method dump skipped, instructions count: 491
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fn.C14038f.a.a(j0.f, androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator r18, final com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsTimeDecorator r19, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.orderoptions.y.e, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C14038f.c(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.orderoptions.r, com.meijer.mobile.meijer.activity.orderoptions.t, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsDecorator orderOptionsDecorator, OrderOptionsTimeDecorator orderOptionsTimeDecorator, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, orderOptionsDecorator, orderOptionsTimeDecorator, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
