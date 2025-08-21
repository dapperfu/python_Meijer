package e3;

import com.medallia.digital.mobilesdk.l3;
import d3.C;
import d3.C13599a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f129500a;

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f129500a;
        }

        private b(e eVar, d dVar) throws c {
            boolean z10;
            boolean zG;
            int iH;
            int i10 = dVar.f129501a;
            if (i10 != 6 && i10 != 3) {
                z10 = false;
            } else {
                z10 = true;
            }
            C13599a.a(z10);
            byte[] bArr = new byte[Math.min(4, dVar.f129502b.remaining())];
            dVar.f129502b.asReadOnlyBuffer().get(bArr);
            C c10 = new C(bArr);
            g.f(eVar.f129503a);
            if (c10.g()) {
                this.f129500a = false;
                return;
            }
            int iH2 = c10.h(2);
            boolean zG2 = c10.g();
            g.f(eVar.f129504b);
            if (!zG2) {
                this.f129500a = true;
                return;
            }
            if (iH2 != 3 && iH2 != 0) {
                zG = c10.g();
            } else {
                zG = true;
            }
            c10.q();
            g.f(!eVar.f129506d);
            if (c10.g()) {
                g.f(!eVar.f129507e);
                c10.q();
            }
            g.f(eVar.f129505c);
            if (iH2 != 3) {
                c10.q();
            }
            c10.r(eVar.f129508f);
            if (iH2 != 2 && iH2 != 0 && !zG) {
                c10.r(3);
            }
            if (iH2 != 3 && iH2 != 0) {
                iH = c10.h(8);
            } else {
                iH = l3.f93323c;
            }
            this.f129500a = iH != 0;
        }
    }

    private static class c extends Exception {
        private c() {
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f129501a;

        /* renamed from: b, reason: collision with root package name */
        public final ByteBuffer f129502b;

        private d(int i10, ByteBuffer byteBuffer) {
            this.f129501a = i10;
            this.f129502b = byteBuffer;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f129503a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f129504b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f129505c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f129506d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f129507e;

        /* renamed from: f, reason: collision with root package name */
        public final int f129508f;

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(C c10) {
            c10.r(64);
            if (c10.g()) {
                g.d(c10);
            }
        }

        private e(d dVar) throws c {
            boolean z10;
            if (dVar.f129501a == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            C13599a.a(z10);
            byte[] bArr = new byte[dVar.f129502b.remaining()];
            dVar.f129502b.asReadOnlyBuffer().get(bArr);
            C c10 = new C(bArr);
            c10.r(4);
            boolean zG = c10.g();
            this.f129503a = zG;
            g.f(zG);
            if (c10.g()) {
                b(c10);
                boolean zG2 = c10.g();
                this.f129504b = zG2;
                if (zG2) {
                    c10.r(47);
                }
            } else {
                this.f129504b = false;
            }
            boolean zG3 = c10.g();
            int iH = c10.h(5);
            for (int i10 = 0; i10 <= iH; i10++) {
                c10.r(12);
                if (c10.h(5) > 7) {
                    c10.q();
                }
                g.f(this.f129504b);
                if (zG3 && c10.g()) {
                    c10.r(4);
                }
            }
            int iH2 = c10.h(4);
            int iH3 = c10.h(4);
            c10.r(iH2 + 1);
            c10.r(iH3 + 1);
            boolean zG4 = c10.g();
            this.f129505c = zG4;
            g.f(zG4);
            c10.r(3);
            c10.r(4);
            boolean zG5 = c10.g();
            if (zG5) {
                c10.r(2);
            }
            if (c10.g()) {
                this.f129506d = true;
            } else {
                this.f129506d = c10.g();
            }
            if (!this.f129506d || c10.g()) {
                this.f129507e = true;
            } else {
                this.f129507e = c10.g();
            }
            if (zG5) {
                this.f129508f = c10.h(3) + 1;
            } else {
                this.f129508f = 0;
            }
        }
    }

    private static int c(ByteBuffer byteBuffer) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            byte b10 = byteBuffer.get();
            i10 |= (b10 & Byte.MAX_VALUE) << (i11 * 7);
            if ((b10 & 128) == 0) {
                return i10;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(C c10) {
        int i10 = 0;
        while (!c10.g()) {
            i10++;
        }
        if (i10 < 32) {
            c10.r(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z10) throws c {
        if (z10) {
            throw new c();
        }
    }

    public static List<d> e(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b10 = byteBufferAsReadOnlyBuffer.get();
            int i10 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b10 >> 1) & 1) != 0) {
                iRemaining = c(byteBufferAsReadOnlyBuffer);
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new d(i10, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }
}
