package androidx.view;

import androidx.view.AbstractC6165l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/M;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/S;", "provider", "<init>", "(Landroidx/lifecycle/S;)V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "a", "Landroidx/lifecycle/S;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.lifecycle.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6139M implements InterfaceC6169p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6144S provider;

    public C6139M(C6144S provider) {
        Intrinsics.j(provider, "provider");
        this.provider = provider;
    }

    @Override // androidx.view.InterfaceC6169p
    public void onStateChanged(InterfaceC6172s source, AbstractC6165l.a event) {
        Intrinsics.j(source, "source");
        Intrinsics.j(event, "event");
        if (event == AbstractC6165l.a.ON_CREATE) {
            source.getLifecycle().d(this);
            this.provider.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
