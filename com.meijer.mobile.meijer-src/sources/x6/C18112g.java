package x6;

import android.app.Application;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* renamed from: x6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18112g extends C18114i {

    /* renamed from: G, reason: collision with root package name */
    private static final String f170534G = "g";

    /* renamed from: H, reason: collision with root package name */
    private static final C18112g f170535H = new C18112g();

    /* renamed from: A, reason: collision with root package name */
    private String f170536A;

    /* renamed from: B, reason: collision with root package name */
    private String f170537B;

    /* renamed from: C, reason: collision with root package name */
    public b f170538C;

    /* renamed from: E, reason: collision with root package name */
    public String f170540E;

    /* renamed from: D, reason: collision with root package name */
    private long f170539D = System.currentTimeMillis();

    /* renamed from: F, reason: collision with root package name */
    private String f170541F = "";

    /* renamed from: x6.g$a */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            C18112g c18112g = C18112g.this;
            c18112g.v(c18112g.f170566v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x6.g$b */
    public interface b {
        void a();

        void a(float f10);

        void a(String str);

        void b();

        void c();
    }

    final synchronized String u() {
        if (this.f170536A != null && System.currentTimeMillis() <= this.f170539D) {
            return this.f170536A;
        }
        return "";
    }

    public static C18112g s() {
        return f170535H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b A[PHI: r0 r4
      0x015b: PHI (r0v8 boolean) = (r0v5 boolean), (r0v6 boolean), (r0v7 boolean), (r0v10 boolean) binds: [B:60:0x0159, B:65:0x0174, B:68:0x0189, B:70:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r4v9 java.net.HttpURLConnection) = 
      (r4v6 java.net.HttpURLConnection)
      (r4v7 java.net.HttpURLConnection)
      (r4v8 java.net.HttpURLConnection)
      (r4v11 java.net.HttpURLConnection)
     binds: [B:60:0x0159, B:65:0x0174, B:68:0x0189, B:70:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean v(java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.C18112g.v(java.lang.String):boolean");
    }

    @Override // x6.C18114i
    protected final void d(int i10) {
        this.f170538C.a(i10 / 10.0f);
    }

    @Override // x6.C18114i
    protected final void h(String str) {
        r.e(f170534G, "Error: ".concat(String.valueOf(str)), new Throwable[0]);
        this.f170538C.a();
        this.f170538C.a(str);
    }

    @Override // x6.C18114i
    final String n() {
        StringBuilder sb2 = new StringBuilder(this.f170545a + "/_bm/get_params?type=sdk-cca");
        try {
            String str = this.f170540E;
            if (str != null && !str.equals("")) {
                sb2.append("&context=");
                sb2.append(URLEncoder.encode(this.f170540E, "UTF-8"));
            }
            String str2 = this.f170541F;
            if (str2 != null && !str2.equals("")) {
                sb2.append("&payload=");
                sb2.append(URLEncoder.encode(this.f170541F, "UTF-8"));
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f170541F = "";
        return sb2.toString();
    }

    @Override // x6.C18114i
    protected final void o() {
        new Thread(new a()).start();
    }

    private C18112g() {
    }

    @Override // x6.C18114i
    public final void g(Application application, String str, JSONObject jSONObject) {
        f(application, str);
    }

    @Override // x6.C18114i
    protected final void p() {
        super.p();
        this.f170538C.a();
        this.f170538C.c();
        k(0);
    }
}
