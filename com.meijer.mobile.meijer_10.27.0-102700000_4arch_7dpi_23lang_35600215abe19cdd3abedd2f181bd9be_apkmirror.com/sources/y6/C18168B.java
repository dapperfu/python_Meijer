package y6;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a_\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "Lcom/apollographql/apollo/exception/ApolloException;", "c", "(Ljava/lang/Throwable;)Lcom/apollographql/apollo/exception/ApolloException;", "Ly6/A$a;", "D", "LC6/f;", "Ly6/A;", "operation", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "Ly6/p;", "customScalarAdapters", "", "Ly6/q;", "deferredFragmentIdentifiers", "Ly6/e;", "a", "(LC6/f;Ly6/A;Ljava/util/UUID;Ly6/p;Ljava/util/Set;)Ly6/e;", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: y6.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18168B {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <D extends y6.InterfaceC18167A.a> y6.C18177e<D> a(C6.f r9, y6.InterfaceC18167A<D> r10, java.util.UUID r11, y6.p r12, java.util.Set<y6.DeferredFragmentIdentifier> r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.j(r10, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.j(r12, r0)
            r1 = 0
            B6.a r2 = B6.a.f2078a     // Catch: java.lang.Throwable -> L42
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            y6.e r9 = r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3f
            C6.f$a r10 = r3.getPeekedToken()     // Catch: java.lang.Throwable -> L3f
            C6.f$a r11 = C6.f.a.f3705k     // Catch: java.lang.Throwable -> L3f
            if (r10 != r11) goto L24
            goto L6d
        L24:
            com.apollographql.apollo.exception.JsonDataException r9 = new com.apollographql.apollo.exception.JsonDataException     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r10.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r11 = "Expected END_DOCUMENT but was "
            r10.append(r11)     // Catch: java.lang.Throwable -> L3f
            C6.f$a r11 = r3.getPeekedToken()     // Catch: java.lang.Throwable -> L3f
            r10.append(r11)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L3f
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L3f
            throw r9     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
        L40:
            r9 = r0
            goto L47
        L42:
            r0 = move-exception
            r3 = r9
            r4 = r10
            r5 = r11
            goto L40
        L47:
            if (r5 != 0) goto L56
            java.util.UUID r11 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L53
            java.lang.String r10 = "randomUUID(...)"
            kotlin.jvm.internal.Intrinsics.i(r11, r10)     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r0 = move-exception
            r9 = r0
            goto L77
        L56:
            r11 = r5
        L57:
            y6.e$a r10 = new y6.e$a     // Catch: java.lang.Throwable -> L53
            r10.<init>(r4, r11)     // Catch: java.lang.Throwable -> L53
            com.apollographql.apollo.exception.ApolloException r9 = c(r9)     // Catch: java.lang.Throwable -> L53
            y6.e$a r9 = r10.e(r9)     // Catch: java.lang.Throwable -> L53
            r10 = 1
            y6.e$a r9 = r9.g(r10)     // Catch: java.lang.Throwable -> L53
            y6.e r9 = r9.b()     // Catch: java.lang.Throwable -> L53
        L6d:
            r3.close()     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            r0 = move-exception
            r1 = r0
        L73:
            r8 = r1
            r1 = r9
            r9 = r8
            goto L80
        L77:
            r3.close()     // Catch: java.lang.Throwable -> L7b
            goto L80
        L7b:
            r0 = move-exception
            r10 = r0
            kotlin.ExceptionsKt.a(r9, r10)
        L80:
            if (r9 != 0) goto L83
            return r1
        L83:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.C18168B.a(C6.f, y6.A, java.util.UUID, y6.p, java.util.Set):y6.e");
    }

    public static /* synthetic */ C18177e b(C6.f fVar, InterfaceC18167A interfaceC18167A, UUID uuid, p pVar, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            uuid = null;
        }
        if ((i10 & 4) != 0) {
            pVar = p.f170299i;
        }
        if ((i10 & 8) != 0) {
            set = null;
        }
        return a(fVar, interfaceC18167A, uuid, pVar, set);
    }

    private static final ApolloException c(Throwable th2) {
        return th2 instanceof ApolloException ? (ApolloException) th2 : new ApolloNetworkException("Error while reading JSON response", th2);
    }
}
