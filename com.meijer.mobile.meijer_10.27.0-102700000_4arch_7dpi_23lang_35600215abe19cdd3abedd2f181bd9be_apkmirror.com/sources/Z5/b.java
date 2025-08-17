package Z5;

import U0.f;
import V0.InterfaceC5316f1;
import Y5.d;
import Y5.e;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.C6165d;
import kotlin.C6307U;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"LX5/d;", "presentationStateManager", "LY5/d;", "floatingButtonSettings", "LY5/e;", "floatingButtonViewModel", "Lkotlin/Function0;", "", "onTapDetected", "Lkotlin/Function1;", "LU0/f;", "onPanDetected", "a", "(LX5/d;LY5/d;LY5/e;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f42383f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f42384g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42385h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f42386i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<f, Unit> f42387j;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: Z5.b$a$a, reason: collision with other inner class name */
        static final class C0900a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f42388f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0900a(Function0<Unit> function0) {
                super(0);
                this.f42388f = function0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f42388f.invoke();
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: Z5.b$a$b, reason: collision with other inner class name */
        static final class C0901b extends Lambda implements Function1<f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e f42389f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f42390g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<f, Unit> f42391h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0901b(e eVar, int i10, Function1<? super f, Unit> function1) {
                super(1);
                this.f42389f = eVar;
                this.f42390g = i10;
                this.f42391h = function1;
            }

            public final void a(long j10) {
                this.f42389f.e(j10, this.f42390g);
                this.f42391h.invoke(f.d(j10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f fVar) {
                a(fVar.getPackedValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d dVar, e eVar, Function0<Unit> function0, int i10, Function1<? super f, Unit> function1) {
            super(3);
            this.f42383f = dVar;
            this.f42384g = eVar;
            this.f42385h = function0;
            this.f42386i = i10;
            this.f42387j = function1;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-771451050, i10, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreen.<anonymous> (FloatingButtonScreen.kt:43)");
            }
            int i11 = ((Configuration) composer.o(AndroidCompositionLocals_androidKt.f())).orientation;
            d dVar = this.f42383f;
            z1<InterfaceC5316f1> z1VarA = this.f42384g.a();
            long landscapeOffSet = i11 == 2 ? this.f42384g.getLandscapeOffSet() : this.f42384g.getPortraitOffSet();
            Function0<Unit> function0 = this.f42385h;
            composer.startReplaceableGroup(1157296644);
            boolean zV = composer.V(function0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C0900a(function0);
                composer.t(objB);
            }
            composer.U();
            Z5.a.a(dVar, z1VarA, landscapeOffSet, (Function0) objB, new C0901b(this.f42384g, i11, this.f42387j), composer, 8, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            a(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: Z5.b$b, reason: collision with other inner class name */
    static final class C0902b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X5.d f42392f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f42393g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e f42394h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42395i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<f, Unit> f42396j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f42397k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0902b(X5.d dVar, d dVar2, e eVar, Function0<Unit> function0, Function1<? super f, Unit> function1, int i10) {
            super(2);
            this.f42392f = dVar;
            this.f42393g = dVar2;
            this.f42394h = eVar;
            this.f42395i = function0;
            this.f42396j = function1;
            this.f42397k = i10;
        }

        public final void a(Composer composer, int i10) {
            b.a(this.f42392f, this.f42393g, this.f42394h, this.f42395i, this.f42396j, composer, J0.a(this.f42397k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(X5.d presentationStateManager, d floatingButtonSettings, e floatingButtonViewModel, Function0<Unit> onTapDetected, Function1<? super f, Unit> onPanDetected, Composer composer, int i10) {
        int i11;
        Intrinsics.j(presentationStateManager, "presentationStateManager");
        Intrinsics.j(floatingButtonSettings, "floatingButtonSettings");
        Intrinsics.j(floatingButtonViewModel, "floatingButtonViewModel");
        Intrinsics.j(onTapDetected, "onTapDetected");
        Intrinsics.j(onPanDetected, "onPanDetected");
        Composer composerStartRestartGroup = composer.startRestartGroup(687015214);
        if (ComposerKt.M()) {
            i11 = i10;
            ComposerKt.U(687015214, i11, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreen (FloatingButtonScreen.kt:33)");
        } else {
            i11 = i10;
        }
        C6165d.d(presentationStateManager.b(), null, androidx.compose.animation.f.m(null, 0.0f, 3, null), null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -771451050, true, new a(floatingButtonSettings, floatingButtonViewModel, onTapDetected, i11, onPanDetected)), composerStartRestartGroup, 196992 | C6307U.f60956d, 26);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new C0902b(presentationStateManager, floatingButtonSettings, floatingButtonViewModel, onTapDetected, onPanDetected, i10));
    }
}
