package com.google.android.gms.internal.pal;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.pal.m4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10914m4 extends L4 {

    /* renamed from: k, reason: collision with root package name */
    private static final M4 f84073k = new M4();

    /* renamed from: i, reason: collision with root package name */
    private final Context f84074i;

    /* renamed from: j, reason: collision with root package name */
    private final C10804f6 f84075j;

    protected final String c() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrI = C10717a4.i((String) C10718a5.c().b(C10979q5.f84377Z1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrI)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(C10717a4.i((String) C10718a5.c().b(C10979q5.f84387a2)))));
            }
            Context context = this.f84074i;
            String packageName = context.getPackageName();
            this.f83580b.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final C10869j7 c10869j7R = C10869j7.r();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.pal.N4
                public final void onChecksumsReady(List list) {
                    C10869j7 c10869j7 = c10869j7R;
                    if (list == null) {
                        c10869j7.i(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksumA = com.google.ads.interactivemedia.v3.internal.a.a(list.get(i10));
                            if (apkChecksumA.getType() == 8) {
                                c10869j7.i(C10717a4.c(apkChecksumA.getValue()));
                                return;
                            }
                        }
                        c10869j7.i(null);
                    } catch (Throwable unused) {
                        c10869j7.i(null);
                    }
                }
            });
            return (String) c10869j7R.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public C10914m4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, Context context, C10804f6 c10804f6) {
        super(x32, "hhtrMjcGMTQSGdrv1+l2gakNTe0Pfchc8VT5kRHtsehlafuJ8JEE4iewNV4y5I/U", "o5W1eROpLyVNcsDGW3Y0lGc2x/V+mDPvMXouv3gbW6M=", ya2, i10, 27);
        this.f84074i = context;
        this.f84075j = c10804f6;
    }

    public static String d(C10804f6 c10804f6) {
        if (c10804f6 == null || !c10804f6.z() || C10717a4.g(c10804f6.w().v())) {
            return null;
        }
        return c10804f6.w().v();
    }

    private final String e() throws ExecutionException, InterruptedException {
        try {
            if (this.f83580b.l() != null) {
                this.f83580b.l().get();
            }
            B1 b1C = this.f83580b.c();
            if (b1C == null || !b1C.g0()) {
                return null;
            }
            return b1C.r0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        Boolean boolValueOf;
        int i10;
        O2 o22;
        AtomicReference atomicReferenceA = f84073k.a(this.f84074i.getPackageName());
        synchronized (atomicReferenceA) {
            try {
                O2 o23 = (O2) atomicReferenceA.get();
                if (o23 == null || C10717a4.g(o23.f83640b) || o23.f83640b.equals("E") || o23.f83640b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    boolean z10 = true;
                    if (C10717a4.g(d(this.f84075j))) {
                        C10804f6 c10804f6 = this.f84075j;
                        if (C10717a4.g(d(c10804f6))) {
                            boolValueOf = Boolean.valueOf(c10804f6 != null && c10804f6.y() && c10804f6.v().v() == 4);
                        } else {
                            boolValueOf = Boolean.FALSE;
                        }
                        i10 = (boolValueOf.booleanValue() && this.f83580b.p()) ? 4 : 3;
                    } else {
                        i10 = 5;
                    }
                    if (i10 != 3) {
                        z10 = false;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z10);
                    Boolean bool = (Boolean) C10718a5.c().b(C10979q5.f84368Y1);
                    String strC = ((Boolean) C10718a5.c().b(C10979q5.f84359X1)).booleanValue() ? c() : null;
                    if (bool.booleanValue() && this.f83580b.p() && C10717a4.g(strC)) {
                        strC = e();
                    }
                    O2 o24 = new O2((String) this.f83584f.invoke(null, this.f84074i, boolValueOf2, strC));
                    if (C10717a4.g(o24.f83640b) || o24.f83640b.equals("E")) {
                        int i11 = i10 - 1;
                        if (i11 == 3) {
                            String strE = e();
                            if (!C10717a4.g(strE)) {
                                o24.f83640b = strE;
                            }
                        } else if (i11 == 4) {
                            o24.f83640b = this.f84075j.w().v();
                        }
                    }
                    atomicReferenceA.set(o24);
                }
                o22 = (O2) atomicReferenceA.get();
            } finally {
            }
        }
        synchronized (this.f83583e) {
            if (o22 != null) {
                try {
                    this.f83583e.y0(o22.f83640b);
                    this.f83583e.P(o22.f83641c);
                    this.f83583e.S(o22.f83642d);
                    this.f83583e.i0(o22.f83643e);
                    this.f83583e.x0(o22.f83644f);
                } finally {
                }
            }
        }
    }
}
