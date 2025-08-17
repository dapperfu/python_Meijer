package K6;

import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LK6/e;", "LK6/d;", "", "", "", "payload", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", PreferencesHelper.PREF_ID, "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> payload;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String id;

    public final Map<String, Object> a() {
        return this.payload;
    }

    @Override // K6.d
    public String getId() {
        return this.id;
    }

    public e(Map<String, ? extends Object> map) {
        this.payload = map;
    }
}
