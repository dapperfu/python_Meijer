package aa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Laa/b;", "Laa/a;", "Lw9/b;", "requestManager", "Lwa/c;", "requestModelFactory", "<init>", "(Lw9/b;Lwa/c;)V", "LV8/a;", "completionListener", "", "a", "(LV8/a;)V", "Lw9/b;", "b", "Lwa/c;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aa.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5589b implements InterfaceC5588a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w9.b requestManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wa.c requestModelFactory;

    public C5589b(w9.b requestManager, wa.c requestModelFactory) {
        Intrinsics.j(requestManager, "requestManager");
        Intrinsics.j(requestModelFactory, "requestModelFactory");
        this.requestManager = requestManager;
        this.requestModelFactory = requestModelFactory;
    }

    @Override // aa.InterfaceC5588a
    public void a(V8.a completionListener) {
        try {
            this.requestManager.b(this.requestModelFactory.i(), completionListener);
        } catch (IllegalArgumentException e10) {
            if (completionListener != null) {
                completionListener.a(e10);
            }
        }
    }
}
