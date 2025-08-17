package C5;

import C5.g;
import Q5.t;
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
import com.adobe.marketing.mobile.assurance.internal.C6423e;
import com.adobe.marketing.mobile.assurance.internal.E;
import com.adobe.marketing.mobile.assurance.internal.EnumC6426h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u5.C17226e;
import v5.AbstractC17511c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/h;", "environment", "", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/h;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function1<g, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f3652f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f3653g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, Activity activity) {
            super(1);
            this.f3652f = kVar;
            this.f3653g = activity;
        }

        public final void a(g it) {
            Activity activity;
            Intrinsics.j(it, "it");
            this.f3652f.n(it);
            if (!(it instanceof g.a) || (activity = this.f3653g) == null) {
                return;
            }
            activity.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            a(gVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC6426h f3654f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f3655g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC6426h enumC6426h, int i10) {
            super(2);
            this.f3654f = enumC6426h;
            this.f3655g = i10;
        }

        public final void a(Composer composer, int i10) {
            h.a(this.f3654f, composer, J0.a(this.f3655g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC6426h f3656f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f3657g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EnumC6426h enumC6426h, int i10) {
            super(2);
            this.f3656f = enumC6426h;
            this.f3657g = i10;
        }

        public final void a(Composer composer, int i10) {
            h.a(this.f3656f, composer, J0.a(this.f3657g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(EnumC6426h environment, Composer composer, int i10) {
        int i11;
        Intrinsics.j(environment, "environment");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1150088121);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(environment) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1150088121, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.quickconnect.QuickConnectScreen (QuickConnectScreen.kt:32)");
            }
            Activity activityA = C17226e.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
            E eA = C6423e.f62233a.a();
            if (eA == null) {
                t.b("Assurance", "QuickConnectScreen", "AssuranceStateManager is not initialized. Cannot proceed with Quick Connect.", new Object[0]);
                if (activityA != null) {
                    activityA.finish();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                T0 t0L = composerStartRestartGroup.l();
                if (t0L == null) {
                    return;
                }
                t0L.a(new c(environment, i10));
                return;
            }
            i iVar = new i(eA, environment);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            h0 h0VarC = W2.b.f38408a.c(composerStartRestartGroup, 6);
            if (h0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c0 c0VarB = W2.d.b(k.class, h0VarC, null, iVar, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.U();
            k kVar = (k) c0VarB;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = kVar.m();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            z1 z1Var = (z1) objB;
            if ((z1Var.getValue() instanceof AbstractC17511c.a) && activityA != null) {
                activityA.finish();
            }
            j.a(z1Var, new a(kVar, activityA), composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L2 = composerStartRestartGroup.l();
        if (t0L2 == null) {
            return;
        }
        t0L2.a(new b(environment, i10));
    }
}
