package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, u> f89324c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f89325a;

    /* renamed from: b, reason: collision with root package name */
    private final String f89326b;

    public synchronized Void a() {
        this.f89325a.deleteFile(this.f89326b);
        return null;
    }

    public synchronized g d() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        try {
            fileInputStreamOpenFileInput = this.f89325a.openFileInput(this.f89326b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th3) {
            fileInputStreamOpenFileInput = null;
            th2 = th3;
        }
        try {
            int iAvailable = fileInputStreamOpenFileInput.available();
            byte[] bArr = new byte[iAvailable];
            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
            g gVarB = g.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStreamOpenFileInput.close();
            return gVarB;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            throw th2;
        }
    }

    public synchronized Void e(g gVar) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f89325a.openFileOutput(this.f89326b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(gVar.toString().getBytes("UTF-8"));
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
        return null;
    }

    public static synchronized u c(Context context, String str) {
        Map<String, u> map;
        try {
            map = f89324c;
            if (!map.containsKey(str)) {
                map.put(str, new u(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map.get(str);
    }

    String b() {
        return this.f89326b;
    }

    private u(Context context, String str) {
        this.f89325a = context;
        this.f89326b = str;
    }
}
