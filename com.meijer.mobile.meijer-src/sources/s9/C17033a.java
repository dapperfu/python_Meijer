package s9;

import H9.l;
import K9.e;
import L9.k;
import c9.C6493a;
import d9.C13643a;
import g9.c;
import g9.d;
import h9.C14489a;
import j9.ClientIdentification;
import j9.FilterByClientId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import v9.C17649a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0005*\u00020\tH\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\r8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ls9/a;", "", "Lv9/a;", "uuidProvider", "Lg9/c;", "Lj9/a;", "Lg9/d;", "repository", "LH9/l;", "", "clientIdStorage", "Lc9/a;", "clientIdContentResolver", "Ld9/a;", "clientIdentificationCrypto", "<init>", "(Lv9/a;Lg9/c;LH9/l;Lc9/a;Ld9/a;)V", "c", "()Lj9/a;", "b", "()Ljava/lang/String;", "a", "(Ljava/lang/String;)Lj9/a;", "d", "Lv9/a;", "Lg9/c;", "LH9/l;", "Lc9/a;", "e", "Ld9/a;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: s9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17033a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17649a uuidProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c<ClientIdentification, d> repository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<String> clientIdStorage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C6493a clientIdContentResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C13643a clientIdentificationCrypto;

    public String d() {
        ClientIdentification clientIdentification;
        try {
            clientIdentification = (ClientIdentification) CollectionsKt.u0(this.repository.b(new C14489a()));
        } catch (Exception e10) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            linkedHashMap.put("message", message);
            StackTraceElement[] stackTrace = e10.getStackTrace();
            Intrinsics.i(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList(stackTrace.length);
            for (StackTraceElement stackTraceElement : stackTrace) {
                arrayList.add(stackTraceElement.toString());
            }
            linkedHashMap.put("stackTrace", arrayList);
            e.INSTANCE.c(new k(getClass(), "provideClientId", null, linkedHashMap));
            clientIdentification = null;
        }
        if (clientIdentification == null) {
            ClientIdentification clientIdentificationC = c();
            this.repository.add(clientIdentificationC);
            return clientIdentificationC.getClientId();
        }
        if (clientIdentification.getEncryptedClientId() != null) {
            return clientIdentification.getClientId();
        }
        ClientIdentification clientIdentificationB = this.clientIdentificationCrypto.b(clientIdentification);
        this.repository.a(clientIdentificationB, new FilterByClientId(clientIdentificationB.getClientId(), null, 2, null));
        return clientIdentification.getClientId();
    }

    public C17033a(C17649a uuidProvider, c<ClientIdentification, d> repository, l<String> clientIdStorage, C6493a clientIdContentResolver, C13643a clientIdentificationCrypto) {
        Intrinsics.j(uuidProvider, "uuidProvider");
        Intrinsics.j(repository, "repository");
        Intrinsics.j(clientIdStorage, "clientIdStorage");
        Intrinsics.j(clientIdContentResolver, "clientIdContentResolver");
        Intrinsics.j(clientIdentificationCrypto, "clientIdentificationCrypto");
        this.uuidProvider = uuidProvider;
        this.repository = repository;
        this.clientIdStorage = clientIdStorage;
        this.clientIdContentResolver = clientIdContentResolver;
        this.clientIdentificationCrypto = clientIdentificationCrypto;
    }

    private ClientIdentification a(String str) {
        return this.clientIdentificationCrypto.b(new ClientIdentification(str, null, null, null, 14, null));
    }

    private String b() {
        String strA = this.uuidProvider.a();
        Intrinsics.i(strA, "provideId(...)");
        return strA;
    }

    private ClientIdentification c() {
        String strA = this.clientIdStorage.get();
        if (strA == null && (strA = this.clientIdContentResolver.a()) == null) {
            strA = b();
        }
        return a(strA);
    }
}
