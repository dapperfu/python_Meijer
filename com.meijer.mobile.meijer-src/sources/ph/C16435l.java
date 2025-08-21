package ph;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.sdk.AttributeRef;
import com.launchdarkly.sdk.EvaluationReason;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oh.AbstractC16130a;
import ph.C16432i;
import ph.C16437n;

/* renamed from: ph.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C16435l {

    /* renamed from: a, reason: collision with root package name */
    private final C16434k f156526a;

    private void b(LDContext lDContext, JsonWriter jsonWriter, boolean z10) throws IOException {
        jsonWriter.name("context");
        this.f156526a.e(lDContext, jsonWriter, z10);
    }

    private void d(EvaluationReason evaluationReason, JsonWriter jsonWriter) throws JsonIOException, IOException {
        if (evaluationReason == null) {
            return;
        }
        jsonWriter.name("reason");
        AbstractC16130a.a().C(evaluationReason, EvaluationReason.class, jsonWriter);
    }

    private void f(JsonWriter jsonWriter, String str, long j10) throws IOException {
        jsonWriter.name("kind").value(str);
        jsonWriter.name("creationDate").value(j10);
    }

    private void g(String str, LDValue lDValue, JsonWriter jsonWriter) throws JsonIOException, IOException {
        if (lDValue == null || lDValue.k()) {
            return;
        }
        jsonWriter.name(str);
        AbstractC16130a.a().C(lDValue, LDValue.class, jsonWriter);
    }

    private static void i(JsonWriter jsonWriter, C16432i.e eVar) throws IOException {
        jsonWriter.name("measurements");
        jsonWriter.beginArray();
        e(jsonWriter, eVar);
        a(jsonWriter, eVar);
        h(jsonWriter, eVar);
        c(jsonWriter, eVar);
        jsonWriter.endArray();
    }

    private void j(JsonWriter jsonWriter, C16432i.e eVar) throws JsonIOException, IOException {
        jsonWriter.name("evaluation");
        jsonWriter.beginObject();
        jsonWriter.name("key").value(eVar.g());
        if (eVar.n() >= 0) {
            jsonWriter.name("variation");
            jsonWriter.value(eVar.n());
        }
        if (eVar.h() >= 0) {
            jsonWriter.name("version");
            jsonWriter.value(eVar.h());
        }
        g("value", eVar.m(), jsonWriter);
        g("default", eVar.e(), jsonWriter);
        d(eVar.l(), jsonWriter);
        jsonWriter.endObject();
    }

    int l(C16432i[] c16432iArr, C16437n.b bVar, Writer writer) throws JsonIOException, IOException {
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.beginArray();
        int i10 = 0;
        for (C16432i c16432i : c16432iArr) {
            if (k(c16432i, jsonWriter)) {
                i10++;
            }
        }
        if (!bVar.b()) {
            m(bVar, jsonWriter);
            i10++;
        }
        jsonWriter.endArray();
        jsonWriter.flush();
        return i10;
    }

    C16435l(C16438o c16438o) {
        boolean z10 = c16438o.f156542a;
        List<AttributeRef> list = c16438o.f156552k;
        this.f156526a = new C16434k(z10, (AttributeRef[]) list.toArray(new AttributeRef[list.size()]));
    }

    private static void a(JsonWriter jsonWriter, C16432i.e eVar) throws IOException {
        eVar.d();
    }

    private static void c(JsonWriter jsonWriter, C16432i.e eVar) throws IOException {
        eVar.f();
    }

    private static void e(JsonWriter jsonWriter, C16432i.e eVar) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("key").value("invoked");
        eVar.i();
        jsonWriter.name("values");
        jsonWriter.beginObject();
        throw null;
    }

    private static void h(JsonWriter jsonWriter, C16432i.e eVar) throws IOException {
        eVar.j();
    }

    private boolean k(C16432i c16432i, JsonWriter jsonWriter) throws JsonIOException, IOException {
        String str;
        if (c16432i.a() != null && c16432i.a().w()) {
            if (c16432i instanceof C16432i.b) {
                C16432i.b bVar = (C16432i.b) c16432i;
                jsonWriter.beginObject();
                if (bVar.l()) {
                    str = "debug";
                } else {
                    str = "feature";
                }
                f(jsonWriter, str, c16432i.b());
                jsonWriter.name("key").value(bVar.f());
                b(bVar.a(), jsonWriter, !bVar.l());
                if (bVar.k() >= 0) {
                    jsonWriter.name("version");
                    jsonWriter.value(bVar.k());
                }
                if (bVar.j() >= 0) {
                    jsonWriter.name("variation");
                    jsonWriter.value(bVar.j());
                }
                g("value", bVar.i(), jsonWriter);
                g("default", bVar.e(), jsonWriter);
                if (bVar.g() != null) {
                    jsonWriter.name("prereqOf");
                    jsonWriter.value(bVar.g());
                }
                d(bVar.h(), jsonWriter);
                jsonWriter.endObject();
            } else if (c16432i instanceof C16432i.c) {
                jsonWriter.beginObject();
                f(jsonWriter, "identify", c16432i.b());
                b(c16432i.a(), jsonWriter, false);
                jsonWriter.endObject();
            } else if (c16432i instanceof C16432i.a) {
                C16432i.a aVar = (C16432i.a) c16432i;
                jsonWriter.beginObject();
                f(jsonWriter, "custom", c16432i.b());
                jsonWriter.name("key").value(aVar.e());
                b(aVar.a(), jsonWriter, false);
                g("data", aVar.d(), jsonWriter);
                if (aVar.f() != null) {
                    jsonWriter.name("metricValue");
                    jsonWriter.value(aVar.f());
                }
                jsonWriter.endObject();
            } else if (c16432i instanceof C16432i.d) {
                jsonWriter.beginObject();
                f(jsonWriter, "index", c16432i.b());
                b(c16432i.a(), jsonWriter, false);
                jsonWriter.endObject();
            } else if (c16432i instanceof C16432i.e) {
                jsonWriter.beginObject();
                f(jsonWriter, "migration_op", c16432i.b());
                b(c16432i.a(), jsonWriter, false);
                C16432i.e eVar = (C16432i.e) c16432i;
                jsonWriter.name("operation").value(eVar.k());
                long jC = eVar.c();
                if (jC != 1) {
                    jsonWriter.name("samplingRatio").value(jC);
                }
                j(jsonWriter, eVar);
                i(jsonWriter, eVar);
                jsonWriter.endObject();
            }
            return true;
        }
        return false;
    }

    private void m(C16437n.b bVar, JsonWriter jsonWriter) throws JsonIOException, IOException {
        jsonWriter.beginObject();
        jsonWriter.name("kind");
        jsonWriter.value("summary");
        jsonWriter.name("startDate");
        jsonWriter.value(bVar.f156534b);
        jsonWriter.name("endDate");
        jsonWriter.value(bVar.f156535c);
        jsonWriter.name("features");
        jsonWriter.beginObject();
        for (Map.Entry<String, C16437n.c> entry : bVar.f156533a.entrySet()) {
            String key = entry.getKey();
            C16437n.c value = entry.getValue();
            jsonWriter.name(key);
            jsonWriter.beginObject();
            g("default", value.f156536a, jsonWriter);
            jsonWriter.name("contextKinds").beginArray();
            Iterator<String> it = value.f156538c.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            jsonWriter.name("counters");
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < value.f156537b.d(); i10++) {
                int iB = value.f156537b.b(i10);
                C16437n.d<C16437n.a> dVarE = value.f156537b.e(i10);
                for (int i11 = 0; i11 < dVarE.d(); i11++) {
                    int iB2 = dVarE.b(i11);
                    C16437n.a aVarE = dVarE.e(i11);
                    jsonWriter.beginObject();
                    if (iB2 >= 0) {
                        jsonWriter.name("variation").value(iB2);
                    }
                    if (iB >= 0) {
                        jsonWriter.name("version").value(iB);
                    } else {
                        jsonWriter.name(zzbz.UNKNOWN_CONTENT_TYPE).value(true);
                    }
                    g("value", aVarE.f156532b, jsonWriter);
                    jsonWriter.name("count").value(aVarE.f156531a);
                    jsonWriter.endObject();
                }
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
        jsonWriter.endObject();
    }
}
