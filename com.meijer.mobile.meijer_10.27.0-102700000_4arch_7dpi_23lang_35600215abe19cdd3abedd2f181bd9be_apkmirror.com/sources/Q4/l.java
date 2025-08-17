package Q4;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/app/job/JobInfo$Builder;", "builder", "Landroid/net/NetworkRequest;", "networkRequest", "", "a", "(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l {
    public static final void a(JobInfo.Builder builder, NetworkRequest networkRequest) {
        Intrinsics.j(builder, "builder");
        builder.setRequiredNetwork(networkRequest);
    }
}
