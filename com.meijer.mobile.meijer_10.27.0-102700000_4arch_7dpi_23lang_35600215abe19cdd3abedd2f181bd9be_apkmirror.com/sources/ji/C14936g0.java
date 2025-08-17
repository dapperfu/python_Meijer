package ji;

import Ji.LocalThemeScope;
import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.medallia.digital.mobilesdk.l3;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lji/g0;", "Lji/w1;", "Lji/f0;", "<init>", "()V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/f0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.g0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14936g0 implements w1<InterfaceC14934f0> {

    /* renamed from: a, reason: collision with root package name */
    public static final C14936g0 f139813a = new C14936g0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f139814b = 0;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"ji/g0$a", "Lji/f0;", "Lji/q1$q;", "a", "Lji/q1$q;", "n", "()Lji/q1$q;", "tabTemplate", "Lji/q1$p;", "b", "Lji/q1$p;", "l", "()Lji/q1$p;", "tabRowTemplate", "Lji/q1$o;", "c", "Lji/q1$o;", "k", "()Lji/q1$o;", "scrollableTabRowTemplate", "Lji/q1$g;", "d", "Lji/q1$g;", "h", "()Lji/q1$g;", "horizontalPagerTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.g0$a */
    public static final class a implements InterfaceC14934f0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.TabTemplate tabTemplate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q1.TabRowTemplate tabRowTemplate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q1.ScrollableTabRowTemplate scrollableTabRowTemplate;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final q1.HorizontalPagerTemplate horizontalPagerTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.g0$a$a, reason: collision with other inner class name */
        static final class C2211a implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f139819a;

            C2211a(LocalThemeScope localThemeScope) {
                this.f139819a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-461247588);
                if (ComposerKt.M()) {
                    ComposerKt.U(-461247588, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.DefaultTabsVariant.generateAssembly.<no name provided>.scrollableTabRowTemplate.<anonymous> (TabVariants.kt:51)");
                }
                long color = this.f139819a.getAdsColors().getAdsColorTransparent().getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.g0$a$b */
        static final class b implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f139820a;

            b(LocalThemeScope localThemeScope) {
                this.f139820a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-2065251461);
                if (ComposerKt.M()) {
                    ComposerKt.U(-2065251461, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.DefaultTabsVariant.generateAssembly.<no name provided>.scrollableTabRowTemplate.<anonymous> (TabVariants.kt:52)");
                }
                long color = this.f139820a.getAdsColors().getAdsColorEnabled01().getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.g0$a$c */
        static final class c implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f139821a;

            c(LocalThemeScope localThemeScope) {
                this.f139821a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(1698673109);
                if (ComposerKt.M()) {
                    ComposerKt.U(1698673109, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.DefaultTabsVariant.generateAssembly.<no name provided>.tabRowTemplate.<anonymous> (TabVariants.kt:43)");
                }
                long color = this.f139821a.getAdsColors().getAdsColorTransparent().getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.g0$a$d */
        static final class d implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f139822a;

            d(LocalThemeScope localThemeScope) {
                this.f139822a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(1213727860);
                if (ComposerKt.M()) {
                    ComposerKt.U(1213727860, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.DefaultTabsVariant.generateAssembly.<no name provided>.tabRowTemplate.<anonymous> (TabVariants.kt:44)");
                }
                long color = this.f139822a.getAdsColors().getAdsColorEnabled01().getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ji.g0$a$e */
        static final class e implements Function2<Composer, Integer, h0.l> {

            /* renamed from: a, reason: collision with root package name */
            public static final e f139823a = new e();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ h0.l invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            e() {
            }

            public final h0.l a(Composer composer, int i10) {
                composer.startReplaceGroup(-262496112);
                if (ComposerKt.M()) {
                    ComposerKt.U(-262496112, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.DefaultTabsVariant.generateAssembly.<no name provided>.tabTemplate.<anonymous> (TabVariants.kt:28)");
                }
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = h0.k.a();
                    composer.t(objB);
                }
                h0.l lVar = (h0.l) objB;
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return lVar;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.g0$a$f */
        static final class f implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f139824a;

            f(LocalThemeScope localThemeScope) {
                this.f139824a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(754665489);
                if (ComposerKt.M()) {
                    ComposerKt.U(754665489, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.DefaultTabsVariant.generateAssembly.<no name provided>.tabTemplate.<anonymous> (TabVariants.kt:33)");
                }
                long color = this.f139824a.getAdsColors().getAdsColorActiveTransparent().getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.g0$a$g */
        static final class g implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f139825a;

            g(LocalThemeScope localThemeScope) {
                this.f139825a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-1327885870);
                if (ComposerKt.M()) {
                    ComposerKt.U(-1327885870, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.DefaultTabsVariant.generateAssembly.<no name provided>.tabTemplate.<anonymous> (TabVariants.kt:34)");
                }
                long color = this.f139825a.getAdsColors().getAdsColorText01().getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        a(LocalThemeScope localThemeScope) {
            Modifier.Companion companion = Modifier.INSTANCE;
            this.tabTemplate = new q1.TabTemplate(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), e.f139823a, new f(localThemeScope), new g(localThemeScope), localThemeScope.getAdsColors().getAdsColorEnabled01().getColor(), localThemeScope.getAdsColors().getAdsColorText01().getColor(), null);
            this.tabRowTemplate = new q1.TabRowTemplate(0, androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), new c(localThemeScope), new d(localThemeScope), null, null, 48, null);
            this.scrollableTabRowTemplate = new q1.ScrollableTabRowTemplate(0, androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), new C2211a(localThemeScope), new b(localThemeScope), 0.0f, null, null, 112, null);
            this.horizontalPagerTemplate = new q1.HorizontalPagerTemplate(null, false, 0.0f, null, null, null, null, l3.f92485d, null);
        }

        @Override // ji.InterfaceC14938h0
        /* renamed from: h, reason: from getter */
        public q1.HorizontalPagerTemplate getHorizontalPagerTemplate() {
            return this.horizontalPagerTemplate;
        }

        @Override // ji.i1
        /* renamed from: k, reason: from getter */
        public q1.ScrollableTabRowTemplate getScrollableTabRowTemplate() {
            return this.scrollableTabRowTemplate;
        }

        @Override // ji.l1
        /* renamed from: l, reason: from getter */
        public q1.TabRowTemplate getTabRowTemplate() {
            return this.tabRowTemplate;
        }

        @Override // ji.k1
        /* renamed from: n, reason: from getter */
        public q1.TabTemplate getTabTemplate() {
            return this.tabTemplate;
        }
    }

    @Override // ji.w1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC14934f0 q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-1094044280);
        if (ComposerKt.M()) {
            ComposerKt.U(-1094044280, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.DefaultTabsVariant.generateAssembly (TabVariants.kt:24)");
        }
        a aVar = new a(themeScope);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return aVar;
    }

    private C14936g0() {
    }
}
