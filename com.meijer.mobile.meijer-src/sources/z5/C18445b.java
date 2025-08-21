package z5;

import V2.CreationExtras;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.InterfaceC6162j;
import androidx.view.c0;
import androidx.view.h0;
import com.adobe.marketing.mobile.assurance.internal.EnumC6550g;
import com.adobe.marketing.mobile.assurance.internal.EnumC6551h;
import e.C13736d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import v5.C17639e;
import w5.AbstractC17844c;
import z5.AbstractC18444a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "sessionId", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "environment", "", "a", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/assurance/internal/h;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: z5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18445b {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.b$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18447d f172384f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f172385g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C18447d c18447d, Activity activity) {
            super(0);
            this.f172384f = c18447d;
            this.f172385g = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f172384f.p(AbstractC18444a.C2782a.f172379a);
            this.f172385g.finish();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.b$b, reason: collision with other inner class name */
    static final class C2783b extends Lambda implements Function1<AbstractC18444a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18447d f172386f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2783b(C18447d c18447d) {
            super(1);
            this.f172386f = c18447d;
        }

        public final void a(AbstractC18444a it) {
            Intrinsics.j(it, "it");
            this.f172386f.p(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC18444a abstractC18444a) {
            a(abstractC18444a);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.b$c */
    static final class c extends Lambda implements Function1<AbstractC18444a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18447d f172387f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C18447d c18447d) {
            super(1);
            this.f172387f = c18447d;
        }

        public final void a(AbstractC18444a it) {
            Intrinsics.j(it, "it");
            this.f172387f.p(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC18444a abstractC18444a) {
            a(abstractC18444a);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.b$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f172388f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC6551h f172389g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f172390h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, EnumC6551h enumC6551h, int i10) {
            super(2);
            this.f172388f = str;
            this.f172389g = enumC6551h;
            this.f172390h = i10;
        }

        public final void a(Composer composer, int i10) {
            C18445b.a(this.f172388f, this.f172389g, composer, J0.a(this.f172390h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.b$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f172391f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC6551h f172392g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f172393h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, EnumC6551h enumC6551h, int i10) {
            super(2);
            this.f172391f = str;
            this.f172392g = enumC6551h;
            this.f172393h = i10;
        }

        public final void a(Composer composer, int i10) {
            C18445b.a(this.f172391f, this.f172392g, composer, J0.a(this.f172393h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(String sessionId, EnumC6551h environment, Composer composer, int i10) {
        int i11;
        Intrinsics.j(sessionId, "sessionId");
        Intrinsics.j(environment, "environment");
        Composer composerStartRestartGroup = composer.startRestartGroup(2013467546);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(sessionId) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.V(environment) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2013467546, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.PinScreen (PinScreen.kt:30)");
            }
            Activity activityA = C17639e.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
            if (activityA == null) {
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                T0 t0L = composerStartRestartGroup.l();
                if (t0L == null) {
                    return;
                }
                t0L.a(new e(sessionId, environment, i10));
                return;
            }
            C18448e c18448e = new C18448e(sessionId, environment);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            h0 h0VarC = W2.b.f40696a.c(composerStartRestartGroup, 6);
            if (h0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c0 c0VarB = W2.d.b(C18447d.class, h0VarC, null, c18448e, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.U();
            C18447d c18447d = (C18447d) c0VarB;
            C13736d.a(false, new a(c18447d, activityA), composerStartRestartGroup, 0, 1);
            PinScreenState value = c18447d.o().getValue();
            AbstractC17844c connectionState = value.getConnectionState();
            if (connectionState instanceof AbstractC17844c.Disconnected) {
                composerStartRestartGroup.startReplaceableGroup(1324538324);
                AbstractC17844c.Disconnected disconnected = (AbstractC17844c.Disconnected) value.getConnectionState();
                if (disconnected.getError() == null) {
                    composerStartRestartGroup.startReplaceableGroup(1324538430);
                    z1<PinScreenState> z1VarO = c18447d.o();
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zV = composerStartRestartGroup.V(c18447d);
                    Object objB = composerStartRestartGroup.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C2783b(c18447d);
                        composerStartRestartGroup.t(objB);
                    }
                    composerStartRestartGroup.U();
                    kotlin.e.a(z1VarO, (Function1) objB, composerStartRestartGroup, 0);
                    composerStartRestartGroup.U();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1324538610);
                    EnumC6550g error = disconnected.getError();
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zV2 = composerStartRestartGroup.V(c18447d);
                    Object objB2 = composerStartRestartGroup.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new c(c18447d);
                        composerStartRestartGroup.t(objB2);
                    }
                    composerStartRestartGroup.U();
                    B5.e.a(error, (Function1) objB2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.U();
                }
                composerStartRestartGroup.U();
            } else if (connectionState instanceof AbstractC17844c.b) {
                composerStartRestartGroup.startReplaceableGroup(1324538828);
                C5.a.a(composerStartRestartGroup, 0);
                composerStartRestartGroup.U();
            } else if (connectionState instanceof AbstractC17844c.a) {
                composerStartRestartGroup.startReplaceableGroup(1324538898);
                composerStartRestartGroup.U();
                activityA.finish();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1324538912);
                composerStartRestartGroup.U();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L2 = composerStartRestartGroup.l();
        if (t0L2 == null) {
            return;
        }
        t0L2.a(new d(sessionId, environment, i10));
    }
}
