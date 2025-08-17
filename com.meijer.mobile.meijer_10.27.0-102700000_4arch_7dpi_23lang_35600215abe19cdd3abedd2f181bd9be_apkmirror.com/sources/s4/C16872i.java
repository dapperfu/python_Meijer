package s4;

import java.util.Iterator;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import z4.InterfaceC18380b;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096A¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010.\u001a\u00020 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010-¨\u0006/"}, d2 = {"Ls4/i;", "Lz4/b;", "LAv/a;", "delegate", "lock", "<init>", "(Lz4/b;LAv/a;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "d", "(Lkotlin/coroutines/CoroutineContext;)Ls4/i;", "i", "()Ls4/i;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "a", "(Ljava/lang/StringBuilder;)V", "", "toString", "()Ljava/lang/String;", "sql", "Lz4/d;", "S3", "(Ljava/lang/String;)Lz4/d;", "close", "()V", "", "owner", "g", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Ljava/lang/Object;)Z", "h", "(Ljava/lang/Object;)V", "Lz4/b;", "LAv/a;", "c", "Lkotlin/coroutines/CoroutineContext;", "acquireCoroutineContext", "", "Ljava/lang/Throwable;", "acquireThrowable", "()Z", "isLocked", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: s4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16872i implements InterfaceC18380b, Av.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18380b delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Av.a lock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private CoroutineContext acquireCoroutineContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Throwable acquireThrowable;

    public C16872i(InterfaceC18380b delegate, Av.a lock) {
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
    }

    public final C16872i i() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    @Override // z4.InterfaceC18380b
    public InterfaceC18382d S3(String sql) {
        Intrinsics.j(sql, "sql");
        return this.delegate.S3(sql);
    }

    public final void a(StringBuilder builder) {
        Intrinsics.j(builder, "builder");
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
            return;
        }
        builder.append("\t\tStatus: Acquired connection");
        builder.append('\n');
        CoroutineContext coroutineContext = this.acquireCoroutineContext;
        if (coroutineContext != null) {
            builder.append("\t\tCoroutine: " + coroutineContext);
            builder.append('\n');
        }
        Throwable th2 = this.acquireThrowable;
        if (th2 != null) {
            builder.append("\t\tAcquired:");
            builder.append('\n');
            Iterator it = CollectionsKt.j0(StringsKt.z0(ExceptionsKt.b(th2)), 1).iterator();
            while (it.hasNext()) {
                builder.append("\t\t" + ((String) it.next()));
                builder.append('\n');
            }
        }
    }

    @Override // Av.a
    public boolean b(Object owner) {
        return this.lock.b(owner);
    }

    @Override // Av.a
    public boolean c() {
        return this.lock.c();
    }

    @Override // z4.InterfaceC18380b, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final C16872i d(CoroutineContext context) {
        Intrinsics.j(context, "context");
        this.acquireCoroutineContext = context;
        this.acquireThrowable = new Throwable();
        return this;
    }

    @Override // Av.a
    public Object g(Object obj, Continuation<? super Unit> continuation) {
        return this.lock.g(obj, continuation);
    }

    @Override // Av.a
    public void h(Object owner) {
        this.lock.h(owner);
    }

    public String toString() {
        return this.delegate.toString();
    }

    public /* synthetic */ C16872i(InterfaceC18380b interfaceC18380b, Av.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC18380b, (i10 & 2) != 0 ? Av.g.b(false, 1, null) : aVar);
    }
}
