package com.meijer.mobile.accounts.ux.unauthenticated;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f95866a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f95867b = ComposableLambdaKt.composableLambdaInstance(-1167526948, false, C1356a.f95868a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.unauthenticated.a$a, reason: collision with other inner class name */
    static final class C1356a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1356a f95868a = new C1356a();

        C1356a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1167526948, i10, -1, "com.meijer.mobile.accounts.ux.unauthenticated.ComposableSingletons$UnauthenticatedBottomSheetActivityKt.lambda$-1167526948.<anonymous> (UnauthenticatedBottomSheetActivity.kt:125)");
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
        return f95867b;
    }
}
