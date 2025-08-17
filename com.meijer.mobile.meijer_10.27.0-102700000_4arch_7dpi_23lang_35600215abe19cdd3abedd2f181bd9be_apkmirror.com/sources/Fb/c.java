package Fb;

import android.content.Context;
import cb.C6382c;
import cb.C6383d;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import gd.C14249h;
import java.io.IOException;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final C6382c f10369b = C6383d.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Context f10370a;

    public final String a(String str) throws IOException {
        try {
            return GoogleCloudMessaging.getInstance(this.f10370a).register(new String[]{str});
        } catch (IOException e10) {
            f10369b.g("GCM instance failed: " + e10.getMessage(), new Object[0]);
            throw new IOException("GCM instance failed: " + e10.getMessage());
        } catch (NoClassDefFoundError e11) {
            f10369b.g("GCM library not available: " + e11.getMessage(), new Object[0]);
            throw new IOException("GCM library not available: " + e11.getMessage());
        } catch (SecurityException e12) {
            f10369b.g("GCM registration permission not granted: " + e12.getMessage(), new Object[0]);
            throw new IOException("GCM registration permission not granted: " + e12.getMessage());
        }
    }

    public final boolean b() throws ClassNotFoundException {
        try {
            Class.forName(C14249h.class.getName());
            if (C14249h.f(this.f10370a) == 0) {
                return true;
            }
            f10369b.g("Google Play Services not available to Gimbal", new Object[0]);
            return false;
        } catch (ClassNotFoundException e10) {
            f10369b.g("Google Play Services library missing: {}", e10.getMessage());
            return false;
        } catch (IllegalStateException e11) {
            f10369b.g("Google Play Services misconfigured: {}", e11.getMessage());
            return false;
        } catch (NoClassDefFoundError e12) {
            f10369b.g("Google Play Services library missing: {}", e12.getMessage());
            return false;
        }
    }

    public c(Context context) {
        this.f10370a = context;
    }
}
