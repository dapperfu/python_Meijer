package com.adobe.marketing.mobile.assurance.internal;

import android.net.Uri;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.constructor.data.local.PreferencesHelper;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6420b {

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.b$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6442y f62228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62229b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f62230c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1233b f62231d;

        a(C6442y c6442y, String str, byte[] bArr, InterfaceC1233b interfaceC1233b) {
            this.f62228a = c6442y;
            this.f62229b = str;
            this.f62230c = bArr;
            this.f62231d = interfaceC1233b;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException, IOException {
            try {
                String strC = F.c(this.f62228a.l());
                String strN = this.f62228a.n();
                Uri.Builder builderAppendPath = new Uri.Builder().encodedPath(String.format("https://blob%s.griffon.adobe.com", strC)).appendPath("api").appendPath("FileUpload");
                if (strN == null || strN.isEmpty()) {
                    strN = "";
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(builderAppendPath.appendQueryParameter("validationSessionId", strN).build().toString()).openConnection())));
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
                httpURLConnection.setRequestProperty("File-Content-Type", this.f62229b);
                httpURLConnection.setRequestProperty("Content-Length", "" + this.f62230c.length);
                httpURLConnection.setRequestProperty("Accept", "application/json");
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(this.f62230c);
                httpURLConnection.getResponseCode();
                httpURLConnection.getResponseMessage();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb2.append(line);
                    }
                }
                dataOutputStream.flush();
                dataOutputStream.close();
                JSONObject jSONObject = new JSONObject(sb2.toString());
                if (jSONObject.has("error")) {
                    String string = jSONObject.getString("error");
                    if (!string.isEmpty()) {
                        this.f62231d.a("Error occurred when posting blob, error - " + string);
                        return;
                    }
                }
                if (jSONObject.has(PreferencesHelper.PREF_ID)) {
                    String string2 = jSONObject.getString(PreferencesHelper.PREF_ID);
                    if (string2.isEmpty()) {
                        C6420b.d(this.f62231d, "Uploading Blob failed, Invalid BlobId returned from the fileStorage server");
                    } else {
                        C6420b.e(this.f62231d, string2);
                    }
                }
            } catch (MalformedURLException e10) {
                C6420b.d(this.f62231d, String.format("Uploading Blob failed, MalformedURLException %s", e10));
            } catch (IOException e11) {
                C6420b.d(this.f62231d, String.format("Uploading Blob failed, IOException %s", e11));
            } catch (JSONException e12) {
                C6420b.d(this.f62231d, "Uploading Blob failed, Json exception while parsing response, Error - " + e12);
            } catch (Exception e13) {
                C6420b.d(this.f62231d, String.format("Uploading Blob failed with Exception : %s", e13));
            }
        }
    }

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.b$b, reason: collision with other inner class name */
    interface InterfaceC1233b {
        void a(String str);

        void onSuccess(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(InterfaceC1233b interfaceC1233b, String str) {
        Q5.t.b("Assurance", "AssuranceBlob", str, new Object[0]);
        if (interfaceC1233b != null) {
            interfaceC1233b.a(str);
        }
    }

    static void c(byte[] bArr, String str, C6442y c6442y, InterfaceC1233b interfaceC1233b) {
        if (bArr == null) {
            d(interfaceC1233b, "Sending Blob failed, blobData is null");
        } else if (c6442y != null) {
            new Thread(new a(c6442y, str, bArr, interfaceC1233b)).start();
        } else {
            d(interfaceC1233b, "Unable to upload blob, assurance session instance unavailable");
            d(interfaceC1233b, "Unable to upload blob, assurance session instance unavailable");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(InterfaceC1233b interfaceC1233b, String str) {
        Q5.t.a("Assurance", "AssuranceBlob", "Blob upload successfull for id:" + str, new Object[0]);
        if (interfaceC1233b != null) {
            interfaceC1233b.onSuccess(str);
        }
    }
}
