package P4;

import W4.WorkGenerationalId;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"LP4/B;", "LP4/z;", "delegate", "<init>", "(LP4/z;)V", "LW4/h;", PreferencesHelper.PREF_ID, "LP4/y;", "e", "(LW4/h;)LP4/y;", "f", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "c", "(LW4/h;)Z", "b", "LP4/z;", "", "Ljava/lang/Object;", "lock", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class B implements z {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z delegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    public B(z delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
        this.lock = new Object();
    }

    @Override // P4.z
    public boolean c(WorkGenerationalId id2) {
        boolean zC;
        Intrinsics.j(id2, "id");
        synchronized (this.lock) {
            zC = this.delegate.c(id2);
        }
        return zC;
    }

    @Override // P4.z
    public y e(WorkGenerationalId id2) {
        y yVarE;
        Intrinsics.j(id2, "id");
        synchronized (this.lock) {
            yVarE = this.delegate.e(id2);
        }
        return yVarE;
    }

    @Override // P4.z
    public y f(WorkGenerationalId id2) {
        y yVarF;
        Intrinsics.j(id2, "id");
        synchronized (this.lock) {
            yVarF = this.delegate.f(id2);
        }
        return yVarF;
    }

    @Override // P4.z
    public List<y> remove(String workSpecId) {
        List<y> listRemove;
        Intrinsics.j(workSpecId, "workSpecId");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}
