package Kc;

import com.fullstory.FS;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import wd.C17866i;

/* loaded from: classes4.dex */
public final class d {
    public static final void a(String str) {
        try {
            try {
                C17866i.b(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) FS.urlconnection_wrapInstance(new URL(str).openConnection());
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                        sb2.append("Received non-success response code ");
                        sb2.append(responseCode);
                        sb2.append(" from pinging URL: ");
                        sb2.append(str);
                        FS.log_w("HttpUrlPinger", sb2.toString());
                    }
                    C17866i.a();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                C17866i.a();
                throw th2;
            }
        } catch (IOException e10) {
            e = e10;
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message);
            FS.log_w("HttpUrlPinger", sb3.toString(), e);
            C17866i.a();
        } catch (IndexOutOfBoundsException e11) {
            String message2 = e11.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb4.append("Error while parsing ping URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            FS.log_w("HttpUrlPinger", sb4.toString(), e11);
            C17866i.a();
        } catch (RuntimeException e12) {
            e = e12;
            String message3 = e.getMessage();
            StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb32.append("Error while pinging URL: ");
            sb32.append(str);
            sb32.append(". ");
            sb32.append(message3);
            FS.log_w("HttpUrlPinger", sb32.toString(), e);
            C17866i.a();
        }
    }
}
