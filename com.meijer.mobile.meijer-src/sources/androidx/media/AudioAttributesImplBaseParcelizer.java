package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f55543a, 1);
        versionedParcel.F(audioAttributesImplBase.f55544b, 2);
        versionedParcel.F(audioAttributesImplBase.f55545c, 3);
        versionedParcel.F(audioAttributesImplBase.f55546d, 4);
    }

    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f55543a = versionedParcel.p(audioAttributesImplBase.f55543a, 1);
        audioAttributesImplBase.f55544b = versionedParcel.p(audioAttributesImplBase.f55544b, 2);
        audioAttributesImplBase.f55545c = versionedParcel.p(audioAttributesImplBase.f55545c, 3);
        audioAttributesImplBase.f55546d = versionedParcel.p(audioAttributesImplBase.f55546d, 4);
        return audioAttributesImplBase;
    }
}
