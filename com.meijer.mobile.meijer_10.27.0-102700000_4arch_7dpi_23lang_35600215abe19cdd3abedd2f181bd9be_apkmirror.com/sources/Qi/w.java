package Qi;

import Ji.C;
import Ji.LocalThemeScope;
import Ji.Q;
import Ni.l;
import android.R;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.InterfaceC5886r0;
import androidx.compose.ui.text.AnnotatedString;
import j0.C14815g;
import java.util.Iterator;
import java.util.List;
import ji.InterfaceC14926b0;
import ji.a1;
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
import l0.C15342b;
import l0.InterfaceC15343c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tJ7\u0010\u0012\u001a\u00020\u0007*\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LQi/w;", "LNi/c;", "LNi/l$l;", "state", "<init>", "(LNi/l$l;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "Landroidx/compose/ui/Modifier;", "modifier", "", "LJi/C;", "iconList", "", "header", "s", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "iconDrawable", "v", "(LJi/M;LJi/C;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LNi/l$l;", "w", "()LNi/l$l;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class w implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.IconsState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30775a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30776b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.w$a$a, reason: collision with other inner class name */
        static final class C0699a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f30777a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30778b;

            C0699a(w wVar, LocalThemeScope localThemeScope) {
                this.f30777a = wVar;
                this.f30778b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(987397452, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:59)");
                }
                w wVar = this.f30777a;
                LocalThemeScope localThemeScope = this.f30778b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.a.C3832d.f15337e, C.a.C3833e.f15338e, C.a.x.f15365e, C.a.o.f15353e, C.a.t.f15360e, C.a.p.f15354e, C.a.F.f15325e, C.a.G.f15326e, C.a.A.f15319e, C.a.q.f15356e, C.a.y.f15366e, C.a.E.f15324e, C.a.C3840l.f15349e, C.a.H.f15327e, C.a.I.f15328e, C.a.J.f15329e, C.a.C3834f.f15340e), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.a.C3831b.f15335e, C.a.c.f15336e, C.a.M.f15332e, C.a.K.f15330e, C.a.L.f15331e, C.a.C0245a.f15333e, C.a.z.f15368e), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.a.u.f15361e, C.a.v.f15362e, C.a.w.f15363e, C.a.s.f15358e, C.a.r.f15357e), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.a.B.f15320e, C.a.C3839k.f15347e, C.a.D.f15323e, C.a.C3841m.f15350e, C.a.C3835g.f15341e, C.a.C3836h.f15343e, C.a.C3837i.f15345e, C.a.n.f15352e, C.a.C0244C.f15322e, C.a.C3838j.f15346e), null, composer, 384, 5);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, w wVar) {
            this.f30775a = localThemeScope;
            this.f30776b = wVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1706862079, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:55)");
            }
            Ri.b.b(this.f30775a, null, this.f30776b.d("Action"), "1.0", null, ComposableLambdaKt.c(987397452, true, new C0699a(this.f30776b, this.f30775a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30780b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f30781a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30782b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f30781a = wVar;
                this.f30782b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-180079869, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:125)");
                }
                w wVar = this.f30781a;
                LocalThemeScope localThemeScope = this.f30782b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.d.C0253d.f15415e, C.b.d.C0252b.f15413e, C.b.d.g.f15418e, C.b.d.k.f15423e, C.b.d.m.f15425e, C.b.d.a.f15412e, C.b.d.h.f15419e, C.b.d.c.f15414e, C.b.d.f.f15417e, C.b.d.j.f15422e, C.b.d.i.f15421e, C.b.d.l.f15424e, C.b.d.e.f15416e), "Meijer Items", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.a.C0246a.f15371e, C.b.a.g.f15379e, C.b.a.f.f15377e, C.b.a.h.f15380e, C.b.a.C0247b.f15372e, C.b.a.j.f15382e, C.b.a.d.f15375e, C.b.a.i.f15381e, C.b.a.c.f15374e, C.b.a.e.f15376e), "Account", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.h.k.f15474e, C.b.h.l.f15476e, C.b.h.e.f15467e, C.b.h.c.f15464e, C.b.h.n.f15479e, C.b.h.p.f15481e, C.b.h.f.f15468e, C.b.h.g.f15469e, C.b.h.d.f15466e, C.b.h.o.f15480e, C.b.h.j.f15473e, C.b.h.i.f15472e, C.b.h.m.f15478e, C.b.h.C0259b.f15462e, C.b.h.q.f15483e, C.b.h.r.f15484e, C.b.h.C0260h.f15471e, C.b.h.a.f15461e), "Tools", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.c.k.f15407e, C.b.c.h.f15404e, C.b.c.f.f15402e, C.b.c.i.f15405e, C.b.c.j.f15406e, C.b.c.g.f15403e, C.b.c.C0250b.f15398e, C.b.c.n.f15410e, C.b.c.m.f15409e, C.b.c.l.f15408e, C.b.c.a.f15396e, C.b.c.e.f15401e, C.b.c.d.f15400e, C.b.c.C0251c.f15399e), "Location", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.f.C0257f.f15446e, C.b.f.g.f15447e, C.b.f.a.f15440e, C.b.f.e.f15445e, C.b.f.i.f15449e, C.b.f.d.f15444e, C.b.f.j.f15450e, C.b.f.h.f15448e, C.b.f.C0256b.f15442e, C.b.f.c.f15443e), "Pharmacy", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.g.d.f15455e, C.b.g.a.f15452e, C.b.g.C0258b.f15453e, C.b.g.f.f15458e, C.b.g.e.f15457e, C.b.g.c.f15454e), "Reward", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.AbstractC0248b.a.f15384e, C.b.AbstractC0248b.C0249b.f15386e, C.b.AbstractC0248b.j.f15394e, C.b.AbstractC0248b.e.f15389e, C.b.AbstractC0248b.g.f15391e, C.b.AbstractC0248b.f.f15390e, C.b.AbstractC0248b.h.f15392e, C.b.AbstractC0248b.d.f15388e, C.b.AbstractC0248b.c.f15387e, C.b.AbstractC0248b.i.f15393e), "Item", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.i.h.f15493e, C.b.i.g.f15492e, C.b.i.f.f15491e, C.b.i.e.f15490e, C.b.i.d.f15489e, C.b.i.c.f15488e, C.b.i.C0261b.f15487e, C.b.i.a.f15486e), "Vehicle Types", composer, 3456, 1);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.b.e.i.f15437e, C.b.e.a.f15427e, C.b.e.C0254b.f15428e, C.b.e.c.f15429e, C.b.e.d.f15431e, C.b.e.f.f15434e, C.b.e.j.f15438e, C.b.e.g.f15435e, C.b.e.C0255e.f15433e, C.b.e.h.f15436e), "Miscellaneous", composer, 3456, 1);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope, w wVar) {
            this.f30779a = localThemeScope;
            this.f30780b = wVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-264307978, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:121)");
            }
            Ri.b.b(this.f30779a, null, this.f30780b.d("Application"), "1.0", null, ComposableLambdaKt.c(-180079869, true, new a(this.f30780b, this.f30779a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30784b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f30785a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30786b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f30785a = wVar;
                this.f30786b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1074702148, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:279)");
                }
                w wVar = this.f30785a;
                LocalThemeScope localThemeScope = this.f30786b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.f.a.f15504e, C.f.d.f15507e, C.f.i.f15513e, C.f.k.f15517e, C.f.C0263f.f15510e, C.f.g.f15511e, C.f.m.f15519e, C.f.o.f15522e), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.f.b.f15505e, C.f.e.f15509e, C.f.j.f15515e, C.f.l.f15518e, C.f.c.f15506e, C.f.h.f15512e, C.f.n.f15521e, C.f.p.f15524e), null, composer, 384, 5);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope, w wVar) {
            this.f30783a = localThemeScope;
            this.f30784b = wVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(990474039, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:275)");
            }
            Ri.b.b(this.f30783a, null, this.f30784b.d("Navigation"), "1.0", null, ComposableLambdaKt.c(1074702148, true, new a(this.f30784b, this.f30783a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30787a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30788b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f30789a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30790b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f30789a = wVar;
                this.f30790b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1965483131, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:313)");
                }
                w wVar = this.f30789a;
                LocalThemeScope localThemeScope = this.f30790b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.h.a.f15540d, C.h.b.f15541d, C.h.c.f15542d, C.h.e.f15544d, C.h.g.f15546d, C.h.d.f15543d, C.h.f.f15545d), null, composer, 384, 5);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(LocalThemeScope localThemeScope, w wVar) {
            this.f30787a = localThemeScope;
            this.f30788b = wVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2049711240, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:309)");
            }
            Ri.b.b(this.f30787a, null, this.f30788b.d("Social"), "1.0", null, ComposableLambdaKt.c(-1965483131, true, new a(this.f30788b, this.f30787a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30791a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30792b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f30793a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30794b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f30793a = wVar;
                this.f30794b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-710701114, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:334)");
                }
                w wVar = this.f30793a;
                LocalThemeScope localThemeScope = this.f30794b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.i.b.f15549d, C.i.e.f15552d, C.i.f.f15554d, C.i.C0265i.f15559d, C.i.h.f15557d, C.i.n.f15565d, C.i.l.f15563d, C.i.c.f15550d, C.i.j.f15561d, C.i.k.f15562d, C.i.m.f15564d), null, composer, 384, 5);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        e(LocalThemeScope localThemeScope, w wVar) {
            this.f30791a = localThemeScope;
            this.f30792b = wVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-794929223, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:330)");
            }
            Ri.b.b(this.f30791a, null, this.f30792b.d("Support"), "1.0", null, ComposableLambdaKt.c(-710701114, true, new a(this.f30792b, this.f30791a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30795a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30796b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f30797a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30798b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f30797a = wVar;
                this.f30798b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(544080903, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:359)");
                }
                w wVar = this.f30797a;
                LocalThemeScope localThemeScope = this.f30798b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.j.A.f15567d, C.j.y.f15600d, C.j.w.f15598d, C.j.B.f15568d, C.j.z.f15601d, C.j.x.f15599d), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.j.C0267j.f15584d, C.j.C3847g.f15581d, C.j.k.f15585d, C.j.h.f15582d, C.j.i.f15583d, C.j.F.f15572d, C.j.G.f15573d, C.j.s.f15594d, C.j.t.f15595d), null, composer, 384, 5);
                wVar.s(localThemeScope, null, CollectionsKt.p(C.j.C3844d.f15577d, C.j.c.f15576d, C.j.C3845e.f15578d, C.j.C3846f.f15579d, C.j.o.f15590d, C.j.p.f15591d, C.j.q.f15592d, C.j.r.f15593d, C.j.u.f15596d, C.j.v.f15597d, C.j.C3842a.f15574d, C.j.C3843b.f15575d, C.j.D.f15570d, C.j.C0266C.f15569d, C.j.l.f15586d, C.j.E.f15571d, C.j.n.f15589d, C.j.m.f15588d), null, composer, 384, 5);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        f(LocalThemeScope localThemeScope, w wVar) {
            this.f30795a = localThemeScope;
            this.f30796b = wVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(459852794, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:355)");
            }
            Ri.b.b(this.f30795a, null, this.f30796b.d("Toggle"), "1.0", null, ComposableLambdaKt.c(544080903, true, new a(this.f30796b, this.f30795a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30799a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30800b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f30801a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30802b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f30801a = wVar;
                this.f30802b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1798862920, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:414)");
                }
                w wVar = this.f30801a;
                LocalThemeScope localThemeScope = this.f30802b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.g.a.f15527e, C.g.b.f15528e, C.g.c.f15529e, C.g.d.f15530e, C.g.e.f15531e, C.g.f.f15532e, C.g.C0264g.f15534e, C.g.h.f15535e, C.g.i.f15536e, C.g.j.f15537e, C.g.k.f15538e), null, composer, 384, 5);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        g(LocalThemeScope localThemeScope, w wVar) {
            this.f30799a = localThemeScope;
            this.f30800b = wVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1714634811, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:410)");
            }
            Ri.b.b(this.f30799a, null, this.f30800b.d("Payment"), "1.0", null, ComposableLambdaKt.c(1798862920, true, new a(this.f30800b, this.f30799a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30803a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30804b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f30805a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30806b;

            a(w wVar, LocalThemeScope localThemeScope) {
                this.f30805a = wVar;
                this.f30806b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1241322359, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:439)");
                }
                w wVar = this.f30805a;
                LocalThemeScope localThemeScope = this.f30806b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                wVar.s(localThemeScope, null, CollectionsKt.p(C.e.a.f15497d, C.e.b.f15498d, C.e.C0262e.f15501d, C.e.c.f15499d, C.e.d.f15500d), null, composer, 384, 5);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        h(LocalThemeScope localThemeScope, w wVar) {
            this.f30803a = localThemeScope;
            this.f30804b = wVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1325550468, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:435)");
            }
            Ri.b.b(this.f30803a, null, this.f30804b.d("Brand logos"), "1.0", null, ComposableLambdaKt.c(-1241322359, true, new a(this.f30804b, this.f30803a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30808b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30809a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f30810b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.w$i$a$a, reason: collision with other inner class name */
            static final class C0700a implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30811a;

                C0700a(LocalThemeScope localThemeScope) {
                    this.f30811a = localThemeScope;
                }

                public final void a(InterfaceC14926b0 Assemble, Composer composer, int i10) {
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
                    Ci.j.i(this.f30811a, null, "The Custom Icons section is an example of using non-standard drawable resources with Acres components. These are not to be used in production code. AdsDrawables.Custom is a compatibility layer that should only be used for testing or with express approval of the UX team.", "Not general use", Assemble.getToastVariant().getWarning(), null, composer, 3072, 17);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
                    a(interfaceC14926b0, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, w wVar) {
                this.f30809a = localThemeScope;
                this.f30810b = wVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(13459658, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:458)");
                }
                LocalThemeScope localThemeScope = this.f30809a;
                w wVar = this.f30810b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                Q.e(localThemeScope, a1.f139760a, ComposableLambdaKt.c(1670810023, true, new C0700a(localThemeScope), composer, 54), composer, 432);
                wVar.s(localThemeScope, null, CollectionsKt.p(new C.Custom(R.drawable.ic_dialog_alert), new C.Custom(R.drawable.ic_delete), new C.Custom(R.drawable.ic_menu_share)), null, composer, 0, 5);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        i(LocalThemeScope localThemeScope, w wVar) {
            this.f30807a = localThemeScope;
            this.f30808b = wVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-70768451, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.Content.<anonymous>.<anonymous>.<anonymous> (IconsShowcase.kt:454)");
            }
            Ri.b.b(this.f30807a, null, this.f30808b.d("Custom"), "1.2", null, ComposableLambdaKt.c(13459658, true, new a(this.f30807a, this.f30808b), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Ji.C> f30812a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f30813b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30814c;

        /* JADX WARN: Multi-variable type inference failed */
        j(List<? extends Ji.C> list, w wVar, LocalThemeScope localThemeScope) {
            this.f30812a = list;
            this.f30813b = wVar;
            this.f30814c = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(841378050, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.IconsShowcase.IconGrid.<anonymous>.<anonymous> (IconsShowcase.kt:505)");
            }
            List<Ji.C> list = this.f30812a;
            w wVar = this.f30813b;
            LocalThemeScope localThemeScope = this.f30814c;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                wVar.v(localThemeScope, (Ji.C) it.next(), null, composer, 0, 2);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(w wVar, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        wVar.a(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(w wVar, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        wVar.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(w wVar, LocalThemeScope localThemeScope, Modifier modifier, List list, String str, int i10, int i11, Composer composer, int i12) {
        wVar.s(localThemeScope, modifier, list, str, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(InterfaceC5886r0 interfaceC5886r0, Ji.C c10) {
        String strT = Reflection.b(c10.getClass()).t();
        if (strT == null) {
            strT = "";
        }
        interfaceC5886r0.a(new AnnotatedString(StringsKt.T0(strT, "AdsDrawables.", "", null, 4, null), null, 2, null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(w wVar, LocalThemeScope localThemeScope, Ji.C c10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        wVar.v(localThemeScope, c10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = new Function1() { // from class: Qi.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.n(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.o(this.f30752a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = new Function1() { // from class: Qi.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.p(this.f30755a, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            Li.h.o(localThemeScope2, "Show Bounds", zBooleanValue, null, (Function1) objB, composerStartRestartGroup, (i11 & 14) | 48, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.q(this.f30756a, localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
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
    public final void s(final Ji.LocalThemeScope r34, androidx.compose.ui.Modifier r35, final java.util.List<? extends Ji.C> r36, java.lang.String r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qi.w.s(Ji.M, androidx.compose.ui.Modifier, java.util.List, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
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
    public final void v(final Ji.LocalThemeScope r24, final Ji.C r25, androidx.compose.ui.Modifier r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qi.w.v(Ji.M, Ji.C, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    @Override // Ni.c
    /* renamed from: w, reason: from getter */
    public l.IconsState getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(w wVar, boolean z10) {
        wVar.getState().b().setValue(Boolean.valueOf(z10));
        return Unit.f142422a;
    }
}
