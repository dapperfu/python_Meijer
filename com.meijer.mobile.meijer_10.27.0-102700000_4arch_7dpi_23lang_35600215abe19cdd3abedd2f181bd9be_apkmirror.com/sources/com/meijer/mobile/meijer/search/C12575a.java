package com.meijer.mobile.meijer.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.search.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12575a {

    /* renamed from: a, reason: collision with root package name */
    public static final C12575a f113236a = new C12575a();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f113237b = ComposableLambdaKt.composableLambdaInstance(-1296635390, false, C1796a.f113238a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.a$a, reason: collision with other inner class name */
    static final class C1796a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1796a f113238a = new C1796a();

        C1796a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1296635390, i10, -1, "com.meijer.mobile.meijer.search.ComposableSingletons$SearchProductActivityComposeKt.lambda$-1296635390.<anonymous> (SearchProductActivityCompose.kt:311)");
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
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f113237b;
    }
}
