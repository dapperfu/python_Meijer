package com.meijer.mobile.meijer.activity.find;

import Ji.LocalThemeScope;
import V0.C5347r0;
import V0.C5351t0;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.C6197c;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12273n;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import f1.InterfaceC13828a;
import g1.InterfaceC14171c;
import j0.C14811c;
import j0.InterfaceC14812d;
import java.util.List;
import ji.InterfaceC14934f0;
import ji.q1;
import kotlin.C13821t;
import kotlin.C17985y;
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
import l0.InterfaceC15343c;
import l5.C15372h;
import oc.InterfaceC16016e;
import oc.PagerState;
import p1.C16190d;
import p1.C16193g;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u000f\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\r\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0001¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001c²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "disabled", "m", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "LJi/M;", "modifier", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$b;", "viewState", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a;", "", "onAction", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "com/meijer/mobile/meijer/activity/find/l0$a", "a", "Lcom/meijer/mobile/meijer/activity/find/l0$a;", "HorizontalScrollConsumer", "Ll5/h$a;", "builder", "isZoomedIn", "", "scale", "LU0/f;", "offset", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.l0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12096l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f106933a = new a();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b */
    static final class b implements Function3<InterfaceC14934f0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f106934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12273n.ViewState f106935b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PagerState f106936c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f106937d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<C15372h.a> f106938e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a */
        static final class a implements Function4<InterfaceC16016e, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12273n.ViewState f106939a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f106940b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<C15372h.a> f106941c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.ImageDetailScreenKt$ImageDetailScreen$1$1$1$1$1", f = "ImageDetailScreen.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a$a, reason: collision with other inner class name */
            static final class C1612a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f106942a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5724i0 f106943b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f106944c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1612a(InterfaceC5724i0 interfaceC5724i0, InterfaceC5730l0<Boolean> interfaceC5730l0, Continuation<? super C1612a> continuation) {
                    super(2, continuation);
                    this.f106943b = interfaceC5724i0;
                    this.f106944c = interfaceC5730l0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1612a(this.f106943b, this.f106944c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1612a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    boolean z10;
                    IntrinsicsKt.f();
                    if (this.f106942a == 0) {
                        ResultKt.b(obj);
                        InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f106944c;
                        if (a.f(this.f106943b) > 1.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        C12096l0.h(interfaceC5730l0, z10);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a$b, reason: collision with other inner class name */
            static final class C1613b implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ProductImageViewModel f106945a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5724i0 f106946b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<U0.f> f106947c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C12273n.ViewState f106948d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<C15372h.a> f106949e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a$b$a, reason: collision with other inner class name */
                static final class C1614a implements PointerInputEventHandler {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5724i0 f106950a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14812d f106951b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<U0.f> f106952c;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.ImageDetailScreenKt$ImageDetailScreen$1$1$1$2$1$1$1", f = "ImageDetailScreen.kt", l = {139, 141}, m = "invokeSuspend")
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$b$a$b$a$a, reason: collision with other inner class name */
                    static final class C1615a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

                        /* renamed from: b, reason: collision with root package name */
                        int f106953b;

                        /* renamed from: c, reason: collision with root package name */
                        private /* synthetic */ Object f106954c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5724i0 f106955d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ InterfaceC14812d f106956e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5730l0<U0.f> f106957f;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1615a c1615a = new C1615a(this.f106955d, this.f106956e, this.f106957f, continuation);
                            c1615a.f106954c = obj;
                            return c1615a;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1615a(InterfaceC5724i0 interfaceC5724i0, InterfaceC14812d interfaceC14812d, InterfaceC5730l0<U0.f> interfaceC5730l0, Continuation<? super C1615a> continuation) {
                            super(2, continuation);
                            this.f106955d = interfaceC5724i0;
                            this.f106956e = interfaceC14812d;
                            this.f106957f = interfaceC5730l0;
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
                            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.C12096l0.b.a.C1613b.C1614a.C1615a.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                            return ((C1615a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
                        }
                    }

                    C1614a(InterfaceC5724i0 interfaceC5724i0, InterfaceC14812d interfaceC14812d, InterfaceC5730l0<U0.f> interfaceC5730l0) {
                        this.f106950a = interfaceC5724i0;
                        this.f106951b = interfaceC14812d;
                        this.f106952c = interfaceC5730l0;
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
                        Object objD = C13821t.d(j10, new C1615a(this.f106950a, this.f106951b, this.f106952c, null), continuation);
                        return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
                    }
                }

                C1613b(ProductImageViewModel productImageViewModel, InterfaceC5724i0 interfaceC5724i0, InterfaceC5730l0<U0.f> interfaceC5730l0, C12273n.ViewState bVar, InterfaceC5730l0<C15372h.a> interfaceC5730l02) {
                    this.f106945a = productImageViewModel;
                    this.f106946b = interfaceC5724i0;
                    this.f106947c = interfaceC5730l0;
                    this.f106948d = bVar;
                    this.f106949e = interfaceC5730l02;
                }

                public final void a(InterfaceC14812d BoxWithConstraints, Composer composer, int i10) {
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
                    C15372h c15372hC = C12096l0.d(this.f106949e).f(this.f106945a.c()).c();
                    Z4.h hVarA = Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                    String strF0 = this.f106945a.F0();
                    InterfaceC5784k interfaceC5784kD = InterfaceC5784k.INSTANCE.d();
                    Z0.c cVarC = C16190d.c(com.meijer.mobile.meijer.S.f98758z, composer, 0);
                    Z0.c cVarC2 = C16190d.c(com.meijer.mobile.meijer.S.f98758z, composer, 0);
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(BoxWithConstraints.g(Modifier.INSTANCE, P0.e.INSTANCE.e()), 0.0f, 1, null);
                    Unit unit = Unit.f142422a;
                    composer.startReplaceGroup(-1746271574);
                    boolean zV = ((i11 & 14) == 4) | composer.V(this.f106946b) | composer.V(this.f106947c);
                    InterfaceC5724i0 interfaceC5724i0 = this.f106946b;
                    InterfaceC5730l0<U0.f> interfaceC5730l0 = this.f106947c;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C1614a(interfaceC5724i0, BoxWithConstraints, interfaceC5730l0);
                        composer.t(objB);
                    }
                    composer.P();
                    Modifier modifierC = androidx.compose.ui.graphics.d.c(g1.U.c(modifierH, unit, (PointerInputEventHandler) objB), a.f(this.f106946b), a.f(this.f106946b), 0.0f, Float.intBitsToFloat((int) (a.k(this.f106947c) >> 32)), Float.intBitsToFloat((int) (a.k(this.f106947c) & 4294967295L)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131044, null);
                    C5347r0.Companion companion = C5347r0.INSTANCE;
                    float[] fArrB = C5351t0.b(null, 1, null);
                    C5351t0.d(fArrB, 0.66f);
                    C6197c.d(c15372hC, strF0, hVarA, modifierC, null, cVarC2, cVarC, null, null, null, null, interfaceC5784kD, this.f106948d.getLoadGrayScaleImage() ? 0.33f : 1.0f, this.f106948d.getLoadGrayScaleImage() ? companion.a(fArrB) : null, 0, false, null, composer, 0, 48, 116624);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
                    a(interfaceC14812d, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(C12273n.ViewState bVar, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<C15372h.a> interfaceC5730l02) {
                this.f106939a = bVar;
                this.f106940b = interfaceC5730l0;
                this.f106941c = interfaceC5730l02;
            }

            public final void e(InterfaceC16016e AdsHorizontalPager, int i10, Composer composer, int i11) {
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
                InterfaceC5724i0 interfaceC5724i0 = (InterfaceC5724i0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean z11 = i13 == 32;
                Object objB2 = composer.B();
                if (z11 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = t1.e(U0.f.d(U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f)))), null, 2, null);
                    composer.t(objB2);
                }
                InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
                composer.P();
                Float fValueOf = Float.valueOf(f(interfaceC5724i0));
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(interfaceC5724i0);
                InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f106940b;
                Object objB3 = composer.B();
                if (zV || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new C1612a(interfaceC5724i0, interfaceC5730l02, null);
                    composer.t(objB3);
                }
                composer.P();
                androidx.compose.runtime.J.g(fValueOf, (Function2) objB3, composer, 0);
                C14811c.a(androidx.compose.foundation.layout.J.c(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.8f), null, false, ComposableLambdaKt.c(-422956172, true, new C1613b(this.f106939a.d().get(i10), interfaceC5724i0, interfaceC5730l0, this.f106939a, this.f106941c), composer, 54), composer, 3078, 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16016e interfaceC16016e, Integer num, Composer composer, Integer num2) {
                e(interfaceC16016e, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float f(InterfaceC5724i0 interfaceC5724i0) {
                return interfaceC5724i0.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(InterfaceC5724i0 interfaceC5724i0, float f10) {
                interfaceC5724i0.B(f10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final long k(InterfaceC5730l0<U0.f> interfaceC5730l0) {
                return interfaceC5730l0.getValue().getPackedValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void l(InterfaceC5730l0<U0.f> interfaceC5730l0, long j10) {
                interfaceC5730l0.setValue(U0.f.d(j10));
            }
        }

        b(LocalThemeScope localThemeScope, C12273n.ViewState bVar, PagerState pagerState, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<C15372h.a> interfaceC5730l02) {
            this.f106934a = localThemeScope;
            this.f106935b = bVar;
            this.f106936c = pagerState;
            this.f106937d = interfaceC5730l0;
            this.f106938e = interfaceC5730l02;
        }

        public final void a(InterfaceC14934f0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-743904590, i10, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailScreen.<anonymous>.<anonymous> (ImageDetailScreen.kt:107)");
            }
            ui.g.e(this.f106934a, C12096l0.m(Modifier.INSTANCE, C12096l0.g(this.f106937d)), Assemble.getHorizontalPagerTemplate(), this.f106935b.d().size(), this.f106936c, ComposableLambdaKt.c(-209885302, true, new a(this.f106935b, this.f106937d, this.f106938e), composer, 54), composer, 196608 | LocalThemeScope.f15770g | (q1.HorizontalPagerTemplate.f140051h << 6));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14934f0 interfaceC14934f0, Composer composer, Integer num) {
            a(interfaceC14934f0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$c */
    static final class c implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<C12273n.a, Unit> f106958a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f106959b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super C12273n.a, Unit> function1, int i10) {
            this.f106958a = function1;
            this.f106959b = i10;
        }

        public final void a() {
            this.f106958a.invoke(new C12273n.a.UpdatePageNumber(this.f106959b));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProductImageViewModel f106960a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f106961b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12273n.ViewState f106962c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f106963d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<C15372h.a> f106964e;

        d(ProductImageViewModel productImageViewModel, PagerState pagerState, C12273n.ViewState bVar, int i10, InterfaceC5730l0<C15372h.a> interfaceC5730l0) {
            this.f106960a = productImageViewModel;
            this.f106961b = pagerState;
            this.f106962c = bVar;
            this.f106963d = i10;
            this.f106964e = interfaceC5730l0;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1508117711, i10, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ImageDetailScreen.kt:217)");
            }
            C15372h c15372hC = C12096l0.d(this.f106964e).f(this.f106960a.getSmallImage().getUrl()).c();
            Z4.h hVarA = Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            String strD = C16193g.d(com.meijer.mobile.meijer.Y.f99795Rh, new Object[]{Integer.valueOf(this.f106961b.k() + 1), Integer.valueOf(this.f106962c.d().size())}, composer, 0);
            InterfaceC5784k interfaceC5784kF = InterfaceC5784k.INSTANCE.f();
            Z0.c cVarC = C16190d.c(Bj.i.f2681O1, composer, 0);
            Z0.c cVarC2 = C16190d.c(Bj.i.f2681O1, composer, 0);
            Modifier modifierI = androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(60));
            C5347r0.Companion companion = C5347r0.INSTANCE;
            float[] fArrB = C5351t0.b(null, 1, null);
            C5351t0.d(fArrB, 0.66f);
            C6197c.d(c15372hC, strD, hVarA, modifierI, null, cVarC2, cVarC, null, null, null, null, interfaceC5784kF, this.f106962c.getCurrentIndex() != this.f106963d ? 0.33f : 1.0f, this.f106962c.getCurrentIndex() != this.f106963d ? companion.a(fArrB) : null, 0, false, null, composer, 3072, 48, 116624);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.ImageDetailScreenKt$ImageDetailScreen$1$3$1", f = "ImageDetailScreen.kt", l = {253}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106965a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f106966b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12273n.ViewState f106967c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f106966b, this.f106967c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(PagerState pagerState, C12273n.ViewState bVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f106966b = pagerState;
            this.f106967c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106965a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                PagerState pagerState = this.f106966b;
                int iC = this.f106967c.getCurrentIndex();
                this.f106965a = 1;
                if (PagerState.j(pagerState, iC, 0.0f, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.ImageDetailScreenKt$ImageDetailScreen$1$4$1", f = "ImageDetailScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f106969b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C12273n.a, Unit> f106970c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f106969b, this.f106970c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(PagerState pagerState, Function1<? super C12273n.a, Unit> function1, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f106969b = pagerState;
            this.f106970c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f106968a == 0) {
                ResultKt.b(obj);
                if (!this.f106969b.b()) {
                    this.f106970c.invoke(new C12273n.a.PagerSwipe(this.f106969b.k()));
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$g */
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f106971f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(1);
            this.f106971f = list;
        }

        public final Object a(int i10) {
            this.f106971f.get(i10);
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
    public static final class h extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f106972f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f106973g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PagerState f106974h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C12273n.ViewState f106975i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f106976j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, Function1 function1, PagerState pagerState, C12273n.ViewState bVar, InterfaceC5730l0 interfaceC5730l0) {
            super(4);
            this.f106972f = list;
            this.f106973g = function1;
            this.f106974h = pagerState;
            this.f106975i = bVar;
            this.f106976j = interfaceC5730l0;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15343c) ? 4 : 2);
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
            ProductImageViewModel productImageViewModel = (ProductImageViewModel) this.f106972f.get(i10);
            composer.startReplaceGroup(568909208);
            float f10 = 8;
            float fP = H1.h.p(f10);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f106973g) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new c(this.f106973g, i10);
                composer.t(objB);
            }
            composer.P();
            C17985y.a(androidx.compose.foundation.layout.D.k(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), 0.0f, H1.h.p(f10), 1, null), null, 0L, 0L, null, fP, ComposableLambdaKt.c(1508117711, true, new d(productImageViewModel, this.f106974h, this.f106975i, i10, this.f106976j), composer, 54), composer, 1769472, 30);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/meijer/activity/find/l0$a", "Lf1/a;", "LU0/f;", "available", "Lf1/e;", "source", "E1", "(JI)J", "LH1/y;", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.l0$a */
    public static final class a implements InterfaceC13828a {
        @Override // f1.InterfaceC13828a
        public long E1(long available, int source) {
            return U0.f.g(available, 0.0f, 0.0f, 1, null);
        }

        @Override // f1.InterfaceC13828a
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
    public static final void c(final Ji.LocalThemeScope r31, androidx.compose.ui.Modifier r32, final com.meijer.mobile.meijer.activity.find.viewmodel.C12273n.ViewState r33, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.viewmodel.C12273n.a, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.C12096l0.c(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.find.viewmodel.n$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(C12273n.ViewState bVar, Function1 function1, PagerState pagerState, InterfaceC5730l0 interfaceC5730l0, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List<ProductImageViewModel> listD = bVar.d();
        LazyRow.i(listD.size(), null, new g(listD), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new h(listD, function1, pagerState, bVar, interfaceC5730l0)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, C12273n.ViewState bVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, bVar, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier m(Modifier modifier, boolean z10) {
        return z10 ? androidx.compose.ui.input.nestedscroll.a.b(modifier, f106933a, null, 2, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15372h.a d(InterfaceC5730l0<C15372h.a> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
