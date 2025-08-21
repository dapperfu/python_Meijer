package com.meijer.mobile.authentication.okta.ux;

import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.authentication.okta.ux.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11714e {

    /* renamed from: a, reason: collision with root package name */
    public static final C11714e f96166a = new C11714e();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14882C, Composer, Integer, Unit> f96167b = ComposableLambdaKt.composableLambdaInstance(22084416, false, a.f96168a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.authentication.okta.ux.e$a */
    static final class a implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f96168a = new a();

        a() {
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(22084416, i10, -1, "com.meijer.mobile.authentication.okta.ux.ComposableSingletons$OktaLoginActivityKt.lambda$22084416.<anonymous> (OktaLoginActivity.kt:128)");
            }
            C5804h.a(J.f(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public final Function3<InterfaceC14882C, Composer, Integer, Unit> a() {
        return f96167b;
    }
}
