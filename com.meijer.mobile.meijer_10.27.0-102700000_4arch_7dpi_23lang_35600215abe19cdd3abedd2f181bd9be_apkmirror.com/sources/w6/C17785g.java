package w6;

import android.app.Application;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* renamed from: w6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17785g extends C17787i {

    /* renamed from: G, reason: collision with root package name */
    private static final String f165889G = "g";

    /* renamed from: H, reason: collision with root package name */
    private static final C17785g f165890H = new C17785g();

    /* renamed from: A, reason: collision with root package name */
    private String f165891A;

    /* renamed from: B, reason: collision with root package name */
    private String f165892B;

    /* renamed from: C, reason: collision with root package name */
    public b f165893C;

    /* renamed from: E, reason: collision with root package name */
    public String f165895E;

    /* renamed from: D, reason: collision with root package name */
    private long f165894D = System.currentTimeMillis();

    /* renamed from: F, reason: collision with root package name */
    private String f165896F = "";

    /* renamed from: w6.g$a */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            C17785g c17785g = C17785g.this;
            c17785g.v(c17785g.f165921v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w6.g$b */
    public interface b {
        void a();

        void a(float f10);

        void a(String str);

        void b();

        void c();
    }

    final synchronized String u() {
        if (this.f165891A != null && System.currentTimeMillis() <= this.f165894D) {
            return this.f165891A;
        }
        return "";
    }

    public static C17785g s() {
        return f165890H;
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
        throw new UnsupportedOperationException("Method not decompiled: w6.C17785g.v(java.lang.String):boolean");
    }

    @Override // w6.C17787i
    protected final void d(int i10) {
        this.f165893C.a(i10 / 10.0f);
    }

    @Override // w6.C17787i
    protected final void h(String str) {
        r.e(f165889G, "Error: ".concat(String.valueOf(str)), new Throwable[0]);
        this.f165893C.a();
        this.f165893C.a(str);
    }

    @Override // w6.C17787i
    final String n() {
        StringBuilder sb2 = new StringBuilder(this.f165900a + "/_bm/get_params?type=sdk-cca");
        try {
            String str = this.f165895E;
            if (str != null && !str.equals("")) {
                sb2.append("&context=");
                sb2.append(URLEncoder.encode(this.f165895E, "UTF-8"));
            }
            String str2 = this.f165896F;
            if (str2 != null && !str2.equals("")) {
                sb2.append("&payload=");
                sb2.append(URLEncoder.encode(this.f165896F, "UTF-8"));
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f165896F = "";
        return sb2.toString();
    }

    @Override // w6.C17787i
    protected final void o() {
        new Thread(new a()).start();
    }

    private C17785g() {
    }

    @Override // w6.C17787i
    public final void g(Application application, String str, JSONObject jSONObject) {
        f(application, str);
    }

    @Override // w6.C17787i
    protected final void p() {
        super.p();
        this.f165893C.a();
        this.f165893C.c();
        k(0);
    }
}
