package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class m {

    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f54646a;

        @Override // androidx.emoji2.text.m.c
        public void a(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f54646a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.m.c
        public int b() throws IOException {
            return this.f54646a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public long c() throws IOException {
            return m.c(this.f54646a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long getPosition() {
            return this.f54646a.position();
        }

        @Override // androidx.emoji2.text.m.c
        public int readUnsignedShort() throws IOException {
            return m.d(this.f54646a.getShort());
        }

        a(ByteBuffer byteBuffer) {
            this.f54646a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f54647a;

        /* renamed from: b, reason: collision with root package name */
        private final long f54648b;

        long a() {
            return this.f54647a;
        }

        b(long j10, long j11) {
            this.f54647a = j10;
            this.f54648b = j11;
        }
    }

    private interface c {
        void a(int i10) throws IOException;

        int b() throws IOException;

        long c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private static b a(c cVar) throws IOException {
        long jC;
        cVar.a(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jC = -1;
                break;
            }
            int iB = cVar.b();
            cVar.a(4);
            jC = cVar.c();
            cVar.a(4);
            if (1835365473 == iB) {
                break;
            }
            i10++;
        }
        if (jC != -1) {
            cVar.a((int) (jC - cVar.getPosition()));
            cVar.a(12);
            long jC2 = cVar.c();
            for (int i11 = 0; i11 < jC2; i11++) {
                int iB2 = cVar.b();
                long jC3 = cVar.c();
                long jC4 = cVar.c();
                if (1164798569 == iB2 || 1701669481 == iB2) {
                    return new b(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static long c(int i10) {
        return i10 & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }

    static I2.b b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return I2.b.h(byteBufferDuplicate);
    }
}
