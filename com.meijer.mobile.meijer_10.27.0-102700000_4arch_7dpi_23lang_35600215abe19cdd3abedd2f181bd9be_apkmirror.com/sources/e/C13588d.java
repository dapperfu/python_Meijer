package e;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.G;
import androidx.view.InterfaceC6030s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lkotlin/Function0;", "", "onBack", "a", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13588d {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e.d$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2012d f127649f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f127650g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2012d c2012d, boolean z10) {
            super(0);
            this.f127649f = c2012d;
            this.f127650g = z10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f127649f.setEnabled(this.f127650g);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: e.d$b */
    static final class b extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f127651f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6030s f127652g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C2012d f127653h;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/d$b$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: e.d$b$a */
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2012d f127654a;

            public a(C2012d c2012d) {
                this.f127654a = c2012d;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f127654a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(G g10, InterfaceC6030s interfaceC6030s, C2012d c2012d) {
            super(1);
            this.f127651f = g10;
            this.f127652g = interfaceC6030s;
            this.f127653h = c2012d;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            this.f127651f.i(this.f127652g, this.f127653h);
            return new a(this.f127653h);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e.d$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f127655f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127656g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f127657h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f127658i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f127655f = z10;
            this.f127656g = function0;
            this.f127657h = i10;
            this.f127658i = i11;
        }

        public final void a(Composer composer, int i10) {
            C13588d.a(this.f127655f, this.f127656g, composer, J0.a(this.f127657h | 1), this.f127658i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/d$d", "Landroidx/activity/F;", "", "handleOnBackPressed", "()V", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e.d$d, reason: collision with other inner class name */
    public static final class C2012d extends androidx.view.F {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1<Function0<Unit>> f127659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2012d(boolean z10, z1<? extends Function0<Unit>> z1Var) {
            super(z10);
            this.f127659a = z1Var;
        }

        @Override // androidx.view.F
        public void handleOnBackPressed() {
            C13588d.b(this.f127659a).invoke();
        }
    }

    public static final void a(boolean z10, Function0<Unit> function0, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-361453782);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            boolean z11 = true;
            if (i15 != 0) {
                z10 = true;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-361453782, i12, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:81)");
            }
            z1 z1VarP = o1.p(function0, composerStartRestartGroup, (i12 >> 3) & 14);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C2012d(z10, z1VarP);
                composerStartRestartGroup.t(objB);
            }
            C2012d c2012d = (C2012d) objB;
            if ((i12 & 14) != 4) {
                z11 = false;
            }
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == companion.a()) {
                objB2 = new a(c2012d, z10);
                composerStartRestartGroup.t(objB2);
            }
            J.i((Function0) objB2, composerStartRestartGroup, 0);
            androidx.view.J jA = C13592h.f127666a.a(composerStartRestartGroup, 6);
            if (jA != null) {
                G onBackPressedDispatcher = jA.getOnBackPressedDispatcher();
                InterfaceC6030s interfaceC6030s = (InterfaceC6030s) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean zD = composerStartRestartGroup.D(onBackPressedDispatcher) | composerStartRestartGroup.D(interfaceC6030s);
                Object objB3 = composerStartRestartGroup.B();
                if (zD || objB3 == companion.a()) {
                    objB3 = new b(onBackPressedDispatcher, interfaceC6030s, c2012d);
                    composerStartRestartGroup.t(objB3);
                }
                J.b(interfaceC6030s, onBackPressedDispatcher, (Function1) objB3, composerStartRestartGroup, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new c(z10, function0, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> b(z1<? extends Function0<Unit>> z1Var) {
        return z1Var.getValue();
    }
}
