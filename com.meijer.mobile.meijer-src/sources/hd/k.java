package hd;

import android.util.Log;
import com.fullstory.FS;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class k extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z10);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return l.class;
        }
        FS.log_d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return l.class;
    }
}
