package com.launchdarkly.sdk;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
final class LDContextTypeAdapter extends TypeAdapter<LDContext> {
    private static LDContext b(LDValue lDValue) throws JsonParseException {
        LDValue lDValueG;
        d(lDValue, i.OBJECT, false, null);
        c cVarB = LDContext.b(null);
        cVarB.m(true);
        for (String str : lDValue.m()) {
            lDValueG = lDValue.g(str);
            str.getClass();
            switch (str) {
                case "anonymous":
                    cVarB.a(d(lDValueG, i.BOOLEAN, true, str).a());
                    break;
                case "lastName":
                case "avatar":
                case "ip":
                case "email":
                case "firstName":
                case "country":
                    cVarB.j(str, d(lDValueG, i.STRING, true, str));
                    break;
                case "custom":
                    for (String str2 : d(lDValueG, i.OBJECT, true, "custom").m()) {
                        cVarB.j(str2, lDValueG.g(str2));
                    }
                    break;
                case "key":
                    cVarB.d(d(lDValueG, i.STRING, false, str).x());
                    break;
                case "name":
                    cVarB.g(d(lDValueG, i.STRING, true, str).x());
                    break;
                case "privateAttributeNames":
                    Iterator<LDValue> it = d(lDValueG, i.ARRAY, true, "privateAttributeNames").z().iterator();
                    while (it.hasNext()) {
                        cVarB.i(AttributeRef.b(d(it.next(), i.STRING, false, "privateAttributes").x()));
                    }
                    break;
            }
        }
        return cVarB.b();
    }

    private static LDContext c(LDValue lDValue, d dVar) throws JsonParseException {
        LDValue lDValueG;
        d(lDValue, i.OBJECT, false, dVar == null ? null : dVar.toString());
        c cVarE = LDContext.b("").e(dVar);
        boolean z10 = dVar != null;
        for (String str : lDValue.m()) {
            lDValueG = lDValue.g(str);
            str.getClass();
            switch (str) {
                case "anonymous":
                    cVarE.a(d(lDValueG, i.BOOLEAN, true, str).a());
                    break;
                case "key":
                    cVarE.d(d(lDValueG, i.STRING, false, str).x());
                    break;
                case "kind":
                    String strX = d(lDValueG, i.STRING, false, str).x();
                    if (strX.isEmpty()) {
                        break;
                    } else {
                        cVarE.f(strX);
                        z10 = true;
                        break;
                    }
                case "name":
                    cVarE.g(d(lDValueG, i.STRING, true, str).x());
                    break;
                case "_meta":
                    Iterator<LDValue> it = d(d(lDValueG, i.OBJECT, true, str).g("privateAttributes"), i.ARRAY, true, "privateAttributes").z().iterator();
                    while (it.hasNext()) {
                        cVarE.i(AttributeRef.e(d(it.next(), i.STRING, false, "privateAttributes").x()));
                    }
                    break;
                default:
                    cVarE.j(str, lDValueG);
                    break;
            }
        }
        return !z10 ? LDContext.g("context kind must not be empty in JSON") : cVarE.b();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LDContext read(JsonReader jsonReader) throws JsonParseException, IOException {
        d dVarE;
        LDContext lDContextC;
        LDValue lDValueD = d(LDValueTypeAdapter.f91009a.read(jsonReader), i.OBJECT, false, null);
        Iterator<String> it = lDValueD.m().iterator();
        while (true) {
            if (!it.hasNext()) {
                dVarE = null;
                break;
            }
            String next = it.next();
            if (next.equals("kind")) {
                dVarE = d.e(d(lDValueD.g(next), i.STRING, false, "kind").x());
                break;
            }
        }
        if (dVarE == null) {
            lDContextC = b(lDValueD);
        } else if (dVarE.equals(d.f91301c)) {
            e eVarX = LDContext.x();
            for (String str : lDValueD.m()) {
                if (!str.equals("kind")) {
                    eVarX.a(c(lDValueD.g(str), d.e(str)));
                }
            }
            lDContextC = eVarX.b();
        } else {
            lDContextC = c(lDValueD, null);
        }
        if (lDContextC.w()) {
            return lDContextC;
        }
        throw new JsonParseException("invalid LDContext: " + lDContextC.i());
    }

    LDContextTypeAdapter() {
    }

    private static LDValue d(LDValue lDValue, i iVar, boolean z10, String str) throws JsonParseException {
        String str2;
        if (lDValue.h() != iVar && (!z10 || !lDValue.k())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected ");
            sb2.append(iVar);
            sb2.append(", found ");
            sb2.append(lDValue.h());
            if (str == null) {
                str2 = "";
            } else {
                str2 = " for " + str;
            }
            sb2.append(str2);
            throw new JsonParseException(sb2.toString());
        }
        return lDValue;
    }

    private void f(JsonWriter jsonWriter, LDContext lDContext, boolean z10) throws IOException {
        jsonWriter.beginObject();
        if (z10) {
            jsonWriter.name("kind").value(lDContext.o().toString());
        }
        jsonWriter.name("key").value(lDContext.n());
        if (lDContext.p() != null) {
            jsonWriter.name("name").value(lDContext.p());
        }
        if (lDContext.u()) {
            jsonWriter.name("anonymous").value(lDContext.u());
        }
        b bVar = lDContext.attributes;
        if (bVar != null) {
            for (Map.Entry<String, LDValue> entry : bVar.a().entrySet()) {
                jsonWriter.name(entry.getKey());
                LDValueTypeAdapter.f91009a.write(jsonWriter, entry.getValue());
            }
        }
        if (lDContext.r() != 0) {
            jsonWriter.name("_meta").beginObject();
            jsonWriter.name("privateAttributes").beginArray();
            Iterator<AttributeRef> it = lDContext.privateAttributes.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next().toString());
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, LDContext lDContext) throws IOException {
        if (lDContext.w()) {
            if (lDContext.v()) {
                jsonWriter.beginObject();
                jsonWriter.name("kind").value(d.f91301c.toString());
                for (LDContext lDContext2 : lDContext.multiContexts) {
                    jsonWriter.name(lDContext2.o().toString());
                    f(jsonWriter, lDContext2, false);
                }
                jsonWriter.endObject();
                return;
            }
            f(jsonWriter, lDContext, true);
            return;
        }
        throw new JsonIOException("tried to serialize invalid LDContext: " + lDContext.i());
    }
}
