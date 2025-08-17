package B2;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LB2/q;", "T", "LB2/H;", "", "finalException", "<init>", "(Ljava/lang/Throwable;)V", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q<T> extends H<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Throwable finalException) {
        super(a.e.API_PRIORITY_OTHER, null);
        Intrinsics.j(finalException, "finalException");
        this.finalException = finalException;
    }

    /* renamed from: b, reason: from getter */
    public final Throwable getFinalException() {
        return this.finalException;
    }
}
