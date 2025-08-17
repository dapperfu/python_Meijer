package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.x(false, false);
        versionedParcel.M(audioAttributesCompat.f55316a, 1);
    }

    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f55316a = (AudioAttributesImpl) versionedParcel.v(audioAttributesCompat.f55316a, 1);
        return audioAttributesCompat;
    }
}
