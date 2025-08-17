package v4;

import A4.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv4/l;", "LA4/d$c;", "delegate", "Lv4/b;", "autoCloser", "<init>", "(LA4/d$c;Lv4/b;)V", "LA4/d$b;", "configuration", "Lv4/g;", "b", "(LA4/d$b;)Lv4/g;", "a", "LA4/d$c;", "Lv4/b;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: v4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17506l implements d.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.c delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C17496b autoCloser;

    public C17506l(d.c delegate, C17496b autoCloser) {
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
    }

    @Override // A4.d.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C17501g a(d.b configuration) {
        Intrinsics.j(configuration, "configuration");
        return new C17501g(this.delegate.a(configuration), this.autoCloser);
    }
}
