package m3;

import a3.t;
import a3.z;
import android.graphics.Bitmap;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.image.ImageDecoderException;
import d3.C13466a;
import d3.P;
import f3.C13837b;
import g3.f;
import java.io.IOException;
import java.nio.ByteBuffer;
import m3.InterfaceC15547c;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15545a extends f<DecoderInputBuffer, AbstractC15548d, ImageDecoderException> implements InterfaceC15547c {

    /* renamed from: o, reason: collision with root package name */
    private final b f149801o;

    /* renamed from: m3.a$a, reason: collision with other inner class name */
    class C2300a extends AbstractC15548d {
        C2300a() {
        }

        @Override // g3.e
        public void E() {
            C15545a.this.t(this);
        }
    }

    /* renamed from: m3.a$b */
    public interface b {
        Bitmap a(byte[] bArr, int i10) throws ImageDecoderException;
    }

    /* renamed from: m3.a$c */
    public static final class c implements InterfaceC15547c.a {

        /* renamed from: b, reason: collision with root package name */
        private final b f149803b = new b() { // from class: m3.b
            @Override // m3.C15545a.b
            public final Bitmap a(byte[] bArr, int i10) {
                return C15545a.B(bArr, i10);
            }
        };

        @Override // m3.InterfaceC15547c.a
        public int a(t tVar) {
            String str = tVar.f43949o;
            return (str == null || !z.o(str)) ? I0.v(0) : P.A0(tVar.f43949o) ? I0.v(4) : I0.v(1);
        }

        @Override // m3.InterfaceC15547c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C15545a b() {
            return new C15545a(this.f149803b, null);
        }
    }

    /* synthetic */ C15545a(b bVar, C2300a c2300a) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap B(byte[] bArr, int i10) throws ImageDecoderException {
        try {
            return C13837b.a(bArr, i10, null, -1);
        } catch (ParserException e10) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new ImageDecoderException(e11);
        }
    }

    private C15545a(b bVar) {
        super(new DecoderInputBuffer[1], new AbstractC15548d[1]);
        this.f149801o = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g3.f
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException k(Throwable th2) {
        return new ImageDecoderException("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g3.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException l(DecoderInputBuffer decoderInputBuffer, AbstractC15548d abstractC15548d, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C13466a.e(decoderInputBuffer.f55465d);
            C13466a.g(byteBuffer.hasArray());
            C13466a.a(byteBuffer.arrayOffset() == 0);
            abstractC15548d.f149805e = this.f149801o.a(byteBuffer.array(), byteBuffer.remaining());
            abstractC15548d.f132716b = decoderInputBuffer.f55467f;
            return null;
        } catch (ImageDecoderException e10) {
            return e10;
        }
    }

    @Override // g3.f
    protected DecoderInputBuffer i() {
        return new DecoderInputBuffer(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g3.f
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public AbstractC15548d j() {
        return new C2300a();
    }

    @Override // g3.f, g3.d
    public /* bridge */ /* synthetic */ AbstractC15548d a() throws ImageDecoderException {
        return (AbstractC15548d) super.a();
    }
}
