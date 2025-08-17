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
/* loaded from: classes14.dex */
public class C13960al implements InterfaceC14084fb {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f131624c = Pattern.compile("^https?://");

    /* renamed from: a, reason: collision with root package name */
    boolean f131625a = false;

    /* renamed from: b, reason: collision with root package name */
    final U f131626b;

    /* renamed from: d, reason: collision with root package name */
    private final RustInterface f131627d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f131628e;

    /* renamed from: f, reason: collision with root package name */
    private final C14013ck f131629f;

    /* renamed from: g, reason: collision with root package name */
    private final C13965aq f131630g;

    /* renamed from: h, reason: collision with root package name */
    private final WebViewTracker f131631h;

    /* renamed from: i, reason: collision with root package name */
    private final C13964ap f131632i;

    /* renamed from: j, reason: collision with root package name */
    private final X f131633j;

    /* renamed from: k, reason: collision with root package name */
    private final E f131634k;

    /* renamed from: l, reason: collision with root package name */
    private final C14070eo f131635l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f131636m;

    /* renamed from: n, reason: collision with root package name */
    private final bS f131637n;

    public C13960al(RustInterface rustInterface, Context context, C14013ck c14013ck, C13965aq c13965aq, C13964ap c13964ap, X x10, E e10, WebViewTracker webViewTracker, C14070eo c14070eo, boolean z10, bS bSVar, U u10) {
        this.f131627d = rustInterface;
        this.f131628e = context;
        this.f131629f = c14013ck;
        this.f131630g = c13965aq;
        this.f131632i = c13964ap;
        this.f131633j = x10;
        this.f131634k = e10;
        this.f131631h = webViewTracker;
        this.f131635l = c14070eo;
        this.f131636m = z10;
        this.f131637n = bSVar;
        this.f131626b = u10;
    }

