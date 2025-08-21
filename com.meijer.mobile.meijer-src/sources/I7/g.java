package I7;

import A7.a;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\u001a3\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b\" \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lorg/json/JSONObject;", "", "name", "", "lowerBorder", "upperBorder", "defaultValue", "e", "(Lorg/json/JSONObject;Ljava/lang/String;III)I", "LA7/a;", "d", "(Lorg/json/JSONObject;Ljava/lang/String;)LA7/a;", "", "a", "[Ljava/lang/String;", "getSTATUS_VALUES$annotations", "()V", "STATUS_VALUES", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f14376a = {"OK", "ERROR"};

    /* JADX INFO: Access modifiers changed from: private */
    public static final A7.a d(JSONObject jSONObject, String str) {
        String strC = b.c(jSONObject, str);
        if (strC != null) {
            int iHashCode = strC.hashCode();
            if (iHashCode != -1609594047) {
                if (iHashCode != 270940796) {
                    if (iHashCode == 809657403 && strC.equals("priority=high")) {
                        return new a.Enabled(true);
                    }
                    return null;
                }
                if (strC.equals("disabled")) {
                    return a.C0006a.f178a;
                }
                return null;
            }
            if (strC.equals("enabled")) {
                return new a.Enabled(false);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(JSONObject jSONObject, String str, int i10, int i11, int i12) {
        Integer numA = b.a(jSONObject, str);
        if (numA != null) {
            return Math.max(Math.min(numA.intValue(), i11), i10);
        }
        return i12;
    }
}
