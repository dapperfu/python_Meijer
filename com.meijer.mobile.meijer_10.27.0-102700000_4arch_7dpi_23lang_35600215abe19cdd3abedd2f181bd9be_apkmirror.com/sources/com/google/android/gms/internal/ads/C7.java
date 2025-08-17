package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class C7 implements D7 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f65717b = Logger.getLogger(C7.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final ThreadLocal f65718a = new B7(this);

    public abstract G7 b(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.D7
    public final G7 a(Ux0 ux0, I7 i72) throws IOException {
        int iK3;
        long jZzc;
        String strZza;
        long jZzb = ux0.zzb();
        ((ByteBuffer) this.f65718a.get()).rewind().limit(8);
        do {
            iK3 = ux0.K3((ByteBuffer) this.f65718a.get());
            if (iK3 == 8) {
                ((ByteBuffer) this.f65718a.get()).rewind();
                long jE = F7.e((ByteBuffer) this.f65718a.get());
                byte[] bArr = null;
                if (jE < 8 && jE > 1) {
                    Logger logger = f65717b;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(jE);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.f65718a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jE == 1) {
                        ((ByteBuffer) this.f65718a.get()).limit(16);
                        ux0.K3((ByteBuffer) this.f65718a.get());
                        ((ByteBuffer) this.f65718a.get()).position(8);
                        jZzc = F7.f((ByteBuffer) this.f65718a.get()) - 16;
                    } else if (jE == 0) {
                        jZzc = ux0.zzc() - ux0.zzb();
                    } else {
                        jZzc = jE - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.f65718a.get()).limit(((ByteBuffer) this.f65718a.get()).limit() + 16);
                        ux0.K3((ByteBuffer) this.f65718a.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.f65718a.get()).position() - 16; iPosition < ((ByteBuffer) this.f65718a.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.f65718a.get()).position() - 16)] = ((ByteBuffer) this.f65718a.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j10 = jZzc;
                    if (i72 instanceof G7) {
                        strZza = ((G7) i72).zza();
                    } else {
                        strZza = "";
                    }
                    G7 g7B = b(str, bArr, strZza);
                    ((ByteBuffer) this.f65718a.get()).rewind();
                    g7B.a(ux0, (ByteBuffer) this.f65718a.get(), j10, this);
                    return g7B;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (iK3 >= 0);
        ux0.f(jZzb);
        throw new EOFException();
    }
}
