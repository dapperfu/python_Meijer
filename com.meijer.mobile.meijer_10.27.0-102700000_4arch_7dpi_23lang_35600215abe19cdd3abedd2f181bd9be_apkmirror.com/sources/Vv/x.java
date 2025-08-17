package Vv;

import Vv.v;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LVv/x;", "LVv/j;", "LVv/v;", "routePlanner", "<init>", "(LVv/v;)V", "LVv/p;", "a", "()LVv/p;", "LVv/v;", "b", "()LVv/v;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class x implements j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v routePlanner;

    @Override // Vv.j
    public p a() throws Throwable {
        v.b bVarD;
        IOException iOException = null;
        while (!getRoutePlanner().isCanceled()) {
            try {
                bVarD = getRoutePlanner().d();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    ExceptionsKt.a(iOException, e10);
                }
                if (!v.e(getRoutePlanner(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!bVarD.getIsReady()) {
                v.ConnectResult connectResultH = bVarD.h();
                if (connectResultH.f()) {
                    connectResultH = bVarD.e();
                }
                v.b nextPlan = connectResultH.getNextPlan();
                Throwable throwable = connectResultH.getThrowable();
                if (throwable != null) {
                    throw throwable;
                }
                if (nextPlan != null) {
                    getRoutePlanner().c().addFirst(nextPlan);
                }
            }
            return bVarD.getConnection();
        }
        throw new IOException("Canceled");
    }

    public x(v routePlanner) {
        Intrinsics.j(routePlanner, "routePlanner");
        this.routePlanner = routePlanner;
    }

    @Override // Vv.j
    /* renamed from: b, reason: from getter */
    public v getRoutePlanner() {
        return this.routePlanner;
    }
}
