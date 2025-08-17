package s7;

import V7.SessionInformationMetrics;
import Z7.MetricsDataModel;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bH&¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ls7/h;", "", "Lorg/json/JSONObject;", "jsonObject", "", "startTimestamp", "duration", "LV7/g;", "sessionInformationMetrics", "", "isApiReported", "", "eventContext", "", "b", "(Lorg/json/JSONObject;JJLV7/g;Z[Ljava/lang/Object;)V", "c", "(Lorg/json/JSONObject;LV7/g;[Ljava/lang/Object;)V", "LZ7/d;", "metricsData", "a", "(Lorg/json/JSONObject;JLV7/g;LZ7/d;)V", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface h {
    void a(JSONObject jsonObject, long startTimestamp, SessionInformationMetrics sessionInformationMetrics, MetricsDataModel metricsData);

    void b(JSONObject jsonObject, long startTimestamp, long duration, SessionInformationMetrics sessionInformationMetrics, boolean isApiReported, Object[] eventContext);

    void c(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics, Object[] eventContext);
}
