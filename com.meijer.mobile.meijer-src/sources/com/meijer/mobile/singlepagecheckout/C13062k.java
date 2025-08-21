package com.meijer.mobile.singlepagecheckout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14900d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13062k {

    /* renamed from: a, reason: collision with root package name */
    public static final C13062k f119254a = new C13062k();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14900d, Composer, Integer, Unit> f119255b = ComposableLambdaKt.composableLambdaInstance(394665180, false, a.f119256a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.k$a */
    static final class a implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f119256a = new a();

        a() {
        }

        public final void a(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            Intrinsics.j(interfaceC14900d, "<this>");
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
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            a(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public final Function3<InterfaceC14900d, Composer, Integer, Unit> a() {
        return f119255b;
    }
}
