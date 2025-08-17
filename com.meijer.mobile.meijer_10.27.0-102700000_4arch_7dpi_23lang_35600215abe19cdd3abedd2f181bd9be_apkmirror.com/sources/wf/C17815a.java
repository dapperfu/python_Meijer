package wf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import of.C16041i;
import org.json.JSONObject;

/* renamed from: wf.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C17815a {

    /* renamed from: a, reason: collision with root package name */
    private final File f166059a;

    private File a() {
        return this.f166059a;
    }

    public JSONObject b() throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        lf.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(C16041i.B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        lf.g.f().e("Failed to fetch cached settings", e);
                        C16041i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    lf.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                C16041i.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th3) {
                th2 = th3;
                C16041i.f(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
            C16041i.f(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    public void c(long j10, JSONObject jSONObject) throws Throwable {
        FileWriter fileWriter;
        lf.g.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j10);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e10) {
                e = e10;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                C16041i.f(fileWriter, "Failed to close settings writer.");
            } catch (Exception e11) {
                e = e11;
                fileWriter2 = fileWriter;
                lf.g.f().e("Failed to cache settings", e);
                C16041i.f(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th3) {
                th = th3;
                fileWriter2 = fileWriter;
                C16041i.f(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }

    public C17815a(uf.g gVar) {
        this.f166059a = gVar.g("com.crashlytics.settings.json");
    }
}
