package com.google.android.gms.internal.ads;

import Mc.C4169y;
import Pc.C4581m0;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8259hs implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private boolean f74795a;

    private static void c(zzcbg zzcbgVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbgVar.d(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                Qc.p.g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcbgVar.b(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbgVar.B(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbgVar.C(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbgVar.f(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        int iMin;
        int iMin2;
        InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) obj;
        String str = (String) map.get("action");
        if (str == null) {
            Qc.p.g("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numB = interfaceC6807Hr.zzo() != null ? interfaceC6807Hr.zzo().b() : null;
        if (numValueOf2 != null && numB != null && !numValueOf2.equals(numB) && !str.equals("load")) {
            Qc.p.f(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numB));
            return;
        }
        if (Qc.p.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            Qc.p.b("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                Qc.p.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC6807Hr.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                Qc.p.g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                Qc.p.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC6807Hr.J(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                Qc.p.g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i10 = 0;
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                Qc.p.g("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                interfaceC6807Hr.L("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str4.split(",");
            int length = strArrSplit.length;
            while (i10 < length) {
                String str5 = strArrSplit[i10];
                map3.put(str5, C4581m0.a(str5.trim()));
                i10++;
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            interfaceC6807Hr.L("onVideoEvent", map4);
            return;
        }
        C9859wr c9859wrZzo = interfaceC6807Hr.zzo();
        if (c9859wrZzo == null) {
            Qc.p.g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = interfaceC6807Hr.getContext();
            int iB = b(context, map, "x", 0);
            int iB2 = b(context, map, "y", 0);
            int iB3 = b(context, map, "w", -1);
            AbstractC7593bf abstractC7593bf = C8659lf.f76198W3;
            if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
                iMin = iB3 == -1 ? interfaceC6807Hr.zzh() : Math.min(iB3, interfaceC6807Hr.zzh());
            } else {
                if (Pc.p0.m()) {
                    Pc.p0.k("Calculate width with original width " + iB3 + ", videoHost.getVideoBoundingWidth() " + interfaceC6807Hr.zzh() + ", x " + iB + ".");
                }
                iMin = Math.min(iB3, interfaceC6807Hr.zzh() - iB);
            }
            int i11 = iMin;
            int iB4 = b(context, map, "h", -1);
            if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
                iMin2 = iB4 == -1 ? interfaceC6807Hr.zzg() : Math.min(iB4, interfaceC6807Hr.zzg());
            } else {
                if (Pc.p0.m()) {
                    Pc.p0.k("Calculate height with original height " + iB4 + ", videoHost.getVideoBoundingHeight() " + interfaceC6807Hr.zzg() + ", y " + iB2 + ".");
                }
                iMin2 = Math.min(iB4, interfaceC6807Hr.zzg() - iB2);
            }
            int i12 = iMin2;
            try {
                i10 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i13 = i10;
            boolean z10 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || c9859wrZzo.a() != null) {
                c9859wrZzo.c(iB, iB2, i11, i12);
                return;
            }
            c9859wrZzo.d(iB, iB2, i11, i12, i13, z10, new C6773Gr((String) map.get("flags")));
            zzcbg zzcbgVarA = c9859wrZzo.a();
            if (zzcbgVarA != null) {
                c(zzcbgVarA, map);
                return;
            }
            return;
        }
        BinderC7114Qt binderC7114QtZzq = interfaceC6807Hr.zzq();
        if (binderC7114QtZzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    Qc.p.g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    binderC7114QtZzq.G9(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    Qc.p.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                binderC7114QtZzq.zzu();
                return;
            }
        }
        zzcbg zzcbgVarA2 = c9859wrZzo.a();
        if (zzcbgVarA2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            interfaceC6807Hr.L("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = interfaceC6807Hr.getContext();
            int iB5 = b(context2, map, "x", 0);
            float fB = b(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iB5, fB, 0);
            zzcbgVarA2.A(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                Qc.p.g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcbgVarA2.z((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                Qc.p.g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcbgVarA2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzcbgVarA2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcbgVarA2.u(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            c(zzcbgVarA2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcbgVarA2.v();
                return;
            } else {
                zzcbgVarA2.k();
                return;
            }
        }
        if (str.equals("pause")) {
            zzcbgVarA2.x();
            return;
        }
        if (str.equals("play")) {
            zzcbgVarA2.y();
            return;
        }
        if (str.equals("show")) {
            zzcbgVarA2.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    Qc.p.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        strArr2[i14] = jSONArray.getString(i14);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    Qc.p.g("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                interfaceC6807Hr.p(numValueOf.intValue());
            }
            zzcbgVarA2.g(str8, strArr);
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = interfaceC6807Hr.getContext();
            zzcbgVarA2.j(b(context3, map, "dx", 0), b(context3, map, "dy", 0));
            if (this.f74795a) {
                return;
            }
            interfaceC6807Hr.G0();
            this.f74795a = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                zzcbgVarA2.q();
                return;
            } else {
                Qc.p.g("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            Qc.p.g("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcbgVarA2.i(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            Qc.p.g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }

    private static int b(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                C4169y.b();
                i10 = Qc.g.z(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                Qc.p.g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (Pc.p0.m()) {
            Pc.p0.k("Parse pixels for " + str + ", got string " + str2 + ", int " + i10 + ".");
        }
        return i10;
    }
}
