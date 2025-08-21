package T5;

import M5.g;
import R5.K;
import R5.t;
import g6.C14335h;
import g6.i;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes4.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f35908a;

    private boolean d(S5.a aVar, String str, String str2) {
        if (aVar != null && !i.a(str2)) {
            HashMap map = new HashMap();
            map.put("pathToFile", str);
            Date dateB = aVar.b().b();
            if (dateB != null) {
                map.put("expiryInMillis", String.valueOf(dateB.getTime()));
            }
            if (aVar.c() != null) {
                map.putAll(aVar.c());
            }
            try {
                return g.h(new File(str2), new ByteArrayInputStream(new JSONObject(map).toString().getBytes(StandardCharsets.UTF_8)), false);
            } catch (Exception e10) {
                t.a("Services", "CacheFileManager", "Cannot create cache metadata %s", e10);
            }
        }
        return false;
    }

    a(String str) {
        this.f35908a = str;
    }

    private boolean a(String str, String str2) {
        if (!i.a(str) && !i.a(str2)) {
            return true;
        }
        return false;
    }

    File b(String str) {
        if (i.a(str)) {
            return null;
        }
        File fileO = K.f().e().o();
        if (!g.e(fileO)) {
            t.a("Services", "CacheFileManager", "App cache directory is not writable.", new Object[0]);
            return null;
        }
        File file = new File(fileO, this.f35908a + File.separator + str);
        if (!file.exists() && !file.mkdirs()) {
            t.a("Services", "CacheFileManager", "Cannot create cache bucket.", new Object[0]);
            return null;
        }
        return file;
    }

    boolean c(String str, String str2, S5.a aVar) throws NoSuchAlgorithmException, SecurityException {
        if (!a(str, str2)) {
            return false;
        }
        String strG = g(str, str2);
        if (strG == null) {
            t.a("Services", "CacheFileManager", "Entry location for cache name: [%s], cache key [%s] is null.", str, str2);
            return false;
        }
        if (!g.h(new File(strG), aVar.a(), false)) {
            t.a("Services", "CacheFileManager", "Failed to save cache file for cache name: [%s], cache key [%s].", str, str2);
            return false;
        }
        if (d(aVar, strG, i(str, str2))) {
            return true;
        }
        t.a("Services", "CacheFileManager", "Failed to save metadata forcache name: [%s], cache key [%s].", str, str2);
        g.b(new File(strG), true);
        return false;
    }

    boolean e(String str, String str2) throws NoSuchAlgorithmException, SecurityException {
        if (!a(str, str2)) {
            return false;
        }
        File fileF = f(str, str2);
        if (fileF == null) {
            t.a("Services", "CacheFileManager", "Cannot delete cache file. No file to delete.", new Object[0]);
            return true;
        }
        if (!g.b(fileF, true)) {
            t.a("Services", "CacheFileManager", "Failed to delete cache file for cache name [%s], key: [%s]", str, str2);
            return false;
        }
        String strI = i(str, str2);
        if (strI != null) {
            t.a("Services", "CacheFileManager", "Failed to delete cache metadata file for cache name [%s], key: [%s]", str, str2);
            g.b(new File(strI), true);
        }
        return true;
    }

    File f(String str, String str2) throws NoSuchAlgorithmException {
        String strG = g(str, str2);
        if (strG == null) {
            return null;
        }
        File file = new File(strG);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    String g(String str, String str2) throws NoSuchAlgorithmException {
        if (!a(str, str2)) {
            return null;
        }
        String strA = C14335h.a(str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K.f().e().o().getPath());
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(this.f35908a);
        sb2.append(str3);
        sb2.append(str);
        sb2.append(str3);
        sb2.append(strA);
        return sb2.toString();
    }

    Map<String, String> h(String str, String str2) {
        if (!a(str, str2)) {
            return null;
        }
        String strI = i(str, str2);
        if (strI == null) {
            t.a("Services", "CacheFileManager", "Metadata location forcache name: [%s], cache key [%s] is null.", str, str2);
            return null;
        }
        String strG = g.g(new File(strI));
        if (strG == null) {
            t.a("Services", "CacheFileManager", "Metadata stored forcache name: [%s], cache key [%s] is null.", str, str2);
            return null;
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(new JSONTokener(strG));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException e10) {
            t.a("Services", "CacheFileManager", "Cannot create cache metadata forcache name: [%s], cache key: [%s] due to %s", str, str2, e10.getMessage());
            return null;
        }
    }

    String i(String str, String str2) {
        if (!a(str, str2)) {
            return null;
        }
        return g(str, str2) + "_metadata.txt";
    }
}
