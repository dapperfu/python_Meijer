package m8;

import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import java.text.ParseException;
import java.util.Map;
import m8.p;
import m8.q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface s {
    q a(Map<String, String> map, EnumC15686a enumC15686a);

    void b(q.b bVar, p.b bVar2, JSONObject jSONObject) throws JSONException, ParseException;

    void c(q.b bVar, p.b bVar2, JSONObject jSONObject) throws JSONException;

    void d(q.b bVar, JSONObject jSONObject) throws JSONException, ParseException;

    q e(q qVar, String str) throws JSONException, InvalidConfigurationException, ClassCastException;
}
