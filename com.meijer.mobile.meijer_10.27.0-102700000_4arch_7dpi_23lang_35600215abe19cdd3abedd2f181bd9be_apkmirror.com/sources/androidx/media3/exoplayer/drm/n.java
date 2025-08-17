package androidx.media3.exoplayer.drm;

import a3.C5569i;
import a3.o;
import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.exoplayer.drm.m;
import d3.C13466a;
import d3.D;
import d3.P;
import d3.r;
import i3.E1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import k3.q;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final m.c f56126d = new m.c() { // from class: k3.o
        @Override // androidx.media3.exoplayer.drm.m.c
        public final androidx.media3.exoplayer.drm.m a(UUID uuid) {
            return androidx.media3.exoplayer.drm.n.n(uuid);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final UUID f56127a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDrm f56128b;

    /* renamed from: c, reason: collision with root package name */
    private int f56129c;

    @Override // androidx.media3.exoplayer.drm.m
    public int f() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public synchronized void release() {
        int i10 = this.f56129c - 1;
        this.f56129c = i10;
        if (i10 == 0) {
            this.f56128b.release();
        }
    }

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            return mediaDrm.requiresSecureDecoder(str, i10);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, E1 e12) {
            LogSessionId logSessionIdA = e12.a();
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                q.a(C13466a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
            }
        }
    }

    private boolean A() {
        if (!this.f56127a.equals(C5569i.f43835d)) {
            return this.f56127a.equals(C5569i.f43834c);
        }
        String strY = y("version");
        return (strY.startsWith("v5.") || strY.startsWith("14.") || strY.startsWith("15.") || strY.startsWith("16.0")) ? false : true;
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static n C(UUID uuid) throws UnsupportedDrmException {
        try {
            return new n(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(1, e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(2, e11);
        }
    }

    private static byte[] p(byte[] bArr) {
        D d10 = new D(bArr);
        int iU = d10.u();
        short sW = d10.w();
        short sW2 = d10.w();
        if (sW != 1 || sW2 != 1) {
            r.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sW3 = d10.w();
        Charset charset = StandardCharsets.UTF_16LE;
        String strF = d10.F(sW3, charset);
        if (strF.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strF.indexOf("</DATA>");
        if (iIndexOf == -1) {
            r.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strF.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strF.substring(iIndexOf);
        int i10 = iU + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sW);
        byteBufferAllocate.putShort(sW2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (P.f127086a >= 33 && "https://default.url".equals(str)) {
            String strY = y("version");
            if (Objects.equals(strY, "1.2") || Objects.equals(strY, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return C5569i.f43834c.equals(uuid) ? androidx.media3.exoplayer.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = a3.C5569i.f43836e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = R3.p.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = p(r4)
            byte[] r4 = R3.p.a(r0, r4)
        L18:
            boolean r1 = v(r3)
            if (r1 == 0) goto L2e
            R3.p$a r1 = R3.p.d(r4)
            if (r1 == 0) goto L2e
            java.util.UUID r4 = a3.C5569i.f43833b
            java.util.UUID[] r2 = r1.f31805d
            byte[] r1 = r1.f31804c
            byte[] r4 = R3.p.b(r4, r2, r1)
        L2e:
            int r1 = d3.P.f127086a
            r2 = 23
            if (r1 >= r2) goto L3c
            java.util.UUID r1 = a3.C5569i.f43835d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6e
        L3c:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L75
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L75
        L6e:
            byte[] r3 = R3.p.e(r4, r3)
            if (r3 == 0) goto L75
            return r3
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.n.s(java.util.UUID, byte[]):byte[]");
    }

    private static String t(UUID uuid, String str) {
        return (P.f127086a < 26 && C5569i.f43834c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static boolean v(UUID uuid) {
        return P.f127086a < 27 && Objects.equals(uuid, C5569i.f43834c);
    }

    private static void x(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static o.b z(UUID uuid, List<o.b> list) {
        if (!C5569i.f43835d.equals(uuid)) {
            return list.get(0);
        }
        if (P.f127086a >= 28 && list.size() > 1) {
            o.b bVar = list.get(0);
            int length = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                o.b bVar2 = list.get(i10);
                byte[] bArr = (byte[]) C13466a.e(bVar2.f43880e);
                if (Objects.equals(bVar2.f43879d, bVar.f43879d) && Objects.equals(bVar2.f43878c, bVar.f43878c) && R3.p.c(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                byte[] bArr3 = (byte[]) C13466a.e(list.get(i12).f43880e);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i11, length2);
                i11 += length2;
            }
            return bVar.a(bArr2);
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            o.b bVar3 = list.get(i13);
            int iG = R3.p.g((byte[]) C13466a.e(bVar3.f43880e));
            int i14 = P.f127086a;
            if ((i14 < 23 && iG == 0) || (i14 >= 23 && iG == 1)) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public Map<String, String> a(byte[] bArr) {
        return this.f56128b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f56128b.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] c() throws MediaDrmException {
        return this.f56128b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void d(byte[] bArr, byte[] bArr2) {
        this.f56128b.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void e(byte[] bArr) throws DeniedByServerException {
        this.f56128b.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean h(byte[] bArr, String str) throws Throwable {
        MediaCrypto mediaCrypto;
        if (P.f127086a >= 31 && A()) {
            MediaDrm mediaDrm = this.f56128b;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto(u(this.f56127a), bArr);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return zRequiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z10 = !this.f56127a.equals(C5569i.f43834c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void i(byte[] bArr) {
        this.f56128b.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] j(byte[] bArr, byte[] bArr2) throws JSONException, DeniedByServerException, NotProvisionedException {
        if (C5569i.f43834c.equals(this.f56127a)) {
            bArr2 = androidx.media3.exoplayer.drm.a.b(bArr2);
        }
        return this.f56128b.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void k(final m.b bVar) {
        this.f56128b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: k3.n
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                androidx.media3.exoplayer.drm.n.o(this.f141227a, bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void l(byte[] bArr, E1 e12) {
        if (P.f127086a >= 31) {
            try {
                a.b(this.f56128b, bArr, e12);
            } catch (UnsupportedOperationException unused) {
                r.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    @SuppressLint({"WrongConstant"})
    public m.a m(byte[] bArr, List<o.b> list, int i10, HashMap<String, String> map) throws NotProvisionedException {
        o.b bVarZ;
        byte[] bArrS;
        String strT;
        if (list != null) {
            bVarZ = z(this.f56127a, list);
            bArrS = s(this.f56127a, (byte[]) C13466a.e(bVarZ.f43880e));
            strT = t(this.f56127a, bVarZ.f43879d);
        } else {
            bVarZ = null;
            bArrS = null;
            strT = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f56128b.getKeyRequest(bArr, bArrS, strT, i10, map);
        byte[] bArrR = r(this.f56127a, keyRequest.getData());
        String strQ = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strQ) && bVarZ != null && !TextUtils.isEmpty(bVarZ.f43878c)) {
            strQ = bVarZ.f43878c;
        }
        return new m.a(bArrR, strQ, P.f127086a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.drm.m
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public k3.l g(byte[] bArr) throws MediaCryptoException {
        return new k3.l(u(this.f56127a), bArr);
    }

    public String y(String str) {
        return this.f56128b.getPropertyString(str);
    }

    private n(UUID uuid) throws UnsupportedSchemeException {
        C13466a.e(uuid);
        C13466a.b(!C5569i.f43833b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f56127a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f56128b = mediaDrm;
        this.f56129c = 1;
        if (C5569i.f43835d.equals(uuid) && B()) {
            x(mediaDrm);
        }
    }

    public static /* synthetic */ m n(UUID uuid) {
        try {
            return C(uuid);
        } catch (UnsupportedDrmException unused) {
            r.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    public static /* synthetic */ void o(n nVar, m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        nVar.getClass();
        bVar.a(nVar, bArr, i10, i11, bArr2);
    }

    private static UUID u(UUID uuid) {
        if (v(uuid)) {
            return C5569i.f43833b;
        }
        return uuid;
    }
}
