package ki;

import Ki.T;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.N, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15145N {

    /* renamed from: a, reason: collision with root package name */
    public static final C15145N f141947a = new C15145N();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f141948b = ComposableLambdaKt.composableLambdaInstance(58135282, false, a.f141950a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f141949c = ComposableLambdaKt.composableLambdaInstance(711478649, false, b.f141951a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.N$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f141950a = new a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(58135282, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ComposableSingletons$TemplatesKt.lambda$58135282.<anonymous> (Templates.kt:99)");
            }
            C1.f167869a.a(null, 0.0f, T.a.C3955x.f17416c.getColor(), composer, C1.f167873e << 9, 3);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.N$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f141951a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(711478649, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.ComposableSingletons$TemplatesKt.lambda$711478649.<anonymous> (Templates.kt:120)");
            }
            C1.f167869a.a(null, 0.0f, T.a.C3955x.f17416c.getColor(), composer, C1.f167873e << 9, 3);
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
        return f141948b;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f141949c;
    }
}
