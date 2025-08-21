package Hb;

import android.content.Context;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import eb.C13786c;
import eb.C13787d;
import id.C14725h;
import java.io.IOException;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final C13786c f13496b = C13787d.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Context f13497a;

    public final String a(String str) throws IOException {
        try {
            return GoogleCloudMessaging.getInstance(this.f13497a).register(new String[]{str});
        } catch (IOException e10) {
            f13496b.g("GCM instance failed: " + e10.getMessage(), new Object[0]);
            throw new IOException("GCM instance failed: " + e10.getMessage());
        } catch (NoClassDefFoundError e11) {
            f13496b.g("GCM library not available: " + e11.getMessage(), new Object[0]);
            throw new IOException("GCM library not available: " + e11.getMessage());
        } catch (SecurityException e12) {
            f13496b.g("GCM registration permission not granted: " + e12.getMessage(), new Object[0]);
            throw new IOException("GCM registration permission not granted: " + e12.getMessage());
        }
    }

    public final boolean b() throws ClassNotFoundException {
        try {
            Class.forName(C14725h.class.getName());
            if (C14725h.f(this.f13497a) == 0) {
                return true;
            }
            f13496b.g("Google Play Services not available to Gimbal", new Object[0]);
            return false;
        } catch (ClassNotFoundException e10) {
            f13496b.g("Google Play Services library missing: {}", e10.getMessage());
            return false;
        } catch (IllegalStateException e11) {
            f13496b.g("Google Play Services misconfigured: {}", e11.getMessage());
            return false;
        } catch (NoClassDefFoundError e12) {
            f13496b.g("Google Play Services library missing: {}", e12.getMessage());
            return false;
        }
    }

    public c(Context context) {
        this.f13497a = context;
    }
}
