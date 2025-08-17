package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7558bE0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f72767a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72768b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72769c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f72770d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f72771e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f72772f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f72773g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f72774h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f72775i;

    public final String toString() {
        return this.f72767a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.C7558bE0 c(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            com.google.android.gms.internal.ads.bE0 r0 = new com.google.android.gms.internal.ads.bE0
            r1 = 1
            r2 = 0
            if (r15 == 0) goto L39
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L39
            int r3 = com.google.android.gms.internal.ads.OV.f69091a
            r4 = 22
            if (r3 > r4) goto L27
            java.lang.String r3 = com.google.android.gms.internal.ads.OV.f69094d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L29
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L27
            goto L29
        L27:
            r8 = r1
            goto L3a
        L29:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L39
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L27
        L39:
            r8 = r2
        L3a:
            if (r15 == 0) goto L46
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L46
            r9 = r1
            goto L47
        L46:
            r9 = r2
        L47:
            if (r20 != 0) goto L53
            if (r15 == 0) goto L55
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L55
        L53:
            r10 = r1
            goto L56
        L55:
            r10 = r2
        L56:
            int r3 = com.google.android.gms.internal.ads.OV.f69091a
            r4 = 35
            if (r3 < r4) goto L72
            if (r15 == 0) goto L72
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L72
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r1
            r1 = r12
            goto L7d
        L72:
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r2
            r2 = r13
        L7d:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7558bE0.c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.bE0");
    }

    private final void j(String str) {
        C9917xL.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f72767a + ", " + this.f72768b + "] [" + OV.f69095e + "]");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean l(com.google.android.gms.internal.ads.C r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7558bE0.l(com.google.android.gms.internal.ads.C, boolean):boolean");
    }

    private final boolean m(C c10) {
        return this.f72768b.equals(c10.f65664o) || this.f72768b.equals(C9586uE0.b(c10));
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f72770d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return i(videoCapabilities, i10, i11);
    }

    public final Ny0 b(C c10, C c11) {
        C c12;
        C c13;
        int i10 = true != Objects.equals(c10.f65664o, c11.f65664o) ? 8 : 0;
        if (this.f72775i) {
            if (c10.f65674y != c11.f65674y) {
                i10 |= 1024;
            }
            if (!this.f72771e && (c10.f65671v != c11.f65671v || c10.f65672w != c11.f65672w)) {
                i10 |= 512;
            }
            if ((!Vz0.g(c10.f65640C) || !Vz0.g(c11.f65640C)) && !Objects.equals(c10.f65640C, c11.f65640C)) {
                i10 |= RecyclerView.m.FLAG_MOVED;
            }
            String str = this.f72767a;
            if (OV.f69094d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !c10.d(c11)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new Ny0(this.f72767a, c10, c11, true != c10.d(c11) ? 2 : 3, 0);
            }
            c12 = c10;
            c13 = c11;
        } else {
            c12 = c10;
            c13 = c11;
            if (c12.f65641D != c13.f65641D) {
                i10 |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (c12.f65642E != c13.f65642E) {
                i10 |= 8192;
            }
            if (c12.f65643F != c13.f65643F) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f72768b)) {
                int i11 = C9586uE0.f78777b;
                Pair pairA = C8302iD.a(c12);
                Pair pairA2 = C8302iD.a(c13);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int iIntValue2 = ((Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new Ny0(this.f72767a, c12, c13, 3, 0);
                    }
                }
            }
            if (!c12.d(c13)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f72768b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new Ny0(this.f72767a, c12, c13, 1, 0);
            }
        }
        return new Ny0(this.f72767a, c12, c13, 0, i10);
    }

    public final boolean f(C c10) {
        if (this.f72775i) {
            return this.f72771e;
        }
        int i10 = C9586uE0.f78777b;
        Pair pairA = C8302iD.a(c10);
        return pairA != null && ((Integer) pairA.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r8, int r9, double r10) {
        /*
            r7 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.f72770d
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r8 = "sizeAndRate.caps"
            r7.j(r8)
            return r1
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L17
            java.lang.String r8 = "sizeAndRate.vCaps"
            r7.j(r8)
            return r1
        L17:
            int r2 = com.google.android.gms.internal.ads.OV.f69091a
            r3 = 29
            r4 = 1
            java.lang.String r5 = "@"
            java.lang.String r6 = "x"
            if (r2 < r3) goto L4f
            int r2 = com.google.android.gms.internal.ads.C7771dE0.a(r0, r8, r9, r10)
            r3 = 2
            if (r2 != r3) goto L2b
            goto Le8
        L2b:
            if (r2 == r4) goto L2e
            goto L4f
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.cover, "
            r0.append(r2)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7.j(r8)
            return r1
        L4f:
            boolean r2 = k(r0, r8, r9, r10)
            if (r2 != 0) goto Le8
            if (r8 >= r9) goto Lc7
            java.lang.String r2 = r7.f72767a
            java.lang.String r3 = "OMX.MTK.VIDEO.DECODER.HEVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L6b
            java.lang.String r2 = "mcv5a"
            java.lang.String r3 = com.google.android.gms.internal.ads.OV.f69092b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc7
        L6b:
            boolean r0 = k(r0, r9, r8, r10)
            if (r0 != 0) goto L72
            goto Lc7
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sizeAndRate.rotated, "
            r0.append(r1)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = r7.f72767a
            java.lang.String r10 = r7.f72768b
            java.lang.String r11 = com.google.android.gms.internal.ads.OV.f69095e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AssumedSupport ["
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "] ["
            r0.append(r8)
            r0.append(r9)
            java.lang.String r9 = ", "
            r0.append(r9)
            r0.append(r10)
            r0.append(r8)
            r0.append(r11)
            java.lang.String r8 = "]"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.C9917xL.b(r9, r8)
            goto Le8
        Lc7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.support, "
            r0.append(r2)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7.j(r8)
            return r1
        Le8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7558bE0.g(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f72770d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    C7558bE0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.f72767a = str;
        this.f72768b = str2;
        this.f72769c = str3;
        this.f72770d = codecCapabilities;
        this.f72773g = z10;
        this.f72771e = z13;
        this.f72772f = z15;
        this.f72774h = z16;
        this.f72775i = C7057Pc.i(str2);
    }

    private static Point i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = OV.f69091a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private static boolean k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointI = i(videoCapabilities, i10, i11);
        int i12 = pointI.x;
        int i13 = pointI.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    public final boolean d(C c10) {
        if (!m(c10) || !l(c10, false)) {
            return false;
        }
        return true;
    }

    public final boolean e(C c10) throws zzsu {
        int i10;
        int i11;
        if (!m(c10) || !l(c10, true)) {
            return false;
        }
        if (this.f72775i) {
            int i12 = c10.f65671v;
            if (i12 <= 0 || (i11 = c10.f65672w) <= 0) {
                return true;
            }
            return g(i12, i11, c10.f65673x);
        }
        int i13 = c10.f65642E;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f72770d;
            if (codecCapabilities == null) {
                j("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                j("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i13)) {
                j("sampleRate.support, " + i13);
                return false;
            }
        }
        int i14 = c10.f65641D;
        if (i14 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f72770d;
            if (codecCapabilities2 == null) {
                j("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                j("channelCount.aCaps");
                return false;
            }
            String str = this.f72767a;
            String str2 = this.f72768b;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((OV.f69091a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                if ("audio/ac3".equals(str2)) {
                    i10 = 6;
                } else if ("audio/eac3".equals(str2)) {
                    i10 = 16;
                } else {
                    i10 = 30;
                }
                C9917xL.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i10 + "]");
                maxInputChannelCount = i10;
            }
            if (maxInputChannelCount < i14) {
                j("channelCount.support, " + i14);
                return false;
            }
        }
        return true;
    }
}
