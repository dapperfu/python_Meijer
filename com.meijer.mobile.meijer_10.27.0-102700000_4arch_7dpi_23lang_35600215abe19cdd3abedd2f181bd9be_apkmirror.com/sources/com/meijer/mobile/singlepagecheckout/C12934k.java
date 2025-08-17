package com.meijer.mobile.singlepagecheckout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14812d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12934k {

    /* renamed from: a, reason: collision with root package name */
    public static final C12934k f118262a = new C12934k();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14812d, Composer, Integer, Unit> f118263b = ComposableLambdaKt.composableLambdaInstance(394665180, false, a.f118264a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.k$a */
    static final class a implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f118264a = new a();

        a() {
        }

        public final void a(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14812d, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(394665180, i10, -1, "com.meijer.mobile.singlepagecheckout.ComposableSingletons$SinglePageCheckoutActivityKt.lambda$394665180.<anonymous> (SinglePageCheckoutActivity.kt:669)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
            a(interfaceC14812d, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public final Function3<InterfaceC14812d, Composer, Integer, Unit> a() {
        return f118263b;
    }
}
