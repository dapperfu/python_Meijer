package R7;

import android.app.ApplicationExitInfo;
import defpackage.r;
import defpackage.u;
import defpackage.x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.HexExtensionsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import z8.f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u000f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0013\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b&\u0010%J!\u0010(\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"LR7/e;", "", "<init>", "()V", "Lorg/json/JSONObject;", "Lx;", "tombstone", "", "fallbackMessage", "", "l", "(Lorg/json/JSONObject;Lx;Ljava/lang/String;)V", "p", "(Lorg/json/JSONObject;Lx;)V", "k", "q", "key", "optionalValue", "droppedLog", "n", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "e", "(Lx;)Ljava/lang/String;", "", "", "Lu;", "keyToMove", "i", "(Ljava/util/Map;I)Ljava/util/Map;", "input", "f", "(Ljava/lang/String;)Ljava/lang/String;", "h", "()Lorg/json/JSONObject;", "Landroid/app/ApplicationExitInfo;", "applicationExitInfo", "c", "(Landroid/app/ApplicationExitInfo;)Lorg/json/JSONObject;", "d", "exitInfoDescription", "j", "(Lx;Ljava/lang/String;)Lorg/json/JSONObject;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e {
    private final String f(String input) {
        return SequencesKt.K(SequencesKt.M(Regex.f(new Regex("(?ms)^\".*?(?=\\n\\s*(?:DumpLatency|\\s*$))"), input, 0, 2, null), new Function1() { // from class: R7.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.g((MatchResult) obj);
            }
        }), "\n\n", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(MatchResult it) {
        Intrinsics.j(it, "it");
        return it.getValue();
    }

    private final JSONObject h() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("characteristics.has_error", true);
        jSONObject.put("error.is_fatal", true);
        return jSONObject;
    }

    private final Map<Integer, u> i(Map<Integer, u> map, int i10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        u uVar = map.get(Integer.valueOf(i10));
        if (uVar != null) {
            linkedHashMap.put(Integer.valueOf(i10), uVar);
        }
        for (Map.Entry<Integer, u> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            u value = entry.getValue();
            if (iIntValue != i10) {
                linkedHashMap.put(Integer.valueOf(iIntValue), value);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(defpackage.d cause) {
        Intrinsics.j(cause, "cause");
        return cause.getHuman_readable();
    }

    private final void n(JSONObject jSONObject, String str, String str2, String str3) throws JSONException {
        if (str2 == null) {
            f.a("dtxCrashTracker", str3);
        } else {
            jSONObject.put(str, str2);
        }
    }

    static /* synthetic */ void o(e eVar, JSONObject jSONObject, String str, String str2, String str3, int i10, Object obj) throws JSONException {
        if ((i10 & 4) != 0) {
            str3 = "key " + str + " dropped because extracted value is 'null'";
        }
        eVar.n(jSONObject, str, str2, str3);
    }

    public final JSONObject c(ApplicationExitInfo applicationExitInfo) throws JSONException, IOException {
        Intrinsics.j(applicationExitInfo, "applicationExitInfo");
        f.a("dtxCrashTracker", "anr " + applicationExitInfo);
        try {
            JSONObject jSONObjectH = h();
            jSONObjectH.put("characteristics.has_anr", true);
            if (applicationExitInfo.getDescription() != null) {
                jSONObjectH.put("exception.message", applicationExitInfo.getDescription());
            }
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                return jSONObjectH;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream, Charsets.UTF_8), 8192);
            try {
                String strD = TextStreamsKt.d(bufferedReader);
                CloseableKt.a(bufferedReader, null);
                String strF = f(strD);
                if (strF.length() > 0) {
                    jSONObjectH.put("exception.stack_trace", strF);
                    return jSONObjectH;
                }
                f.a("dtxCrashTracker", "anr threads don't match pattern");
                return jSONObjectH;
            } finally {
            }
        } catch (JSONException unused) {
            f.a("dtxCrashTracker", "anr event cannot be created");
            return null;
        }
    }

    public final JSONObject d(ApplicationExitInfo applicationExitInfo) throws JSONException, IOException {
        Intrinsics.j(applicationExitInfo, "applicationExitInfo");
        f.a("dtxCrashTracker", "native crash " + applicationExitInfo);
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            x xVarD = traceInputStream != null ? x.f167671C.d(traceInputStream) : null;
            if (xVarD != null) {
                return j(xVarD, applicationExitInfo.getDescription());
            }
            JSONObject jSONObjectH = h();
            jSONObjectH.put("characteristics.has_crash", true);
            n(jSONObjectH, "exception.message", applicationExitInfo.getDescription(), "applicationExitInfo.description is null");
            return jSONObjectH;
        } catch (Exception unused) {
            f.a("dtxCrashTracker", "native crash event cannot be created");
            return null;
        }
    }

    public final JSONObject j(x tombstone, String exitInfoDescription) throws JSONException {
        Intrinsics.j(tombstone, "tombstone");
        JSONObject jSONObjectH = h();
        jSONObjectH.put("characteristics.has_crash", true);
        l(jSONObjectH, tombstone, exitInfoDescription);
        p(jSONObjectH, tombstone);
        k(jSONObjectH, tombstone);
        q(jSONObjectH, tombstone);
        return jSONObjectH;
    }

    private final String e(x tombstone) {
        String name;
        Map<Integer, u> mapU = tombstone.u();
        if (mapU.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
        sb2.append("\n");
        sb2.append("ABI: " + tombstone.getArch().name());
        sb2.append("\n");
        sb2.append("Process uptime: " + tombstone.getProcess_uptime() + 's');
        sb2.append("\n");
        if (!tombstone.f().isEmpty()) {
            sb2.append("Cmdline: " + tombstone.f());
            sb2.append("\n");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("pid: ");
        sb3.append(tombstone.getPid());
        sb3.append(", tid: ");
        sb3.append(tombstone.getTid());
        sb3.append(", name: ");
        u uVar = mapU.get(Integer.valueOf(tombstone.getTid()));
        if (uVar != null) {
            name = uVar.getName();
        } else {
            name = null;
        }
        sb3.append(name);
        sb2.append(sb3.toString());
        sb2.append("\n");
        r rVarS = tombstone.getSignal_info();
        if (rVarS != null) {
            sb2.append("signal " + rVarS.getNumber() + " (" + rVarS.getName() + "), code " + rVarS.getCode() + " (" + rVarS.getCode_name() + "), fault addr " + HexExtensionsKt.p(rVarS.getFault_address(), null, 1, null));
            sb2.append("\n");
        }
        Iterator<Map.Entry<Integer, u>> it = i(MapsKt.D(mapU), tombstone.getTid()).entrySet().iterator();
        while (it.hasNext()) {
            u value = it.next().getValue();
            sb2.append(value.getName() + ':');
            sb2.append("\n");
            int i10 = 0;
            for (Object obj : value.c()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                defpackage.c cVar = (defpackage.c) obj;
                sb2.append("      #" + StringsKt.C0(String.valueOf(i10), 2, '0') + " pc " + HexExtensionsKt.p(cVar.getRel_pc(), null, 1, null) + ' ' + cVar.getFile_name() + " (" + cVar.getFunction_name() + '+' + cVar.getFunction_offset() + ") (BuildId: " + cVar.getBuild_id() + ')');
                sb2.append("\n");
                i10 = i11;
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    private final void k(JSONObject jSONObject, x xVar) throws JSONException {
        String strB = xVar.getAbort_message();
        String strW1 = null;
        if (strB.length() <= 0 || !StringsKt.W(strB, "terminating with uncaught exception of type ", false, 2, null)) {
            strB = null;
        }
        if (strB != null) {
            String strSubstring = strB.substring(44);
            Intrinsics.i(strSubstring, "substring(...)");
            if (strSubstring != null) {
                strW1 = StringsKt.w1(strSubstring, ": ", null, 2, null);
            }
        }
        o(this, jSONObject, "exception.type", strW1, null, 4, null);
    }

    private final void l(JSONObject jSONObject, x xVar, String str) throws JSONException {
        String name;
        if (xVar.getAbort_message().length() > 0) {
            str = xVar.getAbort_message();
        } else if (!xVar.e().isEmpty()) {
            str = CollectionsKt.B0(xVar.e(), ". ", null, null, 0, null, new Function1() { // from class: R7.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.m((defpackage.d) obj);
                }
            }, 30, null);
        } else {
            r rVarS = xVar.getSignal_info();
            if (rVarS != null && (name = rVarS.getName()) != null && name.length() > 0) {
                str = xVar.getSignal_info().getName();
            } else if (xVar.getSignal_info() != null && xVar.getSignal_info().getNumber() != 0) {
                str = "signal " + xVar.getSignal_info().getNumber();
            }
        }
        o(this, jSONObject, "exception.message", str, null, 4, null);
    }

    private final void p(JSONObject jSONObject, x xVar) throws JSONException {
        r rVarS = xVar.getSignal_info();
        String name = null;
        if (rVarS != null) {
            if (rVarS.getName().length() > 0) {
                name = rVarS.getName();
            } else if (rVarS.getNumber() != 0) {
                name = "signal " + rVarS.getNumber();
            }
        }
        o(this, jSONObject, "exception.crash_signal_name", name, null, 4, null);
    }

    private final void q(JSONObject jSONObject, x xVar) throws JSONException {
        n(jSONObject, "exception.stack_trace", e(xVar), "native crash threads cannot be extracted");
    }
}
