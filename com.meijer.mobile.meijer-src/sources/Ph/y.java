package Ph;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.meijer.mobile.accounts.ux.preferences.k;
import d0.V;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aU\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "email", "Lbk/a;", "resendEmailErrorTitle", "resendEmailErrorDescription", "", "shouldScrollToTop", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/preferences/k;", "", "onAction", "e", "(LKi/M;Ljava/lang/String;Lbk/a;Lbk/a;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lastAction", "isResendEmailErrorEnabled", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class y {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.VerificationLinkSentSheetContentKt$VerificationLinkSentSheetContent$1$1", f = "VerificationLinkSentSheetContent.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f25895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f25896b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f25897c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ V f25898d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.VerificationLinkSentSheetContentKt$VerificationLinkSentSheetContent$1$1$1", f = "VerificationLinkSentSheetContent.kt", l = {54}, m = "invokeSuspend")
        /* renamed from: Ph.y$a$a, reason: collision with other inner class name */
        static final class C0435a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f25899a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ V f25900b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0435a(V v10, Continuation<? super C0435a> continuation) {
                super(2, continuation);
                this.f25900b = v10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0435a(this.f25900b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0435a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f25899a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    V v10 = this.f25900b;
                    this.f25899a = 1;
                    if (v10.p(0, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, InterfaceC15783O interfaceC15783O, V v10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f25896b = z10;
            this.f25897c = interfaceC15783O;
            this.f25898d = v10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f25896b, this.f25897c, this.f25898d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f25895a == 0) {
                ResultKt.b(obj);
                if (this.f25896b) {
                    C15809k.d(this.f25897c, null, null, new C0435a(this.f25898d, null), 3, null);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.VerificationLinkSentSheetContentKt$VerificationLinkSentSheetContent$2$1$1$1", f = "VerificationLinkSentSheetContent.kt", l = {64}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f25901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ V f25902b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V v10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f25902b = v10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f25902b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f25901a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                V v10 = this.f25902b;
                this.f25901a = 1;
                if (v10.p(0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.preferences.VerificationLinkSentSheetContentKt$VerificationLinkSentSheetContent$2$2$2$1$1", f = "VerificationLinkSentSheetContent.kt", l = {94}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f25903a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ V f25904b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(V v10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f25904b = v10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f25904b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f25903a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                V v10 = this.f25904b;
                this.f25903a = 1;
                if (v10.p(0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r33, final java.lang.String r34, final bk.AbstractC6392a r35, final bk.AbstractC6392a r36, final boolean r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.preferences.k, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.y.e(Ki.M, java.lang.String, bk.a, bk.a, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(InterfaceC15783O interfaceC15783O, Function1 function1, V v10) {
        C15809k.d(interfaceC15783O, null, null, new b(v10, null), 3, null);
        function1.invoke(k.a.f95537a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1) {
        function1.invoke(k.h.f95545a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(InterfaceC15783O interfaceC15783O, Function1 function1, V v10) {
        C15809k.d(interfaceC15783O, null, null, new c(v10, null), 3, null);
        function1.invoke(k.a.f95537a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, String str, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, str, abstractC6392a, abstractC6392a2, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
