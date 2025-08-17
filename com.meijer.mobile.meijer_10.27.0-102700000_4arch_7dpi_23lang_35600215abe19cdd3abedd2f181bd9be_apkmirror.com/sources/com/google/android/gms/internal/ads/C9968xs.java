package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9968xs extends AbstractC9647us {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f79874f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g, reason: collision with root package name */
    private static final DecimalFormat f79875g = new DecimalFormat("#,###");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f79876h = 0;

    /* renamed from: d, reason: collision with root package name */
    private File f79877d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f79878e;

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final void b() {
        this.f79878e = true;
    }

    private final File s(File file) {
        return new File(C8977od0.a(C8870nd0.a(), this.f79877d, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d1  */
    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(final java.lang.String r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9968xs.n(java.lang.String):boolean");
    }

    public C9968xs(InterfaceC6807Hr interfaceC6807Hr) {
        super(interfaceC6807Hr);
        File cacheDir = this.f78933a.getCacheDir();
        if (cacheDir == null) {
            Qc.p.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(C8977od0.a(C8870nd0.a(), cacheDir, "admobVideoStreams"));
        this.f79877d = file;
        if (!file.isDirectory() && !this.f79877d.mkdirs()) {
            Qc.p.g("Could not create preload cache directory at ".concat(String.valueOf(this.f79877d.getAbsolutePath())));
            this.f79877d = null;
        } else {
            if (this.f79877d.setReadable(true, false) && this.f79877d.setExecutable(true, false)) {
                return;
            }
            Qc.p.g("Could not set cache file permissions at ".concat(String.valueOf(this.f79877d.getAbsolutePath())));
            this.f79877d = null;
        }
    }
}
