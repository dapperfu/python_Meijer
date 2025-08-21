package androidx.room;

import androidx.room.C6273q;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/d0;", "Landroidx/room/q$b;", "Landroidx/room/q;", "tracker", "delegate", "<init>", "(Landroidx/room/q;Landroidx/room/q$b;)V", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "b", "Landroidx/room/q;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "delegateRef", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d0 extends C6273q.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C6273q tracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<C6273q.b> delegateRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(C6273q tracker, C6273q.b delegate) {
        super(delegate.getTables());
        Intrinsics.j(tracker, "tracker");
        Intrinsics.j(delegate, "delegate");
        this.tracker = tracker;
        this.delegateRef = new WeakReference<>(delegate);
    }

    @Override // androidx.room.C6273q.b
    public void c(Set<String> tables) {
        Intrinsics.j(tables, "tables");
        C6273q.b bVar = this.delegateRef.get();
        if (bVar == null) {
            this.tracker.z(this);
        } else {
            bVar.c(tables);
        }
    }
}
