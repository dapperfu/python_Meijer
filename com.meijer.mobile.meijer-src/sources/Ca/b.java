package Ca;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v9.C17649a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LCa/b;", "", "LC9/a;", "metaDataReader", "Landroid/content/Context;", "context", "Lv9/a;", "uuidProvider", "<init>", "(LC9/a;Landroid/content/Context;Lv9/a;)V", "", "", "remoteMessageData", "LCa/a;", "a", "(Ljava/util/Map;)LCa/a;", "LC9/a;", "b", "Landroid/content/Context;", "c", "Lv9/a;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C9.a metaDataReader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C17649a uuidProvider;

    public b(C9.a metaDataReader, Context context, C17649a uuidProvider) {
        Intrinsics.j(metaDataReader, "metaDataReader");
        Intrinsics.j(context, "context");
        Intrinsics.j(uuidProvider, "uuidProvider");
        this.metaDataReader = metaDataReader;
        this.context = context;
        this.uuidProvider = uuidProvider;
    }

    public a a(Map<String, String> remoteMessageData) {
        Intrinsics.j(remoteMessageData, "remoteMessageData");
        return remoteMessageData.containsKey("ems_msg") ? new c(this.metaDataReader, this.context, this.uuidProvider) : new d(this.metaDataReader, this.context, this.uuidProvider);
    }
}
