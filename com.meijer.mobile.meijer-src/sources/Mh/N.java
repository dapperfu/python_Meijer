package Mh;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l6.InterfaceC15464h;
import l6.InterfaceC15467k;
import l6.InterfaceC15469m;
import mv.InterfaceC15783O;
import r1.C16813g;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a;\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Ll6/m;", "lottieSpec", "", "liveRegionDescription", "Lkotlin/Function0;", "", "onAnimationComplete", "d", "(LKi/M;Landroidx/compose/ui/Modifier;Ll6/m;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "progress", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class N {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountSuccessAnimationKt$CreateAccountSuccessAnimation$1$1", f = "CreateAccountSuccessAnimation.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f19992a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC15467k f19993b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19994c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC15464h f19995d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC15467k interfaceC15467k, Function0<Unit> function0, InterfaceC15464h interfaceC15464h, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f19993b = interfaceC15467k;
            this.f19994c = function0;
            this.f19995d = interfaceC15464h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f19993b, this.f19994c, this.f19995d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f19992a == 0) {
                ResultKt.b(obj);
                if (this.f19993b.h() || N.e(this.f19995d) >= 1.0f) {
                    this.f19994c.invoke();
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r35, androidx.compose.ui.Modifier r36, final l6.InterfaceC15469m r37, final java.lang.String r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mh.N.d(Ki.M, androidx.compose.ui.Modifier, l6.m, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.n0(semantics, C16813g.INSTANCE.b());
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, InterfaceC15469m interfaceC15469m, String str, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, interfaceC15469m, str, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(InterfaceC15464h interfaceC15464h) {
        return interfaceC15464h.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(InterfaceC15464h interfaceC15464h) {
        return e(interfaceC15464h);
    }
}
