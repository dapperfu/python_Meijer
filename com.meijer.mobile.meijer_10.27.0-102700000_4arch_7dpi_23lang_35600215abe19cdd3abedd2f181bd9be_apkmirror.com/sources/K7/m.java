package K7;

import V7.SessionInformationMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"LK7/m;", "LK7/b;", "LV7/g;", "sessionInformationMetrics", "<init>", "(LV7/g;)V", "", "LK7/g;", "a", "()Ljava/util/List;", "LV7/g;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SessionInformationMetrics sessionInformationMetrics;

    public m(SessionInformationMetrics sessionInformationMetrics) {
        Intrinsics.j(sessionInformationMetrics, "sessionInformationMetrics");
        this.sessionInformationMetrics = sessionInformationMetrics;
    }

    @Override // K7.b
    public List<EnrichmentAttribute> a() {
        List listC = CollectionsKt.c();
        c.a(listC, "dt.rum.instance.id", this.sessionInformationMetrics.getInstanceId());
        c.a(listC, "dt.rum.sid", this.sessionInformationMetrics.getSessionId());
        return CollectionsKt.a(listC);
    }
}
