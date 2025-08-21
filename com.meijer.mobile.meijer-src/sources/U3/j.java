package U3;

import androidx.media3.extractor.text.SubtitleDecoderException;
import d3.C13599a;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class j extends g3.f<o, p, SubtitleDecoderException> implements l {

    /* renamed from: o, reason: collision with root package name */
    private final String f37044o;

    class a extends p {
        a() {
        }

        @Override // g3.e
        public void E() {
            j.this.t(this);
        }
    }

    protected j(String str) {
        super(new o[2], new p[2]);
        this.f37044o = str;
        w(1024);
    }

    protected abstract k B(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException;

    @Override // U3.l
    public void b(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g3.f
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException k(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g3.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException l(o oVar, p pVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C13599a.e(oVar.f55689d);
            pVar.F(oVar.f55691f, B(byteBuffer.array(), byteBuffer.limit(), z10), oVar.f37060j);
            pVar.f134008d = false;
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g3.f
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final o i() {
        return new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g3.f
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final p j() {
        return new a();
    }
}
