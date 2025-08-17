package eq;

import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import j0.InterfaceC14800I;
import ji.C14898A;
import ji.j1;
import ji.q1;
import kotlin.C17988z0;
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
import ni.E0;
import r1.C16705m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "text", "LZ0/c;", BarcodePickDeserializer.FIELD_ICON, "Lkotlin/Function0;", "", "onClick", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;LZ0/c;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129518a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f129519b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f129520c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Z0.c f129521d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f129522e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: eq.Q$a$a, reason: collision with other inner class name */
        static final class C2045a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129523a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Z0.c f129524b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f129525c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.Q$a$a$a, reason: collision with other inner class name */
            static final class C2046a implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C2046a f129526a = new C2046a();

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }

                C2046a() {
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.Q$a$a$b */
            static final class b implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f129527a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f129528b;

                b(L1.h hVar, LocalThemeScope localThemeScope) {
                    this.f129527a = hVar;
                    this.f129528b = localThemeScope;
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    D.a.a(constrainAs.getStart(), this.f129527a.getEnd(), this.f129528b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.Q$a$a$c */
            public static final class c extends Lambda implements Function1<r1.u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ L1.A f129529f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(L1.A a10) {
                    super(1);
                    this.f129529f = a10;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    L1.C.a(semantics, this.f129529f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                    a(uVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: eq.Q$a$a$d */
            public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f129530f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f129531g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f129532h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f129533i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ Z0.c f129534j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ String f129535k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Z0.c cVar, String str) {
                    super(2);
                    this.f129531g = nVar;
                    this.f129532h = function0;
                    this.f129533i = localThemeScope;
                    this.f129534j = cVar;
                    this.f129535k = str;
                    this.f129530f = i10;
                }

                public final void a(Composer composer, int i10) {
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f129531g.getHelpersHashCode();
                    this.f129531g.i();
                    L1.n nVar = this.f129531g;
                    composer.startReplaceGroup(-308914683);
                    n.b bVarM = nVar.m();
                    L1.h hVarA = bVarM.a();
                    L1.h hVarC = bVarM.c();
                    long color = this.f129533i.getAdsColors().getAdsColorBrandPrimary().getColor();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = C2046a.f129526a;
                        composer.t(objB);
                    }
                    composer.P();
                    C17988z0.a(this.f129534j, null, nVar.k(companion, hVarA, (Function1) objB), color, composer, 48, 0);
                    LocalThemeScope localThemeScope = this.f129533i;
                    Ji.I two = localThemeScope.getAdsTypography().getBodyCompact().getTwo();
                    Ji.T adsColorBrandPrimary = this.f129533i.getAdsColors().getAdsColorBrandPrimary();
                    int iD = F1.j.INSTANCE.d();
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(hVarA) | composer.D(this.f129533i);
                    Object objB2 = composer.B();
                    if (zV || objB2 == companion2.a()) {
                        objB2 = new b(hVarA, this.f129533i);
                        composer.t(objB2);
                    }
                    composer.P();
                    ri.j.h(localThemeScope, new q1.Label(nVar.k(companion, hVarC, (Function1) objB2), adsColorBrandPrimary, null, F1.j.h(iD), 0, false, 0, two, null, 372, null), this.f129535k, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    composer.P();
                    if (this.f129531g.getHelpersHashCode() != helpersHashCode) {
                        this.f129532h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C2045a(LocalThemeScope localThemeScope, Z0.c cVar, String str) {
                this.f129523a = localThemeScope;
                this.f129524b = cVar;
                this.f129525c = str;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-577971468, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ItemActionButton.<anonymous>.<anonymous> (ItemActionButton.kt:45)");
                }
                Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope = this.f129523a;
                Z0.c cVar = this.f129524b;
                String str = this.f129525c;
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
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
                androidx.compose.ui.layout.A.a(C16705m.d(modifierF, false, new c(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new d(nVar, 6, pairH.b(), localThemeScope, cVar, str)), pairH.a(), composer, 48, 0);
                composer.U();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0, Z0.c cVar, String str) {
            this.f129518a = localThemeScope;
            this.f129519b = modifier;
            this.f129520c = function0;
            this.f129521d = cVar;
            this.f129522e = str;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(896094215, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ItemActionButton.<anonymous> (ItemActionButton.kt:39)");
            }
            E0.b(this.f129518a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, this.f129519b, false, null, 895, null), this.f129520c, ComposableLambdaKt.c(-577971468, true, new C2045a(this.f129518a, this.f129521d, this.f129522e), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final String text, final Z0.c icon, final Function0<Unit> onClick, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(text, "text");
        Intrinsics.j(icon, "icon");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(384078243);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(text) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(icon) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onClick) ? 16384 : 8192;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(384078243, i14, -1, "com.meijer.mobile.shopandscan.presentation.component.ItemActionButton (ItemActionButton.kt:37)");
            }
            Ji.Q.e(localThemeScope, C14898A.f139596a, ComposableLambdaKt.c(896094215, true, new a(localThemeScope, modifier2, onClick, icon, text), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i14 & 14) | (C14898A.f139597b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: eq.P
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q.c(localThemeScope, modifier2, text, icon, onClick, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, Z0.c cVar, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, cVar, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
