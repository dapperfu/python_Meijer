package K6;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LK6/g;", "LK6/d;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", PreferencesHelper.PREF_ID, "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Throwable cause;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String id;

    public g(Throwable cause) {
        Intrinsics.j(cause, "cause");
        this.cause = cause;
    }

    /* renamed from: a, reason: from getter */
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // K6.d
    public String getId() {
        return this.id;
    }
}
