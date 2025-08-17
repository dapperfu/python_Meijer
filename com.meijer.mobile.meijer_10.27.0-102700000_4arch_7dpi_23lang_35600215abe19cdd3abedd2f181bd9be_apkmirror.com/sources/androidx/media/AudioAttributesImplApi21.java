package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f55317a;

    /* renamed from: b, reason: collision with root package name */
    int f55318b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f55317a.equals(((AudioAttributesImplApi21) obj).f55317a);
        }
        return false;
    }

    public int hashCode() {
        return this.f55317a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f55317a;
    }

    AudioAttributesImplApi21() {
    }
}
