package yi;

import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14903g;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import li.j;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lyi/a;", "LJi/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "Lli/j;", "o0", "()Lli/j;", "itemProvider", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yi.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC18317a extends Ji.b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yi.a$a, reason: collision with other inner class name */
    static final class C2759a implements Function3<Modifier, Composer, Integer, Unit> {
        C2759a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1452082553, i10, -1, "com.meijer.mobile.android_acres_library.composables.accordion.AccordionListComposer.getComposer.<anonymous> (AccordionList.kt:65)");
            }
            InterfaceC18317a interfaceC18317a = InterfaceC18317a.this;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            composer.startReplaceGroup(198831836);
            int size = interfaceC18317a.getItemProvider().i().size();
            for (int i11 = 0; i11 < size; i11++) {
                Ji.g.l(interfaceC18317a.getItemProvider(), Integer.valueOf(i11), null, 2, null).invoke(composer, 0);
                C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* renamed from: o0 */
    j getItemProvider();

    @Override // Ji.b
    default Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-1452082553, true, new C2759a());
    }
}
