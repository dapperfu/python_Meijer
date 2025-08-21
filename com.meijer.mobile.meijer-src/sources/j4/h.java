package j4;

import V2.CreationExtras;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.InterfaceC6162j;
import androidx.view.c0;
import androidx.view.h0;
import java.lang.ref.WeakReference;
import kotlin.C14667h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\b\u001a\u00020\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li4/h;", "LL0/e;", "saveableStateHolder", "Lkotlin/Function0;", "", "content", "a", "(Li4/h;LL0/e;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "b", "(LL0/e;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L0.e f139887f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f139888g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f139889h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(L0.e eVar, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f139887f = eVar;
            this.f139888g = function2;
            this.f139889h = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-52928304, i10, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
            }
            h.b(this.f139887f, this.f139888g, composer, ((this.f139889h >> 3) & 112) | 8);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14667h f139890f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L0.e f139891g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f139892h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f139893i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C14667h c14667h, L0.e eVar, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f139890f = c14667h;
            this.f139891g = eVar;
            this.f139892h = function2;
            this.f139893i = i10;
        }

        public final void a(Composer composer, int i10) {
            h.a(this.f139890f, this.f139891g, this.f139892h, composer, J0.a(this.f139893i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L0.e f139894f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f139895g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f139896h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(L0.e eVar, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f139894f = eVar;
            this.f139895g = function2;
            this.f139896h = i10;
        }

        public final void a(Composer composer, int i10) {
            h.b(this.f139894f, this.f139895g, composer, J0.a(this.f139896h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(C14667h c14667h, L0.e eVar, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1579360880);
        if (ComposerKt.M()) {
            ComposerKt.U(-1579360880, i10, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
        }
        r.b(new G0[]{W2.b.f40696a.d(c14667h), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().d(c14667h), AndroidCompositionLocals_androidKt.j().d(c14667h)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -52928304, true, new a(eVar, function2, i10)), composerStartRestartGroup, 56);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new b(c14667h, eVar, function2, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(L0.e eVar, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(1211832233);
        if (ComposerKt.M()) {
            ComposerKt.U(1211832233, i10, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        h0 h0VarC = W2.b.f40696a.c(composerStartRestartGroup, 6);
        if (h0VarC != null) {
            if (h0VarC instanceof InterfaceC6162j) {
                defaultViewModelCreationExtras = ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.b.f39630c;
            }
            c0 c0VarB = W2.d.b(C14941a.class, h0VarC, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.U();
            C14941a c14941a = (C14941a) c0VarB;
            c14941a.o(new WeakReference<>(eVar));
            eVar.d(c14941a.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), function2, composerStartRestartGroup, (i10 & 112) | 520);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            T0 t0L = composerStartRestartGroup.l();
            if (t0L == null) {
                return;
            }
            t0L.a(new c(eVar, function2, i10));
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }
}
