package a6;

import U0.f;
import V0.InterfaceC5459f1;
import Z5.d;
import Z5.e;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.C6304d;
import kotlin.C6433U;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"LY5/d;", "presentationStateManager", "LZ5/d;", "floatingButtonSettings", "LZ5/e;", "floatingButtonViewModel", "Lkotlin/Function0;", "", "onTapDetected", "Lkotlin/Function1;", "LU0/f;", "onPanDetected", "a", "(LY5/d;LZ5/d;LZ5/e;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5663b {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: a6.b$a */
    static final class a extends Lambda implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f45254f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f45255g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f45256h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f45257i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<f, Unit> f45258j;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: a6.b$a$a, reason: collision with other inner class name */
        static final class C0945a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f45259f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0945a(Function0<Unit> function0) {
                super(0);
                this.f45259f = function0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f45259f.invoke();
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: a6.b$a$b, reason: collision with other inner class name */
        static final class C0946b extends Lambda implements Function1<f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e f45260f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f45261g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<f, Unit> f45262h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0946b(e eVar, int i10, Function1<? super f, Unit> function1) {
                super(1);
                this.f45260f = eVar;
                this.f45261g = i10;
                this.f45262h = function1;
            }

            public final void a(long j10) {
                this.f45260f.e(j10, this.f45261g);
                this.f45262h.invoke(f.d(j10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f fVar) {
                a(fVar.getPackedValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d dVar, e eVar, Function0<Unit> function0, int i10, Function1<? super f, Unit> function1) {
            super(3);
            this.f45254f = dVar;
            this.f45255g = eVar;
            this.f45256h = function0;
            this.f45257i = i10;
            this.f45258j = function1;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-771451050, i10, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreen.<anonymous> (FloatingButtonScreen.kt:43)");
            }
            int i11 = ((Configuration) composer.o(AndroidCompositionLocals_androidKt.f())).orientation;
            d dVar = this.f45254f;
            z1<InterfaceC5459f1> z1VarA = this.f45255g.a();
            long landscapeOffSet = i11 == 2 ? this.f45255g.getLandscapeOffSet() : this.f45255g.getPortraitOffSet();
            Function0<Unit> function0 = this.f45256h;
            composer.startReplaceableGroup(1157296644);
            boolean zV = composer.V(function0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C0945a(function0);
                composer.t(objB);
            }
            composer.U();
            C5662a.a(dVar, z1VarA, landscapeOffSet, (Function0) objB, new C0946b(this.f45255g, i11, this.f45258j), composer, 8, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: a6.b$b, reason: collision with other inner class name */
    static final class C0947b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y5.d f45263f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f45264g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e f45265h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f45266i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<f, Unit> f45267j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f45268k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0947b(Y5.d dVar, d dVar2, e eVar, Function0<Unit> function0, Function1<? super f, Unit> function1, int i10) {
            super(2);
            this.f45263f = dVar;
            this.f45264g = dVar2;
            this.f45265h = eVar;
            this.f45266i = function0;
            this.f45267j = function1;
            this.f45268k = i10;
        }

        public final void a(Composer composer, int i10) {
            C5663b.a(this.f45263f, this.f45264g, this.f45265h, this.f45266i, this.f45267j, composer, J0.a(this.f45268k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(Y5.d presentationStateManager, d floatingButtonSettings, e floatingButtonViewModel, Function0<Unit> onTapDetected, Function1<? super f, Unit> onPanDetected, Composer composer, int i10) {
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
        C6304d.d(presentationStateManager.b(), null, androidx.compose.animation.f.m(null, 0.0f, 3, null), null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -771451050, true, new a(floatingButtonSettings, floatingButtonViewModel, onTapDetected, i11, onPanDetected)), composerStartRestartGroup, 196992 | C6433U.f60755d, 26);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new C0947b(presentationStateManager, floatingButtonSettings, floatingButtonViewModel, onTapDetected, onPanDetected, i10));
    }
}
