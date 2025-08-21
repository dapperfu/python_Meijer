package Qi;

import V0.C5489q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import qc.InterfaceC16624e;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D5 {

    /* renamed from: a, reason: collision with root package name */
    public static final D5 f28444a = new D5();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f28445b = ComposableLambdaKt.composableLambdaInstance(556424018, false, c.f28453a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f28446c = ComposableLambdaKt.composableLambdaInstance(884717115, false, e.f28455a);

    /* renamed from: d, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f28447d = ComposableLambdaKt.composableLambdaInstance(-1299558822, false, b.f28452a);

    /* renamed from: e, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f28448e = ComposableLambdaKt.composableLambdaInstance(811132537, false, d.f28454a);

    /* renamed from: f, reason: collision with root package name */
    private static Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> f28449f = ComposableLambdaKt.composableLambdaInstance(-1046415659, false, a.f28451a);

    /* renamed from: g, reason: collision with root package name */
    private static Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> f28450g = ComposableLambdaKt.composableLambdaInstance(980367980, false, f.f28456a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28451a = new a();

        public final void a(InterfaceC16624e AdsHorizontalPager, int i10, Composer composer, int i11) {
            int i12;
            Intrinsics.j(AdsHorizontalPager, "$this$AdsHorizontalPager");
            if ((i11 & 48) == 0) {
                i12 = i11 | (composer.d(i10) ? 32 : 16);
            } else {
                i12 = i11;
            }
            if ((i12 & 145) == 144 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1046415659, i12, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$TabShowcaseKt.lambda$-1046415659.<anonymous> (TabShowcase.kt:124)");
            }
            if (i10 == 0) {
                composer.startReplaceGroup(-583098242);
                kotlin.N1.b("Here is the content on Tab 1", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                composer.P();
            } else if (i10 == 1) {
                composer.startReplaceGroup(-583092897);
                kotlin.N1.b("Here is more content on Tab 2", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                composer.P();
            } else if (i10 != 2) {
                composer.startReplaceGroup(-895694483);
                composer.P();
            } else {
                composer.startReplaceGroup(-583087526);
                kotlin.N1.b("Awesome content on Tab 3", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16624e interfaceC16624e, Integer num, Composer composer, Integer num2) {
            a(interfaceC16624e, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28452a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1299558822, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$TabShowcaseKt.lambda$-1299558822.<anonymous> (TabShowcase.kt:66)");
            }
            C5067xb.i(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f28453a = new c();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(556424018, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$TabShowcaseKt.lambda$556424018.<anonymous> (TabShowcase.kt:50)");
            }
            C5067xb.o(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f28454a = new d();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(811132537, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$TabShowcaseKt.lambda$811132537.<anonymous> (TabShowcase.kt:74)");
            }
            C5067xb.e(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f28455a = new e();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(884717115, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$TabShowcaseKt.lambda$884717115.<anonymous> (TabShowcase.kt:58)");
            }
            C5067xb.k(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f28456a = new f();

        public final void a(InterfaceC16624e AdsHorizontalPager, int i10, Composer composer, int i11) {
            int i12;
            Intrinsics.j(AdsHorizontalPager, "$this$AdsHorizontalPager");
            if ((i11 & 48) == 0) {
                i12 = i11 | (composer.d(i10) ? 32 : 16);
            } else {
                i12 = i11;
            }
            if ((i12 & 145) == 144 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(980367980, i12, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$TabShowcaseKt.lambda$980367980.<anonymous> (TabShowcase.kt:238)");
            }
            if (i10 == 0) {
                composer.startReplaceGroup(1535793749);
                kotlin.N1.b("Here is the content on Tab 1", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                composer.P();
            } else if (i10 == 1) {
                composer.startReplaceGroup(1535799094);
                kotlin.N1.b("Here is more content on Tab 2", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                composer.P();
            } else if (i10 == 2) {
                composer.startReplaceGroup(1535804465);
                kotlin.N1.b("Awesome content on Tab 3", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                composer.P();
            } else if (i10 != 3) {
                composer.startReplaceGroup(365600566);
                composer.P();
            } else {
                composer.startReplaceGroup(1535809672);
                kotlin.N1.b("You're on Tab 4", null, C5489q0.INSTANCE.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16624e interfaceC16624e, Integer num, Composer composer, Integer num2) {
            a(interfaceC16624e, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }

        f() {
        }
    }

    public final Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> a() {
        return f28449f;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f28447d;
    }

    public final Function2<Composer, Integer, Unit> c() {
        return f28445b;
    }

    public final Function2<Composer, Integer, Unit> d() {
        return f28448e;
    }

    public final Function2<Composer, Integer, Unit> e() {
        return f28446c;
    }

    public final Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> f() {
        return f28450g;
    }
}
