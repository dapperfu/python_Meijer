package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.j60, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8394j60 {

    /* renamed from: a, reason: collision with root package name */
    public final List f75336a;

    /* renamed from: b, reason: collision with root package name */
    public final C7648c60 f75337b;

    /* renamed from: c, reason: collision with root package name */
    public final List f75338c;

    /* renamed from: d, reason: collision with root package name */
    public final C9853wo f75339d;

    public static C8394j60 a(Reader reader, C9853wo c9853wo) throws IOException, zzfbs {
        try {
            try {
                return new C8394j60(new JsonReader(reader), c9853wo);
            } finally {
                com.google.android.gms.common.util.l.a(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e10) {
            throw new zzfbs("unable to parse ServerResponse", e10);
        }
    }

    C8394j60(JsonReader jsonReader, C9853wo c9853wo) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        Bundle bundle;
        Bundle bundle2;
        this.f75339d = c9853wo;
        if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue() && c9853wo != null && (bundle2 = c9853wo.f79538m) != null) {
            bundle2.putLong(EnumC7889eN.SERVER_RESPONSE_PARSE_START.a(), Lc.v.c().a());
        }
        List arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        C7648c60 c7648c60 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new Z50(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        c7648c60 = new C7648c60(jsonReader);
                        if (((Boolean) Mc.A.c().a(C8659lf.f76406l2)).booleanValue() && c9853wo != null && (bundle = c9853wo.f79538m) != null) {
                            bundle.putLong(EnumC7889eN.NORMALIZATION_AD_RESPONSE_START.a(), c7648c60.f73120s);
                            c9853wo.f79538m.putLong(EnumC7889eN.NORMALIZATION_AD_RESPONSE_END.a(), c7648c60.f73121t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectI = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectI = Pc.U.i(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new C8289i60(strNextString, jSONObjectI));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f75338c = arrayList2;
        this.f75336a = arrayList;
        this.f75337b = c7648c60 == null ? new C7648c60(new JsonReader(new StringReader("{}"))) : c7648c60;
    }
}
