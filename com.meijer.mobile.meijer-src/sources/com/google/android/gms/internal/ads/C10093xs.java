package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10093xs extends AbstractC9772us {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f80714f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g, reason: collision with root package name */
    private static final DecimalFormat f80715g = new DecimalFormat("#,###");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f80716h = 0;

    /* renamed from: d, reason: collision with root package name */
    private File f80717d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f80718e;

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final void b() {
        this.f80718e = true;
    }

    private final File s(File file) {
        return new File(C9102od0.a(C8995nd0.a(), this.f80717d, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d1  */
    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(final java.lang.String r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10093xs.n(java.lang.String):boolean");
    }

    public C10093xs(InterfaceC6932Hr interfaceC6932Hr) {
        super(interfaceC6932Hr);
        File cacheDir = this.f79773a.getCacheDir();
        if (cacheDir == null) {
            Sc.p.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(C9102od0.a(C8995nd0.a(), cacheDir, "admobVideoStreams"));
        this.f80717d = file;
        if (!file.isDirectory() && !this.f80717d.mkdirs()) {
            Sc.p.g("Could not create preload cache directory at ".concat(String.valueOf(this.f80717d.getAbsolutePath())));
            this.f80717d = null;
        } else {
            if (this.f80717d.setReadable(true, false) && this.f80717d.setExecutable(true, false)) {
                return;
            }
            Sc.p.g("Could not set cache file permissions at ".concat(String.valueOf(this.f80717d.getAbsolutePath())));
            this.f80717d = null;
        }
    }
}
