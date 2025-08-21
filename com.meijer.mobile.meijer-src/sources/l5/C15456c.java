package l5;

import gw.InterfaceC14417f;
import gw.InterfaceC14418g;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.j;
import r5.C16846j;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Ll5/c;", "", "Lgw/g;", "source", "<init>", "(Lgw/g;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lgw/f;", "sink", "", "k", "(Lgw/f;)V", "Lokhttp3/c;", "a", "Lkotlin/Lazy;", "e", "()Lokhttp3/c;", "cacheControl", "Lokhttp3/j;", "b", "f", "()Lokhttp3/j;", "contentType", "", "c", "J", "i", "()J", "sentRequestAtMillis", "d", "g", "receivedResponseAtMillis", "", "Z", "j", "()Z", "isTls", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "h", "()Lokhttp3/Headers;", "responseHeaders", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15456c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy cacheControl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long sentRequestAtMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long receivedResponseAtMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isTls;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Headers responseHeaders;

    public C15456c(InterfaceC14418g interfaceC14418g) throws NumberFormatException {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143288c;
        this.cacheControl = LazyKt.a(lazyThreadSafetyMode, new Function0() { // from class: l5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15456c.c(this.f149295a);
            }
        });
        this.contentType = LazyKt.a(lazyThreadSafetyMode, new Function0() { // from class: l5.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15456c.d(this.f149296a);
            }
        });
        this.sentRequestAtMillis = Long.parseLong(interfaceC14418g.i1());
        this.receivedResponseAtMillis = Long.parseLong(interfaceC14418g.i1());
        this.isTls = Integer.parseInt(interfaceC14418g.i1()) > 0;
        int i10 = Integer.parseInt(interfaceC14418g.i1());
        Headers.a aVar = new Headers.a();
        for (int i11 = 0; i11 < i10; i11++) {
            C16846j.b(aVar, interfaceC14418g.i1());
        }
        this.responseHeaders = aVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.c c(C15456c c15456c) {
        return okhttp3.c.INSTANCE.a(c15456c.responseHeaders);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j d(C15456c c15456c) {
        String str = c15456c.responseHeaders.get("Content-Type");
        if (str != null) {
            return j.INSTANCE.b(str);
        }
        return null;
    }

    public final okhttp3.c e() {
        return (okhttp3.c) this.cacheControl.getValue();
    }

    public final j f() {
        return (j) this.contentType.getValue();
    }

    /* renamed from: g, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* renamed from: h, reason: from getter */
    public final Headers getResponseHeaders() {
        return this.responseHeaders;
    }

    /* renamed from: i, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    public final void k(InterfaceC14417f sink) throws IOException {
        sink.G1(this.sentRequestAtMillis).writeByte(10);
        sink.G1(this.receivedResponseAtMillis).writeByte(10);
        sink.G1(this.isTls ? 1L : 0L).writeByte(10);
        sink.G1(this.responseHeaders.size()).writeByte(10);
        int size = this.responseHeaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            sink.G0(this.responseHeaders.h(i10)).G0(": ").G0(this.responseHeaders.p(i10)).writeByte(10);
        }
    }

    public C15456c(Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143288c;
        this.cacheControl = LazyKt.a(lazyThreadSafetyMode, new Function0() { // from class: l5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15456c.c(this.f149295a);
            }
        });
        this.contentType = LazyKt.a(lazyThreadSafetyMode, new Function0() { // from class: l5.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15456c.d(this.f149296a);
            }
        });
        this.sentRequestAtMillis = response.getSentRequestAtMillis();
        this.receivedResponseAtMillis = response.getReceivedResponseAtMillis();
        this.isTls = response.getHandshake() != null;
        this.responseHeaders = response.getHeaders();
    }
}
