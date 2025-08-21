package X4;

import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"LX4/x;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "request", "", "a", "(Landroid/net/NetworkRequest;)[I", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f41603a = new x();

    public final int[] a(NetworkRequest request) {
        Intrinsics.j(request, "request");
        int[] capabilities = request.getCapabilities();
        Intrinsics.i(capabilities, "request.capabilities");
        return capabilities;
    }

    public final int[] b(NetworkRequest request) {
        Intrinsics.j(request, "request");
        int[] transportTypes = request.getTransportTypes();
        Intrinsics.i(transportTypes, "request.transportTypes");
        return transportTypes;
    }

    private x() {
    }
}
