package M7;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"LM7/l;", "LM7/b;", "", "applicationId", "agentVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "LM7/g;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "c", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String applicationId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String agentVersion;

    public l(String applicationId, String agentVersion) {
        Intrinsics.j(applicationId, "applicationId");
        Intrinsics.j(agentVersion, "agentVersion");
        this.applicationId = applicationId;
        this.agentVersion = agentVersion;
    }

    @Override // M7.b
    public List<EnrichmentAttribute> a() {
        List listC = CollectionsKt.c();
        c.b(listC, "dt.rum.schema_version", "0.19.0");
        c.b(listC, "dt.rum.agent.version", this.agentVersion);
        c.b(listC, "dt.rum.agent.type", "android");
        c.b(listC, "dt.rum.application.id", this.applicationId);
        return CollectionsKt.a(listC);
    }
}
