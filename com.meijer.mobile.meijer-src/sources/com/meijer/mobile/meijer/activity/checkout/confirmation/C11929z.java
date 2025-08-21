package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Ki.LocalThemeScope;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator;
import j0.C14903g;
import java.util.List;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "Ld0/V;", "verticalScrollState", "Landroidx/compose/ui/Modifier;", "modifier", "", "g", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;Ld0/V;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$b;", "faqItem", "", "index", "lastIndex", "d", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$b;IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11929z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.z$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103168a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f103169b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0.V f103170c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OrderConfirmationDecorator f103171d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationFaqSectionKt$OrderConfirmationFaqSection$1$2$1", f = "OrderConfirmationFaqSection.kt", l = {71}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.z$a$a, reason: collision with other inner class name */
        static final class C1444a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f103172a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0.V f103173b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1444a(this.f103173b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1444a(d0.V v10, Continuation<? super C1444a> continuation) {
                super(2, continuation);
                this.f103173b = v10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1444a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f103172a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    d0.V v10 = this.f103173b;
                    int iN = v10.n() * this.f103173b.n();
                    this.f103172a = 1;
                    if (d0.V.l(v10, iN, null, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Modifier modifier, d0.V v10, OrderConfirmationDecorator orderConfirmationDecorator) {
            this.f103168a = localThemeScope;
            this.f103169b = modifier;
            this.f103170c = v10;
            this.f103171d = orderConfirmationDecorator;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-340952119, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationFaqSection.<anonymous> (OrderConfirmationFaqSection.kt:55)");
            }
            Composer composer2 = composer;
            C17983Z.a(null, this.f103168a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(this.f103169b, 0.0f, 1, null);
            OrderConfirmationDecorator orderConfirmationDecorator = this.f103171d;
            LocalThemeScope localThemeScope = this.f103168a;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer2, 0);
            int iA = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierH);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = D1.a(composer2);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            List<OrderConfirmationDecorator.FaqItemDecorator> listR = orderConfirmationDecorator != null ? orderConfirmationDecorator.r() : null;
            composer2.startReplaceGroup(-296440393);
            if (listR != null) {
                int i11 = 0;
                for (Object obj : listR) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.w();
                    }
                    LocalThemeScope localThemeScope2 = localThemeScope;
                    C11929z.d(localThemeScope2, (OrderConfirmationDecorator.FaqItemDecorator) obj, i11, CollectionsKt.o(orderConfirmationDecorator.r()), null, composer2, (AbstractC6392a.f60445b << 3) | LocalThemeScope.f17314g, 8);
                    composer2 = composer;
                    localThemeScope = localThemeScope2;
                    i11 = i12;
                }
            }
            LocalThemeScope localThemeScope3 = localThemeScope;
            composer.P();
            C17983Z.a(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, localThemeScope3.getAdsSpacing().getFive().getDp(), 7, null), localThemeScope3.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            composer.v();
            Boolean bool = Boolean.TRUE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f103170c);
            d0.V v10 = this.f103170c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C1444a(v10, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB, composer, 6);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r39, final com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator.FaqItemDecorator r40, final int r41, final int r42, androidx.compose.ui.Modifier r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.C11929z.d(Ki.M, com.meijer.mobile.meijer.activity.checkout.confirmation.p$b, int, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, Context context) {
        if (str != null) {
            context.startActivity(new Intent("android.intent.action.DIAL"));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, OrderConfirmationDecorator.FaqItemDecorator faqItemDecorator, int i10, int i11, Modifier modifier, int i12, int i13, Composer composer, int i14) {
        d(localThemeScope, faqItemDecorator, i10, i11, modifier, composer, J0.a(i12 | 1), i13);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r15, final com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator r16, final d0.V r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.C11929z.g(Ki.M, com.meijer.mobile.meijer.activity.checkout.confirmation.p, d0.V, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, d0.V v10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, orderConfirmationDecorator, v10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
