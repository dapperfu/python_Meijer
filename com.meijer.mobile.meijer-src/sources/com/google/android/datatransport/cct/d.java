package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.fullstory.FS;
import com.google.android.datatransport.cct.d;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.encoders.EncodingException;
import com.google.maps.internal.HttpHeaders;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import rc.C16883c;
import sc.AbstractC17038a;
import sc.AbstractC17051n;
import sc.AbstractC17052o;
import sc.AbstractC17053p;
import sc.AbstractC17054q;
import sc.AbstractC17055r;
import sc.AbstractC17056s;
import sc.AbstractC17057t;
import sc.AbstractC17058u;
import sc.AbstractC17059v;
import sc.AbstractC17060w;
import sc.EnumC17061x;
import tc.h;
import tc.i;
import uc.AbstractC17373f;
import uc.AbstractC17374g;
import uc.InterfaceC17380m;
import xc.C18156a;
import yc.C18300b;
import yc.InterfaceC18299a;
import yc.InterfaceC18301c;

/* loaded from: classes4.dex */
final class d implements InterfaceC17380m {

    /* renamed from: a, reason: collision with root package name */
    private final Df.a f65261a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f65262b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f65263c;

    /* renamed from: d, reason: collision with root package name */
    final URL f65264d;

    /* renamed from: e, reason: collision with root package name */
    private final Dc.a f65265e;

    /* renamed from: f, reason: collision with root package name */
    private final Dc.a f65266f;

    /* renamed from: g, reason: collision with root package name */
    private final int f65267g;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f65268a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC17051n f65269b;

        /* renamed from: c, reason: collision with root package name */
        final String f65270c;

        a a(URL url) {
            return new a(url, this.f65269b, this.f65270c);
        }

        a(URL url, AbstractC17051n abstractC17051n, String str) {
            this.f65268a = url;
            this.f65269b = abstractC17051n;
            this.f65270c = str;
        }
    }

    d(Context context, Dc.a aVar, Dc.a aVar2, int i10) {
        this.f65261a = AbstractC17051n.b();
        this.f65263c = context;
        this.f65262b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f65264d = n(com.google.android.datatransport.cct.a.f65252c);
        this.f65265e = aVar2;
        this.f65266f = aVar;
        this.f65267g = i10;
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f65271a;

        /* renamed from: b, reason: collision with root package name */
        final URL f65272b;

        /* renamed from: c, reason: collision with root package name */
        final long f65273c;

        b(int i10, URL url, long j10) {
            this.f65271a = i10;
            this.f65272b = url;
            this.f65273c = j10;
        }
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f65272b;
        if (url == null) {
            return null;
        }
        C18156a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f65272b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        C18156a.f("CctTransportBackend", "Making request to: %s", aVar.f65268a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) FS.urlconnection_wrapInstance(aVar.f65268a.openConnection());
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f65267g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f65270c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f65261a.a(aVar.f65269b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C18156a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    C18156a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C18156a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC17059v.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (EncodingException e10) {
            e = e10;
            C18156a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(HttpResponseStatus.ERROR_BAD_REQUEST, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            C18156a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            C18156a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, null, 0L);
        } catch (IOException e13) {
            e = e13;
            C18156a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(HttpResponseStatus.ERROR_BAD_REQUEST, null, 0L);
        }
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC17060w.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC17060w.b.COMBINED.b();
        }
        if (AbstractC17060w.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC17060w.c.NONE.b() : networkInfo.getType();
    }

    private AbstractC17051n j(AbstractC17373f abstractC17373f) {
        AbstractC17057t.a aVarL;
        HashMap map = new HashMap();
        for (i iVar : abstractC17373f.b()) {
            String strN = iVar.n();
            if (map.containsKey(strN)) {
                ((List) map.get(strN)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strN, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            AbstractC17058u.a aVarB = AbstractC17058u.a().f(EnumC17061x.DEFAULT).g(this.f65266f.a()).h(this.f65265e.a()).b(AbstractC17052o.a().c(AbstractC17052o.b.ANDROID_FIREBASE).b(AbstractC17038a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b(PlaceTypes.COUNTRY)).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                C16883c c16883cB = hVarE.b();
                if (c16883cB.equals(C16883c.b("proto"))) {
                    aVarL = AbstractC17057t.l(hVarE.a());
                } else if (c16883cB.equals(C16883c.b("json"))) {
                    aVarL = AbstractC17057t.k(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    C18156a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c16883cB);
                }
                aVarL.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(AbstractC17060w.a().c(AbstractC17060w.c.a(iVar3.i("net-type"))).b(AbstractC17060w.b.a(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarL.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    aVarL.b(AbstractC17053p.a().b(AbstractC17056s.a().b(AbstractC17055r.a().b(iVar3.l()).a()).a()).c(AbstractC17053p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    AbstractC17054q.a aVarA = AbstractC17054q.a();
                    if (iVar3.g() != null) {
                        aVarA.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        aVarA.c(iVar3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return AbstractC17051n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // uc.InterfaceC17380m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f65262b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c(PlaceTypes.COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f65263c)).c("application_build", Integer.toString(i(this.f65263c))).d();
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        if (simOperator != null) {
            return simOperator;
        }
        return "";
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C18156a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    @Override // uc.InterfaceC17380m
    public AbstractC17374g b(AbstractC17373f abstractC17373f) {
        AbstractC17051n abstractC17051nJ = j(abstractC17373f);
        URL urlN = this.f65264d;
        String strD = null;
        if (abstractC17373f.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(abstractC17373f.c());
                if (aVarC.d() != null) {
                    strD = aVarC.d();
                }
                if (aVarC.e() != null) {
                    urlN = n(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC17374g.a();
            }
        }
        try {
            b bVar = (b) C18300b.a(5, new a(urlN, abstractC17051nJ, strD), new InterfaceC18299a() { // from class: com.google.android.datatransport.cct.b
                @Override // yc.InterfaceC18299a
                public final Object apply(Object obj) {
                    return this.f65260a.e((d.a) obj);
                }
            }, new InterfaceC18301c() { // from class: com.google.android.datatransport.cct.c
                @Override // yc.InterfaceC18301c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f65271a;
            if (i10 == 200) {
                return AbstractC17374g.e(bVar.f65273c);
            }
            if (i10 < 500 && i10 != 404) {
                if (i10 == 400) {
                    return AbstractC17374g.d();
                }
                return AbstractC17374g.a();
            }
            return AbstractC17374g.f();
        } catch (IOException e10) {
            C18156a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return AbstractC17374g.f();
        }
    }

    d(Context context, Dc.a aVar, Dc.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
