package mn;

import H1.w;
import Ki.LocalThemeScope;
import P0.e;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
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
import androidx.compose.ui.text.TextStyle;
import d0.BorderStroke;
import d0.C13575i;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import java.util.List;
import kotlin.C18045v;
import kotlin.C18049x;
import kotlin.C18054z0;
import kotlin.FontWeight;
import kotlin.InterfaceC18043u;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;
import p1.C16332a;
import p1.C16335d;
import r0.C16806i;
import r0.RoundedCornerShape;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001ak\u0010\u0010\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u000326\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u001d\u0010\u0015\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0013\"\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LKi/M;", "Lmn/l;", "complexPromo", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "", "isExpanded", "", "onStackedPromoClicked", "Lkotlin/Function0;", "onCloseSheetClicked", "i", "(LKi/M;Lmn/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "p", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "r", "m", "", "Lmn/n;", "a", "Ljava/util/List;", "u", "()Ljava/util/List;", "mockedStackedPromos", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final List<StackedPromo> f151174a = CollectionsKt.p(new StackedPromo("2 for $5, When You Buy 2+", "When you buy two 16 oz containers of any Ben & Jerry’s ice cream.", 0, false, 8, null), new StackedPromo("Buy 3, Get 1 Free ", "when you buy three 16oz Ben & Jerry’s, get the fourth one for free.", 1, false, 8, null), new StackedPromo("Buy 5, Get 1 Free ", "when you buy five 16oz apples, get the fifth one for free.", 2, false, 8, null));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Integer, Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Integer, Boolean, Unit> f151175a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Integer, ? super Boolean, Unit> function2) {
            this.f151175a = function2;
        }

        public final void a(int i10, boolean z10) {
            this.f151175a.invoke(Integer.valueOf(i10), Boolean.valueOf(z10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
            a(num.intValue(), bool.booleanValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f151176f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(1);
            this.f151176f = list;
        }

        public final Object a(int i10) {
            this.f151176f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f151177f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151178g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ MockedPromo f151179h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2 f151180i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, LocalThemeScope localThemeScope, MockedPromo mockedPromo, Function2 function2) {
            super(4);
            this.f151177f = list;
            this.f151178g = localThemeScope;
            this.f151179h = mockedPromo;
            this.f151180i = function2;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            int i13 = i12 & 126;
            StackedPromo stackedPromo = (StackedPromo) this.f151177f.get(i10);
            composer.startReplaceGroup(1147317369);
            LocalThemeScope localThemeScope = this.f151178g;
            boolean z10 = i10 < this.f151179h.b().size() - 1;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f151180i);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(this.f151180i);
                composer.t(objB);
            }
            composer.P();
            r.c(localThemeScope, z10, i10, stackedPromo, (Function2) objB, composer, LocalThemeScope.f17314g | ((i13 << 3) & 896));
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final d f151181f = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Integer num) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f151182f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f151183g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, List list) {
            super(1);
            this.f151182f = function1;
            this.f151183g = list;
        }

        public final Object a(int i10) {
            return this.f151182f.invoke(this.f151183g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f151184f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151185g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, LocalThemeScope localThemeScope) {
            super(4);
            this.f151184f = list;
            this.f151185g = localThemeScope;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ((Number) this.f151184f.get(i10)).intValue();
            composer.startReplaceGroup(626243545);
            i.p(this.f151185g, null, composer, LocalThemeScope.f17314g, 1);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151186a;

        g(LocalThemeScope localThemeScope) {
            this.f151186a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-599517193, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.AppliedSavingsItem.<anonymous> (AppliedSavingsBottomSheet.kt:134)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierK = D.k(J.h(companion, 0.0f, 1, null), H1.h.p(f10), 0.0f, 2, null);
            LocalThemeScope localThemeScope = this.f151186a;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            MeasurePolicy measurePolicyB = G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            Z0.c cVarC = C16335d.c(Cj.i.f4726O1, composer, 0);
            C5489q0.Companion companion4 = C5489q0.INSTANCE;
            long j10 = companion4.j();
            float f11 = 100;
            Modifier modifierZ = J.z(J.i(companion, H1.h.p(f11)), H1.h.p(f11));
            float f12 = 8;
            C18054z0.a(cVarC, null, D.m(modifierZ, H1.h.p(f12), H1.h.p(f10), H1.h.p(0), 0.0f, 8, null), j10, composer, 3504, 0);
            i.r(localThemeScope, null, composer, LocalThemeScope.f17314g, 1);
            composer.v();
            C14890K.a(J.i(companion, H1.h.p(f12)), composer, 6);
            MeasurePolicy measurePolicyB2 = G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            long jA = C16332a.a(Cj.g.f4675q, composer, 0);
            TextStyle h62 = Fj.c.a().getH6();
            FontWeight.Companion companion5 = FontWeight.INSTANCE;
            N1.b("$2.50", null, jA, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.c(h62, 0L, w.i(20), companion5.j(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.i(24), null, null, null, 0, 0, null, 16646137, null), composer, 6, 0, 65530);
            float f13 = 2;
            N1.b("$4.09", D.m(companion, H1.h.p(f13), H1.h.p(4), 0.0f, 0.0f, 12, null), companion4.a(), 0L, null, null, null, 0L, F1.k.INSTANCE.b(), null, 0L, 0, false, 0, 0, null, TextStyle.c(Fj.c.a().getH6(), 0L, w.i(14), companion5.h(), null, null, null, null, w.g(0.16d), null, null, null, 0L, null, null, null, 0, 0, w.i(18), null, null, null, 0, 0, null, 16646009, null), composer, 100663686, 0, 65272);
            composer.v();
            N1.b("Lay's Wavy Potato", null, companion4.a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.c(Fj.c.a().getH6(), 0L, w.i(14), companion5.i(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.i(24), null, null, null, 0, 0, null, 16646137, null), composer, 390, 0, 65530);
            N1.b("Chips Original, 7.75oz", null, companion4.a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.c(Fj.c.a().getH6(), 0L, w.i(14), companion5.i(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, w.i(24), null, null, null, 0, 0, null, 16646137, null), composer, 390, 0, 65530);
            C14890K.a(J.i(companion, H1.h.p(f12)), composer, 6);
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB3 = G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA4 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierH);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyB3, companion3.e());
            D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            float f14 = 14;
            C18054z0.a(C16335d.c(Cj.i.f4802k1, composer, 0), null, J.z(J.i(companion, H1.h.p(f14)), H1.h.p(f14)), companion4.h(), composer, 3504, 0);
            N1.b("2 for $5, When You Buy 2+", D.m(companion, H1.h.p(f13), 0.0f, 0.0f, 0.0f, 14, null), C16332a.a(Cj.g.f4675q, composer, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.c(Fj.c.a().getH6(), 0L, w.i(12), companion5.j(), null, null, null, null, w.g(0.16d), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777081, null), composer, 54, 0, 65528);
            composer.v();
            C14890K.a(J.i(companion, H1.h.p(f10)), composer, 6);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r78, final mn.MockedPromo r79, androidx.compose.ui.Modifier r80, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> r81, final kotlin.jvm.functions.Function0<kotlin.Unit> r82, androidx.compose.runtime.Composer r83, final int r84, final int r85) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.i.i(Ki.M, mn.l, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(MockedPromo mockedPromo, LocalThemeScope localThemeScope, Function2 function2, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        List<StackedPromo> listB = mockedPromo.b();
        LazyColumn.i(listB.size(), null, new b(listB), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new c(listB, localThemeScope, mockedPromo, function2)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, MockedPromo mockedPromo, Modifier modifier, Function2 function2, Function0 function0, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, mockedPromo, modifier, function2, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m(final Ki.LocalThemeScope r98, androidx.compose.ui.Modifier r99, androidx.compose.runtime.Composer r100, final int r101, final int r102) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.i.m(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List listP = CollectionsKt.p(1, 2, 3, 4, 5, 6, 7);
        LazyRow.i(listP.size(), null, new e(d.f151181f, listP), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(listP, localThemeScope)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            r0 = r16
            r1 = r19
            r2 = r20
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r0, r3)
            r3 = -1988423852(0xffffffff897b0f54, float:-3.0220233E-33)
            r4 = r18
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r3)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r2
            r5 = 4
            if (r4 == 0) goto L1d
            r4 = r1 | 6
            goto L36
        L1d:
            r4 = r1 & 6
            if (r4 != 0) goto L35
            r4 = r1 & 8
            if (r4 != 0) goto L2a
            boolean r4 = r13.V(r0)
            goto L2e
        L2a:
            boolean r4 = r13.D(r0)
        L2e:
            if (r4 == 0) goto L32
            r4 = r5
            goto L33
        L32:
            r4 = 2
        L33:
            r4 = r4 | r1
            goto L36
        L35:
            r4 = r1
        L36:
            r6 = r2 & 1
            if (r6 == 0) goto L3f
            r4 = r4 | 48
        L3c:
            r7 = r17
            goto L51
        L3f:
            r7 = r1 & 48
            if (r7 != 0) goto L3c
            r7 = r17
            boolean r8 = r13.V(r7)
            if (r8 == 0) goto L4e
            r8 = 32
            goto L50
        L4e:
            r8 = 16
        L50:
            r4 = r4 | r8
        L51:
            r8 = r4 & 19
            r9 = 18
            if (r8 != r9) goto L63
            boolean r8 = r13.j()
            if (r8 != 0) goto L5e
            goto L63
        L5e:
            r13.K()
            r3 = r7
            goto Lb3
        L63:
            if (r6 == 0) goto L68
            androidx.compose.ui.Modifier$a r6 = androidx.compose.ui.Modifier.INSTANCE
            goto L69
        L68:
            r6 = r7
        L69:
            boolean r7 = androidx.compose.runtime.ComposerKt.M()
            if (r7 == 0) goto L75
            r7 = -1
            java.lang.String r8 = "com.meijer.mobile.meijer.activity.orders.screens.AppliedSavingsItem (AppliedSavingsBottomSheet.kt:127)"
            androidx.compose.runtime.ComposerKt.U(r3, r4, r7, r8)
        L75:
            r3 = 0
            r4 = 0
            r7 = 1
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.J.h(r6, r3, r7, r4)
            float r3 = (float) r5
            float r5 = H1.h.p(r3)
            r0.h r5 = r0.C16806i.c(r5)
            V0.q0$a r8 = V0.C5489q0.INSTANCE
            long r8 = r8.k()
            float r11 = H1.h.p(r3)
            mn.i$g r3 = new mn.i$g
            r3.<init>(r0)
            r10 = 54
            r12 = -599517193(0xffffffffdc4417f7, float:-2.2078178E17)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r12, r7, r3, r13, r10)
            r14 = 1769856(0x1b0180, float:2.480096E-39)
            r15 = 24
            r3 = r6
            r6 = r8
            r8 = 0
            r10 = 0
            kotlin.C18051y.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r4 = androidx.compose.runtime.ComposerKt.M()
            if (r4 == 0) goto Lb3
            androidx.compose.runtime.ComposerKt.T()
        Lb3:
            androidx.compose.runtime.T0 r4 = r13.l()
            if (r4 == 0) goto Lc1
            mn.f r5 = new mn.f
            r5.<init>()
            r4.a(r5)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.i.p(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void r(final LocalThemeScope localThemeScope, Modifier modifier, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1398668657);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 48;
            modifier2 = modifier;
        } else if ((i10 & 48) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.V(modifier2) ? 32 : 16) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i12 & 17) == 16 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(-1398668657, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.AppliedSavingsItemCount (AppliedSavingsBottomSheet.kt:223)");
            }
            float f10 = 0;
            Modifier modifierI = D.i(modifier4, H1.h.p(f10));
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            C14890K.a(J.i(companion2, H1.h.p(78)), composerStartRestartGroup, 6);
            Modifier modifierI2 = D.i(J.v(companion2, H1.h.p(32)), H1.h.p(f10));
            RoundedCornerShape roundedCornerShapeF = C16806i.f();
            BorderStroke borderStrokeA = C13575i.a(H1.h.p(1), C16332a.a(Cj.g.f4665g, composerStartRestartGroup, 0));
            InterfaceC14882C interfaceC14882CA = D.a(H1.h.p(f10));
            InterfaceC18043u interfaceC18043uH = C18045v.f169801a.h(0L, C5489q0.INSTANCE.a(), 0L, composerStartRestartGroup, (C18045v.f169812l << 9) | 48, 5);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: mn.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i.s();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            modifier3 = modifier4;
            C18049x.c((Function0) objB, modifierI2, false, null, null, roundedCornerShapeF, borderStrokeA, interfaceC18043uH, interfaceC14882CA, j.f151187a.a(), composerStartRestartGroup, 905970102, 24);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mn.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.t(localThemeScope, modifier3, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final List<StackedPromo> u() {
        return f151174a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
