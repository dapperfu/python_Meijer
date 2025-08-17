package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f55319a, 1);
        versionedParcel.F(audioAttributesImplBase.f55320b, 2);
        versionedParcel.F(audioAttributesImplBase.f55321c, 3);
        versionedParcel.F(audioAttributesImplBase.f55322d, 4);
    }

    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f55319a = versionedParcel.p(audioAttributesImplBase.f55319a, 1);
        audioAttributesImplBase.f55320b = versionedParcel.p(audioAttributesImplBase.f55320b, 2);
        audioAttributesImplBase.f55321c = versionedParcel.p(audioAttributesImplBase.f55321c, 3);
        audioAttributesImplBase.f55322d = versionedParcel.p(audioAttributesImplBase.f55322d, 4);
        return audioAttributesImplBase;
    }
}
