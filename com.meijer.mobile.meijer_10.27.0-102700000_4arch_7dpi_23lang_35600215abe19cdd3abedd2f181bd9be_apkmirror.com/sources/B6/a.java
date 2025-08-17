package B6;

import C6.f;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import y6.C18177e;
import y6.DeferredFragmentIdentifier;
import y6.Error;
import y6.InterfaceC18167A;
import y6.p;
import y6.u;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LB6/a;", "", "<init>", "()V", "Ly6/A$a;", "D", "LC6/f;", "jsonReader", "Ly6/A;", "operation", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "Ly6/p;", "customScalarAdapters", "", "Ly6/q;", "deferredFragmentIds", "Ly6/e;", "a", "(LC6/f;Ly6/A;Ljava/util/UUID;Ly6/p;Ljava/util/Set;)Ly6/e;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2078a = new a();

    public final <D extends InterfaceC18167A.a> C18177e<D> a(f jsonReader, InterfaceC18167A<D> operation, UUID requestUuid, p customScalarAdapters, Set<DeferredFragmentIdentifier> deferredFragmentIds) throws IOException {
        f fVar;
        p pVar;
        Set<DeferredFragmentIdentifier> set;
        Intrinsics.j(jsonReader, "jsonReader");
        Intrinsics.j(operation, "operation");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        jsonReader.s();
        InterfaceC18167A.a aVar = null;
        List<Error> listD = null;
        Map<String, ? extends Object> map = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1809421292) {
                if (iHashCode == -1294635157) {
                    fVar = jsonReader;
                    pVar = customScalarAdapters;
                    set = deferredFragmentIds;
                    if (strNextName.equals("errors")) {
                        listD = b.d(fVar);
                    }
                    jsonReader = fVar;
                    customScalarAdapters = pVar;
                    deferredFragmentIds = set;
                } else if (iHashCode == 3076010 && strNextName.equals("data")) {
                    f fVar2 = jsonReader;
                    aVar = (InterfaceC18167A.a) u.b(operation, fVar2, customScalarAdapters, u.a(operation, customScalarAdapters), deferredFragmentIds, listD);
                    jsonReader = fVar2;
                } else {
                    fVar = jsonReader;
                    pVar = customScalarAdapters;
                    set = deferredFragmentIds;
                }
                fVar.skipValue();
                jsonReader = fVar;
                customScalarAdapters = pVar;
                deferredFragmentIds = set;
            } else {
                fVar = jsonReader;
                pVar = customScalarAdapters;
                set = deferredFragmentIds;
                if (strNextName.equals("extensions")) {
                    Object objD = C6.a.d(fVar);
                    map = objD instanceof Map ? (Map) objD : null;
                } else {
                    fVar.skipValue();
                }
                jsonReader = fVar;
                customScalarAdapters = pVar;
                deferredFragmentIds = set;
            }
        }
        jsonReader.F();
        if (requestUuid == null) {
            requestUuid = UUID.randomUUID();
            Intrinsics.i(requestUuid, "randomUUID(...)");
        }
        return new C18177e.a(operation, requestUuid).d(listD).c(aVar).f(map).b();
    }

    private a() {
    }
}
