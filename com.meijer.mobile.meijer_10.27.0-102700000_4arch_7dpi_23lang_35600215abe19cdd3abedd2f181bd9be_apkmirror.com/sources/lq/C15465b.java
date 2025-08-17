package lq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14800I;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p1.C16190d;
import p1.C16193g;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: lq.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15465b {

    /* renamed from: a, reason: collision with root package name */
    public static final C15465b f149200a = new C15465b();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f149201b = ComposableLambdaKt.composableLambdaInstance(1095612792, false, a.f149203a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<InterfaceC14800I, Composer, Integer, Unit> f149202c = ComposableLambdaKt.composableLambdaInstance(473307984, false, C2294b.f149204a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lq.b$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f149203a = new a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1095612792, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ComposableSingletons$ShopAndScanLookupItemScreenKt.lambda$1095612792.<anonymous> (ShopAndScanLookupItemScreen.kt:128)");
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

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lq.b$b, reason: collision with other inner class name */
    static final class C2294b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2294b f149204a = new C2294b();

        public final void a(InterfaceC14800I TextButton, Composer composer, int i10) {
            Intrinsics.j(TextButton, "$this$TextButton");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(473307984, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ComposableSingletons$ShopAndScanLookupItemScreenKt.lambda$473307984.<anonymous> (ShopAndScanLookupItemScreen.kt:292)");
            }
            N1.b(C16193g.c(com.meijer.mobile.shopandscan.e.f117010s1, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }

        C2294b() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f149201b;
    }

    public final Function3<InterfaceC14800I, Composer, Integer, Unit> b() {
        return f149202c;
    }
}
