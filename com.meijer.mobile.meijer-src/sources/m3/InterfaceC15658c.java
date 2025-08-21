package m3;

import a3.t;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import m3.C15656a;

/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC15658c extends g3.d<DecoderInputBuffer, AbstractC15659d, ImageDecoderException> {

    /* renamed from: m3.c$a */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f150546a = new C15656a.c();

        int a(t tVar);

        InterfaceC15658c b();
    }

    @Override // g3.d
    AbstractC15659d a() throws ImageDecoderException;

    void f(DecoderInputBuffer decoderInputBuffer) throws ImageDecoderException;
}
