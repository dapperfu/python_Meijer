package com.google.ads.interactivemedia.v3.internal;

import com.google.maps.android.BuildConfig;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class zzace implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private zzvl zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private zzwg zzk;
    private boolean zzl;
    private String zzm;
    private boolean zzn;

    public zzace zzd() throws IOException {
        zzv(1, 2, ']');
        return this;
    }

    public zzace zze() throws IOException {
        zzv(3, 5, '}');
        return this;
    }

    public final zzwg zzn() {
        return this.zzk;
    }

    public final void zzp(boolean z10) {
        this.zzl = z10;
    }

    public final void zzq(boolean z10) {
        this.zzn = z10;
    }

    public final boolean zzs() {
        return this.zzn;
    }

    public final boolean zzt() {
        return this.zzl;
    }

    public final boolean zzu() {
        return this.zzk == zzwg.LENIENT;
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            zzb[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    private final void zzA(int i10) {
        this.zze[this.zzf - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzB(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.zzl
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.zzace.zzc
            goto L9
        L7:
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.zzace.zzb
        L9:
            java.io.Writer r1 = r8.zzd
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L44
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L27
            r6 = r0[r6]
            if (r6 == 0) goto L42
            goto L34
        L27:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2e
            java.lang.String r6 = "\\u2028"
            goto L34
        L2e:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L42
            java.lang.String r6 = "\\u2029"
        L34:
            if (r4 >= r3) goto L3c
            java.io.Writer r7 = r8.zzd
            int r3 = r3 - r4
            r7.write(r9, r4, r3)
        L3c:
            java.io.Writer r3 = r8.zzd
            r3.write(r6)
            r4 = r5
        L42:
            r3 = r5
            goto L16
        L44:
            if (r4 >= r1) goto L4c
            java.io.Writer r0 = r8.zzd
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4c:
            java.io.Writer r9 = r8.zzd
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzace.zzB(java.lang.String):void");
    }

    private final void zzC() throws IOException {
        if (this.zzm != null) {
            int iZza = zza();
            if (iZza == 5) {
                this.zzd.write(this.zzi);
            } else if (iZza != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzy();
            zzA(4);
            zzB(this.zzm);
            this.zzm = null;
        }
    }

    private final int zza() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return this.zze[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void zzy() throws IOException {
        if (this.zzj) {
            return;
        }
        this.zzd.write(this.zzg.zzb());
        int i10 = this.zzf;
        for (int i11 = 1; i11 < i10; i11++) {
            this.zzd.write(this.zzg.zza());
        }
    }

    private final void zzz(int i10) {
        int i11 = this.zzf;
        int[] iArr = this.zze;
        if (i11 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i11 + i11);
        }
        int[] iArr2 = this.zze;
        int i12 = this.zzf;
        this.zzf = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zzd.close();
        int i10 = this.zzf;
        if (i10 > 1 || (i10 == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public zzace zzf(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzm != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iZza = zza();
        if (iZza != 3 && iZza != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzm = str;
        return this;
    }

    public zzace zzg() throws IOException {
        if (this.zzm != null) {
            if (!this.zzn) {
                this.zzm = null;
                return this;
            }
            zzC();
        }
        zzx();
        this.zzd.write(BuildConfig.TRAVIS);
        return this;
    }

    public zzace zzj(Boolean bool) throws IOException {
        if (bool == null) {
            zzg();
            return this;
        }
        zzC();
        zzx();
        this.zzd.write(true != bool.booleanValue() ? "false" : "true");
        return this;
    }

    public zzace zzk(Number number) throws IOException {
        if (number == null) {
            zzg();
            return this;
        }
        zzC();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.zzk != zzwg.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + string);
            }
        }
        zzx();
        this.zzd.append((CharSequence) string);
        return this;
    }

    public zzace zzl(String str) throws IOException {
        if (str == null) {
            zzg();
            return this;
        }
        zzC();
        zzx();
        zzB(str);
        return this;
    }

    public zzace(Writer writer) {
        zzz(6);
        this.zzk = zzwg.LEGACY_STRICT;
        this.zzn = true;
        Objects.requireNonNull(writer, "out == null");
        this.zzd = writer;
        zzo(zzvl.zza);
    }

    private final zzace zzv(int i10, int i11, char c10) throws IOException {
        int iZza = zza();
        if (iZza != i11 && iZza != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzm;
        if (str == null) {
            this.zzf--;
            if (iZza == i11) {
                zzy();
            }
            this.zzd.write(c10);
            return this;
        }
        throw new IllegalStateException("Dangling name: ".concat(str));
    }

    private final zzace zzw(int i10, char c10) throws IOException {
        zzx();
        zzz(i10);
        this.zzd.write(c10);
        return this;
    }

    private final void zzx() throws IOException {
        int iZza = zza();
        if (iZza != 1) {
            if (iZza != 2) {
                if (iZza != 4) {
                    if (iZza != 6) {
                        if (iZza == 7) {
                            if (this.zzk != zzwg.LENIENT) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    zzA(7);
                    return;
                }
                this.zzd.append((CharSequence) this.zzh);
                zzA(5);
                return;
            }
            this.zzd.append((CharSequence) this.zzi);
            zzy();
            return;
        }
        zzA(2);
        zzy();
    }

    public zzace zzb() throws IOException {
        zzC();
        zzw(1, '[');
        return this;
    }

    public zzace zzc() throws IOException {
        zzC();
        zzw(3, '{');
        return this;
    }

    public zzace zzh(double d10) throws IOException {
        zzC();
        if (this.zzk != zzwg.LENIENT && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        zzx();
        this.zzd.append((CharSequence) Double.toString(d10));
        return this;
    }

    public zzace zzi(long j10) throws IOException {
        zzC();
        zzx();
        this.zzd.write(Long.toString(j10));
        return this;
    }

    public zzace zzm(boolean z10) throws IOException {
        String str;
        zzC();
        zzx();
        if (true != z10) {
            str = "false";
        } else {
            str = "true";
        }
        this.zzd.write(str);
        return this;
    }

    public final void zzo(zzvl zzvlVar) {
        Objects.requireNonNull(zzvlVar);
        this.zzg = zzvlVar;
        this.zzi = ",";
        if (zzvlVar.zzc()) {
            this.zzh = ": ";
            if (this.zzg.zzb().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = ":";
        }
        boolean z10 = false;
        if (this.zzg.zzb().isEmpty() && this.zzg.zza().isEmpty()) {
            z10 = true;
        }
        this.zzj = z10;
    }

    public final void zzr(zzwg zzwgVar) {
        Objects.requireNonNull(zzwgVar);
        this.zzk = zzwgVar;
    }
}
