package B2;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"LB2/g;", "T", "", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2942g<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJX\u0010\u0011\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LB2/g$a;", "", "<init>", "()V", "T", "", "LB2/f;", "migrations", "LB2/r;", "api", "", "c", "(Ljava/util/List;LB2/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "b", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: B2.g$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB2/r;", "api", "", "<anonymous>", "(LB2/r;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: B2.g$a$a, reason: collision with other inner class name */
        static final class C0031a extends SuspendLambda implements Function2<r<T>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f1768a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f1769b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC2941f<T>> f1770c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0031a(List<? extends InterfaceC2941f<T>> list, Continuation<? super C0031a> continuation) {
                super(2, continuation);
                this.f1770c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0031a c0031a = new C0031a(this.f1770c, continuation);
                c0031a.f1769b = obj;
                return c0031a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r<T> rVar, Continuation<? super Unit> continuation) {
                return ((C0031a) create(rVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f1768a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    r rVar = (r) this.f1769b;
                    Companion companion = C2942g.INSTANCE;
                    List<InterfaceC2941f<T>> list = this.f1770c;
                    this.f1768a = 1;
                    if (companion.c(list, rVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        /* renamed from: B2.g$a$b */
        static final class b<T> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f1771a;

            /* renamed from: b, reason: collision with root package name */
            Object f1772b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f1773c;

            /* renamed from: e, reason: collision with root package name */
            int f1775e;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f1773c = obj;
                this.f1775e |= Integer.MIN_VALUE;
                return Companion.this.c(null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: B2.g$a$c */
        static final class c extends SuspendLambda implements Function2<T, Continuation<? super T>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f1776a;

            /* renamed from: b, reason: collision with root package name */
            Object f1777b;

            /* renamed from: c, reason: collision with root package name */
            Object f1778c;

            /* renamed from: d, reason: collision with root package name */
            int f1779d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f1780e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC2941f<T>> f1781f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<Function1<Continuation<? super Unit>, Object>> f1782g;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            /* renamed from: B2.g$a$c$a, reason: collision with other inner class name */
            static final class C0032a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f1783a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC2941f<T> f1784b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0032a(InterfaceC2941f<T> interfaceC2941f, Continuation<? super C0032a> continuation) {
                    super(1, continuation);
                    this.f1784b = interfaceC2941f;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new C0032a(this.f1784b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation<? super Unit> continuation) {
                    return ((C0032a) create(continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f1783a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC2941f<T> interfaceC2941f = this.f1784b;
                        this.f1783a = 1;
                        if (interfaceC2941f.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends InterfaceC2941f<T>> list, List<Function1<Continuation<? super Unit>, Object>> list2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f1781f = list;
                this.f1782g = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f1781f, this.f1782g, continuation);
                cVar.f1780e = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, Continuation<? super T> continuation) {
                return ((c) create(t10, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r9.f1779d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f1776a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f1780e
                    java.util.List r4 = (java.util.List) r4
                    kotlin.ResultKt.b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f1778c
                    java.lang.Object r4 = r9.f1777b
                    B2.f r4 = (B2.InterfaceC2941f) r4
                    java.lang.Object r5 = r9.f1776a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f1780e
                    java.util.List r6 = (java.util.List) r6
                    kotlin.ResultKt.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    kotlin.ResultKt.b(r10)
                    java.lang.Object r10 = r9.f1780e
                    java.util.List<B2.f<T>> r1 = r9.f1781f
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> r4 = r9.f1782g
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    B2.f r5 = (B2.InterfaceC2941f) r5
                    r9.f1780e = r4
                    r9.f1776a = r1
                    r9.f1777b = r5
                    r9.f1778c = r10
                    r9.f1779d = r3
                    java.lang.Object r6 = r5.a(r10, r9)
                    if (r6 != r0) goto L63
                    goto L89
                L63:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L68:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8c
                    B2.g$a$c$a r10 = new B2.g$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f1780e = r4
                    r9.f1776a = r5
                    r9.f1777b = r7
                    r9.f1778c = r7
                    r9.f1779d = r2
                    java.lang.Object r10 = r6.c(r1, r9)
                    if (r10 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    r10 = r1
                    goto L8a
                L8e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: B2.C2942g.Companion.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object c(java.util.List<? extends B2.InterfaceC2941f<T>> r7, B2.r<T> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof B2.C2942g.Companion.b
                if (r0 == 0) goto L13
                r0 = r9
                B2.g$a$b r0 = (B2.C2942g.Companion.b) r0
                int r1 = r0.f1775e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1775e = r1
                goto L18
            L13:
                B2.g$a$b r0 = new B2.g$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f1773c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f1775e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f1772b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f1771a
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f1771a
                java.util.List r7 = (java.util.List) r7
                kotlin.ResultKt.b(r9)
                goto L60
            L46:
                kotlin.ResultKt.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                B2.g$a$c r2 = new B2.g$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f1771a = r9
                r0.f1775e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                goto L83
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                r0.f1771a = r8     // Catch: java.lang.Throwable -> L34
                r0.f1772b = r7     // Catch: java.lang.Throwable -> L34
                r0.f1775e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
            L83:
                return r1
            L84:
                T r2 = r8.f142835a
                if (r2 != 0) goto L8b
                r8.f142835a = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.Intrinsics.g(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.ExceptionsKt.a(r2, r9)
                goto L6b
            L94:
                T r7 = r8.f142835a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2942g.Companion.c(java.util.List, B2.r, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final <T> Function2<r<T>, Continuation<? super Unit>, Object> b(List<? extends InterfaceC2941f<T>> migrations) {
            Intrinsics.j(migrations, "migrations");
            return new C0031a(migrations, null);
        }
    }
}
