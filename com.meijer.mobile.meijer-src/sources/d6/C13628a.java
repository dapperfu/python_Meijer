package d6;

import V0.C5489q0;
import V0.C5492s0;
import android.graphics.Color;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.F1;
import b6.f;
import h0.k;
import h0.l;
import kotlin.C6304d;
import kotlin.C6433U;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc0/U;", "", "visibility", "Lb6/f;", "inAppMessageSettings", "Lb6/b;", "gestureTracker", "", "a", "(Lc0/U;Lb6/f;Lb6/b;Landroidx/compose/runtime/Composer;I)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13628a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: d6.a$a, reason: collision with other inner class name */
    static final class C2006a extends Lambda implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f128085f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b6.f f128086g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b6.b f128087h;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: d6.a$a$a, reason: collision with other inner class name */
        static final class C2007a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b6.b f128088f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2007a(b6.b bVar) {
                super(0);
                this.f128088f = bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f128088f.c(f.d.TAP_BACKGROUND);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2006a(long j10, b6.f fVar, b6.b bVar) {
            super(3);
            this.f128085f = j10;
            this.f128086g = fVar;
            this.f128087h = bVar;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-1477579204, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageBackdrop.<anonymous> (MessageBackdrop.kt:46)");
            }
            Modifier modifierD = androidx.compose.foundation.b.d(J.f(Modifier.INSTANCE, 0.0f, 1, null), C5489q0.q(this.f128085f, this.f128086g.getBackdropOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer.startReplaceableGroup(-492369756);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = k.a();
                composer.t(objB);
            }
            composer.U();
            C5804h.a(F1.a(ClickableKt.c(modifierD, (l) objB, null, true, null, null, new C2007a(this.f128087h), 24, null), "messageBackdrop"), composer, 0);
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
    /* renamed from: d6.a$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6433U<Boolean> f128089f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b6.f f128090g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b6.b f128091h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f128092i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6433U<Boolean> c6433u, b6.f fVar, b6.b bVar, int i10) {
            super(2);
            this.f128089f = c6433u;
            this.f128090g = fVar;
            this.f128091h = bVar;
            this.f128092i = i10;
        }

        public final void a(Composer composer, int i10) {
            C13628a.a(this.f128089f, this.f128090g, this.f128091h, composer, J0.a(this.f128092i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(C6433U<Boolean> visibility, b6.f inAppMessageSettings, b6.b gestureTracker, Composer composer, int i10) {
        Intrinsics.j(visibility, "visibility");
        Intrinsics.j(inAppMessageSettings, "inAppMessageSettings");
        Intrinsics.j(gestureTracker, "gestureTracker");
        Composer composerStartRestartGroup = composer.startRestartGroup(1950745108);
        if (ComposerKt.M()) {
            ComposerKt.U(1950745108, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageBackdrop (MessageBackdrop.kt:37)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB = composerStartRestartGroup.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = C5489q0.m(C5492s0.b(Color.parseColor(inAppMessageSettings.getBackdropColor())));
            composerStartRestartGroup.t(objB);
        }
        composerStartRestartGroup.U();
        C6304d.d(visibility, null, androidx.compose.animation.f.m(null, 0.0f, 3, null), androidx.compose.animation.f.o(null, 0.0f, 3, null), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1477579204, true, new C2006a(((C5489q0) objB).getValue(), inAppMessageSettings, gestureTracker)), composerStartRestartGroup, 200064 | C6433U.f60755d | (i10 & 14), 18);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new b(visibility, inAppMessageSettings, gestureTracker, i10));
    }
}
