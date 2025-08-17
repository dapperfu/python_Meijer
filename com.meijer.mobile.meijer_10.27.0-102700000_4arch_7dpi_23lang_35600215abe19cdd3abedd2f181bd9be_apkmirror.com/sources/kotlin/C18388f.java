package kotlin;

import H1.t;
import H1.w;
import V0.C5346q0;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.text.C5673e;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.text.y;
import j0.C14801J;
import kotlin.AbstractC18142l;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import u1.C17207A;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "input", "", "b", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "", "character", "a", "(CLandroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: z5.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18388f {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.f$a */
    static final class a extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f171580f = new a();

        a() {
            super(1);
        }

        public final void a(X0.f drawBehind) {
            Intrinsics.j(drawBehind, "$this$drawBehind");
            X0.f.O0(drawBehind, C5346q0.INSTANCE.k(), U0.g.a(0.0f, U0.k.g(drawBehind.b())), U0.g.a(U0.k.i(drawBehind.b()), U0.k.g(drawBehind.b())), 8.0f, 0, null, 0.0f, null, 0, 496, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.f$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ char f171581f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f171582g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(char c10, int i10) {
            super(2);
            this.f171581f = c10;
            this.f171582g = i10;
        }

        public final void a(Composer composer, int i10) {
            C18388f.a(this.f171581f, composer, J0.a(this.f171582g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.f$c */
    static final class c extends Lambda implements Function1<TextFieldValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f171583f = new c();

        c() {
            super(1);
        }

        public final void a(TextFieldValue it) {
            Intrinsics.j(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: z5.f$d */
    static final class d extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f171584f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(3);
            this.f171584f = str;
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 81) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-411901195, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.dialpad.InputFeedbackRow.<anonymous> (InputFeedbackRow.kt:49)");
            }
            C5658d.f fVarE = C5658d.f48555a.e();
            Modifier modifierA = F1.a(J.h(Modifier.INSTANCE, 0.0f, 1, null), "inputFeedbackRow");
            String str = this.f171584f;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
            composer.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composer.o(C5892t0.g());
            t tVar = (t) composer.o(C5892t0.m());
            Q1 q12 = (Q1) composer.o(C5892t0.t());
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierA);
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            composer.G();
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, dVar, companion.c());
            D1.c(composerA, tVar, companion.d());
            D1.c(composerA, q12, companion.h());
            composer.c();
            function3C.invoke(V0.a(V0.b(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            C14801J c14801j = C14801J.f139030a;
            composer.startReplaceableGroup(1231977122);
            for (int i11 = 0; i11 < 4; i11++) {
                Character chG1 = StringsKt.G1(str, i11);
                C18388f.a(chG1 != null ? chG1.charValue() : ' ', composer, 0);
            }
            composer.U();
            composer.U();
            composer.v();
            composer.U();
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.f$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f171585f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f171586g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, int i10) {
            super(2);
            this.f171585f = str;
            this.f171586g = i10;
        }

        public final void a(Composer composer, int i10) {
            C18388f.b(this.f171585f, composer, J0.a(this.f171586g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(char c10, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(80373713);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.f(c10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(80373713, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.dialpad.CharHolder (InputFeedbackRow.kt:69)");
            }
            composer2 = composerStartRestartGroup;
            String strValueOf = String.valueOf(c10);
            Modifier modifierZ = J.z(Modifier.INSTANCE, H1.h.p(48));
            E5.a aVar = E5.a.f7617a;
            Modifier modifierJ = D.j(modifierZ, aVar.b().b().getXSmall(), aVar.b().b().getSmall());
            C5346q0.Companion companion = C5346q0.INSTANCE;
            N1.b(strValueOf, androidx.compose.ui.draw.b.b(androidx.compose.foundation.b.d(modifierJ, companion.i(), null, 2, null), a.f171580f), companion.k(), w.i(36), null, null, AbstractC18142l.INSTANCE.d(), 0L, null, F1.j.h(F1.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, composer2, 3456, 0, 130480);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new b(c10, i10));
    }

    public static final void b(String input, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(input, "input");
        Composer composerStartRestartGroup = composer.startRestartGroup(854474175);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(input) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(854474175, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.dialpad.InputFeedbackRow (InputFeedbackRow.kt:44)");
            }
            composer2 = composerStartRestartGroup;
            C5673e.b(new TextFieldValue(input, C17207A.a(input.length()), (y) null, 4, (DefaultConstructorMarker) null), c.f171583f, null, false, false, null, null, null, false, 0, 0, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -411901195, true, new d(input)), composer2, 3120, 196608, 32756);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new e(input, i10));
    }
}
