package O8;

import fa.C13973b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LO8/a;", "LO8/b;", "", "loggingInstance", "<init>", "(Z)V", "LX8/a;", "completionListener", "", "a", "(LX8/a;)V", "Z", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean loggingInstance;

    public a(boolean z10) {
        this.loggingInstance = z10;
    }

    public /* synthetic */ a(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // O8.b
    public void a(X8.a completionListener) {
        (this.loggingInstance ? C13973b.b().w() : C13973b.b().S()).a(completionListener);
    }
}
