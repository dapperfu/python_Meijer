package kotlin;

import H1.p;
import V0.w1;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx0/R1;", "d", "(Landroidx/compose/runtime/Composer;I)Lx0/R1;", "Lkotlin/Function0;", "", "block", "a", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "LH1/p;", "c", "(Landroid/view/View;)LH1/p;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: x0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18022m0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.m0$a */
    static final class a extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f169425f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f169426g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"x0/m0$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: x0.m0$a$a, reason: collision with other inner class name */
        public static final class C2711a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC17965P0 f169427a;

            public C2711a(ViewOnAttachStateChangeListenerC17965P0 viewOnAttachStateChangeListenerC17965P0) {
                this.f169427a = viewOnAttachStateChangeListenerC17965P0;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f169427a.a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, Function0<Unit> function0) {
            super(1);
            this.f169425f = view;
            this.f169426g = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            return new C2711a(new ViewOnAttachStateChangeListenerC17965P0(this.f169425f, this.f169426g));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.m0$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f169428f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f169429g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0, int i10) {
            super(2);
            this.f169428f = function0;
            this.f169429g = i10;
        }

        public final void a(Composer composer, int i10) {
            C18022m0.a(this.f169428f, composer, J0.a(this.f169429g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p c(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return w1.d(rect);
    }

    public static final void a(Function0<Unit> function0, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1063434120);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        boolean z11 = true;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1063434120, i11, -1, "androidx.compose.material.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:41)");
            }
            View view = (View) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.k());
            boolean zD = composerStartRestartGroup.D(view);
            if ((i11 & 14) != 4) {
                z11 = false;
            }
            boolean z12 = zD | z11;
            Object objB = composerStartRestartGroup.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new a(view, function0);
                composerStartRestartGroup.t(objB);
            }
            J.c(view, (Function1) objB, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(function0, i10));
        }
    }

    public static final R1 d(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1216067952, i10, -1, "androidx.compose.material.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:35)");
        }
        View view = (View) composer.o(AndroidCompositionLocals_androidKt.k());
        boolean zV = composer.V(view);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new R1(view);
            composer.t(objB);
        }
        R1 r12 = (R1) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return r12;
    }
}
