package An;

import An.C;
import Bm.C3013x;
import En.InputFieldDecorator;
import En.q;
import En.w;
import Ki.C;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.semantics.Role;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.Locale;
import ki.C15161c;
import ki.InterfaceC15148Q;
import ki.InterfaceC15166e0;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import ki.s1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16193s;
import oi.C16194s0;
import oi.E0;
import oi.P0;
import p1.C16338g;
import pi.C16453n;
import qi.C16671b;
import r1.C16819m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aO\u0010\r\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u000f\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0011\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\u000e\u0010\u0013\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LEn/w$g;", "viewState", "", "isNewAddressQualifierEnabled", "Lkotlin/Function1;", "LEn/w$c;", "", "onAction", "Lkotlin/Function0;", "onDeleteButtonClicked", "d", "(LKi/M;Landroidx/compose/ui/Modifier;LEn/w$g;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "f", "(LKi/M;Landroidx/compose/ui/Modifier;LEn/w$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "h", "(LKi/M;Landroidx/compose/ui/Modifier;LEn/w$g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isDefaultAddressChecked", "viewMode", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class C {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1369a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w.ViewState f1370b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1371c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f1372d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f1373e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f1374f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: An.C$a$a, reason: collision with other inner class name */
        static final class C0029a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f1375a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f1376b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: An.C$a$a$a, reason: collision with other inner class name */
            static final class C0030a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f1377a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f1378b;

                C0030a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f1377a = localThemeScope;
                    this.f1378b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1027119204, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:256)");
                    }
                    LocalThemeScope localThemeScope = this.f1377a;
                    q1.h.DrawableIcon enabledIcon = this.f1378b.getIcons().getEnabledIcon();
                    C.a.C3925k c3925k = C.a.C3925k.f16891e;
                    int i11 = LocalThemeScope.f17314g;
                    C16671b.b(localThemeScope, enabledIcon, c3925k, null, composer, (q1.h.DrawableIcon.f142322h << 3) | i11 | (C.a.C3925k.f16892f << 6), 4);
                    si.j.h(this.f1377a, this.f1378b.getLabels().getEnabledLabel(), C16338g.c(Y.f100850c, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

            C0029a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f1375a = localThemeScope;
                this.f1376b = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-791775575, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous> (AddressDetailScreen.kt:250)");
                }
                E0.b(this.f1375a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, 1, null), false, null, 895, null), this.f1376b, ComposableLambdaKt.c(-1027119204, true, new C0030a(this.f1375a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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
        @SourceDebugExtension
        static final class b implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w.ViewState f1379a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f1380b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1381c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: An.C$a$b$a, reason: collision with other inner class name */
            static final class C0031a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f1382a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f1383b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ w.ViewState f1384c;

                C0031a(LocalThemeScope localThemeScope, j1 j1Var, w.ViewState gVar) {
                    this.f1382a = localThemeScope;
                    this.f1383b = j1Var;
                    this.f1384c = gVar;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1379157970, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:276)");
                    }
                    LocalThemeScope localThemeScope = this.f1382a;
                    q1.Label enabledLabel = this.f1383b.getLabels().getEnabledLabel();
                    String upperCase = C13698b.a(this.f1384c.getPrimaryButtonText(), composer, AbstractC6392a.f60445b).toUpperCase(Locale.ROOT);
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
            b(w.ViewState gVar, LocalThemeScope localThemeScope, Function1<? super w.c, Unit> function1) {
                this.f1379a = gVar;
                this.f1380b = localThemeScope;
                this.f1381c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(w.c.e.f7983a);
                return Unit.f143329a;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1190186309, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous> (AddressDetailScreen.kt:269)");
                }
                q1.d.StandardButton standardButtonA = Cr.a.a(Assemble.getButtons(), this.f1379a.getIsSaveButtonEnabled());
                LocalThemeScope localThemeScope = this.f1380b;
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(standardButtonA, false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(standardButtonA.getModifier(), 0.0f, 1, null), false, null, 895, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f1381c);
                final Function1<w.c, Unit> function1 = this.f1381c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: An.D
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C.a.b.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1379157970, true, new C0031a(this.f1380b, Assemble, this.f1379a), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
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
        @SourceDebugExtension
        static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f1385a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w.ViewState f1386b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1387c;

            public final void c(InterfaceC14888I AdsRow, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f1385a;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierB = InterfaceC14888I.b(AdsRow, companion, 1.0f, false, 2, null);
                InputFieldDecorator inputFieldDecoratorG = this.f1386b.getCity();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f1387c);
                final Function1<w.c, Unit> function1 = this.f1387c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function2() { // from class: An.E
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C.a.c.d(function1, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i12 = LocalThemeScope.f17314g;
                L.b(localThemeScope, modifierB, inputFieldDecoratorG, 0, null, false, (Function2) objB, composer, i12 | (AbstractC6392a.f60445b << 6), 28);
                Modifier modifierB2 = InterfaceC14888I.b(AdsRow, companion, 1.0f, false, 2, null);
                String value = this.f1386b.getState().getValue();
                LocalThemeScope localThemeScope2 = this.f1385a;
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f1387c);
                final Function1<w.c, Unit> function12 = this.f1387c;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function2() { // from class: An.F
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C.a.c.e(function12, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                Bn.e.b(localThemeScope2, modifierB2, value, (Function2) objB2, false, composer, i12, 8);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            c(LocalThemeScope localThemeScope, w.ViewState gVar, Function1<? super w.c, Unit> function1) {
                this.f1385a = localThemeScope;
                this.f1386b = gVar;
                this.f1387c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Function1 function1, String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                function1.invoke(new w.c.ValidateSingleField(q.a.f7939g, z10, currentValue));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1, String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                function1.invoke(new w.c.ValidateSingleField(q.a.f7940h, z10, currentValue));
                return Unit.f143329a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                c(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f1388a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f1389b;

            d(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f1388a = localThemeScope;
                this.f1389b = interfaceC5872l0;
            }

            public final void a(InterfaceC15166e0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-175793933, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:240)");
                }
                wi.s.b(this.f1388a, Assemble.getToggleButtons().getTrailingToggleButton(), a.q(this.f1389b), false, false, null, composer, LocalThemeScope.f17314g | (q1.s.Switch.f142438e << 3), 28);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15166e0 interfaceC15166e0, Composer composer, Integer num) {
                a(interfaceC15166e0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, w.ViewState gVar, boolean z10, Function1<? super w.c, Unit> function1, InterfaceC5914o interfaceC5914o, Function0<Unit> function0) {
            this.f1369a = localThemeScope;
            this.f1370b = gVar;
            this.f1371c = z10;
            this.f1372d = function1;
            this.f1373e = interfaceC5914o;
            this.f1374f = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f7934b, z10, currentValue));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f7941i, z10, currentValue));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f7935c, z10, currentValue));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f7937e, z10, currentValue));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, String currentValue, boolean z10) {
            Intrinsics.j(currentValue, "currentValue");
            function1.invoke(new w.c.ValidateSingleField(q.a.f7938f, z10, currentValue));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            l(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void l(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1218189921, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.LegacyAddressInputScreen.<anonymous> (AddressDetailScreen.kt:125)");
            }
            LocalThemeScope localThemeScope = this.f1369a;
            InputFieldDecorator inputFieldDecoratorI = this.f1370b.getFirstName();
            boolean z10 = !this.f1371c;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f1372d);
            final Function1<w.c, Unit> function1 = this.f1372d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function2() { // from class: An.v
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.o(function1, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            int i11 = LocalThemeScope.f17314g;
            int i12 = AbstractC6392a.f60445b;
            L.b(localThemeScope, null, inputFieldDecoratorI, 0, null, z10, (Function2) objB, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope2 = this.f1369a;
            InputFieldDecorator inputFieldDecoratorJ = this.f1370b.getLastName();
            boolean z11 = !this.f1371c;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f1372d);
            final Function1<w.c, Unit> function12 = this.f1372d;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function2() { // from class: An.w
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.t(function12, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            L.b(localThemeScope2, null, inputFieldDecoratorJ, 0, null, z11, (Function2) objB2, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope3 = this.f1369a;
            InputFieldDecorator inputFieldDecoratorC = this.f1370b.getAddressLineOne();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f1372d);
            final Function1<w.c, Unit> function13 = this.f1372d;
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function2() { // from class: An.x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.u(function13, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            L.b(localThemeScope3, null, inputFieldDecoratorC, 0, null, false, (Function2) objB3, composer, i11 | (i12 << 6), 29);
            LocalThemeScope localThemeScope4 = this.f1369a;
            InputFieldDecorator inputFieldDecoratorD = this.f1370b.getAddressLineTwo();
            boolean z12 = !this.f1371c;
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(this.f1372d);
            final Function1<w.c, Unit> function14 = this.f1372d;
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function2() { // from class: An.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.v(function14, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            L.b(localThemeScope4, null, inputFieldDecoratorD, 0, null, z12, (Function2) objB4, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope5 = this.f1369a;
            C5800d c5800d = C5800d.f48779a;
            C16453n.i(localThemeScope5, new q1.Row(null, c5800d.o(this.f1369a.getAdsSpacing().getThree().getDp()), null, 5, null), ComposableLambdaKt.c(1765308895, true, new c(this.f1369a, this.f1370b, this.f1372d), composer, 54), composer, i11 | 384 | (q1.Row.f142392d << 3));
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierG = androidx.compose.foundation.layout.J.g(companion, 0.5f);
            InputFieldDecorator inputFieldDecoratorR = this.f1370b.getZipCode();
            int iB = androidx.compose.ui.text.input.a.INSTANCE.b();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f1373e);
            final InterfaceC5914o interfaceC5914o = this.f1373e;
            Object objB5 = composer.B();
            if (zD || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function1() { // from class: An.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.a.w(interfaceC5914o, (InterfaceC5834y) obj);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            C5835z c5835z = new C5835z((Function1) objB5, null, null, null, null, null, 62, null);
            LocalThemeScope localThemeScope6 = this.f1369a;
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(this.f1372d);
            final Function1<w.c, Unit> function15 = this.f1372d;
            Object objB6 = composer.B();
            if (zV5 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new Function2() { // from class: An.A
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.a.p(function15, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            C2869l.b(localThemeScope6, modifierG, 0, inputFieldDecoratorR, iB, c5835z, (Function2) objB6, composer, (i12 << 9) | i11 | 24624, 2);
            composer.startReplaceGroup(1845676688);
            if (this.f1370b.getDefaultAddressToggleVisibility()) {
                composer.startReplaceGroup(1849434622);
                Object objB7 = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB7 == companion2.a()) {
                    objB7 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB7);
                }
                final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB7;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zV6 = composer.V(this.f1372d);
                final Function1<w.c, Unit> function16 = this.f1372d;
                Object objB8 = composer.B();
                if (zV6 || objB8 == companion2.a()) {
                    objB8 = new Function0() { // from class: An.B
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C.a.s(function16, interfaceC5872l0);
                        }
                    };
                    composer.t(objB8);
                }
                composer.P();
                Modifier modifierD = ClickableKt.d(companion, false, null, null, (Function0) objB8, 7, null);
                LocalThemeScope localThemeScope7 = this.f1369a;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
                InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion3.a();
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
                D1.c(composerA, measurePolicyB, companion3.e());
                D1.c(composerA, interfaceC5884sR, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                si.j.h(localThemeScope7, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope7.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.c(Y.f101204te, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
                C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, 0);
                Ki.Q.e(localThemeScope7, s1.i.f142482a, ComposableLambdaKt.c(-175793933, true, new d(localThemeScope7, interfaceC5872l0), composer, 54), composer, i11 | 384 | (s1.i.f142483b << 3));
                composer.v();
            }
            composer.P();
            composer.startReplaceGroup(1845706106);
            if (this.f1370b.getViewMode() == w.e.f8001b) {
                LocalThemeScope localThemeScope8 = this.f1369a;
                Ki.Q.e(localThemeScope8, InterfaceC15205y.a.e.f142549a, ComposableLambdaKt.c(-791775575, true, new C0029a(localThemeScope8, this.f1374f), composer, 54), composer, i11 | 384 | (InterfaceC15205y.a.e.f142550b << 3));
            }
            composer.P();
            LocalThemeScope localThemeScope9 = this.f1369a;
            Ki.Q.e(localThemeScope9, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(-1190186309, true, new b(this.f1370b, localThemeScope9, this.f1372d), composer, 54), composer, i11 | 384 | (InterfaceC15205y.a.d.f142548b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        private static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
            r(interfaceC5872l0, !q(interfaceC5872l0));
            function1.invoke(new w.c.SetAsDefaultAddressAction(q(interfaceC5872l0)));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f1390f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.A a10) {
            super(1);
            this.f1390f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f1390f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1391f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f1392g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f1393h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1394i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ w.ViewState f1395j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f1396k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f1397l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f1398m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, w.ViewState gVar, boolean z10, Function1 function1, InterfaceC5914o interfaceC5914o) {
            super(2);
            this.f1392g = nVar;
            this.f1393h = function0;
            this.f1394i = localThemeScope;
            this.f1395j = gVar;
            this.f1396k = z10;
            this.f1397l = function1;
            this.f1398m = interfaceC5914o;
            this.f1391f = i10;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f1392g.getHelpersHashCode();
            this.f1392g.i();
            L1.n nVar = this.f1392g;
            composer.startReplaceGroup(1297804960);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            LocalThemeScope localThemeScope = this.f1394i;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(hVarC);
                composer.t(objB);
            }
            composer.P();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(d0.T.g(nVar.k(companion, hVarA, (Function1) objB), d0.T.c(0, composer, 0, 1), false, null, false, 14, null), this.f1394i.getAdsSpacing().getFive().getDp(), 0.0f, this.f1394i.getAdsSpacing().getFive().getDp(), 0.0f, 10, null);
            C5800d c5800d = C5800d.f48779a;
            q1.Column column = new q1.Column(modifierM, c5800d.o(this.f1394i.getAdsSpacing().getFive().getDp()), null, 4, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1241288353, true, new e(this.f1394i, this.f1395j, this.f1396k, this.f1397l, this.f1398m), composer, 54);
            int i12 = LocalThemeScope.f17314g;
            C16453n.e(localThemeScope, column, composableLambdaC, composer, i12 | 384 | (q1.Column.f142240d << 3));
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarA);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new f(hVarA);
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierD = androidx.compose.foundation.b.d(nVar.k(companion, hVarC, (Function1) objB2), this.f1394i.getAdsColors().getAdsColorInverse().getColor(), null, 2, null);
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            if (this.f1395j.getViewMode() == w.e.f8001b) {
                composer.startReplaceGroup(-607940358);
                C17983Z.a(null, this.f1394i.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 384, 9);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, this.f1394i.getAdsSpacing().getFive().getDp()), 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.i(), composer, 48);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyB, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                Modifier modifierB = InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null);
                C16193s c16193s = C16193s.f154249a;
                C.a.C3925k c3925k = C.a.C3925k.f16891e;
                String strC = C16338g.c(Y.f101203td, composer, 0);
                LocalThemeScope localThemeScope2 = this.f1394i;
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(this.f1397l);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new g(this.f1397l);
                    composer.t(objB3);
                }
                composer.P();
                i11 = helpersHashCode;
                P0.h(localThemeScope2, c16193s, (Function0) objB3, c3925k, strC, modifierB, null, false, false, false, 0L, composer, i12 | (C16193s.f154250b << 3) | (C.a.C3925k.f16892f << 9), 0, 992);
                C14890K.a(androidx.compose.foundation.layout.J.z(companion, this.f1394i.getAdsSpacing().getFour().getDp()), composer, 0);
                Modifier modifierB2 = InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null);
                C16194s0 c16194s0 = C16194s0.f154251a;
                String strC2 = C16338g.c(Y.f100638Qh, composer, 0);
                boolean zU = this.f1395j.getIsSaveButtonEnabled();
                LocalThemeScope localThemeScope3 = this.f1394i;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f1398m) | composer.V(this.f1397l);
                Object objB4 = composer.B();
                if (zD || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new h(this.f1398m, this.f1397l);
                    composer.t(objB4);
                }
                composer.P();
                P0.k(localThemeScope3, c16194s0, strC2, (Function0) objB4, modifierB2, null, false, 0L, zU, composer, i12 | (C16194s0.f154252b << 3), 112);
                composer.v();
                composer.P();
            } else {
                i11 = helpersHashCode;
                composer.startReplaceGroup(-606356692);
                LocalThemeScope localThemeScope4 = this.f1394i;
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, localThemeScope4.getAdsSpacing().getFive().getDp()), 0.0f, 1, null);
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(this.f1398m) | composer.V(this.f1397l);
                Object objB5 = composer.B();
                if (zD2 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new i(this.f1398m, this.f1397l);
                    composer.t(objB5);
                }
                composer.P();
                C3013x.b(localThemeScope4, modifierH2, (Function0) objB5, C13698b.a(this.f1395j.getPrimaryButtonText(), composer, AbstractC6392a.f60445b), this.f1395j.getIsSaveButtonEnabled(), C16338g.c(Il.h.f14921R, composer, 0), null, false, composer, i12, 96);
                composer.P();
            }
            composer.v();
            composer.P();
            if (this.f1392g.getHelpersHashCode() != i11) {
                this.f1393h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f1399a;

        d(L1.h hVar) {
            this.f1399a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f1399a.getTop(), 0.0f, 0.0f, 6, null);
            constrainAs.p(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1400a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w.ViewState f1401b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1402c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f1403d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f1404e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1405a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super w.c, Unit> function1) {
                this.f1405a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f1405a.invoke(new w.c.ValidateSingleField(q.a.f7933a, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f1406a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f1407b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f1408c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f1409a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15148Q f1410b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f1411c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f1412d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: An.C$e$b$a$a, reason: collision with other inner class name */
                static final class C0032a implements Function1<r1.u, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ String f1413a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f1414b;

                    C0032a(String str, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        this.f1413a = str;
                        this.f1414b = interfaceC5872l0;
                    }

                    public final void a(r1.u semantics) {
                        Intrinsics.j(semantics, "$this$semantics");
                        r1.s.s0(semantics, Role.INSTANCE.c());
                        r1.s.g0(semantics, this.f1413a);
                        r1.s.G0(semantics, t1.b.a(e.d(this.f1414b)));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                        a(uVar);
                        return Unit.f143329a;
                    }
                }

                a(LocalThemeScope localThemeScope, InterfaceC15148Q interfaceC15148Q, String str, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                    this.f1409a = localThemeScope;
                    this.f1410b = interfaceC15148Q;
                    this.f1411c = str;
                    this.f1412d = interfaceC5872l0;
                }

                public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1386466010, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.NewAddressInputScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:477)");
                    }
                    LocalThemeScope localThemeScope = this.f1409a;
                    q1.s.Checkbox leadingToggleButton = this.f1410b.getToggleButtons().getLeadingToggleButton();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(this.f1411c);
                    String str = this.f1411c;
                    InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f1412d;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C0032a(str, interfaceC5872l0);
                        composer.t(objB);
                    }
                    composer.P();
                    q1.s.Checkbox checkboxY = q1.s.Checkbox.y(leadingToggleButton, androidx.compose.foundation.layout.J.v(C16819m.c(companion, true, (Function1) objB), this.f1409a.getAdsSpacing().getSix().getDp()), false, null, new C15161c(this.f1409a.getAdsColors().getAdsColorEnabled01(), this.f1409a.getAdsColors().getAdsColorUIBorder01(), this.f1409a.getAdsColors().getAdsColorInverse(), this.f1409a.getAdsColors().getAdsColorDisabled()), 6, null);
                    boolean zD = e.d(this.f1412d);
                    int i11 = LocalThemeScope.f17314g;
                    wi.s.b(localThemeScope, checkboxY, zD, false, false, null, composer, i11 | (q1.s.Checkbox.f142428e << 3), 28);
                    C14890K.a(androidx.compose.foundation.layout.J.z(companion, this.f1409a.getAdsSpacing().getFive().getDp()), composer, 0);
                    si.j.h(this.f1409a, new q1.Label(null, null, null, null, 0, false, 0, this.f1409a.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.c(Y.f101224ue, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

            b(LocalThemeScope localThemeScope, String str, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f1406a = localThemeScope;
                this.f1407b = str;
                this.f1408c = interfaceC5872l0;
            }

            public final void a(InterfaceC15148Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1730136294, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.NewAddressInputScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailScreen.kt:467)");
                }
                C16453n.i(this.f1406a, new q1.Row(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.H(Modifier.INSTANCE, null, false, 3, null), null, false, 3, null), 0.0f, 0.0f, 0.0f, this.f1406a.getAdsSpacing().getFive().getDp(), 7, null), C5800d.f48779a.g(), P0.e.INSTANCE.i()), ComposableLambdaKt.c(1386466010, true, new a(this.f1406a, Assemble, this.f1407b, this.f1408c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Row.f142392d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                a(interfaceC15148Q, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1415a;

            /* JADX WARN: Multi-variable type inference failed */
            c(Function1<? super w.c, Unit> function1) {
                this.f1415a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f1415a.invoke(new w.c.ValidateSingleField(q.a.f7934b, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1416a;

            /* JADX WARN: Multi-variable type inference failed */
            d(Function1<? super w.c, Unit> function1) {
                this.f1416a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f1416a.invoke(new w.c.ValidateSingleField(q.a.f7935c, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: An.C$e$e, reason: collision with other inner class name */
        static final class C0033e implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1417a;

            /* JADX WARN: Multi-variable type inference failed */
            C0033e(Function1<? super w.c, Unit> function1) {
                this.f1417a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f1417a.invoke(new w.c.ValidateSingleField(q.a.f7936d, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class f implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1418a;

            /* JADX WARN: Multi-variable type inference failed */
            f(Function1<? super w.c, Unit> function1) {
                this.f1418a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f1418a.invoke(new w.c.ValidateSingleField(q.a.f7937e, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class g implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1419a;

            /* JADX WARN: Multi-variable type inference failed */
            g(Function1<? super w.c, Unit> function1) {
                this.f1419a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f1419a.invoke(new w.c.ValidateSingleField(q.a.f7938f, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class h implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1420a;

            /* JADX WARN: Multi-variable type inference failed */
            h(Function1<? super w.c, Unit> function1) {
                this.f1420a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f1420a.invoke(new w.c.ValidateSingleField(q.a.f7939g, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class i implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1421a;

            /* JADX WARN: Multi-variable type inference failed */
            i(Function1<? super w.c, Unit> function1) {
                this.f1421a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f1421a.invoke(new w.c.ValidateSingleField(q.a.f7940h, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class j implements Function1<InterfaceC5834y, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f1422a;

            j(InterfaceC5914o interfaceC5914o) {
                this.f1422a = interfaceC5914o;
            }

            public final void a(InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                InterfaceC5914o.l(this.f1422a, false, 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5834y interfaceC5834y) {
                a(interfaceC5834y);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class k implements Function2<String, Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1423a;

            /* JADX WARN: Multi-variable type inference failed */
            k(Function1<? super w.c, Unit> function1) {
                this.f1423a = function1;
            }

            public final void a(String currentValue, boolean z10) {
                Intrinsics.j(currentValue, "currentValue");
                this.f1423a.invoke(new w.c.ValidateSingleField(q.a.f7941i, z10, currentValue));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                a(str, bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class l implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<w.c, Unit> f1424a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f1425b;

            /* JADX WARN: Multi-variable type inference failed */
            l(Function1<? super w.c, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f1424a = function1;
                this.f1425b = interfaceC5872l0;
            }

            public final void a() {
                e.e(this.f1425b, !e.d(r0));
                this.f1424a.invoke(new w.c.SetAsDefaultAddressAction(e.d(this.f1425b)));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, w.ViewState gVar, boolean z10, Function1<? super w.c, Unit> function1, InterfaceC5914o interfaceC5914o) {
            this.f1400a = localThemeScope;
            this.f1401b = gVar;
            this.f1402c = z10;
            this.f1403d = function1;
            this.f1404e = interfaceC5914o;
        }

        public final void c(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1241288353, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.NewAddressInputScreen.<anonymous>.<anonymous> (AddressDetailScreen.kt:319)");
            }
            LocalThemeScope localThemeScope = this.f1400a;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 13, null);
            InputFieldDecorator inputFieldDecoratorE = this.f1401b.getAddressNickname();
            boolean z10 = !this.f1402c;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f1403d);
            Function1<w.c, Unit> function1 = this.f1403d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(function1);
                composer.t(objB);
            }
            composer.P();
            int i11 = LocalThemeScope.f17314g;
            int i12 = AbstractC6392a.f60445b;
            C2863f.b(localThemeScope, modifierM, inputFieldDecoratorE, 0, null, z10, (Function2) objB, composer, i11 | (i12 << 6), 12);
            LocalThemeScope localThemeScope2 = this.f1400a;
            InputFieldDecorator inputFieldDecoratorI = this.f1401b.getFirstName();
            boolean z11 = !this.f1402c;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f1403d);
            Function1<w.c, Unit> function12 = this.f1403d;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new c(function12);
                composer.t(objB2);
            }
            composer.P();
            C2863f.b(localThemeScope2, null, inputFieldDecoratorI, 0, null, z11, (Function2) objB2, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope3 = this.f1400a;
            InputFieldDecorator inputFieldDecoratorJ = this.f1401b.getLastName();
            boolean z12 = !this.f1402c;
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f1403d);
            Function1<w.c, Unit> function13 = this.f1403d;
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new d(function13);
                composer.t(objB3);
            }
            composer.P();
            C2863f.b(localThemeScope3, null, inputFieldDecoratorJ, 0, null, z12, (Function2) objB3, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope4 = this.f1400a;
            InputFieldDecorator inputFieldDecoratorL = this.f1401b.getPhoneNumber();
            boolean z13 = !this.f1402c;
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(this.f1403d);
            Function1<w.c, Unit> function14 = this.f1403d;
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new C0033e(function14);
                composer.t(objB4);
            }
            composer.P();
            r.b(localThemeScope4, null, inputFieldDecoratorL, 0, null, z13, (Function2) objB4, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope5 = this.f1400a;
            InputFieldDecorator inputFieldDecoratorC = this.f1401b.getAddressLineOne();
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(this.f1403d);
            Function1<w.c, Unit> function15 = this.f1403d;
            Object objB5 = composer.B();
            if (zV5 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new f(function15);
                composer.t(objB5);
            }
            composer.P();
            C2863f.b(localThemeScope5, null, inputFieldDecoratorC, 0, null, false, (Function2) objB5, composer, i11 | (i12 << 6), 29);
            LocalThemeScope localThemeScope6 = this.f1400a;
            InputFieldDecorator inputFieldDecoratorD = this.f1401b.getAddressLineTwo();
            boolean z14 = !this.f1402c;
            composer.startReplaceGroup(5004770);
            boolean zV6 = composer.V(this.f1403d);
            Function1<w.c, Unit> function16 = this.f1403d;
            Object objB6 = composer.B();
            if (zV6 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new g(function16);
                composer.t(objB6);
            }
            composer.P();
            C2863f.b(localThemeScope6, null, inputFieldDecoratorD, 0, null, z14, (Function2) objB6, composer, i11 | (i12 << 6), 13);
            LocalThemeScope localThemeScope7 = this.f1400a;
            InputFieldDecorator inputFieldDecoratorG = this.f1401b.getCity();
            composer.startReplaceGroup(5004770);
            boolean zV7 = composer.V(this.f1403d);
            Function1<w.c, Unit> function17 = this.f1403d;
            Object objB7 = composer.B();
            if (zV7 || objB7 == Composer.INSTANCE.a()) {
                objB7 = new h(function17);
                composer.t(objB7);
            }
            composer.P();
            C2863f.b(localThemeScope7, null, inputFieldDecoratorG, 0, null, false, (Function2) objB7, composer, i11 | (i12 << 6), 29);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            LocalThemeScope localThemeScope8 = this.f1400a;
            w.ViewState gVar = this.f1401b;
            Function1<w.c, Unit> function18 = this.f1403d;
            InterfaceC5914o interfaceC5914o = this.f1404e;
            C5800d c5800d = C5800d.f48779a;
            C5800d.e eVarG = c5800d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion2.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), 0.0f, 0.0f, localThemeScope8.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), 0.0f, 1, null);
            String value = gVar.getState().getValue();
            composer.startReplaceGroup(5004770);
            boolean zV8 = composer.V(function18);
            Object objB8 = composer.B();
            if (zV8 || objB8 == Composer.INSTANCE.a()) {
                objB8 = new i(function18);
                composer.t(objB8);
            }
            composer.P();
            Bn.e.b(localThemeScope8, modifierH2, value, (Function2) objB8, true, composer, i11 | 24576, 0);
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), localThemeScope8.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
            InputFieldDecorator inputFieldDecoratorR = gVar.getZipCode();
            int iB = androidx.compose.ui.text.input.a.INSTANCE.b();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(interfaceC5914o);
            Object objB9 = composer.B();
            if (zD || objB9 == Composer.INSTANCE.a()) {
                objB9 = new j(interfaceC5914o);
                composer.t(objB9);
            }
            composer.P();
            C5835z c5835z = new C5835z((Function1) objB9, null, null, null, null, null, 62, null);
            composer.startReplaceGroup(5004770);
            boolean zV9 = composer.V(function18);
            Object objB10 = composer.B();
            if (zV9 || objB10 == Composer.INSTANCE.a()) {
                objB10 = new k(function18);
                composer.t(objB10);
            }
            composer.P();
            C2869l.b(localThemeScope8, modifierM2, 0, inputFieldDecoratorR, iB, c5835z, (Function2) objB10, composer, i11 | 24576 | (i12 << 9), 2);
            composer.v();
            if (this.f1401b.getDefaultAddressToggleVisibility()) {
                composer.startReplaceGroup(1849434622);
                Object objB11 = composer.B();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objB11 == companion4.a()) {
                    objB11 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB11);
                }
                InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB11;
                composer.P();
                String strC = C16338g.c(Y.f101244ve, composer, 0);
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion, this.f1400a.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, this.f1400a.getAdsSpacing().getThree().getDp(), 6, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV10 = composer.V(this.f1403d);
                Function1<w.c, Unit> function19 = this.f1403d;
                Object objB12 = composer.B();
                if (zV10 || objB12 == companion4.a()) {
                    objB12 = new l(function19, interfaceC5872l0);
                    composer.t(objB12);
                }
                composer.P();
                Modifier modifierD = ClickableKt.d(modifierM3, false, null, null, (Function0) objB12, 7, null);
                LocalThemeScope localThemeScope9 = this.f1400a;
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierD);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyB2, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                Ki.Q.e(localThemeScope9, s1.b.f142451a, ComposableLambdaKt.c(-1730136294, true, new b(localThemeScope9, strC, interfaceC5872l0), composer, 54), composer, i11 | 384 | (s1.b.f142452b << 3));
                composer.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            c(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f1426a;

        f(L1.h hVar) {
            this.f1426a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f1426a.getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f1427a;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super w.c, Unit> function1) {
            this.f1427a = function1;
        }

        public final void a() {
            this.f1427a.invoke(new w.c.UpdateAddressMode(w.e.f8002c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f1428a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f1429b;

        /* JADX WARN: Multi-variable type inference failed */
        h(InterfaceC5914o interfaceC5914o, Function1<? super w.c, Unit> function1) {
            this.f1428a = interfaceC5914o;
            this.f1429b = function1;
        }

        public final void a() {
            InterfaceC5914o.l(this.f1428a, false, 1, null);
            this.f1429b.invoke(w.c.e.f7983a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f1430a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<w.c, Unit> f1431b;

        /* JADX WARN: Multi-variable type inference failed */
        i(InterfaceC5914o interfaceC5914o, Function1<? super w.c, Unit> function1) {
            this.f1430a = interfaceC5914o;
            this.f1431b = function1;
        }

        public final void a() {
            InterfaceC5914o.l(this.f1430a, false, 1, null);
            this.f1431b.invoke(w.c.e.f7983a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
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
                h(localThemeScope, modifier3, viewState, onAction, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | (i12 & 112) | (AbstractC6392a.f60445b << 6) | (i12 & 896) | ((i12 >> 3) & 7168), 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1592979431);
                int i14 = i12 >> 3;
                f(localThemeScope, modifier3, viewState, onAction, onDeleteButtonClicked, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | (i12 & 112) | (AbstractC6392a.f60445b << 6) | (i12 & 896) | (i14 & 7168) | (i14 & 57344), 0);
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
            t0L.a(new Function2() { // from class: An.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.e(localThemeScope, modifier2, viewState, z10, onAction, onDeleteButtonClicked, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, w.ViewState gVar, boolean z10, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, gVar, z10, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void f(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final En.w.ViewState r23, final kotlin.jvm.functions.Function1<? super En.w.c, kotlin.Unit> r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: An.C.f(Ki.M, androidx.compose.ui.Modifier, En.w$g, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, w.ViewState gVar, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, gVar, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void h(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final En.w.ViewState r19, final kotlin.jvm.functions.Function1<? super En.w.c, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: An.C.h(Ki.M, androidx.compose.ui.Modifier, En.w$g, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, w.ViewState gVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, gVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
