package Vm;

import H1.h;
import V0.C5346q0;
import Vm.e;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.meijer.mobile.meijer.activity.find.filter.j;
import com.meijer.mobile.meijer.activity.find.filter.k;
import com.meijer.mobile.meijer.activity.find.filter.o;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.InterfaceC14800I;
import java.util.Locale;
import kotlin.C17877E0;
import kotlin.C17917Z;
import kotlin.C17983x;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/o;", "filterViewModel", "Lcom/meijer/mobile/meijer/activity/find/filter/k;", "state", "", "d", "(Lcom/meijer/mobile/meijer/activity/find/filter/o;Lcom/meijer/mobile/meijer/activity/find/filter/k;Landroidx/compose/runtime/Composer;I)V", "", "enabled", "Lkotlin/Function0;", "onClick", "", "text", "g", "(ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f37670a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37671b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37672c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Vm.e$a$a, reason: collision with other inner class name */
        static final class C0812a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f37673a;

            C0812a(String str) {
                this.f37673a = str;
            }

            public final void a(InterfaceC14800I Button, Composer composer, int i10) {
                Intrinsics.j(Button, "$this$Button");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2066633980, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.actiongroup.StatelessSeeResultsButton.<anonymous>.<anonymous> (SeeResultsButton.kt:63)");
                }
                String str = this.f37673a;
                Locale ROOT = Locale.ROOT;
                Intrinsics.i(ROOT, "ROOT");
                String upperCase = str.toUpperCase(ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                N1.b(upperCase, D.i(Modifier.INSTANCE, h.p(4)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C17877E0.f166879a.c(composer, C17877E0.f166880b).getButton(), composer, 48, 0, 65532);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1627011340, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.actiongroup.StatelessSeeResultsButton.<anonymous> (SeeResultsButton.kt:53)");
            }
            C17917Z.a(null, C5346q0.INSTANCE.f(), h.p(1), 0.0f, composer, 432, 9);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f37670a);
            final Function0<Unit> function0 = this.f37670a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Vm.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17983x.a((Function0) objB, J.i(D.i(Modifier.INSTANCE, h.p(16)), h.p(48)), this.f37671b, null, null, null, null, null, null, ComposableLambdaKt.c(2066633980, true, new C0812a(this.f37672c), composer, 54), composer, 805306416, HttpResponseStatus.ERROR_GATEWAY_TIMEOUT);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(Function0<Unit> function0, boolean z10, String str) {
            this.f37670a = function0;
            this.f37671b = z10;
            this.f37672c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    public static final void d(final o filterViewModel, final k state, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(filterViewModel, "filterViewModel");
        Intrinsics.j(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-107611780);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(filterViewModel) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(state) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-107611780, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.actiongroup.SeeResultsButton (SeeResultsButton.kt:29)");
            }
            Resources resources = ((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())).getResources();
            boolean seeResultsButtonIsEnabled = state.getSeeResultsButtonIsEnabled();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(filterViewModel);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Vm.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.e(filterViewModel);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            String string = resources.getString(Bj.o.f2963B0);
            Intrinsics.i(string, "getString(...)");
            g(seeResultsButtonIsEnabled, (Function0) objB, string, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Vm.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.f(filterViewModel, state, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(o oVar) {
        oVar.u(j.e.f106724a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(o oVar, k kVar, int i10, Composer composer, int i11) {
        d(oVar, kVar, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void g(final boolean z10, final Function0<Unit> onClick, final String text, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(2130485704);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2130485704, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.actiongroup.StatelessSeeResultsButton (SeeResultsButton.kt:46)");
            }
            float f10 = 0;
            t1.a(D.i(J.h(Modifier.INSTANCE, 0.0f, 1, null), h.p(f10)), null, 0L, 0L, null, h.p(f10), ComposableLambdaKt.c(1627011340, true, new a(onClick, z10, text), composerStartRestartGroup, 54), composerStartRestartGroup, 1769478, 30);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Vm.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.h(z10, onClick, text, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(boolean z10, Function0 function0, String str, int i10, Composer composer, int i11) {
        g(z10, function0, str, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
