package mv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u000b\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¨\u0006\u0010"}, d2 = {"Lmv/C;", "", "", "cause", "", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "c", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Throwable;", "_handled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.C, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C15771C {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f151645b = AtomicIntegerFieldUpdater.newUpdater(C15771C.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Throwable cause;

    public C15771C(Throwable th2, boolean z10) {
        this.cause = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public String toString() {
        return C15787T.a(this) + '[' + this.cause + ']';
    }

    public final boolean a() {
        if (f151645b.get(this) == 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return f151645b.compareAndSet(this, 0, 1);
    }

    public /* synthetic */ C15771C(Throwable th2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
