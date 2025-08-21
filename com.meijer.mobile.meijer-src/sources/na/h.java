package na;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lna/h;", "", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(Ln9/b;)V", "Lna/s;", "jsCommandFactory", "Lna/g;", "a", "(Lna/s;)Lna/g;", "Ln9/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    public h(n9.b concurrentHandlerHolder) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    public g a(s jsCommandFactory) {
        Intrinsics.j(jsCommandFactory, "jsCommandFactory");
        return new g(this.concurrentHandlerHolder, jsCommandFactory);
    }
}
