package X9;

import io.constructor.data.local.PreferencesHelper;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LX9/e;", "LX9/a;", "", PreferencesHelper.PREF_ID, "title", "type", "Ljava/net/URL;", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getTitle", "c", "getType", "d", "Ljava/net/URL;", "getUrl", "()Ljava/net/URL;", "mobile-engage-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: X9.e, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class OpenExternalUrlActionModel extends a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final URL url;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenExternalUrlActionModel)) {
            return false;
        }
        OpenExternalUrlActionModel openExternalUrlActionModel = (OpenExternalUrlActionModel) other;
        return Intrinsics.e(this.id, openExternalUrlActionModel.id) && Intrinsics.e(this.title, openExternalUrlActionModel.title) && Intrinsics.e(this.type, openExternalUrlActionModel.type) && Intrinsics.e(this.url, openExternalUrlActionModel.url);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenExternalUrlActionModel(String id2, String title, String type, URL url) {
        super(null);
        Intrinsics.j(id2, "id");
        Intrinsics.j(title, "title");
        Intrinsics.j(type, "type");
        Intrinsics.j(url, "url");
        this.id = id2;
        this.title = title;
        this.type = type;
        this.url = url;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "OpenExternalUrlActionModel(id=" + this.id + ", title=" + this.title + ", type=" + this.type + ", url=" + this.url + ")";
    }
}
