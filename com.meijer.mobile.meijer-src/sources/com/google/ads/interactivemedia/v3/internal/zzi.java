package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import com.medallia.digital.mobilesdk.l3;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzi {
    public static X509Certificate[][] zza(String str) throws IOException, SecurityException, zzf {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairZzc = zzj.zzc(randomAccessFile);
            if (pairZzc == null) {
                throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairZzc.first;
            long jLongValue = ((Long) pairZzc.second).longValue();
            long j10 = (-20) + jLongValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            long jZza = zzj.zza(byteBuffer);
            if (jZza >= jLongValue) {
                throw new zzf("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (zzj.zzb(byteBuffer) + jZza != jLongValue) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jZza < 32) {
                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jZza - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            int i10 = 0;
            long j11 = byteBufferAllocate.getLong(0);
            if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
                throw new zzf("APK Signing Block size out of range: " + j11);
            }
            int i11 = (int) (8 + j11);
            long j12 = jZza - i11;
            if (j12 < 0) {
                throw new zzf("APK Signing Block offset out of range: " + j12);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i11);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j13 = byteBufferAllocate2.getLong(0);
            if (j13 != j11) {
                throw new zzf("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                while (byteBufferSlice.hasRemaining()) {
                    i10++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i10);
                    }
                    long j14 = byteBufferSlice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        throw new zzf("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                    }
                    int i12 = (int) j14;
                    int iPosition2 = byteBufferSlice.position() + i12;
                    if (i12 > byteBufferSlice.remaining()) {
                        throw new zzf("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrZzl = zzl(randomAccessFile.getChannel(), new zze(zze(byteBufferSlice, i12 - 4), jLongValue2, jZza, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        return x509CertificateArrZzl;
                    }
                    long j15 = jLongValue2;
                    byteBufferSlice.position(iPosition2);
                    jLongValue2 = j15;
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int zzb(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    private static String zzd(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    private static int zzc(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    private static void zzg(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & l3.f93323c);
        bArr[2] = (byte) ((i10 >>> 8) & l3.f93323c);
        bArr[3] = (byte) ((i10 >>> 16) & l3.f93323c);
        bArr[4] = (byte) (i10 >> 24);
    }

    private static byte[][] zzk(int[] iArr, zzb[] zzbVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        char c10;
        int i11;
        String str;
        int i12 = 0;
        int i13 = 0;
        long jZza = 0;
        while (true) {
            j10 = 1048576;
            i10 = 3;
            if (i13 >= 3) {
                break;
            }
            jZza += (zzbVarArr[i13].zza() + 1048575) / 1048576;
            i13++;
        }
        if (jZza >= 2097151) {
            throw new DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i14 = 0;
        while (true) {
            length = iArr.length;
            c10 = 5;
            i11 = 1;
            if (i14 >= length) {
                break;
            }
            int i15 = (int) jZza;
            byte[] bArr2 = new byte[(zzb(iArr[i14]) * i15) + 5];
            bArr2[0] = 90;
            zzg(i15, bArr2, 1);
            bArr[i14] = bArr2;
            i14++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i16 = 0;
        while (true) {
            str = " digest not supported";
            if (i16 >= iArr.length) {
                break;
            }
            String strZzd = zzd(iArr[i16]);
            try {
                messageDigestArr[i16] = MessageDigest.getInstance(strZzd);
                i16++;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strZzd.concat(" digest not supported"), e10);
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i10) {
            zzb zzbVar = zzbVarArr[i17];
            int i19 = i17;
            long jZza2 = zzbVar.zza();
            byte[][] bArr4 = bArr;
            long j11 = 0;
            while (jZza2 > 0) {
                int i20 = i18;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j10);
                zzg(iMin, bArr3, i11);
                for (int i21 = 0; i21 < length; i21++) {
                    messageDigestArr[i21].update(bArr3);
                }
                try {
                    zzbVar.zzb(messageDigestArr, j11, iMin);
                    int i22 = 0;
                    while (i22 < iArr.length) {
                        int i23 = iArr[i22];
                        byte[] bArr5 = bArr4[i22];
                        int iZzb = zzb(i23);
                        char c11 = c10;
                        MessageDigest messageDigest = messageDigestArr[i22];
                        int iDigest = messageDigest.digest(bArr5, (i20 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i22++;
                        c10 = c11;
                    }
                    long j12 = iMin;
                    j11 += j12;
                    jZza2 -= j12;
                    i18 = i20 + 1;
                    str = str2;
                    j10 = 1048576;
                    i11 = 1;
                } catch (IOException e11) {
                    throw new DigestException("Failed to digest chunk #" + i20 + " of section #" + i12, e11);
                }
            }
            i12++;
            i17 = i19 + 1;
            bArr = bArr4;
            j10 = 1048576;
            i10 = 3;
            i11 = 1;
        }
        byte[][] bArr6 = bArr;
        String str3 = str;
        byte[][] bArr7 = new byte[iArr.length][];
        for (int i24 = 0; i24 < iArr.length; i24++) {
            int i25 = iArr[i24];
            byte[] bArr8 = bArr6[i24];
            String strZzd2 = zzd(i25);
            try {
                bArr7[i24] = MessageDigest.getInstance(strZzd2).digest(bArr8);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strZzd2.concat(str3), e12);
            }
        }
        return bArr7;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zze zzeVar) throws SecurityException, CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzf = zzf(zzeVar.zza);
                int i10 = 0;
                while (byteBufferZzf.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException("Failed to parse/verify signer #" + i10 + " block", e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzh(map, fileChannel, zzeVar.zzb, zzeVar.zzc, zzeVar.zzd, zzeVar.zze);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 >= iPosition && i11 <= iLimit) {
            byteBuffer.limit(i11);
            try {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.order(byteBuffer.order());
                byteBuffer.position(i11);
                return byteBufferSlice;
            } finally {
                byteBuffer.limit(iLimit);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 >= 0) {
                if (i10 <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i10);
                }
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i10 + ", remaining: " + byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    private static void zzh(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzc zzcVar = new zzc(fileChannel, 0L, j10);
            zzc zzcVar2 = new zzc(fileChannel, j11, j12 - j11);
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzj.zzd(byteBufferDuplicate, j10);
            zza zzaVar = new zza(byteBufferDuplicate);
            int size = map.size();
            int[] iArr = new int[size];
            Iterator it = map.keySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = ((Integer) it.next()).intValue();
                i10++;
            }
            try {
                byte[][] bArrZzk = zzk(iArr, new zzb[]{zzcVar, zzcVar2, zzaVar});
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = iArr[i11];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), bArrZzk[i11])) {
                        throw new SecurityException(zzd(i12).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e10) {
                throw new SecurityException("Failed to compute digest(s) of contents", e10);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 >= 0) {
            if (i10 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i10];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i10 + ", available: " + byteBuffer.remaining());
        }
        throw new IOException("Negative length");
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, SecurityException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzf = zzf(byteBuffer);
        ByteBuffer byteBufferZzf2 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferZzf2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferZzf3 = zzf(byteBufferZzf2);
                if (byteBufferZzf3.remaining() >= 8) {
                    int i12 = byteBufferZzf3.getInt();
                    arrayList.add(Integer.valueOf(i12));
                    if (i12 != 513 && i12 != 514 && i12 != 769) {
                        switch (i12) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i10 != -1) {
                        int iZzc = zzc(i12);
                        int iZzc2 = zzc(i10);
                        if (iZzc != 1 && iZzc2 == 1) {
                        }
                    }
                    bArrZzi3 = zzi(byteBufferZzf3);
                    i10 = i12;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException e10) {
                e = e10;
                throw new SecurityException("Failed to parse signature record #" + i11, e);
            } catch (BufferUnderflowException e11) {
                e = e11;
                throw new SecurityException("Failed to parse signature record #" + i11, e);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 != 513 && i10 != 514) {
            if (i10 != 769) {
                switch (i10) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
                }
            } else {
                str = "DSA";
            }
        } else {
            str = "EC";
        }
        if (i10 != 513) {
            if (i10 != 514) {
                if (i10 != 769) {
                    switch (i10) {
                        case 257:
                            pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                            break;
                        case 258:
                            pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                            break;
                        case 259:
                            pairCreate = Pair.create("SHA256withRSA", null);
                            break;
                        case 260:
                            pairCreate = Pair.create("SHA512withRSA", null);
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
                    }
                } else {
                    pairCreate = Pair.create("SHA256withDSA", null);
                }
            } else {
                pairCreate = Pair.create("SHA512withECDSA", null);
            }
        } else {
            pairCreate = Pair.create("SHA256withECDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf);
            if (signature.verify(bArrZzi3)) {
                byteBufferZzf.clear();
                ByteBuffer byteBufferZzf4 = zzf(byteBufferZzf);
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (byteBufferZzf4.hasRemaining()) {
                    i13++;
                    try {
                        ByteBuffer byteBufferZzf5 = zzf(byteBufferZzf4);
                        if (byteBufferZzf5.remaining() >= 8) {
                            int i14 = byteBufferZzf5.getInt();
                            arrayList2.add(Integer.valueOf(i14));
                            if (i14 == i10) {
                                bArrZzi2 = zzi(byteBufferZzf5);
                            }
                        } else {
                            throw new IOException("Record too short");
                        }
                    } catch (IOException e12) {
                        e = e12;
                        throw new IOException("Failed to parse digest record #" + i13, e);
                    } catch (BufferUnderflowException e13) {
                        e = e13;
                        throw new IOException("Failed to parse digest record #" + i13, e);
                    }
                }
                if (arrayList.equals(arrayList2)) {
                    int iZzc3 = zzc(i10);
                    byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzc3), bArrZzi2);
                    if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzi2)) {
                        throw new SecurityException(zzd(iZzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
                    }
                    ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf);
                    ArrayList arrayList3 = new ArrayList();
                    int i15 = 0;
                    while (byteBufferZzf6.hasRemaining()) {
                        i15++;
                        byte[] bArrZzi4 = zzi(byteBufferZzf6);
                        try {
                            arrayList3.add(new zzg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi4)), bArrZzi4));
                        } catch (CertificateException e14) {
                            throw new SecurityException("Failed to decode certificate #" + i15, e14);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    throw new SecurityException("No certificates listed");
                }
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
        } catch (InvalidAlgorithmParameterException e15) {
            e = e15;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeyException e16) {
            e = e16;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e17) {
            e = e17;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (SignatureException e18) {
            e = e18;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeySpecException e19) {
            e = e19;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        }
    }
}
