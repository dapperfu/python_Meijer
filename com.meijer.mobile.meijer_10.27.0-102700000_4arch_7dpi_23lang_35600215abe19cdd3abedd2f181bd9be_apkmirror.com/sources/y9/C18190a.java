package y9;

import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s9.C16914a;
import t9.C17074a;
import y9.c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001fBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ly9/a;", "Ly9/c;", "", PreferencesHelper.PREF_ID, "url", "Ly9/b;", "method", "", "", "payload", "headers", "", "timestamp", "ttl", "", "originalRequestIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ly9/b;Ljava/util/Map;Ljava/util/Map;JJ[Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "i", "[Ljava/lang/String;", "h", "()[Ljava/lang/String;", "a", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: y9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18190a extends c {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String[] originalRequestIds;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\u00002\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J#\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ly9/a$a;", "Ly9/c$a;", "Ls9/a;", "timestampProvider", "Lt9/a;", "uuidProvider", "<init>", "(Ls9/a;Lt9/a;)V", "Ly9/c;", "requestModel", "(Ly9/c;)V", "", "url", "x", "(Ljava/lang/String;)Ly9/a$a;", "", "queryParams", "v", "(Ljava/util/Map;)Ly9/a$a;", "Ly9/b;", "method", "s", "(Ly9/b;)Ly9/a$a;", "", "payload", "u", "headers", "r", "", "ttl", "w", "(J)Ly9/a$a;", "", "originalRequestIds", "t", "([Ljava/lang/String;)Ly9/a$a;", "Ly9/a;", "q", "()Ly9/a;", "i", "[Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: y9.a$a, reason: collision with other inner class name */
    public static final class C2745a extends c.a {

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private String[] originalRequestIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2745a(C16914a timestampProvider, C17074a uuidProvider) {
            super(timestampProvider, uuidProvider);
            Intrinsics.j(timestampProvider, "timestampProvider");
            Intrinsics.j(uuidProvider, "uuidProvider");
            this.originalRequestIds = new String[0];
        }

        @Override // y9.c.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C18190a a() {
            return new C18190a(getId(), b(), getMethod(), f(), c(), getTimestamp(), getTtl(), this.originalRequestIds);
        }

        @Override // y9.c.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C2745a j(Map<String, String> headers) {
            Intrinsics.j(headers, "headers");
            super.j(headers);
            return this;
        }

        @Override // y9.c.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C2745a k(EnumC18191b method) {
            Intrinsics.j(method, "method");
            super.k(method);
            return this;
        }

        public final C2745a t(String[] originalRequestIds) {
            Intrinsics.j(originalRequestIds, "originalRequestIds");
            this.originalRequestIds = originalRequestIds;
            return this;
        }

        @Override // y9.c.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C2745a l(Map<String, ? extends Object> payload) {
            Intrinsics.j(payload, "payload");
            super.l(payload);
            return this;
        }

        @Override // y9.c.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C2745a m(Map<String, String> queryParams) {
            Intrinsics.j(queryParams, "queryParams");
            super.m(queryParams);
            return this;
        }

        @Override // y9.c.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C2745a p(String url) {
            Intrinsics.j(url, "url");
            super.p(url);
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2745a(c requestModel) {
            super(requestModel);
            Intrinsics.j(requestModel, "requestModel");
            this.originalRequestIds = new String[0];
            this.originalRequestIds = ((C18190a) requestModel).getOriginalRequestIds();
        }

        public C2745a w(long ttl) {
            super.o(ttl);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18190a(String id2, String url, EnumC18191b method, Map<String, ? extends Object> map, Map<String, String> headers, long j10, long j11, String[] originalRequestIds) {
        super(url, method, map, headers, j10, j11, id2, null, 128, null);
        Intrinsics.j(id2, "id");
        Intrinsics.j(url, "url");
        Intrinsics.j(method, "method");
        Intrinsics.j(headers, "headers");
        Intrinsics.j(originalRequestIds, "originalRequestIds");
        this.originalRequestIds = originalRequestIds;
    }

    @Override // y9.c
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.e(getClass(), other.getClass()) && super.equals(other)) {
            return Arrays.equals(getOriginalRequestIds(), ((C18190a) other).getOriginalRequestIds());
        }
        return false;
    }

    /* renamed from: h, reason: from getter */
    public String[] getOriginalRequestIds() {
        return this.originalRequestIds;
    }

    @Override // y9.c
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(getOriginalRequestIds());
    }

    public String toString() {
        String string = super.toString();
        String string2 = Arrays.toString(getOriginalRequestIds());
        Intrinsics.i(string2, "toString(...)");
        return "CompositeRequestModel{request=" + string + "originalRequestIds=" + string2 + "}";
    }
}
