package N5;

import g6.C14328a;
import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\"\"\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\"\u001a\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007\"\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0005*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\"\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\"&\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0003¨\u0006\u0014"}, d2 = {"LN5/m;", "", "j", "(LN5/m;)Ljava/util/Map;", "eventData", "", "l", "(LN5/m;)Ljava/lang/String;", "eventSource", "m", "eventType", "k", "eventDataAction", "i", "detailId", "n", "schema", "", "h", "detailData", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Object> h(RuleConsequence ruleConsequence) {
        return C14328a.t(Object.class, ruleConsequence.a(), "data", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(RuleConsequence ruleConsequence) {
        Object obj = ruleConsequence.a().get(PreferencesHelper.PREF_ID);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<?, ?> j(RuleConsequence ruleConsequence) {
        Object obj = ruleConsequence.a().get("eventdata");
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(RuleConsequence ruleConsequence) {
        Object obj = ruleConsequence.a().get("eventdataaction");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(RuleConsequence ruleConsequence) {
        Object obj = ruleConsequence.a().get("source");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(RuleConsequence ruleConsequence) {
        Object obj = ruleConsequence.a().get("type");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(RuleConsequence ruleConsequence) {
        Object obj = ruleConsequence.a().get("schema");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
