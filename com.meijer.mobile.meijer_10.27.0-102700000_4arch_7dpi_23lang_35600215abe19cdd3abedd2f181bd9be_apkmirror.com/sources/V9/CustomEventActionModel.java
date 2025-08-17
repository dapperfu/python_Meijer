package V9;

import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\rR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LV9/c;", "LV9/a;", "", PreferencesHelper.PREF_ID, "title", "type", "name", "", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getTitle", "c", "getType", "d", "getName", "e", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "mobile-engage-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: V9.c, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class CustomEventActionModel extends a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> payload;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomEventActionModel)) {
            return false;
        }
        CustomEventActionModel customEventActionModel = (CustomEventActionModel) other;
        return Intrinsics.e(this.id, customEventActionModel.id) && Intrinsics.e(this.title, customEventActionModel.title) && Intrinsics.e(this.type, customEventActionModel.type) && Intrinsics.e(this.name, customEventActionModel.name) && Intrinsics.e(this.payload, customEventActionModel.payload);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEventActionModel(String id2, String title, String type, String name, Map<String, ? extends Object> map) {
        super(null);
        Intrinsics.j(id2, "id");
        Intrinsics.j(title, "title");
        Intrinsics.j(type, "type");
        Intrinsics.j(name, "name");
        this.id = id2;
        this.title = title;
        this.type = type;
        this.name = name;
        this.payload = map;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31) + this.name.hashCode()) * 31;
        Map<String, Object> map = this.payload;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "CustomEventActionModel(id=" + this.id + ", title=" + this.title + ", type=" + this.type + ", name=" + this.name + ", payload=" + this.payload + ")";
    }
}
