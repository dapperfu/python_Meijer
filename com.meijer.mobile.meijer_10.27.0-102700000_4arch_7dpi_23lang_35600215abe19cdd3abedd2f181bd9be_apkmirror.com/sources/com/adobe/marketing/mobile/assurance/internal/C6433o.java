package com.adobe.marketing.mobile.assurance.internal;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6433o {
    static JSONObject b(String str) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                Context applicationContext = Q5.K.f().a().getApplicationContext();
                if (applicationContext == null) {
                    return new JSONObject();
                }
                XmlResourceParser xmlResourceParserOpenXmlResourceParser = applicationContext.createPackageContext(applicationContext.getPackageName(), 0).getAssets().openXmlResourceParser(str);
                xmlResourceParserOpenXmlResourceParser.next();
                JSONObject jSONObjectA = a(xmlResourceParserOpenXmlResourceParser);
                xmlResourceParserOpenXmlResourceParser.close();
                return jSONObjectA;
            } catch (Exception e10) {
                Q5.t.a("Assurance", "Failed to create parse %s file. Error: %s", str, e10.getMessage());
                if (0 != 0) {
                    xmlResourceParser.close();
                }
                return new JSONObject();
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }

    static JSONObject a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        Stack stack = new Stack();
        while (xmlPullParser.getEventType() != 1) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 0) {
                stack.add(new JSONObject());
                xmlPullParser.next();
            } else if (eventType == 2) {
                JSONObject jSONObject = new JSONObject();
                int attributeCount = xmlPullParser.getAttributeCount();
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    jSONObject.put(xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                }
                stack.push(jSONObject);
                xmlPullParser.next();
            } else if (eventType == 3) {
                JSONObject jSONObject2 = (JSONObject) stack.pop();
                JSONObject jSONObject3 = (JSONObject) stack.peek();
                if (!jSONObject3.has(xmlPullParser.getName())) {
                    jSONObject3.put(xmlPullParser.getName(), jSONObject2);
                } else if (jSONObject3.get(xmlPullParser.getName()) instanceof JSONArray) {
                    ((JSONArray) jSONObject3.get(xmlPullParser.getName())).put(jSONObject2);
                } else {
                    JSONObject jSONObject4 = (JSONObject) jSONObject3.get(xmlPullParser.getName());
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject4).put(jSONObject2);
                    jSONObject3.put(xmlPullParser.getName(), jSONArray);
                }
                xmlPullParser.next();
            } else if (eventType == 4) {
                JSONObject jSONObject5 = (JSONObject) stack.peek();
                String strTrim = xmlPullParser.getText().trim();
                if (!f6.i.a(strTrim)) {
                    jSONObject5.put("content", strTrim);
                }
                xmlPullParser.next();
            }
        }
        return (JSONObject) stack.pop();
    }
}
