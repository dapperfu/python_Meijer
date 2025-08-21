package X4;

import O4.AbstractC4373v;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LX4/u;", "", "<init>", "()V", "", "capabilities", "transports", "Landroid/net/NetworkRequest;", "a", "([I[I)Landroid/net/NetworkRequest;", "request", "", "capability", "", "c", "(Landroid/net/NetworkRequest;I)Z", "transport", "d", "LX4/y;", "b", "([I[I)LX4/y;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f41602a = new u();

    @JvmStatic
    public static final NetworkRequest a(int[] capabilities, int[] transports) {
        Intrinsics.j(capabilities, "capabilities");
        Intrinsics.j(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : capabilities) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e10) {
                AbstractC4373v.e().l(NetworkRequestCompat.INSTANCE.a(), "Ignoring adding capability '" + i10 + '\'', e10);
            }
        }
        for (int i11 : z.f41607a) {
            if (!ArraysKt.W(capabilities, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e11) {
                    AbstractC4373v.e().l(NetworkRequestCompat.INSTANCE.a(), "Ignoring removing default capability '" + i11 + '\'', e11);
                }
            }
        }
        for (int i12 : transports) {
            builder.addTransportType(i12);
        }
        NetworkRequest networkRequestBuild = builder.build();
        Intrinsics.i(networkRequestBuild, "networkRequest.build()");
        return networkRequestBuild;
    }

    public final NetworkRequestCompat b(int[] capabilities, int[] transports) {
        Intrinsics.j(capabilities, "capabilities");
        Intrinsics.j(transports, "transports");
        return new NetworkRequestCompat(a(capabilities, transports));
    }

    public final boolean c(NetworkRequest request, int capability) {
        Intrinsics.j(request, "request");
        return request.hasCapability(capability);
    }

    public final boolean d(NetworkRequest request, int transport) {
        Intrinsics.j(request, "request");
        return request.hasTransport(transport);
    }

    private u() {
    }
}
