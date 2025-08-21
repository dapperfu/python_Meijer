package Qq;

import Ai.C2832m0;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.Q;
import P0.e;
import Qq.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import dk.C13698b;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.L0;
import ki.q1;
import kotlin.C17937B0;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oi.A0;
import oi.C16198u0;
import oi.P0;
import p1.C16338g;
import pi.C16453n;
import ri.C16912d;
import ws.C17917a;
import yk.C18328d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\n\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u001b²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "adjustEbtPaymentDecorator", "Lkotlin/Function0;", "", "onClose", "onCheckBalance", "Lkotlin/Function1;", "", "onSaveChanges", "c", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "enableSaveChangesButton", "onSaveChangesClicked", "m", "(LKi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "desiredAmount", "Lbk/a;", "errorMessage", "displayInputField", "isSaveButtonEnabled", "lastAction", "isEnableSave", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31298a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdjustEbtPaymentDecorator f31299b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Double, Unit> f31300c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f31301d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f31302e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f31303f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f31304g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f31305h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<AbstractC6392a> f31306i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f31307j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qq.e$a$a, reason: collision with other inner class name */
        static final class C0726a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f31308a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AdjustEbtPaymentDecorator f31309b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f31310c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qq.e$a$a$a, reason: collision with other inner class name */
            static final class C0727a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f31311a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f31312b;

                C0727a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator) {
                    this.f31311a = localThemeScope;
                    this.f31312b = adjustEbtPaymentDecorator;
                }

                public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1942340908, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:95)");
                    }
                    LocalThemeScope localThemeScope = this.f31311a;
                    q1.Label label = new q1.Label(null, this.f31311a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                    String strC = C16338g.c(Y.f100587O4, composer, 0);
                    int i11 = LocalThemeScope.f17314g;
                    int i12 = q1.Label.f142335j;
                    si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope2 = this.f31311a;
                    q1.Label label2 = new q1.Label(null, this.f31311a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 381, null);
                    AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f31312b;
                    si.j.h(localThemeScope2, label2, C13698b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getCurrentEbtCardBalance() : null, composer, AbstractC6392a.f60445b), null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope3 = this.f31311a;
                    si.j.h(localThemeScope3, new q1.Label(null, this.f31311a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getDetail().getOne(), null, 381, null), C16338g.c(Y.f100720V4, composer, 0), null, composer, i11 | (i12 << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    a(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(j0.InterfaceC14888I r14, androidx.compose.runtime.Composer r15, int r16) {
                /*
                    r13 = this;
                    r10 = r15
                    r0 = r16
                    java.lang.String r1 = "$this$AdsRow"
                    kotlin.jvm.internal.Intrinsics.j(r14, r1)
                    r1 = r0 & 17
                    r2 = 16
                    if (r1 != r2) goto L19
                    boolean r1 = r15.j()
                    if (r1 != 0) goto L15
                    goto L19
                L15:
                    r15.K()
                    return
                L19:
                    boolean r1 = androidx.compose.runtime.ComposerKt.M()
                    if (r1 == 0) goto L28
                    r1 = -1
                    java.lang.String r2 = "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:94)"
                    r3 = -1650808522(0xffffffff9d9aa936, float:-4.093842E-21)
                    androidx.compose.runtime.ComposerKt.U(r3, r0, r1, r2)
                L28:
                    Ki.M r0 = r13.f31308a
                    ki.q1$e r1 = new ki.q1$e
                    r5 = 7
                    r6 = 0
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r1.<init>(r2, r3, r4, r5, r6)
                    Qq.e$a$a$a r2 = new Qq.e$a$a$a
                    Ki.M r3 = r13.f31308a
                    com.meijer.mobile.meijer.activity.checkout.review.p r4 = r13.f31309b
                    r2.<init>(r3, r4)
                    r3 = 54
                    r4 = 1942340908(0x73c5c52c, float:3.133794E31)
                    r5 = 1
                    androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r4, r5, r2, r15, r3)
                    int r3 = Ki.LocalThemeScope.f17314g
                    r4 = r3 | 384(0x180, float:5.38E-43)
                    int r6 = ki.q1.Column.f142240d
                    int r6 = r6 << 3
                    r4 = r4 | r6
                    pi.C16453n.e(r0, r1, r2, r15, r4)
                    oi.A0 r1 = oi.A0.f153872a
                    int r0 = com.meijer.mobile.meijer.Y.f100549M4
                    r2 = 0
                    java.lang.String r0 = p1.C16338g.c(r0, r15, r2)
                    com.meijer.mobile.meijer.activity.checkout.review.p r4 = r13.f31309b
                    r6 = 0
                    if (r4 == 0) goto L66
                    bk.a r4 = r4.getCurrentEbtCardBalance()
                    goto L67
                L66:
                    r4 = r6
                L67:
                    boolean r4 = bk.C6393b.a(r4)
                    if (r4 != 0) goto L89
                    com.meijer.mobile.meijer.activity.checkout.review.p r4 = r13.f31309b
                    if (r4 == 0) goto L75
                    bk.a r6 = r4.getCurrentEbtCardBalance()
                L75:
                    bk.a$a r4 = bk.AbstractC6392a.INSTANCE
                    int r7 = com.meijer.mobile.meijer.Y.f100758X4
                    java.lang.Object[] r8 = new java.lang.Object[r2]
                    bk.a r4 = r4.d(r7, r8)
                    boolean r4 = kotlin.jvm.internal.Intrinsics.e(r6, r4)
                    if (r4 == 0) goto L86
                    goto L89
                L86:
                    r9 = r2
                L87:
                    r2 = r0
                    goto L8b
                L89:
                    r9 = r5
                    goto L87
                L8b:
                    Ki.M r0 = r13.f31308a
                    r4 = 5004770(0x4c5de2, float:7.013177E-39)
                    r15.startReplaceGroup(r4)
                    kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r13.f31310c
                    boolean r4 = r15.V(r4)
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r13.f31310c
                    java.lang.Object r6 = r15.B()
                    if (r4 != 0) goto La9
                    androidx.compose.runtime.Composer$a r4 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r4 = r4.a()
                    if (r6 != r4) goto Lb1
                La9:
                    Qq.d r6 = new Qq.d
                    r6.<init>()
                    r15.t(r6)
                Lb1:
                    kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                    r15.P()
                    int r4 = oi.A0.f153873b
                    int r4 = r4 << 3
                    r11 = r3 | r4
                    r12 = 120(0x78, float:1.68E-43)
                    r4 = 0
                    r5 = 0
                    r3 = r6
                    r6 = 0
                    r7 = 0
                    oi.P0.k(r0, r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
                    boolean r0 = androidx.compose.runtime.ComposerKt.M()
                    if (r0 == 0) goto Ld0
                    androidx.compose.runtime.ComposerKt.T()
                Ld0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Qq.e.a.C0726a.b(j0.I, androidx.compose.runtime.Composer, int):void");
            }

            C0726a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function0) {
                this.f31308a = localThemeScope;
                this.f31309b = adjustEbtPaymentDecorator;
                this.f31310c = function0;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                b(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f31313a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AdjustEbtPaymentDecorator f31314b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f31315c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qq.e$a$b$a, reason: collision with other inner class name */
            static final class C0728a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f31316a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f31317b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f31318c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qq.e$a$b$a$a, reason: collision with other inner class name */
                static final class C0729a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f31319a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AdjustEbtPaymentDecorator f31320b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f31321c;

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
                        e.l(interfaceC5872l0, true);
                        return Unit.f143329a;
                    }

                    C0729a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        this.f31319a = localThemeScope;
                        this.f31320b = adjustEbtPaymentDecorator;
                        this.f31321c = interfaceC5872l0;
                    }

                    public final void b(InterfaceC14888I AdsRow, Composer composer, int i10) {
                        AbstractC6392a currentEbtCardBalance;
                        Intrinsics.j(AdsRow, "$this$AdsRow");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-777939357, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:186)");
                        }
                        LocalThemeScope localThemeScope = this.f31319a;
                        q1.Label label = new q1.Label(null, this.f31319a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f31320b;
                        String strA = C13698b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getEbtApprovedAmount() : null, composer, AbstractC6392a.f60445b);
                        int i11 = LocalThemeScope.f17314g;
                        si.j.h(localThemeScope, label, strA, null, composer, i11 | (q1.Label.f142335j << 3), 4);
                        if (!e.k(this.f31321c)) {
                            AdjustEbtPaymentDecorator adjustEbtPaymentDecorator2 = this.f31320b;
                            boolean z10 = (adjustEbtPaymentDecorator2 == null || (currentEbtCardBalance = adjustEbtPaymentDecorator2.getCurrentEbtCardBalance()) == null || !(Intrinsics.e(currentEbtCardBalance, AbstractC6392a.INSTANCE.d(Y.f100758X4, new Object[0])) ^ true)) ? false : true;
                            A0 a02 = A0.f153872a;
                            String strC = C16338g.c(Y.f100530L4, composer, 0);
                            LocalThemeScope localThemeScope2 = this.f31319a;
                            composer.startReplaceGroup(5004770);
                            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f31321c;
                            Object objB = composer.B();
                            if (objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: Qq.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return e.a.b.C0728a.C0729a.c(interfaceC5872l0);
                                    }
                                };
                                composer.t(objB);
                            }
                            composer.P();
                            P0.k(localThemeScope2, a02, strC, (Function0) objB, null, null, false, 0L, z10, composer, i11 | 3072 | (A0.f153873b << 3), BinsView.TOTE_HEIGHT_DP);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        b(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                C0728a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                    this.f31316a = localThemeScope;
                    this.f31317b = adjustEbtPaymentDecorator;
                    this.f31318c = interfaceC5872l0;
                }

                public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1211112797, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:170)");
                    }
                    LocalThemeScope localThemeScope = this.f31316a;
                    q1.Label label = new q1.Label(null, this.f31316a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                    String strC = C16338g.c(Y.f100568N4, composer, 0);
                    int i11 = LocalThemeScope.f17314g;
                    si.j.h(localThemeScope, label, strC, null, composer, i11 | (q1.Label.f142335j << 3), 4);
                    C16453n.i(this.f31316a, new q1.Row(J.h(Modifier.INSTANCE, 0.0f, 1, null), C5800d.f48779a.e(), P0.e.INSTANCE.i()), ComposableLambdaKt.c(-777939357, true, new C0729a(this.f31316a, this.f31317b, this.f31318c), composer, 54), composer, i11 | 384 | (q1.Row.f142392d << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    a(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            b(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f31313a = localThemeScope;
                this.f31314b = adjustEbtPaymentDecorator;
                this.f31315c = interfaceC5872l0;
            }

            public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1074009043, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:169)");
                }
                C16453n.e(this.f31313a, new q1.Column(null, null, null, 7, null), ComposableLambdaKt.c(-1211112797, true, new C0728a(this.f31313a, this.f31314b, this.f31315c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f31322a;

            c(LocalThemeScope localThemeScope) {
                this.f31322a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(322959697, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:225)");
                }
                LocalThemeScope localThemeScope = this.f31322a;
                q1.Label label = new q1.Label(null, this.f31322a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 381, null);
                String strC = C16338g.c(Y.f100625Q4, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f31322a;
                I one = localThemeScope2.getAdsTypography().getDetail().getOne();
                si.j.h(localThemeScope2, new q1.Label(D.m(Modifier.INSTANCE, this.f31322a.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f31322a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, one, null, 380, null), C16338g.c(Y.f100682T4, composer, 0), null, composer, i11 | (i12 << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f31323a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f31324b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AdjustEbtPaymentDecorator f31325c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f31326d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<AbstractC6392a> f31327e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f31328f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qq.e$a$d$a, reason: collision with other inner class name */
            static final class C0730a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f31329a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15153W f31330b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC6392a f31331c;

                C0730a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, AbstractC6392a abstractC6392a) {
                    this.f31329a = localThemeScope;
                    this.f31330b = interfaceC15153W;
                    this.f31331c = abstractC6392a;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1502246721, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:295)");
                    }
                    si.j.h(this.f31329a, this.f31330b.getLabels().getInfoBlockMessage(), C13698b.a(this.f31331c, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
            public static final int p() {
                return 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int q() {
                return 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int r() {
                return 0;
            }

            d(LocalThemeScope localThemeScope, InterfaceC5914o interfaceC5914o, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<AbstractC6392a> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03) {
                this.f31323a = localThemeScope;
                this.f31324b = interfaceC5914o;
                this.f31325c = adjustEbtPaymentDecorator;
                this.f31326d = interfaceC5872l0;
                this.f31327e = interfaceC5872l02;
                this.f31328f = interfaceC5872l03;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q1.f.TextInput k(LocalThemeScope localThemeScope, final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
                Intrinsics.j(template, "template");
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.b(), 0, null, null, null, 123, null);
                C5835z c5835z = new C5835z(new Function1() { // from class: Qq.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e.a.d.l(interfaceC5914o, (InterfaceC5834y) obj);
                    }
                }, null, null, null, null, null, 62, null);
                return q1.f.TextInput.y(template, null, false, null, localThemeScope.getAdsTypography().getBodyCompact().getOne(), new C17917a(null, 0, 3, null), keyboardOptions, c5835z, false, 0, null, null, null, 3975, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, String amount) {
                String str;
                Double maxEbtPaymentAllowed;
                Intrinsics.j(amount, "amount");
                AbstractC6392a minEbtAmountErrorMessage = null;
                if (amount.length() == 0 || StringsKt.W(amount, ".", false, 2, null)) {
                    e.h(interfaceC5872l0, "");
                    e.f(interfaceC5872l02, false);
                    str = amount;
                } else {
                    str = amount;
                    e.h(interfaceC5872l0, StringsKt.Q(str, ".", "", false, 4, null));
                    e.f(interfaceC5872l02, true);
                }
                if (e.d(interfaceC5872l0).length() != 0 && C18328d.b(StringsKt.v(e.d(interfaceC5872l0)), new Function0() { // from class: Qq.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(e.a.d.p());
                    }
                }) >= 1) {
                    if (C18328d.b(StringsKt.v(str), new Function0() { // from class: Qq.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(e.a.d.q());
                        }
                    }) > C18328d.b((adjustEbtPaymentDecorator == null || (maxEbtPaymentAllowed = adjustEbtPaymentDecorator.getMaxEbtPaymentAllowed()) == null) ? null : Integer.valueOf((int) (maxEbtPaymentAllowed.doubleValue() * 100)), new Function0() { // from class: Qq.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(e.a.d.r());
                        }
                    }) && adjustEbtPaymentDecorator != null) {
                        minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMaxEbtAmountErrorMessage();
                    }
                } else if (adjustEbtPaymentDecorator != null) {
                    minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMinEbtAmountErrorMessage();
                }
                e.j(interfaceC5872l03, minEbtAmountErrorMessage);
                return Unit.f143329a;
            }

            public final void g(InterfaceC15153W Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-445166906, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous>.<anonymous> (AdjustEbtPaymentContentSpc.kt:243)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierD = C17937B0.d(D.k(J.h(companion, 0.0f, 1, null), this.f31323a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null));
                String strD = e.d(this.f31326d);
                DefaultTextInputs inputFields = Assemble.getInputFields();
                boolean z10 = e.i(this.f31327e) != null;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f31324b) | composer.D(this.f31323a);
                final LocalThemeScope localThemeScope = this.f31323a;
                final InterfaceC5914o interfaceC5914o = this.f31324b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Qq.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return e.a.d.k(localThemeScope, interfaceC5914o, (q1.f.TextInput) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB, 6, null);
                LocalThemeScope localThemeScope2 = this.f31323a;
                composer.startReplaceGroup(-1224400529);
                boolean zD2 = composer.D(this.f31325c);
                final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f31325c;
                final InterfaceC5872l0<String> interfaceC5872l0 = this.f31326d;
                final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f31328f;
                final InterfaceC5872l0<AbstractC6392a> interfaceC5872l03 = this.f31327e;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: Qq.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return e.a.d.o(adjustEbtPaymentDecorator, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, (String) obj);
                        }
                    };
                    composer.t(objB2);
                }
                Function1 function1 = (Function1) objB2;
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                C2832m0.i(localThemeScope2, strD, textInputF, modifierD, function1, null, composer, i11 | (q1.f.TextInput.f142293m << 6), 16);
                AbstractC6392a abstractC6392aI = e.i(this.f31327e);
                if (abstractC6392aI != null) {
                    LocalThemeScope localThemeScope3 = this.f31323a;
                    C16912d.e(localThemeScope3, q1.InfoBlock.y(Assemble.getInfoBlocks().getErrorBlock(), D.m(companion, localThemeScope3.getAdsSpacing().getFive().getDp(), localThemeScope3.getAdsSpacing().getTwo().getDp(), localThemeScope3.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, 2, null), ComposableLambdaKt.c(1502246721, true, new C0730a(localThemeScope3, Assemble, abstractC6392aI), composer, 54), composer, i11 | 384 | (q1.InfoBlock.f142332c << 3));
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
                g(interfaceC15153W, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1<? super Double, Unit> function1, Function0<Unit> function0, InterfaceC5914o interfaceC5914o, Function0<Unit> function02, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02, InterfaceC5872l0<AbstractC6392a> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04) {
            this.f31298a = localThemeScope;
            this.f31299b = adjustEbtPaymentDecorator;
            this.f31300c = function1;
            this.f31301d = function0;
            this.f31302e = interfaceC5914o;
            this.f31303f = function02;
            this.f31304g = interfaceC5872l0;
            this.f31305h = interfaceC5872l02;
            this.f31306i = interfaceC5872l03;
            this.f31307j = interfaceC5872l04;
        }

        public final void b(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Modifier.Companion companion;
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-114145930, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc.<anonymous> (AdjustEbtPaymentContentSpc.kt:81)");
            }
            LocalThemeScope localThemeScope = this.f31298a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM = D.m(J.h(companion2, 0.0f, 1, null), this.f31298a.getAdsSpacing().getFive().getDp(), this.f31298a.getAdsSpacing().getFive().getDp(), this.f31298a.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
            e.Companion companion3 = P0.e.INSTANCE;
            e.c cVarI = companion3.i();
            C5800d c5800d = C5800d.f48779a;
            q1.Row row = new q1.Row(modifierM, c5800d.e(), cVarI);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1650808522, true, new C0726a(this.f31298a, this.f31299b, this.f31303f), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Row.f142392d;
            C16453n.i(localThemeScope, row, composableLambdaC, composer, i11 | 384 | (i12 << 3));
            C17983Z.a(D.i(companion2, this.f31298a.getAdsSpacing().getFive().getDp()), this.f31298a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            LocalThemeScope localThemeScope2 = this.f31298a;
            q1.Label label = new q1.Label(D.m(companion2, this.f31298a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f31298a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getValues().getThree(), null, 380, null);
            String strC = C16338g.c(Y.f100606P4, composer, 0);
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope2, label, strC, null, composer, i11 | (i13 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f31298a;
            q1.Label label2 = new q1.Label(D.m(companion2, this.f31298a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f31298a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getOne(), null, 380, null);
            AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f31299b;
            si.j.h(localThemeScope3, label2, C13698b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getEligibleEbtItemTotal() : null, composer, AbstractC6392a.f60445b), null, composer, i11 | (i13 << 3), 4);
            C17983Z.a(D.i(companion2, this.f31298a.getAdsSpacing().getFive().getDp()), this.f31298a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            C16453n.i(this.f31298a, new q1.Row(D.k(J.h(companion2, 0.0f, 1, null), this.f31298a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), c5800d.e(), companion3.i()), ComposableLambdaKt.c(-1074009043, true, new b(this.f31298a, this.f31299b, this.f31304g), composer, 54), composer, i11 | 384 | (i12 << 3));
            composer.startReplaceGroup(1975086793);
            if (e.k(this.f31304g)) {
                companion = companion2;
                C16453n.i(this.f31298a, new q1.Row(D.m(companion2, this.f31298a.getAdsSpacing().getFive().getDp(), this.f31298a.getAdsSpacing().getThree().getDp(), 0.0f, this.f31298a.getAdsSpacing().getThree().getDp(), 4, null), null, companion3.i(), 2, null), ComposableLambdaKt.c(322959697, true, new c(this.f31298a), composer, 54), composer, i11 | 384 | (i12 << 3));
                LocalThemeScope localThemeScope4 = this.f31298a;
                Q.e(localThemeScope4, L0.f141930a, ComposableLambdaKt.c(-445166906, true, new d(localThemeScope4, this.f31302e, this.f31299b, this.f31305h, this.f31306i, this.f31307j), composer, 54), composer, i11 | 384 | (L0.f141931b << 3));
            } else {
                companion = companion2;
            }
            composer.P();
            LocalThemeScope localThemeScope5 = this.f31298a;
            boolean z10 = e.i(this.f31306i) == null && e.e(this.f31307j);
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(this.f31299b) | composer.V(this.f31300c) | composer.V(this.f31301d) | composer.D(this.f31302e);
            final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator2 = this.f31299b;
            final Function1<Double, Unit> function1 = this.f31300c;
            final Function0<Unit> function0 = this.f31301d;
            final InterfaceC5914o interfaceC5914o = this.f31302e;
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f31305h;
            final InterfaceC5872l0<AbstractC6392a> interfaceC5872l02 = this.f31306i;
            final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f31304g;
            final InterfaceC5872l0<Boolean> interfaceC5872l04 = this.f31307j;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Qq.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.a.c(adjustEbtPaymentDecorator2, function1, function0, interfaceC5914o, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, interfaceC5872l04);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            e.m(localThemeScope5, companion, z10, (Function0) objB, composer, i11 | 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            b(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1 function1, Function0 function0, InterfaceC5914o interfaceC5914o, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, InterfaceC5872l0 interfaceC5872l04) {
            double dDoubleValue;
            Double dT = StringsKt.t(e.d(interfaceC5872l0));
            if (dT != null) {
                dDoubleValue = dT.doubleValue() / 100;
            } else {
                dDoubleValue = 0.0d;
            }
            AbstractC6392a minEbtAmountErrorMessage = null;
            if (dDoubleValue < 0.01d) {
                if (adjustEbtPaymentDecorator != null) {
                    minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMinEbtAmountErrorMessage();
                }
                e.j(interfaceC5872l02, minEbtAmountErrorMessage);
            } else {
                function1.invoke(Double.valueOf(dDoubleValue));
                function0.invoke();
                e.l(interfaceC5872l03, false);
                e.f(interfaceC5872l04, false);
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31332a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f31333b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31334c;

        b(LocalThemeScope localThemeScope, Function0<Unit> function0, boolean z10) {
            this.f31332a = localThemeScope;
            this.f31333b = function0;
            this.f31334c = z10;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-53933627, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.ButtonSection.<anonymous> (AdjustEbtPaymentContentSpc.kt:330)");
            }
            long color = this.f31332a.getAdsColors().getAdsColorUIDivider().getColor();
            Modifier.Companion companion = Modifier.INSTANCE;
            C17983Z.a(D.k(companion, 0.0f, this.f31332a.getAdsSpacing().getFive().getDp(), 1, null), color, 0.0f, 0.0f, composer, 0, 12);
            Modifier modifierK = D.k(J.h(companion, 0.0f, 1, null), this.f31332a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            P0.k(this.f31332a, C16198u0.f154260a, C16338g.c(Y.f100701U4, composer, 0), this.f31333b, modifierK, null, false, 0L, this.f31334c, composer, LocalThemeScope.f17314g | (C16198u0.f154261b << 3), 112);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void c(LocalThemeScope localThemeScope, final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, final Function0<Unit> onClose, final Function0<Unit> onCheckBalance, final Function1<? super Double, Unit> onSaveChanges, Composer composer, final int i10) {
        int i11;
        AbstractC6392a currentEbtCardBalance;
        Double initialEbtPaymentAmount;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Intrinsics.j(onClose, "onClose");
        Intrinsics.j(onCheckBalance, "onCheckBalance");
        Intrinsics.j(onSaveChanges, "onSaveChanges");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1637299328);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(adjustEbtPaymentDecorator) : composerStartRestartGroup.D(adjustEbtPaymentDecorator) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onClose) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onCheckBalance) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onSaveChanges) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1637299328, i12, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.AdjustEbtPaymentContentSpc (AdjustEbtPaymentContentSpc.kt:60)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                String string = (adjustEbtPaymentDecorator == null || (initialEbtPaymentAmount = adjustEbtPaymentDecorator.getInitialEbtPaymentAmount()) == null) ? null : Integer.valueOf((int) (initialEbtPaymentAmount.doubleValue() * 100)).toString();
                if (string == null) {
                    string = "";
                }
                objB = t1.e(string, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(null, null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) objB3;
            composerStartRestartGroup.P();
            InterfaceC5914o interfaceC5914o = (InterfaceC5914o) composerStartRestartGroup.o(C6034t0.h());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion.a()) {
                boolean z10 = false;
                if (adjustEbtPaymentDecorator != null && (currentEbtCardBalance = adjustEbtPaymentDecorator.getCurrentEbtCardBalance()) != null && (!Intrinsics.e(currentEbtCardBalance, AbstractC6392a.INSTANCE.d(Y.f100758X4, new Object[0])))) {
                    z10 = true;
                }
                objB4 = t1.e(Boolean.valueOf(z10), null, 2, null);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            C16453n.e(localThemeScope2, new q1.Column(D.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), null, null, 6, null), ComposableLambdaKt.c(-114145930, true, new a(localThemeScope2, adjustEbtPaymentDecorator, onSaveChanges, onClose, interfaceC5914o, onCheckBalance, interfaceC5872l03, interfaceC5872l0, interfaceC5872l02, (InterfaceC5872l0) objB4), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i12 & 14) | (q1.Column.f142240d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qq.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.g(localThemeScope2, adjustEbtPaymentDecorator, onClose, onCheckBalance, onSaveChanges, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0 function0, Function0 function02, Function1 function1, int i10, Composer composer, int i11) {
        c(localThemeScope, adjustEbtPaymentDecorator, function0, function02, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, boolean r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qq.e.m(Ki.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, z10, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6392a i(InterfaceC5872l0<AbstractC6392a> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5872l0<AbstractC6392a> interfaceC5872l0, AbstractC6392a abstractC6392a) {
        interfaceC5872l0.setValue(abstractC6392a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
