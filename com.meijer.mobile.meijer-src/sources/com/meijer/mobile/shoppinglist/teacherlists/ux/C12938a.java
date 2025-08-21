package com.meijer.mobile.shoppinglist.teacherlists.ux;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.C14890K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C12938a {

    /* renamed from: a, reason: collision with root package name */
    public static final C12938a f118242a = new C12938a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC15433c, Composer, Integer, Unit> f118243b = ComposableLambdaKt.composableLambdaInstance(-502304634, false, C1904a.f118244a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.a$a, reason: collision with other inner class name */
    static final class C1904a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1904a f118244a = new C1904a();

        C1904a() {
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-502304634, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.ComposableSingletons$TeacherListsComposablesKt.lambda$-502304634.<anonymous> (TeacherListsComposables.kt:917)");
            }
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(54)), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public final Function3<InterfaceC15433c, Composer, Integer, Unit> a() {
        return f118243b;
    }
}
