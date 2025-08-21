package X9;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"LX9/d;", "LX9/a;", "", PreferencesHelper.PREF_ID, "title", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getTitle", "c", "getType", "mobile-engage-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: X9.d, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class DismissActionModel extends a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DismissActionModel)) {
            return false;
        }
        DismissActionModel dismissActionModel = (DismissActionModel) other;
        return Intrinsics.e(this.id, dismissActionModel.id) && Intrinsics.e(this.title, dismissActionModel.title) && Intrinsics.e(this.type, dismissActionModel.type);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissActionModel(String id2, String title, String type) {
        super(null);
        Intrinsics.j(id2, "id");
        Intrinsics.j(title, "title");
        Intrinsics.j(type, "type");
        this.id = id2;
        this.title = title;
        this.type = type;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "DismissActionModel(id=" + this.id + ", title=" + this.title + ", type=" + this.type + ")";
    }
}
