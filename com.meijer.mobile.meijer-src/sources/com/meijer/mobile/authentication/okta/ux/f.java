package com.meijer.mobile.authentication.okta.ux;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f96169a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f96170b = ComposableLambdaKt.composableLambdaInstance(1646018293, false, a.f96171a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f96171a = new a();

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1646018293, i10, -1, "com.meijer.mobile.authentication.okta.ux.ComposableSingletons$OktaLogoutActivityKt.lambda$1646018293.<anonymous> (OktaLogoutActivity.kt:114)");
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
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f96170b;
    }
}
