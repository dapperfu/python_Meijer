package y5;

import V2.CreationExtras;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.InterfaceC6020j;
import androidx.view.c0;
import androidx.view.h0;
import com.adobe.marketing.mobile.assurance.internal.EnumC6425g;
import com.adobe.marketing.mobile.assurance.internal.EnumC6426h;
import e.C13588d;
import kotlin.C18387e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u5.C17226e;
import v5.AbstractC17511c;
import y5.AbstractC18162a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "sessionId", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "environment", "", "a", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/assurance/internal/h;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18163b {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: y5.b$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18165d f170198f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f170199g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C18165d c18165d, Activity activity) {
            super(0);
            this.f170198f = c18165d;
            this.f170199g = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f170198f.p(AbstractC18162a.C2741a.f170193a);
            this.f170199g.finish();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: y5.b$b, reason: collision with other inner class name */
    static final class C2742b extends Lambda implements Function1<AbstractC18162a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18165d f170200f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2742b(C18165d c18165d) {
            super(1);
            this.f170200f = c18165d;
        }

        public final void a(AbstractC18162a it) {
            Intrinsics.j(it, "it");
            this.f170200f.p(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC18162a abstractC18162a) {
            a(abstractC18162a);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: y5.b$c */
    static final class c extends Lambda implements Function1<AbstractC18162a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18165d f170201f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C18165d c18165d) {
            super(1);
            this.f170201f = c18165d;
        }

        public final void a(AbstractC18162a it) {
            Intrinsics.j(it, "it");
            this.f170201f.p(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC18162a abstractC18162a) {
            a(abstractC18162a);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: y5.b$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f170202f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC6426h f170203g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f170204h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, EnumC6426h enumC6426h, int i10) {
            super(2);
            this.f170202f = str;
            this.f170203g = enumC6426h;
            this.f170204h = i10;
        }

        public final void a(Composer composer, int i10) {
            C18163b.a(this.f170202f, this.f170203g, composer, J0.a(this.f170204h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: y5.b$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f170205f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC6426h f170206g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f170207h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, EnumC6426h enumC6426h, int i10) {
            super(2);
            this.f170205f = str;
            this.f170206g = enumC6426h;
            this.f170207h = i10;
        }

        public final void a(Composer composer, int i10) {
            C18163b.a(this.f170205f, this.f170206g, composer, J0.a(this.f170207h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(String sessionId, EnumC6426h environment, Composer composer, int i10) {
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
            Activity activityA = C17226e.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
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
            C18166e c18166e = new C18166e(sessionId, environment);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            h0 h0VarC = W2.b.f38408a.c(composerStartRestartGroup, 6);
            if (h0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c0 c0VarB = W2.d.b(C18165d.class, h0VarC, null, c18166e, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.U();
            C18165d c18165d = (C18165d) c0VarB;
            C13588d.a(false, new a(c18165d, activityA), composerStartRestartGroup, 0, 1);
            PinScreenState value = c18165d.o().getValue();
            AbstractC17511c connectionState = value.getConnectionState();
            if (connectionState instanceof AbstractC17511c.Disconnected) {
                composerStartRestartGroup.startReplaceableGroup(1324538324);
                AbstractC17511c.Disconnected disconnected = (AbstractC17511c.Disconnected) value.getConnectionState();
                if (disconnected.getError() == null) {
                    composerStartRestartGroup.startReplaceableGroup(1324538430);
                    z1<PinScreenState> z1VarO = c18165d.o();
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zV = composerStartRestartGroup.V(c18165d);
                    Object objB = composerStartRestartGroup.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C2742b(c18165d);
                        composerStartRestartGroup.t(objB);
                    }
                    composerStartRestartGroup.U();
                    C18387e.a(z1VarO, (Function1) objB, composerStartRestartGroup, 0);
                    composerStartRestartGroup.U();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1324538610);
                    EnumC6425g error = disconnected.getError();
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zV2 = composerStartRestartGroup.V(c18165d);
                    Object objB2 = composerStartRestartGroup.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new c(c18165d);
                        composerStartRestartGroup.t(objB2);
                    }
                    composerStartRestartGroup.U();
                    A5.e.a(error, (Function1) objB2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.U();
                }
                composerStartRestartGroup.U();
            } else if (connectionState instanceof AbstractC17511c.b) {
                composerStartRestartGroup.startReplaceableGroup(1324538828);
                B5.a.a(composerStartRestartGroup, 0);
                composerStartRestartGroup.U();
            } else if (connectionState instanceof AbstractC17511c.a) {
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
