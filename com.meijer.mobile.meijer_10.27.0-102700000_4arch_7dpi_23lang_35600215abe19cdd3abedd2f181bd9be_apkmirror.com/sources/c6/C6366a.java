package c6;

import V0.C5346q0;
import V0.C5349s0;
import a6.f;
import android.graphics.Color;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.F1;
import h0.k;
import h0.l;
import kotlin.C6165d;
import kotlin.C6307U;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc0/U;", "", "visibility", "La6/f;", "inAppMessageSettings", "La6/b;", "gestureTracker", "", "a", "(Lc0/U;La6/f;La6/b;Landroidx/compose/runtime/Composer;I)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6366a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: c6.a$a, reason: collision with other inner class name */
    static final class C1207a extends Lambda implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f61518f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a6.f f61519g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a6.b f61520h;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: c6.a$a$a, reason: collision with other inner class name */
        static final class C1208a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a6.b f61521f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1208a(a6.b bVar) {
                super(0);
                this.f61521f = bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f61521f.c(f.d.TAP_BACKGROUND);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1207a(long j10, a6.f fVar, a6.b bVar) {
            super(3);
            this.f61518f = j10;
            this.f61519g = fVar;
            this.f61520h = bVar;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-1477579204, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageBackdrop.<anonymous> (MessageBackdrop.kt:46)");
            }
            Modifier modifierD = androidx.compose.foundation.b.d(J.f(Modifier.INSTANCE, 0.0f, 1, null), C5346q0.q(this.f61518f, this.f61519g.getBackdropOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer.startReplaceableGroup(-492369756);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = k.a();
                composer.t(objB);
            }
            composer.U();
            C5662h.a(F1.a(ClickableKt.c(modifierD, (l) objB, null, true, null, null, new C1208a(this.f61520h), 24, null), "messageBackdrop"), composer, 0);
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
    /* renamed from: c6.a$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6307U<Boolean> f61522f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a6.f f61523g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a6.b f61524h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f61525i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6307U<Boolean> c6307u, a6.f fVar, a6.b bVar, int i10) {
            super(2);
            this.f61522f = c6307u;
            this.f61523g = fVar;
            this.f61524h = bVar;
            this.f61525i = i10;
        }

        public final void a(Composer composer, int i10) {
            C6366a.a(this.f61522f, this.f61523g, this.f61524h, composer, J0.a(this.f61525i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(C6307U<Boolean> visibility, a6.f inAppMessageSettings, a6.b gestureTracker, Composer composer, int i10) {
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
            objB = C5346q0.m(C5349s0.b(Color.parseColor(inAppMessageSettings.getBackdropColor())));
            composerStartRestartGroup.t(objB);
        }
        composerStartRestartGroup.U();
        C6165d.d(visibility, null, androidx.compose.animation.f.m(null, 0.0f, 3, null), androidx.compose.animation.f.o(null, 0.0f, 3, null), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1477579204, true, new C1207a(((C5346q0) objB).getValue(), inAppMessageSettings, gestureTracker)), composerStartRestartGroup, 200064 | C6307U.f60956d | (i10 & 14), 18);
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
