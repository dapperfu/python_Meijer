package kotlin;

import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17775N {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.N$a */
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final a f166569a = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.N$a$a, reason: collision with other inner class name */
        static final class C2636a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<f0> f166570f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2636a(List<? extends f0> list) {
                super(1);
                this.f166570f = list;
            }

            public final void a(f0.a aVar) {
                List<f0> list = this.f166570f;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f0.a.h(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K k10, List<? extends I> list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int iMax = 0;
            int iMax2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                f0 f0VarK0 = list.get(i10).k0(j10);
                iMax = Math.max(iMax, f0VarK0.getWidth());
                iMax2 = Math.max(iMax2, f0VarK0.getHeight());
                arrayList.add(f0VarK0);
            }
            return K.G0(k10, iMax, iMax2, null, new C2636a(arrayList), 4, null);
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.N$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f166571f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f166572g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f166573h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f166574i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f166571f = modifier;
            this.f166572g = function2;
            this.f166573h = i10;
            this.f166574i = i11;
        }

        public final void a(Composer composer, int i10) {
            C17775N.a(this.f166571f, this.f166572g, composer, J0.a(this.f166573h | 1), this.f166574i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2105228848);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
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
            if (composerStartRestartGroup.D(function2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2105228848, i12, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:30)");
            }
            a aVar = a.f166569a;
            int i16 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            int i17 = ((i16 << 6) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, aVar, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i17 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(modifier, function2, i10, i11));
        }
    }
}
