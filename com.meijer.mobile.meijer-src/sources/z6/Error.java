package z6;

import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fBa\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lz6/s;", "", "", "message", "", "Lz6/s$a;", "locations", "path", "", "extensions", "nonStandardFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getMessage", "b", "Ljava/util/List;", "getLocations", "()Ljava/util/List;", "c", "getPath", "d", "Ljava/util/Map;", "getExtensions", "()Ljava/util/Map;", "e", "getNonStandardFields", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: z6.s, reason: from toString */
/* loaded from: classes4.dex */
public final class Error {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Location> locations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Object> path;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> extensions;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> nonStandardFields;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lz6/s$a;", "", "", "line", "column", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "a", "I", "getLine", "()I", "b", "getColumn", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.s$a, reason: from toString */
    public static final class Location {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int line;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int column;

        public String toString() {
            return "Location(line = " + this.line + ", column = " + this.column + ')';
        }

        public Location(int i10, int i11) {
            this.line = i10;
            this.column = i11;
        }
    }

    @Deprecated
    public Error(String message, List<Location> list, List<? extends Object> list2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        Intrinsics.j(message, "message");
        this.message = message;
        this.locations = list;
        this.path = list2;
        this.extensions = map;
        this.nonStandardFields = map2;
    }

    public String toString() {
        return "Error(message = " + this.message + ", locations = " + this.locations + ", path=" + this.path + ", extensions = " + this.extensions + ", nonStandardFields = " + this.nonStandardFields + ')';
    }
}
