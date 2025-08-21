package Ei;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7646a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f7647b = ComposableLambdaKt.composableLambdaInstance(1126809423, false, C0151a.f7649a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f7648c = ComposableLambdaKt.composableLambdaInstance(1921252405, false, b.f7650a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.a$a, reason: collision with other inner class name */
    static final class C0151a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0151a f7649a = new C0151a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1126809423, i10, -1, "com.meijer.mobile.android_acres_library.composables.progress_indicator.ComposableSingletons$ProgressIndicatorKt.lambda$1126809423.<anonymous> (ProgressIndicator.kt:89)");
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

        C0151a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7650a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1921252405, i10, -1, "com.meijer.mobile.android_acres_library.composables.progress_indicator.ComposableSingletons$ProgressIndicatorKt.lambda$1921252405.<anonymous> (ProgressIndicator.kt:125)");
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

        b() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f7647b;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f7648c;
    }
}
