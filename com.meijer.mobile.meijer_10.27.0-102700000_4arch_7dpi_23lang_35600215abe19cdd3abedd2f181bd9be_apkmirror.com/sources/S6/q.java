package S6;

import S6.i;
import S6.j;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final UUID f33461a = new UUID(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final i.f<UUID> f33462b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final j.a<UUID> f33463c = new b();

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f33464d = new char[256];

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f33465e = new byte[55];

    class a implements i.f<UUID> {
        a() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public UUID a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return q.a(iVar);
        }
    }

    class b implements j.a<UUID> {
        b() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, UUID uuid) throws IOException {
            q.d(uuid, jVar);
        }
    }

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = (i10 >> 4) & 15;
            int i12 = i10 & 15;
            f33464d[i10] = (char) (((i11 < 10 ? i11 + 48 : i11 + 87) << 8) + (i12 < 10 ? i12 + 48 : i12 + 87));
        }
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            int i13 = c10 - '0';
            f33465e[i13] = (byte) i13;
        }
        for (char c11 = 'a'; c11 <= 'f'; c11 = (char) (c11 + 1)) {
            f33465e[c11 - '0'] = (byte) (c11 - 'W');
        }
        for (char c12 = 'A'; c12 <= 'F'; c12 = (char) (c12 + 1)) {
            f33465e[c12 - '0'] = (byte) (c12 - '7');
        }
    }

    public static void b(long j10, long j11, j jVar) throws IOException {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) j10;
        int i12 = (int) (j11 >> 32);
        int i13 = (int) j11;
        byte[] bArrC = jVar.c(38);
        int iH = jVar.h();
        bArrC[iH] = 34;
        int i14 = (i10 >> 24) & l3.f92484c;
        char[] cArr = f33464d;
        char c10 = cArr[i14];
        bArrC[iH + 1] = (byte) (c10 >> '\b');
        bArrC[iH + 2] = (byte) c10;
        char c11 = cArr[(i10 >> 16) & l3.f92484c];
        bArrC[iH + 3] = (byte) (c11 >> '\b');
        bArrC[iH + 4] = (byte) c11;
        char c12 = cArr[(i10 >> 8) & l3.f92484c];
        bArrC[iH + 5] = (byte) (c12 >> '\b');
        bArrC[iH + 6] = (byte) c12;
        char c13 = cArr[i10 & l3.f92484c];
        bArrC[iH + 7] = (byte) (c13 >> '\b');
        bArrC[iH + 8] = (byte) c13;
        bArrC[iH + 9] = 45;
        char c14 = cArr[(i11 >> 24) & l3.f92484c];
        bArrC[iH + 10] = (byte) (c14 >> '\b');
        bArrC[iH + 11] = (byte) c14;
        char c15 = cArr[(i11 >> 16) & l3.f92484c];
        bArrC[iH + 12] = (byte) (c15 >> '\b');
        bArrC[iH + 13] = (byte) c15;
        bArrC[iH + 14] = 45;
        char c16 = cArr[(i11 >> 8) & l3.f92484c];
        bArrC[iH + 15] = (byte) (c16 >> '\b');
        bArrC[iH + 16] = (byte) c16;
        char c17 = cArr[i11 & l3.f92484c];
        bArrC[iH + 17] = (byte) (c17 >> '\b');
        bArrC[iH + 18] = (byte) c17;
        bArrC[iH + 19] = 45;
        char c18 = cArr[(i12 >> 24) & l3.f92484c];
        bArrC[iH + 20] = (byte) (c18 >> '\b');
        bArrC[iH + 21] = (byte) c18;
        char c19 = cArr[(i12 >> 16) & l3.f92484c];
        bArrC[iH + 22] = (byte) (c19 >> '\b');
        bArrC[iH + 23] = (byte) c19;
        bArrC[iH + 24] = 45;
        char c20 = cArr[(i12 >> 8) & l3.f92484c];
        bArrC[iH + 25] = (byte) (c20 >> '\b');
        bArrC[iH + 26] = (byte) c20;
        char c21 = cArr[i12 & l3.f92484c];
        bArrC[iH + 27] = (byte) (c21 >> '\b');
        bArrC[iH + 28] = (byte) c21;
        char c22 = cArr[(i13 >> 24) & l3.f92484c];
        bArrC[iH + 29] = (byte) (c22 >> '\b');
        bArrC[iH + 30] = (byte) c22;
        char c23 = cArr[(i13 >> 16) & l3.f92484c];
        bArrC[iH + 31] = (byte) (c23 >> '\b');
        bArrC[iH + 32] = (byte) c23;
        char c24 = cArr[(i13 >> 8) & l3.f92484c];
        bArrC[iH + 33] = (byte) (c24 >> '\b');
        bArrC[iH + 34] = (byte) c24;
        char c25 = cArr[i13 & l3.f92484c];
        bArrC[iH + 35] = (byte) (c25 >> '\b');
        bArrC[iH + 36] = (byte) c25;
        bArrC[iH + 37] = 34;
        jVar.a(38);
    }

    public static void d(UUID uuid, j jVar) throws IOException {
        if (uuid == null) {
            jVar.n();
        } else {
            c(uuid, jVar);
        }
    }

    public static UUID a(i iVar) throws IOException {
        int i10;
        char[] cArrG = iVar.G();
        int i11 = iVar.i() - iVar.k();
        long j10 = 0;
        if (i11 == 37 && cArrG[8] == '-' && cArrG[13] == '-' && cArrG[18] == '-' && cArrG[23] == '-') {
            long j11 = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                try {
                    j11 = (j11 << 4) + f33465e[cArrG[i12] - '0'];
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return UUID.fromString(new String(cArrG, 0, 36));
                }
            }
            for (int i13 = 9; i13 < 13; i13++) {
                j11 = (j11 << 4) + f33465e[cArrG[i13] - '0'];
            }
            for (int i14 = 14; i14 < 18; i14++) {
                j11 = (j11 << 4) + f33465e[cArrG[i14] - '0'];
            }
            for (int i15 = 19; i15 < 23; i15++) {
                j10 = (j10 << 4) + f33465e[cArrG[i15] - '0'];
            }
            for (int i16 = 24; i16 < 36; i16++) {
                j10 = (j10 << 4) + f33465e[cArrG[i16] - '0'];
            }
            return new UUID(j11, j10);
        }
        if (i11 == 33) {
            long j12 = 0;
            int i17 = 0;
            while (true) {
                if (i17 >= 16) {
                    break;
                }
                try {
                    j12 = (j12 << 4) + f33465e[cArrG[i17] - '0'];
                    i17++;
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    return UUID.fromString(new String(cArrG, 0, 32));
                }
                return UUID.fromString(new String(cArrG, 0, 32));
            }
            for (i10 = 16; i10 < 32; i10++) {
                j10 = (j10 << 4) + f33465e[cArrG[i10] - '0'];
            }
            return new UUID(j12, j10);
        }
        return UUID.fromString(new String(cArrG, 0, i11 - 1));
    }

    public static void c(UUID uuid, j jVar) throws IOException {
        b(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits(), jVar);
    }
}
