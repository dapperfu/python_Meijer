package A5;

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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import com.adobe.marketing.mobile.assurance.internal.EnumC6425g;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aF\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "error", "Lkotlin/Function1;", "Ly5/a;", "Lkotlin/ParameterName;", "name", "action", "", "onAction", "a", "(Landroidx/compose/ui/Modifier;Lcom/adobe/marketing/mobile/assurance/internal/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: A5.a$a, reason: collision with other inner class name */
    static final class C0005a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f96f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f97g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0005a(Function1<? super AbstractC18162a, Unit> function1, Activity activity) {
            super(0);
            this.f96f = function1;
            this.f97g = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f96f.invoke(AbstractC18162a.C2741a.f170193a);
            this.f97g.finish();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f98f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super AbstractC18162a, Unit> function1) {
            super(0);
            this.f98f = function1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f98f.invoke(AbstractC18162a.e.f170197a);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f99f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC6425g f100g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f101h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f102i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f103j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, EnumC6425g enumC6425g, Function1<? super AbstractC18162a, Unit> function1, int i10, int i11) {
            super(2);
            this.f99f = modifier;
            this.f100g = enumC6425g;
            this.f101h = function1;
            this.f102i = i10;
            this.f103j = i11;
        }

        public final void a(Composer composer, int i10) {
            a.a(this.f99f, this.f100g, this.f101h, composer, J0.a(this.f102i | 1), this.f103j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f104f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC6425g f105g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f106h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f107i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f108j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, EnumC6425g enumC6425g, Function1<? super AbstractC18162a, Unit> function1, int i10, int i11) {
            super(2);
            this.f104f = modifier;
            this.f105g = enumC6425g;
            this.f106h = function1;
            this.f107i = i10;
            this.f108j = i11;
        }

        public final void a(Composer composer, int i10) {
            a.a(this.f104f, this.f105g, this.f106h, composer, J0.a(this.f107i | 1), this.f108j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(Modifier modifier, EnumC6425g enumC6425g, Function1<? super AbstractC18162a, Unit> onAction, Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        EnumC6425g enumC6425g2;
        Function1<? super AbstractC18162a, Unit> function1;
        Modifier modifier3;
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-787762350);
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
            i12 |= composerStartRestartGroup.V(enumC6425g) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.D(onAction) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            enumC6425g2 = enumC6425g;
            function1 = onAction;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(-787762350, i12, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.error.ActionButtonRow (ActionButtonRow.kt:40)");
            }
            Activity activityA = C17226e.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
            if (activityA == null) {
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                T0 t0L = composerStartRestartGroup.l();
                if (t0L == null) {
                    return;
                }
                t0L.a(new d(modifier4, enumC6425g, onAction, i10, i11));
                return;
            }
            Modifier modifier5 = modifier4;
            enumC6425g2 = enumC6425g;
            function1 = onAction;
            C5658d.f fVarE = C5658d.f48555a.e();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarE, P0.e.INSTANCE.l(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifier5);
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
            Modifier modifierA = F1.a(companion2, "pinErrorCancelButton");
            C0005a c0005a = new C0005a(function1, activityA);
            A5.b bVar = A5.b.f109a;
            C17983x.d(c0005a, modifierA, false, null, null, null, null, null, null, bVar.a(), composerStartRestartGroup, 805306416, 508);
            composerStartRestartGroup.startReplaceableGroup(-1273821308);
            if (enumC6425g2 != null && enumC6425g2.isRetryable) {
                Modifier modifierA2 = F1.a(companion2, "pinErrorRetryButton");
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zV = composerStartRestartGroup.V(function1);
                Object objB = composerStartRestartGroup.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new b(function1);
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.U();
                C17983x.d((Function0) objB, modifierA2, false, null, null, null, null, null, null, bVar.b(), composerStartRestartGroup, 805306416, 508);
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
        T0 t0L2 = composerStartRestartGroup.l();
        if (t0L2 == null) {
            return;
        }
        t0L2.a(new c(modifier3, enumC6425g2, function1, i10, i11));
    }
}
