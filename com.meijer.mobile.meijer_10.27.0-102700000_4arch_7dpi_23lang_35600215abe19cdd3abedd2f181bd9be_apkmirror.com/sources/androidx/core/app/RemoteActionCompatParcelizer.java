package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f53657a, 1);
        versionedParcel.D(remoteActionCompat.f53658b, 2);
        versionedParcel.D(remoteActionCompat.f53659c, 3);
        versionedParcel.H(remoteActionCompat.f53660d, 4);
        versionedParcel.z(remoteActionCompat.f53661e, 5);
        versionedParcel.z(remoteActionCompat.f53662f, 6);
    }

    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f53657a = (IconCompat) versionedParcel.v(remoteActionCompat.f53657a, 1);
        remoteActionCompat.f53658b = versionedParcel.l(remoteActionCompat.f53658b, 2);
        remoteActionCompat.f53659c = versionedParcel.l(remoteActionCompat.f53659c, 3);
        remoteActionCompat.f53660d = (PendingIntent) versionedParcel.r(remoteActionCompat.f53660d, 4);
        remoteActionCompat.f53661e = versionedParcel.h(remoteActionCompat.f53661e, 5);
        remoteActionCompat.f53662f = versionedParcel.h(remoteActionCompat.f53662f, 6);
        return remoteActionCompat;
    }
}
