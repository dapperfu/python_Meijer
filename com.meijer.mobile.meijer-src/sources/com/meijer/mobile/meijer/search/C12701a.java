package com.meijer.mobile.meijer.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.search.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12701a {

    /* renamed from: a, reason: collision with root package name */
    public static final C12701a f114089a = new C12701a();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f114090b = ComposableLambdaKt.composableLambdaInstance(-1296635390, false, C1804a.f114091a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.a$a, reason: collision with other inner class name */
    static final class C1804a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1804a f114091a = new C1804a();

        C1804a() {
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
            return Unit.f143329a;
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f114090b;
    }
}
