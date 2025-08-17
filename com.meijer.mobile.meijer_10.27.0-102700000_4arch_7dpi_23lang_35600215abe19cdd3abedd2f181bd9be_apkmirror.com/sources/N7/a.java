package N7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;
import x8.f;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: N7.a$a, reason: collision with other inner class name */
    public static class C0339a {

        /* renamed from: a, reason: collision with root package name */
        private String f21467a;

        /* renamed from: b, reason: collision with root package name */
        private String f21468b;

        /* renamed from: c, reason: collision with root package name */
        private String f21469c;

        public String a() {
            return this.f21467a;
        }

        public String b() {
            return this.f21468b;
        }

        public String c() {
            return this.f21469c;
        }

        public C0339a(String str, String str2, String str3) {
            this.f21467a = str;
            this.f21468b = str2;
            this.f21469c = str3;
        }
    }

    public static JSONObject a(Throwable th2) throws JSONException {
        try {
            JSONObject jSONObjectC = c(th2);
            jSONObjectC.put("characteristics.has_crash", true);
            jSONObjectC.put("error.is_fatal", true);
            f.a("dtxEventGeneration", "crash event: " + jSONObjectC);
            return jSONObjectC;
        } catch (JSONException unused) {
            f.a("dtxEventGeneration", "crash event can't be generated");
            return null;
        }
    }

    public static JSONObject b(Throwable th2, String str) throws JSONException {
        try {
            JSONObject jSONObjectC = c(th2);
            jSONObjectC.put("name", str);
            jSONObjectC.put("characteristics.has_exception", true);
            f.a("dtxEventGeneration", "error event: " + jSONObjectC);
            return jSONObjectC;
        } catch (JSONException unused) {
            f.a("dtxEventGeneration", "error event can't be generated");
            return null;
        }
    }

    public static C0339a d(Throwable th2, int i10, int i11) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return new C0339a(th2.getClass().getName(), th2.getMessage() != null ? f(th2.getMessage(), i11) : null, th2.getStackTrace().length > 0 ? e(stringWriter.toString(), i10) : null);
    }

    private static String g(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        int length = 0;
        for (String str2 : str.split("\n")) {
            length += str2.getBytes(StandardCharsets.UTF_8).length + 1;
            if (length > i10) {
                sb2.append("...");
                return sb2.toString();
            }
            sb2.append(str2);
            sb2.append("\n");
        }
        sb2.append("...");
        return sb2.toString();
    }

    private static JSONObject c(Throwable th2) throws JSONException {
        C0339a c0339aD = d(th2, 224000, 24000);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("characteristics.has_error", true);
        if (c0339aD.b() != null) {
            jSONObject.put("exception.message", c0339aD.b());
        }
        if (c0339aD.a() != null) {
            jSONObject.put("exception.type", c0339aD.a());
        }
        if (c0339aD.c() != null) {
            jSONObject.put("exception.stack_trace", c0339aD.c());
        }
        return jSONObject;
    }

    private static String e(String str, int i10) {
        if (str.getBytes().length > i10) {
            return g(str, i10);
        }
        return str;
    }

    private static String f(String str, int i10) {
        byte[] bytes = str.getBytes();
        if (bytes.length <= i10) {
            return str;
        }
        return new String(bytes, 0, i10) + "...";
    }
}
