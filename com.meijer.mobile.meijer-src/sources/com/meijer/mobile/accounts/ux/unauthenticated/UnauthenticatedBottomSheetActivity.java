package com.meijer.mobile.accounts.ux.unauthenticated;

import Bl.p;
import Jh.S;
import Ki.K;
import Ki.LocalThemeScope;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.view.L;
import androidx.view.r;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity;
import e.C13737e;
import j0.InterfaceC14882C;
import j0.InterfaceC14900d;
import kotlin.C17959M0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import zl.AbstractC18503f;
import zl.k;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/accounts/ux/unauthenticated/UnauthenticatedBottomSheetActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "q1", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lzl/k;", "v", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "", "hasAnimatedIn", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UnauthenticatedBottomSheetActivity extends Hilt_UnauthenticatedBottomSheetActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public k featureManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity$Content$1$1", f = "UnauthenticatedBottomSheetActivity.kt", l = {94}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95849a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f95850b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f95851c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f95850b, this.f95851c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C17959M0 c17959m0, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f95850b = c17959m0;
            this.f95851c = interfaceC5872l0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95849a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17959M0 c17959m0 = this.f95850b;
                this.f95849a = 1;
                if (c17959m0.l(this) == objF) {
                    return objF;
                }
            }
            UnauthenticatedBottomSheetActivity.v1(this.f95851c, true);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity$Content$2$1", f = "UnauthenticatedBottomSheetActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95852a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f95853b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UnauthenticatedBottomSheetActivity f95854c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f95855d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f95853b, this.f95854c, this.f95855d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17959M0 c17959m0, UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f95853b = c17959m0;
            this.f95854c = unauthenticatedBottomSheetActivity;
            this.f95855d = interfaceC5872l0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95852a == 0) {
                ResultKt.b(obj);
                if (UnauthenticatedBottomSheetActivity.u1(this.f95855d) && !this.f95853b.k()) {
                    this.f95854c.finish();
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity$Content$3$1$1", f = "UnauthenticatedBottomSheetActivity.kt", l = {107}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95856a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f95857b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f95857b, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17959M0 c17959m0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f95857b = c17959m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95856a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17959M0 c17959m0 = this.f95857b;
                this.f95856a = 1;
                if (c17959m0.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity$Content$4$1$1$1", f = "UnauthenticatedBottomSheetActivity.kt", l = {123}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95858a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f95859b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f95859b, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C17959M0 c17959m0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f95859b = c17959m0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95858a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17959M0 c17959m0 = this.f95859b;
                this.f95858a = 1;
                if (c17959m0.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f95860a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f95861b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UnauthenticatedBottomSheetActivity f95862c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f95863d;

        e(LocalThemeScope localThemeScope, InterfaceC14882C interfaceC14882C, UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity, Context context) {
            this.f95860a = localThemeScope;
            this.f95861b = interfaceC14882C;
            this.f95862c = unauthenticatedBottomSheetActivity;
            this.f95863d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity, Context context) {
            unauthenticatedBottomSheetActivity.startActivity(Bl.k.b(context, false, null, null, null, null, null, 126, null));
            unauthenticatedBottomSheetActivity.finish();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity, Context context) {
            unauthenticatedBottomSheetActivity.startActivity(Bl.f.f3124a.a(context, unauthenticatedBottomSheetActivity.getFeatureManager().e(AbstractC18503f.h0.f172881h)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity, Context context) {
            unauthenticatedBottomSheetActivity.startActivity(p.f3148a.a(context));
            return Unit.f143329a;
        }

        public final void d(InterfaceC14900d AcresBottomSheet, Composer composer, int i10) {
            Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2106727353, i10, -1, "com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity.Content.<anonymous>.<anonymous> (UnauthenticatedBottomSheetActivity.kt:128)");
            }
            LocalThemeScope localThemeScope = this.f95860a;
            Modifier modifierM = D.m(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), 0.0f, 0.0f, 0.0f, this.f95861b.getBottom(), 7, null);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f95862c) | composer.D(this.f95863d);
            final UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity = this.f95862c;
            final Context context = this.f95863d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.accounts.ux.unauthenticated.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnauthenticatedBottomSheetActivity.e.e(unauthenticatedBottomSheetActivity, context);
                    }
                };
                composer.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(this.f95862c) | composer.D(this.f95863d);
            final UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity2 = this.f95862c;
            final Context context2 = this.f95863d;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.accounts.ux.unauthenticated.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnauthenticatedBottomSheetActivity.e.f(unauthenticatedBottomSheetActivity2, context2);
                    }
                };
                composer.t(objB2);
            }
            Function0 function02 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD3 = composer.D(this.f95862c) | composer.D(this.f95863d);
            final UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity3 = this.f95862c;
            final Context context3 = this.f95863d;
            Object objB3 = composer.B();
            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.accounts.ux.unauthenticated.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnauthenticatedBottomSheetActivity.e.g(unauthenticatedBottomSheetActivity3, context3);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            S.o(localThemeScope, modifierM, function0, function02, (Function0) objB3, composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            d(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnauthenticatedBottomSheetActivity f95865a;

            a(UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity) {
                this.f95865a = unauthenticatedBottomSheetActivity;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-350318755, i10, -1, "com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity.onCreate.<anonymous>.<anonymous> (UnauthenticatedBottomSheetActivity.kt:71)");
                }
                this.f95865a.q1(AdsTheme, null, composer, LocalThemeScope.f17314g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        f() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(713107276, i10, -1, "com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity.onCreate.<anonymous> (UnauthenticatedBottomSheetActivity.kt:70)");
            }
            K.b(null, ComposableLambdaKt.c(-350318755, true, new a(UnauthenticatedBottomSheetActivity.this), composer, 54), composer, 48, 1);
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
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q1(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity.q1(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5872l0 r1() {
        return t1.e(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s1(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
        C15809k.d(interfaceC15783O, null, null, new d(c17959m0, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t1(UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity, LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        unauthenticatedBottomSheetActivity.q1(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w1(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
        C15809k.d(interfaceC15783O, null, null, new c(c17959m0, null), 3, null);
        return Unit.f143329a;
    }

    public final k getFeatureManager() {
        k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u1(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    @Override // com.meijer.mobile.accounts.ux.unauthenticated.Hilt_UnauthenticatedBottomSheetActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        r.b(this, L.INSTANCE.c(0), null, 2, null);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(713107276, true, new f()), 1, null);
    }
}
