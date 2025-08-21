package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f55541a;

    /* renamed from: b, reason: collision with root package name */
    int f55542b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f55541a.equals(((AudioAttributesImplApi21) obj).f55541a);
        }
        return false;
    }

    public int hashCode() {
        return this.f55541a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f55541a;
    }

    AudioAttributesImplApi21() {
    }
}
