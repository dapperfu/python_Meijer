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

/* loaded from: classes8.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, u> f90166c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f90167a;

    /* renamed from: b, reason: collision with root package name */
    private final String f90168b;

    public synchronized Void a() {
        this.f90167a.deleteFile(this.f90168b);
        return null;
    }

    public synchronized g d() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        try {
            fileInputStreamOpenFileInput = this.f90167a.openFileInput(this.f90168b);
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
        FileOutputStream fileOutputStreamOpenFileOutput = this.f90167a.openFileOutput(this.f90168b, 0);
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
            map = f90166c;
            if (!map.containsKey(str)) {
                map.put(str, new u(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map.get(str);
    }

    String b() {
        return this.f90168b;
    }

    private u(Context context, String str) {
        this.f90167a = context;
        this.f90168b = str;
    }
}
