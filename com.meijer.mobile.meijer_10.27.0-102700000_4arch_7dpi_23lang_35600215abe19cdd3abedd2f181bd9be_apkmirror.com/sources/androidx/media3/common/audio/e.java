package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;

/* loaded from: classes.dex */
public final class e extends b {
    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f55346c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 2 ? new AudioProcessor.a(aVar.f55344a, aVar.f55345b, 2) : AudioProcessor.a.f55343e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // androidx.media3.common.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.audio.e.e(java.nio.ByteBuffer):void");
    }
}
