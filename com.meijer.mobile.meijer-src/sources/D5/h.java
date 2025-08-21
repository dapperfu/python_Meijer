package D5;

import D5.g;
import R5.t;
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
import com.adobe.marketing.mobile.assurance.internal.C6548e;
import com.adobe.marketing.mobile.assurance.internal.E;
import com.adobe.marketing.mobile.assurance.internal.EnumC6551h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import v5.C17639e;
import w5.AbstractC17844c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/h;", "environment", "", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/h;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function1<g, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f5951f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f5952g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, Activity activity) {
            super(1);
            this.f5951f = kVar;
            this.f5952g = activity;
        }

        public final void a(g it) {
            Activity activity;
            Intrinsics.j(it, "it");
            this.f5951f.n(it);
            if (!(it instanceof g.a) || (activity = this.f5952g) == null) {
                return;
            }
            activity.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            a(gVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC6551h f5953f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5954g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC6551h enumC6551h, int i10) {
            super(2);
            this.f5953f = enumC6551h;
            this.f5954g = i10;
        }

        public final void a(Composer composer, int i10) {
            h.a(this.f5953f, composer, J0.a(this.f5954g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC6551h f5955f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5956g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EnumC6551h enumC6551h, int i10) {
            super(2);
            this.f5955f = enumC6551h;
            this.f5956g = i10;
        }

        public final void a(Composer composer, int i10) {
            h.a(this.f5955f, composer, J0.a(this.f5956g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(EnumC6551h environment, Composer composer, int i10) {
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
            Activity activityA = C17639e.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
            E eA = C6548e.f63072a.a();
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
            h0 h0VarC = W2.b.f40696a.c(composerStartRestartGroup, 6);
            if (h0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c0 c0VarB = W2.d.b(k.class, h0VarC, null, iVar, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composerStartRestartGroup, 36936, 0);
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
            if ((z1Var.getValue() instanceof AbstractC17844c.a) && activityA != null) {
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
