package sf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qf.C16649i;

/* loaded from: classes8.dex */
class g {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f160344b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final wf.g f160345a;

    class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f160346a;

        a(String str) throws JSONException {
            this.f160346a = str;
            put("userId", str);
        }
    }

    public void q(String str, Map<String, String> map) throws Throwable {
        r(str, map, false);
    }

    private static Map<String, String> e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, p(jSONObject, next));
        }
        return map;
    }

    private static List<j> f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e10) {
                nf.g.f().l("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    private String g(String str) throws JSONException {
        return p(new JSONObject(str), "userId");
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String l(List<j> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(j.f160372a.b(list.get(i10))));
            } catch (JSONException e10) {
                nf.g.f().l("Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static String o(String str) throws JSONException {
        return new a(str).toString();
    }

    public File a(String str) {
        return this.f160345a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f160345a.q(str, "keys");
    }

    public File c(String str) {
        return this.f160345a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f160345a.q(str, "user-data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    Map<String, String> i(String str, boolean z10) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e10;
        File fileA = z10 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            n(fileA, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileA);
                try {
                    Map<String, String> mapE = e(C16649i.B(fileInputStream));
                    C16649i.f(fileInputStream, "Failed to close user metadata file.");
                    return mapE;
                } catch (Exception e11) {
                    e10 = e11;
                    nf.g.f().l("Error deserializing user metadata.", e10);
                    m(fileA);
                    C16649i.f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th3) {
                th2 = th3;
                C16649i.f(, "Failed to close user metadata file.");
                throw th2;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th4) {
            ?? r12 = 0;
            th2 = th4;
            C16649i.f(r12, "Failed to close user metadata file.");
            throw th2;
        }
    }

    public List<j> j(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            n(fileC, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileC);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            List<j> listF = f(C16649i.B(fileInputStream));
            nf.g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
            C16649i.f(fileInputStream, "Failed to close rollouts state file.");
            return listF;
        } catch (Exception e11) {
            e = e11;
            fileInputStream2 = fileInputStream;
            nf.g.f().l("Error deserializing rollouts state.", e);
            m(fileC);
            C16649i.f(fileInputStream2, "Failed to close rollouts state file.");
            return Collections.EMPTY_LIST;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            C16649i.f(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public String k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            nf.g.f().b("No userId set for session " + str);
            m(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
            try {
                try {
                    String strG = g(C16649i.B(fileInputStream));
                    nf.g.f().b("Loaded userId " + strG + " for session " + str);
                    C16649i.f(fileInputStream, "Failed to close user metadata file.");
                    return strG;
                } catch (Exception e10) {
                    e = e10;
                    nf.g.f().l("Error deserializing user metadata.", e);
                    m(fileD);
                    C16649i.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                C16649i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            C16649i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void r(String str, Map<String, String> map, boolean z10) throws Throwable {
        String strH;
        BufferedWriter bufferedWriter;
        File fileA = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strH = h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f160344b));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            bufferedWriter.write(strH);
            bufferedWriter.flush();
            C16649i.f(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            nf.g.f().l("Error serializing key/value metadata.", e);
            m(fileA);
            C16649i.f(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            C16649i.f(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    public void s(String str, List<j> list) throws Throwable {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e10;
        File fileC = c(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            n(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strL = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f160344b));
                try {
                    bufferedWriter.write(strL);
                    bufferedWriter.flush();
                    C16649i.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e11) {
                    e10 = e11;
                    nf.g.f().l("Error serializing rollouts state.", e10);
                    m(fileC);
                    C16649i.f(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th3) {
                th2 = th3;
                C16649i.f(IsEmpty, "Failed to close rollouts state file.");
                throw th2;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th4) {
            IsEmpty = 0;
            th2 = th4;
            C16649i.f(IsEmpty, "Failed to close rollouts state file.");
            throw th2;
        }
    }

    public void t(String str, String str2) throws Throwable {
        String strO;
        BufferedWriter bufferedWriter;
        File fileD = d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strO = o(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f160344b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(strO);
            bufferedWriter.flush();
            C16649i.f(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            nf.g.f().l("Error serializing user metadata.", e);
            C16649i.f(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            C16649i.f(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public g(wf.g gVar) {
        this.f160345a = gVar;
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            nf.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void n(File file, String str) {
        if (file.exists() && file.delete()) {
            nf.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    private static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }
}
