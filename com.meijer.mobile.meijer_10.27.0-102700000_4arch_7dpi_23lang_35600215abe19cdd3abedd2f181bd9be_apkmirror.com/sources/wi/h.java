package wi;

import Ji.K;
import Ji.LocalThemeScope;
import android.annotation.SuppressLint;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.recyclerview.widget.RecyclerView;
import ii.C14730a;
import ji.q1;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aG\u0010\u000b\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LJi/M;", "", "quantity", "maxQuantity", "Lji/q1$b;", "template", "Lji/q1$h$b;", "iconTemplate", "Lkotlin/Function0;", "", "onClick", "d", "(LJi/M;Ljava/lang/Integer;ILji/q1$b;Lji/q1$h$b;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "count", "", "contentDescription", "", "enabled", "h", "(ILjava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "f", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<i, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f166142a = new a();

        public final void a(i iVar) {
            Intrinsics.j(iVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i iVar) {
            a(iVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Ii.c<Integer, i, i> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<i, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<i> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final i initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<i> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f166146a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f166147b;

            public a(Ii.h hVar, b bVar) {
                this.f166146a = hVar;
                this.f166147b = bVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, wi.i] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i invoke() {
                ?? r02 = this.f166146a;
                this.f166147b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<i> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public i getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<i, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f166148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f166149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f166150c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f166151d;

        c(int i10, String str, boolean z10, Function0<Unit> function0) {
            this.f166148a = i10;
            this.f166149b = str;
            this.f166150c = z10;
            this.f166151d = function0;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(401053798, i11, -1, "com.meijer.mobile.android_acres_library.composables.StatelessFilterBadge.<anonymous> (Badge.kt:129)");
            }
            Mi.c.c(this.f166148a, this.f166149b, this.f166150c, this.f166151d, C14730a.f137963r, AdsTheme.getAdsColors().getAdsColorBrandPrimary().getColor(), AdsTheme.getAdsColors().getAdsColorBrandSecondary().getColor(), composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f166152a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f166153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f166154c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f166155d;

        d(int i10, String str, boolean z10, Function0<Unit> function0) {
            this.f166152a = i10;
            this.f166153b = str;
            this.f166154c = z10;
            this.f166155d = function0;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1344480906, i11, -1, "com.meijer.mobile.android_acres_library.composables.StatelessShoppingCartBadge.<anonymous> (Badge.kt:101)");
            }
            Mi.c.c(this.f166152a, this.f166153b, this.f166154c, this.f166155d, C14730a.f137945n1, AdsTheme.getAdsColors().getAdsColorBrandPrimary().getColor(), AdsTheme.getAdsColors().getAdsColorBrandSecondary().getColor(), composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r16, java.lang.Integer r17, int r18, final ji.q1.Badge r19, ji.q1.h.DrawableIcon r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.h.d(Ji.M, java.lang.Integer, int, ji.q1$b, ji.q1$h$b, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Integer num, int i10, q1.Badge badge, q1.h.DrawableIcon drawableIcon, Function0 function0, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, num, i10, badge, drawableIcon, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    @Deprecated
    public static final void f(final int i10, final String str, final boolean z10, final Function0<Unit> onClick, Composer composer, final int i11) {
        int i12;
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-903317739);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onClick) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-903317739, i12, -1, "com.meijer.mobile.android_acres_library.composables.StatelessFilterBadge (Badge.kt:127)");
            }
            K.b(null, ComposableLambdaKt.c(401053798, true, new c(i10, str, z10, onClick), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: wi.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.g(i10, str, z10, onClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(int i10, String str, boolean z10, Function0 function0, int i11, Composer composer, int i12) {
        f(i10, str, z10, function0, composer, J0.a(i11 | 1));
        return Unit.f142422a;
    }

    @Deprecated
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public static final void h(final int i10, final String str, final boolean z10, final Function0<Unit> onClick, Composer composer, final int i11) {
        int i12;
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2099136283);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onClick) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2099136283, i12, -1, "com.meijer.mobile.android_acres_library.composables.StatelessShoppingCartBadge (Badge.kt:99)");
            }
            K.b(null, ComposableLambdaKt.c(-1344480906, true, new d(i10, str, z10, onClick), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: wi.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.i(i10, str, z10, onClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(int i10, String str, boolean z10, Function0 function0, int i11, Composer composer, int i12) {
        h(i10, str, z10, function0, composer, J0.a(i11 | 1));
        return Unit.f142422a;
    }
}
