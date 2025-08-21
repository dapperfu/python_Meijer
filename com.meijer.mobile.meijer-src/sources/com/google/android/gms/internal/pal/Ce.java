package com.google.android.gms.internal.pal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* loaded from: classes6.dex */
public final class Ce {
    public static KeyPair c(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) Ee.f83429j.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECParameterSpec k(int i10) throws NoSuchAlgorithmException {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? m("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650") : m("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f") : m("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    private static ECParameterSpec m(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static int a(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger b(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    static void d(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerB = b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX != null && affineY != null) {
            if (affineX.signum() != -1 && affineX.compareTo(bigIntegerB) < 0) {
                if (affineY.signum() != -1 && affineY.compareTo(bigIntegerB) < 0) {
                    if (affineY.multiply(affineY).mod(bigIntegerB).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerB))) {
                        return;
                    } else {
                        throw new GeneralSecurityException("Point is not on curve");
                    }
                }
                throw new GeneralSecurityException("y is out of range");
            }
            throw new GeneralSecurityException("x is out of range");
        }
        throw new GeneralSecurityException("point is at infinity");
    }

    public static void e(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        f(eCPublicKey, eCPrivateKey);
        d(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    static void f(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static byte[] g(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws IllegalStateException, GeneralSecurityException {
        f(eCPublicKey, eCPrivateKey);
        ECPoint w10 = eCPublicKey.getW();
        d(w10, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = ((KeyFactory) Ee.f83430k.a("EC")).generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) Ee.f83428i.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() != -1 && bigInteger.compareTo(b(curve)) < 0) {
                BigInteger bigIntegerB = b(curve);
                BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(bigIntegerB);
                if (bigIntegerB.signum() == 1) {
                    BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerB);
                    BigInteger bigIntegerAdd = BigInteger.ZERO;
                    if (!bigIntegerMod2.equals(bigIntegerAdd)) {
                        if (bigIntegerB.testBit(0) && bigIntegerB.testBit(1)) {
                            bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerB.add(BigInteger.ONE).shiftRight(2), bigIntegerB);
                        } else if (bigIntegerB.testBit(0) && !bigIntegerB.testBit(1)) {
                            bigIntegerAdd = BigInteger.ONE;
                            BigInteger bigIntegerShiftRight = bigIntegerB.subtract(bigIntegerAdd).shiftRight(1);
                            int i10 = 0;
                            while (true) {
                                BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerB);
                                if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                                    break;
                                }
                                BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerB);
                                BigInteger bigIntegerMod4 = BigInteger.ONE;
                                if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerB)) {
                                    BigInteger bigIntegerShiftRight2 = bigIntegerB.add(bigIntegerMod4).shiftRight(1);
                                    BigInteger bigIntegerMod5 = bigIntegerAdd;
                                    for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                        BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                        bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerB).multiply(bigIntegerMod3)).mod(bigIntegerB);
                                        bigIntegerMod4 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerB);
                                        if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                            BigInteger bigIntegerMod6 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod4.multiply(bigIntegerMod3)).mod(bigIntegerB);
                                            bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod4).add(bigIntegerMod5).mod(bigIntegerB);
                                            bigIntegerMod5 = bigIntegerMod6;
                                        }
                                    }
                                    bigIntegerAdd = bigIntegerMod5;
                                } else if (bigIntegerModPow.equals(bigIntegerMod4)) {
                                    bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                                    i10++;
                                    if (i10 == 128 && !bigIntegerB.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            }
                        } else {
                            bigIntegerAdd = null;
                        }
                        if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerB).compareTo(bigIntegerMod2) != 0) {
                            throw new GeneralSecurityException("Could not find a modular square root");
                        }
                    }
                    if (!bigIntegerAdd.testBit(0)) {
                        bigIntegerB.subtract(bigIntegerAdd).mod(bigIntegerB);
                    }
                    return bArrGenerateSecret;
                }
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static ECPrivateKey h(int i10, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) ((KeyFactory) Ee.f83430k.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), k(i10)));
    }

    public static ECPublicKey i(int i10, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpecK = k(i10);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        d(eCPoint, eCParameterSpecK.getCurve());
        return (ECPublicKey) ((KeyFactory) Ee.f83430k.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecK));
    }

    public static ECPublicKey j(ECParameterSpec eCParameterSpec, int i10, byte[] bArr) throws GeneralSecurityException {
        EllipticCurve curve = eCParameterSpec.getCurve();
        int iA = a(curve);
        int length = bArr.length;
        if (length == iA + iA + 1) {
            if (bArr[0] == 4) {
                int i11 = iA + 1;
                ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i11)), new BigInteger(1, Arrays.copyOfRange(bArr, i11, length)));
                d(eCPoint, curve);
                return (ECPublicKey) ((KeyFactory) Ee.f83430k.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
            }
            throw new GeneralSecurityException("invalid point format");
        }
        throw new GeneralSecurityException("invalid point size");
    }

    public static byte[] l(EllipticCurve ellipticCurve, int i10, ECPoint eCPoint) throws GeneralSecurityException {
        d(eCPoint, ellipticCurve);
        int iA = a(ellipticCurve);
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 2;
            if (i11 != 2) {
                int i12 = iA + 1;
                byte[] bArr = new byte[i12];
                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                int length = byteArray.length;
                System.arraycopy(byteArray, 0, bArr, i12 - length, length);
                if (true == eCPoint.getAffineY().testBit(0)) {
                    b10 = 3;
                }
                bArr[0] = b10;
                return bArr;
            }
            int i13 = iA + iA;
            byte[] bArr2 = new byte[i13];
            byte[] byteArray2 = eCPoint.getAffineX().toByteArray();
            int length2 = byteArray2.length;
            if (length2 > iA) {
                byteArray2 = Arrays.copyOfRange(byteArray2, length2 - iA, length2);
            }
            byte[] byteArray3 = eCPoint.getAffineY().toByteArray();
            int length3 = byteArray3.length;
            if (length3 > iA) {
                byteArray3 = Arrays.copyOfRange(byteArray3, length3 - iA, length3);
            }
            int length4 = byteArray3.length;
            System.arraycopy(byteArray3, 0, bArr2, i13 - length4, length4);
            int length5 = byteArray2.length;
            System.arraycopy(byteArray2, 0, bArr2, iA - length5, length5);
            return bArr2;
        }
        int i14 = iA + iA + 1;
        byte[] bArr3 = new byte[i14];
        byte[] byteArray4 = eCPoint.getAffineX().toByteArray();
        byte[] byteArray5 = eCPoint.getAffineY().toByteArray();
        int length6 = byteArray5.length;
        System.arraycopy(byteArray5, 0, bArr3, i14 - length6, length6);
        int length7 = byteArray4.length;
        System.arraycopy(byteArray4, 0, bArr3, (iA + 1) - length7, length7);
        bArr3[0] = 4;
        return bArr3;
    }
}
