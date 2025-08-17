package ga;

import R8.a;
import android.app.Activity;
import da.C13500b;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"Lga/j;", "LR8/a;", "Lga/n;", "geofenceInternal", "", "priority", "", "repeatable", "LR8/a$a;", "triggeringLifecycle", "<init>", "(Lga/n;IZLR8/a$a;)V", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "Lga/n;", "b", "I", "c", "()I", "Z", "d", "()Z", "LR8/a$a;", "()LR8/a$a;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j implements R8.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n geofenceInternal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int priority;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean repeatable;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a.EnumC0721a triggeringLifecycle;

    public j(n geofenceInternal, int i10, boolean z10, a.EnumC0721a triggeringLifecycle) {
        Intrinsics.j(geofenceInternal, "geofenceInternal");
        Intrinsics.j(triggeringLifecycle, "triggeringLifecycle");
        this.geofenceInternal = geofenceInternal;
        this.priority = i10;
        this.repeatable = z10;
        this.triggeringLifecycle = triggeringLifecycle;
    }

    @Override // R8.a
    public void a(Activity activity) throws IllegalArgumentException {
        n nVar = this.geofenceInternal;
        l9.b concurrentHandlerHolder = C13500b.b().getConcurrentHandlerHolder();
        Object objNewProxyInstance = Proxy.newProxyInstance(nVar.getClass().getClassLoader(), nVar.getClass().getInterfaces(), new S8.d(nVar));
        if (objNewProxyInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.geofence.GeofenceInternal");
        }
        n nVar2 = (n) objNewProxyInstance;
        Object objNewProxyInstance2 = Proxy.newProxyInstance(nVar2.getClass().getClassLoader(), nVar2.getClass().getInterfaces(), new S8.b(nVar2, concurrentHandlerHolder, 5L));
        if (objNewProxyInstance2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.geofence.GeofenceInternal");
        }
        ((n) objNewProxyInstance2).a(null);
    }

    @Override // R8.a
    /* renamed from: b, reason: from getter */
    public a.EnumC0721a getTriggeringLifecycle() {
        return this.triggeringLifecycle;
    }

    @Override // R8.a
    /* renamed from: c, reason: from getter */
    public int getPriority() {
        return this.priority;
    }

    @Override // R8.a
    /* renamed from: d, reason: from getter */
    public boolean getRepeatable() {
        return this.repeatable;
    }

    public /* synthetic */ j(n nVar, int i10, boolean z10, a.EnumC0721a enumC0721a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? a.EnumC0721a.f31934b : enumC0721a);
    }
}
