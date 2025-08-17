package B2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122B\u0010\u001c\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0013¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010!\u001a\u00020\n2-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001f¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100¨\u00062"}, d2 = {"LB2/o;", "T", "LB2/J;", "Ljava/io/File;", "file", "LB2/D;", "serializer", "LB2/s;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;LB2/D;LB2/s;Lkotlin/jvm/functions/Function0;)V", "f", "()V", "g", "(Ljava/io/File;)V", "R", "Lkotlin/Function3;", "LB2/B;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "d", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "LB2/O;", "b", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "a", "Ljava/io/File;", "LB2/D;", "c", "LB2/s;", "e", "()LB2/s;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "LAv/a;", "LAv/a;", "transactionMutex", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: B2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2950o<T> implements J<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D<T> serializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s coordinator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClose;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean closed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Av.a transactionMutex;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
    /* renamed from: B2.o$a */
    static final class a<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1959a;

        /* renamed from: b, reason: collision with root package name */
        Object f1960b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1961c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1962d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2950o<T> f1963e;

        /* renamed from: f, reason: collision with root package name */
        int f1964f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2950o<T> c2950o, Continuation<? super a> continuation) {
            super(continuation);
            this.f1963e = c2950o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1962d = obj;
            this.f1964f |= Integer.MIN_VALUE;
            return this.f1963e.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
    /* renamed from: B2.o$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1965a;

        /* renamed from: b, reason: collision with root package name */
        Object f1966b;

        /* renamed from: c, reason: collision with root package name */
        Object f1967c;

        /* renamed from: d, reason: collision with root package name */
        Object f1968d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f1969e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2950o<T> f1970f;

        /* renamed from: g, reason: collision with root package name */
        int f1971g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2950o<T> c2950o, Continuation<? super b> continuation) {
            super(continuation);
            this.f1970f = c2950o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1969e = obj;
            this.f1971g |= Integer.MIN_VALUE;
            return this.f1970f.b(null, this);
        }
    }

    public C2950o(File file, D<T> serializer, s coordinator, Function0<Unit> onClose) {
        Intrinsics.j(file, "file");
        Intrinsics.j(serializer, "serializer");
        Intrinsics.j(coordinator, "coordinator");
        Intrinsics.j(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = Av.g.b(false, 1, null);
    }

    private final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [Av.a, int] */
    @Override // B2.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.jvm.functions.Function2<? super B2.O<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2950o.b(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.InterfaceC2938c
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [B2.o] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [B2.o$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [B2.o] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    @Override // B2.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object d(kotlin.jvm.functions.Function3<? super B2.B<T>, ? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super R> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof B2.C2950o.a
            if (r0 == 0) goto L13
            r0 = r9
            B2.o$a r0 = (B2.C2950o.a) r0
            int r1 = r0.f1964f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1964f = r1
            goto L18
        L13:
            B2.o$a r0 = new B2.o$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f1962d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f1964f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f1961c
            java.lang.Object r1 = r0.f1960b
            B2.c r1 = (B2.InterfaceC2938c) r1
            java.lang.Object r0 = r0.f1959a
            B2.o r0 = (B2.C2950o) r0
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L34
            goto L6b
        L34:
            r9 = move-exception
            goto L84
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.ResultKt.b(r9)
            r7.f()
            Av.a r9 = r7.transactionMutex
            boolean r9 = Av.a.C0027a.b(r9, r4, r3, r4)
            B2.m r2 = new B2.m     // Catch: java.lang.Throwable -> L8d
            java.io.File r5 = r7.file     // Catch: java.lang.Throwable -> L8d
            B2.D<T> r6 = r7.serializer     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r9)     // Catch: java.lang.Throwable -> L7e
            r0.f1959a = r7     // Catch: java.lang.Throwable -> L7e
            r0.f1960b = r2     // Catch: java.lang.Throwable -> L7e
            r0.f1961c = r9     // Catch: java.lang.Throwable -> L7e
            r0.f1964f = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r8 != r1) goto L66
            return r1
        L66:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L70
            r1 = r4
            goto L71
        L70:
            r1 = move-exception
        L71:
            if (r1 != 0) goto L7b
            if (r8 == 0) goto L7a
            Av.a r8 = r0.transactionMutex
            Av.a.C0027a.c(r8, r4, r3, r4)
        L7a:
            return r9
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            goto L92
        L7e:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r9, r1)     // Catch: java.lang.Throwable -> L7c
        L8c:
            throw r9     // Catch: java.lang.Throwable -> L7c
        L8d:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L92:
            if (r8 == 0) goto L99
            Av.a r8 = r0.transactionMutex
            Av.a.C0027a.c(r8, r4, r3, r4)
        L99:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2950o.d(kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.J
    /* renamed from: e, reason: from getter */
    public s getCoordinator() {
        return this.coordinator;
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }
}
