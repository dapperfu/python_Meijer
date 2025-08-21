package com.meijer.mobile.meijer.activity.find;

import Ki.LocalThemeScope;
import V0.C5490r0;
import V0.C5494t0;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.C6484c;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12398n;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import f1.InterfaceC13938a;
import g1.InterfaceC14300c;
import j0.C14899c;
import j0.InterfaceC14900d;
import java.util.List;
import ki.InterfaceC15168f0;
import ki.q1;
import kotlin.C13931t;
import kotlin.C18051y;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;
import m5.C15669h;
import mv.InterfaceC15783O;
import p1.C16335d;
import p1.C16338g;
import qc.InterfaceC16624e;
import qc.PagerState;

@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u000f\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\r\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0001¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001c²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "disabled", "m", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "LKi/M;", "modifier", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$b;", "viewState", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a;", "", "onAction", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "com/meijer/mobile/meijer/activity/find/l0$a", "a", "Lcom/meijer/mobile/meijer/activity/find/l0$a;", "HorizontalScrollConsumer", "Lm5/h$a;", "builder", "isZoomedIn", "", "scale", "LU0/f;", "offset", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.l0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12221l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f107789a = new a();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b */
    static final class b implements Function3<InterfaceC15168f0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107790a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12398n.ViewState f107791b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PagerState f107792c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f107793d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<C15669h.a> f107794e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a */
        static final class a implements Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12398n.ViewState f107795a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f107796b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<C15669h.a> f107797c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.ImageDetailScreenKt$ImageDetailScreen$1$1$1$1$1", f = "ImageDetailScreen.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a$a, reason: collision with other inner class name */
            static final class C1621a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f107798a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5866i0 f107799b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f107800c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1621a(InterfaceC5866i0 interfaceC5866i0, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super C1621a> continuation) {
                    super(2, continuation);
                    this.f107799b = interfaceC5866i0;
                    this.f107800c = interfaceC5872l0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1621a(this.f107799b, this.f107800c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1621a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    boolean z10;
                    IntrinsicsKt.f();
                    if (this.f107798a == 0) {
                        ResultKt.b(obj);
                        InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f107800c;
                        if (a.f(this.f107799b) > 1.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        C12221l0.h(interfaceC5872l0, z10);
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a$b, reason: collision with other inner class name */
            static final class C1622b implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ProductImageViewModel f107801a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5866i0 f107802b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<U0.f> f107803c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C12398n.ViewState f107804d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<C15669h.a> f107805e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a$b$a, reason: collision with other inner class name */
                static final class C1623a implements PointerInputEventHandler {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5866i0 f107806a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14900d f107807b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<U0.f> f107808c;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.ImageDetailScreenKt$ImageDetailScreen$1$1$1$2$1$1$1", f = "ImageDetailScreen.kt", l = {139, 141}, m = "invokeSuspend")
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a$b$a$a, reason: collision with other inner class name */
                    static final class C1624a extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

                        /* renamed from: b, reason: collision with root package name */
                        int f107809b;

                        /* renamed from: c, reason: collision with root package name */
                        private /* synthetic */ Object f107810c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5866i0 f107811d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ InterfaceC14900d f107812e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5872l0<U0.f> f107813f;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1624a c1624a = new C1624a(this.f107811d, this.f107812e, this.f107813f, continuation);
                            c1624a.f107810c = obj;
                            return c1624a;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1624a(InterfaceC5866i0 interfaceC5866i0, InterfaceC14900d interfaceC14900d, InterfaceC5872l0<U0.f> interfaceC5872l0, Continuation<? super C1624a> continuation) {
                            super(2, continuation);
                            this.f107811d = interfaceC5866i0;
                            this.f107812e = interfaceC14900d;
                            this.f107813f = interfaceC5872l0;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
                        
                            if (r1 == r6) goto L15;
                         */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0049 -> B:16:0x004c). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                            /*
                                Method dump skipped, instructions count: 267
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.C12221l0.b.a.C1622b.C1623a.C1624a.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
                            return ((C1624a) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
                        }
                    }

                    C1623a(InterfaceC5866i0 interfaceC5866i0, InterfaceC14900d interfaceC14900d, InterfaceC5872l0<U0.f> interfaceC5872l0) {
                        this.f107806a = interfaceC5866i0;
                        this.f107807b = interfaceC14900d;
                        this.f107808c = interfaceC5872l0;
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
                        Object objD = C13931t.d(j10, new C1624a(this.f107806a, this.f107807b, this.f107808c, null), continuation);
                        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
                    }
                }

                C1622b(ProductImageViewModel productImageViewModel, InterfaceC5866i0 interfaceC5866i0, InterfaceC5872l0<U0.f> interfaceC5872l0, C12398n.ViewState bVar, InterfaceC5872l0<C15669h.a> interfaceC5872l02) {
                    this.f107801a = productImageViewModel;
                    this.f107802b = interfaceC5866i0;
                    this.f107803c = interfaceC5872l0;
                    this.f107804d = bVar;
                    this.f107805e = interfaceC5872l02;
                }

                public final void a(InterfaceC14900d BoxWithConstraints, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-422956172, i11, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ImageDetailScreen.kt:125)");
                    }
                    C15669h c15669hC = C12221l0.d(this.f107805e).f(this.f107801a.c()).c();
                    a5.h hVarA = a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                    String strE0 = this.f107801a.E0();
                    InterfaceC5926k interfaceC5926kD = InterfaceC5926k.INSTANCE.d();
                    Z0.c cVarC = C16335d.c(com.meijer.mobile.meijer.S.f99615z, composer, 0);
                    Z0.c cVarC2 = C16335d.c(com.meijer.mobile.meijer.S.f99615z, composer, 0);
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(BoxWithConstraints.g(Modifier.INSTANCE, P0.e.INSTANCE.e()), 0.0f, 1, null);
                    Unit unit = Unit.f143329a;
                    composer.startReplaceGroup(-1746271574);
                    boolean zV = ((i11 & 14) == 4) | composer.V(this.f107802b) | composer.V(this.f107803c);
                    InterfaceC5866i0 interfaceC5866i0 = this.f107802b;
                    InterfaceC5872l0<U0.f> interfaceC5872l0 = this.f107803c;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C1623a(interfaceC5866i0, BoxWithConstraints, interfaceC5872l0);
                        composer.t(objB);
                    }
                    composer.P();
                    Modifier modifierC = androidx.compose.ui.graphics.d.c(g1.U.c(modifierH, unit, (PointerInputEventHandler) objB), a.f(this.f107802b), a.f(this.f107802b), 0.0f, Float.intBitsToFloat((int) (a.k(this.f107803c) >> 32)), Float.intBitsToFloat((int) (a.k(this.f107803c) & 4294967295L)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131044, null);
                    C5490r0.Companion companion = C5490r0.INSTANCE;
                    float[] fArrB = C5494t0.b(null, 1, null);
                    C5494t0.d(fArrB, 0.66f);
                    C6484c.d(c15669hC, strE0, hVarA, modifierC, null, cVarC2, cVarC, null, null, null, null, interfaceC5926kD, this.f107804d.getLoadGrayScaleImage() ? 0.33f : 1.0f, this.f107804d.getLoadGrayScaleImage() ? companion.a(fArrB) : null, 0, false, null, composer, 0, 48, 116624);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
                    a(interfaceC14900d, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(C12398n.ViewState bVar, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<C15669h.a> interfaceC5872l02) {
                this.f107795a = bVar;
                this.f107796b = interfaceC5872l0;
                this.f107797c = interfaceC5872l02;
            }

            public final void e(InterfaceC16624e AdsHorizontalPager, int i10, Composer composer, int i11) {
                int i12;
                Intrinsics.j(AdsHorizontalPager, "$this$AdsHorizontalPager");
                if ((i11 & 48) == 0) {
                    i12 = i11 | (composer.d(i10) ? 32 : 16);
                } else {
                    i12 = i11;
                }
                if ((i12 & 145) == 144 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-209885302, i12, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailScreen.<anonymous>.<anonymous>.<anonymous> (ImageDetailScreen.kt:113)");
                }
                composer.startReplaceGroup(5004770);
                int i13 = i12 & 112;
                boolean z10 = i13 == 32;
                Object objB = composer.B();
                if (z10 || objB == Composer.INSTANCE.a()) {
                    objB = androidx.compose.runtime.A0.a(1.0f);
                    composer.t(objB);
                }
                InterfaceC5866i0 interfaceC5866i0 = (InterfaceC5866i0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean z11 = i13 == 32;
                Object objB2 = composer.B();
                if (z11 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = t1.e(U0.f.d(U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f)))), null, 2, null);
                    composer.t(objB2);
                }
                InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB2;
                composer.P();
                Float fValueOf = Float.valueOf(f(interfaceC5866i0));
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(interfaceC5866i0);
                InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f107796b;
                Object objB3 = composer.B();
                if (zV || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new C1621a(interfaceC5866i0, interfaceC5872l02, null);
                    composer.t(objB3);
                }
                composer.P();
                androidx.compose.runtime.J.g(fValueOf, (Function2) objB3, composer, 0);
                C14899c.a(androidx.compose.foundation.layout.J.c(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.8f), null, false, ComposableLambdaKt.c(-422956172, true, new C1622b(this.f107795a.d().get(i10), interfaceC5866i0, interfaceC5872l0, this.f107795a, this.f107797c), composer, 54), composer, 3078, 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16624e interfaceC16624e, Integer num, Composer composer, Integer num2) {
                e(interfaceC16624e, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float f(InterfaceC5866i0 interfaceC5866i0) {
                return interfaceC5866i0.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(InterfaceC5866i0 interfaceC5866i0, float f10) {
                interfaceC5866i0.A(f10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final long k(InterfaceC5872l0<U0.f> interfaceC5872l0) {
                return interfaceC5872l0.getValue().getPackedValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void l(InterfaceC5872l0<U0.f> interfaceC5872l0, long j10) {
                interfaceC5872l0.setValue(U0.f.d(j10));
            }
        }

        b(LocalThemeScope localThemeScope, C12398n.ViewState bVar, PagerState pagerState, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<C15669h.a> interfaceC5872l02) {
            this.f107790a = localThemeScope;
            this.f107791b = bVar;
            this.f107792c = pagerState;
            this.f107793d = interfaceC5872l0;
            this.f107794e = interfaceC5872l02;
        }

        public final void a(InterfaceC15168f0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-743904590, i10, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailScreen.<anonymous>.<anonymous> (ImageDetailScreen.kt:107)");
            }
            vi.g.e(this.f107790a, C12221l0.m(Modifier.INSTANCE, C12221l0.g(this.f107793d)), Assemble.getHorizontalPagerTemplate(), this.f107791b.d().size(), this.f107792c, ComposableLambdaKt.c(-209885302, true, new a(this.f107791b, this.f107793d, this.f107794e), composer, 54), composer, 196608 | LocalThemeScope.f17314g | (q1.HorizontalPagerTemplate.f142306h << 6));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15168f0 interfaceC15168f0, Composer composer, Integer num) {
            a(interfaceC15168f0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$c */
    static final class c implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<C12398n.a, Unit> f107814a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f107815b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super C12398n.a, Unit> function1, int i10) {
            this.f107814a = function1;
            this.f107815b = i10;
        }

        public final void a() {
            this.f107814a.invoke(new C12398n.a.UpdatePageNumber(this.f107815b));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProductImageViewModel f107816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f107817b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12398n.ViewState f107818c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f107819d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<C15669h.a> f107820e;

        d(ProductImageViewModel productImageViewModel, PagerState pagerState, C12398n.ViewState bVar, int i10, InterfaceC5872l0<C15669h.a> interfaceC5872l0) {
            this.f107816a = productImageViewModel;
            this.f107817b = pagerState;
            this.f107818c = bVar;
            this.f107819d = i10;
            this.f107820e = interfaceC5872l0;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1508117711, i10, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ImageDetailScreen.kt:217)");
            }
            C15669h c15669hC = C12221l0.d(this.f107820e).f(this.f107816a.getSmallImage().getUrl()).c();
            a5.h hVarA = a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            String strD = C16338g.d(com.meijer.mobile.meijer.Y.f100752Wh, new Object[]{Integer.valueOf(this.f107817b.k() + 1), Integer.valueOf(this.f107818c.d().size())}, composer, 0);
            InterfaceC5926k interfaceC5926kF = InterfaceC5926k.INSTANCE.f();
            Z0.c cVarC = C16335d.c(Cj.i.f4726O1, composer, 0);
            Z0.c cVarC2 = C16335d.c(Cj.i.f4726O1, composer, 0);
            Modifier modifierI = androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(60));
            C5490r0.Companion companion = C5490r0.INSTANCE;
            float[] fArrB = C5494t0.b(null, 1, null);
            C5494t0.d(fArrB, 0.66f);
            C6484c.d(c15669hC, strD, hVarA, modifierI, null, cVarC2, cVarC, null, null, null, null, interfaceC5926kF, this.f107818c.getCurrentIndex() != this.f107819d ? 0.33f : 1.0f, this.f107818c.getCurrentIndex() != this.f107819d ? companion.a(fArrB) : null, 0, false, null, composer, 3072, 48, 116624);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.ImageDetailScreenKt$ImageDetailScreen$1$3$1", f = "ImageDetailScreen.kt", l = {253}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107821a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f107822b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12398n.ViewState f107823c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f107822b, this.f107823c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(PagerState pagerState, C12398n.ViewState bVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f107822b = pagerState;
            this.f107823c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107821a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                PagerState pagerState = this.f107822b;
                int iC = this.f107823c.getCurrentIndex();
                this.f107821a = 1;
                if (PagerState.j(pagerState, iC, 0.0f, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.ImageDetailScreenKt$ImageDetailScreen$1$4$1", f = "ImageDetailScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107824a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f107825b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C12398n.a, Unit> f107826c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f107825b, this.f107826c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(PagerState pagerState, Function1<? super C12398n.a, Unit> function1, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f107825b = pagerState;
            this.f107826c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107824a == 0) {
                ResultKt.b(obj);
                if (!this.f107825b.b()) {
                    this.f107826c.invoke(new C12398n.a.PagerSwipe(this.f107825b.k()));
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$g */
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f107827f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(1);
            this.f107827f = list;
        }

        public final Object a(int i10) {
            this.f107827f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$h */
    public static final class h extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f107828f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f107829g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PagerState f107830h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C12398n.ViewState f107831i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f107832j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, Function1 function1, PagerState pagerState, C12398n.ViewState bVar, InterfaceC5872l0 interfaceC5872l0) {
            super(4);
            this.f107828f = list;
            this.f107829g = function1;
            this.f107830h = pagerState;
            this.f107831i = bVar;
            this.f107832j = interfaceC5872l0;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15433c) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            ProductImageViewModel productImageViewModel = (ProductImageViewModel) this.f107828f.get(i10);
            composer.startReplaceGroup(568909208);
            float f10 = 8;
            float fP = H1.h.p(f10);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f107829g) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new c(this.f107829g, i10);
                composer.t(objB);
            }
            composer.P();
            C18051y.a(androidx.compose.foundation.layout.D.k(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), 0.0f, H1.h.p(f10), 1, null), null, 0L, 0L, null, fP, ComposableLambdaKt.c(1508117711, true, new d(productImageViewModel, this.f107830h, this.f107831i, i10, this.f107832j), composer, 54), composer, 1769472, 30);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/meijer/activity/find/l0$a", "Lf1/a;", "LU0/f;", "available", "Lf1/e;", "source", "E1", "(JI)J", "LH1/y;", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$a */
    public static final class a implements InterfaceC13938a {
        @Override // f1.InterfaceC13938a
        public long E1(long available, int source) {
            return U0.f.g(available, 0.0f, 0.0f, 1, null);
        }

        @Override // f1.InterfaceC13938a
        public Object M1(long j10, Continuation<? super H1.y> continuation) {
            return H1.y.b(H1.y.e(j10, 0.0f, 0.0f, 1, null));
        }

        a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r31, androidx.compose.ui.Modifier r32, final com.meijer.mobile.meijer.activity.find.viewmodel.C12398n.ViewState r33, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.viewmodel.C12398n.a, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.C12221l0.c(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.find.viewmodel.n$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(C12398n.ViewState bVar, Function1 function1, PagerState pagerState, InterfaceC5872l0 interfaceC5872l0, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List<ProductImageViewModel> listD = bVar.d();
        LazyRow.i(listD.size(), null, new g(listD), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new h(listD, function1, pagerState, bVar, interfaceC5872l0)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, C12398n.ViewState bVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, bVar, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier m(Modifier modifier, boolean z10) {
        return z10 ? androidx.compose.ui.input.nestedscroll.a.b(modifier, f107789a, null, 2, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15669h.a d(InterfaceC5872l0<C15669h.a> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
