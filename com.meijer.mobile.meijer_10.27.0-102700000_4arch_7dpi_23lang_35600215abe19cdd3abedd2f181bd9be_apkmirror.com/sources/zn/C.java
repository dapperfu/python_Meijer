package zn;

import Am.C2908x;
import Dn.InputFieldDecorator;
import Dn.q;
import Dn.w;
import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.semantics.Role;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.meijer.mobile.meijer.Y;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.Locale;
import ji.C14927c;
import ji.InterfaceC14914Q;
import ji.InterfaceC14932e0;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
import ji.s1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15859s;
import ni.C15860s0;
import ni.E0;
import ni.P0;
import oi.C16088n;
import p1.C16193g;
import pi.C16307b;
import r1.C16705m;
import zn.C;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aO\u0010\r\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u000f\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0011\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\u000e\u0010\u0013\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LDn/w$g;", "viewState", "", "isNewAddressQualifierEnabled", "Lkotlin/Function1;", "LDn/w$c;", "", "onAction", "Lkotlin/Function0;", "onDeleteButtonClicked", "d", "(LJi/M;Landroidx/compose/ui/Modifier;LDn/w$g;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "f", "(LJi/M;Landroidx/compose/ui/Modifier;LDn/w$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "h", "(LJi/M;Landroidx/compose/ui/Modifier;LDn/w$g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isDefaultAddressChecked", "viewMode", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class C {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172853a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w.ViewState f172854b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f172855c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f172856d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f172857e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f172858f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zn.C$a$a, reason: collision with other inner class name */
        static final class C2788a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172859a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f172860b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: zn.C$a$a$a, reason: collision with other inner class name */
            static final class C2789a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f172861a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f172862b;

                C2789a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f172861a = localThemeScope;
                    this.f172862b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1027119204, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:256)");
                    }
                    LocalThemeScope localThemeScope = this.f172861a;
                    q1.h.DrawableIcon enabledIcon = this.f172862b.getIcons().getEnabledIcon();
                    C.a.C3839k c3839k = C.a.C3839k.f15347e;
                    int i11 = LocalThemeScope.f15770g;
                    C16307b.b(localThemeScope, enabledIcon, c3839k, null, composer, (q1.h.DrawableIcon.f140067h << 3) | i11 | (C.a.C3839k.f15348f << 6), 4);
                    ri.j.h(this.f172861a, this.f172862b.getLabels().getEnabledLabel(), C16193g.c(Y.f99988c, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C2788a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f172859a = localThemeScope;
                this.f172860b = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-791775575, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous> (AddressDetailScreen.kt:250)");
                }
                E0.b(this.f172859a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, 1, null), false, null, 895, null), this.f172860b, ComposableLambdaKt.c(-1027119204, true, new C2789a(this.f172859a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w.ViewState f172863a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172864b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172865c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: zn.C$a$b$a, reason: collision with other inner class name */
            static final class C2790a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f172866a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f172867b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ w.ViewState f172868c;

                C2790a(LocalThemeScope localThemeScope, j1 j1Var, w.ViewState viewState) {
                    this.f172866a = localThemeScope;
                    this.f172867b = j1Var;
                    this.f172868c = viewState;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1379157970, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:276)");
                    }
                    LocalThemeScope localThemeScope = this.f172866a;
                    q1.Label enabledLabel = this.f172867b.getLabels().getEnabledLabel();
                    String upperCase = C6408b.a(this.f172868c.getPrimaryButtonText(), composer, AbstractC5607a.f45514b).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(w.ViewState viewState, LocalThemeScope localThemeScope, Function1<? super w.c, Unit> function1) {
                this.f172863a = viewState;
                this.f172864b = localThemeScope;
                this.f172865c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(w.c.e.f6957a);
                return Unit.f142422a;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1190186309, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous> (AddressDetailScreen.kt:269)");
                }
                q1.d.StandardButton standardButtonA = Cr.a.a(Assemble.getButtons(), this.f172863a.getIsSaveButtonEnabled());
                LocalThemeScope localThemeScope = this.f172864b;
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(standardButtonA, false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(standardButtonA.getModifier(), 0.0f, 1, null), false, null, 895, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f172865c);
                final Function1<w.c, Unit> function1 = this.f172865c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: zn.D
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C.a.b.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1379157970, true, new C2790a(this.f172864b, Assemble, this.f172863a), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172869a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w.ViewState f172870b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172871c;

            public final void c(InterfaceC14800I AdsRow, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1765308895, i11, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous> (AddressDetailScreen.kt:181)");
                }
                LocalThemeScope localThemeScope = this.f172869a;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierB = InterfaceC14800I.b(AdsRow, companion, 1.0f, false, 2, null);
                InputFieldDecorator city = this.f172870b.getCity();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f172871c);
                final Function1<w.c, Unit> function1 = this.f172871c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function2() { // from class: zn.E
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C.a.c.d(function1, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i12 = LocalThemeScope.f15770g;
                L.b(localThemeScope, modifierB, city, 0, null, false, (Function2) objB, composer, i12 | (AbstractC5607a.f45514b << 6), 28);
                Modifier modifierB2 = InterfaceC14800I.b(AdsRow, companion, 1.0f, false, 2, null);
                String value = this.f172870b.getState().getValue();
                LocalThemeScope localThemeScope2 = this.f172869a;
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f172871c);
                final Function1<w.c, Unit> function12 = this.f172871c;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function2() { // from class: zn.F
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C.a.c.e(function12, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                An.e.b(localThemeScope2, modifierB2, value, (Function2) objB2, false, composer, i12, 8);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            c(LocalThemeScope localThemeScope, w.ViewState viewState, Function1<? super w.c, Unit> function1) {
                this.f172869a = localThemeScope;
                this.f172870b = viewState;
                this.f172871c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Function1 function1, String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                function1.invoke(new w.c.ValidateSingleField(q.a.f6913g, z10, currentValue));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1, String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                function1.invoke(new w.c.ValidateSingleField(q.a.f6914h, z10, currentValue));
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                c(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function3<InterfaceC14932e0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172872a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f172873b;

            d(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f172872a = localThemeScope;
                this.f172873b = interfaceC5730l0;
            }

            public final void a(InterfaceC14932e0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-175793933, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:240)");
                }
                vi.s.b(this.f172872a, Assemble.getToggleButtons().getTrailingToggleButton(), a.q(this.f172873b), false, false, null, composer, LocalThemeScope.f15770g | (q1.s.Switch.f140183e << 3), 28);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14932e0 interfaceC14932e0, Composer composer, Integer num) {
                a(interfaceC14932e0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, w.ViewState viewState, boolean z10, Function1<? super w.c, Unit> function1, InterfaceC5772o interfaceC5772o, Function0<Unit> function0) {
            this.f172853a = localThemeScope;
            this.f172854b = viewState;
            this.f172855c = z10;
            this.f172856d = function1;
            this.f172857e = interfaceC5772o;
            this.f172858f = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f6908b, z10, currentValue));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f6915i, z10, currentValue));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f6909c, z10, currentValue));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f6911e, z10, currentValue));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f6912f, z10, currentValue));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            l(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }

        public final void l(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1218189921, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous> (AddressDetailScreen.kt:125)");
            }
            LocalThemeScope localThemeScope = this.f172853a;
            InputFieldDecorator firstName = this.f172854b.getFirstName();
            boolean z10 = !this.f172855c;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f172856d);
            final Function1<w.c, Unit> function1 = this.f172856d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function2() { // from class: zn.v
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.o(function1, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            int i11 = LocalThemeScope.f15770g;
            int i12 = AbstractC5607a.f45514b;
            L.b(localThemeScope, null, firstName, 0, null, z10, (Function2) objB, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope2 = this.f172853a;
            InputFieldDecorator lastName = this.f172854b.getLastName();
            boolean z11 = !this.f172855c;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f172856d);
            final Function1<w.c, Unit> function12 = this.f172856d;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function2() { // from class: zn.w
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.t(function12, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            L.b(localThemeScope2, null, lastName, 0, null, z11, (Function2) objB2, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope3 = this.f172853a;
            InputFieldDecorator addressLineOne = this.f172854b.getAddressLineOne();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f172856d);
            final Function1<w.c, Unit> function13 = this.f172856d;
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function2() { // from class: zn.x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.u(function13, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            L.b(localThemeScope3, null, addressLineOne, 0, null, false, (Function2) objB3, composer, i11 | (i12 << 6), 29);
            LocalThemeScope localThemeScope4 = this.f172853a;
            InputFieldDecorator addressLineTwo = this.f172854b.getAddressLineTwo();
            boolean z12 = !this.f172855c;
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(this.f172856d);
            final Function1<w.c, Unit> function14 = this.f172856d;
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function2() { // from class: zn.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.v(function14, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            L.b(localThemeScope4, null, addressLineTwo, 0, null, z12, (Function2) objB4, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope5 = this.f172853a;
            C5658d c5658d = C5658d.f48555a;
            C16088n.i(localThemeScope5, new q1.Row(null, c5658d.o(this.f172853a.getAdsSpacing().getThree().getDp()), null, 5, null), ComposableLambdaKt.c(1765308895, true, new c(this.f172853a, this.f172854b, this.f172856d), composer, 54), composer, i11 | 384 | (q1.Row.f140137d << 3));
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierG = androidx.compose.foundation.layout.J.g(companion, 0.5f);
            InputFieldDecorator zipCode = this.f172854b.getZipCode();
            int iB = androidx.compose.ui.text.input.a.INSTANCE.b();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f172857e);
            final InterfaceC5772o interfaceC5772o = this.f172857e;
            Object objB5 = composer.B();
            if (zD || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function1() { // from class: zn.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.a.w(interfaceC5772o, (InterfaceC5692y) obj);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            C5693z c5693z = new C5693z((Function1) objB5, null, null, null, null, null, 62, null);
            LocalThemeScope localThemeScope6 = this.f172853a;
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(this.f172856d);
            final Function1<w.c, Unit> function15 = this.f172856d;
            Object objB6 = composer.B();
            if (zV5 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new Function2() { // from class: zn.A
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.p(function15, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            C18554l.b(localThemeScope6, modifierG, 0, zipCode, iB, c5693z, (Function2) objB6, composer, (i12 << 9) | i11 | 24624, 2);
            composer.startReplaceGroup(1845676688);
            if (this.f172854b.getDefaultAddressToggleVisibility()) {
                composer.startReplaceGroup(1849434622);
                Object objB7 = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB7 == companion2.a()) {
                    objB7 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB7);
                }
                final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB7;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zV6 = composer.V(this.f172856d);
                final Function1<w.c, Unit> function16 = this.f172856d;
                Object objB8 = composer.B();
                if (zV6 || objB8 == companion2.a()) {
                    objB8 = new Function0() { // from class: zn.B
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C.a.s(function16, interfaceC5730l0);
                        }
                    };
                    composer.t(objB8);
                }
                composer.P();
                Modifier modifierD = ClickableKt.d(companion, false, null, null, (Function0) objB8, 7, null);
                LocalThemeScope localThemeScope7 = this.f172853a;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
                InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion3.e());
                D1.c(composerA, interfaceC5742sR, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion3.f());
                C14801J c14801j = C14801J.f139030a;
                ri.j.h(localThemeScope7, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope7.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(Y.f100282qe, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
                C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
                Ji.Q.e(localThemeScope7, s1.i.f140227a, ComposableLambdaKt.c(-175793933, true, new d(localThemeScope7, interfaceC5730l0), composer, 54), composer, i11 | 384 | (s1.i.f140228b << 3));
                composer.v();
            }
            composer.P();
            composer.startReplaceGroup(1845706106);
            if (this.f172854b.getViewMode() == w.e.f6975b) {
                LocalThemeScope localThemeScope8 = this.f172853a;
                Ji.Q.e(localThemeScope8, InterfaceC14971y.a.e.f140294a, ComposableLambdaKt.c(-791775575, true, new C2788a(localThemeScope8, this.f172858f), composer, 54), composer, i11 | 384 | (InterfaceC14971y.a.e.f140295b << 3));
            }
            composer.P();
            LocalThemeScope localThemeScope9 = this.f172853a;
            Ji.Q.e(localThemeScope9, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(-1190186309, true, new b(this.f172854b, localThemeScope9, this.f172856d), composer, 54), composer, i11 | 384 | (InterfaceC14971y.a.d.f140293b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean q(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        private static final void r(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
            r(interfaceC5730l0, !q(interfaceC5730l0));
            function1.invoke(new w.c.SetAsDefaultAddressAction(q(interfaceC5730l0)));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f172874f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.A a10) {
            super(1);
            this.f172874f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f172874f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f172875f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f172876g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f172877h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172878i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ w.ViewState f172879j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f172880k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f172881l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f172882m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, w.ViewState viewState, boolean z10, Function1 function1, InterfaceC5772o interfaceC5772o) {
            super(2);
            this.f172876g = nVar;
            this.f172877h = function0;
            this.f172878i = localThemeScope;
            this.f172879j = viewState;
            this.f172880k = z10;
            this.f172881l = function1;
            this.f172882m = interfaceC5772o;
            this.f172875f = i10;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f172876g.getHelpersHashCode();
            this.f172876g.i();
            L1.n nVar = this.f172876g;
            composer.startReplaceGroup(1297804960);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            LocalThemeScope localThemeScope = this.f172878i;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(hVarC);
                composer.t(objB);
            }
            composer.P();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(d0.T.g(nVar.k(companion, hVarA, (Function1) objB), d0.T.c(0, composer, 0, 1), false, null, false, 14, null), this.f172878i.getAdsSpacing().getFive().getDp(), 0.0f, this.f172878i.getAdsSpacing().getFive().getDp(), 0.0f, 10, null);
            C5658d c5658d = C5658d.f48555a;
            q1.Column column = new q1.Column(modifierM, c5658d.o(this.f172878i.getAdsSpacing().getFive().getDp()), null, 4, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1241288353, true, new e(this.f172878i, this.f172879j, this.f172880k, this.f172881l, this.f172882m), composer, 54);
            int i12 = LocalThemeScope.f15770g;
            C16088n.e(localThemeScope, column, composableLambdaC, composer, i12 | 384 | (q1.Column.f139985d << 3));
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarA);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new f(hVarA);
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierD = androidx.compose.foundation.b.d(nVar.k(companion, hVarC, (Function1) objB2), this.f172878i.getAdsColors().getAdsColorInverse().getColor(), null, 2, null);
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            if (this.f172879j.getViewMode() == w.e.f6975b) {
                composer.startReplaceGroup(-607940358);
                C17917Z.a(null, this.f172878i.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 384, 9);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, this.f172878i.getAdsSpacing().getFive().getDp()), 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.i(), composer, 48);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyB, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14801J c14801j = C14801J.f139030a;
                Modifier modifierB = InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null);
                C15859s c15859s = C15859s.f151790a;
                C.a.C3839k c3839k = C.a.C3839k.f15347e;
                String strC = C16193g.c(Y.f100281qd, composer, 0);
                LocalThemeScope localThemeScope2 = this.f172878i;
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(this.f172881l);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new g(this.f172881l);
                    composer.t(objB3);
                }
                composer.P();
                i11 = helpersHashCode;
                P0.h(localThemeScope2, c15859s, (Function0) objB3, c3839k, strC, modifierB, null, false, false, false, 0L, composer, i12 | (C15859s.f151791b << 3) | (C.a.C3839k.f15348f << 9), 0, 992);
                C14802K.a(androidx.compose.foundation.layout.J.z(companion, this.f172878i.getAdsSpacing().getFour().getDp()), composer, 0);
                Modifier modifierB2 = InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null);
                C15860s0 c15860s0 = C15860s0.f151792a;
                String strC2 = C16193g.c(Y.f99681Lh, composer, 0);
                boolean isSaveButtonEnabled = this.f172879j.getIsSaveButtonEnabled();
                LocalThemeScope localThemeScope3 = this.f172878i;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f172882m) | composer.V(this.f172881l);
                Object objB4 = composer.B();
                if (zD || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new h(this.f172882m, this.f172881l);
                    composer.t(objB4);
                }
                composer.P();
                P0.k(localThemeScope3, c15860s0, strC2, (Function0) objB4, modifierB2, null, false, 0L, isSaveButtonEnabled, composer, i12 | (C15860s0.f151793b << 3), 112);
                composer.v();
                composer.P();
            } else {
                i11 = helpersHashCode;
                composer.startReplaceGroup(-606356692);
                LocalThemeScope localThemeScope4 = this.f172878i;
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, localThemeScope4.getAdsSpacing().getFive().getDp()), 0.0f, 1, null);
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(this.f172882m) | composer.V(this.f172881l);
                Object objB5 = composer.B();
                if (zD2 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new i(this.f172882m, this.f172881l);
                    composer.t(objB5);
                }
                composer.P();
                C2908x.b(localThemeScope4, modifierH2, (Function0) objB5, C6408b.a(this.f172879j.getPrimaryButtonText(), composer, AbstractC5607a.f45514b), this.f172879j.getIsSaveButtonEnabled(), C16193g.c(Hl.h.f12770R, composer, 0), null, false, composer, i12, 96);
                composer.P();
            }
            composer.v();
            composer.P();
            if (this.f172876g.getHelpersHashCode() != i11) {
                this.f172877h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f172883a;

        d(L1.h hVar) {
            this.f172883a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f172883a.getTop(), 0.0f, 0.0f, 6, null);
            constrainAs.p(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w.ViewState f172885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f172886c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f172887d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f172888e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172889a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super w.c, Unit> function1) {
                this.f172889a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f172889a.invoke(new w.c.ValidateSingleField(q.a.f6907a, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172890a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f172891b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f172892c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f172893a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14914Q f172894b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f172895c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f172896d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: zn.C$e$b$a$a, reason: collision with other inner class name */
                static final class C2791a implements Function1<r1.u, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ String f172897a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f172898b;

                    C2791a(String str, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        this.f172897a = str;
                        this.f172898b = interfaceC5730l0;
                    }

                    public final void a(r1.u semantics) {
                        Intrinsics.j(semantics, "$this$semantics");
                        r1.s.s0(semantics, Role.INSTANCE.c());
                        r1.s.g0(semantics, this.f172897a);
                        r1.s.G0(semantics, t1.b.a(e.d(this.f172898b)));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                        a(uVar);
                        return Unit.f142422a;
                    }
                }

                a(LocalThemeScope localThemeScope, InterfaceC14914Q interfaceC14914Q, String str, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                    this.f172893a = localThemeScope;
                    this.f172894b = interfaceC14914Q;
                    this.f172895c = str;
                    this.f172896d = interfaceC5730l0;
                }

                public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1386466010, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.NewAddressInputScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:477)");
                    }
                    LocalThemeScope localThemeScope = this.f172893a;
                    q1.s.Checkbox leadingToggleButton = this.f172894b.getToggleButtons().getLeadingToggleButton();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(this.f172895c);
                    String str = this.f172895c;
                    InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f172896d;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C2791a(str, interfaceC5730l0);
                        composer.t(objB);
                    }
                    composer.P();
                    q1.s.Checkbox checkboxY = q1.s.Checkbox.y(leadingToggleButton, androidx.compose.foundation.layout.J.v(C16705m.c(companion, true, (Function1) objB), this.f172893a.getAdsSpacing().getSix().getDp()), false, null, new C14927c(this.f172893a.getAdsColors().getAdsColorEnabled01(), this.f172893a.getAdsColors().getAdsColorUIBorder01(), this.f172893a.getAdsColors().getAdsColorInverse(), this.f172893a.getAdsColors().getAdsColorDisabled()), 6, null);
                    boolean zD = e.d(this.f172896d);
                    int i11 = LocalThemeScope.f15770g;
                    vi.s.b(localThemeScope, checkboxY, zD, false, false, null, composer, i11 | (q1.s.Checkbox.f140173e << 3), 28);
                    C14802K.a(androidx.compose.foundation.layout.J.z(companion, this.f172893a.getAdsSpacing().getFive().getDp()), composer, 0);
                    ri.j.h(this.f172893a, new q1.Label(null, null, null, null, 0, false, 0, this.f172893a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(Y.f100302re, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            b(LocalThemeScope localThemeScope, String str, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f172890a = localThemeScope;
                this.f172891b = str;
                this.f172892c = interfaceC5730l0;
            }

            public final void a(InterfaceC14914Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1730136294, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.NewAddressInputScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:467)");
                }
                C16088n.i(this.f172890a, new q1.Row(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.H(Modifier.INSTANCE, null, false, 3, null), null, false, 3, null), 0.0f, 0.0f, 0.0f, this.f172890a.getAdsSpacing().getFive().getDp(), 7, null), C5658d.f48555a.g(), P0.e.INSTANCE.i()), ComposableLambdaKt.c(1386466010, true, new a(this.f172890a, Assemble, this.f172891b, this.f172892c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Row.f140137d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                a(interfaceC14914Q, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172899a;

            /* JADX WARN: Multi-variable type inference failed */
            c(Function1<? super w.c, Unit> function1) {
                this.f172899a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f172899a.invoke(new w.c.ValidateSingleField(q.a.f6908b, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172900a;

            /* JADX WARN: Multi-variable type inference failed */
            d(Function1<? super w.c, Unit> function1) {
                this.f172900a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f172900a.invoke(new w.c.ValidateSingleField(q.a.f6909c, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zn.C$e$e, reason: collision with other inner class name */
        static final class C2792e implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172901a;

            /* JADX WARN: Multi-variable type inference failed */
            C2792e(Function1<? super w.c, Unit> function1) {
                this.f172901a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f172901a.invoke(new w.c.ValidateSingleField(q.a.f6910d, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class f implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172902a;

            /* JADX WARN: Multi-variable type inference failed */
            f(Function1<? super w.c, Unit> function1) {
                this.f172902a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f172902a.invoke(new w.c.ValidateSingleField(q.a.f6911e, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class g implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172903a;

            /* JADX WARN: Multi-variable type inference failed */
            g(Function1<? super w.c, Unit> function1) {
                this.f172903a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f172903a.invoke(new w.c.ValidateSingleField(q.a.f6912f, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class h implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172904a;

            /* JADX WARN: Multi-variable type inference failed */
            h(Function1<? super w.c, Unit> function1) {
                this.f172904a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f172904a.invoke(new w.c.ValidateSingleField(q.a.f6913g, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class i implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172905a;

            /* JADX WARN: Multi-variable type inference failed */
            i(Function1<? super w.c, Unit> function1) {
                this.f172905a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f172905a.invoke(new w.c.ValidateSingleField(q.a.f6914h, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class j implements Function1<InterfaceC5692y, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f172906a;

            j(InterfaceC5772o interfaceC5772o) {
                this.f172906a = interfaceC5772o;
            }

            public final void a(InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                InterfaceC5772o.l(this.f172906a, false, 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5692y interfaceC5692y) {
                a(interfaceC5692y);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class k implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172907a;

            /* JADX WARN: Multi-variable type inference failed */
            k(Function1<? super w.c, Unit> function1) {
                this.f172907a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f172907a.invoke(new w.c.ValidateSingleField(q.a.f6915i, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class l implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f172908a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f172909b;

            /* JADX WARN: Multi-variable type inference failed */
            l(Function1<? super w.c, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f172908a = function1;
                this.f172909b = interfaceC5730l0;
            }

            public final void a() {
                e.e(this.f172909b, !e.d(r0));
                this.f172908a.invoke(new w.c.SetAsDefaultAddressAction(e.d(this.f172909b)));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, w.ViewState viewState, boolean z10, Function1<? super w.c, Unit> function1, InterfaceC5772o interfaceC5772o) {
            this.f172884a = localThemeScope;
            this.f172885b = viewState;
            this.f172886c = z10;
            this.f172887d = function1;
            this.f172888e = interfaceC5772o;
        }

        public final void c(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1241288353, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.NewAddressInputScreen.<anonymous>.<anonymous> (AddressDetailScreen.kt:319)");
            }
            LocalThemeScope localThemeScope = this.f172884a;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 13, null);
            InputFieldDecorator addressNickname = this.f172885b.getAddressNickname();
            boolean z10 = !this.f172886c;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f172887d);
            Function1<w.c, Unit> function1 = this.f172887d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(function1);
                composer.t(objB);
            }
            composer.P();
            int i11 = LocalThemeScope.f15770g;
            int i12 = AbstractC5607a.f45514b;
            C18548f.b(localThemeScope, modifierM, addressNickname, 0, null, z10, (Function2) objB, composer, i11 | (i12 << 6), 12);
            LocalThemeScope localThemeScope2 = this.f172884a;
            InputFieldDecorator firstName = this.f172885b.getFirstName();
            boolean z11 = !this.f172886c;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f172887d);
            Function1<w.c, Unit> function12 = this.f172887d;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new c(function12);
                composer.t(objB2);
            }
            composer.P();
            C18548f.b(localThemeScope2, null, firstName, 0, null, z11, (Function2) objB2, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope3 = this.f172884a;
            InputFieldDecorator lastName = this.f172885b.getLastName();
            boolean z12 = !this.f172886c;
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f172887d);
            Function1<w.c, Unit> function13 = this.f172887d;
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new d(function13);
                composer.t(objB3);
            }
            composer.P();
            C18548f.b(localThemeScope3, null, lastName, 0, null, z12, (Function2) objB3, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope4 = this.f172884a;
            InputFieldDecorator phoneNumber = this.f172885b.getPhoneNumber();
            boolean z13 = !this.f172886c;
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(this.f172887d);
            Function1<w.c, Unit> function14 = this.f172887d;
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new C2792e(function14);
                composer.t(objB4);
            }
            composer.P();
            r.b(localThemeScope4, null, phoneNumber, 0, null, z13, (Function2) objB4, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope5 = this.f172884a;
            InputFieldDecorator addressLineOne = this.f172885b.getAddressLineOne();
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(this.f172887d);
            Function1<w.c, Unit> function15 = this.f172887d;
            Object objB5 = composer.B();
            if (zV5 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new f(function15);
                composer.t(objB5);
            }
            composer.P();
            C18548f.b(localThemeScope5, null, addressLineOne, 0, null, false, (Function2) objB5, composer, i11 | (i12 << 6), 29);
            LocalThemeScope localThemeScope6 = this.f172884a;
            InputFieldDecorator addressLineTwo = this.f172885b.getAddressLineTwo();
            boolean z14 = !this.f172886c;
            composer.startReplaceGroup(5004770);
            boolean zV6 = composer.V(this.f172887d);
            Function1<w.c, Unit> function16 = this.f172887d;
            Object objB6 = composer.B();
            if (zV6 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new g(function16);
                composer.t(objB6);
            }
            composer.P();
            C18548f.b(localThemeScope6, null, addressLineTwo, 0, null, z14, (Function2) objB6, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope7 = this.f172884a;
            InputFieldDecorator city = this.f172885b.getCity();
            composer.startReplaceGroup(5004770);
            boolean zV7 = composer.V(this.f172887d);
            Function1<w.c, Unit> function17 = this.f172887d;
            Object objB7 = composer.B();
            if (zV7 || objB7 == Composer.INSTANCE.a()) {
                objB7 = new h(function17);
                composer.t(objB7);
            }
            composer.P();
            C18548f.b(localThemeScope7, null, city, 0, null, false, (Function2) objB7, composer, i11 | (i12 << 6), 29);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            LocalThemeScope localThemeScope8 = this.f172884a;
            w.ViewState viewState = this.f172885b;
            Function1<w.c, Unit> function18 = this.f172887d;
            InterfaceC5772o interfaceC5772o = this.f172888e;
            C5658d c5658d = C5658d.f48555a;
            C5658d.e eVarG = c5658d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion2.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), 0.0f, 0.0f, localThemeScope8.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), 0.0f, 1, null);
            String value = viewState.getState().getValue();
            composer.startReplaceGroup(5004770);
            boolean zV8 = composer.V(function18);
            Object objB8 = composer.B();
            if (zV8 || objB8 == Composer.INSTANCE.a()) {
                objB8 = new i(function18);
                composer.t(objB8);
            }
            composer.P();
            An.e.b(localThemeScope8, modifierH2, value, (Function2) objB8, true, composer, i11 | 24576, 0);
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), localThemeScope8.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
            InputFieldDecorator zipCode = viewState.getZipCode();
            int iB = androidx.compose.ui.text.input.a.INSTANCE.b();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(interfaceC5772o);
            Object objB9 = composer.B();
            if (zD || objB9 == Composer.INSTANCE.a()) {
                objB9 = new j(interfaceC5772o);
                composer.t(objB9);
            }
            composer.P();
            C5693z c5693z = new C5693z((Function1) objB9, null, null, null, null, null, 62, null);
            composer.startReplaceGroup(5004770);
            boolean zV9 = composer.V(function18);
            Object objB10 = composer.B();
            if (zV9 || objB10 == Composer.INSTANCE.a()) {
                objB10 = new k(function18);
                composer.t(objB10);
            }
            composer.P();
            C18554l.b(localThemeScope8, modifierM2, 0, zipCode, iB, c5693z, (Function2) objB10, composer, i11 | 24576 | (i12 << 9), 2);
            composer.v();
            if (this.f172885b.getDefaultAddressToggleVisibility()) {
                composer.startReplaceGroup(1849434622);
                Object objB11 = composer.B();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objB11 == companion4.a()) {
                    objB11 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB11);
                }
                InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB11;
                composer.P();
                String strC = C16193g.c(Y.f100322se, composer, 0);
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion, this.f172884a.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, this.f172884a.getAdsSpacing().getThree().getDp(), 6, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV10 = composer.V(this.f172887d);
                Function1<w.c, Unit> function19 = this.f172887d;
                Object objB12 = composer.B();
                if (zV10 || objB12 == companion4.a()) {
                    objB12 = new l(function19, interfaceC5730l0);
                    composer.t(objB12);
                }
                composer.P();
                Modifier modifierD = ClickableKt.d(modifierM3, false, null, null, (Function0) objB12, 7, null);
                LocalThemeScope localThemeScope9 = this.f172884a;
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierD);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyB2, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                Ji.Q.e(localThemeScope9, s1.b.f140196a, ComposableLambdaKt.c(-1730136294, true, new b(localThemeScope9, strC, interfaceC5730l0), composer, 54), composer, i11 | 384 | (s1.b.f140197b << 3));
                composer.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            c(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f172910a;

        f(L1.h hVar) {
            this.f172910a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f172910a.getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f172911a;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super w.c, Unit> function1) {
            this.f172911a = function1;
        }

        public final void a() {
            this.f172911a.invoke(new w.c.UpdateAddressMode(w.e.f6976c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f172912a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f172913b;

        /* JADX WARN: Multi-variable type inference failed */
        h(InterfaceC5772o interfaceC5772o, Function1<? super w.c, Unit> function1) {
            this.f172912a = interfaceC5772o;
            this.f172913b = function1;
        }

        public final void a() {
            InterfaceC5772o.l(this.f172912a, false, 1, null);
            this.f172913b.invoke(w.c.e.f6957a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f172914a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f172915b;

        /* JADX WARN: Multi-variable type inference failed */
        i(InterfaceC5772o interfaceC5772o, Function1<? super w.c, Unit> function1) {
            this.f172914a = interfaceC5772o;
            this.f172915b = function1;
        }

        public final void a() {
            InterfaceC5772o.l(this.f172914a, false, 1, null);
            this.f172915b.invoke(w.c.e.f6957a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, Modifier modifier, final w.ViewState viewState, final boolean z10, final Function1<? super w.c, Unit> onAction, final Function0<Unit> onDeleteButtonClicked, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onAction, "onAction");
        Intrinsics.j(onDeleteButtonClicked, "onDeleteButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1610864457);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
            i12 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(viewState) : composerStartRestartGroup.D(viewState) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onAction) ? 16384 : 8192;
        }
        if ((i11 & 16) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= composerStartRestartGroup.D(onDeleteButtonClicked) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1610864457, i12, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailScreen (AddressDetailScreen.kt:90)");
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(-1593135082);
                h(localThemeScope, modifier3, viewState, onAction, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (i12 & 112) | (AbstractC5607a.f45514b << 6) | (i12 & 896) | ((i12 >> 3) & 7168), 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1592979431);
                int i14 = i12 >> 3;
                f(localThemeScope, modifier3, viewState, onAction, onDeleteButtonClicked, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (i12 & 112) | (AbstractC5607a.f45514b << 6) | (i12 & 896) | (i14 & 7168) | (i14 & 57344), 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: zn.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.e(localThemeScope, modifier2, viewState, z10, onAction, onDeleteButtonClicked, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, w.ViewState viewState, boolean z10, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, viewState, z10, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final Dn.w.ViewState r23, final kotlin.jvm.functions.Function1<? super Dn.w.c, kotlin.Unit> r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.C.f(Ji.M, androidx.compose.ui.Modifier, Dn.w$g, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, w.ViewState viewState, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, viewState, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final Dn.w.ViewState r19, final kotlin.jvm.functions.Function1<? super Dn.w.c, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.C.h(Ji.M, androidx.compose.ui.Modifier, Dn.w$g, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, w.ViewState viewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
