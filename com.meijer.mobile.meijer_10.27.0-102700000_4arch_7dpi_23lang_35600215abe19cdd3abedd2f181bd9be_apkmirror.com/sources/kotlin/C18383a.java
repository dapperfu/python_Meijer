package kotlin;

import H1.t;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5717f;
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
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import j0.C14801J;
import kotlin.C17983x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u5.C17226e;
import y5.AbstractC18162a;
import y5.PinScreenState;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aJ\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/z1;", "Ly5/c;", "pinScreenState", "Lkotlin/Function1;", "Ly5/a;", "Lkotlin/ParameterName;", "name", "action", "", "onAction", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18383a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.a$a, reason: collision with other inner class name */
    static final class C2762a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f171546f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f171547g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2762a(Function1<? super AbstractC18162a, Unit> function1, Activity activity) {
            super(0);
            this.f171546f = function1;
            this.f171547g = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f171546f.invoke(AbstractC18162a.C2741a.f170193a);
            Activity activity = this.f171547g;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.a$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f171548f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f171549g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super AbstractC18162a, Unit> function1, String str) {
            super(0);
            this.f171548f = function1;
            this.f171549g = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f171548f.invoke(new AbstractC18162a.Connect(this.f171549g));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.a$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f171550f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<PinScreenState> f171551g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f171552h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f171553i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f171554j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, z1<PinScreenState> z1Var, Function1<? super AbstractC18162a, Unit> function1, int i10, int i11) {
            super(2);
            this.f171550f = modifier;
            this.f171551g = z1Var;
            this.f171552h = function1;
            this.f171553i = i10;
            this.f171554j = i11;
        }

        public final void a(Composer composer, int i10) {
            C18383a.a(this.f171550f, this.f171551g, this.f171552h, composer, J0.a(this.f171553i | 1), this.f171554j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(Modifier modifier, z1<PinScreenState> pinScreenState, Function1<? super AbstractC18162a, Unit> onAction, Composer composer, int i10, int i11) {
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
            Activity activityA = C17226e.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
            Modifier modifierA = F1.a(modifier4, "dialPadActionButtonRow");
            C5658d.f fVarE = C5658d.f48555a.e();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarE, P0.e.INSTANCE.l(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierA);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
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
            C14801J c14801j = C14801J.f139030a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierA2 = F1.a(companion2, "dialPadCancelButton");
            C2762a c2762a = new C2762a(onAction, activityA);
            C18384b c18384b = C18384b.f171555a;
            Modifier modifier5 = modifier4;
            C17983x.d(c2762a, modifierA2, false, null, null, null, null, null, null, c18384b.a(), composerStartRestartGroup, 805306416, 508);
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
                C17983x.d((Function0) objB, modifierA3, false, null, null, null, null, null, null, c18384b.b(), composerStartRestartGroup, 805306416, 508);
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
