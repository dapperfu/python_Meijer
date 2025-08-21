package lq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14888I;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p1.C16335d;
import p1.C16338g;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: lq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15576b {

    /* renamed from: a, reason: collision with root package name */
    public static final C15576b f150037a = new C15576b();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f150038b = ComposableLambdaKt.composableLambdaInstance(1095612792, false, a.f150040a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f150039c = ComposableLambdaKt.composableLambdaInstance(473307984, false, C2317b.f150041a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lq.b$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f150040a = new a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1095612792, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ComposableSingletons$ShopAndScanLookupItemScreenKt.lambda$1095612792.<anonymous> (ShopAndScanLookupItemScreen.kt:128)");
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

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lq.b$b, reason: collision with other inner class name */
    static final class C2317b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2317b f150041a = new C2317b();

        public final void a(InterfaceC14888I TextButton, Composer composer, int i10) {
            Intrinsics.j(TextButton, "$this$TextButton");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(473307984, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ComposableSingletons$ShopAndScanLookupItemScreenKt.lambda$473307984.<anonymous> (ShopAndScanLookupItemScreen.kt:292)");
            }
            N1.b(C16338g.c(com.meijer.mobile.shopandscan.e.f117955s1, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }

        C2317b() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f150038b;
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> b() {
        return f150039c;
    }
}
