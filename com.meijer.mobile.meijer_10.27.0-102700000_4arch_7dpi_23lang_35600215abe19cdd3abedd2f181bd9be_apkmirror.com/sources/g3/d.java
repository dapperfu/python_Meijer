package g3;

import androidx.media3.decoder.DecoderException;

/* loaded from: classes.dex */
public interface d<I, O, E extends DecoderException> {
    O a() throws DecoderException;

    void c(I i10) throws DecoderException;

    void d(long j10);

    I e() throws DecoderException;

    void flush();

    void release();
}
