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
class C6545b {

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.b$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6567y f63067a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f63068b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f63069c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1243b f63070d;

        a(C6567y c6567y, String str, byte[] bArr, InterfaceC1243b interfaceC1243b) {
            this.f63067a = c6567y;
            this.f63068b = str;
            this.f63069c = bArr;
            this.f63070d = interfaceC1243b;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException, IOException {
            try {
                String strC = F.c(this.f63067a.l());
                String strN = this.f63067a.n();
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
                httpURLConnection.setRequestProperty("File-Content-Type", this.f63068b);
                httpURLConnection.setRequestProperty("Content-Length", "" + this.f63069c.length);
                httpURLConnection.setRequestProperty("Accept", "application/json");
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(this.f63069c);
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
                        this.f63070d.a("Error occurred when posting blob, error - " + string);
                        return;
                    }
                }
                if (jSONObject.has(PreferencesHelper.PREF_ID)) {
                    String string2 = jSONObject.getString(PreferencesHelper.PREF_ID);
                    if (string2.isEmpty()) {
                        C6545b.d(this.f63070d, "Uploading Blob failed, Invalid BlobId returned from the fileStorage server");
                    } else {
                        C6545b.e(this.f63070d, string2);
                    }
                }
            } catch (MalformedURLException e10) {
                C6545b.d(this.f63070d, String.format("Uploading Blob failed, MalformedURLException %s", e10));
            } catch (IOException e11) {
                C6545b.d(this.f63070d, String.format("Uploading Blob failed, IOException %s", e11));
            } catch (JSONException e12) {
                C6545b.d(this.f63070d, "Uploading Blob failed, Json exception while parsing response, Error - " + e12);
            } catch (Exception e13) {
                C6545b.d(this.f63070d, String.format("Uploading Blob failed with Exception : %s", e13));
            }
        }
    }

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.b$b, reason: collision with other inner class name */
    interface InterfaceC1243b {
        void a(String str);

        void onSuccess(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(InterfaceC1243b interfaceC1243b, String str) {
        R5.t.b("Assurance", "AssuranceBlob", str, new Object[0]);
        if (interfaceC1243b != null) {
            interfaceC1243b.a(str);
        }
    }

    static void c(byte[] bArr, String str, C6567y c6567y, InterfaceC1243b interfaceC1243b) {
        if (bArr == null) {
            d(interfaceC1243b, "Sending Blob failed, blobData is null");
        } else if (c6567y != null) {
            new Thread(new a(c6567y, str, bArr, interfaceC1243b)).start();
        } else {
            d(interfaceC1243b, "Unable to upload blob, assurance session instance unavailable");
            d(interfaceC1243b, "Unable to upload blob, assurance session instance unavailable");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(InterfaceC1243b interfaceC1243b, String str) {
        R5.t.a("Assurance", "AssuranceBlob", "Blob upload successfull for id:" + str, new Object[0]);
        if (interfaceC1243b != null) {
            interfaceC1243b.onSuccess(str);
        }
    }
}
