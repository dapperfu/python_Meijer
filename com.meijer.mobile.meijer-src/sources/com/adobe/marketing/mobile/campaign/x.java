package com.adobe.marketing.mobile.campaign;

import R5.C5117d;
import com.adobe.marketing.mobile.C6574h;
import g6.C14328a;
import g6.C14331d;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class x {
    static i a(C5117d c5117d) {
        try {
            JSONObject jSONObject = new JSONObject(c5117d.a());
            return new i(jSONObject.getString("url"), jSONObject.getString("payload"), jSONObject.getInt("timeout"));
        } catch (JSONException e10) {
            R5.t.f("Campaign", "campaignHitFromDataEntity", "JSON exception occurred converting data entity to campaign hit: %s", e10.getMessage());
            return null;
        }
    }

    static Map<String, String> d(S5.c cVar) throws NumberFormatException {
        HashMap map = new HashMap();
        if (cVar == null) {
            return map;
        }
        Map<String, String> mapK = cVar.k();
        String str = mapK == null ? "" : mapK.get("Etag");
        map.put("If-None-Match", str != null ? str : "");
        String str2 = mapK == null ? null : mapK.get("Last-Modified");
        long j10 = 0;
        if (str2 != null) {
            try {
                j10 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
            }
        }
        map.put("If-Modified-Since", g6.j.g(j10, DesugarTimeZone.getTimeZone("GMT"), Locale.US));
        return map;
    }

    static HashMap<String, String> e(R5.o oVar) throws ParseException {
        HashMap<String, String> map = new HashMap<>();
        Date dateI = g6.j.i(oVar.b("Last-Modified"), DesugarTimeZone.getTimeZone("GMT"), Locale.US);
        map.put("Last-Modified", dateI == null ? String.valueOf(new Date(0L).getTime()) : String.valueOf(dateI.getTime()));
        String strB = oVar.b("Etag");
        if (strB == null) {
            strB = "";
        }
        map.put("Etag", strB);
        return map;
    }

    static void b(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (file.isDirectory() && fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
        }
        file.delete();
    }

    static void c(File file, List<String> list) {
        File[] fileArrListFiles = file.listFiles();
        if (file.isDirectory() && fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                c(file2, list);
            }
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!file.getName().equals(M5.o.a(it.next())) && file.exists()) {
                file.delete();
            }
        }
    }

    static Map<String, String> f(String str) {
        if (g6.i.a(str)) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            if (!g6.i.a(str2)) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length == 2 && !strArrSplit[0].isEmpty() && !strArrSplit[1].isEmpty()) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    static boolean g(C6574h c6574h) {
        Map mapT = C14328a.t(Object.class, c6574h.o(), "triggeredconsequence", null);
        if (C14331d.a(mapT)) {
            return false;
        }
        return "iam".equals(mapT.get("type"));
    }
}
