package com.google.android.gms.internal.ads;

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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Ba, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6578Ba extends AbstractCallableC7691cb {

    /* renamed from: k, reason: collision with root package name */
    private static final C7798db f65554k = new C7798db();

    /* renamed from: h, reason: collision with root package name */
    private final C8078g8 f65555h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f65556i;

    /* renamed from: j, reason: collision with root package name */
    private final C7973f9 f65557j;

    protected final String c() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrF = C9184qa.f((String) Mc.A.c().a(C8659lf.f75917C2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrF)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(C9184qa.f((String) Mc.A.c().a(C8659lf.f75931D2)))));
            }
            Context context = this.f65556i;
            String packageName = context.getPackageName();
            this.f73201a.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final C8244hk0 c8244hk0D = C8244hk0.D();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.eb
                public final void onChecksumsReady(List list) {
                    C8244hk0 c8244hk0 = c8244hk0D;
                    if (list == null) {
                        c8244hk0.g(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksumA = com.google.ads.interactivemedia.v3.internal.a.a(list.get(i10));
                            if (apkChecksumA.getType() == 8) {
                                c8244hk0.g(C9184qa.b(apkChecksumA.getValue()));
                                return;
                            }
                        }
                        c8244hk0.g(null);
                    } catch (Throwable unused) {
                        c8244hk0.g(null);
                    }
                }
            });
            return (String) c8244hk0D.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public C6578Ba(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, Context context, X7 x72, C8078g8 c8078g8, C7973f9 c7973f9) {
        super(c8863na, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", c8611l8, i10, 27);
        this.f65556i = context;
        this.f65555h = c8078g8;
        this.f65557j = c7973f9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C7653c9 d() throws IllegalAccessException, InvocationTargetException {
        int iB0;
        String str;
        if (((Boolean) Mc.A.c().a(C8659lf.f76071N2)).booleanValue()) {
            iB0 = ((Integer) Mc.A.c().a(C8659lf.f76141S2)).intValue();
        } else {
            iB0 = this.f65555h.b0();
        }
        C7653c9 c7653c9 = new C7653c9((String) this.f73205e.invoke(null, this.f65556i, Boolean.FALSE, ""));
        C7973f9 c7973f9 = this.f65557j;
        if (c7973f9 == null || c7973f9.a() == null) {
            str = "E";
        } else {
            try {
                str = (String) c7973f9.a().get(iB0, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        c7653c9.f73128b = str;
        return c7653c9;
    }

    private final String e() throws ExecutionException, InterruptedException {
        try {
            if (this.f73201a.l() != null) {
                this.f73201a.l().get();
            }
            H8 h8C = this.f73201a.c();
            if (h8C == null || !h8C.L0()) {
                return null;
            }
            return h8C.a1();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        int i10;
        C7653c9 c7653c9D;
        C7653c9 c7653c9;
        AtomicReference atomicReferenceA = f65554k.a(this.f65556i.getPackageName());
        synchronized (atomicReferenceA) {
            try {
                C7653c9 c7653c92 = (C7653c9) atomicReferenceA.get();
                if (c7653c92 == null || C9184qa.d(c7653c92.f73128b) || c7653c92.f73128b.equals("E") || c7653c92.f73128b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (C9184qa.d(null)) {
                        C9184qa.d(null);
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    if (this.f65557j != null) {
                        c7653c9D = d();
                    } else {
                        boolean z10 = false;
                        if (i10 == 3 && !this.f65555h.e0()) {
                            z10 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        Boolean bool = (Boolean) Mc.A.c().a(C8659lf.f75903B2);
                        String strC = ((Boolean) Mc.A.c().a(C8659lf.f75889A2)).booleanValue() ? c() : null;
                        if (bool.booleanValue() && this.f73201a.p() && C9184qa.d(strC)) {
                            strC = e();
                        }
                        C7653c9 c7653c93 = new C7653c9((String) this.f73205e.invoke(null, this.f65556i, boolValueOf, strC));
                        if (C9184qa.d(c7653c93.f73128b) || c7653c93.f73128b.equals("E")) {
                            int i11 = i10 - 1;
                            if (i11 == 3) {
                                String strE = e();
                                if (!C9184qa.d(strE)) {
                                    c7653c93.f73128b = strE;
                                }
                            } else if (i11 == 4) {
                                throw null;
                            }
                        }
                        c7653c9D = c7653c93;
                    }
                    atomicReferenceA.set(c7653c9D);
                }
                c7653c9 = (C7653c9) atomicReferenceA.get();
            } finally {
            }
        }
        synchronized (this.f73204d) {
            if (c7653c9 != null) {
                try {
                    this.f73204d.E0(c7653c9.f73128b);
                    this.f73204d.V(c7653c9.f73129c);
                    this.f73204d.X(c7653c9.f73130d);
                    this.f73204d.o0(c7653c9.f73131e);
                    this.f73204d.D0(c7653c9.f73132f);
                } finally {
                }
            }
        }
    }
}
