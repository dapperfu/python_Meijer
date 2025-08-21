package kotlin;

import H1.t;
import V0.C5489q0;
import V0.M;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5801e;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import d0.C13590y;
import g6.C14334g;
import j0.C14889J;
import j0.InterfaceC14888I;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import z5.AbstractC18444a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Lz5/a;", "", "onClick", "a", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: A5.h, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class Function1 {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: A5.h$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f126f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: A5.h$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.functions.Function1<AbstractC18444a, Unit> f127f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.jvm.functions.Function1<? super AbstractC18444a, Unit> function1) {
            super(0);
            this.f127f = function1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f127f.invoke(new AbstractC18444a.Number("0"));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: A5.h$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f128f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap) {
            super(2);
            this.f128f = bitmap;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(992178540, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.dialpad.SymbolRow.<anonymous>.<anonymous> (SymbolRow.kt:82)");
            }
            Bitmap bitmap = this.f128f;
            Intrinsics.i(bitmap, "bitmap");
            C13590y.b(M.c(bitmap), "Delete", null, null, null, 0.0f, null, 0, composer, 56, 252);
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

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: A5.h$d */
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.functions.Function1<AbstractC18444a, Unit> f129f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(kotlin.jvm.functions.Function1<? super AbstractC18444a, Unit> function1) {
            super(0);
            this.f129f = function1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f129f.invoke(AbstractC18444a.c.f172381a);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: A5.h$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.functions.Function1<AbstractC18444a, Unit> f130f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f131g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(kotlin.jvm.functions.Function1<? super AbstractC18444a, Unit> function1, int i10) {
            super(2);
            this.f130f = function1;
            this.f131g = i10;
        }

        public final void a(Composer composer, int i10) throws IOException {
            Function1.a(this.f130f, composer, J0.a(this.f131g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws IOException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(kotlin.jvm.functions.Function1<? super AbstractC18444a, Unit> onClick, Composer composer, int i10) throws IOException {
        int i11;
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2129695161);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.D(onClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2129695161, i11, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.dialpad.SymbolRow (SymbolRow.kt:41)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = F1.a(J.h(companion, 0.0f, 1, null), "symbolRow");
            C5800d.f fVarO = C5800d.f48779a.o(F5.a.f9034a.b().c().getSmall());
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarO, P0.e.INSTANCE.l(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, dVar, companion2.c());
            D1.c(composerA, tVar, companion2.d());
            D1.c(composerA, q12, companion2.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14889J c14889j = C14889J.f139620a;
            C5489q0.Companion companion3 = C5489q0.INSTANCE;
            long jI = companion3.i();
            Modifier modifierB = InterfaceC14888I.b(c14889j, C5801e.b(companion, 1.0f, false, 2, null), 1.0f, false, 2, null);
            kotlin.c cVar = kotlin.c.f93a;
            kotlin.d.a(modifierB, cVar.a(), jI, a.f126f, composerStartRestartGroup, 3504, 0);
            long jK = companion3.k();
            Modifier modifierB2 = InterfaceC14888I.b(c14889j, C5801e.b(companion, 1.0f, false, 2, null), 1.0f, false, 2, null);
            Function2<Composer, Integer, Unit> function2B = cVar.b();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zV = composerStartRestartGroup.V(onClick);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new b(onClick);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            kotlin.d.a(modifierB2, function2B, jK, (Function0) objB, composerStartRestartGroup, 432, 0);
            Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB2 = composerStartRestartGroup.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB2 == companion4.a()) {
                objB2 = C14334g.a(context.getAssets().open("PinPadDeleteIcon.txt"));
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            String str = (String) objB2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion4.a()) {
                objB3 = Base64.decode(str, 0);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            byte[] bArr = (byte[]) objB3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion4.a()) {
                objB4 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.U();
            long jI2 = companion3.i();
            Modifier modifierB3 = InterfaceC14888I.b(c14889j, C5801e.b(companion, 1.0f, false, 2, null), 1.0f, false, 2, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 992178540, true, new c((Bitmap) objB4));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zV2 = composerStartRestartGroup.V(onClick);
            Object objB5 = composerStartRestartGroup.B();
            if (zV2 || objB5 == companion4.a()) {
                objB5 = new d(onClick);
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.U();
            kotlin.d.a(modifierB3, composableLambda, jI2, (Function0) objB5, composerStartRestartGroup, 432, 0);
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new e(onClick, i10));
    }
}
