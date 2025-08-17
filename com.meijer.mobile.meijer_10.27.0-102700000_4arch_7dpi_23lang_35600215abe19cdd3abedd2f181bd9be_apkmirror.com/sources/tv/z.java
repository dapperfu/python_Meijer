package tv;

import kotlin.BuilderInference;
import kotlin.C17342j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0087\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0089\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0004\b\t\u0010\u000e\u001a\u0087\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u009f\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u0015\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0017¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c0\u001b\"\u0004\b\u0000\u0010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"T1", "T2", "R", "Ltv/f;", "flow", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "a", "b", "Lkotlin/coroutines/Continuation;", "", "transform", "e", "(Ltv/f;Ltv/f;Lkotlin/jvm/functions/Function3;)Ltv/f;", "flow2", "T3", "flow3", "Lkotlin/Function4;", "c", "(Ltv/f;Ltv/f;Ltv/f;Lkotlin/jvm/functions/Function4;)Ltv/f;", "T4", "flow4", "Lkotlin/Function5;", "d", "(Ltv/f;Ltv/f;Ltv/f;Ltv/f;Lkotlin/jvm/functions/Function5;)Ltv/f;", "T", "Lkotlin/Function0;", "", "f", "()Lkotlin/jvm/functions/Function0;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* loaded from: classes13.dex */
final /* synthetic */ class z {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a<R> implements InterfaceC17152f<R> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f[] f162422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function4 f162423b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Ltv/g;", "", "it", "", "<anonymous>", "(Ltv/g;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: tv.z$a$a, reason: collision with other inner class name */
        public static final class C2557a extends SuspendLambda implements Function3<InterfaceC17153g<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f162424a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f162425b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f162426c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function4 f162427d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2557a(Continuation continuation, Function4 function4) {
                super(3, continuation);
                this.f162427d = function4;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super R> interfaceC17153g, Object[] objArr, Continuation<? super Unit> continuation) {
                C2557a c2557a = new C2557a(continuation, this.f162427d);
                c2557a.f162425b = interfaceC17153g;
                c2557a.f162426c = objArr;
                return c2557a.invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
            
                if (r1.emit(r8, r7) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r7.f162424a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.ResultKt.b(r8)
                    goto L56
                L12:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1a:
                    java.lang.Object r1 = r7.f162425b
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    kotlin.ResultKt.b(r8)
                    goto L4a
                L22:
                    kotlin.ResultKt.b(r8)
                    java.lang.Object r8 = r7.f162425b
                    r1 = r8
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r8 = r7.f162426c
                    java.lang.Object[] r8 = (java.lang.Object[]) r8
                    kotlin.jvm.functions.Function4 r4 = r7.f162427d
                    r5 = 0
                    r5 = r8[r5]
                    r6 = r8[r3]
                    r8 = r8[r2]
                    r7.f162425b = r1
                    r7.f162424a = r3
                    r3 = 6
                    kotlin.jvm.internal.InlineMarker.c(r3)
                    java.lang.Object r8 = r4.invoke(r5, r6, r8, r7)
                    r3 = 7
                    kotlin.jvm.internal.InlineMarker.c(r3)
                    if (r8 != r0) goto L4a
                    goto L55
                L4a:
                    r3 = 0
                    r7.f162425b = r3
                    r7.f162424a = r2
                    java.lang.Object r8 = r1.emit(r8, r7)
                    if (r8 != r0) goto L56
                L55:
                    return r0
                L56:
                    kotlin.Unit r8 = kotlin.Unit.f142422a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: tv.z.a.C2557a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(InterfaceC17152f[] interfaceC17152fArr, Function4 function4) {
            this.f162422a = interfaceC17152fArr;
            this.f162423b = function4;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
            Object objA = C17342j.a(interfaceC17153g, this.f162422a, z.f(), new C2557a(null, this.f162423b), continuation);
            return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b<R> implements InterfaceC17152f<R> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f[] f162428a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function5 f162429b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Ltv/g;", "", "it", "", "<anonymous>", "(Ltv/g;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
        @SourceDebugExtension
        public static final class a extends SuspendLambda implements Function3<InterfaceC17153g<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f162430a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f162431b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f162432c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function5 f162433d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function5 function5) {
                super(3, continuation);
                this.f162433d = function5;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super R> interfaceC17153g, Object[] objArr, Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f162433d);
                aVar.f162431b = interfaceC17153g;
                aVar.f162432c = objArr;
                return aVar.invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
            
                if (r1.emit(r11, r10) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r10.f162430a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.ResultKt.b(r11)
                    r9 = r10
                    goto L5c
                L13:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1b:
                    java.lang.Object r1 = r10.f162431b
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    kotlin.ResultKt.b(r11)
                    r9 = r10
                    goto L50
                L24:
                    kotlin.ResultKt.b(r11)
                    java.lang.Object r11 = r10.f162431b
                    r1 = r11
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r11 = r10.f162432c
                    java.lang.Object[] r11 = (java.lang.Object[]) r11
                    kotlin.jvm.functions.Function5 r4 = r10.f162433d
                    r5 = 0
                    r5 = r11[r5]
                    r6 = r11[r3]
                    r7 = r11[r2]
                    r8 = 3
                    r8 = r11[r8]
                    r10.f162431b = r1
                    r10.f162430a = r3
                    r11 = 6
                    kotlin.jvm.internal.InlineMarker.c(r11)
                    r9 = r10
                    java.lang.Object r11 = r4.m(r5, r6, r7, r8, r9)
                    r3 = 7
                    kotlin.jvm.internal.InlineMarker.c(r3)
                    if (r11 != r0) goto L50
                    goto L5b
                L50:
                    r3 = 0
                    r9.f162431b = r3
                    r9.f162430a = r2
                    java.lang.Object r11 = r1.emit(r11, r10)
                    if (r11 != r0) goto L5c
                L5b:
                    return r0
                L5c:
                    kotlin.Unit r11 = kotlin.Unit.f142422a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: tv.z.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(InterfaceC17152f[] interfaceC17152fArr, Function5 function5) {
            this.f162428a = interfaceC17152fArr;
            this.f162429b = function5;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
            Object objA = C17342j.a(interfaceC17153g, this.f162428a, z.f(), new a(null, this.f162429b), continuation);
            return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"tv/z$c", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c<R> implements InterfaceC17152f<R> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162434a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162435b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function3 f162436c;

        public c(InterfaceC17152f interfaceC17152f, InterfaceC17152f interfaceC17152f2, Function3 function3) {
            this.f162434a = interfaceC17152f;
            this.f162435b = interfaceC17152f2;
            this.f162436c = function3;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super R> interfaceC17153g, Continuation<? super Unit> continuation) {
            Object objA = C17342j.a(interfaceC17153g, new InterfaceC17152f[]{this.f162434a, this.f162435b}, z.f(), new d(this.f162436c, null), continuation);
            return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "Ltv/g;", "", "", "it", "", "<anonymous>", "(Ltv/g;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
    static final class d<R> extends SuspendLambda implements Function3<InterfaceC17153g<? super R>, Object[], Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162437a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f162438b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f162439c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f162440d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super d> continuation) {
            super(3, continuation);
            this.f162440d = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super R> interfaceC17153g, Object[] objArr, Continuation<? super Unit> continuation) {
            d dVar = new d(this.f162440d, continuation);
            dVar.f162438b = interfaceC17153g;
            dVar.f162439c = objArr;
            return dVar.invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f162437a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f162438b
                tv.g r1 = (tv.InterfaceC17153g) r1
                kotlin.ResultKt.b(r7)
                goto L40
            L22:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f162438b
                r1 = r7
                tv.g r1 = (tv.InterfaceC17153g) r1
                java.lang.Object r7 = r6.f162439c
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r6.f162440d
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f162438b = r1
                r6.f162437a = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L40
                goto L4b
            L40:
                r3 = 0
                r6.f162438b = r3
                r6.f162437a = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.z.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T1, T2, T3, R> InterfaceC17152f<R> c(InterfaceC17152f<? extends T1> interfaceC17152f, InterfaceC17152f<? extends T2> interfaceC17152f2, InterfaceC17152f<? extends T3> interfaceC17152f3, @BuilderInference Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return new a(new InterfaceC17152f[]{interfaceC17152f, interfaceC17152f2, interfaceC17152f3}, function4);
    }

    public static final <T1, T2, T3, T4, R> InterfaceC17152f<R> d(InterfaceC17152f<? extends T1> interfaceC17152f, InterfaceC17152f<? extends T2> interfaceC17152f2, InterfaceC17152f<? extends T3> interfaceC17152f3, InterfaceC17152f<? extends T4> interfaceC17152f4, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return new b(new InterfaceC17152f[]{interfaceC17152f, interfaceC17152f2, interfaceC17152f3, interfaceC17152f4}, function5);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f162441a = new e();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }

        e() {
        }
    }

    @JvmName
    public static final <T1, T2, R> InterfaceC17152f<R> e(InterfaceC17152f<? extends T1> interfaceC17152f, InterfaceC17152f<? extends T2> interfaceC17152f2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new c(interfaceC17152f, interfaceC17152f2, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Function0<T[]> f() {
        return e.f162441a;
    }

    public static final <T1, T2, R> InterfaceC17152f<R> b(InterfaceC17152f<? extends T1> interfaceC17152f, InterfaceC17152f<? extends T2> interfaceC17152f2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return C17154h.F(interfaceC17152f, interfaceC17152f2, function3);
    }
}
