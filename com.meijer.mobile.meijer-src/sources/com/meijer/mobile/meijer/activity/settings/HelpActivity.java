package com.meijer.mobile.meijer.activity.settings;

import Cn.HelpViewState;
import En.G;
import Ki.K;
import Ki.LocalThemeScope;
import Kk.AppVersion;
import P0.e;
import V2.CreationExtras;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.Y;
import dk.C13697a;
import e.C13737e;
import j0.C14889J;
import j0.C14890K;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import ki.q1;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.C17995d0;
import kotlin.C17998e0;
import kotlin.C18029o1;
import kotlin.C18054z0;
import kotlin.EnumC18001f0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mv.InterfaceC15783O;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16335d;
import p1.C16338g;
import ps.AbstractC16499C;
import ps.C16498B;
import ps.C16507K;
import ps.C16508L;
import ps.C16521g;
import ps.DrawerLayoutDecorator;
import ps.EnumC16503G;
import ps.HeaderDecorator;
import y0.C18233a;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u00020\t*\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\t*\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010H¨\u0006L²\u0006\f\u0010K\u001a\u00020J8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/HelpActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "hasNavigationDrawer", "", "B1", "(LKi/M;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "", "LCn/c;", "helpItems", "z1", "(LKi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "helpItemType", "w1", "(LKi/M;LCn/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "N1", "(LCn/c;)V", "Landroidx/compose/runtime/z1;", "LCn/d;", "viewState", "u1", "(LKi/M;Landroidx/compose/runtime/z1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LEn/G;", "v", "LEn/G;", "K1", "()LEn/G;", "setHelpViewModel", "(LEn/G;)V", "helpViewModel", "LDl/e;", "w", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lzl/k;", "x", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "LKk/a;", "y", "LKk/a;", "J1", "()LKk/a;", "setAppVersion", "(LKk/a;)V", "appVersion", "Lps/L;", "z", "Lkotlin/Lazy;", "L1", "()Lps/L;", "navigationDrawerViewModel", "Lps/g;", "A", "M1", "()Lps/g;", "navigationHelper", "Lx0/c1;", "scaffoldState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class HelpActivity extends Hilt_HelpActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public G helpViewModel;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new e0(Reflection.b(C16508L.class), new h(this), new g(this), new i(null, this));

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HelpActivity.O1(this.f112728a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112561a;

        a(LocalThemeScope localThemeScope) {
            this.f112561a = localThemeScope;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1885526912, i10, -1, "com.meijer.mobile.meijer.activity.settings.HelpActivity.HelpContent.<anonymous>.<anonymous> (HelpActivity.kt:268)");
            }
            N1.c(C13697a.a(Y.f100779Y6, composer, 0), D.j(J.D(J.h(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), H1.h.p(16), H1.h.p(20)), 0L, 0L, null, null, null, 0L, null, F1.j.h(F1.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, this.f112561a.getAdsTypography().getBody().getTwo().getStyle(), composer, 48, 0, 130556);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112562a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Cn.c f112563b;

        b(LocalThemeScope localThemeScope, Cn.c cVar) {
            this.f112562a = localThemeScope;
            this.f112563b = cVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(551950591, i10, -1, "com.meijer.mobile.meijer.activity.settings.HelpActivity.HelpItem.<anonymous> (HelpActivity.kt:192)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierK = D.k(J.h(companion, 0.0f, 1, null), H1.h.p(f10), 0.0f, 2, null);
            C5800d.e eVarG = C5800d.f48779a.g();
            e.c cVarI = P0.e.INSTANCE.i();
            LocalThemeScope localThemeScope = this.f112562a;
            Cn.c cVar = this.f112563b;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, cVarI, composer, 54);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            si.j.h(localThemeScope, new q1.Label(D.k(companion, 0.0f, H1.h.p(f10), 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), C16338g.c(cVar.getResourceID(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            if (cVar.getIsWebPunchOut()) {
                composer.startReplaceGroup(-444795177);
                C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, 0);
                C18054z0.a(C16335d.c(S.f99550I, composer, 0), C16338g.c(Y.f101259w9, composer, 0), null, localThemeScope.getAdsColors().getAdsColorIcon02().getColor(), composer, 0, 4);
                composer.P();
            } else {
                composer.startReplaceGroup(-444433934);
                C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, 0);
                C18054z0.b(z0.e.a(C18233a.C2752a.f171040a), null, null, localThemeScope.getAdsColors().getAdsColorIcon02().getColor(), composer, 48, 4);
                composer.P();
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112564a;

        c(LocalThemeScope localThemeScope) {
            this.f112564a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1132189814, i10, -1, "com.meijer.mobile.meijer.activity.settings.HelpActivity.HelpScreenTopBar.<anonymous> (HelpActivity.kt:159)");
            }
            Dr.g.g(this.f112564a, C16338g.c(Y.f100878d7, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112565a;

        d(LocalThemeScope localThemeScope) {
            this.f112565a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(662406463, i10, -1, "com.meijer.mobile.meijer.activity.settings.HelpActivity.HelpScreenTopBar.<anonymous> (HelpActivity.kt:167)");
            }
            Dr.g.g(this.f112565a, C16338g.c(Y.f100878d7, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Cn.c.values().length];
            try {
                iArr[Cn.c.f5239c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Cn.c.f5240d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Cn.c.f5241e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Cn.c.f5242f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Cn.c.f5243g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Cn.c.f5244h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<C17993c1> f112567a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HelpActivity f112568b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<HeaderDecorator> f112569c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<DrawerLayoutDecorator> f112570d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<HelpViewState> f112571e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.settings.HelpActivity$f$a$a, reason: collision with other inner class name */
            static final class C1747a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HelpActivity f112572a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112573b;

                C1747a(HelpActivity helpActivity, LocalThemeScope localThemeScope) {
                    this.f112572a = helpActivity;
                    this.f112573b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(193635179, i10, -1, "com.meijer.mobile.meijer.activity.settings.HelpActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HelpActivity.kt:134)");
                    }
                    this.f112572a.B1(this.f112573b, null, !r3.getIntent().getBooleanExtra("EXTRA_FROM_CART_PAGE", false), composer, LocalThemeScope.f17314g, 1);
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
            @SourceDebugExtension
            static final class b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f112574a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f112575b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ HelpActivity f112576c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112577d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.settings.HelpActivity$f$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1748a extends FunctionReferenceImpl implements Function1<AbstractC16499C, Unit> {
                    C1748a(Object obj) {
                        super(1, obj, C16521g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                    }

                    public final void a(AbstractC16499C p02) {
                        Intrinsics.j(p02, "p0");
                        ((C16521g) this.receiver).h(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC16499C abstractC16499C) {
                        a(abstractC16499C);
                        return Unit.f143329a;
                    }
                }

                b(z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, HelpActivity helpActivity, LocalThemeScope localThemeScope) {
                    this.f112574a = z1Var;
                    this.f112575b = z1Var2;
                    this.f112576c = helpActivity;
                    this.f112577d = localThemeScope;
                }

                public final void a(InterfaceC14902f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                    Intrinsics.j(Scaffold, "$this$Scaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-969777151, i10, -1, "com.meijer.mobile.meijer.activity.settings.HelpActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HelpActivity.kt:126)");
                    }
                    HeaderDecorator value = this.f112574a.getValue();
                    DrawerLayoutDecorator value2 = this.f112575b.getValue();
                    C16521g c16521gM1 = this.f112576c.M1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c16521gM1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1748a(c16521gM1);
                        composer.t(objB);
                    }
                    composer.P();
                    AppVersion appVersionJ1 = this.f112576c.J1();
                    C16498B.h(this.f112577d, value, value2, appVersionJ1, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g | (HeaderDecorator.f157113i << 3) | (DrawerLayoutDecorator.f157377h << 6), 8);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                    a(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HelpActivity f112578a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112579b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<HelpViewState> f112580c;

                c(HelpActivity helpActivity, LocalThemeScope localThemeScope, z1<HelpViewState> z1Var) {
                    this.f112578a = helpActivity;
                    this.f112579b = localThemeScope;
                    this.f112580c = z1Var;
                }

                public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(paddingValues) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(410195684, i10, -1, "com.meijer.mobile.meijer.activity.settings.HelpActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HelpActivity.kt:142)");
                    }
                    this.f112578a.u1(this.f112579b, this.f112580c, D.h(Modifier.INSTANCE, paddingValues), composer, LocalThemeScope.f17314g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    a(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(InterfaceC5872l0<C17993c1> interfaceC5872l0, HelpActivity helpActivity, z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, z1<HelpViewState> z1Var3) {
                this.f112567a = interfaceC5872l0;
                this.f112568b = helpActivity;
                this.f112569c = z1Var;
                this.f112570d = z1Var2;
                this.f112571e = z1Var3;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-740541146, i11, -1, "com.meijer.mobile.meijer.activity.settings.HelpActivity.onCreate.<anonymous>.<anonymous> (HelpActivity.kt:122)");
                }
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), f.c(this.f112567a), ComposableLambdaKt.c(193635179, true, new C1747a(this.f112568b, AdsTheme), composer, 54), null, null, null, 0, false, ComposableLambdaKt.c(-969777151, true, new b(this.f112569c, this.f112570d, this.f112568b, AdsTheme), composer, 54), false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(410195684, true, new c(this.f112568b, AdsTheme, this.f112571e), composer, 54), composer, 100663680, 12582912, 130808);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        f() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1662736105, i10, -1, "com.meijer.mobile.meijer.activity.settings.HelpActivity.onCreate.<anonymous> (HelpActivity.kt:108)");
            }
            z1 z1VarB = o1.b(HelpActivity.this.L1().u(), null, composer, 0, 1);
            z1 z1VarB2 = o1.b(HelpActivity.this.L1().v(), null, composer, 0, 1);
            z1 z1VarB3 = o1.b(HelpActivity.this.K1().n(), null, composer, 0, 1);
            C17998e0 c17998e0J = C17995d0.j(EnumC18001f0.f168977a, null, composer, 6, 2);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C18029o1();
                composer.t(objB);
            }
            C18029o1 c18029o1 = (C18029o1) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB2);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB2;
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(new C17993c1(c17998e0J, c18029o1), null, 2, null);
                composer.t(objB3);
            }
            composer.P();
            C16507K.b(HelpActivity.this.M1(), c17998e0J, interfaceC15783O, composer, C16521g.f157265l);
            K.b(null, ComposableLambdaKt.c(-740541146, true, new a((InterfaceC5872l0) objB3, HelpActivity.this, z1VarB, z1VarB2, z1VarB3), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17993c1 c(InterfaceC5872l0<C17993c1> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112581f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f112581f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f112581f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112582f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f112582f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f112582f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f112583f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112584g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f112583f = function0;
            this.f112584g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f112583f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f112584g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A1(HelpActivity helpActivity, LocalThemeScope localThemeScope, List list, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        helpActivity.z1(localThemeScope, list, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final boolean r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.HelpActivity.B1(Ki.M, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(HelpActivity helpActivity, LocalThemeScope localThemeScope, Modifier modifier, boolean z10, int i10, int i11, Composer composer, int i12) {
        helpActivity.B1(localThemeScope, modifier, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16508L L1() {
        return (C16508L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16521g M1() {
        return (C16521g) this.navigationHelper.getValue();
    }

    private final void N1(Cn.c helpItemType) {
        switch (e.$EnumSwitchMapping$0[helpItemType.ordinal()]) {
            case 1:
                Dl.e meijerIntent = getMeijerIntent();
                String string = getString(Y.f101295y5);
                Intrinsics.i(string, "getString(...)");
                meijerIntent.e0(this, string);
                return;
            case 2:
                Bl.a aVar = Bl.a.f3119a;
                Context baseContext = getBaseContext();
                Intrinsics.i(baseContext, "getBaseContext(...)");
                startActivity(aVar.g(baseContext));
                return;
            case 3:
                Dl.e meijerIntent2 = getMeijerIntent();
                String string2 = getString(Bl.n.f3136b);
                Intrinsics.i(string2, "getString(...)");
                meijerIntent2.e0(this, string2);
                return;
            case 4:
                Dl.e meijerIntent3 = getMeijerIntent();
                String string3 = getString(Bl.n.f3135a);
                Intrinsics.i(string3, "getString(...)");
                meijerIntent3.e0(this, string3);
                return;
            case 5:
                Dl.e meijerIntent4 = getMeijerIntent();
                String string4 = getString(Y.f101275x5);
                Intrinsics.i(string4, "getString(...)");
                meijerIntent4.e0(this, string4);
                return;
            case 6:
                startActivity(Bl.d.b(this, false, 0, 6, null));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16521g O1(HelpActivity helpActivity) {
        return new C16521g(helpActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(final Ki.LocalThemeScope r19, androidx.compose.runtime.z1<Cn.HelpViewState> r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.HelpActivity.u1(Ki.M, androidx.compose.runtime.z1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(HelpActivity helpActivity, LocalThemeScope localThemeScope, z1 z1Var, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        helpActivity.u1(localThemeScope, z1Var, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w1(final Ki.LocalThemeScope r23, final Cn.c r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.HelpActivity.w1(Ki.M, Cn.c, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(HelpActivity helpActivity, LocalThemeScope localThemeScope, Cn.c cVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        helpActivity.w1(localThemeScope, cVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a A[LOOP:0: B:72:0x0124->B:74:0x012a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z1(final Ki.LocalThemeScope r14, final java.util.List<? extends Cn.c> r15, androidx.compose.ui.Modifier r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.HelpActivity.z1(Ki.M, java.util.List, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public final AppVersion J1() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.x("appVersion");
        return null;
    }

    public final G K1() {
        G g10 = this.helpViewModel;
        if (g10 != null) {
            return g10;
        }
        Intrinsics.x("helpViewModel");
        return null;
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C1(HelpActivity helpActivity) {
        if (!helpActivity.onNavigateUp()) {
            helpActivity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(HelpActivity helpActivity) {
        helpActivity.M1().j();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(HelpActivity helpActivity, Cn.c cVar) {
        helpActivity.N1(cVar);
        return Unit.f143329a;
    }

    @Override // com.meijer.mobile.meijer.activity.settings.Hilt_HelpActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(K1());
        L1().w(Integer.valueOf(EnumC16503G.f157141r.getIntentCode()));
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1662736105, true, new f()), 1, null);
    }
}
