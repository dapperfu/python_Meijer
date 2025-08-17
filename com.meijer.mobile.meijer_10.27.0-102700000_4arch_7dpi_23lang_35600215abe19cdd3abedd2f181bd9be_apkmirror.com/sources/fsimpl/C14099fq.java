package fsimpl;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fsimpl.fq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14099fq {

    /* renamed from: a, reason: collision with root package name */
    private final URL f132272a;

    /* renamed from: b, reason: collision with root package name */
    private final String f132273b;

    /* renamed from: c, reason: collision with root package name */
    private final String f132274c;

    /* renamed from: d, reason: collision with root package name */
    private final String f132275d;

    /* renamed from: e, reason: collision with root package name */
    private final String f132276e;

    /* renamed from: f, reason: collision with root package name */
    private final String f132277f;

    /* renamed from: g, reason: collision with root package name */
    private final String f132278g;

    /* renamed from: h, reason: collision with root package name */
    private final String f132279h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f132280i;

    public C14099fq(URL url, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10) {
        this.f132272a = url;
        this.f132273b = str;
        this.f132274c = str2;
        this.f132275d = str3;
        this.f132276e = str4;
        this.f132277f = str5;
        this.f132278g = str6;
        this.f132279h = str7;
        this.f132280i = z10;
    }

    private String a(String str, StackTraceElement[] stackTraceElementArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Message", str);
            jSONObject.put("Context", this.f132276e);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject3.put("version", this.f132277f);
            jSONObject3.put("orgId", this.f132278g);
            jSONObject3.put("sessionUrl", this.f132279h);
            jSONObject3.put("isHans", this.f132280i);
            jSONObject3.put("platform", "android");
            jSONObject4.put("osName", this.f132274c);
            jSONObject4.put("osVersion", this.f132275d);
            jSONObject4.put("device", this.f132273b);
            jSONObject2.put("fs", jSONObject3);
            jSONObject2.put("device", jSONObject4);
            jSONObject.put("MetaData", jSONObject2);
            JSONArray jSONArray = new JSONArray();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("Method", stackTraceElement.getMethodName());
                if (stackTraceElement.getFileName() != null) {
                    jSONObject5.put("File", stackTraceElement.getFileName());
                }
                if (stackTraceElement.getLineNumber() >= 0) {
                    jSONObject5.put("LineNumber", Integer.toString(stackTraceElement.getLineNumber()));
                }
                if (stackTraceElement.isNativeMethod()) {
                    jSONObject5.put("Native", "true");
                    if (stackTraceElement.getFileName() == null) {
                        jSONObject5.put("File", "[native code]");
                    }
                }
                jSONArray.put(jSONObject5);
            }
            jSONObject.put("StackTrace", jSONArray);
            jSONObject.put("Type", "java");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void a(Throwable th2) {
        if (this.f132272a == null) {
            return;
        }
        try {
            String strA = a(th2.getMessage(), th2.getStackTrace());
            HttpURLConnection httpURLConnection = (HttpURLConnection) this.f132272a.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(strA.getBytes().length));
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(outputStream);
            writableByteChannelNewChannel.write(ByteBuffer.wrap(strA.getBytes()));
            httpURLConnection.getResponseCode();
            outputStream.close();
            writableByteChannelNewChannel.close();
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }
}
