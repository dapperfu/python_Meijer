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
public final class C6703Ba extends AbstractCallableC7816cb {

    /* renamed from: k, reason: collision with root package name */
    private static final C7923db f66394k = new C7923db();

    /* renamed from: h, reason: collision with root package name */
    private final C8203g8 f66395h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f66396i;

    /* renamed from: j, reason: collision with root package name */
    private final C8098f9 f66397j;

    protected final String c() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrF = C9309qa.f((String) Oc.A.c().a(C8784lf.f76757C2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrF)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(C9309qa.f((String) Oc.A.c().a(C8784lf.f76771D2)))));
            }
            Context context = this.f66396i;
            String packageName = context.getPackageName();
            this.f74041a.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final C8369hk0 c8369hk0D = C8369hk0.D();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.eb
                public final void onChecksumsReady(List list) {
                    C8369hk0 c8369hk0 = c8369hk0D;
                    if (list == null) {
                        c8369hk0.g(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksumA = com.google.ads.interactivemedia.v3.internal.a.a(list.get(i10));
                            if (apkChecksumA.getType() == 8) {
                                c8369hk0.g(C9309qa.b(apkChecksumA.getValue()));
                                return;
                            }
                        }
                        c8369hk0.g(null);
                    } catch (Throwable unused) {
                        c8369hk0.g(null);
                    }
                }
            });
            return (String) c8369hk0D.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public C6703Ba(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, Context context, X7 x72, C8203g8 c8203g8, C8098f9 c8098f9) {
        super(c8988na, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", c8736l8, i10, 27);
        this.f66396i = context;
        this.f66395h = c8203g8;
        this.f66397j = c8098f9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C7778c9 d() throws IllegalAccessException, InvocationTargetException {
        int iB0;
        String str;
        if (((Boolean) Oc.A.c().a(C8784lf.f76911N2)).booleanValue()) {
            iB0 = ((Integer) Oc.A.c().a(C8784lf.f76981S2)).intValue();
        } else {
            iB0 = this.f66395h.b0();
        }
        C7778c9 c7778c9 = new C7778c9((String) this.f74045e.invoke(null, this.f66396i, Boolean.FALSE, ""));
        C8098f9 c8098f9 = this.f66397j;
        if (c8098f9 == null || c8098f9.a() == null) {
            str = "E";
        } else {
            try {
                str = (String) c8098f9.a().get(iB0, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        c7778c9.f73968b = str;
        return c7778c9;
    }

    private final String e() throws ExecutionException, InterruptedException {
        try {
            if (this.f74041a.l() != null) {
                this.f74041a.l().get();
            }
            H8 h8C = this.f74041a.c();
            if (h8C == null || !h8C.L0()) {
                return null;
            }
            return h8C.a1();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        int i10;
        C7778c9 c7778c9D;
        C7778c9 c7778c9;
        AtomicReference atomicReferenceA = f66394k.a(this.f66396i.getPackageName());
        synchronized (atomicReferenceA) {
            try {
                C7778c9 c7778c92 = (C7778c9) atomicReferenceA.get();
                if (c7778c92 == null || C9309qa.d(c7778c92.f73968b) || c7778c92.f73968b.equals("E") || c7778c92.f73968b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (C9309qa.d(null)) {
                        C9309qa.d(null);
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    if (this.f66397j != null) {
                        c7778c9D = d();
                    } else {
                        boolean z10 = false;
                        if (i10 == 3 && !this.f66395h.e0()) {
                            z10 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        Boolean bool = (Boolean) Oc.A.c().a(C8784lf.f76743B2);
                        String strC = ((Boolean) Oc.A.c().a(C8784lf.f76729A2)).booleanValue() ? c() : null;
                        if (bool.booleanValue() && this.f74041a.p() && C9309qa.d(strC)) {
                            strC = e();
                        }
                        C7778c9 c7778c93 = new C7778c9((String) this.f74045e.invoke(null, this.f66396i, boolValueOf, strC));
                        if (C9309qa.d(c7778c93.f73968b) || c7778c93.f73968b.equals("E")) {
                            int i11 = i10 - 1;
                            if (i11 == 3) {
                                String strE = e();
                                if (!C9309qa.d(strE)) {
                                    c7778c93.f73968b = strE;
                                }
                            } else if (i11 == 4) {
                                throw null;
                            }
                        }
                        c7778c9D = c7778c93;
                    }
                    atomicReferenceA.set(c7778c9D);
                }
                c7778c9 = (C7778c9) atomicReferenceA.get();
            } finally {
            }
        }
        synchronized (this.f74044d) {
            if (c7778c9 != null) {
                try {
                    this.f74044d.E0(c7778c9.f73968b);
                    this.f74044d.V(c7778c9.f73969c);
                    this.f74044d.X(c7778c9.f73970d);
                    this.f74044d.o0(c7778c9.f73971e);
                    this.f74044d.D0(c7778c9.f73972f);
                } finally {
                }
            }
        }
    }
}
