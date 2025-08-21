package lq;

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
/* renamed from: lq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15575a {

    /* renamed from: a, reason: collision with root package name */
    public static final C15575a f150034a = new C15575a();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f150035b = ComposableLambdaKt.composableLambdaInstance(414021647, false, C2316a.f150036a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lq.a$a, reason: collision with other inner class name */
    static final class C2316a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2316a f150036a = new C2316a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(414021647, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ComposableSingletons$ShopAndScanItemDetailsScreenKt.lambda$414021647.<anonymous> (ShopAndScanItemDetailsScreen.kt:121)");
            }
            C18054z0.a(C16335d.c(Cj.i.f4810n0, composer, 0), C16338g.c(com.meijer.mobile.shopandscan.e.f117937m1, composer, 0), null, 0L, composer, 0, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        C2316a() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f150035b;
    }
}
