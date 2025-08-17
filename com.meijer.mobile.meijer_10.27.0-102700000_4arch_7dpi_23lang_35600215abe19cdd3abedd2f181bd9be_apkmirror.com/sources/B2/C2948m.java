package B2;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"LB2/m;", "T", "LB2/B;", "Ljava/io/File;", "file", "LB2/D;", "serializer", "<init>", "(Ljava/io/File;LB2/D;)V", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "f", "a", "Ljava/io/File;", "g", "()Ljava/io/File;", "b", "LB2/D;", "h", "()LB2/D;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: B2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2948m<T> implements B<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D<T> serializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean closed;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
    /* renamed from: B2.m$a */
    static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1940a;

        /* renamed from: b, reason: collision with root package name */
        Object f1941b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f1942c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2948m<T> f1943d;

        /* renamed from: e, reason: collision with root package name */
        int f1944e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2948m<T> c2948m, Continuation<? super a> continuation) {
            super(continuation);
            this.f1943d = c2948m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1942c = obj;
            this.f1944e |= Integer.MIN_VALUE;
            return C2948m.i(this.f1943d, this);
        }
    }

    public C2948m(File file, D<T> serializer) {
        Intrinsics.j(file, "file");
        Intrinsics.j(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [B2.m] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <T> java.lang.Object i(B2.C2948m<T> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            boolean r0 = r8 instanceof B2.C2948m.a
            if (r0 == 0) goto L13
            r0 = r8
            B2.m$a r0 = (B2.C2948m.a) r0
            int r1 = r0.f1944e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1944e = r1
            goto L18
        L13:
            B2.m$a r0 = new B2.m$a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f1942c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f1944e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f1940a
            java.io.Closeable r7 = (java.io.Closeable) r7
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L32:
            r8 = move-exception
            goto La5
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.f1941b
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.f1940a
            B2.m r2 = (B2.C2948m) r2
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L49
            goto L6b
        L49:
            r8 = move-exception
            goto L76
        L4b:
            kotlin.ResultKt.b(r8)
            r7.f()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7c
            java.io.File r2 = r7.file     // Catch: java.io.FileNotFoundException -> L7c
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7c
            B2.D<T> r2 = r7.serializer     // Catch: java.lang.Throwable -> L71
            r0.f1940a = r7     // Catch: java.lang.Throwable -> L71
            r0.f1941b = r8     // Catch: java.lang.Throwable -> L71
            r0.f1944e = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.c(r8, r0)     // Catch: java.lang.Throwable -> L71
            if (r2 != r1) goto L67
            goto L99
        L67:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6b:
            kotlin.io.CloseableKt.a(r7, r5)     // Catch: java.io.FileNotFoundException -> L6f
            return r8
        L6f:
            r7 = r2
            goto L7c
        L71:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L76:
            throw r8     // Catch: java.lang.Throwable -> L77
        L77:
            r4 = move-exception
            kotlin.io.CloseableKt.a(r7, r8)     // Catch: java.io.FileNotFoundException -> L6f
            throw r4     // Catch: java.io.FileNotFoundException -> L6f
        L7c:
            java.io.File r8 = r7.file
            boolean r8 = r8.exists()
            if (r8 == 0) goto Lab
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r2 = r7.file
            r8.<init>(r2)
            B2.D<T> r7 = r7.serializer     // Catch: java.lang.Throwable -> La1
            r0.f1940a = r8     // Catch: java.lang.Throwable -> La1
            r0.f1941b = r5     // Catch: java.lang.Throwable -> La1
            r0.f1944e = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r7 = r7.c(r8, r0)     // Catch: java.lang.Throwable -> La1
            if (r7 != r1) goto L9a
        L99:
            return r1
        L9a:
            r6 = r8
            r8 = r7
            r7 = r6
        L9d:
            kotlin.io.CloseableKt.a(r7, r5)
            return r8
        La1:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La5:
            throw r8     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r7, r8)
            throw r0
        Lab:
            B2.D<T> r7 = r7.serializer
            java.lang.Object r7 = r7.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2948m.i(B2.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.InterfaceC2938c
    public void close() {
        this.closed.set(true);
    }

    protected final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* renamed from: g, reason: from getter */
    protected final File getFile() {
        return this.file;
    }

    protected final D<T> h() {
        return this.serializer;
    }

    @Override // B2.B
    public Object c(Continuation<? super T> continuation) {
        return i(this, continuation);
    }
}
