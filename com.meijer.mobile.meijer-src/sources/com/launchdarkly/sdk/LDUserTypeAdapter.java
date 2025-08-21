package com.launchdarkly.sdk;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.sdk.h;
import java.io.IOException;

@Deprecated
/* loaded from: classes8.dex */
final class LDUserTypeAdapter extends TypeAdapter<h> {

    /* renamed from: a, reason: collision with root package name */
    static final LDUserTypeAdapter f91838a = new LDUserTypeAdapter();

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public h read(JsonReader jsonReader) throws IOException {
        h.a aVar = new h.a(null);
        jsonReader.beginObject();
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "anonymous":
                    if (jsonReader.peek() != JsonToken.NULL) {
                        aVar.m(jsonReader.nextBoolean());
                        break;
                    } else {
                        jsonReader.nextNull();
                        break;
                    }
                case "lastName":
                    aVar.w(g.c(jsonReader));
                    break;
                case "avatar":
                    aVar.n(g.c(jsonReader));
                    break;
                case "custom":
                    if (jsonReader.peek() != JsonToken.NULL) {
                        jsonReader.beginObject();
                        while (jsonReader.peek() != JsonToken.END_OBJECT) {
                            aVar.q(jsonReader.nextName(), LDValueTypeAdapter.f91848a.read(jsonReader));
                        }
                        jsonReader.endObject();
                        break;
                    } else {
                        jsonReader.nextNull();
                        break;
                    }
                case "ip":
                    aVar.u(g.c(jsonReader));
                    break;
                case "key":
                    aVar.v(g.c(jsonReader));
                    break;
                case "name":
                    aVar.x(g.c(jsonReader));
                    break;
                case "email":
                    aVar.s(g.c(jsonReader));
                    break;
                case "firstName":
                    aVar.t(g.c(jsonReader));
                    break;
                case "privateAttributeNames":
                    if (jsonReader.peek() != JsonToken.NULL) {
                        jsonReader.beginArray();
                        while (jsonReader.peek() != JsonToken.END_ARRAY) {
                            aVar.l(UserAttribute.a(jsonReader.nextString()));
                        }
                        jsonReader.endArray();
                        break;
                    } else {
                        jsonReader.nextNull();
                        break;
                    }
                case "country":
                    aVar.p(g.c(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.o();
    }

    LDUserTypeAdapter() {
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, h hVar) throws IOException {
        jsonWriter.beginObject();
        for (UserAttribute userAttribute : UserAttribute.f91859l.values()) {
            if (userAttribute != UserAttribute.f91858k || hVar.d()) {
                LDValue lDValueA = hVar.a(userAttribute);
                if (!lDValueA.k()) {
                    jsonWriter.name(userAttribute.b());
                    LDValueTypeAdapter.f91848a.write(jsonWriter, lDValueA);
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        for (UserAttribute userAttribute2 : hVar.b()) {
            if (!z11) {
                jsonWriter.name("custom");
                jsonWriter.beginObject();
                z11 = true;
            }
            jsonWriter.name(userAttribute2.b());
            LDValueTypeAdapter.f91848a.write(jsonWriter, hVar.a(userAttribute2));
        }
        if (z11) {
            jsonWriter.endObject();
        }
        for (UserAttribute userAttribute3 : hVar.c()) {
            if (!z10) {
                jsonWriter.name("privateAttributeNames");
                jsonWriter.beginArray();
                z10 = true;
            }
            jsonWriter.value(userAttribute3.b());
        }
        if (z10) {
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
