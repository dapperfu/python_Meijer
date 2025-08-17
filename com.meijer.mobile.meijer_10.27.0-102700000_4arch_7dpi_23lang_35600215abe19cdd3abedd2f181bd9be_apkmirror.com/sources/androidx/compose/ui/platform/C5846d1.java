package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u0004*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000e\u001a\u00020\u0004*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0082@¢\u0006\u0004\b\u000e\u0010\u000f\"\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/c1;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/f1;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "b", "(Landroidx/compose/ui/platform/c1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/o0;", "chainedInterceptor", "session", "c", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/o0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/F0;", "a", "Landroidx/compose/runtime/F0;", "LocalChainedPlatformTextInputInterceptor", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5846d1 {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<C5878o0> f52067a = androidx.compose.runtime.r.f(a.f52068f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/o0;", "c", "()Landroidx/compose/ui/platform/o0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.d1$a */
    static final class a extends Lambda implements Function0<C5878o0> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f52068f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C5878o0 invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {136}, m = "establishTextInputSession")
    /* renamed from: androidx.compose.ui.platform.d1$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f52069a;

        /* renamed from: b, reason: collision with root package name */
        int f52070b;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52069a = obj;
            this.f52070b |= Integer.MIN_VALUE;
            return C5846d1.b(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {184, 186}, m = "interceptedTextInputSession")
    /* renamed from: androidx.compose.ui.platform.d1$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f52071a;

        /* renamed from: b, reason: collision with root package name */
        int f52072b;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52071a = obj;
            this.f52072b |= Integer.MIN_VALUE;
            return C5846d1.c(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.compose.ui.platform.InterfaceC5843c1 r4, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.InterfaceC5852f1, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<?> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.C5846d1.b
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.d1$b r0 = (androidx.compose.ui.platform.C5846d1.b) r0
            int r1 = r0.f52070b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52070b = r1
            goto L18
        L13:
            androidx.compose.ui.platform.d1$b r0 = new androidx.compose.ui.platform.d1$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f52069a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f52070b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            kotlin.ResultKt.b(r6)
            goto L5b
        L31:
            kotlin.ResultKt.b(r6)
            androidx.compose.ui.Modifier$c r6 = r4.getNode()
            boolean r6 = r6.getIsAttached()
            if (r6 == 0) goto L61
            androidx.compose.ui.node.Owner r6 = androidx.compose.ui.node.C5815k.p(r4)
            androidx.compose.ui.node.LayoutNode r4 = androidx.compose.ui.node.C5815k.o(r4)
            androidx.compose.runtime.s r4 = r4.getCompositionLocalMap()
            androidx.compose.runtime.F0<androidx.compose.ui.platform.o0> r2 = androidx.compose.ui.platform.C5846d1.f52067a
            java.lang.Object r4 = r4.a(r2)
            androidx.compose.ui.platform.o0 r4 = (androidx.compose.ui.platform.C5878o0) r4
            r0.f52070b = r3
            java.lang.Object r4 = c(r6, r4, r5, r0)
            if (r4 != r1) goto L5b
            return r1
        L5b:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L61:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5846d1.b(androidx.compose.ui.platform.c1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r5.w(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.c(r5, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.ui.node.Owner r5, androidx.compose.ui.platform.C5878o0 r6, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.InterfaceC5852f1, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<?> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.C5846d1.c
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.d1$c r0 = (androidx.compose.ui.platform.C5846d1.c) r0
            int r1 = r0.f52072b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52072b = r1
            goto L18
        L13:
            androidx.compose.ui.platform.d1$c r0 = new androidx.compose.ui.platform.d1$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f52071a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f52072b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            kotlin.ResultKt.b(r8)
            goto L55
        L34:
            kotlin.ResultKt.b(r8)
            goto L46
        L38:
            kotlin.ResultKt.b(r8)
            if (r6 != 0) goto L4c
            r0.f52072b = r4
            java.lang.Object r5 = r5.w(r7, r0)
            if (r5 != r1) goto L46
            goto L54
        L46:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L4c:
            r0.f52072b = r3
            java.lang.Object r5 = r6.c(r5, r7, r0)
            if (r5 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5846d1.c(androidx.compose.ui.node.Owner, androidx.compose.ui.platform.o0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
