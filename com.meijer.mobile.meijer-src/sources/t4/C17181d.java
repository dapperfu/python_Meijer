package t4;

import androidx.room.W;
import androidx.room.X;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import s4.m;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JM\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2-\u0010\u000f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2-\u0010\u000f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lt4/d;", "Landroidx/room/X;", "Ls4/m;", "Lt4/a;", "delegate", "<init>", "(Lt4/a;)V", "R", "Landroidx/room/X$a;", "type", "Lkotlin/Function2;", "Landroidx/room/W;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "f", "(Landroidx/room/X$a;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "LA4/d;", "d", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt4/a;", "getDelegate", "()Lt4/a;", "Landroidx/room/X$a;", "currentTransactionType", "LA4/b;", "c", "()LA4/b;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: t4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17181d implements X, m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17178a delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private X.a currentTransactionType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lt4/d$a;", "T", "Landroidx/room/W;", "Ls4/m;", "<init>", "(Lt4/d;)V", "R", "", "sql", "Lkotlin/Function1;", "LA4/d;", "block", "d", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LA4/b;", "c", "()LA4/b;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: t4.d$a */
    private final class a<T> implements W<T>, m {
        public a() {
        }

        @Override // s4.m
        public A4.b c() {
            return C17181d.this.c();
        }

        @Override // androidx.room.InterfaceC6277v
        public <R> Object d(String str, Function1<? super A4.d, ? extends R> function1, Continuation<? super R> continuation) {
            return C17181d.this.d(str, function1, continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.driver.SupportSQLitePooledConnection", f = "SupportSQLiteConnectionPool.android.kt", l = {83}, m = "transaction")
    /* renamed from: t4.d$c */
    static final class c<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162236a;

        /* renamed from: b, reason: collision with root package name */
        Object f162237b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f162238c;

        /* renamed from: e, reason: collision with root package name */
        int f162240e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162238c = obj;
            this.f162240e |= Integer.MIN_VALUE;
            return C17181d.this.f(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: t4.d$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[X.a.values().length];
            try {
                iArr[X.a.f58660a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[X.a.f58661b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[X.a.f58662c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C17181d(C17178a delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.room.X$a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [B4.c] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<? super androidx.room.W<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [t4.d] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object f(androidx.room.X.a r6, kotlin.jvm.functions.Function2<? super androidx.room.W<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super R> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof t4.C17181d.c
            if (r0 == 0) goto L13
            r0 = r8
            t4.d$c r0 = (t4.C17181d.c) r0
            int r1 = r0.f162240e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162240e = r1
            goto L18
        L13:
            t4.d$c r0 = new t4.d$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f162238c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162240e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r6 = r0.f162237b
            B4.c r6 = (B4.c) r6
            java.lang.Object r7 = r0.f162236a
            t4.d r7 = (t4.C17181d) r7
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L32 s4.InterfaceC17011b.a -> L35
            goto L88
        L32:
            r8 = move-exception
            goto Lb2
        L35:
            r8 = move-exception
            goto La2
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.ResultKt.b(r8)
            t4.a r8 = r5.delegate
            B4.c r8 = r8.getDb()
            boolean r2 = r8.j3()
            if (r2 != 0) goto L51
            r5.currentTransactionType = r6
        L51:
            int[] r2 = t4.C17181d.b.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r4) goto L6f
            r2 = 2
            if (r6 == r2) goto L6b
            r2 = 3
            if (r6 != r2) goto L65
            r8.n()
            goto L72
        L65:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L6b:
            r8.A0()
            goto L72
        L6f:
            r8.f2()
        L72:
            t4.d$a r6 = new t4.d$a     // Catch: java.lang.Throwable -> L97 s4.InterfaceC17011b.a -> L9d
            r6.<init>()     // Catch: java.lang.Throwable -> L97 s4.InterfaceC17011b.a -> L9d
            r0.f162236a = r5     // Catch: java.lang.Throwable -> L97 s4.InterfaceC17011b.a -> L9d
            r0.f162237b = r8     // Catch: java.lang.Throwable -> L97 s4.InterfaceC17011b.a -> L9d
            r0.f162240e = r4     // Catch: java.lang.Throwable -> L97 s4.InterfaceC17011b.a -> L9d
            java.lang.Object r6 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L97 s4.InterfaceC17011b.a -> L9d
            if (r6 != r1) goto L84
            return r1
        L84:
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        L88:
            r6.q()     // Catch: java.lang.Throwable -> L32 s4.InterfaceC17011b.a -> L35
            r6.r()
            boolean r6 = r6.j3()
            if (r6 != 0) goto L96
            r7.currentTransactionType = r3
        L96:
            return r8
        L97:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto Lb2
        L9d:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        La2:
            java.lang.Object r8 = r8.getResult()     // Catch: java.lang.Throwable -> L32
            r6.r()
            boolean r6 = r6.j3()
            if (r6 != 0) goto Lb1
            r7.currentTransactionType = r3
        Lb1:
            return r8
        Lb2:
            r6.r()
            boolean r6 = r6.j3()
            if (r6 != 0) goto Lbd
            r7.currentTransactionType = r3
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C17181d.f(androidx.room.X$a, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.room.X
    public Object b(Continuation<? super Boolean> continuation) {
        return Boxing.a(this.delegate.getDb().j3());
    }

    @Override // s4.m
    public A4.b c() {
        return this.delegate;
    }

    @Override // androidx.room.InterfaceC6277v
    public <R> Object d(String str, Function1<? super A4.d, ? extends R> function1, Continuation<? super R> continuation) {
        AbstractC17182e abstractC17182eS3 = this.delegate.S3(str);
        try {
            R rInvoke = function1.invoke(abstractC17182eS3);
            AutoCloseableKt.a(abstractC17182eS3, null);
            return rInvoke;
        } finally {
        }
    }

    @Override // androidx.room.X
    public <R> Object a(X.a aVar, Function2<? super W<R>, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return f(aVar, function2, continuation);
    }
}
