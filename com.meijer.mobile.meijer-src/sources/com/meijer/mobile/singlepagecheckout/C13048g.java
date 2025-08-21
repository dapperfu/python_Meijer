package com.meijer.mobile.singlepagecheckout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13048g {

    /* renamed from: a, reason: collision with root package name */
    public static final C13048g f119206a = new C13048g();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f119207b = ComposableLambdaKt.composableLambdaInstance(298991600, false, a.f119208a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.g$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f119208a = new a();

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(298991600, i10, -1, "com.meijer.mobile.singlepagecheckout.ComposableSingletons$DeliveryContactInfoSectionCardKt.lambda$298991600.<anonymous> (DeliveryContactInfoSectionCard.kt:77)");
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
        return f119207b;
    }
}
