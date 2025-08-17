package k6;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.t1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g6.C14209i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0011\u001a\u00020\u00102\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lg6/i;", "composition", "", "isPlaying", "restartOnPlay", "reverseOnRepeat", "Lk6/j;", "clipSpec", "", "speed", "", "iterations", "Lk6/i;", "cancellationBehavior", "ignoreSystemAnimatorScale", "useCompositionFrameRate", "Lk6/h;", "c", "(Lg6/i;ZZZLk6/j;FILk6/i;ZZLandroidx/compose/runtime/Composer;II)Lk6/h;", "wasPlaying", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15098a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {73, 78}, m = "invokeSuspend")
    /* renamed from: k6.a$a, reason: collision with other inner class name */
    static final class C2237a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141424a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f141425b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f141426c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC15099b f141427d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C14209i f141428e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f141429f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f141430g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f141431h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC15107j f141432i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EnumC15106i f141433j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f141434k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f141435l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2237a(boolean z10, boolean z11, InterfaceC15099b interfaceC15099b, C14209i c14209i, int i10, boolean z12, float f10, AbstractC15107j abstractC15107j, EnumC15106i enumC15106i, boolean z13, InterfaceC5730l0<Boolean> interfaceC5730l0, Continuation<? super C2237a> continuation) {
            super(2, continuation);
            this.f141425b = z10;
            this.f141426c = z11;
            this.f141427d = interfaceC15099b;
            this.f141428e = c14209i;
            this.f141429f = i10;
            this.f141430g = z12;
            this.f141431h = f10;
            this.f141432i = abstractC15107j;
            this.f141433j = enumC15106i;
            this.f141434k = z13;
            this.f141435l = interfaceC5730l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2237a(this.f141425b, this.f141426c, this.f141427d, this.f141428e, this.f141429f, this.f141430g, this.f141431h, this.f141432i, this.f141433j, this.f141434k, this.f141435l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C2237a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        
            if (k6.InterfaceC15099b.a.a(r0, r2, 0, r3, r4, r5, r6, r7, false, r9, false, r11, r16, 514, null) == r15) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r12 = r16
                java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r12.f141424a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L20
                if (r0 == r2) goto L1c
                if (r0 != r1) goto L14
                kotlin.ResultKt.b(r17)
                goto L70
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1c:
                kotlin.ResultKt.b(r17)
                goto L3e
            L20:
                kotlin.ResultKt.b(r17)
                boolean r0 = r12.f141425b
                if (r0 == 0) goto L3e
                androidx.compose.runtime.l0<java.lang.Boolean> r0 = r12.f141435l
                boolean r0 = k6.C15098a.a(r0)
                if (r0 != 0) goto L3e
                boolean r0 = r12.f141426c
                if (r0 == 0) goto L3e
                k6.b r0 = r12.f141427d
                r12.f141424a = r2
                java.lang.Object r0 = k6.C15101d.e(r0, r12)
                if (r0 != r15) goto L3e
                goto L6f
            L3e:
                androidx.compose.runtime.l0<java.lang.Boolean> r0 = r12.f141435l
                boolean r2 = r12.f141425b
                k6.C15098a.b(r0, r2)
                boolean r0 = r12.f141425b
                if (r0 != 0) goto L4c
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            L4c:
                k6.b r0 = r12.f141427d
                g6.i r2 = r12.f141428e
                int r3 = r12.f141429f
                boolean r4 = r12.f141430g
                float r5 = r12.f141431h
                k6.j r6 = r12.f141432i
                float r7 = r0.C()
                k6.i r9 = r12.f141433j
                boolean r11 = r12.f141434k
                r12.f141424a = r1
                r1 = r2
                r2 = 0
                r8 = 0
                r10 = 0
                r13 = 514(0x202, float:7.2E-43)
                r14 = 0
                java.lang.Object r0 = k6.InterfaceC15099b.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                if (r0 != r15) goto L70
            L6f:
                return r15
            L70:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k6.C15098a.C2237a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final InterfaceC15105h c(C14209i c14209i, boolean z10, boolean z11, boolean z12, AbstractC15107j abstractC15107j, float f10, int i10, EnumC15106i enumC15106i, boolean z13, boolean z14, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(683659508);
        boolean z15 = (i12 & 2) != 0 ? true : z10;
        boolean z16 = (i12 & 4) != 0 ? true : z11;
        boolean z17 = (i12 & 8) != 0 ? false : z12;
        AbstractC15107j abstractC15107j2 = (i12 & 16) != 0 ? null : abstractC15107j;
        float f11 = (i12 & 32) != 0 ? 1.0f : f10;
        int i13 = (i12 & 64) != 0 ? 1 : i10;
        EnumC15106i enumC15106i2 = (i12 & 128) != 0 ? EnumC15106i.f141546a : enumC15106i;
        boolean z18 = (i12 & 256) != 0 ? false : z13;
        boolean z19 = (i12 & 512) != 0 ? false : z14;
        if (ComposerKt.M()) {
            ComposerKt.U(683659508, i11, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)");
        }
        if (i13 <= 0) {
            throw new IllegalArgumentException(("Iterations must be a positive number (" + i13 + ").").toString());
        }
        if (Float.isInfinite(f11) || Float.isNaN(f11)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f11 + ".").toString());
        }
        InterfaceC15099b interfaceC15099bD = C15101d.d(composer, 0);
        composer.startReplaceableGroup(-180606964);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = t1.e(Boolean.valueOf(z15), null, 2, null);
            composer.t(objB);
        }
        InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
        composer.U();
        composer.startReplaceableGroup(-180606834);
        if (!z18) {
            f11 /= u6.q.f((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
        }
        float f12 = f11;
        composer.U();
        J.h(new Object[]{c14209i, Boolean.valueOf(z15), abstractC15107j2, Float.valueOf(f12), Integer.valueOf(i13)}, new C2237a(z15, z16, interfaceC15099bD, c14209i, i13, z17, f12, abstractC15107j2, enumC15106i2, z19, interfaceC5730l0, null), composer, 72);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.U();
        return interfaceC15099bD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
