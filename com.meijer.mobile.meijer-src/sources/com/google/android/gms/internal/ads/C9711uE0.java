package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"InlinedApi"})
/* renamed from: com.google.android.gms.internal.ads.uE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9711uE0 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f79616a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f79617b = 0;

    public static C7683bE0 a() throws zzsu {
        List listD = d("audio/raw", false, false);
        if (listD.isEmpty()) {
            return null;
        }
        return (C7683bE0) listD.get(0);
    }

    public static String b(C c10) {
        Pair pairA;
        if ("audio/eac3-joc".equals(c10.f66504o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(c10.f66504o) && (pairA = C8427iD.a(c10)) != null) {
            int iIntValue = ((Integer) pairA.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(c10.f66504o)) {
            return "video/hevc";
        }
        return null;
    }

    public static synchronized List d(String str, boolean z10, boolean z11) throws zzsu {
        try {
            C8963nE0 c8963nE0 = new C8963nE0(str, z10, z11);
            HashMap map = f79616a;
            List list = (List) map.get(c8963nE0);
            if (list != null) {
                return list;
            }
            ArrayList arrayListG = g(c8963nE0, new C9284qE0(z10, z11));
            if (z10 && arrayListG.isEmpty() && OV.f69931a <= 23) {
                arrayListG = g(c8963nE0, new C9177pE0(null));
                if (!arrayListG.isEmpty()) {
                    C10042xL.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C7683bE0) arrayListG.get(0)).f73607a);
                }
            }
            if ("audio/raw".equals(str)) {
                if (OV.f69931a < 26 && OV.f69932b.equals("R9") && arrayListG.size() == 1 && ((C7683bE0) arrayListG.get(0)).f73607a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListG.add(C7683bE0.c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                h(arrayListG, new InterfaceC9390rE0() { // from class: com.google.android.gms.internal.ads.lE0
                    @Override // com.google.android.gms.internal.ads.InterfaceC9390rE0
                    public final int zza(Object obj) {
                        int i10 = C9711uE0.f79617b;
                        String str2 = ((C7683bE0) obj).f73607a;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (OV.f69931a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (OV.f69931a < 32 && arrayListG.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C7683bE0) arrayListG.get(0)).f73607a)) {
                arrayListG.add((C7683bE0) arrayListG.remove(0));
            }
            AbstractC8042eh0 abstractC8042eh0R = AbstractC8042eh0.r(arrayListG);
            map.put(c8963nE0, abstractC8042eh0R);
            return abstractC8042eh0R;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static List e(InterfaceC8535jE0 interfaceC8535jE0, C c10, boolean z10, boolean z11) throws zzsu {
        List listA = interfaceC8535jE0.a(c10.f66504o, z10, z11);
        List listC = c(interfaceC8535jE0, c10, z10, z11);
        C7723bh0 c7723bh0 = new C7723bh0();
        c7723bh0.i(listA);
        c7723bh0.i(listC);
        return c7723bh0.j();
    }

    public static List f(List list, final C c10) {
        ArrayList arrayList = new ArrayList(list);
        h(arrayList, new InterfaceC9390rE0() { // from class: com.google.android.gms.internal.ads.mE0
            @Override // com.google.android.gms.internal.ads.InterfaceC9390rE0
            public final int zza(Object obj) {
                int i10 = C9711uE0.f79617b;
                return ((C7683bE0) obj).d(c10) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0183 A[Catch: Exception -> 0x018a, TryCatch #2 {Exception -> 0x018a, blocks: (B:90:0x0151, B:96:0x0168, B:102:0x017d, B:104:0x0183, B:108:0x0196), top: B:162:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0196 A[Catch: Exception -> 0x018a, TRY_LEAVE, TryCatch #2 {Exception -> 0x018a, blocks: (B:90:0x0151, B:96:0x0168, B:102:0x017d, B:104:0x0183, B:108:0x0196), top: B:162:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ad A[Catch: Exception -> 0x01b2, TryCatch #5 {Exception -> 0x01b2, blocks: (B:113:0x01a3, B:115:0x01ad, B:127:0x01de, B:118:0x01b9, B:120:0x01c9, B:122:0x01d1), top: B:168:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b9 A[Catch: Exception -> 0x01b2, TryCatch #5 {Exception -> 0x01b2, blocks: (B:113:0x01a3, B:115:0x01ad, B:127:0x01de, B:118:0x01b9, B:120:0x01c9, B:122:0x01d1), top: B:168:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0239 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList g(com.google.android.gms.internal.ads.C8963nE0 r23, com.google.android.gms.internal.ads.InterfaceC9070oE0 r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9711uE0.g(com.google.android.gms.internal.ads.nE0, com.google.android.gms.internal.ads.oE0):java.util.ArrayList");
    }

    private static void h(List list, final InterfaceC9390rE0 interfaceC9390rE0) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.kE0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i10 = C9711uE0.f79617b;
                InterfaceC9390rE0 interfaceC9390rE02 = interfaceC9390rE0;
                return interfaceC9390rE02.zza(obj2) - interfaceC9390rE02.zza(obj);
            }
        });
    }

    private static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (OV.f69931a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (C7182Pc.g(str)) {
            return true;
        }
        String strA = C8571jf0.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        if (strA.startsWith("omx.google.") || strA.startsWith("omx.ffmpeg.") || ((strA.startsWith("omx.sec.") && strA.contains(".sw.")) || strA.equals("omx.qcom.video.decoder.hevcswvdec") || strA.startsWith("c2.android.") || strA.startsWith("c2.google."))) {
            return true;
        }
        return (strA.startsWith("omx.") || strA.startsWith("c2.")) ? false : true;
    }

    public static List c(InterfaceC8535jE0 interfaceC8535jE0, C c10, boolean z10, boolean z11) throws zzsu {
        String strB = b(c10);
        if (strB == null) {
            return AbstractC8042eh0.t();
        }
        return interfaceC8535jE0.a(strB, z10, z11);
    }
}
