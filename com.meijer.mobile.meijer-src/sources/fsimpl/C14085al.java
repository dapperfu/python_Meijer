package fsimpl;

import android.content.Context;
import com.fullstory.instrumentation.webview.WebViewTracker;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.regex.Pattern;

/* renamed from: fsimpl.al, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14085al implements InterfaceC14209fb {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f132874c = Pattern.compile("^https?://");

    /* renamed from: a, reason: collision with root package name */
    boolean f132875a = false;

    /* renamed from: b, reason: collision with root package name */
    final U f132876b;

    /* renamed from: d, reason: collision with root package name */
    private final RustInterface f132877d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f132878e;

    /* renamed from: f, reason: collision with root package name */
    private final C14138ck f132879f;

    /* renamed from: g, reason: collision with root package name */
    private final C14090aq f132880g;

    /* renamed from: h, reason: collision with root package name */
    private final WebViewTracker f132881h;

    /* renamed from: i, reason: collision with root package name */
    private final C14089ap f132882i;

    /* renamed from: j, reason: collision with root package name */
    private final X f132883j;

    /* renamed from: k, reason: collision with root package name */
    private final E f132884k;

    /* renamed from: l, reason: collision with root package name */
    private final C14195eo f132885l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f132886m;

    /* renamed from: n, reason: collision with root package name */
    private final bS f132887n;

    public C14085al(RustInterface rustInterface, Context context, C14138ck c14138ck, C14090aq c14090aq, C14089ap c14089ap, X x10, E e10, WebViewTracker webViewTracker, C14195eo c14195eo, boolean z10, bS bSVar, U u10) {
        this.f132877d = rustInterface;
        this.f132878e = context;
        this.f132879f = c14138ck;
        this.f132880g = c14090aq;
        this.f132882i = c14089ap;
        this.f132883j = x10;
        this.f132884k = e10;
        this.f132881h = webViewTracker;
        this.f132885l = c14195eo;
        this.f132886m = z10;
        this.f132887n = bSVar;
        this.f132876b = u10;
    }

    private void a(final long j10, final byte[] bArr, final String str, final String str2) {
        C14229fv.a(new Runnable() { // from class: fsimpl.al$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(bArr, str, str2, j10);
            }
        });
    }

    private void a(boolean z10) {
        this.f132875a = z10;
        if (z10) {
            this.f132876b.onFinalBundle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(byte[] bArr, String str, String str2, long j10) {
        dK dKVarA = dJ.a(bArr, str, str2);
        if (dKVarA instanceof dN) {
            dN dNVar = (dN) dKVarA;
            int iA = dNVar.a();
            byte[] bArrB = dNVar.b();
            Log.logAlways("FullStory session response: " + iA);
            Log.d("Response: " + iA + " length=" + bArrB.length);
            this.f132877d.a(j10, iA, bArrB);
            return;
        }
        Throwable thA = ((dM) dKVarA).a();
        int i10 = thA instanceof IOException ? -1 : -2;
        Log.logAlways("performHttpRequest failed with exType=" + i10);
        Log.e("performHttpRequest failed: ", thA);
        if (i10 != -1) {
            C14232fy.a(thA);
        }
        this.f132877d.a(j10, i10, new byte[0]);
    }

    private void h(String str) {
    }

    @Override // fsimpl.InterfaceC14209fb
    public InterfaceC14211fd a(byte[] bArr, String str, String str2, boolean z10) {
        try {
            h("createScanner");
            C14091ar c14091arA = this.f132880g.a(this.f132877d, bArr, str, str2, z10);
            if (!c14091arA.f()) {
                Log.e("FullStory session is invalid");
                return null;
            }
            C14086am c14086amA = this.f132882i.a(c14091arA, this.f132887n);
            C14232fy.a(c14091arA, this.f132879f);
            String strA = c14086amA.a(false);
            if (this.f132879f.b()) {
                Log.logAlways("FullStory session started: " + strA);
            } else {
                Log.i("FullStory session started: " + strA);
            }
            return c14086amA;
        } catch (Throwable th2) {
            Log.e("Exception in gotSession", th2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Override // fsimpl.InterfaceC14209fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "readConfigKey"
            r2.h(r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1821959325: goto L53;
                case -807149818: goto L49;
                case -379644574: goto L3f;
                case 79556: goto L35;
                case 2255304: goto L2b;
                case 150373893: goto L21;
                case 236511225: goto L17;
                case 1895597065: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L5d
        Ld:
            java.lang.String r0 = "BuildId"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L5d
            r3 = 2
            goto L5e
        L17:
            java.lang.String r0 = "TempDir"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L5d
            r3 = 4
            goto L5e
        L21:
            java.lang.String r0 = "PluginVersion"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L5d
            r3 = 5
            goto L5e
        L2b:
            java.lang.String r0 = "Host"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L5d
            r3 = 6
            goto L5e
        L35:
            java.lang.String r0 = "Org"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L5d
            r3 = 0
            goto L5e
        L3f:
            java.lang.String r0 = "WebViewNamespace"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L5d
            r3 = 7
            goto L5e
        L49:
            java.lang.String r0 = "AppScheme"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L5d
            r3 = 3
            goto L5e
        L53:
            java.lang.String r0 = "Server"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L5d
            r3 = 1
            goto L5e
        L5d:
            r3 = -1
        L5e:
            switch(r3) {
                case 0: goto La5;
                case 1: goto L9e;
                case 2: goto L97;
                case 3: goto L90;
                case 4: goto L85;
                case 5: goto L82;
                case 6: goto L6b;
                case 7: goto L64;
                default: goto L61;
            }
        L61:
            java.lang.String r3 = ""
            return r3
        L64:
            fsimpl.ck r3 = r2.f132879f
            java.lang.String r3 = r3.U()
            return r3
        L6b:
            fsimpl.ck r3 = r2.f132879f
            java.lang.String r3 = r3.i()
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L7b
            r0.<init>(r3)     // Catch: java.net.MalformedURLException -> L7b
            java.lang.String r3 = r0.getHost()     // Catch: java.net.MalformedURLException -> L7b
            return r3
        L7b:
            r0 = move-exception
            java.lang.String r1 = "Failed to parse server root URL"
            com.fullstory.util.Log.e(r1, r0)
            return r3
        L82:
            java.lang.String r3 = "1.62.2"
            return r3
        L85:
            fsimpl.E r3 = r2.f132884k
            java.io.File r3 = r3.a()
            java.lang.String r3 = r3.getAbsolutePath()
            return r3
        L90:
            fsimpl.ck r3 = r2.f132879f
            java.lang.String r3 = r3.h()
            return r3
        L97:
            fsimpl.ck r3 = r2.f132879f
            java.lang.String r3 = r3.g()
            return r3
        L9e:
            fsimpl.ck r3 = r2.f132879f
            java.lang.String r3 = r3.k()
            return r3
        La5:
            fsimpl.ck r3 = r2.f132879f
            java.lang.String r3 = r3.l()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14085al.a(java.lang.String):java.lang.String");
    }

    @Override // fsimpl.InterfaceC14209fb
    public void a(long j10, String str, byte[] bArr, String str2, String str3, boolean z10, boolean z11) {
        h("httpRequest; isTransactional=" + z10);
        if (z10) {
            a(j10, bArr, str2, str3);
            return;
        }
        String strD = fY.d(str);
        if (strD == null || this.f132885l == null) {
            Log.w("Internal upload error: session or uploader was missing");
            a(z11);
            this.f132877d.a(j10, HttpResponseStatus.ERROR_NOT_FOUND, new byte[0]);
            return;
        }
        File fileA = this.f132884k.a("bin");
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileA);
                try {
                    C14221fn.a().a(new ByteArrayInputStream(bArr), fileOutputStream);
                    fileOutputStream.close();
                    a(z11);
                    this.f132885l.a(strD, fileA, new URL(str2), str3, eC.NORMAL, EnumC14198er.ENCRYPTED, eD.READY, null);
                } finally {
                }
            } catch (GeneralSecurityException e10) {
                Log.e("Failed to encrypt frame data, so skipping this upload", e10);
            }
            fileA.delete();
            this.f132877d.a(j10, HttpResponseStatus.SUCCESS_OK, new byte[0]);
        } catch (Throwable th2) {
            fileA.delete();
            throw th2;
        }
    }

    @Override // fsimpl.InterfaceC14209fb
    public void a(String str, Boolean bool) {
        h("writeKeyBool");
        this.f132883j.a(str, bool);
    }

    @Override // fsimpl.InterfaceC14209fb
    public void a(String str, Long l10) {
        h("writeKeyLong");
        this.f132883j.a(str, l10);
    }

    @Override // fsimpl.InterfaceC14209fb
    public void a(String str, String str2) {
        h("writeKey");
        this.f132883j.a(str, str2);
    }

    @Override // fsimpl.InterfaceC14209fb
    public boolean a(long j10, String str, String str2) {
        return this.f132881h.b(j10, str, str2);
    }

    byte[] a() {
        if (!C14221fn.a(this.f132878e)) {
            return new byte[0];
        }
        gh ghVar = new gh();
        ghVar.h(C14167dm.a(ghVar, (byte) 2, C14247t.a(this.f132878e, ghVar, this.f132879f), C14247t.a(ghVar, this.f132886m, this.f132879f)));
        ByteBuffer byteBufferSlice = gk.a(ghVar).slice();
        int iRemaining = byteBufferSlice.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBufferSlice.get(bArr, 0, iRemaining);
        return bArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // fsimpl.InterfaceC14209fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "readConfigKeyBool"
            r2.h(r0)
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1655724014: goto L22;
                case 204775274: goto L18;
                case 376444267: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L2c
        Le:
            java.lang.String r0 = "PreviewMode"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2c
            r3 = 1
            goto L2d
        L18:
            java.lang.String r0 = "UseProxyServer"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2c
            r3 = 2
            goto L2d
        L22:
            java.lang.String r0 = "RecordOnStart"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2c
            r3 = 0
            goto L2d
        L2c:
            r3 = -1
        L2d:
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L38;
                case 2: goto L31;
                default: goto L30;
            }
        L30:
            return r1
        L31:
            fsimpl.ck r3 = r2.f132879f
            boolean r3 = r3.T()
            return r3
        L38:
            fsimpl.ck r3 = r2.f132879f
            boolean r3 = r3.O()
            return r3
        L3f:
            fsimpl.ck r3 = r2.f132879f
            boolean r3 = r3.t()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14085al.b(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    @Override // fsimpl.InterfaceC14209fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "readConfigKeyInt"
            r2.h(r0)
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1022705348: goto L2c;
                case -157490462: goto L22;
                case 755811072: goto L18;
                case 1484729112: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L36
        Le:
            java.lang.String r0 = "SessionTimeLimit"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            r3 = 2
            goto L37
        L18:
            java.lang.String r0 = "ProtocolVersion"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            r3 = 0
            goto L37
        L22:
            java.lang.String r0 = "SessionSetupDelayMs"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            r3 = 1
            goto L37
        L2c:
            java.lang.String r0 = "ViewScanType"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            r3 = 3
            goto L37
        L36:
            r3 = -1
        L37:
            switch(r3) {
                case 0: goto L50;
                case 1: goto L49;
                case 2: goto L42;
                case 3: goto L3b;
                default: goto L3a;
            }
        L3a:
            return r1
        L3b:
            fsimpl.ck r3 = r2.f132879f
            byte r3 = r3.P()
            return r3
        L42:
            fsimpl.ck r3 = r2.f132879f
            int r3 = r3.f()
            return r3
        L49:
            fsimpl.ck r3 = r2.f132879f
            int r3 = r3.e()
            return r3
        L50:
            r3 = 1755199766(0x689e3916, float:5.9774956E24)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14085al.c(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // fsimpl.InterfaceC14209fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] d(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "readConfigKeyBuffer"
            r1.h(r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case 443088107: goto L17;
                case 1963152051: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L21
        Ld:
            java.lang.String r0 = "PlatformBuffer"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L21
            r2 = 0
            goto L22
        L17:
            java.lang.String r0 = "CanvasDefinition"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = -1
        L22:
            switch(r2) {
                case 0: goto L2c;
                case 1: goto L27;
                default: goto L25;
            }
        L25:
            r2 = 0
            return r2
        L27:
            byte[] r2 = fsimpl.dH.a()
            return r2
        L2c:
            byte[] r2 = r1.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14085al.d(java.lang.String):byte[]");
    }

    @Override // fsimpl.InterfaceC14209fb
    public String e(String str) {
        h("readKey");
        return this.f132883j.a(str);
    }

    @Override // fsimpl.InterfaceC14209fb
    public Boolean f(String str) {
        h("readKeyBoolean");
        return this.f132883j.b(str);
    }

    @Override // fsimpl.InterfaceC14209fb
    public Long g(String str) {
        h("readKeyLong");
        return this.f132883j.c(str);
    }
}
