package lq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p1.C16190d;
import p1.C16193g;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: lq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15464a {

    /* renamed from: a, reason: collision with root package name */
    public static final C15464a f149197a = new C15464a();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f149198b = ComposableLambdaKt.composableLambdaInstance(414021647, false, C2293a.f149199a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lq.a$a, reason: collision with other inner class name */
    static final class C2293a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2293a f149199a = new C2293a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(414021647, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ComposableSingletons$ShopAndScanItemDetailsScreenKt.lambda$414021647.<anonymous> (ShopAndScanItemDetailsScreen.kt:121)");
            }
            C17988z0.a(C16190d.c(Bj.i.f2765n0, composer, 0), C16193g.c(com.meijer.mobile.shopandscan.e.f116992m1, composer, 0), null, 0L, composer, 0, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        C2293a() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f149198b;
    }
}
