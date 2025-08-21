package iq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: iq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14841a {

    /* renamed from: a, reason: collision with root package name */
    public static final C14841a f139006a = new C14841a();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f139007b = ComposableLambdaKt.composableLambdaInstance(-1165511117, false, C2204a.f139008a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iq.a$a, reason: collision with other inner class name */
    static final class C2204a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2204a f139008a = new C2204a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1165511117, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.cart.ComposableSingletons$ShopAndScanCartScreenKt.lambda$-1165511117.<anonymous> (ShopAndScanCartScreen.kt:144)");
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

        C2204a() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f139007b;
    }
}
