package Ri;

import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import Oi.l;
import android.R;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.InterfaceC6028r0;
import androidx.compose.ui.text.AnnotatedString;
import j0.C14903g;
import java.util.Iterator;
import java.util.List;
import ki.InterfaceC15160b0;
import ki.a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l0.C15432b;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tJ7\u0010\u0012\u001a\u00020\u0007*\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LRi/w;", "LOi/c;", "LOi/l$l;", "state", "<init>", "(LOi/l$l;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "Landroidx/compose/ui/Modifier;", "modifier", "", "LKi/C;", "iconList", "", "header", "s", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "iconDrawable", "v", "(LKi/M;LKi/C;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "a", "LOi/l$l;", "w", "()LOi/l$l;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class w implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.IconsState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33363b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.w$a$a, reason: collision with other inner class name */
        static final class C0750a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f33364a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33365b;

            C0750a(w wVar, LocalThemeScope localThemeScope) {
                this.f33364a = wVar;
                this.f33365b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(987397452, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:59)");
                }
                w wVar = this.f33364a;
                LocalThemeScope localThemeScope = this.f33365b;
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
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.a.C3918d.f16881e, C.a.C3919e.f16882e, C.a.x.f16909e, C.a.o.f16897e, C.a.t.f16904e, C.a.p.f16898e, C.a.F.f16869e, C.a.G.f16870e, C.a.A.f16863e, C.a.q.f16900e, C.a.y.f16910e, C.a.E.f16868e, C.a.C3926l.f16893e, C.a.H.f16871e, C.a.I.f16872e, C.a.J.f16873e, C.a.C3920f.f16884e), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.a.C3917b.f16879e, C.a.c.f16880e, C.a.M.f16876e, C.a.K.f16874e, C.a.L.f16875e, C.a.C0287a.f16877e, C.a.z.f16912e), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.a.u.f16905e, C.a.v.f16906e, C.a.w.f16907e, C.a.s.f16902e, C.a.r.f16901e), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.a.B.f16864e, C.a.C3925k.f16891e, C.a.D.f16867e, C.a.C3927m.f16894e, C.a.C3921g.f16885e, C.a.C3922h.f16887e, C.a.C3923i.f16889e, C.a.n.f16896e, C.a.C0286C.f16866e, C.a.C3924j.f16890e), null, composer, 384, 5);
                composer.v();
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

        a(LocalThemeScope localThemeScope, w wVar) {
            this.f33362a = localThemeScope;
            this.f33363b = wVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1706862079, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:55)");
            }
            Si.b.b(this.f33362a, null, this.f33363b.c("Action"), "1.0", null, ComposableLambdaKt.c(987397452, true, new C0750a(this.f33363b, this.f33362a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33367b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f33368a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33369b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f33368a = wVar;
                this.f33369b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-180079869, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:125)");
                }
                w wVar = this.f33368a;
                LocalThemeScope localThemeScope = this.f33369b;
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
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.d.C0295d.f16959e, C.b.d.C0294b.f16957e, C.b.d.g.f16962e, C.b.d.k.f16967e, C.b.d.m.f16969e, C.b.d.a.f16956e, C.b.d.h.f16963e, C.b.d.c.f16958e, C.b.d.f.f16961e, C.b.d.j.f16966e, C.b.d.i.f16965e, C.b.d.l.f16968e, C.b.d.e.f16960e), "Meijer Items", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.a.C0288a.f16915e, C.b.a.g.f16923e, C.b.a.f.f16921e, C.b.a.h.f16924e, C.b.a.C0289b.f16916e, C.b.a.j.f16926e, C.b.a.d.f16919e, C.b.a.i.f16925e, C.b.a.c.f16918e, C.b.a.e.f16920e), "Account", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.h.k.f17018e, C.b.h.l.f17020e, C.b.h.e.f17011e, C.b.h.c.f17008e, C.b.h.n.f17023e, C.b.h.p.f17025e, C.b.h.f.f17012e, C.b.h.g.f17013e, C.b.h.d.f17010e, C.b.h.o.f17024e, C.b.h.j.f17017e, C.b.h.i.f17016e, C.b.h.m.f17022e, C.b.h.C0301b.f17006e, C.b.h.q.f17027e, C.b.h.r.f17028e, C.b.h.C0302h.f17015e, C.b.h.a.f17005e), "Tools", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.c.k.f16951e, C.b.c.h.f16948e, C.b.c.f.f16946e, C.b.c.i.f16949e, C.b.c.j.f16950e, C.b.c.g.f16947e, C.b.c.C0292b.f16942e, C.b.c.n.f16954e, C.b.c.m.f16953e, C.b.c.l.f16952e, C.b.c.a.f16940e, C.b.c.e.f16945e, C.b.c.d.f16944e, C.b.c.C0293c.f16943e), "Location", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.f.C0299f.f16990e, C.b.f.g.f16991e, C.b.f.a.f16984e, C.b.f.e.f16989e, C.b.f.i.f16993e, C.b.f.d.f16988e, C.b.f.j.f16994e, C.b.f.h.f16992e, C.b.f.C0298b.f16986e, C.b.f.c.f16987e), "Pharmacy", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.g.d.f16999e, C.b.g.a.f16996e, C.b.g.C0300b.f16997e, C.b.g.f.f17002e, C.b.g.e.f17001e, C.b.g.c.f16998e), "Reward", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.AbstractC0290b.a.f16928e, C.b.AbstractC0290b.C0291b.f16930e, C.b.AbstractC0290b.j.f16938e, C.b.AbstractC0290b.e.f16933e, C.b.AbstractC0290b.g.f16935e, C.b.AbstractC0290b.f.f16934e, C.b.AbstractC0290b.h.f16936e, C.b.AbstractC0290b.d.f16932e, C.b.AbstractC0290b.c.f16931e, C.b.AbstractC0290b.i.f16937e), "Item", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.i.h.f17037e, C.b.i.g.f17036e, C.b.i.f.f17035e, C.b.i.e.f17034e, C.b.i.d.f17033e, C.b.i.c.f17032e, C.b.i.C0303b.f17031e, C.b.i.a.f17030e), "Vehicle Types", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.e.i.f16981e, C.b.e.a.f16971e, C.b.e.C0296b.f16972e, C.b.e.c.f16973e, C.b.e.d.f16975e, C.b.e.f.f16978e, C.b.e.j.f16982e, C.b.e.g.f16979e, C.b.e.C0297e.f16977e, C.b.e.h.f16980e), "Miscellaneous", composer, 3456, 1);
                composer.v();
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

        b(LocalThemeScope localThemeScope, w wVar) {
            this.f33366a = localThemeScope;
            this.f33367b = wVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-264307978, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:121)");
            }
            Si.b.b(this.f33366a, null, this.f33367b.c("Application"), "1.0", null, ComposableLambdaKt.c(-180079869, true, new a(this.f33367b, this.f33366a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33370a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33371b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f33372a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33373b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f33372a = wVar;
                this.f33373b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1074702148, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:279)");
                }
                w wVar = this.f33372a;
                LocalThemeScope localThemeScope = this.f33373b;
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
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.f.a.f17048e, C.f.d.f17051e, C.f.i.f17057e, C.f.k.f17061e, C.f.C0305f.f17054e, C.f.g.f17055e, C.f.m.f17063e, C.f.o.f17066e), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.f.b.f17049e, C.f.e.f17053e, C.f.j.f17059e, C.f.l.f17062e, C.f.c.f17050e, C.f.h.f17056e, C.f.n.f17065e, C.f.p.f17068e), null, composer, 384, 5);
                composer.v();
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

        c(LocalThemeScope localThemeScope, w wVar) {
            this.f33370a = localThemeScope;
            this.f33371b = wVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(990474039, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:275)");
            }
            Si.b.b(this.f33370a, null, this.f33371b.c("Navigation"), "1.0", null, ComposableLambdaKt.c(1074702148, true, new a(this.f33371b, this.f33370a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33374a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33375b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f33376a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33377b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f33376a = wVar;
                this.f33377b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1965483131, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:313)");
                }
                w wVar = this.f33376a;
                LocalThemeScope localThemeScope = this.f33377b;
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
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.h.a.f17084d, C.h.b.f17085d, C.h.c.f17086d, C.h.e.f17088d, C.h.g.f17090d, C.h.d.f17087d, C.h.f.f17089d), null, composer, 384, 5);
                composer.v();
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

        d(LocalThemeScope localThemeScope, w wVar) {
            this.f33374a = localThemeScope;
            this.f33375b = wVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2049711240, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:309)");
            }
            Si.b.b(this.f33374a, null, this.f33375b.c("Social"), "1.0", null, ComposableLambdaKt.c(-1965483131, true, new a(this.f33375b, this.f33374a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33378a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33379b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f33380a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33381b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f33380a = wVar;
                this.f33381b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-710701114, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:334)");
                }
                w wVar = this.f33380a;
                LocalThemeScope localThemeScope = this.f33381b;
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
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.i.b.f17093d, C.i.e.f17096d, C.i.f.f17098d, C.i.C0307i.f17103d, C.i.h.f17101d, C.i.n.f17109d, C.i.l.f17107d, C.i.c.f17094d, C.i.j.f17105d, C.i.k.f17106d, C.i.m.f17108d), null, composer, 384, 5);
                composer.v();
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

        e(LocalThemeScope localThemeScope, w wVar) {
            this.f33378a = localThemeScope;
            this.f33379b = wVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-794929223, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:330)");
            }
            Si.b.b(this.f33378a, null, this.f33379b.c("Support"), "1.0", null, ComposableLambdaKt.c(-710701114, true, new a(this.f33379b, this.f33378a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33382a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33383b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f33384a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33385b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f33384a = wVar;
                this.f33385b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(544080903, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:359)");
                }
                w wVar = this.f33384a;
                LocalThemeScope localThemeScope = this.f33385b;
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
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.j.A.f17111d, C.j.y.f17144d, C.j.w.f17142d, C.j.B.f17112d, C.j.z.f17145d, C.j.x.f17143d), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.j.C0309j.f17128d, C.j.C3933g.f17125d, C.j.k.f17129d, C.j.h.f17126d, C.j.i.f17127d, C.j.F.f17116d, C.j.G.f17117d, C.j.s.f17138d, C.j.t.f17139d), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.j.C3930d.f17121d, C.j.c.f17120d, C.j.C3931e.f17122d, C.j.C3932f.f17123d, C.j.o.f17134d, C.j.p.f17135d, C.j.q.f17136d, C.j.r.f17137d, C.j.u.f17140d, C.j.v.f17141d, C.j.C3928a.f17118d, C.j.C3929b.f17119d, C.j.D.f17114d, C.j.C0308C.f17113d, C.j.l.f17130d, C.j.E.f17115d, C.j.n.f17133d, C.j.m.f17132d), null, composer, 384, 5);
                composer.v();
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

        f(LocalThemeScope localThemeScope, w wVar) {
            this.f33382a = localThemeScope;
            this.f33383b = wVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(459852794, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:355)");
            }
            Si.b.b(this.f33382a, null, this.f33383b.c("Toggle"), "1.0", null, ComposableLambdaKt.c(544080903, true, new a(this.f33383b, this.f33382a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33387b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f33388a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33389b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f33388a = wVar;
                this.f33389b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1798862920, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:414)");
                }
                w wVar = this.f33388a;
                LocalThemeScope localThemeScope = this.f33389b;
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
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.g.a.f17071e, C.g.b.f17072e, C.g.c.f17073e, C.g.d.f17074e, C.g.e.f17075e, C.g.f.f17076e, C.g.C0306g.f17078e, C.g.h.f17079e, C.g.i.f17080e, C.g.j.f17081e, C.g.k.f17082e), null, composer, 384, 5);
                composer.v();
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

        g(LocalThemeScope localThemeScope, w wVar) {
            this.f33386a = localThemeScope;
            this.f33387b = wVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1714634811, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:410)");
            }
            Si.b.b(this.f33386a, null, this.f33387b.c("Payment"), "1.0", null, ComposableLambdaKt.c(1798862920, true, new a(this.f33387b, this.f33386a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33390a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33391b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f33392a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33393b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f33392a = wVar;
                this.f33393b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1241322359, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:439)");
                }
                w wVar = this.f33392a;
                LocalThemeScope localThemeScope = this.f33393b;
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
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.e.a.f17041d, C.e.b.f17042d, C.e.C0304e.f17045d, C.e.c.f17043d, C.e.d.f17044d), null, composer, 384, 5);
                composer.v();
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

        h(LocalThemeScope localThemeScope, w wVar) {
            this.f33390a = localThemeScope;
            this.f33391b = wVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1325550468, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:435)");
            }
            Si.b.b(this.f33390a, null, this.f33391b.c("Brand logos"), "1.0", null, ComposableLambdaKt.c(-1241322359, true, new a(this.f33391b, this.f33390a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33394a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33395b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33396a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f33397b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ri.w$i$a$a, reason: collision with other inner class name */
            static final class C0751a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33398a;

                C0751a(LocalThemeScope localThemeScope) {
                    this.f33398a = localThemeScope;
                }

                public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1670810023, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:460)");
                    }
                    Di.j.i(this.f33398a, null, "The Custom Icons section is an example of using non-standard drawable resources with Acres components. These are not to be used in production code. AdsDrawables.Custom is a compatibility layer that should only be used for testing or with express approval of the UX team.", "Not general use", Assemble.getToastVariant().getWarning(), null, composer, 3072, 17);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
                    a(interfaceC15160b0, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, w wVar) {
                this.f33396a = localThemeScope;
                this.f33397b = wVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(13459658, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:458)");
                }
                LocalThemeScope localThemeScope = this.f33396a;
                w wVar = this.f33397b;
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
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                Q.e(localThemeScope, a1.f142015a, ComposableLambdaKt.c(1670810023, true, new C0751a(localThemeScope), composer, 54), composer, 432);
                wVar.s(localThemeScope, null, CollectionsKt.p(new C.Custom(R.drawable.ic_dialog_alert), new C.Custom(R.drawable.ic_delete), new C.Custom(R.drawable.ic_menu_share)), null, composer, 0, 5);
                composer.v();
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

        i(LocalThemeScope localThemeScope, w wVar) {
            this.f33394a = localThemeScope;
            this.f33395b = wVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-70768451, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:454)");
            }
            Si.b.b(this.f33394a, null, this.f33395b.c("Custom"), "1.2", null, ComposableLambdaKt.c(13459658, true, new a(this.f33394a, this.f33395b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Ki.C> f33399a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f33400b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33401c;

        /* JADX WARN: Multi-variable type inference failed */
        j(List<? extends Ki.C> list, w wVar, LocalThemeScope localThemeScope) {
            this.f33399a = list;
            this.f33400b = wVar;
            this.f33401c = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(841378050, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.IconGrid.<anonymous>.<anonymous> (IconsShowcase.kt:505)");
            }
            List<Ki.C> list = this.f33399a;
            w wVar = this.f33400b;
            LocalThemeScope localThemeScope = this.f33401c;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                wVar.v(localThemeScope, (Ki.C) it.next(), null, composer, 0, 2);
            }
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

    public w(l.IconsState state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, w wVar, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1706862079, true, new a(localThemeScope, wVar)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-264307978, true, new b(localThemeScope, wVar)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(990474039, true, new c(localThemeScope, wVar)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2049711240, true, new d(localThemeScope, wVar)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-794929223, true, new e(localThemeScope, wVar)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(459852794, true, new f(localThemeScope, wVar)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1714634811, true, new g(localThemeScope, wVar)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1325550468, true, new h(localThemeScope, wVar)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-70768451, true, new i(localThemeScope, wVar)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(w wVar, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        wVar.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(w wVar, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        wVar.b(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(w wVar, LocalThemeScope localThemeScope, Modifier modifier, List list, String str, int i10, int i11, Composer composer, int i12) {
        wVar.s(localThemeScope, modifier, list, str, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(InterfaceC6028r0 interfaceC6028r0, Ki.C c10) {
        String strT = Reflection.b(c10.getClass()).t();
        if (strT == null) {
            strT = "";
        }
        interfaceC6028r0.a(new AnnotatedString(StringsKt.U0(strT, "AdsDrawables.", "", null, 4, null), null, 2, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(w wVar, LocalThemeScope localThemeScope, Ki.C c10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        wVar.v(localThemeScope, c10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void b(LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2033886541);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2033886541, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Controls (IconsShowcase.kt:484)");
            }
            boolean zBooleanValue = getState().b().getValue().booleanValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ri.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.p(this.f33342a, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            Mi.h.o(localThemeScope2, "Show Bounds", zBooleanValue, null, (Function1) objB, composerStartRestartGroup, (i11 & 14) | 48, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ri.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.q(this.f33343a, localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-521064214);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-521064214, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content (IconsShowcase.kt:50)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ri.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.n(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15432b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ri.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.o(this.f33339a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Icons";
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(final Ki.LocalThemeScope r34, androidx.compose.ui.Modifier r35, final java.util.List<? extends Ki.C> r36, java.lang.String r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ri.w.s(Ki.M, androidx.compose.ui.Modifier, java.util.List, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(final Ki.LocalThemeScope r24, final Ki.C r25, androidx.compose.ui.Modifier r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ri.w.v(Ki.M, Ki.C, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    @Override // Oi.c
    /* renamed from: w, reason: from getter */
    public l.IconsState getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(w wVar, boolean z10) {
        wVar.getState().b().setValue(Boolean.valueOf(z10));
        return Unit.f143329a;
    }
}
