package ji;

import Ji.LocalThemeScope;
import Ji.T;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lji/Q0;", "Lji/f;", "Lji/Q0$a;", "j", "()Lji/Q0$a;", "loading", "a", "b", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Q0 extends InterfaceC14933f {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lji/Q0$a;", "", "Lji/Q0;", "Lji/q1$k$a;", "largeLoading", "Lji/q1$k$b;", "largeLoadingV2", "Lji/q1$k$c;", "smallLoading", "<init>", "(Lji/q1$k$a;Lji/q1$k$b;Lji/q1$k$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$k$a;", "()Lji/q1$k$a;", "getLargeLoading$annotations", "()V", "b", "Lji/q1$k$b;", "()Lji/q1$k$b;", "c", "Lji/q1$k$c;", "()Lji/q1$k$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.Q0$a, reason: from toString */
    public static final /* data */ class DefaultLoading {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.k.Large largeLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.k.LargeV2 largeLoadingV2;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.k.Small smallLoading;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultLoading)) {
                return false;
            }
            DefaultLoading defaultLoading = (DefaultLoading) other;
            return Intrinsics.e(this.largeLoading, defaultLoading.largeLoading) && Intrinsics.e(this.largeLoadingV2, defaultLoading.largeLoadingV2) && Intrinsics.e(this.smallLoading, defaultLoading.smallLoading);
        }

        public DefaultLoading(q1.k.Large largeLoading, q1.k.LargeV2 largeLoadingV2, q1.k.Small smallLoading) {
            Intrinsics.j(largeLoading, "largeLoading");
            Intrinsics.j(largeLoadingV2, "largeLoadingV2");
            Intrinsics.j(smallLoading, "smallLoading");
            this.largeLoading = largeLoading;
            this.largeLoadingV2 = largeLoadingV2;
            this.smallLoading = smallLoading;
        }

        /* renamed from: a, reason: from getter */
        public final q1.k.Large getLargeLoading() {
            return this.largeLoading;
        }

        /* renamed from: b, reason: from getter */
        public final q1.k.LargeV2 getLargeLoadingV2() {
            return this.largeLoadingV2;
        }

        /* renamed from: c, reason: from getter */
        public final q1.k.Small getSmallLoading() {
            return this.smallLoading;
        }

        public int hashCode() {
            return (((this.largeLoading.hashCode() * 31) + this.largeLoadingV2.hashCode()) * 31) + this.smallLoading.hashCode();
        }

        public String toString() {
            return "DefaultLoading(largeLoading=" + this.largeLoading + ", largeLoadingV2=" + this.largeLoadingV2 + ", smallLoading=" + this.smallLoading + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lji/Q0$b;", "Lji/w1;", "Lji/X;", "<init>", "()V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/X;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements w1<InterfaceC14920X> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f139711a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f139712b = 0;

        @Override // ji.w1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC14920X q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(1445561557);
            if (ComposerKt.M()) {
                ComposerKt.U(1445561557, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Loading.DefaultLoadingVariant.generateAssembly (Loading.kt:39)");
            }
            InterfaceC14920X interfaceC14920XQ = new c().q(themeScope, composer, i10 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC14920XQ;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lji/Q0$c;", "Lji/w1;", "Lji/X;", "<init>", "()V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/X;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c implements w1<InterfaceC14920X> {

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ji/Q0$c$a", "Lji/X;", "LJi/M;", "a", "LJi/M;", "getThemeScope", "()LJi/M;", "themeScope", "Lji/b;", "b", "Lji/b;", "q", "()Lji/b;", "colors", "Lji/Q0$a;", "c", "Lji/Q0$a;", "j", "()Lji/Q0$a;", "loading", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements InterfaceC14920X {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final LocalThemeScope themeScope;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final AdsLoadingColor colors;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final DefaultLoading loading;

            a(LocalThemeScope localThemeScope) {
                this.themeScope = localThemeScope;
                this.colors = new AdsLoadingColor(localThemeScope.getAdsColors().getAdsColorBrandPrimary(), T.a.C3868w.f15870c, localThemeScope.getAdsColors().getAdsColorBrandSecondary());
                Modifier.Companion companion = Modifier.INSTANCE;
                float f10 = 50;
                this.loading = new DefaultLoading(new q1.k.Large(androidx.compose.foundation.layout.J.v(companion, H1.h.p(f10)), getColors(), 0.0f, 0, 0.0f, 28, null), new q1.k.LargeV2(androidx.compose.foundation.layout.J.v(companion, H1.h.p(f10)), getColors(), 0.0f, 0, 0.0f, 28, null), new q1.k.Small(androidx.compose.foundation.layout.J.v(companion, H1.h.p(16)), getColors(), 0.0f, 0, 0.0f, 28, null));
            }

            @Override // ji.Q0
            /* renamed from: j, reason: from getter */
            public DefaultLoading getLoading() {
                return this.loading;
            }

            /* renamed from: q, reason: from getter */
            public AdsLoadingColor getColors() {
                return this.colors;
            }
        }

        @Override // ji.w1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC14920X q(LocalThemeScope themeScope, Composer composer, int i10) {
            Intrinsics.j(themeScope, "themeScope");
            composer.startReplaceGroup(699422937);
            if (ComposerKt.M()) {
                ComposerKt.U(699422937, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Loading.DefaultVariant.generateAssembly (Loading.kt:45)");
            }
            a aVar = new a(themeScope);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return aVar;
        }
    }

    /* renamed from: j */
    DefaultLoading getLoading();
}
