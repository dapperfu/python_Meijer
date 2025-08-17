package com.google.firebase.remoteconfig.internal;

import a2.C5559a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import com.fullstory.FS;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.maps.internal.HttpHeaders;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f89181h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    private final Context f89182a;

    /* renamed from: b, reason: collision with root package name */
    private final String f89183b;

    /* renamed from: c, reason: collision with root package name */
    private final String f89184c;

    /* renamed from: d, reason: collision with root package name */
    private final String f89185d;

    /* renamed from: e, reason: collision with root package name */
    private final String f89186e;

    /* renamed from: f, reason: collision with root package name */
    private final long f89187f;

    /* renamed from: g, reason: collision with root package name */
    private final long f89188g;

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private void l(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void m(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f89187f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f89188g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        j(httpURLConnection, str2);
        k(httpURLConnection, map);
    }

    private String b(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j10));
    }

    private JSONObject c(String str, String str2, Map<String, String> map, Long l10, Map<String, String> map2) throws PackageManager.NameNotFoundException, FirebaseRemoteConfigClientException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f89183b);
        Locale locale = this.f89182a.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i10 = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i10));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f89182a.getPackageManager().getPackageInfo(this.f89182a.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(C5559a.a(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", this.f89182a.getPackageName());
        map3.put("sdkVersion", BuildConfig.VERSION_NAME);
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            FS.log_d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l10 != null) {
            map3.put("firstOpenTime", b(l10.longValue()));
        }
        return new JSONObject(map3);
    }

    private static g e(JSONObject jSONObject, Date date) throws JSONException, FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            g.b bVarD = g.l().d(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                bVarD = bVarD.b(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                bVarD = bVarD.c(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                bVarD = bVarD.e(jSONObject3);
            }
            String string = jSONObject.has("templateVersion") ? jSONObject.getString("templateVersion") : null;
            if (string != null) {
                bVarD.g(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray("rolloutMetadata");
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                bVarD = bVarD.f(jSONArray2);
            }
            return bVarD.a();
        } catch (JSONException e10) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e10);
        }
    }

    private static String f(String str) {
        Matcher matcher = f89181h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject g(URLConnection uRLConnection) throws JSONException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read();
            if (i10 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i10);
        }
    }

    private String h(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    private String i() {
        try {
            Context context = this.f89182a;
            byte[] bArrA = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return com.google.android.gms.common.util.k.b(bArrA, false);
            }
            FS.log_e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f89182a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            FS.log_e("FirebaseRemoteConfig", "No such package: " + this.f89182a.getPackageName(), e10);
            return null;
        }
    }

    private void j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f89184c);
        httpURLConnection.setRequestProperty(HttpHeaders.X_ANDROID_PACKAGE, this.f89182a.getPackageName());
        httpURLConnection.setRequestProperty(HttpHeaders.X_ANDROID_CERT, i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    HttpURLConnection d() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) FS.urlconnection_wrapInstance(new URL(h(this.f89185d, this.f89186e)).openConnection());
        } catch (IOException e10) {
            throw new FirebaseRemoteConfigException(e10.getMessage());
        }
    }

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        this.f89182a = context;
        this.f89183b = str;
        this.f89184c = str2;
        this.f89185d = f(str);
        this.f89186e = str3;
        this.f89187f = j10;
        this.f89188g = j11;
    }

    private void k(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    @Keep
    m.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date, Map<String, String> map3) throws FirebaseRemoteConfigException {
        m(httpURLConnection, str3, str2, map2);
        try {
            try {
                l(httpURLConnection, c(str, str2, map, l10, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject jSONObjectG = g(httpURLConnection);
                    httpURLConnection.disconnect();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    g gVarE = e(jSONObjectG, date);
                    if (!a(jSONObjectG)) {
                        return m.a.a(date, gVarE);
                    }
                    return m.a.b(gVarE, headerField);
                }
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            } finally {
            }
        } catch (IOException | JSONException e10) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e10);
        }
    }
}
