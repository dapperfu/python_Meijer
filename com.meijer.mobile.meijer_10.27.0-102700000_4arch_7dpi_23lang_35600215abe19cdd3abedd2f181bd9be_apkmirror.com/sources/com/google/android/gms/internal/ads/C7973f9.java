package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.f9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7973f9 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f74053a;

    /* renamed from: b, reason: collision with root package name */
    private final O9 f74054b;

    /* renamed from: c, reason: collision with root package name */
    private final C8078g8 f74055c;

    public final com.google.common.util.concurrent.q a() {
        return this.f74053a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(android.content.Context r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.O9 r0 = r11.f74054b
            r1 = 31
            java.lang.String r2 = "E"
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.g8 r0 = r11.f74055c
            boolean r0 = r0.f0()
            if (r0 != 0) goto L4a
            com.google.android.gms.internal.ads.O9 r0 = r11.f74054b
            com.google.common.util.concurrent.q r0 = r0.a()
            if (r0 == 0) goto L4a
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L28
            com.google.android.gms.internal.ads.O9 r0 = r11.f74054b
            com.google.common.util.concurrent.q r0 = r0.a()
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L4a
        L28:
            com.google.android.gms.internal.ads.O9 r0 = r11.f74054b     // Catch: java.lang.Throwable -> L4a
            com.google.common.util.concurrent.q r0 = r0.a()     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.g8 r3 = r11.f74055c     // Catch: java.lang.Throwable -> L4a
            int r3 = r3.b0()     // Catch: java.lang.Throwable -> L4a
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r0.get(r3, r5)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.H8 r0 = (com.google.android.gms.internal.ads.H8) r0     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4a
            boolean r3 = r0.L0()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L4a
            java.lang.String r0 = r0.a1()     // Catch: java.lang.Throwable -> L4a
            goto L4b
        L4a:
            r0 = r2
        L4b:
            boolean r3 = r0.equals(r2)
            if (r3 == 0) goto Ld1
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r1) goto L57
            goto Ld1
        L57:
            java.lang.String r4 = ""
            if (r3 >= r1) goto L60
            com.google.common.util.concurrent.q r1 = com.google.android.gms.internal.ads.Mj0.h(r4)     // Catch: java.lang.Throwable -> Ld1
            goto Lc3
        L60:
            java.lang.String r6 = r12.getPackageName()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.si0 r3 = com.google.android.gms.internal.ads.AbstractC9414si0.g()     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.si0 r3 = r3.e()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"
            byte[] r3 = r3.i(r5)     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbf
            r9.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lbf
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lbf
            java.security.cert.Certificate r3 = r1.generateCertificate(r5)     // Catch: java.lang.Throwable -> Lbf
            r9.add(r3)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = "user"
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto Lad
            com.google.android.gms.internal.ads.si0 r3 = com.google.android.gms.internal.ads.AbstractC9414si0.g()     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.si0 r3 = r3.e()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"
            byte[] r3 = r3.i(r5)     // Catch: java.lang.Throwable -> Lbf
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lbf
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lbf
            java.security.cert.Certificate r1 = r1.generateCertificate(r5)     // Catch: java.lang.Throwable -> Lbf
            r9.add(r1)     // Catch: java.lang.Throwable -> Lbf
        Lad:
            com.google.android.gms.internal.ads.e9 r10 = new com.google.android.gms.internal.ads.e9     // Catch: java.lang.Throwable -> Lbf
            r10.<init>()     // Catch: java.lang.Throwable -> Lbf
            android.content.pm.PackageManager r5 = r12.getPackageManager()     // Catch: java.lang.Throwable -> Lbf
            r7 = 0
            r8 = 8
            com.google.ads.interactivemedia.v3.internal.d.a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lbf
            com.google.android.gms.internal.ads.hk0 r1 = r10.f73775a     // Catch: java.lang.Throwable -> Lbf
            goto Lc3
        Lbf:
            com.google.common.util.concurrent.q r1 = com.google.android.gms.internal.ads.Mj0.h(r4)     // Catch: java.lang.Throwable -> Ld1 java.lang.Throwable -> Ld1
        Lc3:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Ld1 java.lang.Throwable -> Ld1
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Ld1 java.lang.Throwable -> Ld1
            boolean r3 = com.google.android.gms.internal.ads.C7267Vf0.d(r1)     // Catch: java.lang.Throwable -> Ld1 java.lang.Throwable -> Ld1
            r4 = 1
            if (r4 == r3) goto Ld1
            r0 = r1
        Ld1:
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto Le3
            com.google.android.gms.internal.ads.g8 r1 = r11.f74055c
            boolean r1 = r1.e0()
            if (r1 != 0) goto Le3
            java.lang.String r0 = c(r12)     // Catch: java.lang.ClassCastException -> Le3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7973f9.b(android.content.Context):java.lang.String");
    }

    public C7973f9(final Context context, Executor executor, C8078g8 c8078g8, O9 o92) {
        this.f74054b = o92;
        this.f74055c = c8078g8;
        this.f74053a = Mj0.j(new Callable() { // from class: com.google.android.gms.internal.ads.d9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f73371a.b(context);
            }
        }, executor);
    }

    private static String c(Context context) throws IOException {
        File file = new File(context.getPackageResourcePath());
        if (file.exists() && file.canRead()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[16384];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                    for (int i10 = fileInputStream.read(bArr); i10 != -1; i10 = fileInputStream.read(bArr)) {
                        messageDigest.update(bArr, 0, i10);
                    }
                    AbstractC9414si0 abstractC9414si0E = AbstractC9414si0.g().e();
                    byte[] bArrDigest = messageDigest.digest();
                    String strH = abstractC9414si0E.h(bArrDigest, 0, bArrDigest.length);
                    fileInputStream.close();
                    return strH;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
                return "";
            }
        }
        return "";
    }
}
