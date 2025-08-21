package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.H(audioAttributesImplApi21.f55541a, 1);
        versionedParcel.F(audioAttributesImplApi21.f55542b, 2);
    }

    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f55541a = (AudioAttributes) versionedParcel.r(audioAttributesImplApi21.f55541a, 1);
        audioAttributesImplApi21.f55542b = versionedParcel.p(audioAttributesImplApi21.f55542b, 2);
        return audioAttributesImplApi21;
    }
}
