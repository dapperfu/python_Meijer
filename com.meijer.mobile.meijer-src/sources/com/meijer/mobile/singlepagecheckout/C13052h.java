package com.meijer.mobile.singlepagecheckout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13052h {

    /* renamed from: a, reason: collision with root package name */
    public static final C13052h f119210a = new C13052h();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f119211b = ComposableLambdaKt.composableLambdaInstance(1518677060, false, a.f119212a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.h$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f119212a = new a();

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1518677060, i10, -1, "com.meijer.mobile.singlepagecheckout.ComposableSingletons$EditCartSubstitutionCardKt.lambda$1518677060.<anonymous> (EditCartSubstitutionCard.kt:255)");
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
        return f119211b;
    }
}
