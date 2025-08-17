package iq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: iq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14753a {

    /* renamed from: a, reason: collision with root package name */
    public static final C14753a f138364a = new C14753a();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f138365b = ComposableLambdaKt.composableLambdaInstance(-1165511117, false, C2184a.f138366a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iq.a$a, reason: collision with other inner class name */
    static final class C2184a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2184a f138366a = new C2184a();

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
            return Unit.f142422a;
        }

        C2184a() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f138365b;
    }
}
