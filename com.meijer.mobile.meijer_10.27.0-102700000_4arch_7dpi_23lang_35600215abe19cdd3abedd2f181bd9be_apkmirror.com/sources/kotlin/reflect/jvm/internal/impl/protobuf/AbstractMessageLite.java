package kotlin.reflect.jvm.internal.impl.protobuf;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes13.dex */
public abstract class AbstractMessageLite implements MessageLite {

    /* renamed from: a, reason: collision with root package name */
    protected int f145816a = 0;

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {

        static final class a extends FilterInputStream implements InputStreamRetargetInterface {

            /* renamed from: a, reason: collision with root package name */
            private int f145817a;

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f145817a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f145817a--;
                }
                return i10;
            }

            @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
            public /* synthetic */ long transferTo(OutputStream outputStream) {
                return DesugarInputStream.transferTo(this, outputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f145817a));
                if (jSkip >= 0) {
                    this.f145817a = (int) (this.f145817a - jSkip);
                }
                return jSkip;
            }

            a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f145817a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f145817a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f145817a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f145817a -= i13;
                }
                return i13;
            }
        }

        @Override // 
        /* renamed from: i */
        public abstract BuilderType r();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        /* renamed from: j */
        public abstract BuilderType q0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        protected static UninitializedMessageException k(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }
    }

    UninitializedMessageException h() {
        return new UninitializedMessageException(this);
    }

    public void i(OutputStream outputStream) throws IOException {
        int iC = c();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputStream, CodedOutputStream.u(CodedOutputStream.v(iC) + iC));
        codedOutputStreamJ.o0(iC);
        g(codedOutputStreamJ);
        codedOutputStreamJ.I();
    }
}
