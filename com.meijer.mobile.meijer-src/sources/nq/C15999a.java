package nq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p1.C16335d;
import p1.C16338g;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: nq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15999a {

    /* renamed from: a, reason: collision with root package name */
    public static final C15999a f152723a = new C15999a();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f152724b = ComposableLambdaKt.composableLambdaInstance(-275669831, false, C2361a.f152726a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f152725c = ComposableLambdaKt.composableLambdaInstance(250473175, false, b.f152727a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nq.a$a, reason: collision with other inner class name */
    static final class C2361a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2361a f152726a = new C2361a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-275669831, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ComposableSingletons$ShopAndScanScannerScreenKt.lambda$-275669831.<anonymous> (ShopAndScanScannerScreen.kt:391)");
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

        C2361a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nq.a$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f152727a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(250473175, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.scanner.ComposableSingletons$ShopAndScanScannerScreenKt.lambda$250473175.<anonymous> (ShopAndScanScannerScreen.kt:396)");
            }
            C18054z0.a(C16335d.c(Cj.i.f4807m0, composer, 0), C16338g.c(com.meijer.mobile.shopandscan.e.f117934l1, composer, 0), null, 0L, composer, 0, 12);
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
        return f152724b;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f152725c;
    }
}