    private void a(final long j10, final byte[] bArr, final String str, final String str2) {
        C14104fv.a(new Runnable() { // from class: fsimpl.al$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(bArr, str, str2, j10);
            }
        });
    }

    private void a(boolean z10) {
        this.f131625a = z10;
        if (z10) {
            this.f131626b.onFinalBundle();
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
            this.f131627d.a(j10, iA, bArrB);
            return;
        }
        Throwable thA = ((dM) dKVarA).a();
        int i10 = thA instanceof IOException ? -1 : -2;
        Log.logAlways("performHttpRequest failed with exType=" + i10);
        Log.e("performHttpRequest failed: ", thA);
        if (i10 != -1) {
            C14107fy.a(thA);
        }
        this.f131627d.a(j10, i10, new byte[0]);
    }

    private void h(String str) {
    }

    @Override // fsimpl.InterfaceC14084fb
    public InterfaceC14086fd a(byte[] bArr, String str, String str2, boolean z10) {
        try {
            h("createScanner");
            C13966ar c13966arA = this.f131630g.a(this.f131627d, bArr, str, str2, z10);
            if (!c13966arA.f()) {
                Log.e("FullStory session is invalid");
                return null;
            }
            C13961am c13961amA = this.f131632i.a(c13966arA, this.f131637n);
            C14107fy.a(c13966arA, this.f131629f);
            String strA = c13961amA.a(false);
            if (this.f131629f.b()) {
                Log.logAlways("FullStory session started: " + strA);
            } else {
                Log.i("FullStory session started: " + strA);
            }
            return c13961amA;
        } catch (Throwable th2) {
            Log.e("Exception in gotSession", th2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Override // fsimpl.InterfaceC14084fb
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
            fsimpl.ck r3 = r2.f131629f
            java.lang.String r3 = r3.U()
            return r3
        L6b:
            fsimpl.ck r3 = r2.f131629f
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
            java.lang.String r3 = "1.62.0"
            return r3
        L85:
            fsimpl.E r3 = r2.f131634k
            java.io.File r3 = r3.a()
            java.lang.String r3 = r3.getAbsolutePath()
            return r3
        L90:
            fsimpl.ck r3 = r2.f131629f
            java.lang.String r3 = r3.h()
            return r3
        L97:
            fsimpl.ck r3 = r2.f131629f
            java.lang.String r3 = r3.g()
            return r3
        L9e:
            fsimpl.ck r3 = r2.f131629f
            java.lang.String r3 = r3.k()
            return r3
        La5:
            fsimpl.ck r3 = r2.f131629f
            java.lang.String r3 = r3.l()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C13960al.a(java.lang.String):java.lang.String");
    }

    @Override // fsimpl.InterfaceC14084fb
    public void a(long j10, String str, byte[] bArr, String str2, String str3, boolean z10, boolean z11) {
        h("httpRequest; isTransactional=" + z10);
        if (z10) {
            a(j10, bArr, str2, str3);
            return;
        }
        String strD = fY.d(str);
        if (strD == null || this.f131635l == null) {
            Log.w("Internal upload error: session or uploader was missing");
            a(z11);
            this.f131627d.a(j10, HttpResponseStatus.ERROR_NOT_FOUND, new byte[0]);
            return;
        }
        File fileA = this.f131634k.a("bin");
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileA);
                try {
                    C14096fn.a().a(new ByteArrayInputStream(bArr), fileOutputStream);
                    fileOutputStream.close();
                    a(z11);
                    this.f131635l.a(strD, fileA, new URL(str2), str3, eC.NORMAL, EnumC14073er.ENCRYPTED, eD.READY, null);
                } finally {
                }
            } catch (GeneralSecurityException e10) {
                Log.e("Failed to encrypt frame data, so skipping this upload", e10);
            }
            fileA.delete();
            this.f131627d.a(j10, HttpResponseStatus.SUCCESS_OK, new byte[0]);
        } catch (Throwable th2) {
            fileA.delete();
            throw th2;
        }
    }

    @Override // fsimpl.InterfaceC14084fb
    public void a(String str, Boolean bool) {
        h("writeKeyBool");
        this.f131633j.a(str, bool);
    }

    @Override // fsimpl.InterfaceC14084fb
    public void a(String str, Long l10) {
        h("writeKeyLong");
        this.f131633j.a(str, l10);
    }

    @Override // fsimpl.InterfaceC14084fb
    public void a(String str, String str2) {
        h("writeKey");
        this.f131633j.a(str, str2);
    }

    @Override // fsimpl.InterfaceC14084fb
    public boolean a(long j10, String str, String str2) {
        return this.f131631h.b(j10, str, str2);
    }

    byte[] a() {
        if (!C14096fn.a(this.f131628e)) {
            return new byte[0];
        }
        gh ghVar = new gh();
        ghVar.h(C14042dm.a(ghVar, (byte) 2, C14122t.a(this.f131628e, ghVar, this.f131629f), C14122t.a(ghVar, this.f131636m, this.f131629f)));
        ByteBuffer byteBufferSlice = gk.a(ghVar).slice();
        int iRemaining = byteBufferSlice.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBufferSlice.get(bArr, 0, iRemaining);
        return bArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // fsimpl.InterfaceC14084fb
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
            fsimpl.ck r3 = r2.f131629f
            boolean r3 = r3.T()
            return r3
        L38:
            fsimpl.ck r3 = r2.f131629f
            boolean r3 = r3.O()
            return r3
        L3f:
            fsimpl.ck r3 = r2.f131629f
            boolean r3 = r3.t()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C13960al.b(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    @Override // fsimpl.InterfaceC14084fb
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
            fsimpl.ck r3 = r2.f131629f
            byte r3 = r3.P()
            return r3
        L42:
            fsimpl.ck r3 = r2.f131629f
            int r3 = r3.f()
            return r3
        L49:
            fsimpl.ck r3 = r2.f131629f
            int r3 = r3.e()
            return r3
        L50:
            r3 = 1753381861(0x68827be5, float:4.929545E24)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C13960al.c(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // fsimpl.InterfaceC14084fb
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
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C13960al.d(java.lang.String):byte[]");
    }

    @Override // fsimpl.InterfaceC14084fb
    public String e(String str) {
        h("readKey");
        return this.f131633j.a(str);
    }

    @Override // fsimpl.InterfaceC14084fb
    public Boolean f(String str) {
        h("readKeyBoolean");
        return this.f131633j.b(str);
    }

    @Override // fsimpl.InterfaceC14084fb
    public Long g(String str) {
        h("readKeyLong");
        return this.f131633j.c(str);
    }
}
