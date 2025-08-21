package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f53881a, 1);
        versionedParcel.D(remoteActionCompat.f53882b, 2);
        versionedParcel.D(remoteActionCompat.f53883c, 3);
        versionedParcel.H(remoteActionCompat.f53884d, 4);
        versionedParcel.z(remoteActionCompat.f53885e, 5);
        versionedParcel.z(remoteActionCompat.f53886f, 6);
    }

    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f53881a = (IconCompat) versionedParcel.v(remoteActionCompat.f53881a, 1);
        remoteActionCompat.f53882b = versionedParcel.l(remoteActionCompat.f53882b, 2);
        remoteActionCompat.f53883c = versionedParcel.l(remoteActionCompat.f53883c, 3);
        remoteActionCompat.f53884d = (PendingIntent) versionedParcel.r(remoteActionCompat.f53884d, 4);
        remoteActionCompat.f53885e = versionedParcel.h(remoteActionCompat.f53885e, 5);
        remoteActionCompat.f53886f = versionedParcel.h(remoteActionCompat.f53886f, 6);
        return remoteActionCompat;
    }
}
