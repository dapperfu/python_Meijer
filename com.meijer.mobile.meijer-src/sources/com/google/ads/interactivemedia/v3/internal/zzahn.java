package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class zzahn {
    private int zza = 0;

    public final int zza() {
        return this.zza;
    }

    public final zzahn zzb(Object obj, Object obj2, Comparator comparator) {
        if (this.zza == 0 && obj != obj2) {
            if (obj != null) {
                if (obj2 == null) {
                    i = 1;
                } else if (zzahm.zza(obj)) {
                    int i10 = 0;
                    if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        long[] jArr2 = (long[]) obj2;
                        if (this.zza == 0 && jArr != jArr2) {
                            int length = jArr.length;
                            int length2 = jArr2.length;
                            if (length != length2) {
                                this.zza = length >= length2 ? 1 : -1;
                                return this;
                            }
                            while (i10 < jArr.length && this.zza == 0) {
                                this.zza = Long.compare(jArr[i10], jArr2[i10]);
                                i10++;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        int[] iArr2 = (int[]) obj2;
                        if (this.zza == 0 && iArr != iArr2) {
                            int length3 = iArr.length;
                            int length4 = iArr2.length;
                            if (length3 != length4) {
                                this.zza = length3 >= length4 ? 1 : -1;
                                return this;
                            }
                            while (i10 < iArr.length && this.zza == 0) {
                                this.zza = Integer.compare(iArr[i10], iArr2[i10]);
                                i10++;
                            }
                        }
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        short[] sArr2 = (short[]) obj2;
                        if (this.zza == 0 && sArr != sArr2) {
                            int length5 = sArr.length;
                            int length6 = sArr2.length;
                            if (length5 != length6) {
                                this.zza = length5 >= length6 ? 1 : -1;
                                return this;
                            }
                            while (i10 < sArr.length && this.zza == 0) {
                                this.zza = Short.compare(sArr[i10], sArr2[i10]);
                                i10++;
                            }
                        }
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        char[] cArr2 = (char[]) obj2;
                        if (this.zza == 0 && cArr != cArr2) {
                            int length7 = cArr.length;
                            int length8 = cArr2.length;
                            if (length7 != length8) {
                                this.zza = length7 >= length8 ? 1 : -1;
                                return this;
                            }
                            while (i10 < cArr.length && this.zza == 0) {
                                this.zza = Character.compare(cArr[i10], cArr2[i10]);
                                i10++;
                            }
                        }
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        byte[] bArr2 = (byte[]) obj2;
                        if (this.zza == 0 && bArr != bArr2) {
                            int length9 = bArr.length;
                            int length10 = bArr2.length;
                            if (length9 != length10) {
                                this.zza = length9 >= length10 ? 1 : -1;
                                return this;
                            }
                            while (i10 < bArr.length && this.zza == 0) {
                                this.zza = Byte.compare(bArr[i10], bArr2[i10]);
                                i10++;
                            }
                        }
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        double[] dArr2 = (double[]) obj2;
                        if (this.zza == 0 && dArr != dArr2) {
                            int length11 = dArr.length;
                            int length12 = dArr2.length;
                            if (length11 != length12) {
                                this.zza = length11 >= length12 ? 1 : -1;
                                return this;
                            }
                            while (i10 < dArr.length && this.zza == 0) {
                                this.zza = Double.compare(dArr[i10], dArr2[i10]);
                                i10++;
                            }
                        }
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        float[] fArr2 = (float[]) obj2;
                        if (this.zza == 0 && fArr != fArr2) {
                            int length13 = fArr.length;
                            int length14 = fArr2.length;
                            if (length13 != length14) {
                                this.zza = length13 >= length14 ? 1 : -1;
                                return this;
                            }
                            while (i10 < fArr.length && this.zza == 0) {
                                this.zza = Float.compare(fArr[i10], fArr2[i10]);
                                i10++;
                            }
                        }
                    } else if (obj instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj;
                        boolean[] zArr2 = (boolean[]) obj2;
                        if (this.zza == 0 && zArr != zArr2) {
                            int length15 = zArr.length;
                            int length16 = zArr2.length;
                            if (length15 != length16) {
                                this.zza = length15 >= length16 ? 1 : -1;
                                return this;
                            }
                            while (i10 < zArr.length && this.zza == 0) {
                                boolean z10 = zArr[i10];
                                if (z10 != zArr2[i10]) {
                                    if (z10) {
                                        this.zza = 1;
                                    } else {
                                        this.zza = -1;
                                    }
                                }
                                i10++;
                            }
                        }
                    } else {
                        Object[] objArr = (Object[]) obj;
                        Object[] objArr2 = (Object[]) obj2;
                        if (this.zza == 0 && objArr != objArr2) {
                            int length17 = objArr.length;
                            int length18 = objArr2.length;
                            if (length17 != length18) {
                                this.zza = length17 >= length18 ? 1 : -1;
                                return this;
                            }
                            while (i10 < objArr.length && this.zza == 0) {
                                zzb(objArr[i10], objArr2[i10], null);
                                i10++;
                            }
                        }
                    }
                } else {
                    this.zza = ((Comparable) obj).compareTo(obj2);
                }
            }
            this.zza = i;
            return this;
        }
        return this;
    }
}
