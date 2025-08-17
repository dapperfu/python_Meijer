package ji;

import Ji.T;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.N, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14911N {

    /* renamed from: a, reason: collision with root package name */
    public static final C14911N f139692a = new C14911N();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f139693b = ComposableLambdaKt.composableLambdaInstance(58135282, false, a.f139695a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f139694c = ComposableLambdaKt.composableLambdaInstance(711478649, false, b.f139696a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.N$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f139695a = new a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(58135282, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ComposableSingletons$TemplatesKt.lambda$58135282.<anonymous> (Templates.kt:99)");
            }
            C1.f166781a.a(null, 0.0f, T.a.C3869x.f15872c.getColor(), composer, C1.f166785e << 9, 3);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.N$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f139696a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(711478649, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ComposableSingletons$TemplatesKt.lambda$711478649.<anonymous> (Templates.kt:120)");
            }
            C1.f166781a.a(null, 0.0f, T.a.C3869x.f15872c.getColor(), composer, C1.f166785e << 9, 3);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        b() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f139693b;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f139694c;
    }
}
