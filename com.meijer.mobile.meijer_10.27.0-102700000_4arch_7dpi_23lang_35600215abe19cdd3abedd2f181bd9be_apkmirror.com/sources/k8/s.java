package k8;

import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import java.text.ParseException;
import java.util.Map;
import k8.p;
import k8.q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface s {
    void a(q.b bVar, p.b bVar2, JSONObject jSONObject) throws JSONException;

    q b(Map<String, String> map, EnumC15115a enumC15115a);

    void c(q.b bVar, p.b bVar2, JSONObject jSONObject) throws JSONException, ParseException;

    q d(q qVar, String str) throws JSONException, InvalidConfigurationException, ClassCastException;

    void e(q.b bVar, JSONObject jSONObject) throws JSONException, ParseException;
}
