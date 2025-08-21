package z6;

import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z6.t.a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0005\u0010J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lz6/t;", "Lz6/t$a;", "D", "", "Lz6/a;", "a", "()Lz6/a;", "LD6/g;", "writer", "Lz6/p;", "customScalarAdapters", "", "withDefaultValues", "", "d", "(LD6/g;Lz6/p;Z)V", "b", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface t<D extends a> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lz6/t$a;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0018\u00010\u0001j\u0002`\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR-\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0018\u00010\u0001j\u0002`\u00040\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lz6/t$b;", "", "", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "Lcom/apollographql/apollo/api/VariablesJson;", "valueMap", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> valueMap;

        public b(Map<String, ? extends Object> valueMap) {
            Intrinsics.j(valueMap, "valueMap");
            this.valueMap = valueMap;
        }

        public final Map<String, Object> a() {
            return this.valueMap;
        }
    }

    InterfaceC18452a<D> a();

    void d(D6.g writer, p customScalarAdapters, boolean withDefaultValues) throws IOException;
}
