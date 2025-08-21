package kotlin;

import H1.t;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import j0.C14889J;
import kotlin.C18049x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import v5.C17639e;
import z5.AbstractC18444a;
import z5.PinScreenState;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aJ\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/z1;", "Lz5/c;", "pinScreenState", "Lkotlin/Function1;", "Lz5/a;", "Lkotlin/ParameterName;", "name", "action", "", "onAction", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: A5.a$a, reason: collision with other inner class name */
    static final class C0002a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18444a, Unit> f79f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f80g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0002a(Function1<? super AbstractC18444a, Unit> function1, Activity activity) {
            super(0);
            this.f79f = function1;
            this.f80g = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f79f.invoke(AbstractC18444a.C2782a.f172379a);
            Activity activity = this.f80g;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18444a, Unit> f81f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f82g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super AbstractC18444a, Unit> function1, String str) {
            super(0);
            this.f81f = function1;
            this.f82g = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f81f.invoke(new AbstractC18444a.Connect(this.f82g));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f83f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<PinScreenState> f84g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18444a, Unit> f85h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f86i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f87j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, z1<PinScreenState> z1Var, Function1<? super AbstractC18444a, Unit> function1, int i10, int i11) {
            super(2);
            this.f83f = modifier;
            this.f84g = z1Var;
            this.f85h = function1;
            this.f86i = i10;
            this.f87j = i11;
        }

        public final void a(Composer composer, int i10) {
            a.a(this.f83f, this.f84g, this.f85h, composer, J0.a(this.f86i | 1), this.f87j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(Modifier modifier, z1<PinScreenState> pinScreenState, Function1<? super AbstractC18444a, Unit> onAction, Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        Modifier modifier3;
        Intrinsics.j(pinScreenState, "pinScreenState");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-19278497);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.V(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.V(pinScreenState) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.D(onAction) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(-19278497, i12, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.dialpad.ActionButtonRow (ActionButtonRow.kt:41)");
            }
            Activity activityA = C17639e.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
            Modifier modifierA = F1.a(modifier4, "dialPadActionButtonRow");
            C5800d.f fVarE = C5800d.f48779a.e();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarE, P0.e.INSTANCE.l(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(modifierA);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, dVar, companion.c());
            D1.c(composerA, tVar, companion.d());
            D1.c(composerA, q12, companion.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14889J c14889j = C14889J.f139620a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierA2 = F1.a(companion2, "dialPadCancelButton");
            C0002a c0002a = new C0002a(onAction, activityA);
            kotlin.b bVar = kotlin.b.f88a;
            Modifier modifier5 = modifier4;
            C18049x.d(c0002a, modifierA2, false, null, null, null, null, null, null, bVar.a(), composerStartRestartGroup, 805306416, 508);
            String pin = pinScreenState.getValue().getPin();
            composerStartRestartGroup.startReplaceableGroup(-151955059);
            if (pin.length() == 4) {
                Modifier modifierA3 = F1.a(companion2, "dialPadConnectButton");
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zV = composerStartRestartGroup.V(onAction) | composerStartRestartGroup.V(pin);
                Object objB = composerStartRestartGroup.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new b(onAction, pin);
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.U();
                C18049x.d((Function0) objB, modifierA3, false, null, null, null, null, null, null, bVar.b(), composerStartRestartGroup, 805306416, 508);
            }
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier5;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new c(modifier3, pinScreenState, onAction, i10, i11));
    }
}
