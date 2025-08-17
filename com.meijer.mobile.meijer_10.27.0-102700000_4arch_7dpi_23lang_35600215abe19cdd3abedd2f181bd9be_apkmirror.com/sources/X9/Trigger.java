package X9;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006!"}, d2 = {"LX9/b;", "", "", PreferencesHelper.PREF_ID, "", "LX9/c;", "type", "", "loiteringDelay", "Lorg/json/JSONObject;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/Enum;ILorg/json/JSONObject;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/lang/Enum;", "()Ljava/lang/Enum;", "c", "I", "getLoiteringDelay", "d", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "mobile-engage-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: X9.b, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class Trigger {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Enum<c> type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int loiteringDelay;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final JSONObject action;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Trigger)) {
            return false;
        }
        Trigger trigger = (Trigger) other;
        return Intrinsics.e(this.id, trigger.id) && Intrinsics.e(this.type, trigger.type) && this.loiteringDelay == trigger.loiteringDelay && Intrinsics.e(this.action, trigger.action);
    }

    public Trigger(String id2, Enum<c> type, int i10, JSONObject action) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(type, "type");
        Intrinsics.j(action, "action");
        this.id = id2;
        this.type = type;
        this.loiteringDelay = i10;
        this.action = action;
    }

    /* renamed from: a, reason: from getter */
    public final JSONObject getAction() {
        return this.action;
    }

    public final Enum<c> b() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.loiteringDelay)) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "Trigger(id=" + this.id + ", type=" + this.type + ", loiteringDelay=" + this.loiteringDelay + ", action=" + this.action + ")";
    }
}
