package Zs;

import com.okta.authfoundation.client.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"LZs/b;", "", "<init>", "()V", "", "", "stringStringMap", "a", "(Ljava/util/Map;)Ljava/lang/String;", "json", "b", "(Ljava/lang/String;)Ljava/util/Map;", "Lzv/b;", "Lzv/b;", "mapSerializer", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zv.b<Map<String, String>> mapSerializer;

    public final String a(Map<String, String> stringStringMap) {
        if (stringStringMap != null) {
            return j.INSTANCE.b().c(this.mapSerializer, stringStringMap);
        }
        return null;
    }

    public final Map<String, String> b(String json) {
        if (json != null) {
            return (Map) j.INSTANCE.b().b(this.mapSerializer, json);
        }
        return null;
    }

    public b() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
        this.mapSerializer = Av.a.i(Av.a.D(stringCompanionObject), Av.a.D(stringCompanionObject));
    }
}
