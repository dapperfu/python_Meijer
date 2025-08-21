package os;

import F1.j;
import F1.t;
import Ki.C;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import c5.C6484c;
import co.ClaimReward;
import j0.C14890K;
import j0.C14903g;
import ki.InterfaceC15154X;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import oi.C16192r0;
import oi.C16198u0;
import oi.P0;
import p1.C16338g;
import qi.C16671b;
import r1.C16819m;
import yr.C18370z;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aº\u0001\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\n2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u000b0\n2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0088\u0001\u0010\u0018\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006 ²\u0006\u000e\u0010\u001d\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lco/c;", "reward", "", "pointBalance", "", "isSelected", "index", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "updateSelectedItem", "", "Lkotlin/ParameterName;", "name", "rewardId", "onClaimRewardClicked", "onRewardClicked", "onClaimForButtonClicked", "p", "(LKi/M;Lco/c;IZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "updateSelectedIndex", "onClaimButtonClicked", "i", "(LKi/M;Lco/c;IIZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "w", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "u", "isClaimButtonClicked", "", "lastAction", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class S {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ClaimReward f155587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f155588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f155589d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f155590e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f155591f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f155592g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<ClaimReward, Unit> f155593h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f155594i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: os.S$a$a, reason: collision with other inner class name */
        static final class C2409a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C2409a f155595a = new C2409a();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }

            C2409a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f155596a = new b();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }

            b() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f155597a;

            c(L1.h hVar) {
                this.f155597a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f155597a.getBottom(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f155598a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f155599b;

            d(L1.h hVar, L1.h hVar2) {
                this.f155598a = hVar;
                this.f155599b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f155598a.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), this.f155599b.getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f155600a;

            e(L1.h hVar) {
                this.f155600a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f155600a.getBottom(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class f implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f155601a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f155602b;

            f(L1.h hVar, L1.h hVar2) {
                this.f155601a = hVar;
                this.f155602b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f155601a.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), this.f155602b.getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class g implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f155603a;

            g(L1.h hVar) {
                this.f155603a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f155603a.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class h implements Function1<Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<ClaimReward, Unit> f155604a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ClaimReward f155605b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f155606c;

            /* JADX WARN: Multi-variable type inference failed */
            h(Function1<? super ClaimReward, Unit> function1, ClaimReward claimReward, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f155604a = function1;
                this.f155605b = claimReward;
                this.f155606c = interfaceC5872l0;
            }

            public final void a(boolean z10) {
                S.r(this.f155606c, z10);
                this.f155604a.invoke(this.f155605b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                a(bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class i implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f155607a;

            i(L1.h hVar) {
                this.f155607a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f155607a.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class j extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f155608f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(L1.A a10) {
                super(1);
                this.f155608f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f155608f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f155609f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f155610g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f155611h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ ClaimReward f155612i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155613j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ boolean f155614k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f155615l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f155616m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f155617n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function1 f155618o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Function1 f155619p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0 f155620q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(L1.n nVar, int i10, Function0 function0, ClaimReward claimReward, LocalThemeScope localThemeScope, boolean z10, int i11, int i12, Function1 function1, Function1 function12, Function1 function13, InterfaceC5872l0 interfaceC5872l0) {
                super(2);
                this.f155610g = nVar;
                this.f155611h = function0;
                this.f155612i = claimReward;
                this.f155613j = localThemeScope;
                this.f155614k = z10;
                this.f155615l = i11;
                this.f155616m = i12;
                this.f155617n = function1;
                this.f155618o = function12;
                this.f155619p = function13;
                this.f155620q = interfaceC5872l0;
                this.f155609f = i10;
            }

            public final void a(Composer composer, int i10) throws Resources.NotFoundException {
                Modifier.Companion companion;
                L1.h hVar;
                Object obj;
                float f10;
                int i11;
                L1.h hVar2;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f155610g.getHelpersHashCode();
                this.f155610g.i();
                L1.n nVar = this.f155610g;
                composer.startReplaceGroup(-146351539);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                L1.h hVarF = bVarM.f();
                C15669h c15669hC = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(this.f155612i.getImageUrl()).c();
                P0.e eVarE = P0.e.INSTANCE.e();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierV = androidx.compose.foundation.layout.J.v(companion2, H1.h.p(84));
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objB == companion3.a()) {
                    objB = C2409a.f155595a;
                    composer.t(objB);
                }
                composer.P();
                C6484c.e(c15669hC, null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), nVar.k(modifierV, hVarA, (Function1) objB), null, null, eVarE, InterfaceC5926k.INSTANCE.d(), 0.0f, null, 0, false, null, composer, 14155824, 0, 7984);
                Composer composer2 = composer;
                LocalThemeScope localThemeScope = this.f155613j;
                C.i.h hVar3 = C.i.h.f17101d;
                composer2.startReplaceGroup(1849434622);
                Object objB2 = composer2.B();
                if (objB2 == companion3.a()) {
                    objB2 = b.f155596a;
                    composer2.t(objB2);
                }
                composer2.P();
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(hVar3, null, null, null, 0.0f, null, nVar.k(companion2, hVarC, (Function1) objB2), 62, null);
                int i12 = LocalThemeScope.f17314g;
                C16671b.b(localThemeScope, drawableIcon, null, null, composer2, i12 | (q1.h.DrawableIcon.f142322h << 3), 6);
                if (S.q(this.f155620q) && this.f155614k) {
                    composer2.startReplaceGroup(-145300764);
                    LocalThemeScope localThemeScope2 = this.f155613j;
                    q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f155613j.getAdsTypography().getValues().getTwo(), null, 383, null);
                    companion = companion2;
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, this.f155613j.getAdsSpacing().getFour().getDp(), 0.0f, this.f155613j.getAdsSpacing().getThree().getDp(), 5, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zV = composer2.V(hVarA);
                    Object objB3 = composer2.B();
                    if (zV || objB3 == companion3.a()) {
                        objB3 = new c(hVarA);
                        composer2.t(objB3);
                    }
                    composer2.P();
                    Modifier modifierK = nVar.k(modifierM, hVarD, (Function1) objB3);
                    j.Companion companion4 = F1.j.INSTANCE;
                    F1.j jVarH = F1.j.h(companion4.a());
                    t.Companion companion5 = F1.t.INSTANCE;
                    q1.Label labelY = q1.Label.y(label, modifierK, null, null, jVarH, companion5.b(), false, 0, null, null, 486, null);
                    String strC = C16338g.c(ns.u.f153166b0, composer2, 0);
                    int i13 = q1.Label.f142335j;
                    si.j.h(localThemeScope2, labelY, strC, null, composer2, (i13 << 3) | i12, 4);
                    LocalThemeScope localThemeScope3 = this.f155613j;
                    Ki.I two = localThemeScope3.getAdsTypography().getBody().getTwo();
                    Modifier modifierB = androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, this.f155613j.getAdsSpacing().getFive().getDp(), 7, null), 0.0f, H1.h.p(60), 1, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV2 = composer2.V(hVarD) | composer2.V(hVarF);
                    Object objB4 = composer2.B();
                    if (zV2 || objB4 == companion3.a()) {
                        objB4 = new d(hVarD, hVarF);
                        composer2.t(objB4);
                    }
                    composer2.P();
                    hVar2 = hVarE;
                    si.j.h(localThemeScope3, new q1.Label(nVar.k(modifierB, hVar2, (Function1) objB4), null, null, F1.j.h(companion4.a()), companion5.b(), false, 0, two, null, 358, null), C16338g.c(ns.u.f153157U, composer2, 0), null, composer2, (i13 << 3) | i12, 4);
                    composer2.P();
                    f10 = 0.0f;
                    obj = null;
                    hVar = hVarF;
                    i11 = 1;
                } else {
                    companion = companion2;
                    composer2.startReplaceGroup(-143625369);
                    LocalThemeScope localThemeScope4 = this.f155613j;
                    q1.Label label2 = new q1.Label(null, null, null, null, 0, false, 0, this.f155613j.getAdsTypography().getValues().getTwo(), null, 383, null);
                    hVar = hVarF;
                    Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, 0.0f, this.f155613j.getAdsSpacing().getFour().getDp(), 0.0f, this.f155613j.getAdsSpacing().getThree().getDp(), 5, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zV3 = composer2.V(hVarA);
                    Object objB5 = composer2.B();
                    if (zV3 || objB5 == companion3.a()) {
                        objB5 = new e(hVarA);
                        composer2.t(objB5);
                    }
                    composer2.P();
                    Modifier modifierK2 = nVar.k(modifierM2, hVarD, (Function1) objB5);
                    j.Companion companion6 = F1.j.INSTANCE;
                    F1.j jVarH2 = F1.j.h(companion6.a());
                    t.Companion companion7 = F1.t.INSTANCE;
                    q1.Label labelY2 = q1.Label.y(label2, modifierK2, null, null, jVarH2, companion7.b(), false, 0, null, null, 486, null);
                    String name = this.f155612i.getName();
                    if (name == null) {
                        name = "";
                    }
                    int i14 = q1.Label.f142335j;
                    si.j.h(localThemeScope4, labelY2, name, null, composer2, (i14 << 3) | i12, 4);
                    LocalThemeScope localThemeScope5 = this.f155613j;
                    q1.Label label3 = new q1.Label(null, null, null, null, 0, false, 0, this.f155613j.getAdsTypography().getBody().getTwo(), null, 383, null);
                    obj = null;
                    Modifier modifierB2 = androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, this.f155613j.getAdsSpacing().getSix().getDp(), 7, null), 0.0f, H1.h.p(60), 1, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV4 = composer2.V(hVarD) | composer2.V(hVar);
                    Object objB6 = composer2.B();
                    if (zV4 || objB6 == companion3.a()) {
                        objB6 = new f(hVarD, hVar);
                        composer2.t(objB6);
                    }
                    composer2.P();
                    f10 = 0.0f;
                    i11 = 1;
                    hVar2 = hVarE;
                    si.j.h(localThemeScope5, q1.Label.y(label3, nVar.k(modifierB2, hVarE, (Function1) objB6), null, null, F1.j.h(companion6.a()), companion7.b(), false, 0, null, null, 486, null), String.valueOf(this.f155612i.getDescription()), null, composer2, (i14 << 3) | i12, 4);
                    composer2.P();
                }
                if (this.f155612i.getIsClaimed()) {
                    composer2.startReplaceGroup(-141138115);
                    LocalThemeScope localThemeScope6 = this.f155613j;
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, f10, i11, obj);
                    composer2.startReplaceGroup(5004770);
                    boolean zV5 = composer2.V(hVar2);
                    Object objB7 = composer2.B();
                    if (zV5 || objB7 == companion3.a()) {
                        objB7 = new i(hVar2);
                        composer2.t(objB7);
                    }
                    composer2.P();
                    S.w(localThemeScope6, nVar.k(modifierH, hVar, (Function1) objB7), composer2, i12, 0);
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(-142007355);
                    composer2.startReplaceGroup(5004770);
                    boolean zV6 = composer2.V(hVar2);
                    Object objB8 = composer2.B();
                    if (zV6 || objB8 == companion3.a()) {
                        objB8 = new g(hVar2);
                        composer2.t(objB8);
                    }
                    composer2.P();
                    Modifier modifierK3 = nVar.k(companion, hVar, (Function1) objB8);
                    LocalThemeScope localThemeScope7 = this.f155613j;
                    ClaimReward claimReward = this.f155612i;
                    int i15 = this.f155615l;
                    int i16 = this.f155616m;
                    boolean z10 = this.f155614k;
                    Function1 function1 = this.f155617n;
                    Function1 function12 = this.f155618o;
                    composer2.startReplaceGroup(-1746271574);
                    boolean zV7 = composer2.V(this.f155619p) | composer2.D(this.f155612i);
                    Object objB9 = composer2.B();
                    if (zV7 || objB9 == companion3.a()) {
                        objB9 = new h(this.f155619p, this.f155612i, this.f155620q);
                        composer2.t(objB9);
                    }
                    composer2.P();
                    S.i(localThemeScope7, claimReward, i15, i16, z10, modifierK3, function1, function12, (Function1) objB9, composer, i12, 0);
                    composer2 = composer;
                    composer2.P();
                }
                composer2.P();
                if (this.f155610g.getHelpersHashCode() != helpersHashCode) {
                    this.f155611h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, ClaimReward claimReward, boolean z10, int i10, int i11, Function1<? super Integer, Unit> function1, Function1<? super Long, Unit> function12, Function1<? super ClaimReward, Unit> function13, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f155586a = localThemeScope;
            this.f155587b = claimReward;
            this.f155588c = z10;
            this.f155589d = i10;
            this.f155590e = i11;
            this.f155591f = function1;
            this.f155592g = function12;
            this.f155593h = function13;
            this.f155594i = interfaceC5872l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1148035614, i10, -1, "com.meijer.mobile.ui.mperks.homescreen.ClaimRewardItem.<anonymous> (HomeScreenRedeemRewardsCard.kt:98)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f155586a.getAdsSpacing().getThree().getDp());
            ClaimReward claimReward = this.f155587b;
            LocalThemeScope localThemeScope = this.f155586a;
            boolean z10 = this.f155588c;
            int i11 = this.f155589d;
            int i12 = this.f155590e;
            Function1<Integer, Unit> function1 = this.f155591f;
            Function1<Long, Unit> function12 = this.f155592g;
            Function1<ClaimReward, Unit> function13 = this.f155593h;
            InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f155594i;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierI, false, new j(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new k(nVar, 0, pairH.b(), claimReward, localThemeScope, z10, i11, i12, function1, function12, function13, interfaceC5872l0)), pairH.a(), composer, 48, 0);
            composer.U();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f155621a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155622b;

        b(Modifier modifier, LocalThemeScope localThemeScope) {
            this.f155621a = modifier;
            this.f155622b = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1342977886, i10, -1, "com.meijer.mobile.ui.mperks.homescreen.ClaimRewardLoading.<anonymous>.<anonymous> (HomeScreenRedeemRewardsCard.kt:326)");
            }
            q1.k.Small smallLoading = Assemble.getLoading().getSmallLoading();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.f(this.f155622b, androidx.compose.foundation.layout.J.F(this.f155621a, null, false, 3, null), smallLoading, oVar, null, false, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Small.f142357f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void i(final LocalThemeScope localThemeScope, final ClaimReward reward, final int i10, int i11, final boolean z10, Modifier modifier, Function1<? super Integer, Unit> updateSelectedIndex, final Function1<? super Long, Unit> onClaimRewardClicked, final Function1<? super Boolean, Unit> onClaimButtonClicked, Composer composer, final int i12, final int i13) throws Resources.NotFoundException {
        int i14;
        Modifier modifier2;
        final Function1<? super Integer, Unit> function1;
        final Modifier modifier3;
        final int i15 = i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(reward, "reward");
        Intrinsics.j(updateSelectedIndex, "updateSelectedIndex");
        Intrinsics.j(onClaimRewardClicked, "onClaimRewardClicked");
        Intrinsics.j(onClaimButtonClicked, "onClaimButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-919206588);
        if ((Integer.MIN_VALUE & i13) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = ((i12 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 1) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= composerStartRestartGroup.D(reward) ? 32 : 16;
        }
        if ((i13 & 2) != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            i14 |= composerStartRestartGroup.d(i10) ? 256 : 128;
        }
        if ((i13 & 4) != 0) {
            i14 |= 3072;
        } else if ((i12 & 3072) == 0) {
            i14 |= composerStartRestartGroup.d(i15) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i13 & 8) != 0) {
            i14 |= 24576;
        } else if ((i12 & 24576) == 0) {
            i14 |= composerStartRestartGroup.a(z10) ? 16384 : 8192;
        }
        int i16 = i13 & 16;
        if (i16 != 0) {
            i14 |= 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i12 & 196608) == 0) {
                i14 |= composerStartRestartGroup.V(modifier2) ? 131072 : 65536;
            }
        }
        if ((i13 & 32) != 0) {
            i14 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            i14 |= composerStartRestartGroup.D(updateSelectedIndex) ? 1048576 : 524288;
        }
        if ((i13 & 64) != 0) {
            i14 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            i14 |= composerStartRestartGroup.D(onClaimRewardClicked) ? 8388608 : 4194304;
        }
        if ((i13 & 128) != 0) {
            i14 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            i14 |= composerStartRestartGroup.D(onClaimButtonClicked) ? 67108864 : 33554432;
        }
        if ((38347923 & i14) == 38347922 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            function1 = updateSelectedIndex;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i16 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(-919206588, i14, -1, "com.meijer.mobile.ui.mperks.homescreen.ClaimButton (HomeScreenRedeemRewardsCard.kt:239)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composerStartRestartGroup.P();
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier4);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            Modifier modifier5 = modifier4;
            if (n(interfaceC5872l0) && z10) {
                composerStartRestartGroup.startReplaceGroup(-1717266982);
                C16198u0 c16198u0 = C16198u0.f154260a;
                boolean z11 = reward.getPointCost() <= i10;
                String strD = C16338g.d(ns.u.f153181j, new Object[]{String.valueOf(reward.getPointCost())}, composerStartRestartGroup, 0);
                Modifier modifierF = C18370z.f(androidx.compose.foundation.layout.J.h(companion3, 0.0f, 1, null), "claim_button", null, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i17 = i14 & 234881024;
                boolean zD = (i17 == 67108864) | ((i14 & 29360128) == 8388608) | composerStartRestartGroup.D(reward);
                Object objB2 = composerStartRestartGroup.B();
                if (zD || objB2 == companion.a()) {
                    objB2 = new Function0() { // from class: os.M
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return S.j(onClaimButtonClicked, onClaimRewardClicked, reward, interfaceC5872l0);
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                int i18 = LocalThemeScope.f17314g;
                int i19 = i14 & 14;
                P0.k(localThemeScope, c16198u0, strD, (Function0) objB2, modifierF, null, false, 0L, z11, composerStartRestartGroup, i18 | i19 | (C16198u0.f154261b << 3), 112);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion3, localThemeScope.getAdsSpacing().getTwo().getDp()), composerStartRestartGroup, 0);
                C16192r0 c16192r0 = C16192r0.f154244a;
                boolean z12 = reward.getPointCost() <= i10;
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion3, 0.0f, 1, null);
                String strC = C16338g.c(ns.u.f153163a, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z13 = i17 == 67108864;
                Object objB3 = composerStartRestartGroup.B();
                if (z13 || objB3 == companion.a()) {
                    objB3 = new Function0() { // from class: os.N
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return S.k(onClaimButtonClicked, interfaceC5872l0);
                        }
                    };
                    composerStartRestartGroup.t(objB3);
                }
                composerStartRestartGroup.P();
                P0.k(localThemeScope, c16192r0, strC, (Function0) objB3, modifierH, null, false, 0L, z12, composerStartRestartGroup, i18 | 24576 | i19 | (C16192r0.f154245b << 3), 112);
                composerStartRestartGroup.P();
                i15 = i11;
                function1 = updateSelectedIndex;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1716039258);
                if (reward.getIsLoading()) {
                    composerStartRestartGroup.startReplaceGroup(-1716030144);
                    u(localThemeScope, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i14 & 14), 1);
                    composerStartRestartGroup.P();
                    i15 = i11;
                    function1 = updateSelectedIndex;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1715949234);
                    C16198u0 c16198u02 = C16198u0.f154260a;
                    Modifier modifierF2 = C18370z.f(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.b(companion3, H1.h.p(1), 0.0f, 2, null), 0.0f, 1, null), "claim_button", null, 2, null);
                    String strD2 = C16338g.d(ns.u.f153175g, new Object[]{Integer.valueOf(reward.getPointCost())}, composerStartRestartGroup, 0);
                    boolean z14 = reward.getPointCost() <= i10;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean z15 = ((i14 & 234881024) == 67108864) | ((3670016 & i14) == 1048576) | ((i14 & 7168) == 2048);
                    Object objB4 = composerStartRestartGroup.B();
                    if (z15 || objB4 == companion.a()) {
                        i15 = i11;
                        function1 = updateSelectedIndex;
                        objB4 = new Function0() { // from class: os.O
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return S.l(onClaimButtonClicked, function1, i15, interfaceC5872l0);
                            }
                        };
                        composerStartRestartGroup.t(objB4);
                    } else {
                        i15 = i11;
                        function1 = updateSelectedIndex;
                    }
                    composerStartRestartGroup.P();
                    P0.k(localThemeScope, c16198u02, strD2, (Function0) objB4, modifierF2, null, false, 0L, z14, composerStartRestartGroup, LocalThemeScope.f17314g | (i14 & 14) | (C16198u0.f154261b << 3), 112);
                    composerStartRestartGroup.P();
                }
                composerStartRestartGroup.P();
            }
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier5;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final Function1<? super Integer, Unit> function12 = function1;
            final int i20 = i15;
            t0L.a(new Function2() { // from class: os.P
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S.m(localThemeScope, reward, i10, i20, z10, modifier3, function12, onClaimRewardClicked, onClaimButtonClicked, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, ClaimReward claimReward, int i10, int i11, boolean z10, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, int i12, int i13, Composer composer, int i14) throws Resources.NotFoundException {
        i(localThemeScope, claimReward, i10, i11, z10, modifier, function1, function12, function13, composer, J0.a(i12 | 1), i13);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r34, final co.ClaimReward r35, final int r36, final boolean r37, final int r38, androidx.compose.ui.Modifier r39, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r40, final kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super co.ClaimReward, kotlin.Unit> r42, final kotlin.jvm.functions.Function1<? super co.ClaimReward, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.S.p(Ki.M, co.c, int, boolean, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, ClaimReward claimReward, int i10, boolean z10, int i11, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i12, int i13, Composer composer, int i14) {
        p(localThemeScope, claimReward, i10, z10, i11, modifier, function1, function12, function13, function14, composer, J0.a(i12 | 1), i13);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void u(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.S.u(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        u(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(Ki.LocalThemeScope r34, androidx.compose.ui.Modifier r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.S.w(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1, Function1 function12, ClaimReward claimReward, InterfaceC5872l0 interfaceC5872l0) {
        function1.invoke(Boolean.valueOf(!n(interfaceC5872l0)));
        o(interfaceC5872l0, !n(interfaceC5872l0));
        function12.invoke(Long.valueOf(claimReward.getCouponId()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
        function1.invoke(Boolean.valueOf(!n(interfaceC5872l0)));
        o(interfaceC5872l0, !n(interfaceC5872l0));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1, Function1 function12, int i10, InterfaceC5872l0 interfaceC5872l0) {
        function1.invoke(Boolean.valueOf(!n(interfaceC5872l0)));
        o(interfaceC5872l0, !n(interfaceC5872l0));
        function12.invoke(Integer.valueOf(i10));
        return Unit.f143329a;
    }

    private static final boolean n(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void o(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, ClaimReward claimReward) {
        function1.invoke(claimReward);
        return Unit.f143329a;
    }
}
