package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "LL0/e;", "", "content", "a", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.N, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15855N {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n0.N$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<L0.e, Composer, Integer, Unit> f151882f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15854M f151883g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function3<? super L0.e, ? super Composer, ? super Integer, Unit> function3, C15854M c15854m) {
            super(2);
            this.f151882f = function3;
            this.f151883g = c15854m;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1863926504, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f151882f.invoke(this.f151883g, composer, 0);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.N$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<L0.e, Composer, Integer, Unit> f151884f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f151885g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super L0.e, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f151884f = function3;
            this.f151885g = i10;
        }

        public final void a(Composer composer, int i10) {
            C15855N.a(this.f151884f, composer, J0.a(this.f151885g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln0/M;", "c", "()Ln0/M;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n0.N$c */
    static final class c extends Lambda implements Function0<C15854M> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L0.h f151886f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L0.e f151887g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(L0.h hVar, L0.e eVar) {
            super(0);
            this.f151886f = hVar;
            this.f151887g = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C15854M invoke() {
            return new C15854M(this.f151886f, MapsKt.k(), this.f151887g);
        }
    }

    public static final void a(Function3<? super L0.e, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(674185128);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(function3)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
            }
            L0.h hVar = (L0.h) composerStartRestartGroup.o(L0.j.e());
            L0.e eVarA = L0.g.a(composerStartRestartGroup, 0);
            Object[] objArr = {hVar};
            L0.k<C15854M, Map<String, List<Object>>> kVarA = C15854M.INSTANCE.a(hVar, eVarA);
            boolean zD = composerStartRestartGroup.D(hVar) | composerStartRestartGroup.D(eVarA);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new c(hVar, eVarA);
                composerStartRestartGroup.t(objB);
            }
            C15854M c15854m = (C15854M) L0.c.c(objArr, kVarA, null, (Function0) objB, composerStartRestartGroup, 0, 4);
            r.a(L0.j.e().d(c15854m), ComposableLambdaKt.c(1863926504, true, new a(function3, c15854m), composerStartRestartGroup, 54), composerStartRestartGroup, G0.f50200i | 48);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(function3, i10));
        }
    }
}
