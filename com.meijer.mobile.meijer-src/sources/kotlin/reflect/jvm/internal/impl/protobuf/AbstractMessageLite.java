package kotlin.reflect.jvm.internal.impl.protobuf;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes14.dex */
public abstract class AbstractMessageLite implements MessageLite {

    /* renamed from: a, reason: collision with root package name */
    protected int f146723a = 0;

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {

        static final class a extends FilterInputStream implements InputStreamRetargetInterface {

            /* renamed from: a, reason: collision with root package name */
            private int f146724a;

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f146724a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f146724a--;
                }
                return i10;
            }

            @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
            public /* synthetic */ long transferTo(OutputStream outputStream) {
                return DesugarInputStream.transferTo(this, outputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f146724a));
                if (jSkip >= 0) {
                    this.f146724a = (int) (this.f146724a - jSkip);
                }
                return jSkip;
            }

            a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f146724a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f146724a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f146724a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f146724a -= i13;
                }
                return i13;
            }
        }

        @Override // 
        /* renamed from: i */
        public abstract BuilderType r();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        /* renamed from: j */
        public abstract BuilderType r0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

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
